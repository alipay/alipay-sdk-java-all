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
import java.util.ArrayList;
import java.util.List;

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
 * AlipayEbppPdeductSignAddResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppPdeductSignAddResponseModel {
  public static final String SERIALIZED_NAME_AGREEMENT_ID = "agreement_id";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_ID)
  private String agreementId;

  public static final String SERIALIZED_NAME_AGREEMENT_STATUS = "agreement_status";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_STATUS)
  private String agreementStatus;

  public static final String SERIALIZED_NAME_EXTEND_FIELD = "extend_field";
  @SerializedName(SERIALIZED_NAME_EXTEND_FIELD)
  private String extendField;

  public static final String SERIALIZED_NAME_NOTIFY_CONFIG = "notify_config";
  @SerializedName(SERIALIZED_NAME_NOTIFY_CONFIG)
  private String notifyConfig;

  public static final String SERIALIZED_NAME_OUT_AGREEMENT_ID = "out_agreement_id";
  @SerializedName(SERIALIZED_NAME_OUT_AGREEMENT_ID)
  private String outAgreementId;

  public static final String SERIALIZED_NAME_PAY_CONFIG = "pay_config";
  @SerializedName(SERIALIZED_NAME_PAY_CONFIG)
  private List<String> payConfig = null;

  public static final String SERIALIZED_NAME_SIGN_DATE = "sign_date";
  @SerializedName(SERIALIZED_NAME_SIGN_DATE)
  private String signDate;

  public AlipayEbppPdeductSignAddResponseModel() { 
  }

  public AlipayEbppPdeductSignAddResponseModel agreementId(String agreementId) {
    
    this.agreementId = agreementId;
    return this;
  }

   /**
   * 支付宝代扣协议ID
   * @return agreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20141028000363828663", value = "支付宝代扣协议ID")

  public String getAgreementId() {
    return agreementId;
  }


  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  public AlipayEbppPdeductSignAddResponseModel agreementStatus(String agreementStatus) {
    
    this.agreementStatus = agreementStatus;
    return this;
  }

   /**
   * 支付宝协议状态。签约成功则返回success
   * @return agreementStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "success", value = "支付宝协议状态。签约成功则返回success")

  public String getAgreementStatus() {
    return agreementStatus;
  }


  public void setAgreementStatus(String agreementStatus) {
    this.agreementStatus = agreementStatus;
  }


  public AlipayEbppPdeductSignAddResponseModel extendField(String extendField) {
    
    this.extendField = extendField;
    return this;
  }

   /**
   * 扩展参数，可为空
   * @return extendField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "null", value = "扩展参数，可为空")

  public String getExtendField() {
    return extendField;
  }


  public void setExtendField(String extendField) {
    this.extendField = extendField;
  }


  public AlipayEbppPdeductSignAddResponseModel notifyConfig(String notifyConfig) {
    
    this.notifyConfig = notifyConfig;
    return this;
  }

   /**
   * 通知方式设置。
   * @return notifyConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "通知方式文案", value = "通知方式设置。")

  public String getNotifyConfig() {
    return notifyConfig;
  }


  public void setNotifyConfig(String notifyConfig) {
    this.notifyConfig = notifyConfig;
  }


  public AlipayEbppPdeductSignAddResponseModel outAgreementId(String outAgreementId) {
    
    this.outAgreementId = outAgreementId;
    return this;
  }

   /**
   * 商户生成的代扣协议ID
   * @return outAgreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123123", value = "商户生成的代扣协议ID")

  public String getOutAgreementId() {
    return outAgreementId;
  }


  public void setOutAgreementId(String outAgreementId) {
    this.outAgreementId = outAgreementId;
  }


  public AlipayEbppPdeductSignAddResponseModel payConfig(List<String> payConfig) {
    
    this.payConfig = payConfig;
    return this;
  }

  public AlipayEbppPdeductSignAddResponseModel addPayConfigItem(String payConfigItem) {
    if (this.payConfig == null) {
      this.payConfig = new ArrayList<>();
    }
    this.payConfig.add(payConfigItem);
    return this;
  }

   /**
   * 支付方式设置
   * @return payConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BALANCE", value = "支付方式设置")

  public List<String> getPayConfig() {
    return payConfig;
  }


  public void setPayConfig(List<String> payConfig) {
    this.payConfig = payConfig;
  }


  public AlipayEbppPdeductSignAddResponseModel signDate(String signDate) {
    
    this.signDate = signDate;
    return this;
  }

   /**
   * 签约时间
   * @return signDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014-01-21", value = "签约时间")

  public String getSignDate() {
    return signDate;
  }


  public void setSignDate(String signDate) {
    this.signDate = signDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppPdeductSignAddResponseModel alipayEbppPdeductSignAddResponseModel = (AlipayEbppPdeductSignAddResponseModel) o;
    return Objects.equals(this.agreementId, alipayEbppPdeductSignAddResponseModel.agreementId) &&
        Objects.equals(this.agreementStatus, alipayEbppPdeductSignAddResponseModel.agreementStatus) &&
        Objects.equals(this.extendField, alipayEbppPdeductSignAddResponseModel.extendField) &&
        Objects.equals(this.notifyConfig, alipayEbppPdeductSignAddResponseModel.notifyConfig) &&
        Objects.equals(this.outAgreementId, alipayEbppPdeductSignAddResponseModel.outAgreementId) &&
        Objects.equals(this.payConfig, alipayEbppPdeductSignAddResponseModel.payConfig) &&
        Objects.equals(this.signDate, alipayEbppPdeductSignAddResponseModel.signDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementId, agreementStatus, extendField, notifyConfig, outAgreementId, payConfig, signDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppPdeductSignAddResponseModel {\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    agreementStatus: ").append(toIndentedString(agreementStatus)).append("\n");
    sb.append("    extendField: ").append(toIndentedString(extendField)).append("\n");
    sb.append("    notifyConfig: ").append(toIndentedString(notifyConfig)).append("\n");
    sb.append("    outAgreementId: ").append(toIndentedString(outAgreementId)).append("\n");
    sb.append("    payConfig: ").append(toIndentedString(payConfig)).append("\n");
    sb.append("    signDate: ").append(toIndentedString(signDate)).append("\n");
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
    openapiFields.add("agreement_status");
    openapiFields.add("extend_field");
    openapiFields.add("notify_config");
    openapiFields.add("out_agreement_id");
    openapiFields.add("pay_config");
    openapiFields.add("sign_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppPdeductSignAddResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppPdeductSignAddResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppPdeductSignAddResponseModel is not found in the empty JSON string", AlipayEbppPdeductSignAddResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppPdeductSignAddResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppPdeductSignAddResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agreement_id") != null && !jsonObj.get("agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_id").toString()));
      }
      if (jsonObj.get("agreement_status") != null && !jsonObj.get("agreement_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_status").toString()));
      }
      if (jsonObj.get("extend_field") != null && !jsonObj.get("extend_field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend_field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extend_field").toString()));
      }
      if (jsonObj.get("notify_config") != null && !jsonObj.get("notify_config").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notify_config` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notify_config").toString()));
      }
      if (jsonObj.get("out_agreement_id") != null && !jsonObj.get("out_agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_agreement_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("pay_config") != null && !jsonObj.get("pay_config").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_config` to be an array in the JSON string but got `%s`", jsonObj.get("pay_config").toString()));
      }
      if (jsonObj.get("sign_date") != null && !jsonObj.get("sign_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppPdeductSignAddResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppPdeductSignAddResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppPdeductSignAddResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppPdeductSignAddResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppPdeductSignAddResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppPdeductSignAddResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppPdeductSignAddResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppPdeductSignAddResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppPdeductSignAddResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppPdeductSignAddResponseModel
  */
  public static AlipayEbppPdeductSignAddResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppPdeductSignAddResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppPdeductSignAddResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

