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
 * AlipayUserCertdocCertverifyConsultResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayUserCertdocCertverifyConsultResponseModel {
  public static final String SERIALIZED_NAME_FAIL_PARAMS = "fail_params";
  @SerializedName(SERIALIZED_NAME_FAIL_PARAMS)
  private String failParams;

  public static final String SERIALIZED_NAME_FAIL_REASON = "fail_reason";
  @SerializedName(SERIALIZED_NAME_FAIL_REASON)
  private String failReason;

  public static final String SERIALIZED_NAME_PASSED = "passed";
  @SerializedName(SERIALIZED_NAME_PASSED)
  private String passed;

  public AlipayUserCertdocCertverifyConsultResponseModel() { 
  }

  public AlipayUserCertdocCertverifyConsultResponseModel failParams(String failParams) {
    
    this.failParams = failParams;
    return this;
  }

   /**
   * 具体哪些字段不一致。与预授权的输入字段对应，类型为字符串列表的JSON格式。
   * @return failParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"user_name\"]", value = "具体哪些字段不一致。与预授权的输入字段对应，类型为字符串列表的JSON格式。")

  public String getFailParams() {
    return failParams;
  }


  public void setFailParams(String failParams) {
    this.failParams = failParams;
  }


  public AlipayUserCertdocCertverifyConsultResponseModel failReason(String failReason) {
    
    this.failReason = failReason;
    return this;
  }

   /**
   * 校验不一致时，描述不一致的原因
   * @return failReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "姓名不一致", value = "校验不一致时，描述不一致的原因")

  public String getFailReason() {
    return failReason;
  }


  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  public AlipayUserCertdocCertverifyConsultResponseModel passed(String passed) {
    
    this.passed = passed;
    return this;
  }

   /**
   * 校验是否一致：T-一致、F-不一致
   * @return passed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "F", value = "校验是否一致：T-一致、F-不一致")

  public String getPassed() {
    return passed;
  }


  public void setPassed(String passed) {
    this.passed = passed;
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
   * @return the AlipayUserCertdocCertverifyConsultResponseModel instance itself
   */
  public AlipayUserCertdocCertverifyConsultResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayUserCertdocCertverifyConsultResponseModel alipayUserCertdocCertverifyConsultResponseModel = (AlipayUserCertdocCertverifyConsultResponseModel) o;
    return Objects.equals(this.failParams, alipayUserCertdocCertverifyConsultResponseModel.failParams) &&
        Objects.equals(this.failReason, alipayUserCertdocCertverifyConsultResponseModel.failReason) &&
        Objects.equals(this.passed, alipayUserCertdocCertverifyConsultResponseModel.passed)&&
        Objects.equals(this.additionalProperties, alipayUserCertdocCertverifyConsultResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failParams, failReason, passed, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayUserCertdocCertverifyConsultResponseModel {\n");
    sb.append("    failParams: ").append(toIndentedString(failParams)).append("\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
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
    openapiFields.add("fail_params");
    openapiFields.add("fail_reason");
    openapiFields.add("passed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayUserCertdocCertverifyConsultResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayUserCertdocCertverifyConsultResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayUserCertdocCertverifyConsultResponseModel is not found in the empty JSON string", AlipayUserCertdocCertverifyConsultResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("fail_params") != null && !jsonObj.get("fail_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fail_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fail_params").toString()));
      }
      if (jsonObj.get("fail_reason") != null && !jsonObj.get("fail_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fail_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fail_reason").toString()));
      }
      if (jsonObj.get("passed") != null && !jsonObj.get("passed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passed").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayUserCertdocCertverifyConsultResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayUserCertdocCertverifyConsultResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayUserCertdocCertverifyConsultResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayUserCertdocCertverifyConsultResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayUserCertdocCertverifyConsultResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayUserCertdocCertverifyConsultResponseModel value) throws IOException {
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
           public AlipayUserCertdocCertverifyConsultResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayUserCertdocCertverifyConsultResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayUserCertdocCertverifyConsultResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayUserCertdocCertverifyConsultResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayUserCertdocCertverifyConsultResponseModel
  */
  public static AlipayUserCertdocCertverifyConsultResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayUserCertdocCertverifyConsultResponseModel.class);
  }

 /**
  * Convert an instance of AlipayUserCertdocCertverifyConsultResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

