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
import com.alipay.v3.model.SettleExtraParams;
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
 * ZhimaCreditPeZmgoSettleApplyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCreditPeZmgoSettleApplyModel {
  public static final String SERIALIZED_NAME_ACTION_TYPE = "action_type";
  @SerializedName(SERIALIZED_NAME_ACTION_TYPE)
  private String actionType;

  public static final String SERIALIZED_NAME_AGREEMENT_ID = "agreement_id";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_ID)
  private String agreementId;

  public static final String SERIALIZED_NAME_ALIPAY_OPEN_ID = "alipay_open_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_OPEN_ID)
  private String alipayOpenId;

  public static final String SERIALIZED_NAME_ALIPAY_USER_ID = "alipay_user_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_USER_ID)
  private String alipayUserId;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public static final String SERIALIZED_NAME_PAY_AMOUNT = "pay_amount";
  @SerializedName(SERIALIZED_NAME_PAY_AMOUNT)
  private String payAmount;

  public static final String SERIALIZED_NAME_SETTLE_EXTEND_PARAMS = "settle_extend_params";
  @SerializedName(SERIALIZED_NAME_SETTLE_EXTEND_PARAMS)
  private SettleExtraParams settleExtendParams;

  public static final String SERIALIZED_NAME_TOTAL_DISCOUNT_AMOUNT = "total_discount_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISCOUNT_AMOUNT)
  private String totalDiscountAmount;

  public static final String SERIALIZED_NAME_TOTAL_REAL_PAY_AMOUNT = "total_real_pay_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_REAL_PAY_AMOUNT)
  private String totalRealPayAmount;

  public static final String SERIALIZED_NAME_TOTAL_TASK_COUNT = "total_task_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_TASK_COUNT)
  private String totalTaskCount;

  public static final String SERIALIZED_NAME_WITHHOLD_PLAN_NO = "withhold_plan_no";
  @SerializedName(SERIALIZED_NAME_WITHHOLD_PLAN_NO)
  private String withholdPlanNo;

  public ZhimaCreditPeZmgoSettleApplyModel() { 
  }

  public ZhimaCreditPeZmgoSettleApplyModel actionType(String actionType) {
    
    this.actionType = actionType;
    return this;
  }

   /**
   * DEFAULT_SETTLE 默认结算模式; PAY_TO_ZERO 支付转0元；
   * @return actionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT_SETTLE或PAY_TO_ZERO", value = "DEFAULT_SETTLE 默认结算模式; PAY_TO_ZERO 支付转0元；")

  public String getActionType() {
    return actionType;
  }


  public void setActionType(String actionType) {
    this.actionType = actionType;
  }


  public ZhimaCreditPeZmgoSettleApplyModel agreementId(String agreementId) {
    
    this.agreementId = agreementId;
    return this;
  }

   /**
   * 支付宝系统中用以唯一标识用户签约记录的编号。
   * @return agreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZMGO_AGR2020122710020604120000000001", value = "支付宝系统中用以唯一标识用户签约记录的编号。")

  public String getAgreementId() {
    return agreementId;
  }


  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  public ZhimaCreditPeZmgoSettleApplyModel alipayOpenId(String alipayOpenId) {
    
    this.alipayOpenId = alipayOpenId;
    return this;
  }

   /**
   * 买家在支付宝的用户id
   * @return alipayOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "买家在支付宝的用户id")

  public String getAlipayOpenId() {
    return alipayOpenId;
  }


  public void setAlipayOpenId(String alipayOpenId) {
    this.alipayOpenId = alipayOpenId;
  }


  public ZhimaCreditPeZmgoSettleApplyModel alipayUserId(String alipayUserId) {
    
    this.alipayUserId = alipayUserId;
    return this;
  }

   /**
   * 买家在支付宝的用户id
   * @return alipayUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101117955611", value = "买家在支付宝的用户id")

  public String getAlipayUserId() {
    return alipayUserId;
  }


  public void setAlipayUserId(String alipayUserId) {
    this.alipayUserId = alipayUserId;
  }


  public ZhimaCreditPeZmgoSettleApplyModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 商户本次操作的请求流水号，用于标示请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8077735255938032", value = "商户本次操作的请求流水号，用于标示请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public ZhimaCreditPeZmgoSettleApplyModel partnerId(String partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 商户ID
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102146225135", value = "商户ID")

  public String getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  public ZhimaCreditPeZmgoSettleApplyModel payAmount(String payAmount) {
    
    this.payAmount = payAmount;
    return this;
  }

   /**
   * 需要支付的金额，单位为：元（人民币），精确到小数点后两位
   * @return payAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.00", value = "需要支付的金额，单位为：元（人民币），精确到小数点后两位")

  public String getPayAmount() {
    return payAmount;
  }


  public void setPayAmount(String payAmount) {
    this.payAmount = payAmount;
  }


  public ZhimaCreditPeZmgoSettleApplyModel settleExtendParams(SettleExtraParams settleExtendParams) {
    
    this.settleExtendParams = settleExtendParams;
    return this;
  }

   /**
   * Get settleExtendParams
   * @return settleExtendParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SettleExtraParams getSettleExtendParams() {
    return settleExtendParams;
  }


  public void setSettleExtendParams(SettleExtraParams settleExtendParams) {
    this.settleExtendParams = settleExtendParams;
  }


  public ZhimaCreditPeZmgoSettleApplyModel totalDiscountAmount(String totalDiscountAmount) {
    
    this.totalDiscountAmount = totalDiscountAmount;
    return this;
  }

   /**
   * 芝麻GO任务开始到到期过程中和任务相关享受的总优惠金额，单位为：元（人民币），精确到小数点后两位。
   * @return totalDiscountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.00", value = "芝麻GO任务开始到到期过程中和任务相关享受的总优惠金额，单位为：元（人民币），精确到小数点后两位。")

  public String getTotalDiscountAmount() {
    return totalDiscountAmount;
  }


  public void setTotalDiscountAmount(String totalDiscountAmount) {
    this.totalDiscountAmount = totalDiscountAmount;
  }


  public ZhimaCreditPeZmgoSettleApplyModel totalRealPayAmount(String totalRealPayAmount) {
    
    this.totalRealPayAmount = totalRealPayAmount;
    return this;
  }

   /**
   * 芝麻GO任务开始到到期过程中和任务相关支付的总金额，单位为：元（人民币），精确到小数点后两位。
   * @return totalRealPayAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.00", value = "芝麻GO任务开始到到期过程中和任务相关支付的总金额，单位为：元（人民币），精确到小数点后两位。")

  public String getTotalRealPayAmount() {
    return totalRealPayAmount;
  }


  public void setTotalRealPayAmount(String totalRealPayAmount) {
    this.totalRealPayAmount = totalRealPayAmount;
  }


  public ZhimaCreditPeZmgoSettleApplyModel totalTaskCount(String totalTaskCount) {
    
    this.totalTaskCount = totalTaskCount;
    return this;
  }

   /**
   * 芝麻GO任务开始到到期过程中和任务相关完成的任务次数
   * @return totalTaskCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "芝麻GO任务开始到到期过程中和任务相关完成的任务次数")

  public String getTotalTaskCount() {
    return totalTaskCount;
  }


  public void setTotalTaskCount(String totalTaskCount) {
    this.totalTaskCount = totalTaskCount;
  }


  public ZhimaCreditPeZmgoSettleApplyModel withholdPlanNo(String withholdPlanNo) {
    
    this.withholdPlanNo = withholdPlanNo;
    return this;
  }

   /**
   * 芝麻GO结算时，需要传入的扣款单据号。来源于协议到期通知消息，外部商户接入时，该参数必填
   * @return withholdPlanNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZMGO_WHD2021010510020603410000006001", value = "芝麻GO结算时，需要传入的扣款单据号。来源于协议到期通知消息，外部商户接入时，该参数必填")

  public String getWithholdPlanNo() {
    return withholdPlanNo;
  }


  public void setWithholdPlanNo(String withholdPlanNo) {
    this.withholdPlanNo = withholdPlanNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZhimaCreditPeZmgoSettleApplyModel zhimaCreditPeZmgoSettleApplyModel = (ZhimaCreditPeZmgoSettleApplyModel) o;
    return Objects.equals(this.actionType, zhimaCreditPeZmgoSettleApplyModel.actionType) &&
        Objects.equals(this.agreementId, zhimaCreditPeZmgoSettleApplyModel.agreementId) &&
        Objects.equals(this.alipayOpenId, zhimaCreditPeZmgoSettleApplyModel.alipayOpenId) &&
        Objects.equals(this.alipayUserId, zhimaCreditPeZmgoSettleApplyModel.alipayUserId) &&
        Objects.equals(this.outRequestNo, zhimaCreditPeZmgoSettleApplyModel.outRequestNo) &&
        Objects.equals(this.partnerId, zhimaCreditPeZmgoSettleApplyModel.partnerId) &&
        Objects.equals(this.payAmount, zhimaCreditPeZmgoSettleApplyModel.payAmount) &&
        Objects.equals(this.settleExtendParams, zhimaCreditPeZmgoSettleApplyModel.settleExtendParams) &&
        Objects.equals(this.totalDiscountAmount, zhimaCreditPeZmgoSettleApplyModel.totalDiscountAmount) &&
        Objects.equals(this.totalRealPayAmount, zhimaCreditPeZmgoSettleApplyModel.totalRealPayAmount) &&
        Objects.equals(this.totalTaskCount, zhimaCreditPeZmgoSettleApplyModel.totalTaskCount) &&
        Objects.equals(this.withholdPlanNo, zhimaCreditPeZmgoSettleApplyModel.withholdPlanNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, agreementId, alipayOpenId, alipayUserId, outRequestNo, partnerId, payAmount, settleExtendParams, totalDiscountAmount, totalRealPayAmount, totalTaskCount, withholdPlanNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCreditPeZmgoSettleApplyModel {\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    alipayOpenId: ").append(toIndentedString(alipayOpenId)).append("\n");
    sb.append("    alipayUserId: ").append(toIndentedString(alipayUserId)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    payAmount: ").append(toIndentedString(payAmount)).append("\n");
    sb.append("    settleExtendParams: ").append(toIndentedString(settleExtendParams)).append("\n");
    sb.append("    totalDiscountAmount: ").append(toIndentedString(totalDiscountAmount)).append("\n");
    sb.append("    totalRealPayAmount: ").append(toIndentedString(totalRealPayAmount)).append("\n");
    sb.append("    totalTaskCount: ").append(toIndentedString(totalTaskCount)).append("\n");
    sb.append("    withholdPlanNo: ").append(toIndentedString(withholdPlanNo)).append("\n");
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
    openapiFields.add("action_type");
    openapiFields.add("agreement_id");
    openapiFields.add("alipay_open_id");
    openapiFields.add("alipay_user_id");
    openapiFields.add("out_request_no");
    openapiFields.add("partner_id");
    openapiFields.add("pay_amount");
    openapiFields.add("settle_extend_params");
    openapiFields.add("total_discount_amount");
    openapiFields.add("total_real_pay_amount");
    openapiFields.add("total_task_count");
    openapiFields.add("withhold_plan_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCreditPeZmgoSettleApplyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCreditPeZmgoSettleApplyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCreditPeZmgoSettleApplyModel is not found in the empty JSON string", ZhimaCreditPeZmgoSettleApplyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZhimaCreditPeZmgoSettleApplyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZhimaCreditPeZmgoSettleApplyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("action_type") != null && !jsonObj.get("action_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_type").toString()));
      }
      if (jsonObj.get("agreement_id") != null && !jsonObj.get("agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_id").toString()));
      }
      if (jsonObj.get("alipay_open_id") != null && !jsonObj.get("alipay_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_open_id").toString()));
      }
      if (jsonObj.get("alipay_user_id") != null && !jsonObj.get("alipay_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_user_id").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("partner_id") != null && !jsonObj.get("partner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_id").toString()));
      }
      if (jsonObj.get("pay_amount") != null && !jsonObj.get("pay_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_amount").toString()));
      }
      // validate the optional field `settle_extend_params`
      if (jsonObj.getAsJsonObject("settle_extend_params") != null) {
        SettleExtraParams.validateJsonObject(jsonObj.getAsJsonObject("settle_extend_params"));
      }
      if (jsonObj.get("total_discount_amount") != null && !jsonObj.get("total_discount_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_discount_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_discount_amount").toString()));
      }
      if (jsonObj.get("total_real_pay_amount") != null && !jsonObj.get("total_real_pay_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_real_pay_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_real_pay_amount").toString()));
      }
      if (jsonObj.get("total_task_count") != null && !jsonObj.get("total_task_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_task_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_task_count").toString()));
      }
      if (jsonObj.get("withhold_plan_no") != null && !jsonObj.get("withhold_plan_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `withhold_plan_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("withhold_plan_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCreditPeZmgoSettleApplyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCreditPeZmgoSettleApplyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCreditPeZmgoSettleApplyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCreditPeZmgoSettleApplyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCreditPeZmgoSettleApplyModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCreditPeZmgoSettleApplyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZhimaCreditPeZmgoSettleApplyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZhimaCreditPeZmgoSettleApplyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCreditPeZmgoSettleApplyModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCreditPeZmgoSettleApplyModel
  */
  public static ZhimaCreditPeZmgoSettleApplyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCreditPeZmgoSettleApplyModel.class);
  }

 /**
  * Convert an instance of ZhimaCreditPeZmgoSettleApplyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

