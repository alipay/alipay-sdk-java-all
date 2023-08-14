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


import com.alipay.v3.model.AlipayEbppInvoiceExpenserulesProjectruleCreateDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceExpenserulesProjectruleCreateModel;
import com.alipay.v3.model.AlipayEbppInvoiceExpenserulesProjectruleCreateResponseModel;
import com.alipay.v3.model.AlipayEbppInvoiceExpenserulesProjectruleQueryDefaultResponse;
import com.alipay.v3.model.AlipayEbppInvoiceExpenserulesProjectruleQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayEbppInvoiceExpenserulesProjectruleApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayEbppInvoiceExpenserulesProjectruleApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayEbppInvoiceExpenserulesProjectruleApi(ApiClient apiClient) {
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
     * Build call for create
     * @param alipayEbppInvoiceExpenserulesProjectruleCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayEbppInvoiceExpenserulesProjectruleCreateModel alipayEbppInvoiceExpenserulesProjectruleCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayEbppInvoiceExpenserulesProjectruleCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/ebpp/invoice/expenserules/projectrule/create";

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
    private okhttp3.Call createValidateBeforeCall(AlipayEbppInvoiceExpenserulesProjectruleCreateModel alipayEbppInvoiceExpenserulesProjectruleCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayEbppInvoiceExpenserulesProjectruleCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 创建项目费控规则
     * 创建项目费控规则
     * @param alipayEbppInvoiceExpenserulesProjectruleCreateModel  (optional)
     * @return AlipayEbppInvoiceExpenserulesProjectruleCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceExpenserulesProjectruleCreateResponseModel create(AlipayEbppInvoiceExpenserulesProjectruleCreateModel alipayEbppInvoiceExpenserulesProjectruleCreateModel) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpenserulesProjectruleCreateResponseModel> localVarResp = createWithHttpInfo(alipayEbppInvoiceExpenserulesProjectruleCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceExpenserulesProjectruleCreateResponseModel create(AlipayEbppInvoiceExpenserulesProjectruleCreateModel alipayEbppInvoiceExpenserulesProjectruleCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpenserulesProjectruleCreateResponseModel> localVarResp = createWithHttpInfo(alipayEbppInvoiceExpenserulesProjectruleCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 创建项目费控规则
     * 创建项目费控规则
     * @param alipayEbppInvoiceExpenserulesProjectruleCreateModel  (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceExpenserulesProjectruleCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceExpenserulesProjectruleCreateResponseModel> createWithHttpInfo(AlipayEbppInvoiceExpenserulesProjectruleCreateModel alipayEbppInvoiceExpenserulesProjectruleCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEbppInvoiceExpenserulesProjectruleCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpenserulesProjectruleCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceExpenserulesProjectruleCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 创建项目费控规则 (asynchronously)
     * 创建项目费控规则
     * @param alipayEbppInvoiceExpenserulesProjectruleCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayEbppInvoiceExpenserulesProjectruleCreateModel alipayEbppInvoiceExpenserulesProjectruleCreateModel, final ApiCallback<AlipayEbppInvoiceExpenserulesProjectruleCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEbppInvoiceExpenserulesProjectruleCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpenserulesProjectruleCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call createAsync(AlipayEbppInvoiceExpenserulesProjectruleCreateModel alipayEbppInvoiceExpenserulesProjectruleCreateModel, final ApiCallback<AlipayEbppInvoiceExpenserulesProjectruleCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayEbppInvoiceExpenserulesProjectruleCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpenserulesProjectruleCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param accountId 共同账号ID (optional)
     * @param agreementNo 授权签约协议号 (optional)
     * @param projectId 项目id（可空） (optional)
     * @param employeeId 员工UID（可空） (optional)
     * @param employeeOpenId 切换open_id后请使用：员工open_id（可空） (optional)
     * @param pageNum 页数 (optional)
     * @param pageSize 页大小 (optional)
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
    public okhttp3.Call queryCall(String accountId, String agreementNo, String projectId, String employeeId, String employeeOpenId, Integer pageNum, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/ebpp/invoice/expenserules/projectrule/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
        }

        if (agreementNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agreement_no", agreementNo));
        }

        if (projectId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("project_id", projectId));
        }

        if (employeeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("employee_id", employeeId));
        }

        if (employeeOpenId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("employee_open_id", employeeOpenId));
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
    private okhttp3.Call queryValidateBeforeCall(String accountId, String agreementNo, String projectId, String employeeId, String employeeOpenId, Integer pageNum, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(accountId, agreementNo, projectId, employeeId, employeeOpenId, pageNum, pageSize, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询项目费控规则
     * 查询项目费控规则
     * @param accountId 共同账号ID (optional)
     * @param agreementNo 授权签约协议号 (optional)
     * @param projectId 项目id（可空） (optional)
     * @param employeeId 员工UID（可空） (optional)
     * @param employeeOpenId 切换open_id后请使用：员工open_id（可空） (optional)
     * @param pageNum 页数 (optional)
     * @param pageSize 页大小 (optional)
     * @return AlipayEbppInvoiceExpenserulesProjectruleQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEbppInvoiceExpenserulesProjectruleQueryResponseModel query(String accountId, String agreementNo, String projectId, String employeeId, String employeeOpenId, Integer pageNum, Integer pageSize) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpenserulesProjectruleQueryResponseModel> localVarResp = queryWithHttpInfo(accountId, agreementNo, projectId, employeeId, employeeOpenId, pageNum, pageSize, null);
        return localVarResp.getData();
    }

    public AlipayEbppInvoiceExpenserulesProjectruleQueryResponseModel query(String accountId, String agreementNo, String projectId, String employeeId, String employeeOpenId, Integer pageNum, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEbppInvoiceExpenserulesProjectruleQueryResponseModel> localVarResp = queryWithHttpInfo(accountId, agreementNo, projectId, employeeId, employeeOpenId, pageNum, pageSize, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询项目费控规则
     * 查询项目费控规则
     * @param accountId 共同账号ID (optional)
     * @param agreementNo 授权签约协议号 (optional)
     * @param projectId 项目id（可空） (optional)
     * @param employeeId 员工UID（可空） (optional)
     * @param employeeOpenId 切换open_id后请使用：员工open_id（可空） (optional)
     * @param pageNum 页数 (optional)
     * @param pageSize 页大小 (optional)
     * @return ApiResponse&lt;AlipayEbppInvoiceExpenserulesProjectruleQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEbppInvoiceExpenserulesProjectruleQueryResponseModel> queryWithHttpInfo(String accountId, String agreementNo, String projectId, String employeeId, String employeeOpenId, Integer pageNum, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(accountId, agreementNo, projectId, employeeId, employeeOpenId, pageNum, pageSize, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpenserulesProjectruleQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEbppInvoiceExpenserulesProjectruleQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询项目费控规则 (asynchronously)
     * 查询项目费控规则
     * @param accountId 共同账号ID (optional)
     * @param agreementNo 授权签约协议号 (optional)
     * @param projectId 项目id（可空） (optional)
     * @param employeeId 员工UID（可空） (optional)
     * @param employeeOpenId 切换open_id后请使用：员工open_id（可空） (optional)
     * @param pageNum 页数 (optional)
     * @param pageSize 页大小 (optional)
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
    public okhttp3.Call queryAsync(String accountId, String agreementNo, String projectId, String employeeId, String employeeOpenId, Integer pageNum, Integer pageSize, final ApiCallback<AlipayEbppInvoiceExpenserulesProjectruleQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(accountId, agreementNo, projectId, employeeId, employeeOpenId, pageNum, pageSize, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpenserulesProjectruleQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String accountId, String agreementNo, String projectId, String employeeId, String employeeOpenId, Integer pageNum, Integer pageSize, final ApiCallback<AlipayEbppInvoiceExpenserulesProjectruleQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(accountId, agreementNo, projectId, employeeId, employeeOpenId, pageNum, pageSize, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEbppInvoiceExpenserulesProjectruleQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
