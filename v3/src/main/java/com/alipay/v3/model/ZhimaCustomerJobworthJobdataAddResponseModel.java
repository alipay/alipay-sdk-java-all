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
 * ZhimaCustomerJobworthJobdataAddResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCustomerJobworthJobdataAddResponseModel {
  public static final String SERIALIZED_NAME_ACCEPTANCE_ID = "acceptance_id";
  @SerializedName(SERIALIZED_NAME_ACCEPTANCE_ID)
  private String acceptanceId;

  public static final String SERIALIZED_NAME_SUB_CODE = "sub_code";
  @SerializedName(SERIALIZED_NAME_SUB_CODE)
  private String subCode;

  public static final String SERIALIZED_NAME_SUB_MSG = "sub_msg";
  @SerializedName(SERIALIZED_NAME_SUB_MSG)
  private String subMsg;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public ZhimaCustomerJobworthJobdataAddResponseModel() { 
  }

  public ZhimaCustomerJobworthJobdataAddResponseModel acceptanceId(String acceptanceId) {
    
    this.acceptanceId = acceptanceId;
    return this;
  }

   /**
   * 受理台单号，用来调用工作证受理台
   * @return acceptanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcd1234", value = "受理台单号，用来调用工作证受理台")

  public String getAcceptanceId() {
    return acceptanceId;
  }


  public void setAcceptanceId(String acceptanceId) {
    this.acceptanceId = acceptanceId;
  }


  public ZhimaCustomerJobworthJobdataAddResponseModel subCode(String subCode) {
    
    this.subCode = subCode;
    return this;
  }

   /**
   * 错误码
   * @return subCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INVALID_PARAMETER", value = "错误码")

  public String getSubCode() {
    return subCode;
  }


  public void setSubCode(String subCode) {
    this.subCode = subCode;
  }


  public ZhimaCustomerJobworthJobdataAddResponseModel subMsg(String subMsg) {
    
    this.subMsg = subMsg;
    return this;
  }

   /**
   * 业务中文结果信息
   * @return subMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "参数有误", value = "业务中文结果信息")

  public String getSubMsg() {
    return subMsg;
  }


  public void setSubMsg(String subMsg) {
    this.subMsg = subMsg;
  }


  public ZhimaCustomerJobworthJobdataAddResponseModel url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 职得工作证跳转小程序链接
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://www.123.com?XXX", value = "职得工作证跳转小程序链接")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
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
   * @return the ZhimaCustomerJobworthJobdataAddResponseModel instance itself
   */
  public ZhimaCustomerJobworthJobdataAddResponseModel putAdditionalProperty(String key, Object value) {
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
    ZhimaCustomerJobworthJobdataAddResponseModel zhimaCustomerJobworthJobdataAddResponseModel = (ZhimaCustomerJobworthJobdataAddResponseModel) o;
    return Objects.equals(this.acceptanceId, zhimaCustomerJobworthJobdataAddResponseModel.acceptanceId) &&
        Objects.equals(this.subCode, zhimaCustomerJobworthJobdataAddResponseModel.subCode) &&
        Objects.equals(this.subMsg, zhimaCustomerJobworthJobdataAddResponseModel.subMsg) &&
        Objects.equals(this.url, zhimaCustomerJobworthJobdataAddResponseModel.url)&&
        Objects.equals(this.additionalProperties, zhimaCustomerJobworthJobdataAddResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptanceId, subCode, subMsg, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCustomerJobworthJobdataAddResponseModel {\n");
    sb.append("    acceptanceId: ").append(toIndentedString(acceptanceId)).append("\n");
    sb.append("    subCode: ").append(toIndentedString(subCode)).append("\n");
    sb.append("    subMsg: ").append(toIndentedString(subMsg)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("acceptance_id");
    openapiFields.add("sub_code");
    openapiFields.add("sub_msg");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCustomerJobworthJobdataAddResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCustomerJobworthJobdataAddResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCustomerJobworthJobdataAddResponseModel is not found in the empty JSON string", ZhimaCustomerJobworthJobdataAddResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("acceptance_id") != null && !jsonObj.get("acceptance_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acceptance_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acceptance_id").toString()));
      }
      if (jsonObj.get("sub_code") != null && !jsonObj.get("sub_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_code").toString()));
      }
      if (jsonObj.get("sub_msg") != null && !jsonObj.get("sub_msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_msg").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCustomerJobworthJobdataAddResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCustomerJobworthJobdataAddResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCustomerJobworthJobdataAddResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCustomerJobworthJobdataAddResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCustomerJobworthJobdataAddResponseModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCustomerJobworthJobdataAddResponseModel value) throws IOException {
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
           public ZhimaCustomerJobworthJobdataAddResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ZhimaCustomerJobworthJobdataAddResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ZhimaCustomerJobworthJobdataAddResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCustomerJobworthJobdataAddResponseModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCustomerJobworthJobdataAddResponseModel
  */
  public static ZhimaCustomerJobworthJobdataAddResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCustomerJobworthJobdataAddResponseModel.class);
  }

 /**
  * Convert an instance of ZhimaCustomerJobworthJobdataAddResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

