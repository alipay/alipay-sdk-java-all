/**
 * Alipay.com Inc. Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api.msg;

/**
 * @author liuqun.lq
 * @version $Id: ProduceMsgAck.java, v 0.1 2018年11月13日 17:23 liuqun.lq Exp $
 */
public class ProduceMsgAck extends MsgAck {

    public ProduceMsgAck() {
        setxCmd(MsgConstants.MSG_CMD_PRODUCE_ACK);
    }
}