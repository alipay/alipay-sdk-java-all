/**
 * Alipay.com Inc. Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api.msg;

import com.alipay.api.AlipayConstants;
import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayLogger;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.internal.util.WebUtils;
import com.alipay.api.internal.util.json.JSONWriter;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.channels.NotYetConnectedException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.*;

/**
 * @author liuqun.lq
 * @version $Id: WebSocketClient.java, v 0.1 2018年08月31日 17:57 liuqun.lq Exp $
 */
public class AlipayMsgClient {

    private String     serverHost;
    private boolean    isSSL                 = true;
    private MsgHandler messageHandler;
    private String     appId;
    private String     signType;
    private String     appPrivateKey;
    private String     alipayPublicKey;
    private String     charset               = "UTF-8";
    private int        bizThreadPoolCoreSize = 5;
    private int        bizThreadPoolMaxSize  = 10;
    private boolean    loadTest              = false;

    private static Map<String, AlipayMsgClient>                   clientMap       = new HashMap<String, AlipayMsgClient>();
    private        ThreadPoolExecutor                             bizThreadPoolExecutor;
    private        ScheduledThreadPoolExecutor                    heartBeatExecutor;
    private        int                                            reConnectTimes  = 0;
    private        long                                           waitTime        = 0L;
    private        MsgConnector                                   webSocketConnector;
    private        LinkedBlockingQueue<String>                    sendingQueue    = new LinkedBlockingQueue<String>(200);
    private        ConcurrentHashMap<String, ProtocolDataContext> sendingContexts =
            new ConcurrentHashMap<String, ProtocolDataContext>(256);

    private AlipayMsgClient() {
    }

    public static synchronized AlipayMsgClient getInstance(String appId) {
        AlipayMsgClient client = clientMap.get(appId);
        if (client != null) {
            return client;
        }
        client = new AlipayMsgClient();
        clientMap.put(appId, client);
        client.appId = appId;
        return client;
    }

    public void connect() throws InterruptedException {
        if (appId == null || appPrivateKey == null || alipayPublicKey == null
                || serverHost == null || messageHandler == null) {
            throw new RuntimeException("Please set securityConfig, connector and messageHandler"
                    + " before connect");
        }

        if (bizThreadPoolExecutor == null || heartBeatExecutor == null) {
            synchronized (this) {
                if (bizThreadPoolExecutor == null) {
                    bizThreadPoolExecutor = new ThreadPoolExecutor(bizThreadPoolCoreSize, bizThreadPoolMaxSize,
                            15000L, TimeUnit.MILLISECONDS,
                            new LinkedBlockingQueue<Runnable>(400),
                            new ThreadFactory() {
                                public Thread newThread(Runnable r) {
                                    return new Thread(r, "Alipay-Msg-Thread");
                                }
                            }, new ThreadPoolExecutor.AbortPolicy());
                }
                if (heartBeatExecutor == null) {
                    heartBeatExecutor = new ScheduledThreadPoolExecutor(1);
                    heartBeatExecutor.scheduleWithFixedDelay(new Runnable() {
                        public void run() {
                            try {
                                if (isConnected()) {
                                    webSocketConnector.sendPing();
                                    reConnectTimes = 0;
                                } else {
                                    ReconnectStrategy[] strategies = ReconnectStrategy.values();
                                    while ((!isConnected())
                                            && (System.currentTimeMillis() - waitTime >=
                                            strategies[reConnectTimes].getWatiTime())) {
                                        doConnect();
                                        waitTime = System.currentTimeMillis();
                                        reConnectTimes = (++reConnectTimes) % strategies.length;
                                    }
                                }
                            } catch (Throwable t) {
                                AlipayLogger.logBizError(t);
                            }
                        }
                    }, 0, 2000L, TimeUnit.MILLISECONDS);
                }
            }
        }
        while (!isConnected()) {
            Thread.sleep(1000L);
        }
    }

    public boolean isConnected() {
        return webSocketConnector != null && webSocketConnector.isOpen();
    }

