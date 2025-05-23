/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2025-03-05
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


import com.alipay.v3.model.AlipayMarketingRecruitEnrollCloseDefaultResponse;
import com.alipay.v3.model.AlipayMarketingRecruitEnrollCloseModel;
import com.alipay.v3.model.AlipayMarketingRecruitEnrollCreateDefaultResponse;
import com.alipay.v3.model.AlipayMarketingRecruitEnrollCreateModel;
import com.alipay.v3.model.AlipayMarketingRecruitEnrollCreateResponseModel;
import com.alipay.v3.model.AlipayMarketingRecruitEnrollQueryDefaultResponse;
import com.alipay.v3.model.AlipayMarketingRecruitEnrollQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayMarketingRecruitEnrollApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayMarketingRecruitEnrollApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayMarketingRecruitEnrollApi(ApiClient apiClient) {
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
     * @param alipayMarketingRecruitEnrollCloseModel  (optional)
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
    public okhttp3.Call closeCall(AlipayMarketingRecruitEnrollCloseModel alipayMarketingRecruitEnrollCloseModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayMarketingRecruitEnrollCloseModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/marketing/recruit/enroll/close";

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
    private okhttp3.Call closeValidateBeforeCall(AlipayMarketingRecruitEnrollCloseModel alipayMarketingRecruitEnrollCloseModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = closeCall(alipayMarketingRecruitEnrollCloseModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 下线报名
     * 下线报名
     * @param alipayMarketingRecruitEnrollCloseModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object close(AlipayMarketingRecruitEnrollCloseModel alipayMarketingRecruitEnrollCloseModel) throws ApiException {
        ApiResponse<Object> localVarResp = closeWithHttpInfo(alipayMarketingRecruitEnrollCloseModel, null);
        return localVarResp.getData();
    }

    public Object close(AlipayMarketingRecruitEnrollCloseModel alipayMarketingRecruitEnrollCloseModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = closeWithHttpInfo(alipayMarketingRecruitEnrollCloseModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 下线报名
     * 下线报名
     * @param alipayMarketingRecruitEnrollCloseModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> closeWithHttpInfo(AlipayMarketingRecruitEnrollCloseModel alipayMarketingRecruitEnrollCloseModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = closeValidateBeforeCall(alipayMarketingRecruitEnrollCloseModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingRecruitEnrollCloseDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 下线报名 (asynchronously)
     * 下线报名
     * @param alipayMarketingRecruitEnrollCloseModel  (optional)
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
    public okhttp3.Call closeAsync(AlipayMarketingRecruitEnrollCloseModel alipayMarketingRecruitEnrollCloseModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = closeValidateBeforeCall(alipayMarketingRecruitEnrollCloseModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call closeAsync(AlipayMarketingRecruitEnrollCloseModel alipayMarketingRecruitEnrollCloseModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = closeValidateBeforeCall(alipayMarketingRecruitEnrollCloseModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for create
     * @param alipayMarketingRecruitEnrollCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayMarketingRecruitEnrollCreateModel alipayMarketingRecruitEnrollCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayMarketingRecruitEnrollCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/marketing/recruit/enroll/create";

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
    private okhttp3.Call createValidateBeforeCall(AlipayMarketingRecruitEnrollCreateModel alipayMarketingRecruitEnrollCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayMarketingRecruitEnrollCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 招商报名提交
     * 创建报名后立即提交，审核通过后会以消息的形式通知调用方（需要接入消息接口alipay.marketing.enroll.status.changed）。在消息通知前可以尝试调用“报名详情查询接口（alipay.marketing.enroll.detail.query）”了解报名状态。
     * @param alipayMarketingRecruitEnrollCreateModel  (optional)
     * @return AlipayMarketingRecruitEnrollCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingRecruitEnrollCreateResponseModel create(AlipayMarketingRecruitEnrollCreateModel alipayMarketingRecruitEnrollCreateModel) throws ApiException {
        ApiResponse<AlipayMarketingRecruitEnrollCreateResponseModel> localVarResp = createWithHttpInfo(alipayMarketingRecruitEnrollCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayMarketingRecruitEnrollCreateResponseModel create(AlipayMarketingRecruitEnrollCreateModel alipayMarketingRecruitEnrollCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingRecruitEnrollCreateResponseModel> localVarResp = createWithHttpInfo(alipayMarketingRecruitEnrollCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 招商报名提交
     * 创建报名后立即提交，审核通过后会以消息的形式通知调用方（需要接入消息接口alipay.marketing.enroll.status.changed）。在消息通知前可以尝试调用“报名详情查询接口（alipay.marketing.enroll.detail.query）”了解报名状态。
     * @param alipayMarketingRecruitEnrollCreateModel  (optional)
     * @return ApiResponse&lt;AlipayMarketingRecruitEnrollCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingRecruitEnrollCreateResponseModel> createWithHttpInfo(AlipayMarketingRecruitEnrollCreateModel alipayMarketingRecruitEnrollCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayMarketingRecruitEnrollCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingRecruitEnrollCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingRecruitEnrollCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 招商报名提交 (asynchronously)
     * 创建报名后立即提交，审核通过后会以消息的形式通知调用方（需要接入消息接口alipay.marketing.enroll.status.changed）。在消息通知前可以尝试调用“报名详情查询接口（alipay.marketing.enroll.detail.query）”了解报名状态。
     * @param alipayMarketingRecruitEnrollCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayMarketingRecruitEnrollCreateModel alipayMarketingRecruitEnrollCreateModel, final ApiCallback<AlipayMarketingRecruitEnrollCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayMarketingRecruitEnrollCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingRecruitEnrollCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call createAsync(AlipayMarketingRecruitEnrollCreateModel alipayMarketingRecruitEnrollCreateModel, final ApiCallback<AlipayMarketingRecruitEnrollCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayMarketingRecruitEnrollCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingRecruitEnrollCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param outBizNo 外部操作流水号，创建招商报名时传入。由商家/ISV 自定义，仅支持字母、数字、下划线且需保证每次操作唯一。 (optional)
     * @param enrollId 报名ID，此参数和out_biz_no至少传一个，优先取enroll_id (optional)
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
    public okhttp3.Call queryCall(String outBizNo, String enrollId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/alipay/marketing/recruit/enroll/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (outBizNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("out_biz_no", outBizNo));
        }

        if (enrollId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("enroll_id", enrollId));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call queryValidateBeforeCall(String outBizNo, String enrollId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(outBizNo, enrollId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 报名详情查询
     * 报名详情查询
     * @param outBizNo 外部操作流水号，创建招商报名时传入。由商家/ISV 自定义，仅支持字母、数字、下划线且需保证每次操作唯一。 (optional)
     * @param enrollId 报名ID，此参数和out_biz_no至少传一个，优先取enroll_id (optional)
     * @return AlipayMarketingRecruitEnrollQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingRecruitEnrollQueryResponseModel query(String outBizNo, String enrollId) throws ApiException {
        ApiResponse<AlipayMarketingRecruitEnrollQueryResponseModel> localVarResp = queryWithHttpInfo(outBizNo, enrollId, null);
        return localVarResp.getData();
    }

    public AlipayMarketingRecruitEnrollQueryResponseModel query(String outBizNo, String enrollId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingRecruitEnrollQueryResponseModel> localVarResp = queryWithHttpInfo(outBizNo, enrollId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 报名详情查询
     * 报名详情查询
     * @param outBizNo 外部操作流水号，创建招商报名时传入。由商家/ISV 自定义，仅支持字母、数字、下划线且需保证每次操作唯一。 (optional)
     * @param enrollId 报名ID，此参数和out_biz_no至少传一个，优先取enroll_id (optional)
     * @return ApiResponse&lt;AlipayMarketingRecruitEnrollQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingRecruitEnrollQueryResponseModel> queryWithHttpInfo(String outBizNo, String enrollId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(outBizNo, enrollId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingRecruitEnrollQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingRecruitEnrollQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 报名详情查询 (asynchronously)
     * 报名详情查询
     * @param outBizNo 外部操作流水号，创建招商报名时传入。由商家/ISV 自定义，仅支持字母、数字、下划线且需保证每次操作唯一。 (optional)
     * @param enrollId 报名ID，此参数和out_biz_no至少传一个，优先取enroll_id (optional)
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
    public okhttp3.Call queryAsync(String outBizNo, String enrollId, final ApiCallback<AlipayMarketingRecruitEnrollQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(outBizNo, enrollId, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingRecruitEnrollQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String outBizNo, String enrollId, final ApiCallback<AlipayMarketingRecruitEnrollQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(outBizNo, enrollId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingRecruitEnrollQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
