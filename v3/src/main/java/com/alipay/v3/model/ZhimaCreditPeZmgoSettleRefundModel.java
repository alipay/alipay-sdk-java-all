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
 * ZhimaCreditPeZmgoSettleRefundModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCreditPeZmgoSettleRefundModel {
  public static final String SERIALIZED_NAME_AGREEMENT_ID = "agreement_id";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_ID)
  private String agreementId;

  public static final String SERIALIZED_NAME_ALIPAY_OPEN_ID = "alipay_open_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_OPEN_ID)
  private String alipayOpenId;

  public static final String SERIALIZED_NAME_ALIPAY_USER_ID = "alipay_user_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_USER_ID)
  private String alipayUserId;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public static final String SERIALIZED_NAME_REFUND_AMOUNT = "refund_amount";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT)
  private String refundAmount;

  public static final String SERIALIZED_NAME_REFUND_TYPE = "refund_type";
  @SerializedName(SERIALIZED_NAME_REFUND_TYPE)
  private String refundType;

  public static final String SERIALIZED_NAME_WITHHOLD_PLAN_NO = "withhold_plan_no";
  @SerializedName(SERIALIZED_NAME_WITHHOLD_PLAN_NO)
  private String withholdPlanNo;

  public ZhimaCreditPeZmgoSettleRefundModel() { 
  }

  public ZhimaCreditPeZmgoSettleRefundModel agreementId(String agreementId) {
    
    this.agreementId = agreementId;
    return this;
  }

   /**
   * 签约芝麻GO的业务协议号，在签约成功、结算成功等通知中回回传给商户。
   * @return agreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZMGO_AGR2021010510020604080000006001", value = "签约芝麻GO的业务协议号，在签约成功、结算成功等通知中回回传给商户。")

  public String getAgreementId() {
    return agreementId;
  }


  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  public ZhimaCreditPeZmgoSettleRefundModel alipayOpenId(String alipayOpenId) {
    
    this.alipayOpenId = alipayOpenId;
    return this;
  }

   /**
   * 支付宝用户ID
   * @return alipayOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "支付宝用户ID")

  public String getAlipayOpenId() {
    return alipayOpenId;
  }


  public void setAlipayOpenId(String alipayOpenId) {
    this.alipayOpenId = alipayOpenId;
  }


  public ZhimaCreditPeZmgoSettleRefundModel alipayUserId(String alipayUserId) {
    
    this.alipayUserId = alipayUserId;
    return this;
  }

   /**
   * 支付宝用户ID
   * @return alipayUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088302841345600", value = "支付宝用户ID")

  public String getAlipayUserId() {
    return alipayUserId;
  }


  public void setAlipayUserId(String alipayUserId) {
    this.alipayUserId = alipayUserId;
  }


  public ZhimaCreditPeZmgoSettleRefundModel memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 本次退款说明
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "退款", value = "本次退款说明")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public ZhimaCreditPeZmgoSettleRefundModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 外部请求号
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99202005050100930053707258", value = "外部请求号")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public ZhimaCreditPeZmgoSettleRefundModel partnerId(String partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 商户ID
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088302424614288", value = "商户ID")

  public String getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  public ZhimaCreditPeZmgoSettleRefundModel refundAmount(String refundAmount) {
    
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * 退款金额，单位为：元（人民币），精确到小数点后两位
   * @return refundAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.00", value = "退款金额，单位为：元（人民币），精确到小数点后两位")

  public String getRefundAmount() {
    return refundAmount;
  }


  public void setRefundAmount(String refundAmount) {
    this.refundAmount = refundAmount;
  }


  public ZhimaCreditPeZmgoSettleRefundModel refundType(String refundType) {
    
    this.refundType = refundType;
    return this;
  }

   /**
   * 退款类型： MEMBER_FEE_REFUND 会员费结算退款 ，WITHHOLD_FEE_REFUND 周期扣款金额退款。 不填写默认为 MEMBER_FEE_REFUND
   * @return refundType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MEMBER_FEE_REFUND", value = "退款类型： MEMBER_FEE_REFUND 会员费结算退款 ，WITHHOLD_FEE_REFUND 周期扣款金额退款。 不填写默认为 MEMBER_FEE_REFUND")

  public String getRefundType() {
    return refundType;
  }


  public void setRefundType(String refundType) {
    this.refundType = refundType;
  }


  public ZhimaCreditPeZmgoSettleRefundModel withholdPlanNo(String withholdPlanNo) {
    
    this.withholdPlanNo = withholdPlanNo;
    return this;
  }

   /**
   * 芝麻侧扣款计划单据号，在结算扣款成功的通知消息中会回传。
   * @return withholdPlanNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZMGO_WHD2021010510020603410000006001", value = "芝麻侧扣款计划单据号，在结算扣款成功的通知消息中会回传。")

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
    ZhimaCreditPeZmgoSettleRefundModel zhimaCreditPeZmgoSettleRefundModel = (ZhimaCreditPeZmgoSettleRefundModel) o;
    return Objects.equals(this.agreementId, zhimaCreditPeZmgoSettleRefundModel.agreementId) &&
        Objects.equals(this.alipayOpenId, zhimaCreditPeZmgoSettleRefundModel.alipayOpenId) &&
        Objects.equals(this.alipayUserId, zhimaCreditPeZmgoSettleRefundModel.alipayUserId) &&
        Objects.equals(this.memo, zhimaCreditPeZmgoSettleRefundModel.memo) &&
        Objects.equals(this.outRequestNo, zhimaCreditPeZmgoSettleRefundModel.outRequestNo) &&
        Objects.equals(this.partnerId, zhimaCreditPeZmgoSettleRefundModel.partnerId) &&
        Objects.equals(this.refundAmount, zhimaCreditPeZmgoSettleRefundModel.refundAmount) &&
        Objects.equals(this.refundType, zhimaCreditPeZmgoSettleRefundModel.refundType) &&
        Objects.equals(this.withholdPlanNo, zhimaCreditPeZmgoSettleRefundModel.withholdPlanNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementId, alipayOpenId, alipayUserId, memo, outRequestNo, partnerId, refundAmount, refundType, withholdPlanNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCreditPeZmgoSettleRefundModel {\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    alipayOpenId: ").append(toIndentedString(alipayOpenId)).append("\n");
    sb.append("    alipayUserId: ").append(toIndentedString(alipayUserId)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    refundType: ").append(toIndentedString(refundType)).append("\n");
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
    openapiFields.add("agreement_id");
    openapiFields.add("alipay_open_id");
    openapiFields.add("alipay_user_id");
    openapiFields.add("memo");
    openapiFields.add("out_request_no");
    openapiFields.add("partner_id");
    openapiFields.add("refund_amount");
    openapiFields.add("refund_type");
    openapiFields.add("withhold_plan_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCreditPeZmgoSettleRefundModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCreditPeZmgoSettleRefundModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCreditPeZmgoSettleRefundModel is not found in the empty JSON string", ZhimaCreditPeZmgoSettleRefundModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZhimaCreditPeZmgoSettleRefundModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZhimaCreditPeZmgoSettleRefundModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
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
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("partner_id") != null && !jsonObj.get("partner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_id").toString()));
      }
      if (jsonObj.get("refund_amount") != null && !jsonObj.get("refund_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_amount").toString()));
      }
      if (jsonObj.get("refund_type") != null && !jsonObj.get("refund_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_type").toString()));
      }
      if (jsonObj.get("withhold_plan_no") != null && !jsonObj.get("withhold_plan_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `withhold_plan_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("withhold_plan_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCreditPeZmgoSettleRefundModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCreditPeZmgoSettleRefundModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCreditPeZmgoSettleRefundModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCreditPeZmgoSettleRefundModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCreditPeZmgoSettleRefundModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCreditPeZmgoSettleRefundModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZhimaCreditPeZmgoSettleRefundModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZhimaCreditPeZmgoSettleRefundModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCreditPeZmgoSettleRefundModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCreditPeZmgoSettleRefundModel
  */
  public static ZhimaCreditPeZmgoSettleRefundModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCreditPeZmgoSettleRefundModel.class);
  }

 /**
  * Convert an instance of ZhimaCreditPeZmgoSettleRefundModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

