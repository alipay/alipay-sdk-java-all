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
import com.alipay.v3.model.RecruitEnrollInfo;
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
 * AlipayMarketingRecruitEnrollCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingRecruitEnrollCreateModel {
  public static final String SERIALIZED_NAME_ENROLL_INFO = "enroll_info";
  @SerializedName(SERIALIZED_NAME_ENROLL_INFO)
  private RecruitEnrollInfo enrollInfo;

  public static final String SERIALIZED_NAME_ENROLL_SCENE_TYPE = "enroll_scene_type";
  @SerializedName(SERIALIZED_NAME_ENROLL_SCENE_TYPE)
  private String enrollSceneType;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public AlipayMarketingRecruitEnrollCreateModel() { 
  }

  public AlipayMarketingRecruitEnrollCreateModel enrollInfo(RecruitEnrollInfo enrollInfo) {
    
    this.enrollInfo = enrollInfo;
    return this;
  }

   /**
   * Get enrollInfo
   * @return enrollInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecruitEnrollInfo getEnrollInfo() {
    return enrollInfo;
  }


  public void setEnrollInfo(RecruitEnrollInfo enrollInfo) {
    this.enrollInfo = enrollInfo;
  }


  public AlipayMarketingRecruitEnrollCreateModel enrollSceneType(String enrollSceneType) {
    
    this.enrollSceneType = enrollSceneType;
    return this;
  }

   /**
   * 活动报名场景配置。 枚举值： VOUCHER：券报名场景的报名； MINI_APP：小程序报名场景的报名；
   * @return enrollSceneType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VOUCHER", value = "活动报名场景配置。 枚举值： VOUCHER：券报名场景的报名； MINI_APP：小程序报名场景的报名；")

  public String getEnrollSceneType() {
    return enrollSceneType;
  }


  public void setEnrollSceneType(String enrollSceneType) {
    this.enrollSceneType = enrollSceneType;
  }


  public AlipayMarketingRecruitEnrollCreateModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部操作流水号。由商家/ISV 自定义，仅支持字母、数字、下划线且需保证每次操作唯一。
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21ba1e1c16456985463242192e4d", value = "外部操作流水号。由商家/ISV 自定义，仅支持字母、数字、下划线且需保证每次操作唯一。")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayMarketingRecruitEnrollCreateModel planId(String planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * 要报名的招商方案ID
   * @return planId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021041301000200000077974217", value = "要报名的招商方案ID")

  public String getPlanId() {
    return planId;
  }


  public void setPlanId(String planId) {
    this.planId = planId;
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
   * @return the AlipayMarketingRecruitEnrollCreateModel instance itself
   */
  public AlipayMarketingRecruitEnrollCreateModel putAdditionalProperty(String key, Object value) {
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
    AlipayMarketingRecruitEnrollCreateModel alipayMarketingRecruitEnrollCreateModel = (AlipayMarketingRecruitEnrollCreateModel) o;
    return Objects.equals(this.enrollInfo, alipayMarketingRecruitEnrollCreateModel.enrollInfo) &&
        Objects.equals(this.enrollSceneType, alipayMarketingRecruitEnrollCreateModel.enrollSceneType) &&
        Objects.equals(this.outBizNo, alipayMarketingRecruitEnrollCreateModel.outBizNo) &&
        Objects.equals(this.planId, alipayMarketingRecruitEnrollCreateModel.planId)&&
        Objects.equals(this.additionalProperties, alipayMarketingRecruitEnrollCreateModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enrollInfo, enrollSceneType, outBizNo, planId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingRecruitEnrollCreateModel {\n");
    sb.append("    enrollInfo: ").append(toIndentedString(enrollInfo)).append("\n");
    sb.append("    enrollSceneType: ").append(toIndentedString(enrollSceneType)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
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
    openapiFields.add("enroll_info");
    openapiFields.add("enroll_scene_type");
    openapiFields.add("out_biz_no");
    openapiFields.add("plan_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingRecruitEnrollCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingRecruitEnrollCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingRecruitEnrollCreateModel is not found in the empty JSON string", AlipayMarketingRecruitEnrollCreateModel.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `enroll_info`
      if (jsonObj.getAsJsonObject("enroll_info") != null) {
        RecruitEnrollInfo.validateJsonObject(jsonObj.getAsJsonObject("enroll_info"));
      }
      if (jsonObj.get("enroll_scene_type") != null && !jsonObj.get("enroll_scene_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enroll_scene_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enroll_scene_type").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("plan_id") != null && !jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingRecruitEnrollCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingRecruitEnrollCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingRecruitEnrollCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingRecruitEnrollCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingRecruitEnrollCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingRecruitEnrollCreateModel value) throws IOException {
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
           public AlipayMarketingRecruitEnrollCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMarketingRecruitEnrollCreateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMarketingRecruitEnrollCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingRecruitEnrollCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingRecruitEnrollCreateModel
  */
  public static AlipayMarketingRecruitEnrollCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingRecruitEnrollCreateModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingRecruitEnrollCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

