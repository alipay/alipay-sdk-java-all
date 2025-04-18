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
 * ZhimaCreditPayafteruseCreditbizorderFinishModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCreditPayafteruseCreditbizorderFinishModel {
  public static final String SERIALIZED_NAME_CREDIT_BIZ_ORDER_ID = "credit_biz_order_id";
  @SerializedName(SERIALIZED_NAME_CREDIT_BIZ_ORDER_ID)
  private String creditBizOrderId;

  public static final String SERIALIZED_NAME_IS_FULFILLED = "is_fulfilled";
  @SerializedName(SERIALIZED_NAME_IS_FULFILLED)
  private String isFulfilled;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark;

  public ZhimaCreditPayafteruseCreditbizorderFinishModel() { 
  }

  public ZhimaCreditPayafteruseCreditbizorderFinishModel creditBizOrderId(String creditBizOrderId) {
    
    this.creditBizOrderId = creditBizOrderId;
    return this;
  }

   /**
   * 信用服务订单号
   * @return creditBizOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZMCB20201021200102012", value = "信用服务订单号")

  public String getCreditBizOrderId() {
    return creditBizOrderId;
  }


  public void setCreditBizOrderId(String creditBizOrderId) {
    this.creditBizOrderId = creditBizOrderId;
  }


  public ZhimaCreditPayafteruseCreditbizorderFinishModel isFulfilled(String isFulfilled) {
    
    this.isFulfilled = isFulfilled;
    return this;
  }

   /**
   * 字符串类型，用户此订单是否守约。 传\&quot;true\&quot;时，用户在芝麻信用-守约记录中，该笔订单是已守约状态； 传\&quot;false\&quot;时，用户在芝麻信用-守约记录中，该笔订单是已取消状态。
   * @return isFulfilled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"true\"", value = "字符串类型，用户此订单是否守约。 传\"true\"时，用户在芝麻信用-守约记录中，该笔订单是已守约状态； 传\"false\"时，用户在芝麻信用-守约记录中，该笔订单是已取消状态。")

  public String getIsFulfilled() {
    return isFulfilled;
  }


  public void setIsFulfilled(String isFulfilled) {
    this.isFulfilled = isFulfilled;
  }


  public ZhimaCreditPayafteruseCreditbizorderFinishModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 商户外部请求号
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014070700166653", value = "商户外部请求号")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public ZhimaCreditPayafteruseCreditbizorderFinishModel remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 商户对本次操作的附言描述
   * @return remark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "完结订单", value = "商户对本次操作的附言描述")

  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
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
   * @return the ZhimaCreditPayafteruseCreditbizorderFinishModel instance itself
   */
  public ZhimaCreditPayafteruseCreditbizorderFinishModel putAdditionalProperty(String key, Object value) {
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
    ZhimaCreditPayafteruseCreditbizorderFinishModel zhimaCreditPayafteruseCreditbizorderFinishModel = (ZhimaCreditPayafteruseCreditbizorderFinishModel) o;
    return Objects.equals(this.creditBizOrderId, zhimaCreditPayafteruseCreditbizorderFinishModel.creditBizOrderId) &&
        Objects.equals(this.isFulfilled, zhimaCreditPayafteruseCreditbizorderFinishModel.isFulfilled) &&
        Objects.equals(this.outRequestNo, zhimaCreditPayafteruseCreditbizorderFinishModel.outRequestNo) &&
        Objects.equals(this.remark, zhimaCreditPayafteruseCreditbizorderFinishModel.remark)&&
        Objects.equals(this.additionalProperties, zhimaCreditPayafteruseCreditbizorderFinishModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditBizOrderId, isFulfilled, outRequestNo, remark, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCreditPayafteruseCreditbizorderFinishModel {\n");
    sb.append("    creditBizOrderId: ").append(toIndentedString(creditBizOrderId)).append("\n");
    sb.append("    isFulfilled: ").append(toIndentedString(isFulfilled)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
    openapiFields.add("credit_biz_order_id");
    openapiFields.add("is_fulfilled");
    openapiFields.add("out_request_no");
    openapiFields.add("remark");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCreditPayafteruseCreditbizorderFinishModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCreditPayafteruseCreditbizorderFinishModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCreditPayafteruseCreditbizorderFinishModel is not found in the empty JSON string", ZhimaCreditPayafteruseCreditbizorderFinishModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("credit_biz_order_id") != null && !jsonObj.get("credit_biz_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credit_biz_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credit_biz_order_id").toString()));
      }
      if (jsonObj.get("is_fulfilled") != null && !jsonObj.get("is_fulfilled").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_fulfilled` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_fulfilled").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("remark") != null && !jsonObj.get("remark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remark").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCreditPayafteruseCreditbizorderFinishModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCreditPayafteruseCreditbizorderFinishModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCreditPayafteruseCreditbizorderFinishModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCreditPayafteruseCreditbizorderFinishModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCreditPayafteruseCreditbizorderFinishModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCreditPayafteruseCreditbizorderFinishModel value) throws IOException {
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
           public ZhimaCreditPayafteruseCreditbizorderFinishModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ZhimaCreditPayafteruseCreditbizorderFinishModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ZhimaCreditPayafteruseCreditbizorderFinishModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCreditPayafteruseCreditbizorderFinishModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCreditPayafteruseCreditbizorderFinishModel
  */
  public static ZhimaCreditPayafteruseCreditbizorderFinishModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCreditPayafteruseCreditbizorderFinishModel.class);
  }

 /**
  * Convert an instance of ZhimaCreditPayafteruseCreditbizorderFinishModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

