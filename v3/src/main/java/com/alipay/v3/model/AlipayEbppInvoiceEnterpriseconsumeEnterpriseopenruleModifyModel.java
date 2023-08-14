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
 * AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_INVOICE_RULE_ID = "invoice_rule_id";
  @SerializedName(SERIALIZED_NAME_INVOICE_RULE_ID)
  private String invoiceRuleId;

  public static final String SERIALIZED_NAME_INVOICE_RULE_NAME = "invoice_rule_name";
  @SerializedName(SERIALIZED_NAME_INVOICE_RULE_NAME)
  private String invoiceRuleName;

  public static final String SERIALIZED_NAME_INVOICE_TITLE_ID = "invoice_title_id";
  @SerializedName(SERIALIZED_NAME_INVOICE_TITLE_ID)
  private String invoiceTitleId;

  public static final String SERIALIZED_NAME_SELLER_TYPE = "seller_type";
  @SerializedName(SERIALIZED_NAME_SELLER_TYPE)
  private String sellerType;

  public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel() { 
  }

  public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 企业共同账户ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业共同账户ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel agreementNo(String agreementNo) {
    
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


  public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业ID
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业ID")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel invoiceRuleId(String invoiceRuleId) {
    
    this.invoiceRuleId = invoiceRuleId;
    return this;
  }

   /**
   * 开票规则ID
   * @return invoiceRuleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021032900152710950000000001", value = "开票规则ID")

  public String getInvoiceRuleId() {
    return invoiceRuleId;
  }


  public void setInvoiceRuleId(String invoiceRuleId) {
    this.invoiceRuleId = invoiceRuleId;
  }


  public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel invoiceRuleName(String invoiceRuleName) {
    
    this.invoiceRuleName = invoiceRuleName;
    return this;
  }

   /**
   * 开票规则名称
   * @return invoiceRuleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "开票规则测试2", value = "开票规则名称")

  public String getInvoiceRuleName() {
    return invoiceRuleName;
  }


  public void setInvoiceRuleName(String invoiceRuleName) {
    this.invoiceRuleName = invoiceRuleName;
  }


  public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel invoiceTitleId(String invoiceTitleId) {
    
    this.invoiceTitleId = invoiceTitleId;
    return this;
  }

   /**
   * 发票抬头
   * @return invoiceTitleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021080500152710850000000421", value = "发票抬头")

  public String getInvoiceTitleId() {
    return invoiceTitleId;
  }


  public void setInvoiceTitleId(String invoiceTitleId) {
    this.invoiceTitleId = invoiceTitleId;
  }


  public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel sellerType(String sellerType) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel = (AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel.accountId) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel.agreementNo) &&
        Objects.equals(this.enterpriseId, alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel.enterpriseId) &&
        Objects.equals(this.invoiceRuleId, alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel.invoiceRuleId) &&
        Objects.equals(this.invoiceRuleName, alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel.invoiceRuleName) &&
        Objects.equals(this.invoiceTitleId, alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel.invoiceTitleId) &&
        Objects.equals(this.sellerType, alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel.sellerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreementNo, enterpriseId, invoiceRuleId, invoiceRuleName, invoiceTitleId, sellerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    invoiceRuleId: ").append(toIndentedString(invoiceRuleId)).append("\n");
    sb.append("    invoiceRuleName: ").append(toIndentedString(invoiceRuleName)).append("\n");
    sb.append("    invoiceTitleId: ").append(toIndentedString(invoiceTitleId)).append("\n");
    sb.append("    sellerType: ").append(toIndentedString(sellerType)).append("\n");
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
    openapiFields.add("invoice_rule_id");
    openapiFields.add("invoice_rule_name");
    openapiFields.add("invoice_title_id");
    openapiFields.add("seller_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel is not found in the empty JSON string", AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("invoice_rule_id") != null && !jsonObj.get("invoice_rule_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_rule_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_rule_id").toString()));
      }
      if (jsonObj.get("invoice_rule_name") != null && !jsonObj.get("invoice_rule_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_rule_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_rule_name").toString()));
      }
      if (jsonObj.get("invoice_title_id") != null && !jsonObj.get("invoice_title_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_title_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_title_id").toString()));
      }
      if (jsonObj.get("seller_type") != null && !jsonObj.get("seller_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seller_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seller_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel
  */
  public static AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

