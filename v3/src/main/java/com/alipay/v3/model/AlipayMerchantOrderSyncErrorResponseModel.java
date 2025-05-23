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
 * AlipayMerchantOrderSyncErrorResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMerchantOrderSyncErrorResponseModel {
  /**
   * 错误码
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    SYSTEM_ERROR("SYSTEM_ERROR"),
    
    INVALID_PARAMETER("INVALID_PARAMETER"),
    
    MATERIAL_ID_ILLEGAL("MATERIAL_ID_ILLEGAL"),
    
    CONTENT_ILLEGAL("CONTENT_ILLEGAL"),
    
    TINY_APP_ID_NULL("TINY_APP_ID_NULL"),
    
    TINY_APP_ID_ILLEGAL("TINY_APP_ID_ILLEGAL"),
    
    LOGISTICS_INFO_EXIST("LOGISTICS_INFO_EXIST"),
    
    TRADE_NOT_EXIST("TRADE_NOT_EXIST"),
    
    ITEM_INFO_NOT_COMPLETE("ITEM_INFO_NOT_COMPLETE"),
    
    NO_PERMISSOON("NO_PERMISSOON"),
    
    ORDER_ERROR_STATUS("ORDER_ERROR_STATUS"),
    
    LOGISTICS_SIZE_LARGE("LOGISTICS_SIZE_LARGE"),
    
    ITEM_HAS_EXIST("ITEM_HAS_EXIST"),
    
    AMOUNT_ILLEGAL("AMOUNT_ILLEGAL"),
    
    RECORD_NOT_EXIST("RECORD_NOT_EXIST"),
    
    DATA_INCONSISTENT("DATA_INCONSISTENT"),
    
    ITEM_DUPLICATED("ITEM_DUPLICATED"),
    
    BUYER_STATUS_ERROR("BUYER_STATUS_ERROR"),
    
    RECORD_ID_IS_NULL("RECORD_ID_IS_NULL"),
    
    OUT_BIZ_NO_IS_NULL("OUT_BIZ_NO_IS_NULL"),
    
    BUYER_ID_IS_NULL("BUYER_ID_IS_NULL"),
    
    BUYER_INFO_IS_NULL("BUYER_INFO_IS_NULL"),
    
    BUYER_NAME_IS_NULL("BUYER_NAME_IS_NULL"),
    
    BUYER_MOBILE_ILLEGAL("BUYER_MOBILE_ILLEGAL"),
    
    BUYER_MOBILE_IS_NULL("BUYER_MOBILE_IS_NULL"),
    
    BUYER_CERT_NO_IS_NULL("BUYER_CERT_NO_IS_NULL"),
    
    SELLER_ID_IS_NULL("SELLER_ID_IS_NULL"),
    
    AMOUNT_IS_NULL("AMOUNT_IS_NULL"),
    
    PAY_AMOUNT_IS_NULL("PAY_AMOUNT_IS_NULL"),
    
    PAY_TIMEOUT_EXPRESS_ILLEGAL("PAY_TIMEOUT_EXPRESS_ILLEGAL"),
    
    MERCHANT_ORDER_STATUS_ILLEGAL("MERCHANT_ORDER_STATUS_ILLEGAL"),
    
    BUYER_NOT_FOUND("BUYER_NOT_FOUND"),
    
    BUYER_INFO_ERROR("BUYER_INFO_ERROR"),
    
    RECORD_ID_ILLEGAL("RECORD_ID_ILLEGAL"),
    
    MINICENTER_INVOKE_ERROR("MINICENTER_INVOKE_ERROR"),
    
    MERCHANT_LINK_EXIST("MERCHANT_LINK_EXIST"),
    
    ARGUMENT_NULL("ARGUMENT_NULL"),
    
    PAY_CHANNEL_IS_NULL("PAY_CHANNEL_IS_NULL"),
    
    PAY_CHANNEL_ERROR("PAY_CHANNEL_ERROR"),
    
    TRADE_NO_NOT_MATCH("TRADE_NO_NOT_MATCH"),
    
    INFO_SEC_ERROR("INFO_SEC_ERROR"),
    
    ITEM_NOT_MATCH("ITEM_NOT_MATCH"),
    
    TINY_APP_IS_NOT_ONLINE("TINY_APP_IS_NOT_ONLINE"),
    
    TINY_APP_ID_NOT_SYNC_EQUAL_TRADE("TINY_APP_ID_NOT_SYNC_EQUAL_TRADE"),
    
    DATA_ACCESS_EXCEPTION("DATA_ACCESS_EXCEPTION"),
    
    INVALID_ORDER_AUTH_CODE("INVALID_ORDER_AUTH_CODE"),
    
    SERVICE_REFUSED("SERVICE_REFUSED"),
    
    DUPLICATE_REQUEST("DUPLICATE_REQUEST"),
    
    NO_NEED_RETRY_ERROR("NO_NEED_RETRY_ERROR"),
    
    SERVICE_CODE_STATUS_ERROR("SERVICE_CODE_STATUS_ERROR"),
    
    USER_NOT_AUTHORIZED("USER_NOT_AUTHORIZED");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private CodeEnum code;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private String links;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public AlipayMerchantOrderSyncErrorResponseModel() { 
  }

  public AlipayMerchantOrderSyncErrorResponseModel code(CodeEnum code) {
    
    this.code = code;
    return this;
  }

   /**
   * 错误码
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "错误码")

  public CodeEnum getCode() {
    return code;
  }


  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public AlipayMerchantOrderSyncErrorResponseModel links(String links) {
    
    this.links = links;
    return this;
  }

   /**
   * 解决方案链接
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "解决方案链接")

  public String getLinks() {
    return links;
  }


  public void setLinks(String links) {
    this.links = links;
  }


  public AlipayMerchantOrderSyncErrorResponseModel message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 错误描述
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "错误描述")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
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
   * @return the AlipayMerchantOrderSyncErrorResponseModel instance itself
   */
  public AlipayMerchantOrderSyncErrorResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayMerchantOrderSyncErrorResponseModel alipayMerchantOrderSyncErrorResponseModel = (AlipayMerchantOrderSyncErrorResponseModel) o;
    return Objects.equals(this.code, alipayMerchantOrderSyncErrorResponseModel.code) &&
        Objects.equals(this.links, alipayMerchantOrderSyncErrorResponseModel.links) &&
        Objects.equals(this.message, alipayMerchantOrderSyncErrorResponseModel.message)&&
        Objects.equals(this.additionalProperties, alipayMerchantOrderSyncErrorResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, links, message, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMerchantOrderSyncErrorResponseModel {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("links");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    // openapiRequiredFields.add("code");
    // openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMerchantOrderSyncErrorResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMerchantOrderSyncErrorResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMerchantOrderSyncErrorResponseModel is not found in the empty JSON string", AlipayMerchantOrderSyncErrorResponseModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AlipayMerchantOrderSyncErrorResponseModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `links` to be a primitive type in the JSON string but got `%s`", jsonObj.get("links").toString()));
      }
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMerchantOrderSyncErrorResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMerchantOrderSyncErrorResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMerchantOrderSyncErrorResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMerchantOrderSyncErrorResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMerchantOrderSyncErrorResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMerchantOrderSyncErrorResponseModel value) throws IOException {
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
           public AlipayMerchantOrderSyncErrorResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMerchantOrderSyncErrorResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMerchantOrderSyncErrorResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMerchantOrderSyncErrorResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMerchantOrderSyncErrorResponseModel
  */
  public static AlipayMerchantOrderSyncErrorResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMerchantOrderSyncErrorResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMerchantOrderSyncErrorResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

