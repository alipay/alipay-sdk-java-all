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
import com.alipay.v3.model.Data;
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
 * AlipayMobilePublicFollowListResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMobilePublicFollowListResponseModel {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private String count;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Data data;

  public static final String SERIALIZED_NAME_NEXT_ALIPAY_USER_ID = "next_alipay_user_id";
  @SerializedName(SERIALIZED_NAME_NEXT_ALIPAY_USER_ID)
  private String nextAlipayUserId;

  public static final String SERIALIZED_NAME_NEXT_USER_ID = "next_user_id";
  @SerializedName(SERIALIZED_NAME_NEXT_USER_ID)
  private String nextUserId;

  public AlipayMobilePublicFollowListResponseModel() { 
  }

  public AlipayMobilePublicFollowListResponseModel code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * 返回结果码，如200，标识成功
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "返回结果码，如200，标识成功")

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public AlipayMobilePublicFollowListResponseModel count(String count) {
    
    this.count = count;
    return this;
  }

   /**
   * 当前组的值
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "当前组的值")

  public String getCount() {
    return count;
  }


  public void setCount(String count) {
    this.count = count;
  }


  public AlipayMobilePublicFollowListResponseModel data(Data data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Data getData() {
    return data;
  }


  public void setData(Data data) {
    this.data = data;
  }


  public AlipayMobilePublicFollowListResponseModel nextAlipayUserId(String nextAlipayUserId) {
    
    this.nextAlipayUserId = nextAlipayUserId;
    return this;
  }

   /**
   * 与nextUserId对应，标准Alipay UserId
   * @return nextAlipayUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102146158132", value = "与nextUserId对应，标准Alipay UserId")

  public String getNextAlipayUserId() {
    return nextAlipayUserId;
  }


  public void setNextAlipayUserId(String nextAlipayUserId) {
    this.nextAlipayUserId = nextAlipayUserId;
  }


  public AlipayMobilePublicFollowListResponseModel nextUserId(String nextUserId) {
    
    this.nextUserId = nextUserId;
    return this;
  }

   /**
   * 查询分组的userid
   * @return nextUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102123322367", value = "查询分组的userid")

  public String getNextUserId() {
    return nextUserId;
  }


  public void setNextUserId(String nextUserId) {
    this.nextUserId = nextUserId;
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
   * @return the AlipayMobilePublicFollowListResponseModel instance itself
   */
  public AlipayMobilePublicFollowListResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayMobilePublicFollowListResponseModel alipayMobilePublicFollowListResponseModel = (AlipayMobilePublicFollowListResponseModel) o;
    return Objects.equals(this.code, alipayMobilePublicFollowListResponseModel.code) &&
        Objects.equals(this.count, alipayMobilePublicFollowListResponseModel.count) &&
        Objects.equals(this.data, alipayMobilePublicFollowListResponseModel.data) &&
        Objects.equals(this.nextAlipayUserId, alipayMobilePublicFollowListResponseModel.nextAlipayUserId) &&
        Objects.equals(this.nextUserId, alipayMobilePublicFollowListResponseModel.nextUserId)&&
        Objects.equals(this.additionalProperties, alipayMobilePublicFollowListResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, count, data, nextAlipayUserId, nextUserId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMobilePublicFollowListResponseModel {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    nextAlipayUserId: ").append(toIndentedString(nextAlipayUserId)).append("\n");
    sb.append("    nextUserId: ").append(toIndentedString(nextUserId)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("count");
    openapiFields.add("data");
    openapiFields.add("next_alipay_user_id");
    openapiFields.add("next_user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMobilePublicFollowListResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMobilePublicFollowListResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMobilePublicFollowListResponseModel is not found in the empty JSON string", AlipayMobilePublicFollowListResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("count") != null && !jsonObj.get("count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("count").toString()));
      }
      // validate the optional field `data`
      if (jsonObj.getAsJsonObject("data") != null) {
        Data.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
      if (jsonObj.get("next_alipay_user_id") != null && !jsonObj.get("next_alipay_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_alipay_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_alipay_user_id").toString()));
      }
      if (jsonObj.get("next_user_id") != null && !jsonObj.get("next_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMobilePublicFollowListResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMobilePublicFollowListResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMobilePublicFollowListResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMobilePublicFollowListResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMobilePublicFollowListResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMobilePublicFollowListResponseModel value) throws IOException {
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
           public AlipayMobilePublicFollowListResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMobilePublicFollowListResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMobilePublicFollowListResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMobilePublicFollowListResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMobilePublicFollowListResponseModel
  */
  public static AlipayMobilePublicFollowListResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMobilePublicFollowListResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMobilePublicFollowListResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

