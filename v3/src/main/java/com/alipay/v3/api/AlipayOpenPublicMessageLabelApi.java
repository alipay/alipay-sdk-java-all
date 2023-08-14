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


import com.alipay.v3.model.AlipayOpenPublicMessageLabelSendDefaultResponse;
import com.alipay.v3.model.AlipayOpenPublicMessageLabelSendModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenPublicMessageLabelApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenPublicMessageLabelApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenPublicMessageLabelApi(ApiClient apiClient) {
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
     * @param alipayOpenPublicMessageLabelSendModel  (optional)
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
    public okhttp3.Call sendCall(AlipayOpenPublicMessageLabelSendModel alipayOpenPublicMessageLabelSendModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenPublicMessageLabelSendModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/public/message/label/send";

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
    private okhttp3.Call sendValidateBeforeCall(AlipayOpenPublicMessageLabelSendModel alipayOpenPublicMessageLabelSendModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = sendCall(alipayOpenPublicMessageLabelSendModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 根据标签组发消息接口
     * 开发者可以通过标签运算圈定一批用户，并且向这批用户推送消息。关于标签组发有以下注意点：  除了商户自定义标签，还支持支付宝用户标签，我们将陆续开放用户画像标签，目前支持的支付宝标签及说明请查看支付宝开放标签；  用户及标签数据有1天的缓存时间，即昨天开发者给M用户打了a标签，今天给有a标签的用户组发消息，M能够收到消息；但是如果开发者今天给M用户打了a标签，然后向有a标签的用户组发消息，M不能收到消息；  与群发消息接口类似，该接口调用之后，消息发送系统会处理一段时间，调用接口到发送成功存在一定的时延，几分钟到半个小时不等；  对于同一个用户而言，一周只能收到一条群发或者标签组发的消息；  消息组发接口一周最多调用5次。
     * @param alipayOpenPublicMessageLabelSendModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object send(AlipayOpenPublicMessageLabelSendModel alipayOpenPublicMessageLabelSendModel) throws ApiException {
        ApiResponse<Object> localVarResp = sendWithHttpInfo(alipayOpenPublicMessageLabelSendModel, null);
        return localVarResp.getData();
    }

    public Object send(AlipayOpenPublicMessageLabelSendModel alipayOpenPublicMessageLabelSendModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = sendWithHttpInfo(alipayOpenPublicMessageLabelSendModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 根据标签组发消息接口
     * 开发者可以通过标签运算圈定一批用户，并且向这批用户推送消息。关于标签组发有以下注意点：  除了商户自定义标签，还支持支付宝用户标签，我们将陆续开放用户画像标签，目前支持的支付宝标签及说明请查看支付宝开放标签；  用户及标签数据有1天的缓存时间，即昨天开发者给M用户打了a标签，今天给有a标签的用户组发消息，M能够收到消息；但是如果开发者今天给M用户打了a标签，然后向有a标签的用户组发消息，M不能收到消息；  与群发消息接口类似，该接口调用之后，消息发送系统会处理一段时间，调用接口到发送成功存在一定的时延，几分钟到半个小时不等；  对于同一个用户而言，一周只能收到一条群发或者标签组发的消息；  消息组发接口一周最多调用5次。
     * @param alipayOpenPublicMessageLabelSendModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> sendWithHttpInfo(AlipayOpenPublicMessageLabelSendModel alipayOpenPublicMessageLabelSendModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = sendValidateBeforeCall(alipayOpenPublicMessageLabelSendModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenPublicMessageLabelSendDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 根据标签组发消息接口 (asynchronously)
     * 开发者可以通过标签运算圈定一批用户，并且向这批用户推送消息。关于标签组发有以下注意点：  除了商户自定义标签，还支持支付宝用户标签，我们将陆续开放用户画像标签，目前支持的支付宝标签及说明请查看支付宝开放标签；  用户及标签数据有1天的缓存时间，即昨天开发者给M用户打了a标签，今天给有a标签的用户组发消息，M能够收到消息；但是如果开发者今天给M用户打了a标签，然后向有a标签的用户组发消息，M不能收到消息；  与群发消息接口类似，该接口调用之后，消息发送系统会处理一段时间，调用接口到发送成功存在一定的时延，几分钟到半个小时不等；  对于同一个用户而言，一周只能收到一条群发或者标签组发的消息；  消息组发接口一周最多调用5次。
     * @param alipayOpenPublicMessageLabelSendModel  (optional)
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
    public okhttp3.Call sendAsync(AlipayOpenPublicMessageLabelSendModel alipayOpenPublicMessageLabelSendModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendValidateBeforeCall(alipayOpenPublicMessageLabelSendModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call sendAsync(AlipayOpenPublicMessageLabelSendModel alipayOpenPublicMessageLabelSendModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = sendValidateBeforeCall(alipayOpenPublicMessageLabelSendModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
