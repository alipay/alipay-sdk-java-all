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
 * ZhimaCreditPayafteruseCreditagreementTransferModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCreditPayafteruseCreditagreementTransferModel {
  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_DEDUCT_AGREEMENT_NO = "deduct_agreement_no";
  @SerializedName(SERIALIZED_NAME_DEDUCT_AGREEMENT_NO)
  private String deductAgreementNo;

  public static final String SERIALIZED_NAME_OUT_AGREEMENT_NO = "out_agreement_no";
  @SerializedName(SERIALIZED_NAME_OUT_AGREEMENT_NO)
  private String outAgreementNo;

  public static final String SERIALIZED_NAME_ZM_SERVICE_ID = "zm_service_id";
  @SerializedName(SERIALIZED_NAME_ZM_SERVICE_ID)
  private String zmServiceId;

  public ZhimaCreditPayafteruseCreditagreementTransferModel() { 
  }

  public ZhimaCreditPayafteruseCreditagreementTransferModel categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * 芝麻外部类目
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "credit_pay_test", value = "芝麻外部类目")

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public ZhimaCreditPayafteruseCreditagreementTransferModel deductAgreementNo(String deductAgreementNo) {
    
    this.deductAgreementNo = deductAgreementNo;
    return this;
  }

   /**
   * 用户的代扣协议号
   * @return deductAgreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20215401139331610689", value = "用户的代扣协议号")

  public String getDeductAgreementNo() {
    return deductAgreementNo;
  }


  public void setDeductAgreementNo(String deductAgreementNo) {
    this.deductAgreementNo = deductAgreementNo;
  }


  public ZhimaCreditPayafteruseCreditagreementTransferModel outAgreementNo(String outAgreementNo) {
    
    this.outAgreementNo = outAgreementNo;
    return this;
  }

   /**
   * 商户外部协议号，不同的支付宝用户需要传递不同的外部单号
   * @return outAgreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014070700166653", value = "商户外部协议号，不同的支付宝用户需要传递不同的外部单号")

  public String getOutAgreementNo() {
    return outAgreementNo;
  }


  public void setOutAgreementNo(String outAgreementNo) {
    this.outAgreementNo = outAgreementNo;
  }


  public ZhimaCreditPayafteruseCreditagreementTransferModel zmServiceId(String zmServiceId) {
    
    this.zmServiceId = zmServiceId;
    return this;
  }

   /**
   * 芝麻信用服务ID
   * @return zmServiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020050722001440031000061082", value = "芝麻信用服务ID")

  public String getZmServiceId() {
    return zmServiceId;
  }


  public void setZmServiceId(String zmServiceId) {
    this.zmServiceId = zmServiceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZhimaCreditPayafteruseCreditagreementTransferModel zhimaCreditPayafteruseCreditagreementTransferModel = (ZhimaCreditPayafteruseCreditagreementTransferModel) o;
    return Objects.equals(this.categoryId, zhimaCreditPayafteruseCreditagreementTransferModel.categoryId) &&
        Objects.equals(this.deductAgreementNo, zhimaCreditPayafteruseCreditagreementTransferModel.deductAgreementNo) &&
        Objects.equals(this.outAgreementNo, zhimaCreditPayafteruseCreditagreementTransferModel.outAgreementNo) &&
        Objects.equals(this.zmServiceId, zhimaCreditPayafteruseCreditagreementTransferModel.zmServiceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, deductAgreementNo, outAgreementNo, zmServiceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCreditPayafteruseCreditagreementTransferModel {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    deductAgreementNo: ").append(toIndentedString(deductAgreementNo)).append("\n");
    sb.append("    outAgreementNo: ").append(toIndentedString(outAgreementNo)).append("\n");
    sb.append("    zmServiceId: ").append(toIndentedString(zmServiceId)).append("\n");
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
    openapiFields.add("category_id");
    openapiFields.add("deduct_agreement_no");
    openapiFields.add("out_agreement_no");
    openapiFields.add("zm_service_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCreditPayafteruseCreditagreementTransferModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCreditPayafteruseCreditagreementTransferModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCreditPayafteruseCreditagreementTransferModel is not found in the empty JSON string", ZhimaCreditPayafteruseCreditagreementTransferModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZhimaCreditPayafteruseCreditagreementTransferModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZhimaCreditPayafteruseCreditagreementTransferModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      if (jsonObj.get("deduct_agreement_no") != null && !jsonObj.get("deduct_agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deduct_agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deduct_agreement_no").toString()));
      }
      if (jsonObj.get("out_agreement_no") != null && !jsonObj.get("out_agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_agreement_no").toString()));
      }
      if (jsonObj.get("zm_service_id") != null && !jsonObj.get("zm_service_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zm_service_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zm_service_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCreditPayafteruseCreditagreementTransferModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCreditPayafteruseCreditagreementTransferModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCreditPayafteruseCreditagreementTransferModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCreditPayafteruseCreditagreementTransferModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCreditPayafteruseCreditagreementTransferModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCreditPayafteruseCreditagreementTransferModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZhimaCreditPayafteruseCreditagreementTransferModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZhimaCreditPayafteruseCreditagreementTransferModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCreditPayafteruseCreditagreementTransferModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCreditPayafteruseCreditagreementTransferModel
  */
  public static ZhimaCreditPayafteruseCreditagreementTransferModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCreditPayafteruseCreditagreementTransferModel.class);
  }

 /**
  * Convert an instance of ZhimaCreditPayafteruseCreditagreementTransferModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

