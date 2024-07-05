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
import com.alipay.v3.model.EndTimeInfo;
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
 * TimeRangeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TimeRangeInfo {
  public static final String SERIALIZED_NAME_BEGIN_TIME = "begin_time";
  @SerializedName(SERIALIZED_NAME_BEGIN_TIME)
  private String beginTime;

  public static final String SERIALIZED_NAME_END_TIME_INFO = "end_time_info";
  @SerializedName(SERIALIZED_NAME_END_TIME_INFO)
  private EndTimeInfo endTimeInfo;

  public TimeRangeInfo() { 
  }

  public TimeRangeInfo beginTime(String beginTime) {
    
    this.beginTime = beginTime;
    return this;
  }

   /**
   * 开始时间  格式：HH:mm:ss
   * @return beginTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开始时间  格式：HH:mm:ss")

  public String getBeginTime() {
    return beginTime;
  }


  public void setBeginTime(String beginTime) {
    this.beginTime = beginTime;
  }


  public TimeRangeInfo endTimeInfo(EndTimeInfo endTimeInfo) {
    
    this.endTimeInfo = endTimeInfo;
    return this;
  }

   /**
   * Get endTimeInfo
   * @return endTimeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EndTimeInfo getEndTimeInfo() {
    return endTimeInfo;
  }


  public void setEndTimeInfo(EndTimeInfo endTimeInfo) {
    this.endTimeInfo = endTimeInfo;
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
   * @return the TimeRangeInfo instance itself
   */
  public TimeRangeInfo putAdditionalProperty(String key, Object value) {
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
    TimeRangeInfo timeRangeInfo = (TimeRangeInfo) o;
    return Objects.equals(this.beginTime, timeRangeInfo.beginTime) &&
        Objects.equals(this.endTimeInfo, timeRangeInfo.endTimeInfo)&&
        Objects.equals(this.additionalProperties, timeRangeInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginTime, endTimeInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeRangeInfo {\n");
    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    endTimeInfo: ").append(toIndentedString(endTimeInfo)).append("\n");
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
    openapiFields.add("begin_time");
    openapiFields.add("end_time_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimeRangeInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TimeRangeInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeRangeInfo is not found in the empty JSON string", TimeRangeInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("begin_time") != null && !jsonObj.get("begin_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `begin_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("begin_time").toString()));
      }
      // validate the optional field `end_time_info`
      if (jsonObj.getAsJsonObject("end_time_info") != null) {
        EndTimeInfo.validateJsonObject(jsonObj.getAsJsonObject("end_time_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeRangeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeRangeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeRangeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeRangeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeRangeInfo>() {
           @Override
           public void write(JsonWriter out, TimeRangeInfo value) throws IOException {
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
           public TimeRangeInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TimeRangeInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TimeRangeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimeRangeInfo
  * @throws IOException if the JSON string is invalid with respect to TimeRangeInfo
  */
  public static TimeRangeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeRangeInfo.class);
  }

 /**
  * Convert an instance of TimeRangeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

