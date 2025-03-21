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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * ZMGOCycleWithholdConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZMGOCycleWithholdConfig {
  public static final String SERIALIZED_NAME_DEDUCT_PLAN = "deduct_plan";
  @SerializedName(SERIALIZED_NAME_DEDUCT_PLAN)
  private List<String> deductPlan = null;

  public static final String SERIALIZED_NAME_EXEMPTION_PERIOD = "exemption_period";
  @SerializedName(SERIALIZED_NAME_EXEMPTION_PERIOD)
  private String exemptionPeriod;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private String period;

  public static final String SERIALIZED_NAME_PERIOD_TYPE = "period_type";
  @SerializedName(SERIALIZED_NAME_PERIOD_TYPE)
  private String periodType;

  public static final String SERIALIZED_NAME_SUPPORT_CYCLE_WITHHOLD_HIGH_MODE = "support_cycle_withhold_high_mode";
  @SerializedName(SERIALIZED_NAME_SUPPORT_CYCLE_WITHHOLD_HIGH_MODE)
  private Boolean supportCycleWithholdHighMode;

  public static final String SERIALIZED_NAME_SUPPORT_EXEMPTION_PERIOD = "support_exemption_period";
  @SerializedName(SERIALIZED_NAME_SUPPORT_EXEMPTION_PERIOD)
  private Boolean supportExemptionPeriod;

  public static final String SERIALIZED_NAME_WITHHOLD_MODE = "withhold_mode";
  @SerializedName(SERIALIZED_NAME_WITHHOLD_MODE)
  private String withholdMode;

  public ZMGOCycleWithholdConfig() { 
  }

  public ZMGOCycleWithholdConfig deductPlan(List<String> deductPlan) {
    
    this.deductPlan = deductPlan;
    return this;
  }

  public ZMGOCycleWithholdConfig addDeductPlanItem(String deductPlanItem) {
    if (this.deductPlan == null) {
      this.deductPlan = new ArrayList<>();
    }
    this.deductPlan.add(deductPlanItem);
    return this;
  }

   /**
   * 扣款计划
   * @return deductPlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扣款计划")

  public List<String> getDeductPlan() {
    return deductPlan;
  }


  public void setDeductPlan(List<String> deductPlan) {
    this.deductPlan = deductPlan;
  }


  public ZMGOCycleWithholdConfig exemptionPeriod(String exemptionPeriod) {
    
    this.exemptionPeriod = exemptionPeriod;
    return this;
  }

   /**
   * 豁免期天数
   * @return exemptionPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "豁免期天数")

  public String getExemptionPeriod() {
    return exemptionPeriod;
  }


  public void setExemptionPeriod(String exemptionPeriod) {
    this.exemptionPeriod = exemptionPeriod;
  }


  public ZMGOCycleWithholdConfig period(String period) {
    
    this.period = period;
    return this;
  }

   /**
   * 周期
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "周期")

  public String getPeriod() {
    return period;
  }


  public void setPeriod(String period) {
    this.period = period;
  }


  public ZMGOCycleWithholdConfig periodType(String periodType) {
    
    this.periodType = periodType;
    return this;
  }

   /**
   * 扣款周期类型，支持DAY-天模式，MONTH-月模式
   * @return periodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扣款周期类型，支持DAY-天模式，MONTH-月模式")

  public String getPeriodType() {
    return periodType;
  }


  public void setPeriodType(String periodType) {
    this.periodType = periodType;
  }


  public ZMGOCycleWithholdConfig supportCycleWithholdHighMode(Boolean supportCycleWithholdHighMode) {
    
    this.supportCycleWithholdHighMode = supportCycleWithholdHighMode;
    return this;
  }

   /**
   * 是否支持周期扣高级模式，高级模式下扣款计划中内一起的扣款金额可以进行定制
   * @return supportCycleWithholdHighMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否支持周期扣高级模式，高级模式下扣款计划中内一起的扣款金额可以进行定制")

  public Boolean getSupportCycleWithholdHighMode() {
    return supportCycleWithholdHighMode;
  }


  public void setSupportCycleWithholdHighMode(Boolean supportCycleWithholdHighMode) {
    this.supportCycleWithholdHighMode = supportCycleWithholdHighMode;
  }


  public ZMGOCycleWithholdConfig supportExemptionPeriod(Boolean supportExemptionPeriod) {
    
    this.supportExemptionPeriod = supportExemptionPeriod;
    return this;
  }

   /**
   * 是否支持豁免期，如果支持豁免期，用户开通后再豁免期内退出无需扣款
   * @return supportExemptionPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否支持豁免期，如果支持豁免期，用户开通后再豁免期内退出无需扣款")

  public Boolean getSupportExemptionPeriod() {
    return supportExemptionPeriod;
  }


  public void setSupportExemptionPeriod(Boolean supportExemptionPeriod) {
    this.supportExemptionPeriod = supportExemptionPeriod;
  }


  public ZMGOCycleWithholdConfig withholdMode(String withholdMode) {
    
    this.withholdMode = withholdMode;
    return this;
  }

   /**
   * 设置扣款模式，目前支持每月固定日期或固定时间间隔
   * @return withholdMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "设置扣款模式，目前支持每月固定日期或固定时间间隔")

  public String getWithholdMode() {
    return withholdMode;
  }


  public void setWithholdMode(String withholdMode) {
    this.withholdMode = withholdMode;
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
   * @return the ZMGOCycleWithholdConfig instance itself
   */
  public ZMGOCycleWithholdConfig putAdditionalProperty(String key, Object value) {
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
    ZMGOCycleWithholdConfig zmGOCycleWithholdConfig = (ZMGOCycleWithholdConfig) o;
    return Objects.equals(this.deductPlan, zmGOCycleWithholdConfig.deductPlan) &&
        Objects.equals(this.exemptionPeriod, zmGOCycleWithholdConfig.exemptionPeriod) &&
        Objects.equals(this.period, zmGOCycleWithholdConfig.period) &&
        Objects.equals(this.periodType, zmGOCycleWithholdConfig.periodType) &&
        Objects.equals(this.supportCycleWithholdHighMode, zmGOCycleWithholdConfig.supportCycleWithholdHighMode) &&
        Objects.equals(this.supportExemptionPeriod, zmGOCycleWithholdConfig.supportExemptionPeriod) &&
        Objects.equals(this.withholdMode, zmGOCycleWithholdConfig.withholdMode)&&
        Objects.equals(this.additionalProperties, zmGOCycleWithholdConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deductPlan, exemptionPeriod, period, periodType, supportCycleWithholdHighMode, supportExemptionPeriod, withholdMode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZMGOCycleWithholdConfig {\n");
    sb.append("    deductPlan: ").append(toIndentedString(deductPlan)).append("\n");
    sb.append("    exemptionPeriod: ").append(toIndentedString(exemptionPeriod)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
    sb.append("    supportCycleWithholdHighMode: ").append(toIndentedString(supportCycleWithholdHighMode)).append("\n");
    sb.append("    supportExemptionPeriod: ").append(toIndentedString(supportExemptionPeriod)).append("\n");
    sb.append("    withholdMode: ").append(toIndentedString(withholdMode)).append("\n");
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
    openapiFields.add("deduct_plan");
    openapiFields.add("exemption_period");
    openapiFields.add("period");
    openapiFields.add("period_type");
    openapiFields.add("support_cycle_withhold_high_mode");
    openapiFields.add("support_exemption_period");
    openapiFields.add("withhold_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZMGOCycleWithholdConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZMGOCycleWithholdConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZMGOCycleWithholdConfig is not found in the empty JSON string", ZMGOCycleWithholdConfig.openapiRequiredFields.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("deduct_plan") != null && !jsonObj.get("deduct_plan").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `deduct_plan` to be an array in the JSON string but got `%s`", jsonObj.get("deduct_plan").toString()));
      }
      if (jsonObj.get("exemption_period") != null && !jsonObj.get("exemption_period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exemption_period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exemption_period").toString()));
      }
      if (jsonObj.get("period") != null && !jsonObj.get("period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("period").toString()));
      }
      if (jsonObj.get("period_type") != null && !jsonObj.get("period_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `period_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("period_type").toString()));
      }
      if (jsonObj.get("withhold_mode") != null && !jsonObj.get("withhold_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `withhold_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("withhold_mode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZMGOCycleWithholdConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZMGOCycleWithholdConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZMGOCycleWithholdConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZMGOCycleWithholdConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ZMGOCycleWithholdConfig>() {
           @Override
           public void write(JsonWriter out, ZMGOCycleWithholdConfig value) throws IOException {
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
           public ZMGOCycleWithholdConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ZMGOCycleWithholdConfig instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ZMGOCycleWithholdConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZMGOCycleWithholdConfig
  * @throws IOException if the JSON string is invalid with respect to ZMGOCycleWithholdConfig
  */
  public static ZMGOCycleWithholdConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZMGOCycleWithholdConfig.class);
  }

 /**
  * Convert an instance of ZMGOCycleWithholdConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

