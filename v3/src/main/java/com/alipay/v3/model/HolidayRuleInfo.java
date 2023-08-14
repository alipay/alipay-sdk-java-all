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
 * HolidayRuleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HolidayRuleInfo {
  public static final String SERIALIZED_NAME_TIME_RANGE_INFO = "time_range_info";
  @SerializedName(SERIALIZED_NAME_TIME_RANGE_INFO)
  private TimeRangeInfo timeRangeInfo;

  public HolidayRuleInfo() { 
  }

  public HolidayRuleInfo timeRangeInfo(TimeRangeInfo timeRangeInfo) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HolidayRuleInfo holidayRuleInfo = (HolidayRuleInfo) o;
    return Objects.equals(this.timeRangeInfo, holidayRuleInfo.timeRangeInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeRangeInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HolidayRuleInfo {\n");
    sb.append("    timeRangeInfo: ").append(toIndentedString(timeRangeInfo)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HolidayRuleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (HolidayRuleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in HolidayRuleInfo is not found in the empty JSON string", HolidayRuleInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!HolidayRuleInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HolidayRuleInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `time_range_info`
      if (jsonObj.getAsJsonObject("time_range_info") != null) {
        TimeRangeInfo.validateJsonObject(jsonObj.getAsJsonObject("time_range_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HolidayRuleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HolidayRuleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HolidayRuleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HolidayRuleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<HolidayRuleInfo>() {
           @Override
           public void write(JsonWriter out, HolidayRuleInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HolidayRuleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HolidayRuleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HolidayRuleInfo
  * @throws IOException if the JSON string is invalid with respect to HolidayRuleInfo
  */
  public static HolidayRuleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HolidayRuleInfo.class);
  }

 /**
  * Convert an instance of HolidayRuleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

