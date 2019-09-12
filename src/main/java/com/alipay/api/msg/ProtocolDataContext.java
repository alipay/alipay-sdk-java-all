/**
 * Alipay.com Inc. Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api.msg;

import java.util.concurrent.CountDownLatch;

/**
 * @author liuqun.lq
 * @version $Id: ProtocolDataContext.java, v 0.1 2018年11月12日 18:59 liuqun.lq Exp $
 */
public class ProtocolDataContext {

    private ProtocolData   sendData;
    private CountDownLatch sendSignal;
    private ProtocolData   ackData;

    /**
     * Getter method for property <tt>sendData</tt>.
     *
     * @return property value of sendData
     */
    public ProtocolData getSendData() {
        return sendData;
    }

    /**
     * Setter method for property <tt>sendData</tt>.
     *
     * @param sendData value to be assigned to property sendData
     */
    public void setSendData(ProtocolData sendData) {
        this.sendData = sendData;
    }

    /**
     * Getter method for property <tt>sendSignal</tt>.
     *
     * @return property value of sendSignal
     */
    public CountDownLatch getSendSignal() {
        return sendSignal;
    }

    /**
     * Setter method for property <tt>sendSignal</tt>.
     *
     * @param sendSignal value to be assigned to property sendSignal
     */
    public void setSendSignal(CountDownLatch sendSignal) {
        this.sendSignal = sendSignal;
    }

    /**
     * Getter method for property <tt>ackData</tt>.
     *
     * @return property value of ackData
     */
    public ProtocolData getAckData() {
        return ackData;
    }

    /**
     * Setter method for property <tt>ackData</tt>.
     *
     * @param ackData value to be assigned to property ackData
     */
    public void setAckData(ProtocolData ackData) {
        this.ackData = ackData;
    }
}