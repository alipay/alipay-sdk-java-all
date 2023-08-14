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
 * AlipayOpenMiniResourcePromotionsourceNotifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniResourcePromotionsourceNotifyModel {
  public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private String authorId;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private String params;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private String promotionId;

  public static final String SERIALIZED_NAME_PROMOTION_NAME = "promotion_name";
  @SerializedName(SERIALIZED_NAME_PROMOTION_NAME)
  private String promotionName;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public AlipayOpenMiniResourcePromotionsourceNotifyModel() { 
  }

  public AlipayOpenMiniResourcePromotionsourceNotifyModel authorId(String authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * 媒体唤起时传入的支付宝id
   * @return authorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201***********", value = "媒体唤起时传入的支付宝id")

  public String getAuthorId() {
    return authorId;
  }


  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }


  public AlipayOpenMiniResourcePromotionsourceNotifyModel params(String params) {
    
    this.params = params;
    return this;
  }

   /**
   * 媒体唤起时提供的额外参数值列表，这里可能有多个值，打平以后拼入。即url_decode(authcbparams)
   * @return params
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "app_id=1024562&a=1&b=2&c=3&bind_entry=12", value = "媒体唤起时提供的额外参数值列表，这里可能有多个值，打平以后拼入。即url_decode(authcbparams)")

  public String getParams() {
    return params;
  }


  public void setParams(String params) {
    this.params = params;
  }


  public AlipayOpenMiniResourcePromotionsourceNotifyModel promotionId(String promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 推广位id
   * @return promotionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mm_mm_123213123123131_21", value = "推广位id")

  public String getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }


  public AlipayOpenMiniResourcePromotionsourceNotifyModel promotionName(String promotionName) {
    
    this.promotionName = promotionName;
    return this;
  }

   /**
   * 推广位名称
   * @return promotionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "推广位名称", value = "推广位名称")

  public String getPromotionName() {
    return promotionName;
  }


  public void setPromotionName(String promotionName) {
    this.promotionName = promotionName;
  }


  public AlipayOpenMiniResourcePromotionsourceNotifyModel source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * 媒体来源，标识调用方
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "zfb_xcx", value = "媒体来源，标识调用方")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniResourcePromotionsourceNotifyModel alipayOpenMiniResourcePromotionsourceNotifyModel = (AlipayOpenMiniResourcePromotionsourceNotifyModel) o;
    return Objects.equals(this.authorId, alipayOpenMiniResourcePromotionsourceNotifyModel.authorId) &&
        Objects.equals(this.params, alipayOpenMiniResourcePromotionsourceNotifyModel.params) &&
        Objects.equals(this.promotionId, alipayOpenMiniResourcePromotionsourceNotifyModel.promotionId) &&
        Objects.equals(this.promotionName, alipayOpenMiniResourcePromotionsourceNotifyModel.promotionName) &&
        Objects.equals(this.source, alipayOpenMiniResourcePromotionsourceNotifyModel.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorId, params, promotionId, promotionName, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniResourcePromotionsourceNotifyModel {\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    promotionName: ").append(toIndentedString(promotionName)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("author_id");
    openapiFields.add("params");
    openapiFields.add("promotion_id");
    openapiFields.add("promotion_name");
    openapiFields.add("source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniResourcePromotionsourceNotifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniResourcePromotionsourceNotifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniResourcePromotionsourceNotifyModel is not found in the empty JSON string", AlipayOpenMiniResourcePromotionsourceNotifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniResourcePromotionsourceNotifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniResourcePromotionsourceNotifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("author_id") != null && !jsonObj.get("author_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author_id").toString()));
      }
      if (jsonObj.get("params") != null && !jsonObj.get("params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("params").toString()));
      }
      if (jsonObj.get("promotion_id") != null && !jsonObj.get("promotion_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promotion_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promotion_id").toString()));
      }
      if (jsonObj.get("promotion_name") != null && !jsonObj.get("promotion_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promotion_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promotion_name").toString()));
      }
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniResourcePromotionsourceNotifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniResourcePromotionsourceNotifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniResourcePromotionsourceNotifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniResourcePromotionsourceNotifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniResourcePromotionsourceNotifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniResourcePromotionsourceNotifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniResourcePromotionsourceNotifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniResourcePromotionsourceNotifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniResourcePromotionsourceNotifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniResourcePromotionsourceNotifyModel
  */
  public static AlipayOpenMiniResourcePromotionsourceNotifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniResourcePromotionsourceNotifyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniResourcePromotionsourceNotifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

