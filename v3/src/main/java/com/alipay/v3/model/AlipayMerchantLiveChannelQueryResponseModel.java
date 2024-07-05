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
 * AlipayMerchantLiveChannelQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMerchantLiveChannelQueryResponseModel {
  public static final String SERIALIZED_NAME_CHANNEL_CONTENT = "channel_content";
  @SerializedName(SERIALIZED_NAME_CHANNEL_CONTENT)
  private String channelContent;

  public static final String SERIALIZED_NAME_CHANNEL_IDENTITY = "channel_identity";
  @SerializedName(SERIALIZED_NAME_CHANNEL_IDENTITY)
  private String channelIdentity;

  public static final String SERIALIZED_NAME_CHANNEL_SECRET = "channel_secret";
  @SerializedName(SERIALIZED_NAME_CHANNEL_SECRET)
  private String channelSecret;

  public static final String SERIALIZED_NAME_CHANNEL_TYPE = "channel_type";
  @SerializedName(SERIALIZED_NAME_CHANNEL_TYPE)
  private String channelType;

  public AlipayMerchantLiveChannelQueryResponseModel() { 
  }

  public AlipayMerchantLiveChannelQueryResponseModel channelContent(String channelContent) {
    
    this.channelContent = channelContent;
    return this;
  }

   /**
   * 渠道内容，包含主播、文章的上游信息。字符串内容为Map，需要转换
   * @return channelContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "渠道内容，包含主播、文章的上游信息。字符串内容为Map，需要转换")

  public String getChannelContent() {
    return channelContent;
  }


  public void setChannelContent(String channelContent) {
    this.channelContent = channelContent;
  }


  public AlipayMerchantLiveChannelQueryResponseModel channelIdentity(String channelIdentity) {
    
    this.channelIdentity = channelIdentity;
    return this;
  }

   /**
   * 渠道业务标识
   * @return channelIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A202212020736054901000799_2292541656", value = "渠道业务标识")

  public String getChannelIdentity() {
    return channelIdentity;
  }


  public void setChannelIdentity(String channelIdentity) {
    this.channelIdentity = channelIdentity;
  }


  public AlipayMerchantLiveChannelQueryResponseModel channelSecret(String channelSecret) {
    
    this.channelSecret = channelSecret;
    return this;
  }

   /**
   * 渠道密文
   * @return channelSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "b07d6694341b69c406522d3ff28d9807", value = "渠道密文")

  public String getChannelSecret() {
    return channelSecret;
  }


  public void setChannelSecret(String channelSecret) {
    this.channelSecret = channelSecret;
  }


  public AlipayMerchantLiveChannelQueryResponseModel channelType(String channelType) {
    
    this.channelType = channelType;
    return this;
  }

   /**
   * 渠道类型
   * @return channelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LIVE_POCKET", value = "渠道类型")

  public String getChannelType() {
    return channelType;
  }


  public void setChannelType(String channelType) {
    this.channelType = channelType;
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
   * @return the AlipayMerchantLiveChannelQueryResponseModel instance itself
   */
  public AlipayMerchantLiveChannelQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayMerchantLiveChannelQueryResponseModel alipayMerchantLiveChannelQueryResponseModel = (AlipayMerchantLiveChannelQueryResponseModel) o;
    return Objects.equals(this.channelContent, alipayMerchantLiveChannelQueryResponseModel.channelContent) &&
        Objects.equals(this.channelIdentity, alipayMerchantLiveChannelQueryResponseModel.channelIdentity) &&
        Objects.equals(this.channelSecret, alipayMerchantLiveChannelQueryResponseModel.channelSecret) &&
        Objects.equals(this.channelType, alipayMerchantLiveChannelQueryResponseModel.channelType)&&
        Objects.equals(this.additionalProperties, alipayMerchantLiveChannelQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelContent, channelIdentity, channelSecret, channelType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMerchantLiveChannelQueryResponseModel {\n");
    sb.append("    channelContent: ").append(toIndentedString(channelContent)).append("\n");
    sb.append("    channelIdentity: ").append(toIndentedString(channelIdentity)).append("\n");
    sb.append("    channelSecret: ").append(toIndentedString(channelSecret)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
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
    openapiFields.add("channel_content");
    openapiFields.add("channel_identity");
    openapiFields.add("channel_secret");
    openapiFields.add("channel_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMerchantLiveChannelQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMerchantLiveChannelQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMerchantLiveChannelQueryResponseModel is not found in the empty JSON string", AlipayMerchantLiveChannelQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("channel_content") != null && !jsonObj.get("channel_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_content").toString()));
      }
      if (jsonObj.get("channel_identity") != null && !jsonObj.get("channel_identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_identity").toString()));
      }
      if (jsonObj.get("channel_secret") != null && !jsonObj.get("channel_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_secret").toString()));
      }
      if (jsonObj.get("channel_type") != null && !jsonObj.get("channel_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMerchantLiveChannelQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMerchantLiveChannelQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMerchantLiveChannelQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMerchantLiveChannelQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMerchantLiveChannelQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMerchantLiveChannelQueryResponseModel value) throws IOException {
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
           public AlipayMerchantLiveChannelQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMerchantLiveChannelQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMerchantLiveChannelQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMerchantLiveChannelQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMerchantLiveChannelQueryResponseModel
  */
  public static AlipayMerchantLiveChannelQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMerchantLiveChannelQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMerchantLiveChannelQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