    private void doConnect() throws Exception {
        if (isConnected()) {
            return;
        }

        synchronized (this) {
            if (isConnected()) {
                return;
            }

            RegisterResponse regResp = register();

            Map<String, String> httpHeaders = new HashMap<String, String>(1);
            if (regResp.getZone() != null && regResp.getZone().length() > 0) {
                httpHeaders.put("cookie", "zone=" + regResp.getZone() + ";");
            }
            if (loadTest) {
                httpHeaders.put("LoadTest", "true");
            }
            httpHeaders.put("Content-Type", "application/x-www-form-urlencoded;charset=" + charset);

            Map<String, String> params = new HashMap<String, String>(5);
            params.put("app_id", appId);
            params.put("charset", charset);
            params.put("link_token", regResp.getLinkToken());
            params.put("timestamp", String.valueOf(System.currentTimeMillis()));
            params.put("sign_type", signType);
            params.put("sdk_version", AlipayConstants.SDK_VERSION);
            String signContent = AlipaySignature.getSignCheckContentV2(params);
            String sign = AlipaySignature.rsaSign(signContent, appPrivateKey, charset, signType);
            params.put("sign", sign);
            String query = WebUtils.buildQuery(params, charset);
            String urlStr = "ws" + (isSSL ? "s" : "") + "://" + serverHost + "/websocket?" + query;

            webSocketConnector = new MsgConnector(new URI(urlStr), httpHeaders, this, charset);
            if (!webSocketConnector.connectBlocking(10L, TimeUnit.SECONDS)) {
                throw new RuntimeException("connect timeout(10s)!");
            }
            if (AlipayLogger.isBizDebugEnabled()) {
                AlipayLogger.logBizDebug("connected");
            }
        }
    }

    public ProduceMsgAck sendMessage(AlipayRequest msgReq) throws InterruptedException {
        if (!isConnected()) {
            throw new NotYetConnectedException();
        }
        Message message = new Message();
        message.setxCmd(MsgConstants.MSG_CMD_PRODUCE);
        message.setxSignType(signType);
        message.setxCharset(charset);
        message.setAppId(appId);
        message.setMsgApi(msgReq.getApiMethodName());
        message.setxTimestamp(System.currentTimeMillis());
        message.setBizContent(new JSONWriter().write(msgReq.getBizModel(), true));
        Message.addSign(message, appPrivateKey);
        ProtocolData protocolData = new ProtocolData();
        protocolData.setMessage(message);
        CountDownLatch signal = new CountDownLatch(1);
        ProtocolDataContext protocolDataContext = new ProtocolDataContext();
        protocolDataContext.setSendData(protocolData);
        protocolDataContext.setSendSignal(signal);
        if (!sendingQueue.offer(protocolData.getStreamId(), 200, TimeUnit.MILLISECONDS)) {
            throw new RuntimeException("too many message not receive ack, refuse new send. streamId:"
                    + protocolData.getStreamId());
        }
        sendingContexts.put(protocolData.getStreamId(), protocolDataContext);

        String protocolDataStr = ProtocolData.toStr(protocolData);
        if (AlipayLogger.isBizDebugEnabled()) {
            AlipayLogger.logBizDebug("send msg:" + protocolDataStr.replaceAll("[\r\n]", " "));
        }
        webSocketConnector.send(ProtocolData.toStr(protocolData));
        boolean signalNotify = signal.await(10000, TimeUnit.MILLISECONDS);

        sendingQueue.remove(protocolData.getStreamId());
        sendingContexts.remove(protocolData.getStreamId());
        if (!signalNotify) {
            AlipayLogger.logBizError("wait ack timeout(10s). streamId:" + protocolData.getStreamId());
            throw new RuntimeException("wait ack timeout(10s). streamId:" + protocolData.getStreamId());
        }

        ProtocolData ackData = protocolDataContext.getAckData();
        if (ackData == null) {
            throw new RuntimeException("ack protocol data null. streamId:" + protocolData.getStreamId());
        }
        Message ackMsg = ackData.getMessage();
        if (ackMsg == null) {
            throw new RuntimeException("ack msg null. streamId:" + protocolData.getStreamId());
        }
        ProduceMsgAck produceMsgAck = new ProduceMsgAck();
        produceMsgAck.setxStatus(MsgStatusEnum.fromStr(ackMsg.getxStatus()));
        produceMsgAck.setxCode(ackMsg.getxCode());
        produceMsgAck.setxError(ackMsg.getxError());
        produceMsgAck.setxMessageId(ackMsg.getxMessageId());
        return produceMsgAck;
    }

    public void close() throws InterruptedException {
        bizThreadPoolExecutor.shutdown();
        heartBeatExecutor.shutdown();
        Thread.sleep(1000);
        webSocketConnector.closeBlocking();
    }

