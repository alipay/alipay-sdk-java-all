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
 * CreditRiskInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreditRiskInfo {
  public static final String SERIALIZED_NAME_CAN_RETRY = "can_retry";
  @SerializedName(SERIALIZED_NAME_CAN_RETRY)
  private Boolean canRetry;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public CreditRiskInfo() { 
  }

  public CreditRiskInfo canRetry(Boolean canRetry) {
    
    this.canRetry = canRetry;
    return this;
  }

   /**
   * 查询失败的情况下，是否可以通过重试解决。true 表示可以适当重试一定次数；false 表示有明确的失败原因，无需重试，
   * @return canRetry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "查询失败的情况下，是否可以通过重试解决。true 表示可以适当重试一定次数；false 表示有明确的失败原因，无需重试，")

  public Boolean getCanRetry() {
    return canRetry;
  }


  public void setCanRetry(Boolean canRetry) {
    this.canRetry = canRetry;
  }


  public CreditRiskInfo code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 用户信用数据查询状态
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "QUERY_REFUSED_FOR_UNKNOWN_REASON", value = "用户信用数据查询状态")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public CreditRiskInfo data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * 用户信用风险信息，如：租物场景风险等级、履约历史等级、共租行为等级
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"miniZm\":false,\"aliren\":false}", value = "用户信用风险信息，如：租物场景风险等级、履约历史等级、共租行为等级")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditRiskInfo creditRiskInfo = (CreditRiskInfo) o;
    return Objects.equals(this.canRetry, creditRiskInfo.canRetry) &&
        Objects.equals(this.code, creditRiskInfo.code) &&
        Objects.equals(this.data, creditRiskInfo.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canRetry, code, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditRiskInfo {\n");
    sb.append("    canRetry: ").append(toIndentedString(canRetry)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("can_retry");
    openapiFields.add("code");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreditRiskInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreditRiskInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreditRiskInfo is not found in the empty JSON string", CreditRiskInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreditRiskInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreditRiskInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreditRiskInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreditRiskInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreditRiskInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreditRiskInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CreditRiskInfo>() {
           @Override
           public void write(JsonWriter out, CreditRiskInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreditRiskInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreditRiskInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreditRiskInfo
  * @throws IOException if the JSON string is invalid with respect to CreditRiskInfo
  */
  public static CreditRiskInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreditRiskInfo.class);
  }

 /**
  * Convert an instance of CreditRiskInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

