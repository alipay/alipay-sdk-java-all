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
 * DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel {
  public static final String SERIALIZED_NAME_FAIL_REASON = "fail_reason";
  @SerializedName(SERIALIZED_NAME_FAIL_REASON)
  private String failReason;

  public static final String SERIALIZED_NAME_IDENTITY_INFO = "identity_info";
  @SerializedName(SERIALIZED_NAME_IDENTITY_INFO)
  private String identityInfo;

  public static final String SERIALIZED_NAME_MATERIAL_INFO = "material_info";
  @SerializedName(SERIALIZED_NAME_MATERIAL_INFO)
  private String materialInfo;

  public static final String SERIALIZED_NAME_PASSED = "passed";
  @SerializedName(SERIALIZED_NAME_PASSED)
  private String passed;

  public DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel() { 
  }

  public DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel failReason(String failReason) {
    
    this.failReason = failReason;
    return this;
  }

   /**
   * 认证错误原因，扩展字段，默认不返回
   * @return failReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Z1147", value = "认证错误原因，扩展字段，默认不返回")

  public String getFailReason() {
    return failReason;
  }


  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  public DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel identityInfo(String identityInfo) {
    
    this.identityInfo = identityInfo;
    return this;
  }

   /**
   * 刷脸用户的身份信息，目前返回为空
   * @return identityInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "刷脸用户的身份信息，目前返回为空")

  public String getIdentityInfo() {
    return identityInfo;
  }


  public void setIdentityInfo(String identityInfo) {
    this.identityInfo = identityInfo;
  }


  public DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel materialInfo(String materialInfo) {
    
    this.materialInfo = materialInfo;
    return this;
  }

   /**
   * 认证主体附件信息，主要为图片类材料，一般的认证场景都是返回空
   * @return materialInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "认证主体附件信息，主要为图片类材料，一般的认证场景都是返回空")

  public String getMaterialInfo() {
    return materialInfo;
  }


  public void setMaterialInfo(String materialInfo) {
    this.materialInfo = materialInfo;
  }


  public DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel passed(String passed) {
    
    this.passed = passed;
    return this;
  }

   /**
   * 是否通过，通过为T，不通过为F
   * @return passed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T", value = "是否通过，通过为T，不通过为F")

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
   * @return the DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel instance itself
   */
  public DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel datadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel = (DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel) o;
    return Objects.equals(this.failReason, datadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.failReason) &&
        Objects.equals(this.identityInfo, datadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.identityInfo) &&
        Objects.equals(this.materialInfo, datadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.materialInfo) &&
        Objects.equals(this.passed, datadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.passed)&&
        Objects.equals(this.additionalProperties, datadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failReason, identityInfo, materialInfo, passed, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel {\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
    sb.append("    identityInfo: ").append(toIndentedString(identityInfo)).append("\n");
    sb.append("    materialInfo: ").append(toIndentedString(materialInfo)).append("\n");
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
    openapiFields.add("fail_reason");
    openapiFields.add("identity_info");
    openapiFields.add("material_info");
    openapiFields.add("passed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel is not found in the empty JSON string", DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("fail_reason") != null && !jsonObj.get("fail_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fail_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fail_reason").toString()));
      }
      if (jsonObj.get("identity_info") != null && !jsonObj.get("identity_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_info").toString()));
      }
      if (jsonObj.get("material_info") != null && !jsonObj.get("material_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `material_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("material_info").toString()));
      }
      if (jsonObj.get("passed") != null && !jsonObj.get("passed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passed").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel value) throws IOException {
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
           public DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel
  */
  public static DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel.class);
  }

 /**
  * Convert an instance of DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

