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


import com.alipay.v3.model.AlipayFundAccountbookNotifyQueryDefaultResponse;
import com.alipay.v3.model.AlipayFundAccountbookNotifyQueryResponseModel;
import com.alipay.v3.model.AlipayFundAccountbookNotifySubscribeDefaultResponse;
import com.alipay.v3.model.AlipayFundAccountbookNotifySubscribeModel;
import com.alipay.v3.model.AlipayFundAccountbookNotifySubscribeResponseModel;
import com.alipay.v3.model.AlipayFundAccountbookNotifyUnsubscribeDefaultResponse;
import com.alipay.v3.model.AlipayFundAccountbookNotifyUnsubscribeModel;
import com.alipay.v3.model.AlipayFundAccountbookNotifyUnsubscribeResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayFundAccountbookNotifyApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayFundAccountbookNotifyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayFundAccountbookNotifyApi(ApiClient apiClient) {
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
     * Build call for query
     * @param productCode 产品码。固定为SATF_FUND_BOOK (optional)
     * @param bizScene 场景码。固定为DEFAULT (optional)
     * @param accountBookId 记账本ID (optional)
     * @param agreementNo 协议号。 若是基于协议的记账本，则agreement_no必传； 若是自创建的记账本，则agreement_no不传； (optional)
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
    public okhttp3.Call queryCall(String productCode, String bizScene, String accountBookId, String agreementNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/fund/accountbook/notify/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (productCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("product_code", productCode));
        }

        if (bizScene != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("biz_scene", bizScene));
        }

        if (accountBookId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_book_id", accountBookId));
        }

        if (agreementNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agreement_no", agreementNo));
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
    private okhttp3.Call queryValidateBeforeCall(String productCode, String bizScene, String accountBookId, String agreementNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(productCode, bizScene, accountBookId, agreementNo, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 记账本通知订阅关系查询接口
     * ISV通过此接口查询指定记账本的入金和出金通知的订阅关系
     * @param productCode 产品码。固定为SATF_FUND_BOOK (optional)
     * @param bizScene 场景码。固定为DEFAULT (optional)
     * @param accountBookId 记账本ID (optional)
     * @param agreementNo 协议号。 若是基于协议的记账本，则agreement_no必传； 若是自创建的记账本，则agreement_no不传； (optional)
     * @return AlipayFundAccountbookNotifyQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayFundAccountbookNotifyQueryResponseModel query(String productCode, String bizScene, String accountBookId, String agreementNo) throws ApiException {
        ApiResponse<AlipayFundAccountbookNotifyQueryResponseModel> localVarResp = queryWithHttpInfo(productCode, bizScene, accountBookId, agreementNo, null);
        return localVarResp.getData();
    }

    public AlipayFundAccountbookNotifyQueryResponseModel query(String productCode, String bizScene, String accountBookId, String agreementNo, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayFundAccountbookNotifyQueryResponseModel> localVarResp = queryWithHttpInfo(productCode, bizScene, accountBookId, agreementNo, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 记账本通知订阅关系查询接口
     * ISV通过此接口查询指定记账本的入金和出金通知的订阅关系
     * @param productCode 产品码。固定为SATF_FUND_BOOK (optional)
     * @param bizScene 场景码。固定为DEFAULT (optional)
     * @param accountBookId 记账本ID (optional)
     * @param agreementNo 协议号。 若是基于协议的记账本，则agreement_no必传； 若是自创建的记账本，则agreement_no不传； (optional)
     * @return ApiResponse&lt;AlipayFundAccountbookNotifyQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayFundAccountbookNotifyQueryResponseModel> queryWithHttpInfo(String productCode, String bizScene, String accountBookId, String agreementNo, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(productCode, bizScene, accountBookId, agreementNo, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayFundAccountbookNotifyQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayFundAccountbookNotifyQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 记账本通知订阅关系查询接口 (asynchronously)
     * ISV通过此接口查询指定记账本的入金和出金通知的订阅关系
     * @param productCode 产品码。固定为SATF_FUND_BOOK (optional)
     * @param bizScene 场景码。固定为DEFAULT (optional)
     * @param accountBookId 记账本ID (optional)
     * @param agreementNo 协议号。 若是基于协议的记账本，则agreement_no必传； 若是自创建的记账本，则agreement_no不传； (optional)
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
    public okhttp3.Call queryAsync(String productCode, String bizScene, String accountBookId, String agreementNo, final ApiCallback<AlipayFundAccountbookNotifyQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(productCode, bizScene, accountBookId, agreementNo, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayFundAccountbookNotifyQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String productCode, String bizScene, String accountBookId, String agreementNo, final ApiCallback<AlipayFundAccountbookNotifyQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(productCode, bizScene, accountBookId, agreementNo, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayFundAccountbookNotifyQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for subscribe
     * @param alipayFundAccountbookNotifySubscribeModel  (optional)
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
    public okhttp3.Call subscribeCall(AlipayFundAccountbookNotifySubscribeModel alipayFundAccountbookNotifySubscribeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayFundAccountbookNotifySubscribeModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/fund/accountbook/notify/subscribe";

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
    private okhttp3.Call subscribeValidateBeforeCall(AlipayFundAccountbookNotifySubscribeModel alipayFundAccountbookNotifySubscribeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = subscribeCall(alipayFundAccountbookNotifySubscribeModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 记账本通知订阅接口
     * ISV通过此接口订阅指定记账本的入金和出金通知。目前只有非OpenAPI方式的充值通知（比如大额来账、贷款入金）
     * @param alipayFundAccountbookNotifySubscribeModel  (optional)
     * @return AlipayFundAccountbookNotifySubscribeResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayFundAccountbookNotifySubscribeResponseModel subscribe(AlipayFundAccountbookNotifySubscribeModel alipayFundAccountbookNotifySubscribeModel) throws ApiException {
        ApiResponse<AlipayFundAccountbookNotifySubscribeResponseModel> localVarResp = subscribeWithHttpInfo(alipayFundAccountbookNotifySubscribeModel, null);
        return localVarResp.getData();
    }

    public AlipayFundAccountbookNotifySubscribeResponseModel subscribe(AlipayFundAccountbookNotifySubscribeModel alipayFundAccountbookNotifySubscribeModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayFundAccountbookNotifySubscribeResponseModel> localVarResp = subscribeWithHttpInfo(alipayFundAccountbookNotifySubscribeModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 记账本通知订阅接口
     * ISV通过此接口订阅指定记账本的入金和出金通知。目前只有非OpenAPI方式的充值通知（比如大额来账、贷款入金）
     * @param alipayFundAccountbookNotifySubscribeModel  (optional)
     * @return ApiResponse&lt;AlipayFundAccountbookNotifySubscribeResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayFundAccountbookNotifySubscribeResponseModel> subscribeWithHttpInfo(AlipayFundAccountbookNotifySubscribeModel alipayFundAccountbookNotifySubscribeModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = subscribeValidateBeforeCall(alipayFundAccountbookNotifySubscribeModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayFundAccountbookNotifySubscribeResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayFundAccountbookNotifySubscribeDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 记账本通知订阅接口 (asynchronously)
     * ISV通过此接口订阅指定记账本的入金和出金通知。目前只有非OpenAPI方式的充值通知（比如大额来账、贷款入金）
     * @param alipayFundAccountbookNotifySubscribeModel  (optional)
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
    public okhttp3.Call subscribeAsync(AlipayFundAccountbookNotifySubscribeModel alipayFundAccountbookNotifySubscribeModel, final ApiCallback<AlipayFundAccountbookNotifySubscribeResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = subscribeValidateBeforeCall(alipayFundAccountbookNotifySubscribeModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayFundAccountbookNotifySubscribeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call subscribeAsync(AlipayFundAccountbookNotifySubscribeModel alipayFundAccountbookNotifySubscribeModel, final ApiCallback<AlipayFundAccountbookNotifySubscribeResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = subscribeValidateBeforeCall(alipayFundAccountbookNotifySubscribeModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayFundAccountbookNotifySubscribeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for unsubscribe
     * @param alipayFundAccountbookNotifyUnsubscribeModel  (optional)
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
    public okhttp3.Call unsubscribeCall(AlipayFundAccountbookNotifyUnsubscribeModel alipayFundAccountbookNotifyUnsubscribeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayFundAccountbookNotifyUnsubscribeModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/fund/accountbook/notify/unsubscribe";

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
    private okhttp3.Call unsubscribeValidateBeforeCall(AlipayFundAccountbookNotifyUnsubscribeModel alipayFundAccountbookNotifyUnsubscribeModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = unsubscribeCall(alipayFundAccountbookNotifyUnsubscribeModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 记账本通知取消订阅接口
     * ISV通过此接口取消订阅指定记账本的入金和出金通知
     * @param alipayFundAccountbookNotifyUnsubscribeModel  (optional)
     * @return AlipayFundAccountbookNotifyUnsubscribeResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayFundAccountbookNotifyUnsubscribeResponseModel unsubscribe(AlipayFundAccountbookNotifyUnsubscribeModel alipayFundAccountbookNotifyUnsubscribeModel) throws ApiException {
        ApiResponse<AlipayFundAccountbookNotifyUnsubscribeResponseModel> localVarResp = unsubscribeWithHttpInfo(alipayFundAccountbookNotifyUnsubscribeModel, null);
        return localVarResp.getData();
    }

    public AlipayFundAccountbookNotifyUnsubscribeResponseModel unsubscribe(AlipayFundAccountbookNotifyUnsubscribeModel alipayFundAccountbookNotifyUnsubscribeModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayFundAccountbookNotifyUnsubscribeResponseModel> localVarResp = unsubscribeWithHttpInfo(alipayFundAccountbookNotifyUnsubscribeModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 记账本通知取消订阅接口
     * ISV通过此接口取消订阅指定记账本的入金和出金通知
     * @param alipayFundAccountbookNotifyUnsubscribeModel  (optional)
     * @return ApiResponse&lt;AlipayFundAccountbookNotifyUnsubscribeResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayFundAccountbookNotifyUnsubscribeResponseModel> unsubscribeWithHttpInfo(AlipayFundAccountbookNotifyUnsubscribeModel alipayFundAccountbookNotifyUnsubscribeModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = unsubscribeValidateBeforeCall(alipayFundAccountbookNotifyUnsubscribeModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayFundAccountbookNotifyUnsubscribeResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayFundAccountbookNotifyUnsubscribeDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 记账本通知取消订阅接口 (asynchronously)
     * ISV通过此接口取消订阅指定记账本的入金和出金通知
     * @param alipayFundAccountbookNotifyUnsubscribeModel  (optional)
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
    public okhttp3.Call unsubscribeAsync(AlipayFundAccountbookNotifyUnsubscribeModel alipayFundAccountbookNotifyUnsubscribeModel, final ApiCallback<AlipayFundAccountbookNotifyUnsubscribeResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = unsubscribeValidateBeforeCall(alipayFundAccountbookNotifyUnsubscribeModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayFundAccountbookNotifyUnsubscribeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call unsubscribeAsync(AlipayFundAccountbookNotifyUnsubscribeModel alipayFundAccountbookNotifyUnsubscribeModel, final ApiCallback<AlipayFundAccountbookNotifyUnsubscribeResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = unsubscribeValidateBeforeCall(alipayFundAccountbookNotifyUnsubscribeModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayFundAccountbookNotifyUnsubscribeResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
