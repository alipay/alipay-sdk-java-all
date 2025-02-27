/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-01-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alipay.v3.JSON;

/**
 * ZhimaCustomerJobworthAuthenticationQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCustomerJobworthAuthenticationQueryResponseModel {
  public static final String SERIALIZED_NAME_BIZ_CHECK_FAILED_REASON = "biz_check_failed_reason";
  @SerializedName(SERIALIZED_NAME_BIZ_CHECK_FAILED_REASON)
  private String bizCheckFailedReason;

  public static final String SERIALIZED_NAME_IDENTITY_RESULT = "identity_result";
  @SerializedName(SERIALIZED_NAME_IDENTITY_RESULT)
  private String identityResult;

  public static final String SERIALIZED_NAME_IDENTITY_RESULT_SKIP_URL = "identity_result_skip_url";
  @SerializedName(SERIALIZED_NAME_IDENTITY_RESULT_SKIP_URL)
  private String identityResultSkipUrl;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_TOKEN_STATUS = "token_status";
  @SerializedName(SERIALIZED_NAME_TOKEN_STATUS)
  private String tokenStatus;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public ZhimaCustomerJobworthAuthenticationQueryResponseModel() { 
  }

  public ZhimaCustomerJobworthAuthenticationQueryResponseModel bizCheckFailedReason(String bizCheckFailedReason) {
    
    this.bizCheckFailedReason = bizCheckFailedReason;
    return this;
  }

   /**
   * 当用户验真订单被前置业务校验拦截时，商户可通过该字段查询到具体的被拦截原因
   * @return bizCheckFailedReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USER_NAME_NOT_MATCH", value = "当用户验真订单被前置业务校验拦截时，商户可通过该字段查询到具体的被拦截原因")

  public String getBizCheckFailedReason() {
    return bizCheckFailedReason;
  }


  public void setBizCheckFailedReason(String bizCheckFailedReason) {
    this.bizCheckFailedReason = bizCheckFailedReason;
  }


  public ZhimaCustomerJobworthAuthenticationQueryResponseModel identityResult(String identityResult) {
    
    this.identityResult = identityResult;
    return this;
  }

   /**
   * SUCCESS代表可信，FAILED代表不可信，WAITING_VERIFY代表未知需要等待结果
   * @return identityResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS/FAILED/WAITING_VERIFY", value = "SUCCESS代表可信，FAILED代表不可信，WAITING_VERIFY代表未知需要等待结果")

  public String getIdentityResult() {
    return identityResult;
  }


  public void setIdentityResult(String identityResult) {
    this.identityResult = identityResult;
  }


  public ZhimaCustomerJobworthAuthenticationQueryResponseModel identityResultSkipUrl(String identityResultSkipUrl) {
    
    this.identityResultSkipUrl = identityResultSkipUrl;
    return this;
  }

   /**
   * 身份认证查询结果页面的小程序链接，有芝麻提供，用户在端内可直接访问
   * @return identityResultSkipUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://platformapi/startapp?appId", value = "身份认证查询结果页面的小程序链接，有芝麻提供，用户在端内可直接访问")

  public String getIdentityResultSkipUrl() {
    return identityResultSkipUrl;
  }


  public void setIdentityResultSkipUrl(String identityResultSkipUrl) {
    this.identityResultSkipUrl = identityResultSkipUrl;
  }


  public ZhimaCustomerJobworthAuthenticationQueryResponseModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 蚂蚁统一会员ID
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "蚂蚁统一会员ID")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public ZhimaCustomerJobworthAuthenticationQueryResponseModel tokenStatus(String tokenStatus) {
    
    this.tokenStatus = tokenStatus;
    return this;
  }

   /**
   * 代表订单状态
   * @return tokenStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FINISH", value = "代表订单状态")

  public String getTokenStatus() {
    return tokenStatus;
  }


  public void setTokenStatus(String tokenStatus) {
    this.tokenStatus = tokenStatus;
  }


  public ZhimaCustomerJobworthAuthenticationQueryResponseModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 蚂蚁统一会员ID
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088402562742105", value = "蚂蚁统一会员ID")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZhimaCustomerJobworthAuthenticationQueryResponseModel zhimaCustomerJobworthAuthenticationQueryResponseModel = (ZhimaCustomerJobworthAuthenticationQueryResponseModel) o;
    return Objects.equals(this.bizCheckFailedReason, zhimaCustomerJobworthAuthenticationQueryResponseModel.bizCheckFailedReason) &&
        Objects.equals(this.identityResult, zhimaCustomerJobworthAuthenticationQueryResponseModel.identityResult) &&
        Objects.equals(this.identityResultSkipUrl, zhimaCustomerJobworthAuthenticationQueryResponseModel.identityResultSkipUrl) &&
        Objects.equals(this.openId, zhimaCustomerJobworthAuthenticationQueryResponseModel.openId) &&
        Objects.equals(this.tokenStatus, zhimaCustomerJobworthAuthenticationQueryResponseModel.tokenStatus) &&
        Objects.equals(this.userId, zhimaCustomerJobworthAuthenticationQueryResponseModel.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizCheckFailedReason, identityResult, identityResultSkipUrl, openId, tokenStatus, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCustomerJobworthAuthenticationQueryResponseModel {\n");
    sb.append("    bizCheckFailedReason: ").append(toIndentedString(bizCheckFailedReason)).append("\n");
    sb.append("    identityResult: ").append(toIndentedString(identityResult)).append("\n");
    sb.append("    identityResultSkipUrl: ").append(toIndentedString(identityResultSkipUrl)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    tokenStatus: ").append(toIndentedString(tokenStatus)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("biz_check_failed_reason");
    openapiFields.add("identity_result");
    openapiFields.add("identity_result_skip_url");
    openapiFields.add("open_id");
    openapiFields.add("token_status");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCustomerJobworthAuthenticationQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCustomerJobworthAuthenticationQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCustomerJobworthAuthenticationQueryResponseModel is not found in the empty JSON string", ZhimaCustomerJobworthAuthenticationQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZhimaCustomerJobworthAuthenticationQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZhimaCustomerJobworthAuthenticationQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("biz_check_failed_reason") != null && !jsonObj.get("biz_check_failed_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_check_failed_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_check_failed_reason").toString()));
      }
      if (jsonObj.get("identity_result") != null && !jsonObj.get("identity_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_result").toString()));
      }
      if (jsonObj.get("identity_result_skip_url") != null && !jsonObj.get("identity_result_skip_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_result_skip_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_result_skip_url").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("token_status") != null && !jsonObj.get("token_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_status").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCustomerJobworthAuthenticationQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCustomerJobworthAuthenticationQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCustomerJobworthAuthenticationQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCustomerJobworthAuthenticationQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCustomerJobworthAuthenticationQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCustomerJobworthAuthenticationQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZhimaCustomerJobworthAuthenticationQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZhimaCustomerJobworthAuthenticationQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCustomerJobworthAuthenticationQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCustomerJobworthAuthenticationQueryResponseModel
  */
  public static ZhimaCustomerJobworthAuthenticationQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCustomerJobworthAuthenticationQueryResponseModel.class);
  }

 /**
  * Convert an instance of ZhimaCustomerJobworthAuthenticationQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

