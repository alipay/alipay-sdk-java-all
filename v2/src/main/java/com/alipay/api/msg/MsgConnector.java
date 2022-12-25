/**
 * Alipay.com Inc. Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api.msg;

import com.alipay.api.internal.util.AlipayLogger;
import com.alipay.api.java_websocket.client.WebSocketClient;
import com.alipay.api.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.util.Map;

/**
 * @author liuqun.lq
 * @version $Id: WebSocketConnector.java, v 0.1 2018年08月31日 17:28 liuqun.lq Exp $
 */
public class MsgConnector extends WebSocketClient {

    private AlipayMsgClient alipayMsgClient;

    public MsgConnector(URI serverUri, Map<String, String> httpHeaders,
                        AlipayMsgClient alipayMsgClient, String charset) {
        super(serverUri, httpHeaders, charset);
        this.alipayMsgClient = alipayMsgClient;
    }

    public void onOpen(ServerHandshake handshakedata) {
        AlipayLogger.logBizDebug("conn open");
    }

    public void onMessage(String message) {
        alipayMsgClient.onMessage(message);
    }

    public void onClose(int code, String reason, boolean remote) {
        AlipayLogger.logBizDebug("conn close");
    }

    public void onError(Exception ex) {
        AlipayLogger.logBizError(ex);
    }
}