package com.alipay.service.schema.util;

public class StringUtil {

    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    /**
     * 拼接入参
     *
     * @param spliterStr 拼接分割符
     * @param objs       变参
     */
    public static String concatParams(String spliterStr, Object... objs) {

        StringBuilder sb = new StringBuilder();
        if (objs != null) {
            for (int i = 0; i < objs.length; i++) {
                sb.append(objs[i]);
                if (i != objs.length - 1) {
                    sb.append(spliterStr);
                }
            }
            return sb.toString();
        }
        return null;
    }
}
