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


import com.alipay.v3.model.AntMerchantExpandShopPageQueryDefaultResponse;
import com.alipay.v3.model.AntMerchantExpandShopPageQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AntMerchantExpandShopPageApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AntMerchantExpandShopPageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AntMerchantExpandShopPageApi(ApiClient apiClient) {
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
     * @param ipRoleId 商户角色id，表示将要开的店属于哪个商户角色。对于直连开店场景，填写商户pid；对于间连开店场景（线上、线下、直付通），填写商户smid。特别说明：IoT设备三绑定场景统一填写商户pid (optional)
     * @param pageNum 查询页数 (optional)
     * @param pageSize 每页查询大小，限制100以内 (optional)
     * @param addressVersion 行政区划版本，当前可传空值(取默认版本)、2022Q2、UPTODATE(取最新版本)，其中空值默认为：2020Q1版本(address_version&#x3D;&#39;&#39;或null)，想要查看版本是2022年2季度版本则传入:(address_version&#x3D;&#39;2022Q2&#39;)，想要获取最新版本则传入:(address_version &#x3D;&#39;UPTODATE&#39;) (optional)
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
    public okhttp3.Call queryCall(String ipRoleId, Integer pageNum, Integer pageSize, String addressVersion, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/ant/merchant/shop/pagequery";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (ipRoleId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ip_role_id", ipRoleId));
        }

        if (pageNum != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_num", pageNum));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (addressVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("address_version", addressVersion));
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
    private okhttp3.Call queryValidateBeforeCall(String ipRoleId, Integer pageNum, Integer pageSize, String addressVersion, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(ipRoleId, pageNum, pageSize, addressVersion, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 店铺分页查询接口
     * 用于服务商或商户查询其自己的店铺信息
     * @param ipRoleId 商户角色id，表示将要开的店属于哪个商户角色。对于直连开店场景，填写商户pid；对于间连开店场景（线上、线下、直付通），填写商户smid。特别说明：IoT设备三绑定场景统一填写商户pid (optional)
     * @param pageNum 查询页数 (optional)
     * @param pageSize 每页查询大小，限制100以内 (optional)
     * @param addressVersion 行政区划版本，当前可传空值(取默认版本)、2022Q2、UPTODATE(取最新版本)，其中空值默认为：2020Q1版本(address_version&#x3D;&#39;&#39;或null)，想要查看版本是2022年2季度版本则传入:(address_version&#x3D;&#39;2022Q2&#39;)，想要获取最新版本则传入:(address_version &#x3D;&#39;UPTODATE&#39;) (optional)
     * @return AntMerchantExpandShopPageQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AntMerchantExpandShopPageQueryResponseModel query(String ipRoleId, Integer pageNum, Integer pageSize, String addressVersion) throws ApiException {
        ApiResponse<AntMerchantExpandShopPageQueryResponseModel> localVarResp = queryWithHttpInfo(ipRoleId, pageNum, pageSize, addressVersion, null);
        return localVarResp.getData();
    }

    public AntMerchantExpandShopPageQueryResponseModel query(String ipRoleId, Integer pageNum, Integer pageSize, String addressVersion, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AntMerchantExpandShopPageQueryResponseModel> localVarResp = queryWithHttpInfo(ipRoleId, pageNum, pageSize, addressVersion, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 店铺分页查询接口
     * 用于服务商或商户查询其自己的店铺信息
     * @param ipRoleId 商户角色id，表示将要开的店属于哪个商户角色。对于直连开店场景，填写商户pid；对于间连开店场景（线上、线下、直付通），填写商户smid。特别说明：IoT设备三绑定场景统一填写商户pid (optional)
     * @param pageNum 查询页数 (optional)
     * @param pageSize 每页查询大小，限制100以内 (optional)
     * @param addressVersion 行政区划版本，当前可传空值(取默认版本)、2022Q2、UPTODATE(取最新版本)，其中空值默认为：2020Q1版本(address_version&#x3D;&#39;&#39;或null)，想要查看版本是2022年2季度版本则传入:(address_version&#x3D;&#39;2022Q2&#39;)，想要获取最新版本则传入:(address_version &#x3D;&#39;UPTODATE&#39;) (optional)
     * @return ApiResponse&lt;AntMerchantExpandShopPageQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AntMerchantExpandShopPageQueryResponseModel> queryWithHttpInfo(String ipRoleId, Integer pageNum, Integer pageSize, String addressVersion, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(ipRoleId, pageNum, pageSize, addressVersion, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AntMerchantExpandShopPageQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AntMerchantExpandShopPageQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 店铺分页查询接口 (asynchronously)
     * 用于服务商或商户查询其自己的店铺信息
     * @param ipRoleId 商户角色id，表示将要开的店属于哪个商户角色。对于直连开店场景，填写商户pid；对于间连开店场景（线上、线下、直付通），填写商户smid。特别说明：IoT设备三绑定场景统一填写商户pid (optional)
     * @param pageNum 查询页数 (optional)
     * @param pageSize 每页查询大小，限制100以内 (optional)
     * @param addressVersion 行政区划版本，当前可传空值(取默认版本)、2022Q2、UPTODATE(取最新版本)，其中空值默认为：2020Q1版本(address_version&#x3D;&#39;&#39;或null)，想要查看版本是2022年2季度版本则传入:(address_version&#x3D;&#39;2022Q2&#39;)，想要获取最新版本则传入:(address_version &#x3D;&#39;UPTODATE&#39;) (optional)
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
    public okhttp3.Call queryAsync(String ipRoleId, Integer pageNum, Integer pageSize, String addressVersion, final ApiCallback<AntMerchantExpandShopPageQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(ipRoleId, pageNum, pageSize, addressVersion, _callback, null);
        Type localVarReturnType = new TypeToken<AntMerchantExpandShopPageQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    @Deprecated
    public okhttp3.Call queryAsync(String ipRoleId, Integer pageNum, Integer pageSize, String addressVersion, final ApiCallback<AntMerchantExpandShopPageQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(ipRoleId, pageNum, pageSize, addressVersion, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AntMerchantExpandShopPageQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
