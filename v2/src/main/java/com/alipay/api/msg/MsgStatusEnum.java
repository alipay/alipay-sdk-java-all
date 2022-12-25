/**
 * Alipay.com Inc. Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api.msg;

/**
 * @author liuqun.lq
 * @version $Id: MsgStatusEnum.java, v 0.1 2018年11月13日 18:07 liuqun.lq Exp $
 */
public enum MsgStatusEnum {
    SUCCESS,
    FAIL;

    public static MsgStatusEnum fromStr(String status) {
        if ("SUCCESS".equals(status)) {
            return SUCCESS;
        }
        return FAIL;
    }
}