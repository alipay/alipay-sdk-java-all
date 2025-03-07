/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2025-03-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.CampusInfo;
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
 * SchoolSimpleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SchoolSimpleInfo {
  public static final String SERIALIZED_NAME_CAMPUS_INFO = "campus_info";
  @SerializedName(SERIALIZED_NAME_CAMPUS_INFO)
  private CampusInfo campusInfo;

  public static final String SERIALIZED_NAME_CITY_CODE = "city_code";
  @SerializedName(SERIALIZED_NAME_CITY_CODE)
  private String cityCode;

  public static final String SERIALIZED_NAME_INST_ID = "inst_id";
  @SerializedName(SERIALIZED_NAME_INST_ID)
  private String instId;

  public static final String SERIALIZED_NAME_INST_NAME = "inst_name";
  @SerializedName(SERIALIZED_NAME_INST_NAME)
  private String instName;

  public static final String SERIALIZED_NAME_INST_STD_CODE = "inst_std_code";
  @SerializedName(SERIALIZED_NAME_INST_STD_CODE)
  private String instStdCode;

  public static final String SERIALIZED_NAME_PROVINCE_CODE = "province_code";
  @SerializedName(SERIALIZED_NAME_PROVINCE_CODE)
  private String provinceCode;

  public SchoolSimpleInfo() { 
  }

  public SchoolSimpleInfo campusInfo(CampusInfo campusInfo) {
    
    this.campusInfo = campusInfo;
    return this;
  }

   /**
   * Get campusInfo
   * @return campusInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampusInfo getCampusInfo() {
    return campusInfo;
  }


  public void setCampusInfo(CampusInfo campusInfo) {
    this.campusInfo = campusInfo;
  }


  public SchoolSimpleInfo cityCode(String cityCode) {
    
    this.cityCode = cityCode;
    return this;
  }

   /**
   * 城市编码
   * @return cityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "620900", value = "城市编码")

  public String getCityCode() {
    return cityCode;
  }


  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }


  public SchoolSimpleInfo instId(String instId) {
    
    this.instId = instId;
    return this;
  }

   /**
   * 学校内标
   * @return instId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000151541822", value = "学校内标")

  public String getInstId() {
    return instId;
  }


  public void setInstId(String instId) {
    this.instId = instId;
  }


  public SchoolSimpleInfo instName(String instName) {
    
    this.instName = instName;
    return this;
  }

   /**
   * 学校名称
   * @return instName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "复旦大学", value = "学校名称")

  public String getInstName() {
    return instName;
  }


  public void setInstName(String instName) {
    this.instName = instName;
  }


  public SchoolSimpleInfo instStdCode(String instStdCode) {
    
    this.instStdCode = instStdCode;
    return this;
  }

   /**
   * 学校外标
   * @return instStdCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12510181450882098Q", value = "学校外标")

  public String getInstStdCode() {
    return instStdCode;
  }


  public void setInstStdCode(String instStdCode) {
    this.instStdCode = instStdCode;
  }


  public SchoolSimpleInfo provinceCode(String provinceCode) {
    
    this.provinceCode = provinceCode;
    return this;
  }

   /**
   * 省份编码
   * @return provinceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "370000", value = "省份编码")

  public String getProvinceCode() {
    return provinceCode;
  }


  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
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
   * @return the SchoolSimpleInfo instance itself
   */
  public SchoolSimpleInfo putAdditionalProperty(String key, Object value) {
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
    SchoolSimpleInfo schoolSimpleInfo = (SchoolSimpleInfo) o;
    return Objects.equals(this.campusInfo, schoolSimpleInfo.campusInfo) &&
        Objects.equals(this.cityCode, schoolSimpleInfo.cityCode) &&
        Objects.equals(this.instId, schoolSimpleInfo.instId) &&
        Objects.equals(this.instName, schoolSimpleInfo.instName) &&
        Objects.equals(this.instStdCode, schoolSimpleInfo.instStdCode) &&
        Objects.equals(this.provinceCode, schoolSimpleInfo.provinceCode)&&
        Objects.equals(this.additionalProperties, schoolSimpleInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campusInfo, cityCode, instId, instName, instStdCode, provinceCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchoolSimpleInfo {\n");
    sb.append("    campusInfo: ").append(toIndentedString(campusInfo)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    instId: ").append(toIndentedString(instId)).append("\n");
    sb.append("    instName: ").append(toIndentedString(instName)).append("\n");
    sb.append("    instStdCode: ").append(toIndentedString(instStdCode)).append("\n");
    sb.append("    provinceCode: ").append(toIndentedString(provinceCode)).append("\n");
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
    openapiFields.add("campus_info");
    openapiFields.add("city_code");
    openapiFields.add("inst_id");
    openapiFields.add("inst_name");
    openapiFields.add("inst_std_code");
    openapiFields.add("province_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SchoolSimpleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SchoolSimpleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SchoolSimpleInfo is not found in the empty JSON string", SchoolSimpleInfo.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `campus_info`
      if (jsonObj.getAsJsonObject("campus_info") != null) {
        CampusInfo.validateJsonObject(jsonObj.getAsJsonObject("campus_info"));
      }
      if (jsonObj.get("city_code") != null && !jsonObj.get("city_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_code").toString()));
      }
      if (jsonObj.get("inst_id") != null && !jsonObj.get("inst_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inst_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inst_id").toString()));
      }
      if (jsonObj.get("inst_name") != null && !jsonObj.get("inst_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inst_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inst_name").toString()));
      }
      if (jsonObj.get("inst_std_code") != null && !jsonObj.get("inst_std_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inst_std_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inst_std_code").toString()));
      }
      if (jsonObj.get("province_code") != null && !jsonObj.get("province_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SchoolSimpleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SchoolSimpleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SchoolSimpleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SchoolSimpleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SchoolSimpleInfo>() {
           @Override
           public void write(JsonWriter out, SchoolSimpleInfo value) throws IOException {
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
           public SchoolSimpleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SchoolSimpleInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SchoolSimpleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SchoolSimpleInfo
  * @throws IOException if the JSON string is invalid with respect to SchoolSimpleInfo
  */
  public static SchoolSimpleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SchoolSimpleInfo.class);
  }

 /**
  * Convert an instance of SchoolSimpleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

