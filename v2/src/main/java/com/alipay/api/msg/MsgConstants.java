/**
 * Alipay.com Inc. Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api.msg;

/**
 * @author liuqun.lq
 * @version $Id: MsgConstants.java, v 0.1 2018年11月02日 17:57 liuqun.lq Exp $
 */
public class MsgConstants {

    public static final String COLON                    = ":";
    public static final String CRLF                     = "\r\n";
    public static final String CRLF_ESC                 = "\\\\r\\\\n";
    public static final String CRLF2                    = "\r\n\r\n";
    public static final String SUCCESS                  = "SUCCESS";
    public static final String FAIL                     = "FAIL";
    public static final String PROTOCOL_KEY_FROM_SYS    = "from-sys";
    public static final String PROTOCOL_KEY_FROM_SYS_IP = "from-sys-ip";
    public static final String PROTOCOL_KEY_STREAM_ID   = "stream-id";

    public static final String MSG_CMD_PRODUCE     = "PRODUCE";
    public static final String MSG_CMD_PRODUCE_ACK = "PRODUCE_ACK";
    public static final String MSG_CMD_CONSUME     = "CONSUME";
    public static final String MSG_CMD_CONSUME_ACK = "CONSUME_ACK";
}