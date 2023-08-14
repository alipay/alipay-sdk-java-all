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
 * AlipayFundTransRefundResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundTransRefundResponseModel {
  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_REFUND_AMOUNT = "refund_amount";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT)
  private String refundAmount;

  public static final String SERIALIZED_NAME_REFUND_DATE = "refund_date";
  @SerializedName(SERIALIZED_NAME_REFUND_DATE)
  private String refundDate;

  public static final String SERIALIZED_NAME_REFUND_ORDER_ID = "refund_order_id";
  @SerializedName(SERIALIZED_NAME_REFUND_ORDER_ID)
  private String refundOrderId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AlipayFundTransRefundResponseModel() { 
  }

  public AlipayFundTransRefundResponseModel orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 发红包时支付宝返回的支付宝订单号order_id。
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20881030507841230156", value = "发红包时支付宝返回的支付宝订单号order_id。")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public AlipayFundTransRefundResponseModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 标识一次资金退回请求，一笔资金退回失败后重新提交，要采用原来的资金退回单号。总退款金额不能超过用户实际支付金额。
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019063050784123", value = "标识一次资金退回请求，一笔资金退回失败后重新提交，要采用原来的资金退回单号。总退款金额不能超过用户实际支付金额。")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayFundTransRefundResponseModel refundAmount(String refundAmount) {
    
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * 本次退款的金额，单位为元，支持两位小数
   * @return refundAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8.88", value = "本次退款的金额，单位为元，支持两位小数")

  public String getRefundAmount() {
    return refundAmount;
  }


  public void setRefundAmount(String refundAmount) {
    this.refundAmount = refundAmount;
  }


  public AlipayFundTransRefundResponseModel refundDate(String refundDate) {
    
    this.refundDate = refundDate;
    return this;
  }

   /**
   * 退款资金退回
   * @return refundDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-01 08:08:08", value = "退款资金退回")

  public String getRefundDate() {
    return refundDate;
  }


  public void setRefundDate(String refundDate) {
    this.refundDate = refundDate;
  }


  public AlipayFundTransRefundResponseModel refundOrderId(String refundOrderId) {
    
    this.refundOrderId = refundOrderId;
    return this;
  }

   /**
   * 退款的支付宝系统内部单据id
   * @return refundOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000000300210312", value = "退款的支付宝系统内部单据id")

  public String getRefundOrderId() {
    return refundOrderId;
  }


  public void setRefundOrderId(String refundOrderId) {
    this.refundOrderId = refundOrderId;
  }


  public AlipayFundTransRefundResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * SUCCESS：退款成功
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "SUCCESS：退款成功")

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
    AlipayFundTransRefundResponseModel alipayFundTransRefundResponseModel = (AlipayFundTransRefundResponseModel) o;
    return Objects.equals(this.orderId, alipayFundTransRefundResponseModel.orderId) &&
        Objects.equals(this.outRequestNo, alipayFundTransRefundResponseModel.outRequestNo) &&
        Objects.equals(this.refundAmount, alipayFundTransRefundResponseModel.refundAmount) &&
        Objects.equals(this.refundDate, alipayFundTransRefundResponseModel.refundDate) &&
        Objects.equals(this.refundOrderId, alipayFundTransRefundResponseModel.refundOrderId) &&
        Objects.equals(this.status, alipayFundTransRefundResponseModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, outRequestNo, refundAmount, refundDate, refundOrderId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundTransRefundResponseModel {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    refundDate: ").append(toIndentedString(refundDate)).append("\n");
    sb.append("    refundOrderId: ").append(toIndentedString(refundOrderId)).append("\n");
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
    openapiFields.add("order_id");
    openapiFields.add("out_request_no");
    openapiFields.add("refund_amount");
    openapiFields.add("refund_date");
    openapiFields.add("refund_order_id");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundTransRefundResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundTransRefundResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundTransRefundResponseModel is not found in the empty JSON string", AlipayFundTransRefundResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundTransRefundResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundTransRefundResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("refund_amount") != null && !jsonObj.get("refund_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_amount").toString()));
      }
      if (jsonObj.get("refund_date") != null && !jsonObj.get("refund_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_date").toString()));
      }
      if (jsonObj.get("refund_order_id") != null && !jsonObj.get("refund_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_order_id").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundTransRefundResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundTransRefundResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundTransRefundResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundTransRefundResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundTransRefundResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundTransRefundResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundTransRefundResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundTransRefundResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundTransRefundResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundTransRefundResponseModel
  */
  public static AlipayFundTransRefundResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundTransRefundResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundTransRefundResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

