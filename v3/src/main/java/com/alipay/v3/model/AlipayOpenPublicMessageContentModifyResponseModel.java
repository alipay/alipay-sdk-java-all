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
 * AlipayOpenPublicMessageContentModifyResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicMessageContentModifyResponseModel {
  public static final String SERIALIZED_NAME_CONTENT_ID = "content_id";
  @SerializedName(SERIALIZED_NAME_CONTENT_ID)
  private String contentId;

  public static final String SERIALIZED_NAME_CONTENT_URL = "content_url";
  @SerializedName(SERIALIZED_NAME_CONTENT_URL)
  private String contentUrl;

  public AlipayOpenPublicMessageContentModifyResponseModel() { 
  }

  public AlipayOpenPublicMessageContentModifyResponseModel contentId(String contentId) {
    
    this.contentId = contentId;
    return this;
  }

   /**
   * 内容id
   * @return contentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201410323232dsadjada-dsa-1234dsada", value = "内容id")

  public String getContentId() {
    return contentId;
  }


  public void setContentId(String contentId) {
    this.contentId = contentId;
  }


  public AlipayOpenPublicMessageContentModifyResponseModel contentUrl(String contentUrl) {
    
    this.contentUrl = contentUrl;
    return this;
  }

   /**
   * 内容详情内链url
   * @return contentUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://xxxx", value = "内容详情内链url")

  public String getContentUrl() {
    return contentUrl;
  }


  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicMessageContentModifyResponseModel alipayOpenPublicMessageContentModifyResponseModel = (AlipayOpenPublicMessageContentModifyResponseModel) o;
    return Objects.equals(this.contentId, alipayOpenPublicMessageContentModifyResponseModel.contentId) &&
        Objects.equals(this.contentUrl, alipayOpenPublicMessageContentModifyResponseModel.contentUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentId, contentUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicMessageContentModifyResponseModel {\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
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
    openapiFields.add("content_id");
    openapiFields.add("content_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicMessageContentModifyResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicMessageContentModifyResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicMessageContentModifyResponseModel is not found in the empty JSON string", AlipayOpenPublicMessageContentModifyResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicMessageContentModifyResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicMessageContentModifyResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("content_id") != null && !jsonObj.get("content_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_id").toString()));
      }
      if (jsonObj.get("content_url") != null && !jsonObj.get("content_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicMessageContentModifyResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicMessageContentModifyResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicMessageContentModifyResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicMessageContentModifyResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicMessageContentModifyResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicMessageContentModifyResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicMessageContentModifyResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicMessageContentModifyResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicMessageContentModifyResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicMessageContentModifyResponseModel
  */
  public static AlipayOpenPublicMessageContentModifyResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicMessageContentModifyResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicMessageContentModifyResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

