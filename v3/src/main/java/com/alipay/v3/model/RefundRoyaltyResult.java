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
 * RefundRoyaltyResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RefundRoyaltyResult {
  public static final String SERIALIZED_NAME_ORI_TRANS_IN = "ori_trans_in";
  @SerializedName(SERIALIZED_NAME_ORI_TRANS_IN)
  private String oriTransIn;

  public static final String SERIALIZED_NAME_ORI_TRANS_OUT = "ori_trans_out";
  @SerializedName(SERIALIZED_NAME_ORI_TRANS_OUT)
  private String oriTransOut;

  public static final String SERIALIZED_NAME_REFUND_AMOUNT = "refund_amount";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT)
  private String refundAmount;

  public static final String SERIALIZED_NAME_RESULT_CODE = "result_code";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private String resultCode;

  public static final String SERIALIZED_NAME_ROYALTY_TYPE = "royalty_type";
  @SerializedName(SERIALIZED_NAME_ROYALTY_TYPE)
  private String royaltyType;

  public static final String SERIALIZED_NAME_TRANS_IN = "trans_in";
  @SerializedName(SERIALIZED_NAME_TRANS_IN)
  private String transIn;

  public static final String SERIALIZED_NAME_TRANS_IN_EMAIL = "trans_in_email";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_EMAIL)
  private String transInEmail;

  public static final String SERIALIZED_NAME_TRANS_OUT = "trans_out";
  @SerializedName(SERIALIZED_NAME_TRANS_OUT)
  private String transOut;

  public static final String SERIALIZED_NAME_TRANS_OUT_EMAIL = "trans_out_email";
  @SerializedName(SERIALIZED_NAME_TRANS_OUT_EMAIL)
  private String transOutEmail;

  public RefundRoyaltyResult() { 
  }

  public RefundRoyaltyResult oriTransIn(String oriTransIn) {
    
    this.oriTransIn = oriTransIn;
    return this;
  }

   /**
   * 商户请求的转入账号
   * @return oriTransIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088111111111111", value = "商户请求的转入账号")

  public String getOriTransIn() {
    return oriTransIn;
  }


  public void setOriTransIn(String oriTransIn) {
    this.oriTransIn = oriTransIn;
  }


  public RefundRoyaltyResult oriTransOut(String oriTransOut) {
    
    this.oriTransOut = oriTransOut;
    return this;
  }

   /**
   * 商户请求的转出账号
   * @return oriTransOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088111111111111", value = "商户请求的转出账号")

  public String getOriTransOut() {
    return oriTransOut;
  }


  public void setOriTransOut(String oriTransOut) {
    this.oriTransOut = oriTransOut;
  }


  public RefundRoyaltyResult refundAmount(String refundAmount) {
    
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * 退分账金额。单位：元。
   * @return refundAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "退分账金额。单位：元。")

  public String getRefundAmount() {
    return refundAmount;
  }


  public void setRefundAmount(String refundAmount) {
    this.refundAmount = refundAmount;
  }


  public RefundRoyaltyResult resultCode(String resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * 退分账结果码
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "退分账结果码")

  public String getResultCode() {
    return resultCode;
  }


  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }


  public RefundRoyaltyResult royaltyType(String royaltyType) {
    
    this.royaltyType = royaltyType;
    return this;
  }

   /**
   * 分账类型. 字段为空默认为普通分账类型transfer
   * @return royaltyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "transfer", value = "分账类型. 字段为空默认为普通分账类型transfer")

  public String getRoyaltyType() {
    return royaltyType;
  }


  public void setRoyaltyType(String royaltyType) {
    this.royaltyType = royaltyType;
  }


  public RefundRoyaltyResult transIn(String transIn) {
    
    this.transIn = transIn;
    return this;
  }

   /**
   * 转入人支付宝账号对应用户ID
   * @return transIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102210397302", value = "转入人支付宝账号对应用户ID")

  public String getTransIn() {
    return transIn;
  }


  public void setTransIn(String transIn) {
    this.transIn = transIn;
  }


  public RefundRoyaltyResult transInEmail(String transInEmail) {
    
    this.transInEmail = transInEmail;
    return this;
  }

   /**
   * 转入人支付宝账号
   * @return transInEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "zen_gwen@hotmail.com", value = "转入人支付宝账号")

  public String getTransInEmail() {
    return transInEmail;
  }


  public void setTransInEmail(String transInEmail) {
    this.transInEmail = transInEmail;
  }


  public RefundRoyaltyResult transOut(String transOut) {
    
    this.transOut = transOut;
    return this;
  }

   /**
   * 转出人支付宝账号对应用户ID
   * @return transOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102210397302", value = "转出人支付宝账号对应用户ID")

  public String getTransOut() {
    return transOut;
  }


  public void setTransOut(String transOut) {
    this.transOut = transOut;
  }


  public RefundRoyaltyResult transOutEmail(String transOutEmail) {
    
    this.transOutEmail = transOutEmail;
    return this;
  }

   /**
   * 转出人支付宝账号
   * @return transOutEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipay-test03@alipay.com", value = "转出人支付宝账号")

  public String getTransOutEmail() {
    return transOutEmail;
  }


  public void setTransOutEmail(String transOutEmail) {
    this.transOutEmail = transOutEmail;
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
   * @return the RefundRoyaltyResult instance itself
   */
  public RefundRoyaltyResult putAdditionalProperty(String key, Object value) {
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
    RefundRoyaltyResult refundRoyaltyResult = (RefundRoyaltyResult) o;
    return Objects.equals(this.oriTransIn, refundRoyaltyResult.oriTransIn) &&
        Objects.equals(this.oriTransOut, refundRoyaltyResult.oriTransOut) &&
        Objects.equals(this.refundAmount, refundRoyaltyResult.refundAmount) &&
        Objects.equals(this.resultCode, refundRoyaltyResult.resultCode) &&
        Objects.equals(this.royaltyType, refundRoyaltyResult.royaltyType) &&
        Objects.equals(this.transIn, refundRoyaltyResult.transIn) &&
        Objects.equals(this.transInEmail, refundRoyaltyResult.transInEmail) &&
        Objects.equals(this.transOut, refundRoyaltyResult.transOut) &&
        Objects.equals(this.transOutEmail, refundRoyaltyResult.transOutEmail)&&
        Objects.equals(this.additionalProperties, refundRoyaltyResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oriTransIn, oriTransOut, refundAmount, resultCode, royaltyType, transIn, transInEmail, transOut, transOutEmail, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundRoyaltyResult {\n");
    sb.append("    oriTransIn: ").append(toIndentedString(oriTransIn)).append("\n");
    sb.append("    oriTransOut: ").append(toIndentedString(oriTransOut)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    royaltyType: ").append(toIndentedString(royaltyType)).append("\n");
    sb.append("    transIn: ").append(toIndentedString(transIn)).append("\n");
    sb.append("    transInEmail: ").append(toIndentedString(transInEmail)).append("\n");
    sb.append("    transOut: ").append(toIndentedString(transOut)).append("\n");
    sb.append("    transOutEmail: ").append(toIndentedString(transOutEmail)).append("\n");
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
    openapiFields.add("ori_trans_in");
    openapiFields.add("ori_trans_out");
    openapiFields.add("refund_amount");
    openapiFields.add("result_code");
    openapiFields.add("royalty_type");
    openapiFields.add("trans_in");
    openapiFields.add("trans_in_email");
    openapiFields.add("trans_out");
    openapiFields.add("trans_out_email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RefundRoyaltyResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RefundRoyaltyResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RefundRoyaltyResult is not found in the empty JSON string", RefundRoyaltyResult.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("ori_trans_in") != null && !jsonObj.get("ori_trans_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ori_trans_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ori_trans_in").toString()));
      }
      if (jsonObj.get("ori_trans_out") != null && !jsonObj.get("ori_trans_out").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ori_trans_out` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ori_trans_out").toString()));
      }
      if (jsonObj.get("refund_amount") != null && !jsonObj.get("refund_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_amount").toString()));
      }
      if (jsonObj.get("result_code") != null && !jsonObj.get("result_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result_code").toString()));
      }
      if (jsonObj.get("royalty_type") != null && !jsonObj.get("royalty_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `royalty_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("royalty_type").toString()));
      }
      if (jsonObj.get("trans_in") != null && !jsonObj.get("trans_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in").toString()));
      }
      if (jsonObj.get("trans_in_email") != null && !jsonObj.get("trans_in_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_email").toString()));
      }
      if (jsonObj.get("trans_out") != null && !jsonObj.get("trans_out").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_out` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_out").toString()));
      }
      if (jsonObj.get("trans_out_email") != null && !jsonObj.get("trans_out_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_out_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_out_email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RefundRoyaltyResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RefundRoyaltyResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RefundRoyaltyResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RefundRoyaltyResult.class));

       return (TypeAdapter<T>) new TypeAdapter<RefundRoyaltyResult>() {
           @Override
           public void write(JsonWriter out, RefundRoyaltyResult value) throws IOException {
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
           public RefundRoyaltyResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RefundRoyaltyResult instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RefundRoyaltyResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RefundRoyaltyResult
  * @throws IOException if the JSON string is invalid with respect to RefundRoyaltyResult
  */
  public static RefundRoyaltyResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RefundRoyaltyResult.class);
  }

 /**
  * Convert an instance of RefundRoyaltyResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

