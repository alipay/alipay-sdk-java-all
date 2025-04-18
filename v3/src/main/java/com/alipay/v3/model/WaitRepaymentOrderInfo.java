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
 * WaitRepaymentOrderInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WaitRepaymentOrderInfo {
  public static final String SERIALIZED_NAME_ADVANCE_ORDER_ID = "advance_order_id";
  @SerializedName(SERIALIZED_NAME_ADVANCE_ORDER_ID)
  private String advanceOrderId;

  public static final String SERIALIZED_NAME_ALIPAY_USER_ID = "alipay_user_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_USER_ID)
  private String alipayUserId;

  public static final String SERIALIZED_NAME_BIZ_PRODUCT = "biz_product";
  @SerializedName(SERIALIZED_NAME_BIZ_PRODUCT)
  private String bizProduct;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_ORIG_BIZ_ORDER_ID = "orig_biz_order_id";
  @SerializedName(SERIALIZED_NAME_ORIG_BIZ_ORDER_ID)
  private String origBizOrderId;

  public static final String SERIALIZED_NAME_WAIT_REPAYMENT_AMOUNT = "wait_repayment_amount";
  @SerializedName(SERIALIZED_NAME_WAIT_REPAYMENT_AMOUNT)
  private Integer waitRepaymentAmount;

  public WaitRepaymentOrderInfo() { 
  }

  public WaitRepaymentOrderInfo advanceOrderId(String advanceOrderId) {
    
    this.advanceOrderId = advanceOrderId;
    return this;
  }

   /**
   * 垫资单id
   * @return advanceOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20190128002630010000170001187808", value = "垫资单id")

  public String getAdvanceOrderId() {
    return advanceOrderId;
  }


  public void setAdvanceOrderId(String advanceOrderId) {
    this.advanceOrderId = advanceOrderId;
  }


  public WaitRepaymentOrderInfo alipayUserId(String alipayUserId) {
    
    this.alipayUserId = alipayUserId;
    return this;
  }

   /**
   * 买家的支付宝用户id
   * @return alipayUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088302483540171", value = "买家的支付宝用户id")

  public String getAlipayUserId() {
    return alipayUserId;
  }


  public void setAlipayUserId(String alipayUserId) {
    this.alipayUserId = alipayUserId;
  }


  public WaitRepaymentOrderInfo bizProduct(String bizProduct) {
    
    this.bizProduct = bizProduct;
    return this;
  }

   /**
   * 通常为商户签约的收单产品码
   * @return bizProduct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GENERAL_WITHHOLDING", value = "通常为商户签约的收单产品码")

  public String getBizProduct() {
    return bizProduct;
  }


  public void setBizProduct(String bizProduct) {
    this.bizProduct = bizProduct;
  }


  public WaitRepaymentOrderInfo openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 买家的支付宝用户id
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "买家的支付宝用户id")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public WaitRepaymentOrderInfo origBizOrderId(String origBizOrderId) {
    
    this.origBizOrderId = origBizOrderId;
    return this;
  }

   /**
   * 原始的业务单号，通常为支付宝交易号
   * @return origBizOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018060821001001820554093702", value = "原始的业务单号，通常为支付宝交易号")

  public String getOrigBizOrderId() {
    return origBizOrderId;
  }


  public void setOrigBizOrderId(String origBizOrderId) {
    this.origBizOrderId = origBizOrderId;
  }


  public WaitRepaymentOrderInfo waitRepaymentAmount(Integer waitRepaymentAmount) {
    
    this.waitRepaymentAmount = waitRepaymentAmount;
    return this;
  }

   /**
   * 垫资金额
   * @return waitRepaymentAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "垫资金额")

  public Integer getWaitRepaymentAmount() {
    return waitRepaymentAmount;
  }


  public void setWaitRepaymentAmount(Integer waitRepaymentAmount) {
    this.waitRepaymentAmount = waitRepaymentAmount;
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
   * @return the WaitRepaymentOrderInfo instance itself
   */
  public WaitRepaymentOrderInfo putAdditionalProperty(String key, Object value) {
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
    WaitRepaymentOrderInfo waitRepaymentOrderInfo = (WaitRepaymentOrderInfo) o;
    return Objects.equals(this.advanceOrderId, waitRepaymentOrderInfo.advanceOrderId) &&
        Objects.equals(this.alipayUserId, waitRepaymentOrderInfo.alipayUserId) &&
        Objects.equals(this.bizProduct, waitRepaymentOrderInfo.bizProduct) &&
        Objects.equals(this.openId, waitRepaymentOrderInfo.openId) &&
        Objects.equals(this.origBizOrderId, waitRepaymentOrderInfo.origBizOrderId) &&
        Objects.equals(this.waitRepaymentAmount, waitRepaymentOrderInfo.waitRepaymentAmount)&&
        Objects.equals(this.additionalProperties, waitRepaymentOrderInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advanceOrderId, alipayUserId, bizProduct, openId, origBizOrderId, waitRepaymentAmount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaitRepaymentOrderInfo {\n");
    sb.append("    advanceOrderId: ").append(toIndentedString(advanceOrderId)).append("\n");
    sb.append("    alipayUserId: ").append(toIndentedString(alipayUserId)).append("\n");
    sb.append("    bizProduct: ").append(toIndentedString(bizProduct)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    origBizOrderId: ").append(toIndentedString(origBizOrderId)).append("\n");
    sb.append("    waitRepaymentAmount: ").append(toIndentedString(waitRepaymentAmount)).append("\n");
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
    openapiFields.add("advance_order_id");
    openapiFields.add("alipay_user_id");
    openapiFields.add("biz_product");
    openapiFields.add("open_id");
    openapiFields.add("orig_biz_order_id");
    openapiFields.add("wait_repayment_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WaitRepaymentOrderInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WaitRepaymentOrderInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WaitRepaymentOrderInfo is not found in the empty JSON string", WaitRepaymentOrderInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("advance_order_id") != null && !jsonObj.get("advance_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `advance_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("advance_order_id").toString()));
      }
      if (jsonObj.get("alipay_user_id") != null && !jsonObj.get("alipay_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_user_id").toString()));
      }
      if (jsonObj.get("biz_product") != null && !jsonObj.get("biz_product").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_product` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_product").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("orig_biz_order_id") != null && !jsonObj.get("orig_biz_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orig_biz_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orig_biz_order_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WaitRepaymentOrderInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WaitRepaymentOrderInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WaitRepaymentOrderInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WaitRepaymentOrderInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<WaitRepaymentOrderInfo>() {
           @Override
           public void write(JsonWriter out, WaitRepaymentOrderInfo value) throws IOException {
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
           public WaitRepaymentOrderInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WaitRepaymentOrderInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WaitRepaymentOrderInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WaitRepaymentOrderInfo
  * @throws IOException if the JSON string is invalid with respect to WaitRepaymentOrderInfo
  */
  public static WaitRepaymentOrderInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WaitRepaymentOrderInfo.class);
  }

 /**
  * Convert an instance of WaitRepaymentOrderInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

