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
   * 用户此订单是否守约。 传true时，用户在芝麻信用-守约记录中，该笔订单是已守约状态； 传false时，用户在芝麻信用-守约记录中，该笔订单是已取消状态。
   * @return isFulfilled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "用户此订单是否守约。 传true时，用户在芝麻信用-守约记录中，该笔订单是已守约状态； 传false时，用户在芝麻信用-守约记录中，该笔订单是已取消状态。")

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
        Objects.equals(this.remark, zhimaCreditPayafteruseCreditbizorderFinishModel.remark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditBizOrderId, isFulfilled, outRequestNo, remark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCreditPayafteruseCreditbizorderFinishModel {\n");
    sb.append("    creditBizOrderId: ").append(toIndentedString(creditBizOrderId)).append("\n");
    sb.append("    isFulfilled: ").append(toIndentedString(isFulfilled)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZhimaCreditPayafteruseCreditbizorderFinishModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZhimaCreditPayafteruseCreditbizorderFinishModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
             elementAdapter.write(out, obj);
           }

           @Override
           public ZhimaCreditPayafteruseCreditbizorderFinishModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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

