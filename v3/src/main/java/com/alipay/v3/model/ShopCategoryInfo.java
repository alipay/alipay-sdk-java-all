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
 * ShopCategoryInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShopCategoryInfo {
  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_CATEGORY_LEVEL = "category_level";
  @SerializedName(SERIALIZED_NAME_CATEGORY_LEVEL)
  private String categoryLevel;

  public static final String SERIALIZED_NAME_CATEGORY_NAME = "category_name";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName;

  public ShopCategoryInfo() { 
  }

  public ShopCategoryInfo categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * 类目编号
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015050700000018", value = "类目编号")

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public ShopCategoryInfo categoryLevel(String categoryLevel) {
    
    this.categoryLevel = categoryLevel;
    return this;
  }

   /**
   * 类目层级,目前最多支持1、2、3三级
   * @return categoryLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "类目层级,目前最多支持1、2、3三级")

  public String getCategoryLevel() {
    return categoryLevel;
  }


  public void setCategoryLevel(String categoryLevel) {
    this.categoryLevel = categoryLevel;
  }


  public ShopCategoryInfo categoryName(String categoryName) {
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * 类目名称
   * @return categoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "美食", value = "类目名称")

  public String getCategoryName() {
    return categoryName;
  }


  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopCategoryInfo shopCategoryInfo = (ShopCategoryInfo) o;
    return Objects.equals(this.categoryId, shopCategoryInfo.categoryId) &&
        Objects.equals(this.categoryLevel, shopCategoryInfo.categoryLevel) &&
        Objects.equals(this.categoryName, shopCategoryInfo.categoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, categoryLevel, categoryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopCategoryInfo {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryLevel: ").append(toIndentedString(categoryLevel)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
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
    openapiFields.add("category_id");
    openapiFields.add("category_level");
    openapiFields.add("category_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShopCategoryInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ShopCategoryInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShopCategoryInfo is not found in the empty JSON string", ShopCategoryInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShopCategoryInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShopCategoryInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      if (jsonObj.get("category_level") != null && !jsonObj.get("category_level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_level").toString()));
      }
      if (jsonObj.get("category_name") != null && !jsonObj.get("category_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShopCategoryInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShopCategoryInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShopCategoryInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShopCategoryInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ShopCategoryInfo>() {
           @Override
           public void write(JsonWriter out, ShopCategoryInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShopCategoryInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShopCategoryInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShopCategoryInfo
  * @throws IOException if the JSON string is invalid with respect to ShopCategoryInfo
  */
  public static ShopCategoryInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShopCategoryInfo.class);
  }

 /**
  * Convert an instance of ShopCategoryInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

