/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-01-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.TimeRangeInfo;
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
 * WeekRuleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WeekRuleInfo {
  public static final String SERIALIZED_NAME_TIME_RANGE_INFO = "time_range_info";
  @SerializedName(SERIALIZED_NAME_TIME_RANGE_INFO)
  private TimeRangeInfo timeRangeInfo;

  public static final String SERIALIZED_NAME_WEEK_DAY = "week_day";
  @SerializedName(SERIALIZED_NAME_WEEK_DAY)
  private String weekDay;

  public WeekRuleInfo() { 
  }

  public WeekRuleInfo timeRangeInfo(TimeRangeInfo timeRangeInfo) {
    
    this.timeRangeInfo = timeRangeInfo;
    return this;
  }

   /**
   * Get timeRangeInfo
   * @return timeRangeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimeRangeInfo getTimeRangeInfo() {
    return timeRangeInfo;
  }


  public void setTimeRangeInfo(TimeRangeInfo timeRangeInfo) {
    this.timeRangeInfo = timeRangeInfo;
  }


  public WeekRuleInfo weekDay(String weekDay) {
    
    this.weekDay = weekDay;
    return this;
  }

   /**
   * 星期数，以“,”连接多个星期数
   * @return weekDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "星期数，以“,”连接多个星期数")

  public String getWeekDay() {
    return weekDay;
  }


  public void setWeekDay(String weekDay) {
    this.weekDay = weekDay;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeekRuleInfo weekRuleInfo = (WeekRuleInfo) o;
    return Objects.equals(this.timeRangeInfo, weekRuleInfo.timeRangeInfo) &&
        Objects.equals(this.weekDay, weekRuleInfo.weekDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeRangeInfo, weekDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeekRuleInfo {\n");
    sb.append("    timeRangeInfo: ").append(toIndentedString(timeRangeInfo)).append("\n");
    sb.append("    weekDay: ").append(toIndentedString(weekDay)).append("\n");
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
    openapiFields.add("time_range_info");
    openapiFields.add("week_day");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WeekRuleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WeekRuleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WeekRuleInfo is not found in the empty JSON string", WeekRuleInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WeekRuleInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WeekRuleInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `time_range_info`
      if (jsonObj.getAsJsonObject("time_range_info") != null) {
        TimeRangeInfo.validateJsonObject(jsonObj.getAsJsonObject("time_range_info"));
      }
      if (jsonObj.get("week_day") != null && !jsonObj.get("week_day").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `week_day` to be a primitive type in the JSON string but got `%s`", jsonObj.get("week_day").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WeekRuleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WeekRuleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WeekRuleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WeekRuleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<WeekRuleInfo>() {
           @Override
           public void write(JsonWriter out, WeekRuleInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WeekRuleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WeekRuleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WeekRuleInfo
  * @throws IOException if the JSON string is invalid with respect to WeekRuleInfo
  */
  public static WeekRuleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WeekRuleInfo.class);
  }

 /**
  * Convert an instance of WeekRuleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

