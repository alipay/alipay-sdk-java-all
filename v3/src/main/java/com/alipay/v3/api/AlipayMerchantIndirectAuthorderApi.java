/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-07-05
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


import com.alipay.v3.model.AlipayMerchantIndirectAuthorderCloseDefaultResponse;
import com.alipay.v3.model.AlipayMerchantIndirectAuthorderCloseModel;
import com.alipay.v3.model.AlipayMerchantIndirectAuthorderCreateDefaultResponse;
import com.alipay.v3.model.AlipayMerchantIndirectAuthorderCreateModel;
import com.alipay.v3.model.AlipayMerchantIndirectAuthorderCreateResponseModel;
import com.alipay.v3.model.AlipayMerchantIndirectAuthorderQuerystatusDefaultResponse;
import com.alipay.v3.model.AlipayMerchantIndirectAuthorderQuerystatusModel;
import com.alipay.v3.model.AlipayMerchantIndirectAuthorderQuerystatusResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayMerchantIndirectAuthorderApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayMerchantIndirectAuthorderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayMerchantIndirectAuthorderApi(ApiClient apiClient) {
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
     * Build call for close
     * @param alipayMerchantIndirectAuthorderCloseModel  (optional)
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
    public okhttp3.Call closeCall(AlipayMerchantIndirectAuthorderCloseModel alipayMerchantIndirectAuthorderCloseModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayMerchantIndirectAuthorderCloseModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/merchant/indirect/authorder/close";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call closeValidateBeforeCall(AlipayMerchantIndirectAuthorderCloseModel alipayMerchantIndirectAuthorderCloseModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = closeCall(alipayMerchantIndirectAuthorderCloseModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 商家认证申请单撤销
     * 申请单处于审核中、审核失败、待确认等状态时，申请单可撤销，撤销后可重新调用提交申请单接口上传申请单信息
     * @param alipayMerchantIndirectAuthorderCloseModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object close(AlipayMerchantIndirectAuthorderCloseModel alipayMerchantIndirectAuthorderCloseModel) throws ApiException {
        ApiResponse<Object> localVarResp = closeWithHttpInfo(alipayMerchantIndirectAuthorderCloseModel, null);
        return localVarResp.getData();
    }

    public Object close(AlipayMerchantIndirectAuthorderCloseModel alipayMerchantIndirectAuthorderCloseModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = closeWithHttpInfo(alipayMerchantIndirectAuthorderCloseModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 商家认证申请单撤销
     * 申请单处于审核中、审核失败、待确认等状态时，申请单可撤销，撤销后可重新调用提交申请单接口上传申请单信息
     * @param alipayMerchantIndirectAuthorderCloseModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> closeWithHttpInfo(AlipayMerchantIndirectAuthorderCloseModel alipayMerchantIndirectAuthorderCloseModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = closeValidateBeforeCall(alipayMerchantIndirectAuthorderCloseModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMerchantIndirectAuthorderCloseDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 商家认证申请单撤销 (asynchronously)
     * 申请单处于审核中、审核失败、待确认等状态时，申请单可撤销，撤销后可重新调用提交申请单接口上传申请单信息
     * @param alipayMerchantIndirectAuthorderCloseModel  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call closeAsync(AlipayMerchantIndirectAuthorderCloseModel alipayMerchantIndirectAuthorderCloseModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = closeValidateBeforeCall(alipayMerchantIndirectAuthorderCloseModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call closeAsync(AlipayMerchantIndirectAuthorderCloseModel alipayMerchantIndirectAuthorderCloseModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = closeValidateBeforeCall(alipayMerchantIndirectAuthorderCloseModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for create
     * @param alipayMerchantIndirectAuthorderCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayMerchantIndirectAuthorderCreateModel alipayMerchantIndirectAuthorderCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayMerchantIndirectAuthorderCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/merchant/indirect/authorder/create";

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
    private okhttp3.Call createValidateBeforeCall(AlipayMerchantIndirectAuthorderCreateModel alipayMerchantIndirectAuthorderCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayMerchantIndirectAuthorderCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 商家认证申请单提交
     * 间连商户认证申请单提交，用于支付宝间连商家认证
     * @param alipayMerchantIndirectAuthorderCreateModel  (optional)
     * @return AlipayMerchantIndirectAuthorderCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMerchantIndirectAuthorderCreateResponseModel create(AlipayMerchantIndirectAuthorderCreateModel alipayMerchantIndirectAuthorderCreateModel) throws ApiException {
        ApiResponse<AlipayMerchantIndirectAuthorderCreateResponseModel> localVarResp = createWithHttpInfo(alipayMerchantIndirectAuthorderCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayMerchantIndirectAuthorderCreateResponseModel create(AlipayMerchantIndirectAuthorderCreateModel alipayMerchantIndirectAuthorderCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMerchantIndirectAuthorderCreateResponseModel> localVarResp = createWithHttpInfo(alipayMerchantIndirectAuthorderCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 商家认证申请单提交
     * 间连商户认证申请单提交，用于支付宝间连商家认证
     * @param alipayMerchantIndirectAuthorderCreateModel  (optional)
     * @return ApiResponse&lt;AlipayMerchantIndirectAuthorderCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMerchantIndirectAuthorderCreateResponseModel> createWithHttpInfo(AlipayMerchantIndirectAuthorderCreateModel alipayMerchantIndirectAuthorderCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayMerchantIndirectAuthorderCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMerchantIndirectAuthorderCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMerchantIndirectAuthorderCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 商家认证申请单提交 (asynchronously)
     * 间连商户认证申请单提交，用于支付宝间连商家认证
     * @param alipayMerchantIndirectAuthorderCreateModel  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call createAsync(AlipayMerchantIndirectAuthorderCreateModel alipayMerchantIndirectAuthorderCreateModel, final ApiCallback<AlipayMerchantIndirectAuthorderCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayMerchantIndirectAuthorderCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMerchantIndirectAuthorderCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call createAsync(AlipayMerchantIndirectAuthorderCreateModel alipayMerchantIndirectAuthorderCreateModel, final ApiCallback<AlipayMerchantIndirectAuthorderCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayMerchantIndirectAuthorderCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMerchantIndirectAuthorderCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for querystatus
     * @param alipayMerchantIndirectAuthorderQuerystatusModel  (optional)
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
    public okhttp3.Call querystatusCall(AlipayMerchantIndirectAuthorderQuerystatusModel alipayMerchantIndirectAuthorderQuerystatusModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayMerchantIndirectAuthorderQuerystatusModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/merchant/indirect/authorder/querystatus";

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
    private okhttp3.Call querystatusValidateBeforeCall(AlipayMerchantIndirectAuthorderQuerystatusModel alipayMerchantIndirectAuthorderQuerystatusModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = querystatusCall(alipayMerchantIndirectAuthorderQuerystatusModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询商家认证申请单状态
     * 查询商家认证申请单状态，以及失败原因
     * @param alipayMerchantIndirectAuthorderQuerystatusModel  (optional)
     * @return AlipayMerchantIndirectAuthorderQuerystatusResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMerchantIndirectAuthorderQuerystatusResponseModel querystatus(AlipayMerchantIndirectAuthorderQuerystatusModel alipayMerchantIndirectAuthorderQuerystatusModel) throws ApiException {
        ApiResponse<AlipayMerchantIndirectAuthorderQuerystatusResponseModel> localVarResp = querystatusWithHttpInfo(alipayMerchantIndirectAuthorderQuerystatusModel, null);
        return localVarResp.getData();
    }

    public AlipayMerchantIndirectAuthorderQuerystatusResponseModel querystatus(AlipayMerchantIndirectAuthorderQuerystatusModel alipayMerchantIndirectAuthorderQuerystatusModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMerchantIndirectAuthorderQuerystatusResponseModel> localVarResp = querystatusWithHttpInfo(alipayMerchantIndirectAuthorderQuerystatusModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询商家认证申请单状态
     * 查询商家认证申请单状态，以及失败原因
     * @param alipayMerchantIndirectAuthorderQuerystatusModel  (optional)
     * @return ApiResponse&lt;AlipayMerchantIndirectAuthorderQuerystatusResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMerchantIndirectAuthorderQuerystatusResponseModel> querystatusWithHttpInfo(AlipayMerchantIndirectAuthorderQuerystatusModel alipayMerchantIndirectAuthorderQuerystatusModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = querystatusValidateBeforeCall(alipayMerchantIndirectAuthorderQuerystatusModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMerchantIndirectAuthorderQuerystatusResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMerchantIndirectAuthorderQuerystatusDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询商家认证申请单状态 (asynchronously)
     * 查询商家认证申请单状态，以及失败原因
     * @param alipayMerchantIndirectAuthorderQuerystatusModel  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call querystatusAsync(AlipayMerchantIndirectAuthorderQuerystatusModel alipayMerchantIndirectAuthorderQuerystatusModel, final ApiCallback<AlipayMerchantIndirectAuthorderQuerystatusResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = querystatusValidateBeforeCall(alipayMerchantIndirectAuthorderQuerystatusModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMerchantIndirectAuthorderQuerystatusResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call querystatusAsync(AlipayMerchantIndirectAuthorderQuerystatusModel alipayMerchantIndirectAuthorderQuerystatusModel, final ApiCallback<AlipayMerchantIndirectAuthorderQuerystatusResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = querystatusValidateBeforeCall(alipayMerchantIndirectAuthorderQuerystatusModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMerchantIndirectAuthorderQuerystatusResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
