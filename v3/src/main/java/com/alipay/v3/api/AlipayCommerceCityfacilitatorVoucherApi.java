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


import com.alipay.v3.model.AlipayCommerceCityfacilitatorVoucherBatchqueryDefaultResponse;
import com.alipay.v3.model.AlipayCommerceCityfacilitatorVoucherBatchqueryModel;
import com.alipay.v3.model.AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel;
import com.alipay.v3.model.AlipayCommerceCityfacilitatorVoucherGenerateDefaultResponse;
import com.alipay.v3.model.AlipayCommerceCityfacilitatorVoucherGenerateModel;
import com.alipay.v3.model.AlipayCommerceCityfacilitatorVoucherGenerateResponseModel;
import com.alipay.v3.model.AlipayCommerceCityfacilitatorVoucherRefundDefaultResponse;
import com.alipay.v3.model.AlipayCommerceCityfacilitatorVoucherRefundModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayCommerceCityfacilitatorVoucherApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayCommerceCityfacilitatorVoucherApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayCommerceCityfacilitatorVoucherApi(ApiClient apiClient) {
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
     * @param alipayCommerceCityfacilitatorVoucherBatchqueryModel  (optional)
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
    public okhttp3.Call batchqueryCall(AlipayCommerceCityfacilitatorVoucherBatchqueryModel alipayCommerceCityfacilitatorVoucherBatchqueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayCommerceCityfacilitatorVoucherBatchqueryModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/commerce/cityfacilitator/voucher/batchquery";

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
    private okhttp3.Call batchqueryValidateBeforeCall(AlipayCommerceCityfacilitatorVoucherBatchqueryModel alipayCommerceCityfacilitatorVoucherBatchqueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = batchqueryCall(alipayCommerceCityfacilitatorVoucherBatchqueryModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 地铁购票订单批量查询
     * 商户APP调该接口批量查询订单状态
     * @param alipayCommerceCityfacilitatorVoucherBatchqueryModel  (optional)
     * @return AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel batchquery(AlipayCommerceCityfacilitatorVoucherBatchqueryModel alipayCommerceCityfacilitatorVoucherBatchqueryModel) throws ApiException {
        ApiResponse<AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(alipayCommerceCityfacilitatorVoucherBatchqueryModel, null);
        return localVarResp.getData();
    }

    public AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel batchquery(AlipayCommerceCityfacilitatorVoucherBatchqueryModel alipayCommerceCityfacilitatorVoucherBatchqueryModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(alipayCommerceCityfacilitatorVoucherBatchqueryModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 地铁购票订单批量查询
     * 商户APP调该接口批量查询订单状态
     * @param alipayCommerceCityfacilitatorVoucherBatchqueryModel  (optional)
     * @return ApiResponse&lt;AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel> batchqueryWithHttpInfo(AlipayCommerceCityfacilitatorVoucherBatchqueryModel alipayCommerceCityfacilitatorVoucherBatchqueryModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayCommerceCityfacilitatorVoucherBatchqueryModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayCommerceCityfacilitatorVoucherBatchqueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 地铁购票订单批量查询 (asynchronously)
     * 商户APP调该接口批量查询订单状态
     * @param alipayCommerceCityfacilitatorVoucherBatchqueryModel  (optional)
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
    public okhttp3.Call batchqueryAsync(AlipayCommerceCityfacilitatorVoucherBatchqueryModel alipayCommerceCityfacilitatorVoucherBatchqueryModel, final ApiCallback<AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayCommerceCityfacilitatorVoucherBatchqueryModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call batchqueryAsync(AlipayCommerceCityfacilitatorVoucherBatchqueryModel alipayCommerceCityfacilitatorVoucherBatchqueryModel, final ApiCallback<AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayCommerceCityfacilitatorVoucherBatchqueryModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for generate
     * @param alipayCommerceCityfacilitatorVoucherGenerateModel  (optional)
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
    public okhttp3.Call generateCall(AlipayCommerceCityfacilitatorVoucherGenerateModel alipayCommerceCityfacilitatorVoucherGenerateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayCommerceCityfacilitatorVoucherGenerateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/commerce/cityfacilitator/voucher/generate";

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
    private okhttp3.Call generateValidateBeforeCall(AlipayCommerceCityfacilitatorVoucherGenerateModel alipayCommerceCityfacilitatorVoucherGenerateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = generateCall(alipayCommerceCityfacilitatorVoucherGenerateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 地铁购票核销码发码
     * 商户APP调快捷支付付款后，获取地铁购票的核销码
     * @param alipayCommerceCityfacilitatorVoucherGenerateModel  (optional)
     * @return AlipayCommerceCityfacilitatorVoucherGenerateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayCommerceCityfacilitatorVoucherGenerateResponseModel generate(AlipayCommerceCityfacilitatorVoucherGenerateModel alipayCommerceCityfacilitatorVoucherGenerateModel) throws ApiException {
        ApiResponse<AlipayCommerceCityfacilitatorVoucherGenerateResponseModel> localVarResp = generateWithHttpInfo(alipayCommerceCityfacilitatorVoucherGenerateModel, null);
        return localVarResp.getData();
    }

    public AlipayCommerceCityfacilitatorVoucherGenerateResponseModel generate(AlipayCommerceCityfacilitatorVoucherGenerateModel alipayCommerceCityfacilitatorVoucherGenerateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayCommerceCityfacilitatorVoucherGenerateResponseModel> localVarResp = generateWithHttpInfo(alipayCommerceCityfacilitatorVoucherGenerateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 地铁购票核销码发码
     * 商户APP调快捷支付付款后，获取地铁购票的核销码
     * @param alipayCommerceCityfacilitatorVoucherGenerateModel  (optional)
     * @return ApiResponse&lt;AlipayCommerceCityfacilitatorVoucherGenerateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayCommerceCityfacilitatorVoucherGenerateResponseModel> generateWithHttpInfo(AlipayCommerceCityfacilitatorVoucherGenerateModel alipayCommerceCityfacilitatorVoucherGenerateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = generateValidateBeforeCall(alipayCommerceCityfacilitatorVoucherGenerateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayCommerceCityfacilitatorVoucherGenerateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayCommerceCityfacilitatorVoucherGenerateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 地铁购票核销码发码 (asynchronously)
     * 商户APP调快捷支付付款后，获取地铁购票的核销码
     * @param alipayCommerceCityfacilitatorVoucherGenerateModel  (optional)
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
    public okhttp3.Call generateAsync(AlipayCommerceCityfacilitatorVoucherGenerateModel alipayCommerceCityfacilitatorVoucherGenerateModel, final ApiCallback<AlipayCommerceCityfacilitatorVoucherGenerateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = generateValidateBeforeCall(alipayCommerceCityfacilitatorVoucherGenerateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayCommerceCityfacilitatorVoucherGenerateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call generateAsync(AlipayCommerceCityfacilitatorVoucherGenerateModel alipayCommerceCityfacilitatorVoucherGenerateModel, final ApiCallback<AlipayCommerceCityfacilitatorVoucherGenerateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = generateValidateBeforeCall(alipayCommerceCityfacilitatorVoucherGenerateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayCommerceCityfacilitatorVoucherGenerateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for refund
     * @param alipayCommerceCityfacilitatorVoucherRefundModel  (optional)
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
    public okhttp3.Call refundCall(AlipayCommerceCityfacilitatorVoucherRefundModel alipayCommerceCityfacilitatorVoucherRefundModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayCommerceCityfacilitatorVoucherRefundModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/commerce/cityfacilitator/voucher/refund";

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
    private okhttp3.Call refundValidateBeforeCall(AlipayCommerceCityfacilitatorVoucherRefundModel alipayCommerceCityfacilitatorVoucherRefundModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = refundCall(alipayCommerceCityfacilitatorVoucherRefundModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 地铁购票发码退款
     * 地铁购票，商户发码后，调该接口从中间户退款
     * @param alipayCommerceCityfacilitatorVoucherRefundModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object refund(AlipayCommerceCityfacilitatorVoucherRefundModel alipayCommerceCityfacilitatorVoucherRefundModel) throws ApiException {
        ApiResponse<Object> localVarResp = refundWithHttpInfo(alipayCommerceCityfacilitatorVoucherRefundModel, null);
        return localVarResp.getData();
    }

    public Object refund(AlipayCommerceCityfacilitatorVoucherRefundModel alipayCommerceCityfacilitatorVoucherRefundModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = refundWithHttpInfo(alipayCommerceCityfacilitatorVoucherRefundModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 地铁购票发码退款
     * 地铁购票，商户发码后，调该接口从中间户退款
     * @param alipayCommerceCityfacilitatorVoucherRefundModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> refundWithHttpInfo(AlipayCommerceCityfacilitatorVoucherRefundModel alipayCommerceCityfacilitatorVoucherRefundModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = refundValidateBeforeCall(alipayCommerceCityfacilitatorVoucherRefundModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayCommerceCityfacilitatorVoucherRefundDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 地铁购票发码退款 (asynchronously)
     * 地铁购票，商户发码后，调该接口从中间户退款
     * @param alipayCommerceCityfacilitatorVoucherRefundModel  (optional)
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
    public okhttp3.Call refundAsync(AlipayCommerceCityfacilitatorVoucherRefundModel alipayCommerceCityfacilitatorVoucherRefundModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = refundValidateBeforeCall(alipayCommerceCityfacilitatorVoucherRefundModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call refundAsync(AlipayCommerceCityfacilitatorVoucherRefundModel alipayCommerceCityfacilitatorVoucherRefundModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = refundValidateBeforeCall(alipayCommerceCityfacilitatorVoucherRefundModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
