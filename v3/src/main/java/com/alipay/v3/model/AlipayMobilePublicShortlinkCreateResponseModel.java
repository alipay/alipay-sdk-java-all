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
 * AlipayMobilePublicShortlinkCreateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMobilePublicShortlinkCreateResponseModel {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private String msg;

  public static final String SERIALIZED_NAME_SHORTLINK = "shortlink";
  @SerializedName(SERIALIZED_NAME_SHORTLINK)
  private String shortlink;

  public AlipayMobilePublicShortlinkCreateResponseModel() { 
  }

  public AlipayMobilePublicShortlinkCreateResponseModel code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 结果码
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "结果码")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public AlipayMobilePublicShortlinkCreateResponseModel msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * 成功
   * @return msg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "结果信息", value = "成功")

  public String getMsg() {
    return msg;
  }


  public void setMsg(String msg) {
    this.msg = msg;
  }


  public AlipayMobilePublicShortlinkCreateResponseModel shortlink(String shortlink) {
    
    this.shortlink = shortlink;
    return this;
  }

   /**
   * 短链接url
   * @return shortlink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://t.alipay.com/I/Ev62jVRm", value = "短链接url")

  public String getShortlink() {
    return shortlink;
  }


  public void setShortlink(String shortlink) {
    this.shortlink = shortlink;
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
   * @return the AlipayMobilePublicShortlinkCreateResponseModel instance itself
   */
  public AlipayMobilePublicShortlinkCreateResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayMobilePublicShortlinkCreateResponseModel alipayMobilePublicShortlinkCreateResponseModel = (AlipayMobilePublicShortlinkCreateResponseModel) o;
    return Objects.equals(this.code, alipayMobilePublicShortlinkCreateResponseModel.code) &&
        Objects.equals(this.msg, alipayMobilePublicShortlinkCreateResponseModel.msg) &&
        Objects.equals(this.shortlink, alipayMobilePublicShortlinkCreateResponseModel.shortlink)&&
        Objects.equals(this.additionalProperties, alipayMobilePublicShortlinkCreateResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, msg, shortlink, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMobilePublicShortlinkCreateResponseModel {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    shortlink: ").append(toIndentedString(shortlink)).append("\n");
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
    openapiFields.add("msg");
    openapiFields.add("shortlink");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMobilePublicShortlinkCreateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMobilePublicShortlinkCreateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMobilePublicShortlinkCreateResponseModel is not found in the empty JSON string", AlipayMobilePublicShortlinkCreateResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("msg") != null && !jsonObj.get("msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msg").toString()));
      }
      if (jsonObj.get("shortlink") != null && !jsonObj.get("shortlink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortlink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortlink").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMobilePublicShortlinkCreateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMobilePublicShortlinkCreateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMobilePublicShortlinkCreateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMobilePublicShortlinkCreateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMobilePublicShortlinkCreateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMobilePublicShortlinkCreateResponseModel value) throws IOException {
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
           public AlipayMobilePublicShortlinkCreateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMobilePublicShortlinkCreateResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMobilePublicShortlinkCreateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMobilePublicShortlinkCreateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMobilePublicShortlinkCreateResponseModel
  */
  public static AlipayMobilePublicShortlinkCreateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMobilePublicShortlinkCreateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMobilePublicShortlinkCreateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