    void onMessage(final String str) {
        try {
            bizThreadPoolExecutor.execute(new Runnable() {
                public void run() {
                    if (AlipayLogger.isBizDebugEnabled()) {
                        AlipayLogger.logBizDebug("receive msg:" + str.replaceAll("[\r\n]", " "));
                    }
                    final ProtocolData protocolData = ProtocolData.fromStr(str);
                    if (protocolData == null) {
                        return;
                    }
                    final Message message = protocolData.getMessage();
                    if (message == null) {
                        return;
                    }

                    if (MsgConstants.MSG_CMD_PRODUCE_ACK.equals(message.getxCmd())) {
                        ProtocolDataContext context = sendingContexts.get(protocolData.getStreamId());
                        if (context == null) {
                            AlipayLogger.logBizError("sendingContexts not found. streamId:" + protocolData.getStreamId());
                            return;
                        }
                        context.setAckData(protocolData);
                        context.getSendSignal().countDown();
                    } else if (MsgConstants.MSG_CMD_CONSUME.equals(message.getxCmd())) {
                        boolean checkSign = false;
                        try {
                            checkSign = Message.checkSign(message, alipayPublicKey);
                        } catch (Throwable t) {
                            AlipayLogger.logBizError("check message sign exception. str:" + str + " exception:" + t.getMessage());
                        }
                        if (!checkSign) {
                            AlipayLogger.logBizError("check message sign fail. str:" + str);
                        }

                        Message consumeAckMsg = new Message();
                        consumeAckMsg.setxCmd(MsgConstants.MSG_CMD_CONSUME_ACK);
                        consumeAckMsg.setxMessageId(message.getxMessageId());
                        consumeAckMsg.setxStatus(MsgConstants.SUCCESS);
                        ProtocolData consumeAckData = new ProtocolData();
                        consumeAckData.setFromSys(protocolData.getFromSys());
                        consumeAckData.setFromSysIp(protocolData.getFromSysIp());
                        consumeAckData.setStreamId(protocolData.getStreamId());
                        consumeAckData.setMessage(consumeAckMsg);
                        try {
                            messageHandler.onMessage(message.getMsgApi(), message.getxMessageId(), message.getBizContent());
                        } catch (Throwable t) {
                            AlipayLogger.logBizError("consume message exception. str:" + str + " exception:" + t.getMessage());
                            consumeAckMsg.setxStatus(MsgConstants.FAIL);
                        } finally {
                            webSocketConnector.send(ProtocolData.toStr(consumeAckData));
                        }
                    } else {
                        AlipayLogger.logBizError("unknown message cmd. str:" + str);
                    }
                }
            });
        } catch (Throwable e) {
            AlipayLogger.logBizError(e);
        }
    }

    public void setBizThreadPoolCoreSize(int coreSize) {
        this.bizThreadPoolCoreSize = coreSize;
        if (bizThreadPoolExecutor != null) {
            bizThreadPoolExecutor.setCorePoolSize(coreSize);
        }
    }

    public void setBizThreadPoolMaxSize(int maxSize) {
        this.bizThreadPoolMaxSize = maxSize;
        if (bizThreadPoolExecutor != null) {
            bizThreadPoolExecutor.setMaximumPoolSize(maxSize);
        }
    }

    public void setConnector(String serverHost) throws Exception {
        setConnector(serverHost, true);
    }

    public void setConnector(String serverHost, boolean isSSL) throws Exception {
        this.serverHost = serverHost;
        this.isSSL = isSSL;
    }

