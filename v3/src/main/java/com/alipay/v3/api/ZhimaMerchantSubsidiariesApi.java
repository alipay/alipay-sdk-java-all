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


import com.alipay.v3.model.ZhimaMerchantSubsidiariesApplyDefaultResponse;
import com.alipay.v3.model.ZhimaMerchantSubsidiariesApplyModel;
import com.alipay.v3.model.ZhimaMerchantSubsidiariesApplyResponseModel;
import com.alipay.v3.model.ZhimaMerchantSubsidiariesCloseDefaultResponse;
import com.alipay.v3.model.ZhimaMerchantSubsidiariesCloseModel;
import com.alipay.v3.model.ZhimaMerchantSubsidiariesCloseResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ZhimaMerchantSubsidiariesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ZhimaMerchantSubsidiariesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ZhimaMerchantSubsidiariesApi(ApiClient apiClient) {
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
     * Build call for apply
     * @param zhimaMerchantSubsidiariesApplyModel  (optional)
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
    public okhttp3.Call applyCall(ZhimaMerchantSubsidiariesApplyModel zhimaMerchantSubsidiariesApplyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : zhimaMerchantSubsidiariesApplyModel;

        // create path and map variables
        String localVarPath = "/v3/zhima/merchant/subsidiaries/apply";

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
    private okhttp3.Call applyValidateBeforeCall(ZhimaMerchantSubsidiariesApplyModel zhimaMerchantSubsidiariesApplyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = applyCall(zhimaMerchantSubsidiariesApplyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 子商户信息添加
     * 子商户信息添加
     * @param zhimaMerchantSubsidiariesApplyModel  (optional)
     * @return ZhimaMerchantSubsidiariesApplyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ZhimaMerchantSubsidiariesApplyResponseModel apply(ZhimaMerchantSubsidiariesApplyModel zhimaMerchantSubsidiariesApplyModel) throws ApiException {
        ApiResponse<ZhimaMerchantSubsidiariesApplyResponseModel> localVarResp = applyWithHttpInfo(zhimaMerchantSubsidiariesApplyModel, null);
        return localVarResp.getData();
    }

    public ZhimaMerchantSubsidiariesApplyResponseModel apply(ZhimaMerchantSubsidiariesApplyModel zhimaMerchantSubsidiariesApplyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<ZhimaMerchantSubsidiariesApplyResponseModel> localVarResp = applyWithHttpInfo(zhimaMerchantSubsidiariesApplyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 子商户信息添加
     * 子商户信息添加
     * @param zhimaMerchantSubsidiariesApplyModel  (optional)
     * @return ApiResponse&lt;ZhimaMerchantSubsidiariesApplyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ZhimaMerchantSubsidiariesApplyResponseModel> applyWithHttpInfo(ZhimaMerchantSubsidiariesApplyModel zhimaMerchantSubsidiariesApplyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = applyValidateBeforeCall(zhimaMerchantSubsidiariesApplyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<ZhimaMerchantSubsidiariesApplyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<ZhimaMerchantSubsidiariesApplyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 子商户信息添加 (asynchronously)
     * 子商户信息添加
     * @param zhimaMerchantSubsidiariesApplyModel  (optional)
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
    public okhttp3.Call applyAsync(ZhimaMerchantSubsidiariesApplyModel zhimaMerchantSubsidiariesApplyModel, final ApiCallback<ZhimaMerchantSubsidiariesApplyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = applyValidateBeforeCall(zhimaMerchantSubsidiariesApplyModel, _callback, null);
        Type localVarReturnType = new TypeToken<ZhimaMerchantSubsidiariesApplyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call applyAsync(ZhimaMerchantSubsidiariesApplyModel zhimaMerchantSubsidiariesApplyModel, final ApiCallback<ZhimaMerchantSubsidiariesApplyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = applyValidateBeforeCall(zhimaMerchantSubsidiariesApplyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<ZhimaMerchantSubsidiariesApplyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for close
     * @param zhimaMerchantSubsidiariesCloseModel  (optional)
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
    public okhttp3.Call closeCall(ZhimaMerchantSubsidiariesCloseModel zhimaMerchantSubsidiariesCloseModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : zhimaMerchantSubsidiariesCloseModel;

        // create path and map variables
        String localVarPath = "/v3/zhima/merchant/subsidiaries/close";

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
    private okhttp3.Call closeValidateBeforeCall(ZhimaMerchantSubsidiariesCloseModel zhimaMerchantSubsidiariesCloseModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = closeCall(zhimaMerchantSubsidiariesCloseModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 关闭子商户信息工单
     * 关闭子商户信息工单
     * @param zhimaMerchantSubsidiariesCloseModel  (optional)
     * @return ZhimaMerchantSubsidiariesCloseResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ZhimaMerchantSubsidiariesCloseResponseModel close(ZhimaMerchantSubsidiariesCloseModel zhimaMerchantSubsidiariesCloseModel) throws ApiException {
        ApiResponse<ZhimaMerchantSubsidiariesCloseResponseModel> localVarResp = closeWithHttpInfo(zhimaMerchantSubsidiariesCloseModel, null);
        return localVarResp.getData();
    }

    public ZhimaMerchantSubsidiariesCloseResponseModel close(ZhimaMerchantSubsidiariesCloseModel zhimaMerchantSubsidiariesCloseModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<ZhimaMerchantSubsidiariesCloseResponseModel> localVarResp = closeWithHttpInfo(zhimaMerchantSubsidiariesCloseModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 关闭子商户信息工单
     * 关闭子商户信息工单
     * @param zhimaMerchantSubsidiariesCloseModel  (optional)
     * @return ApiResponse&lt;ZhimaMerchantSubsidiariesCloseResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ZhimaMerchantSubsidiariesCloseResponseModel> closeWithHttpInfo(ZhimaMerchantSubsidiariesCloseModel zhimaMerchantSubsidiariesCloseModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = closeValidateBeforeCall(zhimaMerchantSubsidiariesCloseModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<ZhimaMerchantSubsidiariesCloseResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<ZhimaMerchantSubsidiariesCloseDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 关闭子商户信息工单 (asynchronously)
     * 关闭子商户信息工单
     * @param zhimaMerchantSubsidiariesCloseModel  (optional)
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
    public okhttp3.Call closeAsync(ZhimaMerchantSubsidiariesCloseModel zhimaMerchantSubsidiariesCloseModel, final ApiCallback<ZhimaMerchantSubsidiariesCloseResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = closeValidateBeforeCall(zhimaMerchantSubsidiariesCloseModel, _callback, null);
        Type localVarReturnType = new TypeToken<ZhimaMerchantSubsidiariesCloseResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call closeAsync(ZhimaMerchantSubsidiariesCloseModel zhimaMerchantSubsidiariesCloseModel, final ApiCallback<ZhimaMerchantSubsidiariesCloseResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = closeValidateBeforeCall(zhimaMerchantSubsidiariesCloseModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<ZhimaMerchantSubsidiariesCloseResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
