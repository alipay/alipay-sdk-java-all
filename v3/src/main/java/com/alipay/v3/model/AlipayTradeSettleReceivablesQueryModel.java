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
import com.alipay.v3.model.SettleEntity;
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
 * AlipayTradeSettleReceivablesQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeSettleReceivablesQueryModel {
  public static final String SERIALIZED_NAME_BIZ_PRODUCT = "biz_product";
  @SerializedName(SERIALIZED_NAME_BIZ_PRODUCT)
  private String bizProduct;

  public static final String SERIALIZED_NAME_EXTEND_PARAMS = "extend_params";
  @SerializedName(SERIALIZED_NAME_EXTEND_PARAMS)
  private String extendParams;

  public static final String SERIALIZED_NAME_MERCHANT_INFO = "merchant_info";
  @SerializedName(SERIALIZED_NAME_MERCHANT_INFO)
  private SettleEntity merchantInfo;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_QUERY_HIS_DATE = "query_his_date";
  @SerializedName(SERIALIZED_NAME_QUERY_HIS_DATE)
  private String queryHisDate;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AlipayTradeSettleReceivablesQueryModel() { 
  }

  public AlipayTradeSettleReceivablesQueryModel bizProduct(String bizProduct) {
    
    this.bizProduct = bizProduct;
    return this;
  }

   /**
   * 收单产品码，商家和支付宝签约的产品码
   * @return bizProduct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FACE_TO_FACE_PAYMENT", value = "收单产品码，商家和支付宝签约的产品码")

  public String getBizProduct() {
    return bizProduct;
  }


  public void setBizProduct(String bizProduct) {
    this.bizProduct = bizProduct;
  }


  public AlipayTradeSettleReceivablesQueryModel extendParams(String extendParams) {
    
    this.extendParams = extendParams;
    return this;
  }

   /**
   * 扩展参数
   * @return extendParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key\":\"value\"}", value = "扩展参数")

  public String getExtendParams() {
    return extendParams;
  }


  public void setExtendParams(String extendParams) {
    this.extendParams = extendParams;
  }


  public AlipayTradeSettleReceivablesQueryModel merchantInfo(SettleEntity merchantInfo) {
    
    this.merchantInfo = merchantInfo;
    return this;
  }

   /**
   * Get merchantInfo
   * @return merchantInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SettleEntity getMerchantInfo() {
    return merchantInfo;
  }


  public void setMerchantInfo(SettleEntity merchantInfo) {
    this.merchantInfo = merchantInfo;
  }


  public AlipayTradeSettleReceivablesQueryModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 外部请求号，32个字符以内，可包含字母、数字、下划线。
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019040100000001", value = "外部请求号，32个字符以内，可包含字母、数字、下划线。")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayTradeSettleReceivablesQueryModel queryHisDate(String queryHisDate) {
    
    this.queryHisDate = queryHisDate;
    return this;
  }

   /**
   * 当trade_no不为空时，该字段不生效。 查询历史日期，格式为 yyyyMMdd ，取值范围为昨日起至往前30日内； 不传入时，查询实时待结算余额返回； 传入过去某一天日期，查询对应日期的日终待结算余额返回（注意：日常场景下，昨日日终待结算余额只可在当天 02:00 后查询，在当天 02:00 前查询返回查询错误；大促场景下昨日日终可查时间会适当延后）； 传入过去某一天非近30天内，返回参数错误。
   * @return queryHisDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20200313", value = "当trade_no不为空时，该字段不生效。 查询历史日期，格式为 yyyyMMdd ，取值范围为昨日起至往前30日内； 不传入时，查询实时待结算余额返回； 传入过去某一天日期，查询对应日期的日终待结算余额返回（注意：日常场景下，昨日日终待结算余额只可在当天 02:00 后查询，在当天 02:00 前查询返回查询错误；大促场景下昨日日终可查时间会适当延后）； 传入过去某一天非近30天内，返回参数错误。")

  public String getQueryHisDate() {
    return queryHisDate;
  }


  public void setQueryHisDate(String queryHisDate) {
    this.queryHisDate = queryHisDate;
  }


  public AlipayTradeSettleReceivablesQueryModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝交易号，当该笔交易为直付通账期模式，查询该笔交易待确认结算金额时必传
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022081722001432461452204877", value = "支付宝交易号，当该笔交易为直付通账期模式，查询该笔交易待确认结算金额时必传")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
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
   * @return the AlipayTradeSettleReceivablesQueryModel instance itself
   */
  public AlipayTradeSettleReceivablesQueryModel putAdditionalProperty(String key, Object value) {
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
    AlipayTradeSettleReceivablesQueryModel alipayTradeSettleReceivablesQueryModel = (AlipayTradeSettleReceivablesQueryModel) o;
    return Objects.equals(this.bizProduct, alipayTradeSettleReceivablesQueryModel.bizProduct) &&
        Objects.equals(this.extendParams, alipayTradeSettleReceivablesQueryModel.extendParams) &&
        Objects.equals(this.merchantInfo, alipayTradeSettleReceivablesQueryModel.merchantInfo) &&
        Objects.equals(this.outRequestNo, alipayTradeSettleReceivablesQueryModel.outRequestNo) &&
        Objects.equals(this.queryHisDate, alipayTradeSettleReceivablesQueryModel.queryHisDate) &&
        Objects.equals(this.tradeNo, alipayTradeSettleReceivablesQueryModel.tradeNo)&&
        Objects.equals(this.additionalProperties, alipayTradeSettleReceivablesQueryModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizProduct, extendParams, merchantInfo, outRequestNo, queryHisDate, tradeNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeSettleReceivablesQueryModel {\n");
    sb.append("    bizProduct: ").append(toIndentedString(bizProduct)).append("\n");
    sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
    sb.append("    merchantInfo: ").append(toIndentedString(merchantInfo)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    queryHisDate: ").append(toIndentedString(queryHisDate)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
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
    openapiFields.add("biz_product");
    openapiFields.add("extend_params");
    openapiFields.add("merchant_info");
    openapiFields.add("out_request_no");
    openapiFields.add("query_his_date");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeSettleReceivablesQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeSettleReceivablesQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeSettleReceivablesQueryModel is not found in the empty JSON string", AlipayTradeSettleReceivablesQueryModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("biz_product") != null && !jsonObj.get("biz_product").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_product` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_product").toString()));
      }
      if (jsonObj.get("extend_params") != null && !jsonObj.get("extend_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extend_params").toString()));
      }
      // validate the optional field `merchant_info`
      if (jsonObj.getAsJsonObject("merchant_info") != null) {
        SettleEntity.validateJsonObject(jsonObj.getAsJsonObject("merchant_info"));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("query_his_date") != null && !jsonObj.get("query_his_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query_his_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query_his_date").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeSettleReceivablesQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeSettleReceivablesQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeSettleReceivablesQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeSettleReceivablesQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeSettleReceivablesQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeSettleReceivablesQueryModel value) throws IOException {
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
           public AlipayTradeSettleReceivablesQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayTradeSettleReceivablesQueryModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayTradeSettleReceivablesQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeSettleReceivablesQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeSettleReceivablesQueryModel
  */
  public static AlipayTradeSettleReceivablesQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeSettleReceivablesQueryModel.class);
  }

 /**
  * Convert an instance of AlipayTradeSettleReceivablesQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

