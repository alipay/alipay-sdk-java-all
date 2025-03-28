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
 * OpenCertifyIdentifyInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OpenCertifyIdentifyInfo {
  public static final String SERIALIZED_NAME_CERT_NAME = "cert_name";
  @SerializedName(SERIALIZED_NAME_CERT_NAME)
  private String certName;

  public static final String SERIALIZED_NAME_CERT_NO = "cert_no";
  @SerializedName(SERIALIZED_NAME_CERT_NO)
  private String certNo;

  public static final String SERIALIZED_NAME_CERT_TYPE = "cert_type";
  @SerializedName(SERIALIZED_NAME_CERT_TYPE)
  private String certType;

  public static final String SERIALIZED_NAME_IDENTITY_TYPE = "identity_type";
  @SerializedName(SERIALIZED_NAME_IDENTITY_TYPE)
  private String identityType;

  public static final String SERIALIZED_NAME_PHONE_NO = "phone_no";
  @SerializedName(SERIALIZED_NAME_PHONE_NO)
  private String phoneNo;

  public OpenCertifyIdentifyInfo() { 
  }

  public OpenCertifyIdentifyInfo certName(String certName) {
    
    this.certName = certName;
    return this;
  }

   /**
   * 填入真实姓名
   * @return certName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "填入真实姓名")

  public String getCertName() {
    return certName;
  }


  public void setCertName(String certName) {
    this.certName = certName;
  }


  public OpenCertifyIdentifyInfo certNo(String certNo) {
    
    this.certNo = certNo;
    return this;
  }

   /**
   * 填入姓名相匹配的证件号码
   * @return certNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "260104197909275964", value = "填入姓名相匹配的证件号码")

  public String getCertNo() {
    return certNo;
  }


  public void setCertNo(String certNo) {
    this.certNo = certNo;
  }


  public OpenCertifyIdentifyInfo certType(String certType) {
    
    this.certType = certType;
    return this;
  }

   /**
   * 当前仅支持IDENTITY_CARD
   * @return certType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IDENTITY_CARD", value = "当前仅支持IDENTITY_CARD")

  public String getCertType() {
    return certType;
  }


  public void setCertType(String certType) {
    this.certType = certType;
  }


  public OpenCertifyIdentifyInfo identityType(String identityType) {
    
    this.identityType = identityType;
    return this;
  }

   /**
   * 当前仅支持CERT_INFO
   * @return identityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CERT_INFO", value = "当前仅支持CERT_INFO")

  public String getIdentityType() {
    return identityType;
  }


  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }


  public OpenCertifyIdentifyInfo phoneNo(String phoneNo) {
    
    this.phoneNo = phoneNo;
    return this;
  }

   /**
   * 选填手机号
   * @return phoneNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13000000000", value = "选填手机号")

  public String getPhoneNo() {
    return phoneNo;
  }


  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
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
   * @return the OpenCertifyIdentifyInfo instance itself
   */
  public OpenCertifyIdentifyInfo putAdditionalProperty(String key, Object value) {
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
    OpenCertifyIdentifyInfo openCertifyIdentifyInfo = (OpenCertifyIdentifyInfo) o;
    return Objects.equals(this.certName, openCertifyIdentifyInfo.certName) &&
        Objects.equals(this.certNo, openCertifyIdentifyInfo.certNo) &&
        Objects.equals(this.certType, openCertifyIdentifyInfo.certType) &&
        Objects.equals(this.identityType, openCertifyIdentifyInfo.identityType) &&
        Objects.equals(this.phoneNo, openCertifyIdentifyInfo.phoneNo)&&
        Objects.equals(this.additionalProperties, openCertifyIdentifyInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certName, certNo, certType, identityType, phoneNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenCertifyIdentifyInfo {\n");
    sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
    sb.append("    certNo: ").append(toIndentedString(certNo)).append("\n");
    sb.append("    certType: ").append(toIndentedString(certType)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    phoneNo: ").append(toIndentedString(phoneNo)).append("\n");
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
    openapiFields.add("cert_name");
    openapiFields.add("cert_no");
    openapiFields.add("cert_type");
    openapiFields.add("identity_type");
    openapiFields.add("phone_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OpenCertifyIdentifyInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OpenCertifyIdentifyInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenCertifyIdentifyInfo is not found in the empty JSON string", OpenCertifyIdentifyInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("cert_name") != null && !jsonObj.get("cert_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_name").toString()));
      }
      if (jsonObj.get("cert_no") != null && !jsonObj.get("cert_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_no").toString()));
      }
      if (jsonObj.get("cert_type") != null && !jsonObj.get("cert_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_type").toString()));
      }
      if (jsonObj.get("identity_type") != null && !jsonObj.get("identity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_type").toString()));
      }
      if (jsonObj.get("phone_no") != null && !jsonObj.get("phone_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenCertifyIdentifyInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenCertifyIdentifyInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenCertifyIdentifyInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenCertifyIdentifyInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenCertifyIdentifyInfo>() {
           @Override
           public void write(JsonWriter out, OpenCertifyIdentifyInfo value) throws IOException {
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
           public OpenCertifyIdentifyInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OpenCertifyIdentifyInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OpenCertifyIdentifyInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpenCertifyIdentifyInfo
  * @throws IOException if the JSON string is invalid with respect to OpenCertifyIdentifyInfo
  */
  public static OpenCertifyIdentifyInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenCertifyIdentifyInfo.class);
  }

 /**
  * Convert an instance of OpenCertifyIdentifyInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

