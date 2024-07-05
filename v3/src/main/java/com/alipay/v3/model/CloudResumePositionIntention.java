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
 * CloudResumePositionIntention
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CloudResumePositionIntention {
  public static final String SERIALIZED_NAME_INTENTION_CITY = "intention_city";
  @SerializedName(SERIALIZED_NAME_INTENTION_CITY)
  private String intentionCity;

  public static final String SERIALIZED_NAME_JOB_ID = "job_id";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public static final String SERIALIZED_NAME_JOB_NAME = "job_name";
  @SerializedName(SERIALIZED_NAME_JOB_NAME)
  private String jobName;

  public static final String SERIALIZED_NAME_PROFESSION_ID = "profession_id";
  @SerializedName(SERIALIZED_NAME_PROFESSION_ID)
  private String professionId;

  public static final String SERIALIZED_NAME_PROFESSION_NAME = "profession_name";
  @SerializedName(SERIALIZED_NAME_PROFESSION_NAME)
  private String professionName;

  public static final String SERIALIZED_NAME_SALARY_MAX = "salary_max";
  @SerializedName(SERIALIZED_NAME_SALARY_MAX)
  private String salaryMax;

  public static final String SERIALIZED_NAME_SALARY_MIN = "salary_min";
  @SerializedName(SERIALIZED_NAME_SALARY_MIN)
  private String salaryMin;

  public static final String SERIALIZED_NAME_SALARY_UNIT = "salary_unit";
  @SerializedName(SERIALIZED_NAME_SALARY_UNIT)
  private String salaryUnit;

  public static final String SERIALIZED_NAME_WORK_PROPERTY = "work_property";
  @SerializedName(SERIALIZED_NAME_WORK_PROPERTY)
  private String workProperty;

  public CloudResumePositionIntention() { 
  }

  public CloudResumePositionIntention intentionCity(String intentionCity) {
    
    this.intentionCity = intentionCity;
    return this;
  }

   /**
   * 意向城市Code。具体地区编码参见https://lbs.amap.com/api/webservice/download 里面城市编码表
   * @return intentionCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "110000", value = "意向城市Code。具体地区编码参见https://lbs.amap.com/api/webservice/download 里面城市编码表")

  public String getIntentionCity() {
    return intentionCity;
  }


  public void setIntentionCity(String intentionCity) {
    this.intentionCity = intentionCity;
  }


  public CloudResumePositionIntention jobId(String jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * 职业id(这个字段在目前版本不对外暴露)
   * @return jobId
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aaaaaaa-ssss-bbbb-cccc-dddddddddd", value = "职业id(这个字段在目前版本不对外暴露)")

  public String getJobId() {
    return jobId;
  }


  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  public CloudResumePositionIntention jobName(String jobName) {
    
    this.jobName = jobName;
    return this;
  }

   /**
   * 职业名称
   * @return jobName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "医生", value = "职业名称")

  public String getJobName() {
    return jobName;
  }


  public void setJobName(String jobName) {
    this.jobName = jobName;
  }


  public CloudResumePositionIntention professionId(String professionId) {
    
    this.professionId = professionId;
    return this;
  }

   /**
   * 行业id(这个字段在目前版本不对外暴露)
   * @return professionId
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aaaaa0000-0000-0000-0000-aaaaaaaaaaaa", value = "行业id(这个字段在目前版本不对外暴露)")

  public String getProfessionId() {
    return professionId;
  }


  public void setProfessionId(String professionId) {
    this.professionId = professionId;
  }


  public CloudResumePositionIntention professionName(String professionName) {
    
    this.professionName = professionName;
    return this;
  }

   /**
   * 行业名称
   * @return professionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "医疗健康", value = "行业名称")

  public String getProfessionName() {
    return professionName;
  }


  public void setProfessionName(String professionName) {
    this.professionName = professionName;
  }


  public CloudResumePositionIntention salaryMax(String salaryMax) {
    
    this.salaryMax = salaryMax;
    return this;
  }

   /**
   * 最大工资
   * @return salaryMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000", value = "最大工资")

  public String getSalaryMax() {
    return salaryMax;
  }


  public void setSalaryMax(String salaryMax) {
    this.salaryMax = salaryMax;
  }


  public CloudResumePositionIntention salaryMin(String salaryMin) {
    
    this.salaryMin = salaryMin;
    return this;
  }

   /**
   * 最小薪资
   * @return salaryMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "最小薪资")

  public String getSalaryMin() {
    return salaryMin;
  }


  public void setSalaryMin(String salaryMin) {
    this.salaryMin = salaryMin;
  }


  public CloudResumePositionIntention salaryUnit(String salaryUnit) {
    
    this.salaryUnit = salaryUnit;
    return this;
  }

   /**
   * 工资单位，/月 /日
   * @return salaryUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MONTH", value = "工资单位，/月 /日")

  public String getSalaryUnit() {
    return salaryUnit;
  }


  public void setSalaryUnit(String salaryUnit) {
    this.salaryUnit = salaryUnit;
  }


  public CloudResumePositionIntention workProperty(String workProperty) {
    
    this.workProperty = workProperty;
    return this;
  }

   /**
   * 工作属性
   * @return workProperty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PART_TIME", value = "工作属性")

  public String getWorkProperty() {
    return workProperty;
  }


  public void setWorkProperty(String workProperty) {
    this.workProperty = workProperty;
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
   * @return the CloudResumePositionIntention instance itself
   */
  public CloudResumePositionIntention putAdditionalProperty(String key, Object value) {
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
    CloudResumePositionIntention cloudResumePositionIntention = (CloudResumePositionIntention) o;
    return Objects.equals(this.intentionCity, cloudResumePositionIntention.intentionCity) &&
        Objects.equals(this.jobId, cloudResumePositionIntention.jobId) &&
        Objects.equals(this.jobName, cloudResumePositionIntention.jobName) &&
        Objects.equals(this.professionId, cloudResumePositionIntention.professionId) &&
        Objects.equals(this.professionName, cloudResumePositionIntention.professionName) &&
        Objects.equals(this.salaryMax, cloudResumePositionIntention.salaryMax) &&
        Objects.equals(this.salaryMin, cloudResumePositionIntention.salaryMin) &&
        Objects.equals(this.salaryUnit, cloudResumePositionIntention.salaryUnit) &&
        Objects.equals(this.workProperty, cloudResumePositionIntention.workProperty)&&
        Objects.equals(this.additionalProperties, cloudResumePositionIntention.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intentionCity, jobId, jobName, professionId, professionName, salaryMax, salaryMin, salaryUnit, workProperty, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudResumePositionIntention {\n");
    sb.append("    intentionCity: ").append(toIndentedString(intentionCity)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    professionId: ").append(toIndentedString(professionId)).append("\n");
    sb.append("    professionName: ").append(toIndentedString(professionName)).append("\n");
    sb.append("    salaryMax: ").append(toIndentedString(salaryMax)).append("\n");
    sb.append("    salaryMin: ").append(toIndentedString(salaryMin)).append("\n");
    sb.append("    salaryUnit: ").append(toIndentedString(salaryUnit)).append("\n");
    sb.append("    workProperty: ").append(toIndentedString(workProperty)).append("\n");
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
    openapiFields.add("intention_city");
    openapiFields.add("job_id");
    openapiFields.add("job_name");
    openapiFields.add("profession_id");
    openapiFields.add("profession_name");
    openapiFields.add("salary_max");
    openapiFields.add("salary_min");
    openapiFields.add("salary_unit");
    openapiFields.add("work_property");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CloudResumePositionIntention
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CloudResumePositionIntention.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudResumePositionIntention is not found in the empty JSON string", CloudResumePositionIntention.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("intention_city") != null && !jsonObj.get("intention_city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `intention_city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("intention_city").toString()));
      }
      if (jsonObj.get("job_id") != null && !jsonObj.get("job_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_id").toString()));
      }
      if (jsonObj.get("job_name") != null && !jsonObj.get("job_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_name").toString()));
      }
      if (jsonObj.get("profession_id") != null && !jsonObj.get("profession_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profession_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profession_id").toString()));
      }
      if (jsonObj.get("profession_name") != null && !jsonObj.get("profession_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profession_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profession_name").toString()));
      }
      if (jsonObj.get("salary_max") != null && !jsonObj.get("salary_max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salary_max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salary_max").toString()));
      }
      if (jsonObj.get("salary_min") != null && !jsonObj.get("salary_min").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salary_min` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salary_min").toString()));
      }
      if (jsonObj.get("salary_unit") != null && !jsonObj.get("salary_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salary_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salary_unit").toString()));
      }
      if (jsonObj.get("work_property") != null && !jsonObj.get("work_property").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `work_property` to be a primitive type in the JSON string but got `%s`", jsonObj.get("work_property").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudResumePositionIntention.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudResumePositionIntention' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudResumePositionIntention> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudResumePositionIntention.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudResumePositionIntention>() {
           @Override
           public void write(JsonWriter out, CloudResumePositionIntention value) throws IOException {
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
           public CloudResumePositionIntention read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CloudResumePositionIntention instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CloudResumePositionIntention given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloudResumePositionIntention
  * @throws IOException if the JSON string is invalid with respect to CloudResumePositionIntention
  */
  public static CloudResumePositionIntention fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudResumePositionIntention.class);
  }

 /**
  * Convert an instance of CloudResumePositionIntention to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

