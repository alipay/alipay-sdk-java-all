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
 * OpenApiResponseHeader
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OpenApiResponseHeader {
  public static final String SERIALIZED_NAME_CONVERSATION_ID = "conversation_id";
  @SerializedName(SERIALIZED_NAME_CONVERSATION_ID)
  private String conversationId;

  public static final String SERIALIZED_NAME_RESPONSE_ID = "response_id";
  @SerializedName(SERIALIZED_NAME_RESPONSE_ID)
  private String responseId;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private String statusCode;

  public static final String SERIALIZED_NAME_STATUS_MESSAGE = "status_message";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
  private String statusMessage;

  public static final String SERIALIZED_NAME_SUB_STATUS_CODE = "sub_status_code";
  @SerializedName(SERIALIZED_NAME_SUB_STATUS_CODE)
  private String subStatusCode;

  public OpenApiResponseHeader() { 
  }

  public OpenApiResponseHeader conversationId(String conversationId) {
    
    this.conversationId = conversationId;
    return this;
  }

   /**
   * 会话id，对应请求中的conversation_id，若请求中conversation_id非空，则该值非空
   * @return conversationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0b09fcb8-e2df-4d03-8265-e8384788f525", value = "会话id，对应请求中的conversation_id，若请求中conversation_id非空，则该值非空")

  public String getConversationId() {
    return conversationId;
  }


  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  public OpenApiResponseHeader responseId(String responseId) {
    
    this.responseId = responseId;
    return this;
  }

   /**
   * 响应id，对应请求中的request_id。如果请求中request_id非空，则response_id非空。
   * @return responseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aaf4d9d2-908b-4ccf-83ef-1b1a857e4296", value = "响应id，对应请求中的request_id。如果请求中request_id非空，则response_id非空。")

  public String getResponseId() {
    return responseId;
  }


  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }


  public OpenApiResponseHeader statusCode(String statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * 自定义状态码
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "自定义状态码")

  public String getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }


  public OpenApiResponseHeader statusMessage(String statusMessage) {
    
    this.statusMessage = statusMessage;
    return this;
  }

   /**
   * 状态信息
   * @return statusMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Not parsed programmatically. Example \"Downstream system offline\"", value = "状态信息")

  public String getStatusMessage() {
    return statusMessage;
  }


  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }


  public OpenApiResponseHeader subStatusCode(String subStatusCode) {
    
    this.subStatusCode = subStatusCode;
    return this;
  }

   /**
   * 子状态码
   * @return subStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "40601", value = "子状态码")

  public String getSubStatusCode() {
    return subStatusCode;
  }


  public void setSubStatusCode(String subStatusCode) {
    this.subStatusCode = subStatusCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenApiResponseHeader openApiResponseHeader = (OpenApiResponseHeader) o;
    return Objects.equals(this.conversationId, openApiResponseHeader.conversationId) &&
        Objects.equals(this.responseId, openApiResponseHeader.responseId) &&
        Objects.equals(this.statusCode, openApiResponseHeader.statusCode) &&
        Objects.equals(this.statusMessage, openApiResponseHeader.statusMessage) &&
        Objects.equals(this.subStatusCode, openApiResponseHeader.subStatusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, responseId, statusCode, statusMessage, subStatusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiResponseHeader {\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    subStatusCode: ").append(toIndentedString(subStatusCode)).append("\n");
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
    openapiFields.add("conversation_id");
    openapiFields.add("response_id");
    openapiFields.add("status_code");
    openapiFields.add("status_message");
    openapiFields.add("sub_status_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OpenApiResponseHeader
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OpenApiResponseHeader.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenApiResponseHeader is not found in the empty JSON string", OpenApiResponseHeader.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OpenApiResponseHeader.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OpenApiResponseHeader` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("conversation_id") != null && !jsonObj.get("conversation_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conversation_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conversation_id").toString()));
      }
      if (jsonObj.get("response_id") != null && !jsonObj.get("response_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response_id").toString()));
      }
      if (jsonObj.get("status_code") != null && !jsonObj.get("status_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_code").toString()));
      }
      if (jsonObj.get("status_message") != null && !jsonObj.get("status_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_message").toString()));
      }
      if (jsonObj.get("sub_status_code") != null && !jsonObj.get("sub_status_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_status_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_status_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenApiResponseHeader.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenApiResponseHeader' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenApiResponseHeader> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenApiResponseHeader.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenApiResponseHeader>() {
           @Override
           public void write(JsonWriter out, OpenApiResponseHeader value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OpenApiResponseHeader read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OpenApiResponseHeader given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpenApiResponseHeader
  * @throws IOException if the JSON string is invalid with respect to OpenApiResponseHeader
  */
  public static OpenApiResponseHeader fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenApiResponseHeader.class);
  }

 /**
  * Convert an instance of OpenApiResponseHeader to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

