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
 * MdCodeInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MdCodeInfoDTO {
  public static final String SERIALIZED_NAME_CODE_STATUS = "code_status";
  @SerializedName(SERIALIZED_NAME_CODE_STATUS)
  private String codeStatus;

  public static final String SERIALIZED_NAME_CODE_VALUE = "code_value";
  @SerializedName(SERIALIZED_NAME_CODE_VALUE)
  private String codeValue;

  public static final String SERIALIZED_NAME_EXPIRE_TIME = "expire_time";
  @SerializedName(SERIALIZED_NAME_EXPIRE_TIME)
  private String expireTime;

  public static final String SERIALIZED_NAME_TIME_STAMP = "time_stamp";
  @SerializedName(SERIALIZED_NAME_TIME_STAMP)
  private Integer timeStamp;

  public MdCodeInfoDTO() { 
  }

  public MdCodeInfoDTO codeStatus(String codeStatus) {
    
    this.codeStatus = codeStatus;
    return this;
  }

   /**
   * 本次回传动态码的状态：  SUCCESS: 本次发码成功  FAIL_RETRY: 本次发码失败，且需要支付宝重试（重新通知商户发码）  FAIL_NOT_RETRY: 本次发码失败，且无需支付宝重试（无需重新通知商户发码）
   * @return codeStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "本次回传动态码的状态：  SUCCESS: 本次发码成功  FAIL_RETRY: 本次发码失败，且需要支付宝重试（重新通知商户发码）  FAIL_NOT_RETRY: 本次发码失败，且无需支付宝重试（无需重新通知商户发码）")

  public String getCodeStatus() {
    return codeStatus;
  }


  public void setCodeStatus(String codeStatus) {
    this.codeStatus = codeStatus;
  }


  public MdCodeInfoDTO codeValue(String codeValue) {
    
    this.codeValue = codeValue;
    return this;
  }

   /**
   * 动态码的码值：  code_status为SUCCESS时必填；  基于此码值生成条形码或二维码用于扫码核销。
   * @return codeValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "动态码的码值：  code_status为SUCCESS时必填；  基于此码值生成条形码或二维码用于扫码核销。")

  public String getCodeValue() {
    return codeValue;
  }


  public void setCodeValue(String codeValue) {
    this.codeValue = codeValue;
  }


  public MdCodeInfoDTO expireTime(String expireTime) {
    
    this.expireTime = expireTime;
    return this;
  }

   /**
   * 当前动态码的过期（失效）时间：   code_status为SUCCESS时必填。
   * @return expireTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "当前动态码的过期（失效）时间：   code_status为SUCCESS时必填。")

  public String getExpireTime() {
    return expireTime;
  }


  public void setExpireTime(String expireTime) {
    this.expireTime = expireTime;
  }


  public MdCodeInfoDTO timeStamp(Integer timeStamp) {
    
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * 商户回传动态码的时间戳 (单位秒)。    即商户调接口回传动态码时刻对应的long类型时间戳，用于区分不同的发码请求。
   * @return timeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户回传动态码的时间戳 (单位秒)。    即商户调接口回传动态码时刻对应的long类型时间戳，用于区分不同的发码请求。")

  public Integer getTimeStamp() {
    return timeStamp;
  }


  public void setTimeStamp(Integer timeStamp) {
    this.timeStamp = timeStamp;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the MdCodeInfoDTO instance itself
   */
  public MdCodeInfoDTO putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdCodeInfoDTO mdCodeInfoDTO = (MdCodeInfoDTO) o;
    return Objects.equals(this.codeStatus, mdCodeInfoDTO.codeStatus) &&
        Objects.equals(this.codeValue, mdCodeInfoDTO.codeValue) &&
        Objects.equals(this.expireTime, mdCodeInfoDTO.expireTime) &&
        Objects.equals(this.timeStamp, mdCodeInfoDTO.timeStamp)&&
        Objects.equals(this.additionalProperties, mdCodeInfoDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeStatus, codeValue, expireTime, timeStamp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MdCodeInfoDTO {\n");
    sb.append("    codeStatus: ").append(toIndentedString(codeStatus)).append("\n");
    sb.append("    codeValue: ").append(toIndentedString(codeValue)).append("\n");
    sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("code_status");
    openapiFields.add("code_value");
    openapiFields.add("expire_time");
    openapiFields.add("time_stamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MdCodeInfoDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MdCodeInfoDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MdCodeInfoDTO is not found in the empty JSON string", MdCodeInfoDTO.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("code_status") != null && !jsonObj.get("code_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code_status").toString()));
      }
      if (jsonObj.get("code_value") != null && !jsonObj.get("code_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code_value").toString()));
      }
      if (jsonObj.get("expire_time") != null && !jsonObj.get("expire_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expire_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expire_time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MdCodeInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MdCodeInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MdCodeInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MdCodeInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<MdCodeInfoDTO>() {
           @Override
           public void write(JsonWriter out, MdCodeInfoDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public MdCodeInfoDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MdCodeInfoDTO instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MdCodeInfoDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MdCodeInfoDTO
  * @throws IOException if the JSON string is invalid with respect to MdCodeInfoDTO
  */
  public static MdCodeInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MdCodeInfoDTO.class);
  }

 /**
  * Convert an instance of MdCodeInfoDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

