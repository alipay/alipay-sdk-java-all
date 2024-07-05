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
import com.alipay.v3.model.ExtraParams;
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
 * AlipayPcreditHuabeiAuthSettleApplyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayPcreditHuabeiAuthSettleApplyModel {
  public static final String SERIALIZED_NAME_ACTION_TYPE = "action_type";
  @SerializedName(SERIALIZED_NAME_ACTION_TYPE)
  private String actionType;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_ALIPAY_USER_ID = "alipay_user_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_USER_ID)
  private String alipayUserId;

  public static final String SERIALIZED_NAME_EXTEND_PARAMS = "extend_params";
  @SerializedName(SERIALIZED_NAME_EXTEND_PARAMS)
  private ExtraParams extendParams;

  public static final String SERIALIZED_NAME_NEED_TERMINATED = "need_terminated";
  @SerializedName(SERIALIZED_NAME_NEED_TERMINATED)
  private String needTerminated;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_PAY_AMOUNT = "pay_amount";
  @SerializedName(SERIALIZED_NAME_PAY_AMOUNT)
  private String payAmount;

  public static final String SERIALIZED_NAME_SELLER_ID = "seller_id";
  @SerializedName(SERIALIZED_NAME_SELLER_ID)
  private String sellerId;

  public AlipayPcreditHuabeiAuthSettleApplyModel() { 
  }

  public AlipayPcreditHuabeiAuthSettleApplyModel actionType(String actionType) {
    
    this.actionType = actionType;
    return this;
  }

   /**
   * 操作类型，默认为 MERCHANT_SETTLE（结算）。枚举值如下： *  MERCHANT_SETTLE：结算（需要主动退出在发起结算）; *  QUIT_SETTLE：退出协议（解约协议）; *  PERIOD_SETTLE：分阶段结算（不解约协议）。
   * @return actionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PERIOD_SETTLE", value = "操作类型，默认为 MERCHANT_SETTLE（结算）。枚举值如下： *  MERCHANT_SETTLE：结算（需要主动退出在发起结算）; *  QUIT_SETTLE：退出协议（解约协议）; *  PERIOD_SETTLE：分阶段结算（不解约协议）。")

  public String getActionType() {
    return actionType;
  }


  public void setActionType(String actionType) {
    this.actionType = actionType;
  }


  public AlipayPcreditHuabeiAuthSettleApplyModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 支付宝系统中用以唯一标识用户签约记录的编号。
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170502000610755993", value = "支付宝系统中用以唯一标识用户签约记录的编号。")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayPcreditHuabeiAuthSettleApplyModel alipayUserId(String alipayUserId) {
    
    this.alipayUserId = alipayUserId;
    return this;
  }

   /**
   * 用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
   * @return alipayUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101117955611", value = "用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。")

  public String getAlipayUserId() {
    return alipayUserId;
  }


  public void setAlipayUserId(String alipayUserId) {
    this.alipayUserId = alipayUserId;
  }


  public AlipayPcreditHuabeiAuthSettleApplyModel extendParams(ExtraParams extendParams) {
    
    this.extendParams = extendParams;
    return this;
  }

   /**
   * Get extendParams
   * @return extendParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExtraParams getExtendParams() {
    return extendParams;
  }


  public void setExtendParams(ExtraParams extendParams) {
    this.extendParams = extendParams;
  }


  public AlipayPcreditHuabeiAuthSettleApplyModel needTerminated(String needTerminated) {
    
    this.needTerminated = needTerminated;
    return this;
  }

   /**
   * 是否解约，该参数控制结算完成之后的操作，为空则表示结算后解约。枚举值如下： *  true：代表解约，默认为true。 *  false：代表不解约。
   * @return needTerminated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否解约，该参数控制结算完成之后的操作，为空则表示结算后解约。枚举值如下： *  true：代表解约，默认为true。 *  false：代表不解约。")

  public String getNeedTerminated() {
    return needTerminated;
  }


  public void setNeedTerminated(String needTerminated) {
    this.needTerminated = needTerminated;
  }


  public AlipayPcreditHuabeiAuthSettleApplyModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 用户在支付宝的唯一标识
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "用户在支付宝的唯一标识")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayPcreditHuabeiAuthSettleApplyModel outRequestNo(String outRequestNo) {
    
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


  public AlipayPcreditHuabeiAuthSettleApplyModel payAmount(String payAmount) {
    
    this.payAmount = payAmount;
    return this;
  }

   /**
   * 需要支付的金额，单位为：元（人民币），精确到小数点后两位
   * @return payAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.00", value = "需要支付的金额，单位为：元（人民币），精确到小数点后两位")

  public String getPayAmount() {
    return payAmount;
  }


  public void setPayAmount(String payAmount) {
    this.payAmount = payAmount;
  }


  public AlipayPcreditHuabeiAuthSettleApplyModel sellerId(String sellerId) {
    
    this.sellerId = sellerId;
    return this;
  }

   /**
   * 支付宝商家ID，即商家账号在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。 说明：若该值为空，则默认为商户签约账号对应的支付宝用户ID。
   * @return sellerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102146225135", value = "支付宝商家ID，即商家账号在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。 说明：若该值为空，则默认为商户签约账号对应的支付宝用户ID。")

  public String getSellerId() {
    return sellerId;
  }


  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
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
   * @return the AlipayPcreditHuabeiAuthSettleApplyModel instance itself
   */
  public AlipayPcreditHuabeiAuthSettleApplyModel putAdditionalProperty(String key, Object value) {
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
    AlipayPcreditHuabeiAuthSettleApplyModel alipayPcreditHuabeiAuthSettleApplyModel = (AlipayPcreditHuabeiAuthSettleApplyModel) o;
    return Objects.equals(this.actionType, alipayPcreditHuabeiAuthSettleApplyModel.actionType) &&
        Objects.equals(this.agreementNo, alipayPcreditHuabeiAuthSettleApplyModel.agreementNo) &&
        Objects.equals(this.alipayUserId, alipayPcreditHuabeiAuthSettleApplyModel.alipayUserId) &&
        Objects.equals(this.extendParams, alipayPcreditHuabeiAuthSettleApplyModel.extendParams) &&
        Objects.equals(this.needTerminated, alipayPcreditHuabeiAuthSettleApplyModel.needTerminated) &&
        Objects.equals(this.openId, alipayPcreditHuabeiAuthSettleApplyModel.openId) &&
        Objects.equals(this.outRequestNo, alipayPcreditHuabeiAuthSettleApplyModel.outRequestNo) &&
        Objects.equals(this.payAmount, alipayPcreditHuabeiAuthSettleApplyModel.payAmount) &&
        Objects.equals(this.sellerId, alipayPcreditHuabeiAuthSettleApplyModel.sellerId)&&
        Objects.equals(this.additionalProperties, alipayPcreditHuabeiAuthSettleApplyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, agreementNo, alipayUserId, extendParams, needTerminated, openId, outRequestNo, payAmount, sellerId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayPcreditHuabeiAuthSettleApplyModel {\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    alipayUserId: ").append(toIndentedString(alipayUserId)).append("\n");
    sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
    sb.append("    needTerminated: ").append(toIndentedString(needTerminated)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    payAmount: ").append(toIndentedString(payAmount)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
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
    openapiFields.add("action_type");
    openapiFields.add("agreement_no");
    openapiFields.add("alipay_user_id");
    openapiFields.add("extend_params");
    openapiFields.add("need_terminated");
    openapiFields.add("open_id");
    openapiFields.add("out_request_no");
    openapiFields.add("pay_amount");
    openapiFields.add("seller_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayPcreditHuabeiAuthSettleApplyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayPcreditHuabeiAuthSettleApplyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayPcreditHuabeiAuthSettleApplyModel is not found in the empty JSON string", AlipayPcreditHuabeiAuthSettleApplyModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("action_type") != null && !jsonObj.get("action_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_type").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("alipay_user_id") != null && !jsonObj.get("alipay_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_user_id").toString()));
      }
      // validate the optional field `extend_params`
      if (jsonObj.getAsJsonObject("extend_params") != null) {
        ExtraParams.validateJsonObject(jsonObj.getAsJsonObject("extend_params"));
      }
      if (jsonObj.get("need_terminated") != null && !jsonObj.get("need_terminated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `need_terminated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("need_terminated").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("pay_amount") != null && !jsonObj.get("pay_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_amount").toString()));
      }
      if (jsonObj.get("seller_id") != null && !jsonObj.get("seller_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seller_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seller_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayPcreditHuabeiAuthSettleApplyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayPcreditHuabeiAuthSettleApplyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayPcreditHuabeiAuthSettleApplyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayPcreditHuabeiAuthSettleApplyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayPcreditHuabeiAuthSettleApplyModel>() {
           @Override
           public void write(JsonWriter out, AlipayPcreditHuabeiAuthSettleApplyModel value) throws IOException {
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
           public AlipayPcreditHuabeiAuthSettleApplyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayPcreditHuabeiAuthSettleApplyModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayPcreditHuabeiAuthSettleApplyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayPcreditHuabeiAuthSettleApplyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayPcreditHuabeiAuthSettleApplyModel
  */
  public static AlipayPcreditHuabeiAuthSettleApplyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayPcreditHuabeiAuthSettleApplyModel.class);
  }

 /**
  * Convert an instance of AlipayPcreditHuabeiAuthSettleApplyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

