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
 * IdentityVerifiedInfoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IdentityVerifiedInfoDTO {
  public static final String SERIALIZED_NAME_CERT_NO = "cert_no";
  @SerializedName(SERIALIZED_NAME_CERT_NO)
  private String certNo;

  public static final String SERIALIZED_NAME_CERT_TYPE = "cert_type";
  @SerializedName(SERIALIZED_NAME_CERT_TYPE)
  private String certType;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public IdentityVerifiedInfoDTO() { 
  }

  public IdentityVerifiedInfoDTO certNo(String certNo) {
    
    this.certNo = certNo;
    return this;
  }

   /**
   * MD5加密处理后的证件号
   * @return certNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "D61DCDD393C885BBA0091B7B57A71208", value = "MD5加密处理后的证件号")

  public String getCertNo() {
    return certNo;
  }


  public void setCertNo(String certNo) {
    this.certNo = certNo;
  }


  public IdentityVerifiedInfoDTO certType(String certType) {
    
    this.certType = certType;
    return this;
  }

   /**
   * 证件类型。暂仅支持 IDENTITY_CARD （身份证）
   * @return certType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IDENTITY_CARD", value = "证件类型。暂仅支持 IDENTITY_CARD （身份证）")

  public String getCertType() {
    return certType;
  }


  public void setCertType(String certType) {
    this.certType = certType;
  }


  public IdentityVerifiedInfoDTO userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * 用户的真实姓名
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "用户的真实姓名")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
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
   * @return the IdentityVerifiedInfoDTO instance itself
   */
  public IdentityVerifiedInfoDTO putAdditionalProperty(String key, Object value) {
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
    IdentityVerifiedInfoDTO identityVerifiedInfoDTO = (IdentityVerifiedInfoDTO) o;
    return Objects.equals(this.certNo, identityVerifiedInfoDTO.certNo) &&
        Objects.equals(this.certType, identityVerifiedInfoDTO.certType) &&
        Objects.equals(this.userName, identityVerifiedInfoDTO.userName)&&
        Objects.equals(this.additionalProperties, identityVerifiedInfoDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certNo, certType, userName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerifiedInfoDTO {\n");
    sb.append("    certNo: ").append(toIndentedString(certNo)).append("\n");
    sb.append("    certType: ").append(toIndentedString(certType)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
    openapiFields.add("cert_no");
    openapiFields.add("cert_type");
    openapiFields.add("user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IdentityVerifiedInfoDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IdentityVerifiedInfoDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdentityVerifiedInfoDTO is not found in the empty JSON string", IdentityVerifiedInfoDTO.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("cert_no") != null && !jsonObj.get("cert_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_no").toString()));
      }
      if (jsonObj.get("cert_type") != null && !jsonObj.get("cert_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_type").toString()));
      }
      if (jsonObj.get("user_name") != null && !jsonObj.get("user_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdentityVerifiedInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdentityVerifiedInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdentityVerifiedInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdentityVerifiedInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<IdentityVerifiedInfoDTO>() {
           @Override
           public void write(JsonWriter out, IdentityVerifiedInfoDTO value) throws IOException {
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
           public IdentityVerifiedInfoDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IdentityVerifiedInfoDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IdentityVerifiedInfoDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdentityVerifiedInfoDTO
  * @throws IOException if the JSON string is invalid with respect to IdentityVerifiedInfoDTO
  */
  public static IdentityVerifiedInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdentityVerifiedInfoDTO.class);
  }

 /**
  * Convert an instance of IdentityVerifiedInfoDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

