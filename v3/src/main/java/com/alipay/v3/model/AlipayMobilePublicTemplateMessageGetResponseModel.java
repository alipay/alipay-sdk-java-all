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
 * AlipayMobilePublicTemplateMessageGetResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMobilePublicTemplateMessageGetResponseModel {
  public static final String SERIALIZED_NAME_MSG_TEMPLATE_ID = "msg_template_id";
  @SerializedName(SERIALIZED_NAME_MSG_TEMPLATE_ID)
  private String msgTemplateId;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public AlipayMobilePublicTemplateMessageGetResponseModel() { 
  }

  public AlipayMobilePublicTemplateMessageGetResponseModel msgTemplateId(String msgTemplateId) {
    
    this.msgTemplateId = msgTemplateId;
    return this;
  }

   /**
   * 消息模板id--商户领取母版后生成的唯一模板id
   * @return msgTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "14330d60f0ab4516853a0900827cee35", value = "消息模板id--商户领取母版后生成的唯一模板id")

  public String getMsgTemplateId() {
    return msgTemplateId;
  }


  public void setMsgTemplateId(String msgTemplateId) {
    this.msgTemplateId = msgTemplateId;
  }


  public AlipayMobilePublicTemplateMessageGetResponseModel template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * 模板内容
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"appId\":\"${ALIPAY.appId}\",\"createTime\":${ALIPAY.createTime},\"toUserId\":\"${ALIPAY.toUserId}\",\"msgType\":\"text\",\"push\":\"true\"}", value = "模板内容")

  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
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
   * @return the AlipayMobilePublicTemplateMessageGetResponseModel instance itself
   */
  public AlipayMobilePublicTemplateMessageGetResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayMobilePublicTemplateMessageGetResponseModel alipayMobilePublicTemplateMessageGetResponseModel = (AlipayMobilePublicTemplateMessageGetResponseModel) o;
    return Objects.equals(this.msgTemplateId, alipayMobilePublicTemplateMessageGetResponseModel.msgTemplateId) &&
        Objects.equals(this.template, alipayMobilePublicTemplateMessageGetResponseModel.template)&&
        Objects.equals(this.additionalProperties, alipayMobilePublicTemplateMessageGetResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgTemplateId, template, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMobilePublicTemplateMessageGetResponseModel {\n");
    sb.append("    msgTemplateId: ").append(toIndentedString(msgTemplateId)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
    openapiFields.add("msg_template_id");
    openapiFields.add("template");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMobilePublicTemplateMessageGetResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMobilePublicTemplateMessageGetResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMobilePublicTemplateMessageGetResponseModel is not found in the empty JSON string", AlipayMobilePublicTemplateMessageGetResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("msg_template_id") != null && !jsonObj.get("msg_template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msg_template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msg_template_id").toString()));
      }
      if (jsonObj.get("template") != null && !jsonObj.get("template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMobilePublicTemplateMessageGetResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMobilePublicTemplateMessageGetResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMobilePublicTemplateMessageGetResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMobilePublicTemplateMessageGetResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMobilePublicTemplateMessageGetResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMobilePublicTemplateMessageGetResponseModel value) throws IOException {
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
           public AlipayMobilePublicTemplateMessageGetResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMobilePublicTemplateMessageGetResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMobilePublicTemplateMessageGetResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMobilePublicTemplateMessageGetResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMobilePublicTemplateMessageGetResponseModel
  */
  public static AlipayMobilePublicTemplateMessageGetResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMobilePublicTemplateMessageGetResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMobilePublicTemplateMessageGetResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

