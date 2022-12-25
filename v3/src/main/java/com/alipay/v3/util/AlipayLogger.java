/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.alipay.v3.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/**
 * @author jishupei.jsp
 * @version : AlipayLogger, v0.1 2022年07月28日 4:53 下午 jishupei.jsp Exp $
 */
public class AlipayLogger {

    private static final Log errlog = LogFactory.getLog("sdk.biz.err");
    private static final Log infolog = LogFactory.getLog("sdk.biz.info");
    private static final Log warnlog = LogFactory.getLog("sdk.biz.warn");

    private static String osName = System.getProperties().getProperty("os.name");
    private static String ip = null;
    private static boolean needEnableLogger = true;

    /**
     * 默认时间格式
     **/
    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * Date默认时区
     **/
    public static final String DATE_TIMEZONE = "GMT+8";

    /**
     * 是否开启日志（默认开启）
     *
     * @param needEnableLogger true：开启；false：关闭
     */
    public static void setNeedEnableLogger(boolean needEnableLogger) {
        AlipayLogger.needEnableLogger = needEnableLogger;
    }

    public static String getIp() {
        if (ip == null) {
            try {
                ip = InetAddress.getLocalHost().getHostAddress();
            } catch (Exception e) {
            }
        }
        return ip;
    }

    public static void setIp(String ip) {
        AlipayLogger.ip = ip;
    }

    public static void logBizError(Throwable t) {
        if (!needEnableLogger) {
            return;
        }
        errlog.error(t);
    }

    public static void logBizWarn(Throwable t) {
        if (!needEnableLogger) {
            return;
        }
        warnlog.warn(t);
    }

    public static void logBizInfo(String url, String body, String method, String contentType, String requestId) {
        if (!needEnableLogger) {
            return;
        }
        DateFormat df = new SimpleDateFormat(DATE_TIME_FORMAT);
        df.setTimeZone(TimeZone.getTimeZone(DATE_TIMEZONE));
        StringBuilder sb = new StringBuilder();
        sb.append(df.format(new Date()));
        sb.append("^_^");
        sb.append("ip:").append(ip);
        sb.append("^_^");
        sb.append("OSName:").append(osName);
        sb.append("^_^");
        sb.append("url:").append(url);
        sb.append("^_^");
        sb.append("method:").append(method);
        sb.append("^_^");
        sb.append("requestId:").append(requestId);
        sb.append("^_^");
        sb.append("contentType:").append(contentType);
        sb.append("^_^");
        sb.append("multipart/form-data".equals(contentType) ? "body[data]:" : "body:").append(body);
        infolog.info(sb.toString());
    }

    public static void logBizResponseInfo(int code, String responseBody, Map<String, List<String>> responseHeaders) {
        if (!needEnableLogger) {
            return;
        }
        DateFormat df = new SimpleDateFormat(DATE_TIME_FORMAT);
        df.setTimeZone(TimeZone.getTimeZone(DATE_TIMEZONE));
        StringBuilder sb = new StringBuilder();
        sb.append(df.format(new Date()));
        sb.append("^_^");
        sb.append("ip:").append(ip);
        sb.append("^_^");
        sb.append("OSName:").append(osName);
        sb.append("^_^");
        sb.append("HTTP response code:").append(code);
        sb.append("^_^");
        sb.append("HTTP response body:").append(responseBody);
        sb.append("^_^");
        sb.append("HTTP response headers:").append(responseHeaders == null ? null : responseHeaders.toString());
        infolog.info(sb.toString());
    }
}
