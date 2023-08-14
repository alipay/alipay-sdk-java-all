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


import com.alipay.v3.model.AlipayMarketingActivityVoucherpackageBatchqueryDefaultResponse;
import com.alipay.v3.model.AlipayMarketingActivityVoucherpackageBatchqueryModel;
import com.alipay.v3.model.AlipayMarketingActivityVoucherpackageBatchqueryResponseModel;
import com.alipay.v3.model.AlipayMarketingActivityVoucherpackageConsultDefaultResponse;
import com.alipay.v3.model.AlipayMarketingActivityVoucherpackageConsultModel;
import com.alipay.v3.model.AlipayMarketingActivityVoucherpackageConsultResponseModel;
import com.alipay.v3.model.AlipayMarketingActivityVoucherpackageQueryDefaultResponse;
import com.alipay.v3.model.AlipayMarketingActivityVoucherpackageQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayMarketingActivityVoucherpackageApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayMarketingActivityVoucherpackageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayMarketingActivityVoucherpackageApi(ApiClient apiClient) {
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
     * Build call for batchquery
     * @param alipayMarketingActivityVoucherpackageBatchqueryModel  (optional)
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
    public okhttp3.Call batchqueryCall(AlipayMarketingActivityVoucherpackageBatchqueryModel alipayMarketingActivityVoucherpackageBatchqueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayMarketingActivityVoucherpackageBatchqueryModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/marketing/activity/voucherpackage/batchquery";

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
    private okhttp3.Call batchqueryValidateBeforeCall(AlipayMarketingActivityVoucherpackageBatchqueryModel alipayMarketingActivityVoucherpackageBatchqueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = batchqueryCall(alipayMarketingActivityVoucherpackageBatchqueryModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 券包批量查询
     * 券包批量查询
     * @param alipayMarketingActivityVoucherpackageBatchqueryModel  (optional)
     * @return AlipayMarketingActivityVoucherpackageBatchqueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingActivityVoucherpackageBatchqueryResponseModel batchquery(AlipayMarketingActivityVoucherpackageBatchqueryModel alipayMarketingActivityVoucherpackageBatchqueryModel) throws ApiException {
        ApiResponse<AlipayMarketingActivityVoucherpackageBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(alipayMarketingActivityVoucherpackageBatchqueryModel, null);
        return localVarResp.getData();
    }

    public AlipayMarketingActivityVoucherpackageBatchqueryResponseModel batchquery(AlipayMarketingActivityVoucherpackageBatchqueryModel alipayMarketingActivityVoucherpackageBatchqueryModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingActivityVoucherpackageBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(alipayMarketingActivityVoucherpackageBatchqueryModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 券包批量查询
     * 券包批量查询
     * @param alipayMarketingActivityVoucherpackageBatchqueryModel  (optional)
     * @return ApiResponse&lt;AlipayMarketingActivityVoucherpackageBatchqueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingActivityVoucherpackageBatchqueryResponseModel> batchqueryWithHttpInfo(AlipayMarketingActivityVoucherpackageBatchqueryModel alipayMarketingActivityVoucherpackageBatchqueryModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayMarketingActivityVoucherpackageBatchqueryModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingActivityVoucherpackageBatchqueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingActivityVoucherpackageBatchqueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 券包批量查询 (asynchronously)
     * 券包批量查询
     * @param alipayMarketingActivityVoucherpackageBatchqueryModel  (optional)
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
    public okhttp3.Call batchqueryAsync(AlipayMarketingActivityVoucherpackageBatchqueryModel alipayMarketingActivityVoucherpackageBatchqueryModel, final ApiCallback<AlipayMarketingActivityVoucherpackageBatchqueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayMarketingActivityVoucherpackageBatchqueryModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityVoucherpackageBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call batchqueryAsync(AlipayMarketingActivityVoucherpackageBatchqueryModel alipayMarketingActivityVoucherpackageBatchqueryModel, final ApiCallback<AlipayMarketingActivityVoucherpackageBatchqueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayMarketingActivityVoucherpackageBatchqueryModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityVoucherpackageBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for consult
     * @param authToken 用户授权令牌 (optional)
     * @param alipayMarketingActivityVoucherpackageConsultModel  (optional)
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
    public okhttp3.Call consultCall(String authToken, AlipayMarketingActivityVoucherpackageConsultModel alipayMarketingActivityVoucherpackageConsultModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayMarketingActivityVoucherpackageConsultModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/marketing/activity/voucherpackage/consult";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("auth_token", authToken));
        }

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
    private okhttp3.Call consultValidateBeforeCall(String authToken, AlipayMarketingActivityVoucherpackageConsultModel alipayMarketingActivityVoucherpackageConsultModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = consultCall(authToken, alipayMarketingActivityVoucherpackageConsultModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 券包购买咨询
     * 券包购买咨询，咨询当前用户是否可以购买指定的券包
     * @param authToken 用户授权令牌 (optional)
     * @param alipayMarketingActivityVoucherpackageConsultModel  (optional)
     * @return AlipayMarketingActivityVoucherpackageConsultResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingActivityVoucherpackageConsultResponseModel consult(String authToken, AlipayMarketingActivityVoucherpackageConsultModel alipayMarketingActivityVoucherpackageConsultModel) throws ApiException {
        ApiResponse<AlipayMarketingActivityVoucherpackageConsultResponseModel> localVarResp = consultWithHttpInfo(authToken, alipayMarketingActivityVoucherpackageConsultModel, null);
        return localVarResp.getData();
    }

    public AlipayMarketingActivityVoucherpackageConsultResponseModel consult(String authToken, AlipayMarketingActivityVoucherpackageConsultModel alipayMarketingActivityVoucherpackageConsultModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingActivityVoucherpackageConsultResponseModel> localVarResp = consultWithHttpInfo(authToken, alipayMarketingActivityVoucherpackageConsultModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 券包购买咨询
     * 券包购买咨询，咨询当前用户是否可以购买指定的券包
     * @param authToken 用户授权令牌 (optional)
     * @param alipayMarketingActivityVoucherpackageConsultModel  (optional)
     * @return ApiResponse&lt;AlipayMarketingActivityVoucherpackageConsultResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingActivityVoucherpackageConsultResponseModel> consultWithHttpInfo(String authToken, AlipayMarketingActivityVoucherpackageConsultModel alipayMarketingActivityVoucherpackageConsultModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = consultValidateBeforeCall(authToken, alipayMarketingActivityVoucherpackageConsultModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingActivityVoucherpackageConsultResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingActivityVoucherpackageConsultDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 券包购买咨询 (asynchronously)
     * 券包购买咨询，咨询当前用户是否可以购买指定的券包
     * @param authToken 用户授权令牌 (optional)
     * @param alipayMarketingActivityVoucherpackageConsultModel  (optional)
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
    public okhttp3.Call consultAsync(String authToken, AlipayMarketingActivityVoucherpackageConsultModel alipayMarketingActivityVoucherpackageConsultModel, final ApiCallback<AlipayMarketingActivityVoucherpackageConsultResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = consultValidateBeforeCall(authToken, alipayMarketingActivityVoucherpackageConsultModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityVoucherpackageConsultResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call consultAsync(String authToken, AlipayMarketingActivityVoucherpackageConsultModel alipayMarketingActivityVoucherpackageConsultModel, final ApiCallback<AlipayMarketingActivityVoucherpackageConsultResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = consultValidateBeforeCall(authToken, alipayMarketingActivityVoucherpackageConsultModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityVoucherpackageConsultResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param voucherPackageId 券包id (optional)
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
    public okhttp3.Call queryCall(String voucherPackageId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/marketing/activity/voucherpackage/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (voucherPackageId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("voucher_package_id", voucherPackageId));
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
    private okhttp3.Call queryValidateBeforeCall(String voucherPackageId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(voucherPackageId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 券包详情查询
     * 查询券包详情，包括券包信息和券包下面券信息
     * @param voucherPackageId 券包id (optional)
     * @return AlipayMarketingActivityVoucherpackageQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayMarketingActivityVoucherpackageQueryResponseModel query(String voucherPackageId) throws ApiException {
        ApiResponse<AlipayMarketingActivityVoucherpackageQueryResponseModel> localVarResp = queryWithHttpInfo(voucherPackageId, null);
        return localVarResp.getData();
    }

    public AlipayMarketingActivityVoucherpackageQueryResponseModel query(String voucherPackageId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayMarketingActivityVoucherpackageQueryResponseModel> localVarResp = queryWithHttpInfo(voucherPackageId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 券包详情查询
     * 查询券包详情，包括券包信息和券包下面券信息
     * @param voucherPackageId 券包id (optional)
     * @return ApiResponse&lt;AlipayMarketingActivityVoucherpackageQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayMarketingActivityVoucherpackageQueryResponseModel> queryWithHttpInfo(String voucherPackageId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(voucherPackageId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayMarketingActivityVoucherpackageQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayMarketingActivityVoucherpackageQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 券包详情查询 (asynchronously)
     * 查询券包详情，包括券包信息和券包下面券信息
     * @param voucherPackageId 券包id (optional)
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
    public okhttp3.Call queryAsync(String voucherPackageId, final ApiCallback<AlipayMarketingActivityVoucherpackageQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(voucherPackageId, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityVoucherpackageQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String voucherPackageId, final ApiCallback<AlipayMarketingActivityVoucherpackageQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(voucherPackageId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayMarketingActivityVoucherpackageQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
