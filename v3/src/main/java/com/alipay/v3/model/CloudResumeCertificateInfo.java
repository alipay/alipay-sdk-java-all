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
 * CloudResumeCertificateInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CloudResumeCertificateInfo {
  public static final String SERIALIZED_NAME_CERTIFICATE_CERT_LEVEL = "certificate_cert_level";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_CERT_LEVEL)
  private String certificateCertLevel;

  public static final String SERIALIZED_NAME_CERTIFICATE_NAME = "certificate_name";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_NAME)
  private String certificateName;

  public static final String SERIALIZED_NAME_CERTIFICATE_SEND_CARD_ADDRESS = "certificate_send_card_address";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_SEND_CARD_ADDRESS)
  private String certificateSendCardAddress;

  public static final String SERIALIZED_NAME_CERTIFICATE_VERIFY_STATUS = "certificate_verify_status";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_VERIFY_STATUS)
  private String certificateVerifyStatus;

  public static final String SERIALIZED_NAME_IN_VALIDITY_PERIOD = "in_validity_period";
  @SerializedName(SERIALIZED_NAME_IN_VALIDITY_PERIOD)
  private String inValidityPeriod;

  public CloudResumeCertificateInfo() { 
  }

  public CloudResumeCertificateInfo certificateCertLevel(String certificateCertLevel) {
    
    this.certificateCertLevel = certificateCertLevel;
    return this;
  }

   /**
   * 证书等级
   * @return certificateCertLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "证书等级", value = "证书等级")

  public String getCertificateCertLevel() {
    return certificateCertLevel;
  }


  public void setCertificateCertLevel(String certificateCertLevel) {
    this.certificateCertLevel = certificateCertLevel;
  }


  public CloudResumeCertificateInfo certificateName(String certificateName) {
    
    this.certificateName = certificateName;
    return this;
  }

   /**
   * 证书名称
   * @return certificateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "证书名称", value = "证书名称")

  public String getCertificateName() {
    return certificateName;
  }


  public void setCertificateName(String certificateName) {
    this.certificateName = certificateName;
  }


  public CloudResumeCertificateInfo certificateSendCardAddress(String certificateSendCardAddress) {
    
    this.certificateSendCardAddress = certificateSendCardAddress;
    return this;
  }

   /**
   * 发证机构
   * @return certificateSendCardAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "发证机构", value = "发证机构")

  public String getCertificateSendCardAddress() {
    return certificateSendCardAddress;
  }


  public void setCertificateSendCardAddress(String certificateSendCardAddress) {
    this.certificateSendCardAddress = certificateSendCardAddress;
  }


  public CloudResumeCertificateInfo certificateVerifyStatus(String certificateVerifyStatus) {
    
    this.certificateVerifyStatus = certificateVerifyStatus;
    return this;
  }

   /**
   * UNPROMISED&#x3D;未承诺 PROMISED&#x3D;已承诺 VERFIED&#x3D;已验真 UNVERIFIED&#x3D;验证未通过
   * @return certificateVerifyStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VERFIED", value = "UNPROMISED=未承诺 PROMISED=已承诺 VERFIED=已验真 UNVERIFIED=验证未通过")

  public String getCertificateVerifyStatus() {
    return certificateVerifyStatus;
  }


  public void setCertificateVerifyStatus(String certificateVerifyStatus) {
    this.certificateVerifyStatus = certificateVerifyStatus;
  }


  public CloudResumeCertificateInfo inValidityPeriod(String inValidityPeriod) {
    
    this.inValidityPeriod = inValidityPeriod;
    return this;
  }

   /**
   * VALID&#x3D;有效 INVALID&#x3D;失效 UNKNOWN&#x3D;未知
   * @return inValidityPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "UNKNOWN", value = "VALID=有效 INVALID=失效 UNKNOWN=未知")

  public String getInValidityPeriod() {
    return inValidityPeriod;
  }


  public void setInValidityPeriod(String inValidityPeriod) {
    this.inValidityPeriod = inValidityPeriod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudResumeCertificateInfo cloudResumeCertificateInfo = (CloudResumeCertificateInfo) o;
    return Objects.equals(this.certificateCertLevel, cloudResumeCertificateInfo.certificateCertLevel) &&
        Objects.equals(this.certificateName, cloudResumeCertificateInfo.certificateName) &&
        Objects.equals(this.certificateSendCardAddress, cloudResumeCertificateInfo.certificateSendCardAddress) &&
        Objects.equals(this.certificateVerifyStatus, cloudResumeCertificateInfo.certificateVerifyStatus) &&
        Objects.equals(this.inValidityPeriod, cloudResumeCertificateInfo.inValidityPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateCertLevel, certificateName, certificateSendCardAddress, certificateVerifyStatus, inValidityPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudResumeCertificateInfo {\n");
    sb.append("    certificateCertLevel: ").append(toIndentedString(certificateCertLevel)).append("\n");
    sb.append("    certificateName: ").append(toIndentedString(certificateName)).append("\n");
    sb.append("    certificateSendCardAddress: ").append(toIndentedString(certificateSendCardAddress)).append("\n");
    sb.append("    certificateVerifyStatus: ").append(toIndentedString(certificateVerifyStatus)).append("\n");
    sb.append("    inValidityPeriod: ").append(toIndentedString(inValidityPeriod)).append("\n");
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
    openapiFields.add("certificate_cert_level");
    openapiFields.add("certificate_name");
    openapiFields.add("certificate_send_card_address");
    openapiFields.add("certificate_verify_status");
    openapiFields.add("in_validity_period");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CloudResumeCertificateInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CloudResumeCertificateInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudResumeCertificateInfo is not found in the empty JSON string", CloudResumeCertificateInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CloudResumeCertificateInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudResumeCertificateInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("certificate_cert_level") != null && !jsonObj.get("certificate_cert_level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_cert_level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate_cert_level").toString()));
      }
      if (jsonObj.get("certificate_name") != null && !jsonObj.get("certificate_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate_name").toString()));
      }
      if (jsonObj.get("certificate_send_card_address") != null && !jsonObj.get("certificate_send_card_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_send_card_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate_send_card_address").toString()));
      }
      if (jsonObj.get("certificate_verify_status") != null && !jsonObj.get("certificate_verify_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_verify_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate_verify_status").toString()));
      }
      if (jsonObj.get("in_validity_period") != null && !jsonObj.get("in_validity_period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `in_validity_period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("in_validity_period").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudResumeCertificateInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudResumeCertificateInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudResumeCertificateInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudResumeCertificateInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudResumeCertificateInfo>() {
           @Override
           public void write(JsonWriter out, CloudResumeCertificateInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudResumeCertificateInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CloudResumeCertificateInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloudResumeCertificateInfo
  * @throws IOException if the JSON string is invalid with respect to CloudResumeCertificateInfo
  */
  public static CloudResumeCertificateInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudResumeCertificateInfo.class);
  }

 /**
  * Convert an instance of CloudResumeCertificateInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

