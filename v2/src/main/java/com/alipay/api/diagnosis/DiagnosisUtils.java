/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.alipay.api.diagnosis;

import com.alipay.api.AlipayConstants;
import com.alipay.api.AlipayResponse;

import java.util.Map;

/**
 * @author jd
 * @version DiagnosisUtils.java, v 0.1 2023年06月28日 17:50 jd
 */
public class DiagnosisUtils {

    private static final String EMPTY_STRING = "";

    private static final String TRACE_ID_KEY = "traceId";

    /**
     * 调用失败的时候获取诊断链接
     */
    public static String getDiagnosisUrl(AlipayResponse response) {

        if (response == null) {
            return EMPTY_STRING;
        }
        Map<String, String> params = response.getParams();
        if (params == null) {
            return EMPTY_STRING;
        }
        if (!params.containsKey(TRACE_ID_KEY)) {
            return EMPTY_STRING;
        }

        String traceId = params.get(TRACE_ID_KEY);
        if (traceId == null || traceId.equals("")) {
            return EMPTY_STRING;
        }
        return AlipayConstants.DIAGNOSIS_URL + traceId + AlipayConstants.DIAGNOSIS_SOURCE;
    }

    /**
     * 调用失败的时候获取诊断ID
     */
    public static String getTraceId(AlipayResponse response) {
        if (response == null) {
            return EMPTY_STRING;
        }

        Map<String, String> params = response.getParams();
        if (params == null) {
            return EMPTY_STRING;
        }
        if (!params.containsKey(TRACE_ID_KEY)) {
            return EMPTY_STRING;
        }
        String traceId = params.get(TRACE_ID_KEY);
        if (traceId == null || traceId.equals("")) {
            return EMPTY_STRING;
        }
        return traceId;
    }
}