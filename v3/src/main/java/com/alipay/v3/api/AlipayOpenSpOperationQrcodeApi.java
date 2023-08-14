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


import com.alipay.v3.model.AlipayOpenSpOperationQrcodeQueryDefaultResponse;
import com.alipay.v3.model.AlipayOpenSpOperationQrcodeQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenSpOperationQrcodeApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenSpOperationQrcodeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenSpOperationQrcodeApi(ApiClient apiClient) {
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
     * @param outBizNo 外部操作流水，由服务商自定义，需确保每次操作唯一。仅支持数字、字母、下划线组合。 (optional)
     * @param operateType 代运营操作类型。取值如下： * ACCOUNT_BIND：账号绑定，仅支持间连商户。 * OPERATION_AUTH：代运营授权，支持间连、直连商户。 (optional)
     * @param merchantNo 支付宝商户号。注意仅支持 2088 开头的间连商户。 若被代运营者是间连商户，则 merchant_no 必填； 若为直连商户，则 merchant_no 和 alipay_account 不能同时为空，都有值优先取 merchant_no。 (optional)
     * @param alipayAccount 支付宝登录账号。通常为手机号或者邮箱。 若被代运营者是间连商户，该字段无需填写。 若为直连商户，则 merchant_no 和 alipay_account 不能同时为空，都有值优先取 merchant_no。 (optional)
     * @param accessProductCode 接入的产品编号。 操作类型为绑定的，填OPENAPI_BIND_DEFAULT; 操作类型为授权的，填OPENAPI_AUTH_DEFAULT (optional)
     * @param isvScenePermissions 场景授权列表结构结构：场景codeA:权限code1,权限code2;场景codeB:权限code1,权限code2; (optional)
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
    public okhttp3.Call queryCall(String outBizNo, String operateType, String merchantNo, String alipayAccount, String accessProductCode, String isvScenePermissions, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/sp/operation/qrcode/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (outBizNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("out_biz_no", outBizNo));
        }

        if (operateType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("operate_type", operateType));
        }

        if (merchantNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("merchant_no", merchantNo));
        }

        if (alipayAccount != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("alipay_account", alipayAccount));
        }

        if (accessProductCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_product_code", accessProductCode));
        }

        if (isvScenePermissions != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("isv_scene_permissions", isvScenePermissions));
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
    private okhttp3.Call queryValidateBeforeCall(String outBizNo, String operateType, String merchantNo, String alipayAccount, String accessProductCode, String isvScenePermissions, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(outBizNo, operateType, merchantNo, alipayAccount, accessProductCode, isvScenePermissions, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询代运营授权或者账号绑定二维码
     * 面向服务商，查询发起代运营授权或者账号绑定的二维码。代间联商户代运营时，推荐使用接口同步返回的recommend_accounts字段中的账号扫码确认。
     * @param outBizNo 外部操作流水，由服务商自定义，需确保每次操作唯一。仅支持数字、字母、下划线组合。 (optional)
     * @param operateType 代运营操作类型。取值如下： * ACCOUNT_BIND：账号绑定，仅支持间连商户。 * OPERATION_AUTH：代运营授权，支持间连、直连商户。 (optional)
     * @param merchantNo 支付宝商户号。注意仅支持 2088 开头的间连商户。 若被代运营者是间连商户，则 merchant_no 必填； 若为直连商户，则 merchant_no 和 alipay_account 不能同时为空，都有值优先取 merchant_no。 (optional)
     * @param alipayAccount 支付宝登录账号。通常为手机号或者邮箱。 若被代运营者是间连商户，该字段无需填写。 若为直连商户，则 merchant_no 和 alipay_account 不能同时为空，都有值优先取 merchant_no。 (optional)
     * @param accessProductCode 接入的产品编号。 操作类型为绑定的，填OPENAPI_BIND_DEFAULT; 操作类型为授权的，填OPENAPI_AUTH_DEFAULT (optional)
     * @param isvScenePermissions 场景授权列表结构结构：场景codeA:权限code1,权限code2;场景codeB:权限code1,权限code2; (optional)
     * @return AlipayOpenSpOperationQrcodeQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenSpOperationQrcodeQueryResponseModel query(String outBizNo, String operateType, String merchantNo, String alipayAccount, String accessProductCode, String isvScenePermissions) throws ApiException {
        ApiResponse<AlipayOpenSpOperationQrcodeQueryResponseModel> localVarResp = queryWithHttpInfo(outBizNo, operateType, merchantNo, alipayAccount, accessProductCode, isvScenePermissions, null);
        return localVarResp.getData();
    }

    public AlipayOpenSpOperationQrcodeQueryResponseModel query(String outBizNo, String operateType, String merchantNo, String alipayAccount, String accessProductCode, String isvScenePermissions, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenSpOperationQrcodeQueryResponseModel> localVarResp = queryWithHttpInfo(outBizNo, operateType, merchantNo, alipayAccount, accessProductCode, isvScenePermissions, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询代运营授权或者账号绑定二维码
     * 面向服务商，查询发起代运营授权或者账号绑定的二维码。代间联商户代运营时，推荐使用接口同步返回的recommend_accounts字段中的账号扫码确认。
     * @param outBizNo 外部操作流水，由服务商自定义，需确保每次操作唯一。仅支持数字、字母、下划线组合。 (optional)
     * @param operateType 代运营操作类型。取值如下： * ACCOUNT_BIND：账号绑定，仅支持间连商户。 * OPERATION_AUTH：代运营授权，支持间连、直连商户。 (optional)
     * @param merchantNo 支付宝商户号。注意仅支持 2088 开头的间连商户。 若被代运营者是间连商户，则 merchant_no 必填； 若为直连商户，则 merchant_no 和 alipay_account 不能同时为空，都有值优先取 merchant_no。 (optional)
     * @param alipayAccount 支付宝登录账号。通常为手机号或者邮箱。 若被代运营者是间连商户，该字段无需填写。 若为直连商户，则 merchant_no 和 alipay_account 不能同时为空，都有值优先取 merchant_no。 (optional)
     * @param accessProductCode 接入的产品编号。 操作类型为绑定的，填OPENAPI_BIND_DEFAULT; 操作类型为授权的，填OPENAPI_AUTH_DEFAULT (optional)
     * @param isvScenePermissions 场景授权列表结构结构：场景codeA:权限code1,权限code2;场景codeB:权限code1,权限code2; (optional)
     * @return ApiResponse&lt;AlipayOpenSpOperationQrcodeQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenSpOperationQrcodeQueryResponseModel> queryWithHttpInfo(String outBizNo, String operateType, String merchantNo, String alipayAccount, String accessProductCode, String isvScenePermissions, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(outBizNo, operateType, merchantNo, alipayAccount, accessProductCode, isvScenePermissions, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenSpOperationQrcodeQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenSpOperationQrcodeQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询代运营授权或者账号绑定二维码 (asynchronously)
     * 面向服务商，查询发起代运营授权或者账号绑定的二维码。代间联商户代运营时，推荐使用接口同步返回的recommend_accounts字段中的账号扫码确认。
     * @param outBizNo 外部操作流水，由服务商自定义，需确保每次操作唯一。仅支持数字、字母、下划线组合。 (optional)
     * @param operateType 代运营操作类型。取值如下： * ACCOUNT_BIND：账号绑定，仅支持间连商户。 * OPERATION_AUTH：代运营授权，支持间连、直连商户。 (optional)
     * @param merchantNo 支付宝商户号。注意仅支持 2088 开头的间连商户。 若被代运营者是间连商户，则 merchant_no 必填； 若为直连商户，则 merchant_no 和 alipay_account 不能同时为空，都有值优先取 merchant_no。 (optional)
     * @param alipayAccount 支付宝登录账号。通常为手机号或者邮箱。 若被代运营者是间连商户，该字段无需填写。 若为直连商户，则 merchant_no 和 alipay_account 不能同时为空，都有值优先取 merchant_no。 (optional)
     * @param accessProductCode 接入的产品编号。 操作类型为绑定的，填OPENAPI_BIND_DEFAULT; 操作类型为授权的，填OPENAPI_AUTH_DEFAULT (optional)
     * @param isvScenePermissions 场景授权列表结构结构：场景codeA:权限code1,权限code2;场景codeB:权限code1,权限code2; (optional)
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
    public okhttp3.Call queryAsync(String outBizNo, String operateType, String merchantNo, String alipayAccount, String accessProductCode, String isvScenePermissions, final ApiCallback<AlipayOpenSpOperationQrcodeQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(outBizNo, operateType, merchantNo, alipayAccount, accessProductCode, isvScenePermissions, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenSpOperationQrcodeQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String outBizNo, String operateType, String merchantNo, String alipayAccount, String accessProductCode, String isvScenePermissions, final ApiCallback<AlipayOpenSpOperationQrcodeQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(outBizNo, operateType, merchantNo, alipayAccount, accessProductCode, isvScenePermissions, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenSpOperationQrcodeQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
