/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.util;

/**
 * @author junying
 * @version : StringUtil.java, v 0.1 2021年03月17日 8:58 下午 junying Exp $
 */
public class StringUtil {
    public static boolean isEmpty(String str) {
        if (str == null || str.trim().length() == 0) {
            return true;
        } else {
            return false;
        }
    }
}