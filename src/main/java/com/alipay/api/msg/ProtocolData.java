/**
 * Alipay.com Inc. Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api.msg;

import com.alipay.api.internal.util.AlipayUtils;
import com.alipay.api.internal.util.StringUtils;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author liuqun.lq
 * @version $Id: ProtocolData.java, v 0.1 2018年11月02日 17:55 liuqun.lq Exp $
 */
public class ProtocolData {

    private static final AtomicInteger seq        = new AtomicInteger(0);
    private static final String        RANDOM_NUM = AlipayUtils.toRadix62Str(
            new Random().nextInt((int) AlipayUtils.fromRadix62Str("zz")), 2);

    private String fromSys;
    private String fromSysIp;
    private String streamId;

    private Message message;

    public ProtocolData() {
        streamId = genStreamId();
    }

    public static ProtocolData fromStr(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        int i = str.indexOf(MsgConstants.CRLF2);
        if (i < 0) {
            throw new IllegalArgumentException("not find CRLF2. " + str);
        }

        ProtocolData protocolData = new ProtocolData();

        String protocol = str.substring(0, i);
        String data = str.substring(i + MsgConstants.CRLF2.length());
        try {
            if (!StringUtils.isEmpty(protocol)) {
                String[] kvs = protocol.split(MsgConstants.CRLF);
                for (String kvStr : kvs) {
                    String[] kv = kvStr.split(MsgConstants.COLON);
                    if (MsgConstants.PROTOCOL_KEY_FROM_SYS.equals(kv[0].trim())) {
                        protocolData.setFromSys(kv[1].trim());
                    } else if (MsgConstants.PROTOCOL_KEY_FROM_SYS_IP.equals(kv[0].trim())) {
                        protocolData.setFromSysIp(kv[1].trim());
                    } else if (MsgConstants.PROTOCOL_KEY_STREAM_ID.equals(kv[0].trim())) {
                        protocolData.setStreamId(kv[1].trim());
                    }
                }
            }
            if (!StringUtils.isEmpty(data)) {
                protocolData.setMessage(Message.fromStr(data));
            }
        } catch (Throwable t) {
            throw new IllegalArgumentException("format illegal. exception:" + t.getMessage() + " str:" + str);
        }

        return protocolData;
    }

    public static String toStr(ProtocolData protocolData) {
        StringBuilder sb = new StringBuilder();
        if (!StringUtils.isEmpty(protocolData.getFromSys())) {
            sb.append(MsgConstants.PROTOCOL_KEY_FROM_SYS)
                    .append(MsgConstants.COLON)
                    .append(protocolData.getFromSys())
                    .append(MsgConstants.CRLF);
        }
        if (!StringUtils.isEmpty(protocolData.getFromSysIp())) {
            sb.append(MsgConstants.PROTOCOL_KEY_FROM_SYS_IP)
                    .append(MsgConstants.COLON)
                    .append(protocolData.getFromSysIp())
                    .append(MsgConstants.CRLF);
        }
        if (!StringUtils.isEmpty(protocolData.getStreamId())) {
            sb.append(MsgConstants.PROTOCOL_KEY_STREAM_ID)
                    .append(MsgConstants.COLON)
                    .append(protocolData.getStreamId())
                    .append(MsgConstants.CRLF);
        }
        if (sb.length() <= 0) {
            sb.append(MsgConstants.CRLF);
        }
        sb.append(MsgConstants.CRLF);
        if (protocolData.getMessage() != null) {
            sb.append(Message.toStr(protocolData.getMessage()));
        }
        return sb.toString();
    }

    public static String genStreamId() {
        long cur = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("c");
        sb.append(AlipayUtils.toRadix62Str(cur, 8));
        sb.append(RANDOM_NUM);
        int curSeq = seq.getAndIncrement();
        // 3位62进制数最大值为238327
        if (curSeq >= 200000) {
            seq.set(0);
        }
        sb.append(AlipayUtils.toRadix62Str(curSeq, 3));
        return sb.toString();
    }

    /**
     * Getter method for property <tt>fromSys</tt>.
     *
     * @return property value of fromSys
     */
    public String getFromSys() {
        return fromSys;
    }

    /**
     * Setter method for property <tt>fromSys</tt>.
     *
     * @param fromSys value to be assigned to property fromSys
     */
    public void setFromSys(String fromSys) {
        this.fromSys = fromSys;
    }

    /**
     * Getter method for property <tt>fromSysIp</tt>.
     *
     * @return property value of fromSysIp
     */
    public String getFromSysIp() {
        return fromSysIp;
    }

    /**
     * Setter method for property <tt>fromSysIp</tt>.
     *
     * @param fromSysIp value to be assigned to property fromSysIp
     */
    public void setFromSysIp(String fromSysIp) {
        this.fromSysIp = fromSysIp;
    }

    /**
     * Getter method for property <tt>streamId</tt>.
     *
     * @return property value of streamId
     */
    public String getStreamId() {
        return streamId;
    }

    /**
     * Setter method for property <tt>streamId</tt>.
     *
     * @param streamId value to be assigned to property streamId
     */
    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    /**
     * Getter method for property <tt>message</tt>.
     *
     * @return property value of message
     */
    public Message getMessage() {
        return message;
    }

    /**
     * Setter method for property <tt>message</tt>.
     *
     * @param message value to be assigned to property message
     */
    public void setMessage(Message message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return toStr(this).replaceAll(MsgConstants.COLON, MsgConstants.CRLF_ESC);
    }
}