    public void setMessageHandler(MsgHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    public void setSecurityConfig(String signType, String appPrivateKey, String alipayPublicKey) {
        this.signType = signType;
        this.appPrivateKey = appPrivateKey;
        this.alipayPublicKey = alipayPublicKey;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public void setLoadTest(boolean loadTest) {
        this.loadTest = loadTest;
    }

    private RegisterResponse register() throws Exception {
        Map<String, String> params = new HashMap<String, String>(4);
        params.put("timestamp", String.valueOf(System.currentTimeMillis()));
        params.put("sign_type", signType);
        params.put("app_id", appId);
        params.put("charset", charset);
        params.put("sdk_version", AlipayConstants.SDK_VERSION);
        params.put("nonce", UUID.randomUUID().toString().replace("-", ""));
        String signContent = AlipaySignature.getSignCheckContentV2(params);
        String sign = AlipaySignature.rsaSign(signContent, appPrivateKey, charset, signType);
        params.put("sign", sign);
        String query = WebUtils.buildQuery(params, charset);
        String urlStr = "http" + (isSSL ? "s" : "") + "://" + serverHost + "/websocket/register.do?" + query;
        URL url = new URL(urlStr);

        HttpURLConnection conn = null;
        InputStream stream = null;
        String rsp = null;
        try {
            conn = WebUtils.getConnection(url, "GET", "application/x-www-form-urlencoded;charset=" + charset);
            if (loadTest) {
                conn.setRequestProperty("LoadTest", "true");
            }
            InputStream es = conn.getErrorStream();
            stream = es == null ? conn.getInputStream() : es;
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream, charset));
            StringWriter writer = new StringWriter();
            char[] chars = new char[256];
            int count = 0;
            while ((count = reader.read(chars)) > 0) {
                writer.write(chars, 0, count);
            }
            rsp = writer.toString();

        } finally {
            if (stream != null) {
                stream.close();
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
        RegisterResponse res = new RegisterResponse();
        res.setLinkToken(parseRegResp(rsp));
        res.setZone(parseRegRespHeader(conn.getHeaderFields()));
        return res;
    }

    private String parseRegResp(String rsp) throws Exception {
        if (rsp == null || rsp.length() <= 0) {
            throw new RuntimeException("register response is empty! " + rsp);
        }
        if (!rsp.trim().startsWith("{")) {
            throw new RuntimeException("register response error! " + rsp);
        }
        int contentBegin = rsp.indexOf("\"response\"") + "\"response\"".length();
        int contentEnd = -1;
        for (; contentBegin < rsp.length() && rsp.charAt(contentBegin) != ':'; ++contentBegin) {}
        for (; contentBegin < rsp.length() && rsp.charAt(contentBegin) != '{'; ++contentBegin) {}

        int rIdx = rsp.lastIndexOf("\"sign\"") + "\"sign\"".length();
        int signBegin = -1;
        String sign = null;
        String signContent = null;
        StringBuilder sb = new StringBuilder();
        if (rIdx > "\"sign\"".length()) {
            for (; rIdx < rsp.length() && rsp.charAt(rIdx) != ':'; ++rIdx) {}
            for (; rIdx < rsp.length() && rsp.charAt(rIdx) != '\"'; ++rIdx) {}
            for (signBegin = ++rIdx; rsp.charAt(rIdx) != '\"' && sb.append(rsp.charAt(rIdx)) != null; ++rIdx) {}
            sign = sb.toString();

            rIdx = signBegin;
            for (; rIdx > 0 && rsp.charAt(rIdx) != '}'; --rIdx) {}
            contentEnd = rIdx + 1;
            signContent = rsp.substring(contentBegin, contentEnd);

            if (!AlipaySignature.rsaCheck(signContent, sign, alipayPublicKey,
                    charset, signType)) {
                throw new RuntimeException("register response sign check fail! " + rsp);
            }
        } else {
            rIdx = rsp.lastIndexOf("}");
            for (--rIdx; rIdx > 0 && rsp.charAt(rIdx) != '}'; --rIdx) {}
            contentEnd = rIdx + 1;
            signContent = rsp.substring(contentBegin, contentEnd);
        }

        signContent = signContent.replaceAll("[ \t\n]", "");
        int idx = signContent.indexOf("\"code\":\"") + "\"code\":\"".length();
        String rspCode = signContent.substring(idx, signContent.indexOf('\"', idx));
        if ("10000".equals(rspCode) || "100000000".equals(rspCode)) {
            if (signBegin < 0) {
                throw new RuntimeException("register response code means success but sign is empty! " + rsp);
            }
        } else {
            throw new RuntimeException("register response code means fail! " + signContent);
        }

        idx = signContent.indexOf("\"link_token\":\"") + "\"link_token\":\"".length();
        return signContent.substring(idx, signContent.indexOf('\"', idx));
    }

    private String parseRegRespHeader(Map<String, List<String>> respHeaders) {
        String zone = null;
        List<String> cookies = respHeaders.get("set-cookie");
        if (cookies == null || cookies.isEmpty()) {
            cookies = respHeaders.get("Set-Cookie");
            if (cookies == null || cookies.isEmpty()) {
                cookies = respHeaders.get("Set-cookie");
            }
        }
        if (cookies != null && !cookies.isEmpty()) {
            for (String cookie : cookies) {
                if (cookie == null || cookie.length() <= 0) {
                    continue;
                }
                String[] kvs = cookie.split(";");
                for (String kv : kvs) {
                    if (!kv.contains("zone=")) {
                        continue;
                    }
                    String[] pair = kv.split("=");
                    if ("zone".equals(pair[0].trim())) {
                        zone = pair[1].trim();
                    }
                }
            }
        }
        return zone;
    }

    private static class RegisterResponse {
        private String linkToken;
        private String zone;

        String getLinkToken() {
            return linkToken;
        }

        void setLinkToken(String linkToken) {
            this.linkToken = linkToken;
        }

        String getZone() {
            return zone;
        }

        void setZone(String zone) {
            this.zone = zone;
        }
    }

    private enum ReconnectStrategy {
        ONE(0),
        TWO(5000),
        THREE(10000);

        private int watiTime;

        ReconnectStrategy(int watiTime) {
            this.watiTime = watiTime;
        }

        public int getWatiTime() {
            return watiTime;
        }
    }
}