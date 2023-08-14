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


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.JointAccountQuotaDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * JointAccountMemberRespDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JointAccountMemberRespDTO {
  public static final String SERIALIZED_NAME_ACCOUNT_QUOTA = "account_quota";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_QUOTA)
  private List<JointAccountQuotaDTO> accountQuota = null;

  public static final String SERIALIZED_NAME_LOGON_ID = "logon_id";
  @SerializedName(SERIALIZED_NAME_LOGON_ID)
  private String logonId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public JointAccountMemberRespDTO() { 
  }

  public JointAccountMemberRespDTO accountQuota(List<JointAccountQuotaDTO> accountQuota) {
    
    this.accountQuota = accountQuota;
    return this;
  }

  public JointAccountMemberRespDTO addAccountQuotaItem(JointAccountQuotaDTO accountQuotaItem) {
    if (this.accountQuota == null) {
      this.accountQuota = new ArrayList<>();
    }
    this.accountQuota.add(accountQuotaItem);
    return this;
  }

   /**
   * 额度模型
   * @return accountQuota
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "额度模型")

  public List<JointAccountQuotaDTO> getAccountQuota() {
    return accountQuota;
  }


  public void setAccountQuota(List<JointAccountQuotaDTO> accountQuota) {
    this.accountQuota = accountQuota;
  }


  public JointAccountMemberRespDTO logonId(String logonId) {
    
    this.logonId = logonId;
    return this;
  }

   /**
   * 成员支付宝登录号
   * @return logonId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13111122222", value = "成员支付宝登录号")

  public String getLogonId() {
    return logonId;
  }


  public void setLogonId(String logonId) {
    this.logonId = logonId;
  }


  public JointAccountMemberRespDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 姓名
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "成员名称", value = "姓名")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public JointAccountMemberRespDTO status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 员工当前状态：  邀请中（PROCESSING）、正常（NORMAL）
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "状态", value = "员工当前状态：  邀请中（PROCESSING）、正常（NORMAL）")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public JointAccountMemberRespDTO userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 用户支付宝会员号
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088900976746215", value = "用户支付宝会员号")

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
    JointAccountMemberRespDTO jointAccountMemberRespDTO = (JointAccountMemberRespDTO) o;
    return Objects.equals(this.accountQuota, jointAccountMemberRespDTO.accountQuota) &&
        Objects.equals(this.logonId, jointAccountMemberRespDTO.logonId) &&
        Objects.equals(this.name, jointAccountMemberRespDTO.name) &&
        Objects.equals(this.status, jointAccountMemberRespDTO.status) &&
        Objects.equals(this.userId, jointAccountMemberRespDTO.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountQuota, logonId, name, status, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JointAccountMemberRespDTO {\n");
    sb.append("    accountQuota: ").append(toIndentedString(accountQuota)).append("\n");
    sb.append("    logonId: ").append(toIndentedString(logonId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("account_quota");
    openapiFields.add("logon_id");
    openapiFields.add("name");
    openapiFields.add("status");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JointAccountMemberRespDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JointAccountMemberRespDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JointAccountMemberRespDTO is not found in the empty JSON string", JointAccountMemberRespDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JointAccountMemberRespDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JointAccountMemberRespDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayaccountQuota = jsonObj.getAsJsonArray("account_quota");
      if (jsonArrayaccountQuota != null) {
        // ensure the json data is an array
        if (!jsonObj.get("account_quota").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `account_quota` to be an array in the JSON string but got `%s`", jsonObj.get("account_quota").toString()));
        }

        // validate the optional field `account_quota` (array)
        for (int i = 0; i < jsonArrayaccountQuota.size(); i++) {
          JointAccountQuotaDTO.validateJsonObject(jsonArrayaccountQuota.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("logon_id") != null && !jsonObj.get("logon_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logon_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logon_id").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JointAccountMemberRespDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JointAccountMemberRespDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JointAccountMemberRespDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JointAccountMemberRespDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<JointAccountMemberRespDTO>() {
           @Override
           public void write(JsonWriter out, JointAccountMemberRespDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JointAccountMemberRespDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JointAccountMemberRespDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JointAccountMemberRespDTO
  * @throws IOException if the JSON string is invalid with respect to JointAccountMemberRespDTO
  */
  public static JointAccountMemberRespDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JointAccountMemberRespDTO.class);
  }

 /**
  * Convert an instance of JointAccountMemberRespDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

