/**
 * Alipay.com Inc. Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api.msg;

/**
 * @author liuqun.lq
 * @version $Id: ConsumeMsgAck.java, v 0.1 2018年11月13日 17:25 liuqun.lq Exp $
 */
public class ConsumeMsgAck extends MsgAck {

    public ConsumeMsgAck() {
        setxCmd(MsgConstants.MSG_CMD_CONSUME_ACK);
    }
}