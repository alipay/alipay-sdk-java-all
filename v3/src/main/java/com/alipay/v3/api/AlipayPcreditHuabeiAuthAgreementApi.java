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


import com.alipay.v3.model.AlipayPcreditHuabeiAuthAgreementCloseDefaultResponse;
import com.alipay.v3.model.AlipayPcreditHuabeiAuthAgreementCloseModel;
import com.alipay.v3.model.AlipayPcreditHuabeiAuthAgreementCloseResponseModel;
import com.alipay.v3.model.AlipayPcreditHuabeiAuthAgreementQueryDefaultResponse;
import com.alipay.v3.model.AlipayPcreditHuabeiAuthAgreementQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayPcreditHuabeiAuthAgreementApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayPcreditHuabeiAuthAgreementApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayPcreditHuabeiAuthAgreementApi(ApiClient apiClient) {
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
     * @param alipayPcreditHuabeiAuthAgreementCloseModel  (optional)
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
    public okhttp3.Call closeCall(AlipayPcreditHuabeiAuthAgreementCloseModel alipayPcreditHuabeiAuthAgreementCloseModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayPcreditHuabeiAuthAgreementCloseModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/pcredit/huabei/auth/agreement/close";

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
    private okhttp3.Call closeValidateBeforeCall(AlipayPcreditHuabeiAuthAgreementCloseModel alipayPcreditHuabeiAuthAgreementCloseModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = closeCall(alipayPcreditHuabeiAuthAgreementCloseModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 花芝协议关闭接口
     * 用户已经开通花芝先享后，商户可通过此接口提前关闭协议。
     * @param alipayPcreditHuabeiAuthAgreementCloseModel  (optional)
     * @return AlipayPcreditHuabeiAuthAgreementCloseResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayPcreditHuabeiAuthAgreementCloseResponseModel close(AlipayPcreditHuabeiAuthAgreementCloseModel alipayPcreditHuabeiAuthAgreementCloseModel) throws ApiException {
        ApiResponse<AlipayPcreditHuabeiAuthAgreementCloseResponseModel> localVarResp = closeWithHttpInfo(alipayPcreditHuabeiAuthAgreementCloseModel, null);
        return localVarResp.getData();
    }

    public AlipayPcreditHuabeiAuthAgreementCloseResponseModel close(AlipayPcreditHuabeiAuthAgreementCloseModel alipayPcreditHuabeiAuthAgreementCloseModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayPcreditHuabeiAuthAgreementCloseResponseModel> localVarResp = closeWithHttpInfo(alipayPcreditHuabeiAuthAgreementCloseModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 花芝协议关闭接口
     * 用户已经开通花芝先享后，商户可通过此接口提前关闭协议。
     * @param alipayPcreditHuabeiAuthAgreementCloseModel  (optional)
     * @return ApiResponse&lt;AlipayPcreditHuabeiAuthAgreementCloseResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayPcreditHuabeiAuthAgreementCloseResponseModel> closeWithHttpInfo(AlipayPcreditHuabeiAuthAgreementCloseModel alipayPcreditHuabeiAuthAgreementCloseModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = closeValidateBeforeCall(alipayPcreditHuabeiAuthAgreementCloseModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayPcreditHuabeiAuthAgreementCloseResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayPcreditHuabeiAuthAgreementCloseDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 花芝协议关闭接口 (asynchronously)
     * 用户已经开通花芝先享后，商户可通过此接口提前关闭协议。
     * @param alipayPcreditHuabeiAuthAgreementCloseModel  (optional)
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
    public okhttp3.Call closeAsync(AlipayPcreditHuabeiAuthAgreementCloseModel alipayPcreditHuabeiAuthAgreementCloseModel, final ApiCallback<AlipayPcreditHuabeiAuthAgreementCloseResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = closeValidateBeforeCall(alipayPcreditHuabeiAuthAgreementCloseModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayPcreditHuabeiAuthAgreementCloseResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call closeAsync(AlipayPcreditHuabeiAuthAgreementCloseModel alipayPcreditHuabeiAuthAgreementCloseModel, final ApiCallback<AlipayPcreditHuabeiAuthAgreementCloseResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = closeValidateBeforeCall(alipayPcreditHuabeiAuthAgreementCloseModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayPcreditHuabeiAuthAgreementCloseResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param agreementNo 支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员。传入该参数，会忽略其它所有参数。 (optional)
     * @param alipayUserId 买家在支付宝的用户id (optional)
     * @param openId 买家在支付宝的用户id (optional)
     * @param outSignNo 外部签约号，由商户提供，花芝轻会员协议中标识用户的唯一签约号（确保在商户系统中唯一）。 (optional)
     * @param authScene 花芝轻会员签约场景，商户和支付宝签约时确定。该值需要与系统/页面签约接口调用时传入的值保持一致。 (optional)
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
    public okhttp3.Call queryCall(String agreementNo, String alipayUserId, String openId, String outSignNo, String authScene, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/pcredit/huabei/auth/agreement/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (agreementNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agreement_no", agreementNo));
        }

        if (alipayUserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("alipay_user_id", alipayUserId));
        }

        if (openId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("open_id", openId));
        }

        if (outSignNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("out_sign_no", outSignNo));
        }

        if (authScene != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("auth_scene", authScene));
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
    private okhttp3.Call queryValidateBeforeCall(String agreementNo, String alipayUserId, String openId, String outSignNo, String authScene, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(agreementNo, alipayUserId, openId, outSignNo, authScene, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 花芝轻会员协议查询接口
     * 花芝轻会员协议查询，返回协议的状态。如果协议处于签约状态，同时返回最新的资金池余额。 有两种方式查询。优先使用agreement_no查询；其次是使用(out_sign_no, auth_scene)查询。 如果商户不能保证out_sign_no的唯一性，慎用(out_sign_no, auth_scene)的查询方式，它优先返回仍处于签约状态的协议。
     * @param agreementNo 支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员。传入该参数，会忽略其它所有参数。 (optional)
     * @param alipayUserId 买家在支付宝的用户id (optional)
     * @param openId 买家在支付宝的用户id (optional)
     * @param outSignNo 外部签约号，由商户提供，花芝轻会员协议中标识用户的唯一签约号（确保在商户系统中唯一）。 (optional)
     * @param authScene 花芝轻会员签约场景，商户和支付宝签约时确定。该值需要与系统/页面签约接口调用时传入的值保持一致。 (optional)
     * @return AlipayPcreditHuabeiAuthAgreementQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayPcreditHuabeiAuthAgreementQueryResponseModel query(String agreementNo, String alipayUserId, String openId, String outSignNo, String authScene) throws ApiException {
        ApiResponse<AlipayPcreditHuabeiAuthAgreementQueryResponseModel> localVarResp = queryWithHttpInfo(agreementNo, alipayUserId, openId, outSignNo, authScene, null);
        return localVarResp.getData();
    }

    public AlipayPcreditHuabeiAuthAgreementQueryResponseModel query(String agreementNo, String alipayUserId, String openId, String outSignNo, String authScene, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayPcreditHuabeiAuthAgreementQueryResponseModel> localVarResp = queryWithHttpInfo(agreementNo, alipayUserId, openId, outSignNo, authScene, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 花芝轻会员协议查询接口
     * 花芝轻会员协议查询，返回协议的状态。如果协议处于签约状态，同时返回最新的资金池余额。 有两种方式查询。优先使用agreement_no查询；其次是使用(out_sign_no, auth_scene)查询。 如果商户不能保证out_sign_no的唯一性，慎用(out_sign_no, auth_scene)的查询方式，它优先返回仍处于签约状态的协议。
     * @param agreementNo 支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员。传入该参数，会忽略其它所有参数。 (optional)
     * @param alipayUserId 买家在支付宝的用户id (optional)
     * @param openId 买家在支付宝的用户id (optional)
     * @param outSignNo 外部签约号，由商户提供，花芝轻会员协议中标识用户的唯一签约号（确保在商户系统中唯一）。 (optional)
     * @param authScene 花芝轻会员签约场景，商户和支付宝签约时确定。该值需要与系统/页面签约接口调用时传入的值保持一致。 (optional)
     * @return ApiResponse&lt;AlipayPcreditHuabeiAuthAgreementQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayPcreditHuabeiAuthAgreementQueryResponseModel> queryWithHttpInfo(String agreementNo, String alipayUserId, String openId, String outSignNo, String authScene, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(agreementNo, alipayUserId, openId, outSignNo, authScene, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayPcreditHuabeiAuthAgreementQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayPcreditHuabeiAuthAgreementQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 花芝轻会员协议查询接口 (asynchronously)
     * 花芝轻会员协议查询，返回协议的状态。如果协议处于签约状态，同时返回最新的资金池余额。 有两种方式查询。优先使用agreement_no查询；其次是使用(out_sign_no, auth_scene)查询。 如果商户不能保证out_sign_no的唯一性，慎用(out_sign_no, auth_scene)的查询方式，它优先返回仍处于签约状态的协议。
     * @param agreementNo 支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员。传入该参数，会忽略其它所有参数。 (optional)
     * @param alipayUserId 买家在支付宝的用户id (optional)
     * @param openId 买家在支付宝的用户id (optional)
     * @param outSignNo 外部签约号，由商户提供，花芝轻会员协议中标识用户的唯一签约号（确保在商户系统中唯一）。 (optional)
     * @param authScene 花芝轻会员签约场景，商户和支付宝签约时确定。该值需要与系统/页面签约接口调用时传入的值保持一致。 (optional)
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
    public okhttp3.Call queryAsync(String agreementNo, String alipayUserId, String openId, String outSignNo, String authScene, final ApiCallback<AlipayPcreditHuabeiAuthAgreementQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(agreementNo, alipayUserId, openId, outSignNo, authScene, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayPcreditHuabeiAuthAgreementQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String agreementNo, String alipayUserId, String openId, String outSignNo, String authScene, final ApiCallback<AlipayPcreditHuabeiAuthAgreementQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(agreementNo, alipayUserId, openId, outSignNo, authScene, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayPcreditHuabeiAuthAgreementQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
