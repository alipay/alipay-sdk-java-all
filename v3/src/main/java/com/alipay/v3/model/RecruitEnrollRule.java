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
import com.alipay.v3.model.RecruitEnrollRuleData;
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
 * RecruitEnrollRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecruitEnrollRule {
  public static final String SERIALIZED_NAME_MAX_SIZE = "max_size";
  @SerializedName(SERIALIZED_NAME_MAX_SIZE)
  private Integer maxSize;

  public static final String SERIALIZED_NAME_MIN_SIZE = "min_size";
  @SerializedName(SERIALIZED_NAME_MIN_SIZE)
  private Integer minSize;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_RULE_DATA = "rule_data";
  @SerializedName(SERIALIZED_NAME_RULE_DATA)
  private RecruitEnrollRuleData ruleData;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public RecruitEnrollRule() { 
  }

  public RecruitEnrollRule maxSize(Integer maxSize) {
    
    this.maxSize = maxSize;
    return this;
  }

   /**
   * 最大数量
   * @return maxSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "最大数量")

  public Integer getMaxSize() {
    return maxSize;
  }


  public void setMaxSize(Integer maxSize) {
    this.maxSize = maxSize;
  }


  public RecruitEnrollRule minSize(Integer minSize) {
    
    this.minSize = minSize;
    return this;
  }

   /**
   * 最小数量
   * @return minSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "最小数量")

  public Integer getMinSize() {
    return minSize;
  }


  public void setMinSize(Integer minSize) {
    this.minSize = minSize;
  }


  public RecruitEnrollRule required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * 是否必填
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否必填")

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    this.required = required;
  }


  public RecruitEnrollRule ruleData(RecruitEnrollRuleData ruleData) {
    
    this.ruleData = ruleData;
    return this;
  }

   /**
   * Get ruleData
   * @return ruleData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecruitEnrollRuleData getRuleData() {
    return ruleData;
  }


  public void setRuleData(RecruitEnrollRuleData ruleData) {
    this.ruleData = ruleData;
  }


  public RecruitEnrollRule type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 招商报名时提交的内容类型: 券:VOUCHER; 小程序:MINI_APP; 报名商户:ENROLL_MERCHANT; 素材:MATERIAL; 活动城市:CITY;
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VOUCHER", value = "招商报名时提交的内容类型: 券:VOUCHER; 小程序:MINI_APP; 报名商户:ENROLL_MERCHANT; 素材:MATERIAL; 活动城市:CITY;")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecruitEnrollRule recruitEnrollRule = (RecruitEnrollRule) o;
    return Objects.equals(this.maxSize, recruitEnrollRule.maxSize) &&
        Objects.equals(this.minSize, recruitEnrollRule.minSize) &&
        Objects.equals(this.required, recruitEnrollRule.required) &&
        Objects.equals(this.ruleData, recruitEnrollRule.ruleData) &&
        Objects.equals(this.type, recruitEnrollRule.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSize, minSize, required, ruleData, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecruitEnrollRule {\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    ruleData: ").append(toIndentedString(ruleData)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("max_size");
    openapiFields.add("min_size");
    openapiFields.add("required");
    openapiFields.add("rule_data");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecruitEnrollRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RecruitEnrollRule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecruitEnrollRule is not found in the empty JSON string", RecruitEnrollRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RecruitEnrollRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecruitEnrollRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `rule_data`
      if (jsonObj.getAsJsonObject("rule_data") != null) {
        RecruitEnrollRuleData.validateJsonObject(jsonObj.getAsJsonObject("rule_data"));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecruitEnrollRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecruitEnrollRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecruitEnrollRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecruitEnrollRule.class));

       return (TypeAdapter<T>) new TypeAdapter<RecruitEnrollRule>() {
           @Override
           public void write(JsonWriter out, RecruitEnrollRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecruitEnrollRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecruitEnrollRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecruitEnrollRule
  * @throws IOException if the JSON string is invalid with respect to RecruitEnrollRule
  */
  public static RecruitEnrollRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecruitEnrollRule.class);
  }

 /**
  * Convert an instance of RecruitEnrollRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

