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
import com.alipay.v3.model.BelongMerchantInfo;
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
 * ActivityBaseInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ActivityBaseInfo {
  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId;

  public static final String SERIALIZED_NAME_ACTIVITY_NAME = "activity_name";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_NAME)
  private String activityName;

  public static final String SERIALIZED_NAME_ACTIVITY_OPERATION_STATUS = "activity_operation_status";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_OPERATION_STATUS)
  private String activityOperationStatus;

  public static final String SERIALIZED_NAME_ACTIVITY_PRODUCT_TYPE = "activity_product_type";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_PRODUCT_TYPE)
  private String activityProductType;

  public static final String SERIALIZED_NAME_ACTIVITY_STATUS = "activity_status";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_STATUS)
  private String activityStatus;

  public static final String SERIALIZED_NAME_BELONG_MERCHANT_INFO = "belong_merchant_info";
  @SerializedName(SERIALIZED_NAME_BELONG_MERCHANT_INFO)
  private BelongMerchantInfo belongMerchantInfo;

  public static final String SERIALIZED_NAME_CODE_MODE = "code_mode";
  @SerializedName(SERIALIZED_NAME_CODE_MODE)
  private String codeMode;

  public static final String SERIALIZED_NAME_OUT_ACTIVITY_ID = "out_activity_id";
  @SerializedName(SERIALIZED_NAME_OUT_ACTIVITY_ID)
  private String outActivityId;

  public ActivityBaseInfo() { 
  }

  public ActivityBaseInfo activityId(String activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 活动id
   * @return activityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "活动id")

  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public ActivityBaseInfo activityName(String activityName) {
    
    this.activityName = activityName;
    return this;
  }

   /**
   * 活动名称。 不对用户进行展示，仅供商家在后台管理活动使用。
   * @return activityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "活动名称。 不对用户进行展示，仅供商家在后台管理活动使用。")

  public String getActivityName() {
    return activityName;
  }


  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }


  public ActivityBaseInfo activityOperationStatus(String activityOperationStatus) {
    
    this.activityOperationStatus = activityOperationStatus;
    return this;
  }

   /**
   * 活动操作状态。
   * @return activityOperationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "活动操作状态。")

  public String getActivityOperationStatus() {
    return activityOperationStatus;
  }


  public void setActivityOperationStatus(String activityOperationStatus) {
    this.activityOperationStatus = activityOperationStatus;
  }


  public ActivityBaseInfo activityProductType(String activityProductType) {
    
    this.activityProductType = activityProductType;
    return this;
  }

   /**
   * 券活动产品类型
   * @return activityProductType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券活动产品类型")

  public String getActivityProductType() {
    return activityProductType;
  }


  public void setActivityProductType(String activityProductType) {
    this.activityProductType = activityProductType;
  }


  public ActivityBaseInfo activityStatus(String activityStatus) {
    
    this.activityStatus = activityStatus;
    return this;
  }

   /**
   * 活动状态。 已激活状态表示活动正常运行。已终止状态表示商家终止活动，不可再发放。
   * @return activityStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "活动状态。 已激活状态表示活动正常运行。已终止状态表示商家终止活动，不可再发放。")

  public String getActivityStatus() {
    return activityStatus;
  }


  public void setActivityStatus(String activityStatus) {
    this.activityStatus = activityStatus;
  }


  public ActivityBaseInfo belongMerchantInfo(BelongMerchantInfo belongMerchantInfo) {
    
    this.belongMerchantInfo = belongMerchantInfo;
    return this;
  }

   /**
   * Get belongMerchantInfo
   * @return belongMerchantInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BelongMerchantInfo getBelongMerchantInfo() {
    return belongMerchantInfo;
  }


  public void setBelongMerchantInfo(BelongMerchantInfo belongMerchantInfo) {
    this.belongMerchantInfo = belongMerchantInfo;
  }


  public ActivityBaseInfo codeMode(String codeMode) {
    
    this.codeMode = codeMode;
    return this;
  }

   /**
   * 码模式。  MERCHANT_UPLOAD：商户上传自定义code，发券时系统随机选取上传的券code发放 MERCHANT_API：发奖时指定券码发奖，此模式无须提前上传券码。
   * @return codeMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "码模式。  MERCHANT_UPLOAD：商户上传自定义code，发券时系统随机选取上传的券code发放 MERCHANT_API：发奖时指定券码发奖，此模式无须提前上传券码。")

  public String getCodeMode() {
    return codeMode;
  }


  public void setCodeMode(String codeMode) {
    this.codeMode = codeMode;
  }


  public ActivityBaseInfo outActivityId(String outActivityId) {
    
    this.outActivityId = outActivityId;
    return this;
  }

   /**
   * 外部活动ID
   * @return outActivityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "外部活动ID")

  public String getOutActivityId() {
    return outActivityId;
  }


  public void setOutActivityId(String outActivityId) {
    this.outActivityId = outActivityId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityBaseInfo activityBaseInfo = (ActivityBaseInfo) o;
    return Objects.equals(this.activityId, activityBaseInfo.activityId) &&
        Objects.equals(this.activityName, activityBaseInfo.activityName) &&
        Objects.equals(this.activityOperationStatus, activityBaseInfo.activityOperationStatus) &&
        Objects.equals(this.activityProductType, activityBaseInfo.activityProductType) &&
        Objects.equals(this.activityStatus, activityBaseInfo.activityStatus) &&
        Objects.equals(this.belongMerchantInfo, activityBaseInfo.belongMerchantInfo) &&
        Objects.equals(this.codeMode, activityBaseInfo.codeMode) &&
        Objects.equals(this.outActivityId, activityBaseInfo.outActivityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, activityName, activityOperationStatus, activityProductType, activityStatus, belongMerchantInfo, codeMode, outActivityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityBaseInfo {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
    sb.append("    activityOperationStatus: ").append(toIndentedString(activityOperationStatus)).append("\n");
    sb.append("    activityProductType: ").append(toIndentedString(activityProductType)).append("\n");
    sb.append("    activityStatus: ").append(toIndentedString(activityStatus)).append("\n");
    sb.append("    belongMerchantInfo: ").append(toIndentedString(belongMerchantInfo)).append("\n");
    sb.append("    codeMode: ").append(toIndentedString(codeMode)).append("\n");
    sb.append("    outActivityId: ").append(toIndentedString(outActivityId)).append("\n");
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
    openapiFields.add("activity_id");
    openapiFields.add("activity_name");
    openapiFields.add("activity_operation_status");
    openapiFields.add("activity_product_type");
    openapiFields.add("activity_status");
    openapiFields.add("belong_merchant_info");
    openapiFields.add("code_mode");
    openapiFields.add("out_activity_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ActivityBaseInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ActivityBaseInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActivityBaseInfo is not found in the empty JSON string", ActivityBaseInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ActivityBaseInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActivityBaseInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("activity_id") != null && !jsonObj.get("activity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_id").toString()));
      }
      if (jsonObj.get("activity_name") != null && !jsonObj.get("activity_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_name").toString()));
      }
      if (jsonObj.get("activity_operation_status") != null && !jsonObj.get("activity_operation_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_operation_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_operation_status").toString()));
      }
      if (jsonObj.get("activity_product_type") != null && !jsonObj.get("activity_product_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_product_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_product_type").toString()));
      }
      if (jsonObj.get("activity_status") != null && !jsonObj.get("activity_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_status").toString()));
      }
      // validate the optional field `belong_merchant_info`
      if (jsonObj.getAsJsonObject("belong_merchant_info") != null) {
        BelongMerchantInfo.validateJsonObject(jsonObj.getAsJsonObject("belong_merchant_info"));
      }
      if (jsonObj.get("code_mode") != null && !jsonObj.get("code_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code_mode").toString()));
      }
      if (jsonObj.get("out_activity_id") != null && !jsonObj.get("out_activity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_activity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_activity_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActivityBaseInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActivityBaseInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActivityBaseInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActivityBaseInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ActivityBaseInfo>() {
           @Override
           public void write(JsonWriter out, ActivityBaseInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActivityBaseInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActivityBaseInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActivityBaseInfo
  * @throws IOException if the JSON string is invalid with respect to ActivityBaseInfo
  */
  public static ActivityBaseInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActivityBaseInfo.class);
  }

 /**
  * Convert an instance of ActivityBaseInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

