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
 * AlipayMarketingRecruitEnrollQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingRecruitEnrollQueryResponseModel {
  public static final String SERIALIZED_NAME_ENROLL_ID = "enroll_id";
  @SerializedName(SERIALIZED_NAME_ENROLL_ID)
  private String enrollId;

  public static final String SERIALIZED_NAME_ENROLL_INFO = "enroll_info";
  @SerializedName(SERIALIZED_NAME_ENROLL_INFO)
  private RecruitEnrollInfo enrollInfo;

  public static final String SERIALIZED_NAME_ENROLL_SCENE_TYPE = "enroll_scene_type";
  @SerializedName(SERIALIZED_NAME_ENROLL_SCENE_TYPE)
  private String enrollSceneType;

  public static final String SERIALIZED_NAME_ENROLL_TIME = "enroll_time";
  @SerializedName(SERIALIZED_NAME_ENROLL_TIME)
  private String enrollTime;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AlipayMarketingRecruitEnrollQueryResponseModel() { 
  }

  public AlipayMarketingRecruitEnrollQueryResponseModel enrollId(String enrollId) {
    
    this.enrollId = enrollId;
    return this;
  }

   /**
   * 报名ID
   * @return enrollId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021041301000200000000000000", value = "报名ID")

  public String getEnrollId() {
    return enrollId;
  }


  public void setEnrollId(String enrollId) {
    this.enrollId = enrollId;
  }


  public AlipayMarketingRecruitEnrollQueryResponseModel enrollInfo(RecruitEnrollInfo enrollInfo) {
    
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


  public AlipayMarketingRecruitEnrollQueryResponseModel enrollSceneType(String enrollSceneType) {
    
    this.enrollSceneType = enrollSceneType;
    return this;
  }

   /**
   * 报名所属的活动报名场景。 枚举值： VOUCHER：属于券报名场景； MINI_APP：属于小程序报名场景；
   * @return enrollSceneType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VOUCHER", value = "报名所属的活动报名场景。 枚举值： VOUCHER：属于券报名场景； MINI_APP：属于小程序报名场景；")

  public String getEnrollSceneType() {
    return enrollSceneType;
  }


  public void setEnrollSceneType(String enrollSceneType) {
    this.enrollSceneType = enrollSceneType;
  }


  public AlipayMarketingRecruitEnrollQueryResponseModel enrollTime(String enrollTime) {
    
    this.enrollTime = enrollTime;
    return this;
  }

   /**
   * 报名时间
   * @return enrollTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-10-10 10:10:10", value = "报名时间")

  public String getEnrollTime() {
    return enrollTime;
  }


  public void setEnrollTime(String enrollTime) {
    this.enrollTime = enrollTime;
  }


  public AlipayMarketingRecruitEnrollQueryResponseModel memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 备注字段
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "报名审核不通过", value = "备注字段")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public AlipayMarketingRecruitEnrollQueryResponseModel outBizNo(String outBizNo) {
    
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


  public AlipayMarketingRecruitEnrollQueryResponseModel planId(String planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * 招商方案ID
   * @return planId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021041301000200000000000000", value = "招商方案ID")

  public String getPlanId() {
    return planId;
  }


  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public AlipayMarketingRecruitEnrollQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 报名状态： AUDITING 审核中； ENABLED 通过 ； REJECTED 不通过 ； CLOSING 下线审核中 ； CLOSED 已下线；
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENABLED", value = "报名状态： AUDITING 审核中； ENABLED 通过 ； REJECTED 不通过 ； CLOSING 下线审核中 ； CLOSED 已下线；")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingRecruitEnrollQueryResponseModel alipayMarketingRecruitEnrollQueryResponseModel = (AlipayMarketingRecruitEnrollQueryResponseModel) o;
    return Objects.equals(this.enrollId, alipayMarketingRecruitEnrollQueryResponseModel.enrollId) &&
        Objects.equals(this.enrollInfo, alipayMarketingRecruitEnrollQueryResponseModel.enrollInfo) &&
        Objects.equals(this.enrollSceneType, alipayMarketingRecruitEnrollQueryResponseModel.enrollSceneType) &&
        Objects.equals(this.enrollTime, alipayMarketingRecruitEnrollQueryResponseModel.enrollTime) &&
        Objects.equals(this.memo, alipayMarketingRecruitEnrollQueryResponseModel.memo) &&
        Objects.equals(this.outBizNo, alipayMarketingRecruitEnrollQueryResponseModel.outBizNo) &&
        Objects.equals(this.planId, alipayMarketingRecruitEnrollQueryResponseModel.planId) &&
        Objects.equals(this.status, alipayMarketingRecruitEnrollQueryResponseModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enrollId, enrollInfo, enrollSceneType, enrollTime, memo, outBizNo, planId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingRecruitEnrollQueryResponseModel {\n");
    sb.append("    enrollId: ").append(toIndentedString(enrollId)).append("\n");
    sb.append("    enrollInfo: ").append(toIndentedString(enrollInfo)).append("\n");
    sb.append("    enrollSceneType: ").append(toIndentedString(enrollSceneType)).append("\n");
    sb.append("    enrollTime: ").append(toIndentedString(enrollTime)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("enroll_id");
    openapiFields.add("enroll_info");
    openapiFields.add("enroll_scene_type");
    openapiFields.add("enroll_time");
    openapiFields.add("memo");
    openapiFields.add("out_biz_no");
    openapiFields.add("plan_id");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingRecruitEnrollQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingRecruitEnrollQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingRecruitEnrollQueryResponseModel is not found in the empty JSON string", AlipayMarketingRecruitEnrollQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingRecruitEnrollQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingRecruitEnrollQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("enroll_id") != null && !jsonObj.get("enroll_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enroll_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enroll_id").toString()));
      }
      // validate the optional field `enroll_info`
      if (jsonObj.getAsJsonObject("enroll_info") != null) {
        RecruitEnrollInfo.validateJsonObject(jsonObj.getAsJsonObject("enroll_info"));
      }
      if (jsonObj.get("enroll_scene_type") != null && !jsonObj.get("enroll_scene_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enroll_scene_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enroll_scene_type").toString()));
      }
      if (jsonObj.get("enroll_time") != null && !jsonObj.get("enroll_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enroll_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enroll_time").toString()));
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("plan_id") != null && !jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingRecruitEnrollQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingRecruitEnrollQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingRecruitEnrollQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingRecruitEnrollQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingRecruitEnrollQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingRecruitEnrollQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingRecruitEnrollQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingRecruitEnrollQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingRecruitEnrollQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingRecruitEnrollQueryResponseModel
  */
  public static AlipayMarketingRecruitEnrollQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingRecruitEnrollQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingRecruitEnrollQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

