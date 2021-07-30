/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.exception;

import com.alipay.service.schema.model.enums.SchemaErrorEnum;

/**
 * @author hongbi.wang
 * @version $Id: SchemaException.java, v 0.1 2021年02月26日 6:03 PM hongbi.wang Exp $
 */
public class SchemaException extends Exception {

    private String errorCode;

    private String errorMessage;

    private String attributeId;

    public SchemaException(SchemaErrorEnum errorEnum) {
        super(errorEnum.getErrorMessage());
        this.errorCode = errorEnum.getErrorCode();
        this.errorMessage = errorEnum.getErrorMessage();
    }

    public SchemaException(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public SchemaException(SchemaErrorEnum errorCode, String attributeId) {
        super(errorCode.getErrorMessage());
        String msg = errorCode.getErrorMessage();
        if (attributeId != null && attributeId.length() != 0) {
            msg += "At the filed which id is " + attributeId;
        }
        this.errorCode = errorCode.getErrorCode();
        this.errorMessage = msg;
        this.attributeId = attributeId;
    }

    public SchemaException(String errorCode, String errorMessage, String attributeId) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.attributeId = attributeId;
    }

    public SchemaException(SchemaErrorEnum errorCode, Throwable e) {
        super(errorCode.getErrorMessage(), e);
        this.errorCode = errorCode.getErrorCode();
        this.errorMessage = errorCode.getErrorMessage();
    }

    /**
     * Getter method for property <tt>errorCode</tt>.
     *
     * @return property value of errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Setter method for property <tt>errorCode</tt>.
     *
     * @param errorCode value to be assigned to property errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter method for property <tt>errorMessage</tt>.
     *
     * @return property value of errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Setter method for property <tt>errorMessage</tt>.
     *
     * @param errorMessage value to be assigned to property errorMessage
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Getter method for property <tt>attributeId</tt>.
     *
     * @return property value of attributeId
     */
    public String getAttributeId() {
        return attributeId;
    }

    /**
     * Setter method for property <tt>attributeId</tt>.
     *
     * @param attributeId value to be assigned to property attributeId
     */
    public void setAttributeId(String attributeId) {
        this.attributeId = attributeId;
    }
}