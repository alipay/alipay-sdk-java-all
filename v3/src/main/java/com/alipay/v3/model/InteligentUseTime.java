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
 * InteligentUseTime
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InteligentUseTime {
  public static final String SERIALIZED_NAME_DIMENSION = "dimension";
  @SerializedName(SERIALIZED_NAME_DIMENSION)
  private String dimension;

  public static final String SERIALIZED_NAME_TIMES = "times";
  @SerializedName(SERIALIZED_NAME_TIMES)
  private String times;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private String values;

  public InteligentUseTime() { 
  }

  public InteligentUseTime dimension(String dimension) {
    
    this.dimension = dimension;
    return this;
  }

   /**
   * 券可用时段时间维度，目前支持周(W)
   * @return dimension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "W", value = "券可用时段时间维度，目前支持周(W)")

  public String getDimension() {
    return dimension;
  }


  public void setDimension(String dimension) {
    this.dimension = dimension;
  }


  public InteligentUseTime times(String times) {
    
    this.times = times;
    return this;
  }

   /**
   * 券可用时间段  可用时间段起止时间用逗号分隔，多个时间段之间用^分隔  如, \&quot;16:00:00,20:00:00^21:00:00,22:00:00\&quot;表示16点至20点，21点至22点可用  时间段不可重叠
   * @return times
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "16:00:00,20:00:00^21:00:00,22:00:00", value = "券可用时间段  可用时间段起止时间用逗号分隔，多个时间段之间用^分隔  如, \"16:00:00,20:00:00^21:00:00,22:00:00\"表示16点至20点，21点至22点可用  时间段不可重叠")

  public String getTimes() {
    return times;
  }


  public void setTimes(String times) {
    this.times = times;
  }


  public InteligentUseTime values(String values) {
    
    this.values = values;
    return this;
  }

   /**
   * 券可用时间维度值  周维度的取值范围1-7(周一至周日)，多个可用时段用逗号分隔  如\&quot;1,3,5\&quot;，对应周一，周三，周五可用
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1,3,5", value = "券可用时间维度值  周维度的取值范围1-7(周一至周日)，多个可用时段用逗号分隔  如\"1,3,5\"，对应周一，周三，周五可用")

  public String getValues() {
    return values;
  }


  public void setValues(String values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteligentUseTime inteligentUseTime = (InteligentUseTime) o;
    return Objects.equals(this.dimension, inteligentUseTime.dimension) &&
        Objects.equals(this.times, inteligentUseTime.times) &&
        Objects.equals(this.values, inteligentUseTime.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimension, times, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteligentUseTime {\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    times: ").append(toIndentedString(times)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("dimension");
    openapiFields.add("times");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InteligentUseTime
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InteligentUseTime.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InteligentUseTime is not found in the empty JSON string", InteligentUseTime.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InteligentUseTime.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InteligentUseTime` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("dimension") != null && !jsonObj.get("dimension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dimension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dimension").toString()));
      }
      if (jsonObj.get("times") != null && !jsonObj.get("times").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `times` to be a primitive type in the JSON string but got `%s`", jsonObj.get("times").toString()));
      }
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be a primitive type in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InteligentUseTime.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InteligentUseTime' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InteligentUseTime> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InteligentUseTime.class));

       return (TypeAdapter<T>) new TypeAdapter<InteligentUseTime>() {
           @Override
           public void write(JsonWriter out, InteligentUseTime value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InteligentUseTime read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InteligentUseTime given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InteligentUseTime
  * @throws IOException if the JSON string is invalid with respect to InteligentUseTime
  */
  public static InteligentUseTime fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InteligentUseTime.class);
  }

 /**
  * Convert an instance of InteligentUseTime to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

