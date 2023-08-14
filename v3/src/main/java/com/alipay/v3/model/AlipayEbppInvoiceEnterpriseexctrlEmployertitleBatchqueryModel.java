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
 * AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel() { 
  }

  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 企业共同账户id
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业共同账户id")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权签约协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20215425001181407500", value = "授权签约协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业id
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123412341234", value = "企业id")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 页码
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "页码")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页行数
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "每页行数")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel alipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel = (AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel.accountId) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel.agreementNo) &&
        Objects.equals(this.enterpriseId, alipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel.enterpriseId) &&
        Objects.equals(this.pageNum, alipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel.pageNum) &&
        Objects.equals(this.pageSize, alipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreementNo, enterpriseId, pageNum, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("agreement_no");
    openapiFields.add("enterprise_id");
    openapiFields.add("page_num");
    openapiFields.add("page_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel is not found in the empty JSON string", AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel
  */
  public static AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

