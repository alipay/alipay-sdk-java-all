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


import com.alipay.v3.model.AlipayEbppInvoiceOrderQueryDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceOrderQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayEbppInvoiceOrderApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayEbppInvoiceOrderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayEbppInvoiceOrderApi(ApiClient apiClient) {
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
     * @param orderNo 开票申请时所传入订单号，不限于支付宝体内交易订单号。如：20200520110046966071 (optional)
     * @param mShortName 定义商户的一级简称,用于标识商户品牌，对应于商户入驻时填写的\&quot;商户品牌简称\&quot;。 如：肯德基：KFC (optional)
     * @param subMShortName 定义商户的二级简称,用于标识商户品牌下的分支机构，如门店，对应于商户入驻时填写的\&quot;商户门店简称\&quot;。 如：肯德基-杭州西湖区文一西路店：KFC-HZ-19003 要求：\&quot;商户品牌简称+商户门店简称\&quot;作为确定商户及其下属机构的唯一标识，不可重复。 (optional)
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
    public okhttp3.Call queryCall(String orderNo, String mShortName, String subMShortName, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/ebpp/invoice/order/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (orderNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_no", orderNo));
        }

        if (mShortName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("m_short_name", mShortName));
        }

        if (subMShortName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sub_m_short_name", subMShortName));
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
    private okhttp3.Call queryValidateBeforeCall(String orderNo, String mShortName, String subMShortName, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(orderNo, mShortName, subMShortName, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 根据外部订单号查询发票信息
     * 根据外部订单号查询发票详情信息，适用于外部商户无开票申请ID场景
     * @param orderNo 开票申请时所传入订单号，不限于支付宝体内交易订单号。如：20200520110046966071 (optional)
     * @param mShortName 定义商户的一级简称,用于标识商户品牌，对应于商户入驻时填写的\&quot;商户品牌简称\&quot;。 如：肯德基：KFC (optional)
     * @param subMShortName 定义商户的二级简称,用于标识商户品牌下的分支机构，如门店，对应于商户入驻时填写的\&quot;商户门店简称\&quot;。 如：肯德基-杭州西湖区文一西路店：KFC-HZ-19003 要求：\&quot;商户品牌简称+商户门店简称\&quot;作为确定商户及其下属机构的唯一标识，不可重复。 (optional)
     * @return AlipayEbppInvoiceOrderQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceOrderQueryResponseModel query(String orderNo, String mShortName, String subMShortName) throws ApiException {
        ApiResponse<AlipayEbppInvoiceOrderQueryResponseModel> localVarResp = queryWithHttpInfo(orderNo, mShortName, subMShortName, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceOrderQueryResponseModel query(String orderNo, String mShortName, String subMShortName, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceOrderQueryResponseModel> localVarResp = queryWithHttpInfo(orderNo, mShortName, subMShortName, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 根据外部订单号查询发票信息
     * 根据外部订单号查询发票详情信息，适用于外部商户无开票申请ID场景
     * @param orderNo 开票申请时所传入订单号，不限于支付宝体内交易订单号。如：20200520110046966071 (optional)
     * @param mShortName 定义商户的一级简称,用于标识商户品牌，对应于商户入驻时填写的\&quot;商户品牌简称\&quot;。 如：肯德基：KFC (optional)
     * @param subMShortName 定义商户的二级简称,用于标识商户品牌下的分支机构，如门店，对应于商户入驻时填写的\&quot;商户门店简称\&quot;。 如：肯德基-杭州西湖区文一西路店：KFC-HZ-19003 要求：\&quot;商户品牌简称+商户门店简称\&quot;作为确定商户及其下属机构的唯一标识，不可重复。 (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceOrderQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceOrderQueryResponseModel> queryWithHttpInfo(String orderNo, String mShortName, String subMShortName, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(orderNo, mShortName, subMShortName, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceOrderQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceOrderQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 根据外部订单号查询发票信息 (asynchronously)
     * 根据外部订单号查询发票详情信息，适用于外部商户无开票申请ID场景
     * @param orderNo 开票申请时所传入订单号，不限于支付宝体内交易订单号。如：20200520110046966071 (optional)
     * @param mShortName 定义商户的一级简称,用于标识商户品牌，对应于商户入驻时填写的\&quot;商户品牌简称\&quot;。 如：肯德基：KFC (optional)
     * @param subMShortName 定义商户的二级简称,用于标识商户品牌下的分支机构，如门店，对应于商户入驻时填写的\&quot;商户门店简称\&quot;。 如：肯德基-杭州西湖区文一西路店：KFC-HZ-19003 要求：\&quot;商户品牌简称+商户门店简称\&quot;作为确定商户及其下属机构的唯一标识，不可重复。 (optional)
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
    public okhttp3.Call queryAsync(String orderNo, String mShortName, String subMShortName, final ApiCallback<AlipayEbppInvoiceOrderQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(orderNo, mShortName, subMShortName, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceOrderQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String orderNo, String mShortName, String subMShortName, final ApiCallback<AlipayEbppInvoiceOrderQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(orderNo, mShortName, subMShortName, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceOrderQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
