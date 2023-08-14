/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-08-14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.api;

import com.alipay.v3.ApiCallback;
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.ApiResponse;
import com.alipay.v3.Configuration;
import com.alipay.v3.Pair;
import com.alipay.v3.ProgressRequestBody;
import com.alipay.v3.ProgressResponseBody;
import com.alipay.v3.util.AlipayLogger;
import com.alipay.v3.util.model.CustomizedParams;

import com.google.common.base.Strings;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.alipay.v3.model.AlipayOpenPublicMessageCustomSendDefaultResponse;
import com.alipay.v3.model.AlipayOpenPublicMessageCustomSendModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenPublicMessageCustomApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenPublicMessageCustomApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenPublicMessageCustomApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for send
     * @param alipayOpenPublicMessageCustomSendModel  (optional)
     * @param _callback Callback for upload/download progress
     * @param customizedParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendCall(AlipayOpenPublicMessageCustomSendModel alipayOpenPublicMessageCustomSendModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = (customizedParams != null && !Strings.isNullOrEmpty(customizedParams.getBodyContent()))
                ? customizedParams.getBodyContent() : alipayOpenPublicMessageCustomSendModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/public/message/custom/send";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        if (customizedParams != null) {
            //额外query参数
            if (customizedParams.getQueryParams() != null && customizedParams.getQueryParams().size() > 0) {
                for (Map.Entry<String, String> entry : customizedParams.getQueryParams().entrySet()) {
                    localVarQueryParams.addAll(localVarApiClient.parameterToPair(entry.getKey(), entry.getValue()));
                }
            }

            if (!Strings.isNullOrEmpty(customizedParams.getAppAuthToken())) {
                localVarHeaderParams.put("alipay-app-auth-token", customizedParams.getAppAuthToken());
            }

            //额外非全局header参数
            if (customizedParams.getHeaderParams() != null && customizedParams.getHeaderParams().size() > 0) {
                localVarHeaderParams.putAll(customizedParams.getHeaderParams());
            }
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendValidateBeforeCall(AlipayOpenPublicMessageCustomSendModel alipayOpenPublicMessageCustomSendModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = sendCall(alipayOpenPublicMessageCustomSendModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 异步单发消息
     * 开发者可使用该接口向指定关注用户推送客服消息，一般用于开发者使用接口与用户进行实时信息交互，例如自动回答用户包含某些指定关键字的咨询等。注意：用户必须在48小时之内与该生活号有交互行为才能收到消息（交互行为包括进入生活号、点击菜单、向生活号发送消息等），每个生活号每天只能向1个用户推送100条消息，超过这个数目会报错频率超限
     * @param alipayOpenPublicMessageCustomSendModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object send(AlipayOpenPublicMessageCustomSendModel alipayOpenPublicMessageCustomSendModel) throws ApiException {
        ApiResponse<Object> localVarResp = sendWithHttpInfo(alipayOpenPublicMessageCustomSendModel, null);
        return localVarResp.getData();
    }

    public Object send(AlipayOpenPublicMessageCustomSendModel alipayOpenPublicMessageCustomSendModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = sendWithHttpInfo(alipayOpenPublicMessageCustomSendModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 异步单发消息
     * 开发者可使用该接口向指定关注用户推送客服消息，一般用于开发者使用接口与用户进行实时信息交互，例如自动回答用户包含某些指定关键字的咨询等。注意：用户必须在48小时之内与该生活号有交互行为才能收到消息（交互行为包括进入生活号、点击菜单、向生活号发送消息等），每个生活号每天只能向1个用户推送100条消息，超过这个数目会报错频率超限
     * @param alipayOpenPublicMessageCustomSendModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> sendWithHttpInfo(AlipayOpenPublicMessageCustomSendModel alipayOpenPublicMessageCustomSendModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = sendValidateBeforeCall(alipayOpenPublicMessageCustomSendModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenPublicMessageCustomSendDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 异步单发消息 (asynchronously)
     * 开发者可使用该接口向指定关注用户推送客服消息，一般用于开发者使用接口与用户进行实时信息交互，例如自动回答用户包含某些指定关键字的咨询等。注意：用户必须在48小时之内与该生活号有交互行为才能收到消息（交互行为包括进入生活号、点击菜单、向生活号发送消息等），每个生活号每天只能向1个用户推送100条消息，超过这个数目会报错频率超限
     * @param alipayOpenPublicMessageCustomSendModel  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendAsync(AlipayOpenPublicMessageCustomSendModel alipayOpenPublicMessageCustomSendModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendValidateBeforeCall(alipayOpenPublicMessageCustomSendModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call sendAsync(AlipayOpenPublicMessageCustomSendModel alipayOpenPublicMessageCustomSendModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = sendValidateBeforeCall(alipayOpenPublicMessageCustomSendModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
