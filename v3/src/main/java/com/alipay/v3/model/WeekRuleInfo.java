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
   * @return the WeekRuleInfo instance itself
   */
  public WeekRuleInfo putAdditionalProperty(String key, Object value) {
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
    WeekRuleInfo weekRuleInfo = (WeekRuleInfo) o;
    return Objects.equals(this.timeRangeInfo, weekRuleInfo.timeRangeInfo) &&
        Objects.equals(this.weekDay, weekRuleInfo.weekDay)&&
        Objects.equals(this.additionalProperties, weekRuleInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeRangeInfo, weekDay, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeekRuleInfo {\n");
    sb.append("    timeRangeInfo: ").append(toIndentedString(timeRangeInfo)).append("\n");
    sb.append("    weekDay: ").append(toIndentedString(weekDay)).append("\n");
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
           public WeekRuleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WeekRuleInfo instance = thisAdapter.fromJsonTree(jsonObj);
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

