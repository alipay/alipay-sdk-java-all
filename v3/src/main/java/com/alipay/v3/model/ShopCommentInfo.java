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
 * ShopCommentInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShopCommentInfo {
  public static final String SERIALIZED_NAME_AVG_POPULARITY = "avg_popularity";
  @SerializedName(SERIALIZED_NAME_AVG_POPULARITY)
  private String avgPopularity;

  public static final String SERIALIZED_NAME_AVG_POPULARITY_NAME = "avg_popularity_name";
  @SerializedName(SERIALIZED_NAME_AVG_POPULARITY_NAME)
  private String avgPopularityName;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private String score;

  public static final String SERIALIZED_NAME_STAR = "star";
  @SerializedName(SERIALIZED_NAME_STAR)
  private String star;

  public ShopCommentInfo() { 
  }

  public ShopCommentInfo avgPopularity(String avgPopularity) {
    
    this.avgPopularity = avgPopularity;
    return this;
  }

   /**
   * 店铺30天平均人气值
   * @return avgPopularity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "76", value = "店铺30天平均人气值")

  public String getAvgPopularity() {
    return avgPopularity;
  }


  public void setAvgPopularity(String avgPopularity) {
    this.avgPopularity = avgPopularity;
  }


  public ShopCommentInfo avgPopularityName(String avgPopularityName) {
    
    this.avgPopularityName = avgPopularityName;
    return this;
  }

   /**
   * avg_popularity字段展示文案
   * @return avgPopularityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "口碑人气", value = "avg_popularity字段展示文案")

  public String getAvgPopularityName() {
    return avgPopularityName;
  }


  public void setAvgPopularityName(String avgPopularityName) {
    this.avgPopularityName = avgPopularityName;
  }


  public ShopCommentInfo score(String score) {
    
    this.score = score;
    return this;
  }

   /**
   * 门店评分，评分越高，门店质量越高
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.2", value = "门店评分，评分越高，门店质量越高")

  public String getScore() {
    return score;
  }


  public void setScore(String score) {
    this.score = score;
  }


  public ShopCommentInfo star(String star) {
    
    this.star = star;
    return this;
  }

   /**
   * 门店星级，0~5,越高，店铺质量越高
   * @return star
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4.0", value = "门店星级，0~5,越高，店铺质量越高")

  public String getStar() {
    return star;
  }


  public void setStar(String star) {
    this.star = star;
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
   * @return the ShopCommentInfo instance itself
   */
  public ShopCommentInfo putAdditionalProperty(String key, Object value) {
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
    ShopCommentInfo shopCommentInfo = (ShopCommentInfo) o;
    return Objects.equals(this.avgPopularity, shopCommentInfo.avgPopularity) &&
        Objects.equals(this.avgPopularityName, shopCommentInfo.avgPopularityName) &&
        Objects.equals(this.score, shopCommentInfo.score) &&
        Objects.equals(this.star, shopCommentInfo.star)&&
        Objects.equals(this.additionalProperties, shopCommentInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgPopularity, avgPopularityName, score, star, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopCommentInfo {\n");
    sb.append("    avgPopularity: ").append(toIndentedString(avgPopularity)).append("\n");
    sb.append("    avgPopularityName: ").append(toIndentedString(avgPopularityName)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    star: ").append(toIndentedString(star)).append("\n");
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
    openapiFields.add("avg_popularity");
    openapiFields.add("avg_popularity_name");
    openapiFields.add("score");
    openapiFields.add("star");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShopCommentInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ShopCommentInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShopCommentInfo is not found in the empty JSON string", ShopCommentInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("avg_popularity") != null && !jsonObj.get("avg_popularity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avg_popularity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avg_popularity").toString()));
      }
      if (jsonObj.get("avg_popularity_name") != null && !jsonObj.get("avg_popularity_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avg_popularity_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avg_popularity_name").toString()));
      }
      if (jsonObj.get("score") != null && !jsonObj.get("score").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `score` to be a primitive type in the JSON string but got `%s`", jsonObj.get("score").toString()));
      }
      if (jsonObj.get("star") != null && !jsonObj.get("star").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `star` to be a primitive type in the JSON string but got `%s`", jsonObj.get("star").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShopCommentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShopCommentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShopCommentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShopCommentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ShopCommentInfo>() {
           @Override
           public void write(JsonWriter out, ShopCommentInfo value) throws IOException {
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
           public ShopCommentInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ShopCommentInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ShopCommentInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShopCommentInfo
  * @throws IOException if the JSON string is invalid with respect to ShopCommentInfo
  */
  public static ShopCommentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShopCommentInfo.class);
  }

 /**
  * Convert an instance of ShopCommentInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

