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


import com.alipay.v3.model.AlipayEbppInvoiceApplyResultSyncDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceApplyResultSyncModel;
import com.alipay.v3.model.AlipayEbppInvoiceApplyResultSyncResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayEbppInvoiceApplyResultApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayEbppInvoiceApplyResultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayEbppInvoiceApplyResultApi(ApiClient apiClient) {
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
     * Build call for sync
     * @param alipayEbppInvoiceApplyResultSyncModel  (optional)
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
    public okhttp3.Call syncCall(AlipayEbppInvoiceApplyResultSyncModel alipayEbppInvoiceApplyResultSyncModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEbppInvoiceApplyResultSyncModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/ebpp/invoice/apply/result/sync";

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
    private okhttp3.Call syncValidateBeforeCall(AlipayEbppInvoiceApplyResultSyncModel alipayEbppInvoiceApplyResultSyncModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = syncCall(alipayEbppInvoiceApplyResultSyncModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * ISV向支付宝同步发票申请结果
     * ISV向支付宝同步发票申请结果
     * @param alipayEbppInvoiceApplyResultSyncModel  (optional)
     * @return AlipayEbppInvoiceApplyResultSyncResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceApplyResultSyncResponseModel sync(AlipayEbppInvoiceApplyResultSyncModel alipayEbppInvoiceApplyResultSyncModel) throws ApiException {
        ApiResponse<AlipayEbppInvoiceApplyResultSyncResponseModel> localVarResp = syncWithHttpInfo(alipayEbppInvoiceApplyResultSyncModel, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceApplyResultSyncResponseModel sync(AlipayEbppInvoiceApplyResultSyncModel alipayEbppInvoiceApplyResultSyncModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceApplyResultSyncResponseModel> localVarResp = syncWithHttpInfo(alipayEbppInvoiceApplyResultSyncModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * ISV向支付宝同步发票申请结果
     * ISV向支付宝同步发票申请结果
     * @param alipayEbppInvoiceApplyResultSyncModel  (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceApplyResultSyncResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceApplyResultSyncResponseModel> syncWithHttpInfo(AlipayEbppInvoiceApplyResultSyncModel alipayEbppInvoiceApplyResultSyncModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = syncValidateBeforeCall(alipayEbppInvoiceApplyResultSyncModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceApplyResultSyncResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceApplyResultSyncDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * ISV向支付宝同步发票申请结果 (asynchronously)
     * ISV向支付宝同步发票申请结果
     * @param alipayEbppInvoiceApplyResultSyncModel  (optional)
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
    public okhttp3.Call syncAsync(AlipayEbppInvoiceApplyResultSyncModel alipayEbppInvoiceApplyResultSyncModel, final ApiCallback<AlipayEbppInvoiceApplyResultSyncResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = syncValidateBeforeCall(alipayEbppInvoiceApplyResultSyncModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceApplyResultSyncResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call syncAsync(AlipayEbppInvoiceApplyResultSyncModel alipayEbppInvoiceApplyResultSyncModel, final ApiCallback<AlipayEbppInvoiceApplyResultSyncResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = syncValidateBeforeCall(alipayEbppInvoiceApplyResultSyncModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceApplyResultSyncResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
