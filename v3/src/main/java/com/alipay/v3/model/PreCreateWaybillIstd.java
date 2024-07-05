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
 * PreCreateWaybillIstd
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PreCreateWaybillIstd {
  public static final String SERIALIZED_NAME_COUPON_FEE = "coupon_fee";
  @SerializedName(SERIALIZED_NAME_COUPON_FEE)
  private String couponFee;

  public static final String SERIALIZED_NAME_DELIVER_FEE = "deliver_fee";
  @SerializedName(SERIALIZED_NAME_DELIVER_FEE)
  private String deliverFee;

  public static final String SERIALIZED_NAME_DISPATCH_DURATION = "dispatch_duration";
  @SerializedName(SERIALIZED_NAME_DISPATCH_DURATION)
  private Integer dispatchDuration;

  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private Integer distance;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private String fee;

  public static final String SERIALIZED_NAME_INSURANCE_FEE = "insurance_fee";
  @SerializedName(SERIALIZED_NAME_INSURANCE_FEE)
  private String insuranceFee;

  public static final String SERIALIZED_NAME_LOGISTICS_CODE = "logistics_code";
  @SerializedName(SERIALIZED_NAME_LOGISTICS_CODE)
  private String logisticsCode;

  public static final String SERIALIZED_NAME_LOGISTICS_TOKEN = "logistics_token";
  @SerializedName(SERIALIZED_NAME_LOGISTICS_TOKEN)
  private String logisticsToken;

  public static final String SERIALIZED_NAME_PAY_AMOUNT = "pay_amount";
  @SerializedName(SERIALIZED_NAME_PAY_AMOUNT)
  private String payAmount;

  public static final String SERIALIZED_NAME_SERVICE_CODE = "service_code";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODE)
  private String serviceCode;

  public static final String SERIALIZED_NAME_THIRD_CODE = "third_code";
  @SerializedName(SERIALIZED_NAME_THIRD_CODE)
  private String thirdCode;

  public static final String SERIALIZED_NAME_THIRD_SUB_CODE = "third_sub_code";
  @SerializedName(SERIALIZED_NAME_THIRD_SUB_CODE)
  private String thirdSubCode;

  public static final String SERIALIZED_NAME_THIRD_SUB_MSG = "third_sub_msg";
  @SerializedName(SERIALIZED_NAME_THIRD_SUB_MSG)
  private String thirdSubMsg;

  public PreCreateWaybillIstd() { 
  }

  public PreCreateWaybillIstd couponFee(String couponFee) {
    
    this.couponFee = couponFee;
    return this;
  }

   /**
   * 优惠券费用
   * @return couponFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.00", value = "优惠券费用")

  public String getCouponFee() {
    return couponFee;
  }


  public void setCouponFee(String couponFee) {
    this.couponFee = couponFee;
  }


  public PreCreateWaybillIstd deliverFee(String deliverFee) {
    
    this.deliverFee = deliverFee;
    return this;
  }

   /**
   * 运费
   * @return deliverFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.00", value = "运费")

  public String getDeliverFee() {
    return deliverFee;
  }


  public void setDeliverFee(String deliverFee) {
    this.deliverFee = deliverFee;
  }


  public PreCreateWaybillIstd dispatchDuration(Integer dispatchDuration) {
    
    this.dispatchDuration = dispatchDuration;
    return this;
  }

   /**
   * 预计骑手还剩多久接单（单位：秒）
   * @return dispatchDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300", value = "预计骑手还剩多久接单（单位：秒）")

  public Integer getDispatchDuration() {
    return dispatchDuration;
  }


  public void setDispatchDuration(Integer dispatchDuration) {
    this.dispatchDuration = dispatchDuration;
  }


  public PreCreateWaybillIstd distance(Integer distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * 配送距离(单位：米)
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "配送距离(单位：米)")

  public Integer getDistance() {
    return distance;
  }


  public void setDistance(Integer distance) {
    this.distance = distance;
  }


  public PreCreateWaybillIstd fee(String fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * 实际运费
   * @return fee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9.00", value = "实际运费")

  public String getFee() {
    return fee;
  }


  public void setFee(String fee) {
    this.fee = fee;
  }


  public PreCreateWaybillIstd insuranceFee(String insuranceFee) {
    
    this.insuranceFee = insuranceFee;
    return this;
  }

   /**
   * 保价费用
   * @return insuranceFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.00", value = "保价费用")

  public String getInsuranceFee() {
    return insuranceFee;
  }


  public void setInsuranceFee(String insuranceFee) {
    this.insuranceFee = insuranceFee;
  }


  public PreCreateWaybillIstd logisticsCode(String logisticsCode) {
    
    this.logisticsCode = logisticsCode;
    return this;
  }

   /**
   * 即时配送公司编码
   * @return logisticsCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FENGNIAO", value = "即时配送公司编码")

  public String getLogisticsCode() {
    return logisticsCode;
  }


  public void setLogisticsCode(String logisticsCode) {
    this.logisticsCode = logisticsCode;
  }


  public PreCreateWaybillIstd logisticsToken(String logisticsToken) {
    
    this.logisticsToken = logisticsToken;
    return this;
  }

   /**
   * 配送公司可以返回此字段，当商家下单时候带上这个字段，保证在一段时间内运费不变
   * @return logisticsToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "token001", value = "配送公司可以返回此字段，当商家下单时候带上这个字段，保证在一段时间内运费不变")

  public String getLogisticsToken() {
    return logisticsToken;
  }


  public void setLogisticsToken(String logisticsToken) {
    this.logisticsToken = logisticsToken;
  }


  public PreCreateWaybillIstd payAmount(String payAmount) {
    
    this.payAmount = payAmount;
    return this;
  }

   /**
   * 支付金额，实际扣减的费用以此字段为准
   * @return payAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9.00", value = "支付金额，实际扣减的费用以此字段为准")

  public String getPayAmount() {
    return payAmount;
  }


  public void setPayAmount(String payAmount) {
    this.payAmount = payAmount;
  }


  public PreCreateWaybillIstd serviceCode(String serviceCode) {
    
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * 即时配送公司服务代码
   * @return serviceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fengniao01", value = "即时配送公司服务代码")

  public String getServiceCode() {
    return serviceCode;
  }


  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }


  public PreCreateWaybillIstd thirdCode(String thirdCode) {
    
    this.thirdCode = thirdCode;
    return this;
  }

   /**
   * 即时配送公司返回的响应码。10000表示业务处理成功，40004表示业务处理失败。
   * @return thirdCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "即时配送公司返回的响应码。10000表示业务处理成功，40004表示业务处理失败。")

  public String getThirdCode() {
    return thirdCode;
  }


  public void setThirdCode(String thirdCode) {
    this.thirdCode = thirdCode;
  }


  public PreCreateWaybillIstd thirdSubCode(String thirdSubCode) {
    
    this.thirdSubCode = thirdSubCode;
    return this;
  }

   /**
   * 即时配送公司返回的错误码
   * @return thirdSubCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxx", value = "即时配送公司返回的错误码")

  public String getThirdSubCode() {
    return thirdSubCode;
  }


  public void setThirdSubCode(String thirdSubCode) {
    this.thirdSubCode = thirdSubCode;
  }


  public PreCreateWaybillIstd thirdSubMsg(String thirdSubMsg) {
    
    this.thirdSubMsg = thirdSubMsg;
    return this;
  }

   /**
   * 即时配送公司返回的错误描述
   * @return thirdSubMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxx", value = "即时配送公司返回的错误描述")

  public String getThirdSubMsg() {
    return thirdSubMsg;
  }


  public void setThirdSubMsg(String thirdSubMsg) {
    this.thirdSubMsg = thirdSubMsg;
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
   * @return the PreCreateWaybillIstd instance itself
   */
  public PreCreateWaybillIstd putAdditionalProperty(String key, Object value) {
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
    PreCreateWaybillIstd preCreateWaybillIstd = (PreCreateWaybillIstd) o;
    return Objects.equals(this.couponFee, preCreateWaybillIstd.couponFee) &&
        Objects.equals(this.deliverFee, preCreateWaybillIstd.deliverFee) &&
        Objects.equals(this.dispatchDuration, preCreateWaybillIstd.dispatchDuration) &&
        Objects.equals(this.distance, preCreateWaybillIstd.distance) &&
        Objects.equals(this.fee, preCreateWaybillIstd.fee) &&
        Objects.equals(this.insuranceFee, preCreateWaybillIstd.insuranceFee) &&
        Objects.equals(this.logisticsCode, preCreateWaybillIstd.logisticsCode) &&
        Objects.equals(this.logisticsToken, preCreateWaybillIstd.logisticsToken) &&
        Objects.equals(this.payAmount, preCreateWaybillIstd.payAmount) &&
        Objects.equals(this.serviceCode, preCreateWaybillIstd.serviceCode) &&
        Objects.equals(this.thirdCode, preCreateWaybillIstd.thirdCode) &&
        Objects.equals(this.thirdSubCode, preCreateWaybillIstd.thirdSubCode) &&
        Objects.equals(this.thirdSubMsg, preCreateWaybillIstd.thirdSubMsg)&&
        Objects.equals(this.additionalProperties, preCreateWaybillIstd.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(couponFee, deliverFee, dispatchDuration, distance, fee, insuranceFee, logisticsCode, logisticsToken, payAmount, serviceCode, thirdCode, thirdSubCode, thirdSubMsg, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreCreateWaybillIstd {\n");
    sb.append("    couponFee: ").append(toIndentedString(couponFee)).append("\n");
    sb.append("    deliverFee: ").append(toIndentedString(deliverFee)).append("\n");
    sb.append("    dispatchDuration: ").append(toIndentedString(dispatchDuration)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    insuranceFee: ").append(toIndentedString(insuranceFee)).append("\n");
    sb.append("    logisticsCode: ").append(toIndentedString(logisticsCode)).append("\n");
    sb.append("    logisticsToken: ").append(toIndentedString(logisticsToken)).append("\n");
    sb.append("    payAmount: ").append(toIndentedString(payAmount)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    thirdCode: ").append(toIndentedString(thirdCode)).append("\n");
    sb.append("    thirdSubCode: ").append(toIndentedString(thirdSubCode)).append("\n");
    sb.append("    thirdSubMsg: ").append(toIndentedString(thirdSubMsg)).append("\n");
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
    openapiFields.add("coupon_fee");
    openapiFields.add("deliver_fee");
    openapiFields.add("dispatch_duration");
    openapiFields.add("distance");
    openapiFields.add("fee");
    openapiFields.add("insurance_fee");
    openapiFields.add("logistics_code");
    openapiFields.add("logistics_token");
    openapiFields.add("pay_amount");
    openapiFields.add("service_code");
    openapiFields.add("third_code");
    openapiFields.add("third_sub_code");
    openapiFields.add("third_sub_msg");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PreCreateWaybillIstd
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PreCreateWaybillIstd.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PreCreateWaybillIstd is not found in the empty JSON string", PreCreateWaybillIstd.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("coupon_fee") != null && !jsonObj.get("coupon_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coupon_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coupon_fee").toString()));
      }
      if (jsonObj.get("deliver_fee") != null && !jsonObj.get("deliver_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliver_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliver_fee").toString()));
      }
      if (jsonObj.get("fee") != null && !jsonObj.get("fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee").toString()));
      }
      if (jsonObj.get("insurance_fee") != null && !jsonObj.get("insurance_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `insurance_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("insurance_fee").toString()));
      }
      if (jsonObj.get("logistics_code") != null && !jsonObj.get("logistics_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logistics_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logistics_code").toString()));
      }
      if (jsonObj.get("logistics_token") != null && !jsonObj.get("logistics_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logistics_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logistics_token").toString()));
      }
      if (jsonObj.get("pay_amount") != null && !jsonObj.get("pay_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_amount").toString()));
      }
      if (jsonObj.get("service_code") != null && !jsonObj.get("service_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_code").toString()));
      }
      if (jsonObj.get("third_code") != null && !jsonObj.get("third_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `third_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("third_code").toString()));
      }
      if (jsonObj.get("third_sub_code") != null && !jsonObj.get("third_sub_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `third_sub_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("third_sub_code").toString()));
      }
      if (jsonObj.get("third_sub_msg") != null && !jsonObj.get("third_sub_msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `third_sub_msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("third_sub_msg").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PreCreateWaybillIstd.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PreCreateWaybillIstd' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PreCreateWaybillIstd> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PreCreateWaybillIstd.class));

       return (TypeAdapter<T>) new TypeAdapter<PreCreateWaybillIstd>() {
           @Override
           public void write(JsonWriter out, PreCreateWaybillIstd value) throws IOException {
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
           public PreCreateWaybillIstd read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PreCreateWaybillIstd instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PreCreateWaybillIstd given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PreCreateWaybillIstd
  * @throws IOException if the JSON string is invalid with respect to PreCreateWaybillIstd
  */
  public static PreCreateWaybillIstd fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PreCreateWaybillIstd.class);
  }

 /**
  * Convert an instance of PreCreateWaybillIstd to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

