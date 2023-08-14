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


import com.alipay.v3.model.AlipayEcoEduKtParentQueryDefaultResponse;
import com.alipay.v3.model.AlipayEcoEduKtParentQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayEcoEduKtParentApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayEcoEduKtParentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayEcoEduKtParentApi(ApiClient apiClient) {
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
     * @param schoolPid 学校支付宝pid (optional)
     * @param schoolNo 学校编码，录入学校接口返回的school_no参数 (optional)
     * @param partnerId Isv的支付宝pid (optional)
     * @param childName 孩子或学生姓名 (optional)
     * @param userMobile 用户手机号，发账单时填写users数组中的一个手机号。结果返回用户是否通过此手机号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。 (optional)
     * @param studentCode 学生的学号，一个学校的学号必须是唯一。结果返回用户是否通过此学号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。 (optional)
     * @param studentIdentify 学生的身份证号，使用身份证规则验证。结果返回用户是否通过此身份证号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。 (optional)
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
    public okhttp3.Call queryCall(String schoolPid, String schoolNo, String partnerId, String childName, String userMobile, String studentCode, String studentIdentify, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/eco/edu/kt/parent/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (schoolPid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("school_pid", schoolPid));
        }

        if (schoolNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("school_no", schoolNo));
        }

        if (partnerId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("partner_id", partnerId));
        }

        if (childName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("child_name", childName));
        }

        if (userMobile != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_mobile", userMobile));
        }

        if (studentCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("student_code", studentCode));
        }

        if (studentIdentify != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("student_identify", studentIdentify));
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
    private okhttp3.Call queryValidateBeforeCall(String schoolPid, String schoolNo, String partnerId, String childName, String userMobile, String studentCode, String studentIdentify, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(schoolPid, schoolNo, partnerId, childName, userMobile, studentCode, studentIdentify, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询学生家长状态接口
     * ISV发送账单后，用户在支付宝缴费成功。ISV可以通过此接口查询，用户缴费的时候，是否创建了缴费账户，如果已经添加，学校使用ISV的系统再次发账单就可以通过支付宝的通知触达用户；如果未添加，学校即可联系家长，督促家长在支付宝添加学生的缴费账户。  目前的出现的场景是家长第一次缴费成功后，学校使用ISV的系统再次发账单，认为家长应该收到通知，实际上只有建立缴费账户的家长才能收到，未建立缴费账户的是收不到通知，这部分家长有可能就缴费不及时或不通过支付宝缴费。
     * @param schoolPid 学校支付宝pid (optional)
     * @param schoolNo 学校编码，录入学校接口返回的school_no参数 (optional)
     * @param partnerId Isv的支付宝pid (optional)
     * @param childName 孩子或学生姓名 (optional)
     * @param userMobile 用户手机号，发账单时填写users数组中的一个手机号。结果返回用户是否通过此手机号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。 (optional)
     * @param studentCode 学生的学号，一个学校的学号必须是唯一。结果返回用户是否通过此学号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。 (optional)
     * @param studentIdentify 学生的身份证号，使用身份证规则验证。结果返回用户是否通过此身份证号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。 (optional)
     * @return AlipayEcoEduKtParentQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayEcoEduKtParentQueryResponseModel query(String schoolPid, String schoolNo, String partnerId, String childName, String userMobile, String studentCode, String studentIdentify) throws ApiException {
        ApiResponse<AlipayEcoEduKtParentQueryResponseModel> localVarResp = queryWithHttpInfo(schoolPid, schoolNo, partnerId, childName, userMobile, studentCode, studentIdentify, null);
        return localVarResp.getData();
    }

    public AlipayEcoEduKtParentQueryResponseModel query(String schoolPid, String schoolNo, String partnerId, String childName, String userMobile, String studentCode, String studentIdentify, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayEcoEduKtParentQueryResponseModel> localVarResp = queryWithHttpInfo(schoolPid, schoolNo, partnerId, childName, userMobile, studentCode, studentIdentify, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询学生家长状态接口
     * ISV发送账单后，用户在支付宝缴费成功。ISV可以通过此接口查询，用户缴费的时候，是否创建了缴费账户，如果已经添加，学校使用ISV的系统再次发账单就可以通过支付宝的通知触达用户；如果未添加，学校即可联系家长，督促家长在支付宝添加学生的缴费账户。  目前的出现的场景是家长第一次缴费成功后，学校使用ISV的系统再次发账单，认为家长应该收到通知，实际上只有建立缴费账户的家长才能收到，未建立缴费账户的是收不到通知，这部分家长有可能就缴费不及时或不通过支付宝缴费。
     * @param schoolPid 学校支付宝pid (optional)
     * @param schoolNo 学校编码，录入学校接口返回的school_no参数 (optional)
     * @param partnerId Isv的支付宝pid (optional)
     * @param childName 孩子或学生姓名 (optional)
     * @param userMobile 用户手机号，发账单时填写users数组中的一个手机号。结果返回用户是否通过此手机号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。 (optional)
     * @param studentCode 学生的学号，一个学校的学号必须是唯一。结果返回用户是否通过此学号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。 (optional)
     * @param studentIdentify 学生的身份证号，使用身份证规则验证。结果返回用户是否通过此身份证号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。 (optional)
     * @return ApiResponse&lt;AlipayEcoEduKtParentQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayEcoEduKtParentQueryResponseModel> queryWithHttpInfo(String schoolPid, String schoolNo, String partnerId, String childName, String userMobile, String studentCode, String studentIdentify, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(schoolPid, schoolNo, partnerId, childName, userMobile, studentCode, studentIdentify, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayEcoEduKtParentQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayEcoEduKtParentQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询学生家长状态接口 (asynchronously)
     * ISV发送账单后，用户在支付宝缴费成功。ISV可以通过此接口查询，用户缴费的时候，是否创建了缴费账户，如果已经添加，学校使用ISV的系统再次发账单就可以通过支付宝的通知触达用户；如果未添加，学校即可联系家长，督促家长在支付宝添加学生的缴费账户。  目前的出现的场景是家长第一次缴费成功后，学校使用ISV的系统再次发账单，认为家长应该收到通知，实际上只有建立缴费账户的家长才能收到，未建立缴费账户的是收不到通知，这部分家长有可能就缴费不及时或不通过支付宝缴费。
     * @param schoolPid 学校支付宝pid (optional)
     * @param schoolNo 学校编码，录入学校接口返回的school_no参数 (optional)
     * @param partnerId Isv的支付宝pid (optional)
     * @param childName 孩子或学生姓名 (optional)
     * @param userMobile 用户手机号，发账单时填写users数组中的一个手机号。结果返回用户是否通过此手机号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。 (optional)
     * @param studentCode 学生的学号，一个学校的学号必须是唯一。结果返回用户是否通过此学号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。 (optional)
     * @param studentIdentify 学生的身份证号，使用身份证规则验证。结果返回用户是否通过此身份证号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。 (optional)
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
    public okhttp3.Call queryAsync(String schoolPid, String schoolNo, String partnerId, String childName, String userMobile, String studentCode, String studentIdentify, final ApiCallback<AlipayEcoEduKtParentQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(schoolPid, schoolNo, partnerId, childName, userMobile, studentCode, studentIdentify, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayEcoEduKtParentQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String schoolPid, String schoolNo, String partnerId, String childName, String userMobile, String studentCode, String studentIdentify, final ApiCallback<AlipayEcoEduKtParentQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(schoolPid, schoolNo, partnerId, childName, userMobile, studentCode, studentIdentify, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayEcoEduKtParentQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
