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
 * AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_BILL_MONTH_DAY = "bill_month_day";
  @SerializedName(SERIALIZED_NAME_BILL_MONTH_DAY)
  private Integer billMonthDay;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_INVOICE_RULE_NAME = "invoice_rule_name";
  @SerializedName(SERIALIZED_NAME_INVOICE_RULE_NAME)
  private String invoiceRuleName;

  public static final String SERIALIZED_NAME_INVOICE_TITLE_ID = "invoice_title_id";
  @SerializedName(SERIALIZED_NAME_INVOICE_TITLE_ID)
  private String invoiceTitleId;

  public static final String SERIALIZED_NAME_OPEN_MODE = "open_mode";
  @SerializedName(SERIALIZED_NAME_OPEN_MODE)
  private String openMode;

  public static final String SERIALIZED_NAME_SELLER_TYPE = "seller_type";
  @SerializedName(SERIALIZED_NAME_SELLER_TYPE)
  private String sellerType;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel() { 
  }

  public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 共同账户ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "共同账户ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权签约协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20215425001112341234", value = "授权签约协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel billMonthDay(Integer billMonthDay) {
    
    this.billMonthDay = billMonthDay;
    return this;
  }

   /**
   * 账期结束日期
   * @return billMonthDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "账期结束日期")

  public Integer getBillMonthDay() {
    return billMonthDay;
  }


  public void setBillMonthDay(Integer billMonthDay) {
    this.billMonthDay = billMonthDay;
  }


  public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业ID
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088402284248282", value = "企业ID")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel invoiceRuleName(String invoiceRuleName) {
    
    this.invoiceRuleName = invoiceRuleName;
    return this;
  }

   /**
   * 开票规则名称
   * @return invoiceRuleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "开票规则测试1", value = "开票规则名称")

  public String getInvoiceRuleName() {
    return invoiceRuleName;
  }


  public void setInvoiceRuleName(String invoiceRuleName) {
    this.invoiceRuleName = invoiceRuleName;
  }


  public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel invoiceTitleId(String invoiceTitleId) {
    
    this.invoiceTitleId = invoiceTitleId;
    return this;
  }

   /**
   * 发票抬头
   * @return invoiceTitleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021032900152710950000000001", value = "发票抬头")

  public String getInvoiceTitleId() {
    return invoiceTitleId;
  }


  public void setInvoiceTitleId(String invoiceTitleId) {
    this.invoiceTitleId = invoiceTitleId;
  }


  public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel openMode(String openMode) {
    
    this.openMode = openMode;
    return this;
  }

   /**
   * 开票模式
   * @return openMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUMMARY", value = "开票模式")

  public String getOpenMode() {
    return openMode;
  }


  public void setOpenMode(String openMode) {
    this.openMode = openMode;
  }


  public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel sellerType(String sellerType) {
    
    this.sellerType = sellerType;
    return this;
  }

   /**
   * 销方类型
   * @return sellerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TP", value = "销方类型")

  public String getSellerType() {
    return sellerType;
  }


  public void setSellerType(String sellerType) {
    this.sellerType = sellerType;
  }


  public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * 开票规则标记
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT", value = "开票规则标记")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel = (AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel.accountId) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel.agreementNo) &&
        Objects.equals(this.billMonthDay, alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel.billMonthDay) &&
        Objects.equals(this.enterpriseId, alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel.enterpriseId) &&
        Objects.equals(this.invoiceRuleName, alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel.invoiceRuleName) &&
        Objects.equals(this.invoiceTitleId, alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel.invoiceTitleId) &&
        Objects.equals(this.openMode, alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel.openMode) &&
        Objects.equals(this.sellerType, alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel.sellerType) &&
        Objects.equals(this.tag, alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreementNo, billMonthDay, enterpriseId, invoiceRuleName, invoiceTitleId, openMode, sellerType, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    billMonthDay: ").append(toIndentedString(billMonthDay)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    invoiceRuleName: ").append(toIndentedString(invoiceRuleName)).append("\n");
    sb.append("    invoiceTitleId: ").append(toIndentedString(invoiceTitleId)).append("\n");
    sb.append("    openMode: ").append(toIndentedString(openMode)).append("\n");
    sb.append("    sellerType: ").append(toIndentedString(sellerType)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    openapiFields.add("bill_month_day");
    openapiFields.add("enterprise_id");
    openapiFields.add("invoice_rule_name");
    openapiFields.add("invoice_title_id");
    openapiFields.add("open_mode");
    openapiFields.add("seller_type");
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel is not found in the empty JSON string", AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("invoice_rule_name") != null && !jsonObj.get("invoice_rule_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_rule_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_rule_name").toString()));
      }
      if (jsonObj.get("invoice_title_id") != null && !jsonObj.get("invoice_title_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_title_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_title_id").toString()));
      }
      if (jsonObj.get("open_mode") != null && !jsonObj.get("open_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_mode").toString()));
      }
      if (jsonObj.get("seller_type") != null && !jsonObj.get("seller_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seller_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seller_type").toString()));
      }
      if (jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel
  */
  public static AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

