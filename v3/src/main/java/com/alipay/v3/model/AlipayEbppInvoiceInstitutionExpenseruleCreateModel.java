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
import com.alipay.v3.model.AssetShareSourceInfo;
import com.alipay.v3.model.ExpenseCtrRuleInfo;
import com.alipay.v3.model.StandardConditionInfo;
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
 * AlipayEbppInvoiceInstitutionExpenseruleCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceInstitutionExpenseruleCreateModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_ASSET_SHARE_SOURCE_INFO = "asset_share_source_info";
  @SerializedName(SERIALIZED_NAME_ASSET_SHARE_SOURCE_INFO)
  private AssetShareSourceInfo assetShareSourceInfo;

  public static final String SERIALIZED_NAME_CONSUME_MODE = "consume_mode";
  @SerializedName(SERIALIZED_NAME_CONSUME_MODE)
  private String consumeMode;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_EXPENSE_CTRL_RULE_INFO_LIST = "expense_ctrl_rule_info_list";
  @SerializedName(SERIALIZED_NAME_EXPENSE_CTRL_RULE_INFO_LIST)
  private ExpenseCtrRuleInfo expenseCtrlRuleInfoList;

  public static final String SERIALIZED_NAME_EXPENSE_TYPE_SUB_CATEGORY = "expense_type_sub_category";
  @SerializedName(SERIALIZED_NAME_EXPENSE_TYPE_SUB_CATEGORY)
  private String expenseTypeSubCategory;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_OPEN_RULE_ID = "open_rule_id";
  @SerializedName(SERIALIZED_NAME_OPEN_RULE_ID)
  private String openRuleId;

  public static final String SERIALIZED_NAME_PAYMENT_POLICY = "payment_policy";
  @SerializedName(SERIALIZED_NAME_PAYMENT_POLICY)
  private String paymentPolicy;

  public static final String SERIALIZED_NAME_STANDARD_CONDITION_INFO_LIST = "standard_condition_info_list";
  @SerializedName(SERIALIZED_NAME_STANDARD_CONDITION_INFO_LIST)
  private List<StandardConditionInfo> standardConditionInfoList = null;

  public static final String SERIALIZED_NAME_STANDARD_DESC = "standard_desc";
  @SerializedName(SERIALIZED_NAME_STANDARD_DESC)
  private String standardDesc;

  public static final String SERIALIZED_NAME_STANDARD_NAME = "standard_name";
  @SerializedName(SERIALIZED_NAME_STANDARD_NAME)
  private String standardName;

  public AlipayEbppInvoiceInstitutionExpenseruleCreateModel() { 
  }

  public AlipayEbppInvoiceInstitutionExpenseruleCreateModel accountId(String accountId) {
    
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


  public AlipayEbppInvoiceInstitutionExpenseruleCreateModel agreementNo(String agreementNo) {
    
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


  public AlipayEbppInvoiceInstitutionExpenseruleCreateModel assetShareSourceInfo(AssetShareSourceInfo assetShareSourceInfo) {
    
    this.assetShareSourceInfo = assetShareSourceInfo;
    return this;
  }

   /**
   * Get assetShareSourceInfo
   * @return assetShareSourceInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AssetShareSourceInfo getAssetShareSourceInfo() {
    return assetShareSourceInfo;
  }


  public void setAssetShareSourceInfo(AssetShareSourceInfo assetShareSourceInfo) {
    this.assetShareSourceInfo = assetShareSourceInfo;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleCreateModel consumeMode(String consumeMode) {
    
    this.consumeMode = consumeMode;
    return this;
  }

   /**
   * 消费模式
   * @return consumeMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT", value = "消费模式")

  public String getConsumeMode() {
    return consumeMode;
  }


  public void setConsumeMode(String consumeMode) {
    this.consumeMode = consumeMode;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleCreateModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业码id
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业码id")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleCreateModel expenseCtrlRuleInfoList(ExpenseCtrRuleInfo expenseCtrlRuleInfoList) {
    
    this.expenseCtrlRuleInfoList = expenseCtrlRuleInfoList;
    return this;
  }

   /**
   * Get expenseCtrlRuleInfoList
   * @return expenseCtrlRuleInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExpenseCtrRuleInfo getExpenseCtrlRuleInfoList() {
    return expenseCtrlRuleInfoList;
  }


  public void setExpenseCtrlRuleInfoList(ExpenseCtrRuleInfo expenseCtrlRuleInfoList) {
    this.expenseCtrlRuleInfoList = expenseCtrlRuleInfoList;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleCreateModel expenseTypeSubCategory(String expenseTypeSubCategory) {
    
    this.expenseTypeSubCategory = expenseTypeSubCategory;
    return this;
  }

   /**
   * 费用类型子类
   * @return expenseTypeSubCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TAKE_AWAY", value = "费用类型子类")

  public String getExpenseTypeSubCategory() {
    return expenseTypeSubCategory;
  }


  public void setExpenseTypeSubCategory(String expenseTypeSubCategory) {
    this.expenseTypeSubCategory = expenseTypeSubCategory;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleCreateModel institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * 制度id
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022051900152617290000002725", value = "制度id")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleCreateModel openRuleId(String openRuleId) {
    
    this.openRuleId = openRuleId;
    return this;
  }

   /**
   * 开票规则id
   * @return openRuleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022070600152721390000011371", value = "开票规则id")

  public String getOpenRuleId() {
    return openRuleId;
  }


  public void setOpenRuleId(String openRuleId) {
    this.openRuleId = openRuleId;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleCreateModel paymentPolicy(String paymentPolicy) {
    
    this.paymentPolicy = paymentPolicy;
    return this;
  }

   /**
   * 支付策略
   * @return paymentPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COMBINATION", value = "支付策略")

  public String getPaymentPolicy() {
    return paymentPolicy;
  }


  public void setPaymentPolicy(String paymentPolicy) {
    this.paymentPolicy = paymentPolicy;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleCreateModel standardConditionInfoList(List<StandardConditionInfo> standardConditionInfoList) {
    
    this.standardConditionInfoList = standardConditionInfoList;
    return this;
  }

  public AlipayEbppInvoiceInstitutionExpenseruleCreateModel addStandardConditionInfoListItem(StandardConditionInfo standardConditionInfoListItem) {
    if (this.standardConditionInfoList == null) {
      this.standardConditionInfoList = new ArrayList<>();
    }
    this.standardConditionInfoList.add(standardConditionInfoListItem);
    return this;
  }

   /**
   * 使用规则因子列表
   * @return standardConditionInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "使用规则因子列表")

  public List<StandardConditionInfo> getStandardConditionInfoList() {
    return standardConditionInfoList;
  }


  public void setStandardConditionInfoList(List<StandardConditionInfo> standardConditionInfoList) {
    this.standardConditionInfoList = standardConditionInfoList;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleCreateModel standardDesc(String standardDesc) {
    
    this.standardDesc = standardDesc;
    return this;
  }

   /**
   * 使用规则描述
   * @return standardDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "福利餐说明", value = "使用规则描述")

  public String getStandardDesc() {
    return standardDesc;
  }


  public void setStandardDesc(String standardDesc) {
    this.standardDesc = standardDesc;
  }


  public AlipayEbppInvoiceInstitutionExpenseruleCreateModel standardName(String standardName) {
    
    this.standardName = standardName;
    return this;
  }

   /**
   * 费控规则名称
   * @return standardName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "福利餐费控规则", value = "费控规则名称")

  public String getStandardName() {
    return standardName;
  }


  public void setStandardName(String standardName) {
    this.standardName = standardName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceInstitutionExpenseruleCreateModel alipayEbppInvoiceInstitutionExpenseruleCreateModel = (AlipayEbppInvoiceInstitutionExpenseruleCreateModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceInstitutionExpenseruleCreateModel.accountId) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceInstitutionExpenseruleCreateModel.agreementNo) &&
        Objects.equals(this.assetShareSourceInfo, alipayEbppInvoiceInstitutionExpenseruleCreateModel.assetShareSourceInfo) &&
        Objects.equals(this.consumeMode, alipayEbppInvoiceInstitutionExpenseruleCreateModel.consumeMode) &&
        Objects.equals(this.enterpriseId, alipayEbppInvoiceInstitutionExpenseruleCreateModel.enterpriseId) &&
        Objects.equals(this.expenseCtrlRuleInfoList, alipayEbppInvoiceInstitutionExpenseruleCreateModel.expenseCtrlRuleInfoList) &&
        Objects.equals(this.expenseTypeSubCategory, alipayEbppInvoiceInstitutionExpenseruleCreateModel.expenseTypeSubCategory) &&
        Objects.equals(this.institutionId, alipayEbppInvoiceInstitutionExpenseruleCreateModel.institutionId) &&
        Objects.equals(this.openRuleId, alipayEbppInvoiceInstitutionExpenseruleCreateModel.openRuleId) &&
        Objects.equals(this.paymentPolicy, alipayEbppInvoiceInstitutionExpenseruleCreateModel.paymentPolicy) &&
        Objects.equals(this.standardConditionInfoList, alipayEbppInvoiceInstitutionExpenseruleCreateModel.standardConditionInfoList) &&
        Objects.equals(this.standardDesc, alipayEbppInvoiceInstitutionExpenseruleCreateModel.standardDesc) &&
        Objects.equals(this.standardName, alipayEbppInvoiceInstitutionExpenseruleCreateModel.standardName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreementNo, assetShareSourceInfo, consumeMode, enterpriseId, expenseCtrlRuleInfoList, expenseTypeSubCategory, institutionId, openRuleId, paymentPolicy, standardConditionInfoList, standardDesc, standardName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceInstitutionExpenseruleCreateModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    assetShareSourceInfo: ").append(toIndentedString(assetShareSourceInfo)).append("\n");
    sb.append("    consumeMode: ").append(toIndentedString(consumeMode)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    expenseCtrlRuleInfoList: ").append(toIndentedString(expenseCtrlRuleInfoList)).append("\n");
    sb.append("    expenseTypeSubCategory: ").append(toIndentedString(expenseTypeSubCategory)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    openRuleId: ").append(toIndentedString(openRuleId)).append("\n");
    sb.append("    paymentPolicy: ").append(toIndentedString(paymentPolicy)).append("\n");
    sb.append("    standardConditionInfoList: ").append(toIndentedString(standardConditionInfoList)).append("\n");
    sb.append("    standardDesc: ").append(toIndentedString(standardDesc)).append("\n");
    sb.append("    standardName: ").append(toIndentedString(standardName)).append("\n");
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
    openapiFields.add("asset_share_source_info");
    openapiFields.add("consume_mode");
    openapiFields.add("enterprise_id");
    openapiFields.add("expense_ctrl_rule_info_list");
    openapiFields.add("expense_type_sub_category");
    openapiFields.add("institution_id");
    openapiFields.add("open_rule_id");
    openapiFields.add("payment_policy");
    openapiFields.add("standard_condition_info_list");
    openapiFields.add("standard_desc");
    openapiFields.add("standard_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceInstitutionExpenseruleCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceInstitutionExpenseruleCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceInstitutionExpenseruleCreateModel is not found in the empty JSON string", AlipayEbppInvoiceInstitutionExpenseruleCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceInstitutionExpenseruleCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceInstitutionExpenseruleCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      // validate the optional field `asset_share_source_info`
      if (jsonObj.getAsJsonObject("asset_share_source_info") != null) {
        AssetShareSourceInfo.validateJsonObject(jsonObj.getAsJsonObject("asset_share_source_info"));
      }
      if (jsonObj.get("consume_mode") != null && !jsonObj.get("consume_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consume_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consume_mode").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      // validate the optional field `expense_ctrl_rule_info_list`
      if (jsonObj.getAsJsonObject("expense_ctrl_rule_info_list") != null) {
        ExpenseCtrRuleInfo.validateJsonObject(jsonObj.getAsJsonObject("expense_ctrl_rule_info_list"));
      }
      if (jsonObj.get("expense_type_sub_category") != null && !jsonObj.get("expense_type_sub_category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expense_type_sub_category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expense_type_sub_category").toString()));
      }
      if (jsonObj.get("institution_id") != null && !jsonObj.get("institution_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_id").toString()));
      }
      if (jsonObj.get("open_rule_id") != null && !jsonObj.get("open_rule_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_rule_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_rule_id").toString()));
      }
      if (jsonObj.get("payment_policy") != null && !jsonObj.get("payment_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_policy").toString()));
      }
      JsonArray jsonArraystandardConditionInfoList = jsonObj.getAsJsonArray("standard_condition_info_list");
      if (jsonArraystandardConditionInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("standard_condition_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `standard_condition_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("standard_condition_info_list").toString()));
        }

        // validate the optional field `standard_condition_info_list` (array)
        for (int i = 0; i < jsonArraystandardConditionInfoList.size(); i++) {
          StandardConditionInfo.validateJsonObject(jsonArraystandardConditionInfoList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("standard_desc") != null && !jsonObj.get("standard_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_desc").toString()));
      }
      if (jsonObj.get("standard_name") != null && !jsonObj.get("standard_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceInstitutionExpenseruleCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceInstitutionExpenseruleCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceInstitutionExpenseruleCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceInstitutionExpenseruleCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceInstitutionExpenseruleCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceInstitutionExpenseruleCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceInstitutionExpenseruleCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceInstitutionExpenseruleCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceInstitutionExpenseruleCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceInstitutionExpenseruleCreateModel
  */
  public static AlipayEbppInvoiceInstitutionExpenseruleCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceInstitutionExpenseruleCreateModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceInstitutionExpenseruleCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

