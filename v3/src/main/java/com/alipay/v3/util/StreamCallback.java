/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.alipay.v3.util;

import com.alipay.v3.ApiException;
import com.alipay.v3.ApiResponse;
import okhttp3.Response;

/**
 * @author jishupei.jsp
 * @version : StreamCallback, v0.1 2024年05月07日 4:43 下午 jishupei.jsp Exp $
 */
public abstract class StreamCallback<T> {

    /**
     * 回调方法，服务器响应后调用
     */
    public abstract void onEvent(ApiResponse<T> response, String id, String type, String data);

    /**
     * 回调方法，http流连接建立后调用
     */
    public void onOpen(Response response) {
    }

    /**
     * 回调方法，http流连接关闭时调用
     */
    public void onClosed() {
    }

    /**
     * 回调方法，发生异常时调用
     */
    public abstract void onError(ApiException exception);
}
