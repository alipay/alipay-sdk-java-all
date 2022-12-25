/**
 * Alipay.com Inc. Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api.msg;

/**
 * @author liuqun.lq
 * @version $Id: MsgAck.java, v 0.1 2018年11月13日 17:20 liuqun.lq Exp $
 */
public class MsgAck {

    private String        xCmd;
    private MsgStatusEnum xStatus;
    private String        xCode;
    private String        xError;
    private String        xMessageId;

    /**
     * Getter method for property <tt>xCmd</tt>.
     *
     * @return property value of xCmd
     */
    public String getxCmd() {
        return xCmd;
    }

    /**
     * Setter method for property <tt>xCmd</tt>.
     *
     * @param xCmd value to be assigned to property xCmd
     */
    protected void setxCmd(String xCmd) {
        this.xCmd = xCmd;
    }

    /**
     * Getter method for property <tt>xStatus</tt>.
     *
     * @return property value of xStatus
     */
    public MsgStatusEnum getxStatus() {
        return xStatus;
    }

    /**
     * Setter method for property <tt>xStatus</tt>.
     *
     * @param xStatus value to be assigned to property xStatus
     */
    public void setxStatus(MsgStatusEnum xStatus) {
        this.xStatus = xStatus;
    }

    /**
     * Getter method for property <tt>xCode</tt>.
     *
     * @return property value of xCode
     */
    public String getxCode() {
        return xCode;
    }

    /**
     * Setter method for property <tt>xCode</tt>.
     *
     * @param xCode value to be assigned to property xCode
     */
    public void setxCode(String xCode) {
        this.xCode = xCode;
    }

    /**
     * Getter method for property <tt>xError</tt>.
     *
     * @return property value of xError
     */
    public String getxError() {
        return xError;
    }

    /**
     * Setter method for property <tt>xError</tt>.
     *
     * @param xError value to be assigned to property xError
     */
    public void setxError(String xError) {
        this.xError = xError;
    }

    /**
     * Getter method for property <tt>xMessageId</tt>.
     *
     * @return property value of xMessageId
     */
    public String getxMessageId() {
        return xMessageId;
    }

    /**
     * Setter method for property <tt>xMessageId</tt>.
     *
     * @param xMessageId value to be assigned to property xMessageId
     */
    public void setxMessageId(String xMessageId) {
        this.xMessageId = xMessageId;
    }

    @Override
    public String toString() {
        return "MsgAck{" +
                "xCmd='" + xCmd + '\'' +
                ", xStatus=" + xStatus +
                ", xCode='" + xCode + '\'' +
                ", xError='" + xError + '\'' +
                ", xMessageId='" + xMessageId + '\'' +
                '}';
    }
}