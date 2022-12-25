/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api.internal.util;

import com.alipay.api.AlipayConstants;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhongyu
 * @version $Id: LoadTestUtil.java, v 0.1 2019年09月16日 下午2:55 zhongyu Exp $
 */
public class LoadTestUtil {
    private static final String TEST_LOAD_FLAG = "_TEST_1A";

    public static Map<String, String> getParamsWithLoadTestFlag(Map<String, String> params) {
        Map<String, String> result = new HashMap<String, String>(params);
        if (result.containsKey(AlipayConstants.APP_ID)) {
            String appId = result.get(AlipayConstants.APP_ID);
            result.put(AlipayConstants.APP_ID, appId + TEST_LOAD_FLAG);
        }
        return result;
    }
}