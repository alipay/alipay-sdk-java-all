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


import com.alipay.v3.model.AlipayCommerceEcEnterpriseAddressAddDefaultResponse;
import com.alipay.v3.model.AlipayCommerceEcEnterpriseAddressAddModel;
import com.alipay.v3.model.AlipayCommerceEcEnterpriseAddressAddResponseModel;
import com.alipay.v3.model.AlipayCommerceEcEnterpriseAddressModifyDefaultResponse;
import com.alipay.v3.model.AlipayCommerceEcEnterpriseAddressModifyModel;
import com.alipay.v3.model.AlipayCommerceEcEnterpriseAddressModifyResponseModel;
import com.alipay.v3.model.AlipayCommerceEcEnterpriseAddressQueryDefaultResponse;
import com.alipay.v3.model.AlipayCommerceEcEnterpriseAddressQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayCommerceEcEnterpriseAddressApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayCommerceEcEnterpriseAddressApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayCommerceEcEnterpriseAddressApi(ApiClient apiClient) {
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
     * Build call for add
     * @param alipayCommerceEcEnterpriseAddressAddModel  (optional)
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
    public okhttp3.Call addCall(AlipayCommerceEcEnterpriseAddressAddModel alipayCommerceEcEnterpriseAddressAddModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayCommerceEcEnterpriseAddressAddModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/commerce/ec/enterprise/address";

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
    private okhttp3.Call addValidateBeforeCall(AlipayCommerceEcEnterpriseAddressAddModel alipayCommerceEcEnterpriseAddressAddModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = addCall(alipayCommerceEcEnterpriseAddressAddModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 企业地址添加
     * 企业地址添加
     * @param alipayCommerceEcEnterpriseAddressAddModel  (optional)
     * @return AlipayCommerceEcEnterpriseAddressAddResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayCommerceEcEnterpriseAddressAddResponseModel add(AlipayCommerceEcEnterpriseAddressAddModel alipayCommerceEcEnterpriseAddressAddModel) throws ApiException {
        ApiResponse<AlipayCommerceEcEnterpriseAddressAddResponseModel> localVarResp = addWithHttpInfo(alipayCommerceEcEnterpriseAddressAddModel, null);
        return localVarResp.getData();
    }

    public AlipayCommerceEcEnterpriseAddressAddResponseModel add(AlipayCommerceEcEnterpriseAddressAddModel alipayCommerceEcEnterpriseAddressAddModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayCommerceEcEnterpriseAddressAddResponseModel> localVarResp = addWithHttpInfo(alipayCommerceEcEnterpriseAddressAddModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 企业地址添加
     * 企业地址添加
     * @param alipayCommerceEcEnterpriseAddressAddModel  (optional)
     * @return ApiResponse&lt;AlipayCommerceEcEnterpriseAddressAddResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayCommerceEcEnterpriseAddressAddResponseModel> addWithHttpInfo(AlipayCommerceEcEnterpriseAddressAddModel alipayCommerceEcEnterpriseAddressAddModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = addValidateBeforeCall(alipayCommerceEcEnterpriseAddressAddModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayCommerceEcEnterpriseAddressAddResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayCommerceEcEnterpriseAddressAddDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 企业地址添加 (asynchronously)
     * 企业地址添加
     * @param alipayCommerceEcEnterpriseAddressAddModel  (optional)
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
    public okhttp3.Call addAsync(AlipayCommerceEcEnterpriseAddressAddModel alipayCommerceEcEnterpriseAddressAddModel, final ApiCallback<AlipayCommerceEcEnterpriseAddressAddResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = addValidateBeforeCall(alipayCommerceEcEnterpriseAddressAddModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcEnterpriseAddressAddResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call addAsync(AlipayCommerceEcEnterpriseAddressAddModel alipayCommerceEcEnterpriseAddressAddModel, final ApiCallback<AlipayCommerceEcEnterpriseAddressAddResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = addValidateBeforeCall(alipayCommerceEcEnterpriseAddressAddModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcEnterpriseAddressAddResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modify
     * @param alipayCommerceEcEnterpriseAddressModifyModel  (optional)
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
    public okhttp3.Call modifyCall(AlipayCommerceEcEnterpriseAddressModifyModel alipayCommerceEcEnterpriseAddressModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayCommerceEcEnterpriseAddressModifyModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/commerce/ec/enterprise/address";

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
    private okhttp3.Call modifyValidateBeforeCall(AlipayCommerceEcEnterpriseAddressModifyModel alipayCommerceEcEnterpriseAddressModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = modifyCall(alipayCommerceEcEnterpriseAddressModifyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 企业地址修改
     * 企业地址修改
     * @param alipayCommerceEcEnterpriseAddressModifyModel  (optional)
     * @return AlipayCommerceEcEnterpriseAddressModifyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayCommerceEcEnterpriseAddressModifyResponseModel modify(AlipayCommerceEcEnterpriseAddressModifyModel alipayCommerceEcEnterpriseAddressModifyModel) throws ApiException {
        ApiResponse<AlipayCommerceEcEnterpriseAddressModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayCommerceEcEnterpriseAddressModifyModel, null);
        return localVarResp.getData();
    }

    public AlipayCommerceEcEnterpriseAddressModifyResponseModel modify(AlipayCommerceEcEnterpriseAddressModifyModel alipayCommerceEcEnterpriseAddressModifyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayCommerceEcEnterpriseAddressModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayCommerceEcEnterpriseAddressModifyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 企业地址修改
     * 企业地址修改
     * @param alipayCommerceEcEnterpriseAddressModifyModel  (optional)
     * @return ApiResponse&lt;AlipayCommerceEcEnterpriseAddressModifyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayCommerceEcEnterpriseAddressModifyResponseModel> modifyWithHttpInfo(AlipayCommerceEcEnterpriseAddressModifyModel alipayCommerceEcEnterpriseAddressModifyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayCommerceEcEnterpriseAddressModifyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayCommerceEcEnterpriseAddressModifyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayCommerceEcEnterpriseAddressModifyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 企业地址修改 (asynchronously)
     * 企业地址修改
     * @param alipayCommerceEcEnterpriseAddressModifyModel  (optional)
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
    public okhttp3.Call modifyAsync(AlipayCommerceEcEnterpriseAddressModifyModel alipayCommerceEcEnterpriseAddressModifyModel, final ApiCallback<AlipayCommerceEcEnterpriseAddressModifyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayCommerceEcEnterpriseAddressModifyModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcEnterpriseAddressModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call modifyAsync(AlipayCommerceEcEnterpriseAddressModifyModel alipayCommerceEcEnterpriseAddressModifyModel, final ApiCallback<AlipayCommerceEcEnterpriseAddressModifyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayCommerceEcEnterpriseAddressModifyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcEnterpriseAddressModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param enterpriseId 通过企业码2.0签约接口签约，只填写企业id，无需填写共同账户id和授权签约协议号。 (optional)
     * @param accountId 通过企业码1.0接口签约的共同账户，和agreement_no搭配使用。 (optional)
     * @param agreementNo 可通过签约消息获取。配合共同账户id使用，当填写企业共同账户id时，此字段必填。 (optional)
     * @param addressId 地址id (optional)
     * @param cityCode 市 (optional)
     * @param pageNum 页码从1开始 (optional)
     * @param pageSize 每页数据 (optional)
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
    public okhttp3.Call queryCall(String enterpriseId, String accountId, String agreementNo, String addressId, String cityCode, Integer pageNum, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/commerce/ec/enterprise/address";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (enterpriseId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("enterprise_id", enterpriseId));
        }

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
        }

        if (agreementNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agreement_no", agreementNo));
        }

        if (addressId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("address_id", addressId));
        }

        if (cityCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("city_code", cityCode));
        }

        if (pageNum != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_num", pageNum));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
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
    private okhttp3.Call queryValidateBeforeCall(String enterpriseId, String accountId, String agreementNo, String addressId, String cityCode, Integer pageNum, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(enterpriseId, accountId, agreementNo, addressId, cityCode, pageNum, pageSize, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 企业地址查询
     * 查询企业地址信息
     * @param enterpriseId 通过企业码2.0签约接口签约，只填写企业id，无需填写共同账户id和授权签约协议号。 (optional)
     * @param accountId 通过企业码1.0接口签约的共同账户，和agreement_no搭配使用。 (optional)
     * @param agreementNo 可通过签约消息获取。配合共同账户id使用，当填写企业共同账户id时，此字段必填。 (optional)
     * @param addressId 地址id (optional)
     * @param cityCode 市 (optional)
     * @param pageNum 页码从1开始 (optional)
     * @param pageSize 每页数据 (optional)
     * @return AlipayCommerceEcEnterpriseAddressQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayCommerceEcEnterpriseAddressQueryResponseModel query(String enterpriseId, String accountId, String agreementNo, String addressId, String cityCode, Integer pageNum, Integer pageSize) throws ApiException {
        ApiResponse<AlipayCommerceEcEnterpriseAddressQueryResponseModel> localVarResp = queryWithHttpInfo(enterpriseId, accountId, agreementNo, addressId, cityCode, pageNum, pageSize, null);
        return localVarResp.getData();
    }

    public AlipayCommerceEcEnterpriseAddressQueryResponseModel query(String enterpriseId, String accountId, String agreementNo, String addressId, String cityCode, Integer pageNum, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayCommerceEcEnterpriseAddressQueryResponseModel> localVarResp = queryWithHttpInfo(enterpriseId, accountId, agreementNo, addressId, cityCode, pageNum, pageSize, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 企业地址查询
     * 查询企业地址信息
     * @param enterpriseId 通过企业码2.0签约接口签约，只填写企业id，无需填写共同账户id和授权签约协议号。 (optional)
     * @param accountId 通过企业码1.0接口签约的共同账户，和agreement_no搭配使用。 (optional)
     * @param agreementNo 可通过签约消息获取。配合共同账户id使用，当填写企业共同账户id时，此字段必填。 (optional)
     * @param addressId 地址id (optional)
     * @param cityCode 市 (optional)
     * @param pageNum 页码从1开始 (optional)
     * @param pageSize 每页数据 (optional)
     * @return ApiResponse&lt;AlipayCommerceEcEnterpriseAddressQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayCommerceEcEnterpriseAddressQueryResponseModel> queryWithHttpInfo(String enterpriseId, String accountId, String agreementNo, String addressId, String cityCode, Integer pageNum, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(enterpriseId, accountId, agreementNo, addressId, cityCode, pageNum, pageSize, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayCommerceEcEnterpriseAddressQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayCommerceEcEnterpriseAddressQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 企业地址查询 (asynchronously)
     * 查询企业地址信息
     * @param enterpriseId 通过企业码2.0签约接口签约，只填写企业id，无需填写共同账户id和授权签约协议号。 (optional)
     * @param accountId 通过企业码1.0接口签约的共同账户，和agreement_no搭配使用。 (optional)
     * @param agreementNo 可通过签约消息获取。配合共同账户id使用，当填写企业共同账户id时，此字段必填。 (optional)
     * @param addressId 地址id (optional)
     * @param cityCode 市 (optional)
     * @param pageNum 页码从1开始 (optional)
     * @param pageSize 每页数据 (optional)
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
    public okhttp3.Call queryAsync(String enterpriseId, String accountId, String agreementNo, String addressId, String cityCode, Integer pageNum, Integer pageSize, final ApiCallback<AlipayCommerceEcEnterpriseAddressQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(enterpriseId, accountId, agreementNo, addressId, cityCode, pageNum, pageSize, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcEnterpriseAddressQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String enterpriseId, String accountId, String agreementNo, String addressId, String cityCode, Integer pageNum, Integer pageSize, final ApiCallback<AlipayCommerceEcEnterpriseAddressQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(enterpriseId, accountId, agreementNo, addressId, cityCode, pageNum, pageSize, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayCommerceEcEnterpriseAddressQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
