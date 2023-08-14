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
 * ExpenseVoucherInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExpenseVoucherInfo {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_CONSUMPTION_DATE = "consumption_date";
  @SerializedName(SERIALIZED_NAME_CONSUMPTION_DATE)
  private String consumptionDate;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_EMPLOYEE_OPEN_ID = "employee_open_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_OPEN_ID)
  private String employeeOpenId;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private String extension;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_INDUSTRY = "industry";
  @SerializedName(SERIALIZED_NAME_INDUSTRY)
  private String industry;

  public static final String SERIALIZED_NAME_IS_OFF_SET = "is_off_set";
  @SerializedName(SERIALIZED_NAME_IS_OFF_SET)
  private String isOffSet;

  public static final String SERIALIZED_NAME_MEDIUM = "medium";
  @SerializedName(SERIALIZED_NAME_MEDIUM)
  private String medium;

  public static final String SERIALIZED_NAME_OUTER_SOURCE_ID = "outer_source_id";
  @SerializedName(SERIALIZED_NAME_OUTER_SOURCE_ID)
  private String outerSourceId;

  public static final String SERIALIZED_NAME_PARENT_TYPE = "parent_type";
  @SerializedName(SERIALIZED_NAME_PARENT_TYPE)
  private String parentType;

  public static final String SERIALIZED_NAME_VOUCHER_AMOUNT = "voucher_amount";
  @SerializedName(SERIALIZED_NAME_VOUCHER_AMOUNT)
  private String voucherAmount;

  public static final String SERIALIZED_NAME_VOUCHER_DATE = "voucher_date";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DATE)
  private String voucherDate;

  public static final String SERIALIZED_NAME_VOUCHER_ID = "voucher_id";
  @SerializedName(SERIALIZED_NAME_VOUCHER_ID)
  private String voucherId;

  public static final String SERIALIZED_NAME_VOUCHER_NO = "voucher_no";
  @SerializedName(SERIALIZED_NAME_VOUCHER_NO)
  private String voucherNo;

  public static final String SERIALIZED_NAME_VOUCHER_STATE = "voucher_state";
  @SerializedName(SERIALIZED_NAME_VOUCHER_STATE)
  private String voucherState;

  public static final String SERIALIZED_NAME_VOUCHER_TYPE = "voucher_type";
  @SerializedName(SERIALIZED_NAME_VOUCHER_TYPE)
  private String voucherType;

  public ExpenseVoucherInfo() { 
  }

  public ExpenseVoucherInfo accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 企业支付宝用户id(对应凭证ownerid)
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123456789000", value = "企业支付宝用户id(对应凭证ownerid)")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public ExpenseVoucherInfo consumptionDate(String consumptionDate) {
    
    this.consumptionDate = consumptionDate;
    return this;
  }

   /**
   * 消费时间
   * @return consumptionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-04-01 12:00:00", value = "消费时间")

  public String getConsumptionDate() {
    return consumptionDate;
  }


  public void setConsumptionDate(String consumptionDate) {
    this.consumptionDate = consumptionDate;
  }


  public ExpenseVoucherInfo employeeId(String employeeId) {
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * 员工ID
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123456789000", value = "员工ID")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }


  public ExpenseVoucherInfo employeeOpenId(String employeeOpenId) {
    
    this.employeeOpenId = employeeOpenId;
    return this;
  }

   /**
   * 员工ID
   * @return employeeOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "员工ID")

  public String getEmployeeOpenId() {
    return employeeOpenId;
  }


  public void setEmployeeOpenId(String employeeOpenId) {
    this.employeeOpenId = employeeOpenId;
  }


  public ExpenseVoucherInfo extension(String extension) {
    
    this.extension = extension;
    return this;
  }

   /**
   * 扩展预留
   * @return extension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "暂无", value = "扩展预留")

  public String getExtension() {
    return extension;
  }


  public void setExtension(String extension) {
    this.extension = extension;
  }


  public ExpenseVoucherInfo gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 数据创建时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-04-02 12:00:00", value = "数据创建时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public ExpenseVoucherInfo gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 数据更新时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-04-02 20:00:00", value = "数据更新时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public ExpenseVoucherInfo industry(String industry) {
    
    this.industry = industry;
    return this;
  }

   /**
   * 行业属性值（从支付宝主账单复制）
   * @return industry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "hotel", value = "行业属性值（从支付宝主账单复制）")

  public String getIndustry() {
    return industry;
  }


  public void setIndustry(String industry) {
    this.industry = industry;
  }


  public ExpenseVoucherInfo isOffSet(String isOffSet) {
    
    this.isOffSet = isOffSet;
    return this;
  }

   /**
   * 是否冲抵凭证：0 否（蓝票）；1 是(如:红票)
   * @return isOffSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "是否冲抵凭证：0 否（蓝票）；1 是(如:红票)")

  public String getIsOffSet() {
    return isOffSet;
  }


  public void setIsOffSet(String isOffSet) {
    this.isOffSet = isOffSet;
  }


  public ExpenseVoucherInfo medium(String medium) {
    
    this.medium = medium;
    return this;
  }

   /**
   * 凭证介质：纸or电子(PAPER,ELECTRON)
   * @return medium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PAPER", value = "凭证介质：纸or电子(PAPER,ELECTRON)")

  public String getMedium() {
    return medium;
  }


  public void setMedium(String medium) {
    this.medium = medium;
  }


  public ExpenseVoucherInfo outerSourceId(String outerSourceId) {
    
    this.outerSourceId = outerSourceId;
    return this;
  }

   /**
   * 外部唯一ID（和凭证类型有关，如果发票类型为发票号码+发票编码，如果是账单，则为账单号）
   * @return outerSourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000000000000002", value = "外部唯一ID（和凭证类型有关，如果发票类型为发票号码+发票编码，如果是账单，则为账单号）")

  public String getOuterSourceId() {
    return outerSourceId;
  }


  public void setOuterSourceId(String outerSourceId) {
    this.outerSourceId = outerSourceId;
  }


  public ExpenseVoucherInfo parentType(String parentType) {
    
    this.parentType = parentType;
    return this;
  }

   /**
   * 凭证父类型（INVOICE-发票，TRAVEL-出行凭证，HTL_ORDER-酒店水单，CONSUME-账单，财政票夹）
   * @return parentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INVOICE", value = "凭证父类型（INVOICE-发票，TRAVEL-出行凭证，HTL_ORDER-酒店水单，CONSUME-账单，财政票夹）")

  public String getParentType() {
    return parentType;
  }


  public void setParentType(String parentType) {
    this.parentType = parentType;
  }


  public ExpenseVoucherInfo voucherAmount(String voucherAmount) {
    
    this.voucherAmount = voucherAmount;
    return this;
  }

   /**
   * 交易金额（元）
   * @return voucherAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.00", value = "交易金额（元）")

  public String getVoucherAmount() {
    return voucherAmount;
  }


  public void setVoucherAmount(String voucherAmount) {
    this.voucherAmount = voucherAmount;
  }


  public ExpenseVoucherInfo voucherDate(String voucherDate) {
    
    this.voucherDate = voucherDate;
    return this;
  }

   /**
   * 凭证创建时间
   * @return voucherDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-04-01 12:00:00", value = "凭证创建时间")

  public String getVoucherDate() {
    return voucherDate;
  }


  public void setVoucherDate(String voucherDate) {
    this.voucherDate = voucherDate;
  }


  public ExpenseVoucherInfo voucherId(String voucherId) {
    
    this.voucherId = voucherId;
    return this;
  }

   /**
   * 凭证ID
   * @return voucherId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020123100152601930000003650", value = "凭证ID")

  public String getVoucherId() {
    return voucherId;
  }


  public void setVoucherId(String voucherId) {
    this.voucherId = voucherId;
  }


  public ExpenseVoucherInfo voucherNo(String voucherNo) {
    
    this.voucherNo = voucherNo;
    return this;
  }

   /**
   * 一类凭证，唯一号码，有必须传，没有可不传。 发票、账单必须有 如部分餐饮小票，没有唯一号
   * @return voucherNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020123100152601930000003650", value = "一类凭证，唯一号码，有必须传，没有可不传。 发票、账单必须有 如部分餐饮小票，没有唯一号")

  public String getVoucherNo() {
    return voucherNo;
  }


  public void setVoucherNo(String voucherNo) {
    this.voucherNo = voucherNo;
  }


  public ExpenseVoucherInfo voucherState(String voucherState) {
    
    this.voucherState = voucherState;
    return this;
  }

   /**
   * 凭证状态(0-无效，1 有效)
   * @return voucherState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "凭证状态(0-无效，1 有效)")

  public String getVoucherState() {
    return voucherState;
  }


  public void setVoucherState(String voucherState) {
    this.voucherState = voucherState;
  }


  public ExpenseVoucherInfo voucherType(String voucherType) {
    
    this.voucherType = voucherType;
    return this;
  }

   /**
   * 凭证类型 （FINANCIAL_BILLS-财政电子票 MEDICAL_INVOICE-医疗票据 DONATION_INVOICE-公益捐赠电子票据 SETTLEMENT_INVOICE-往来结算票据 DUES_INVOICE-社会团体会费收据 INVOICE-增值税票 PLAIN-增值税电子普通发票 SPECIAL-增值税专用发票 PLAIN_INVOICE-增值税普通发票 PAPER_INVOICE-增值税普通发票(卷式) CONSUME-账单 ALIPAY_CONSUME-支付宝账单 TRAVEL-出行凭证 TAXI-出租车票 BUS_TICKET-汽车票 TRAIN-火车票 TOLL-过路费 BOARD_PASS-登机牌 HTL_ORDER-酒店水单 MEMO-酒店水单 OTHERS-杂票 FIXED-定额发票 LIST-小票 COMMON_INVOICE-通用发票）
   * @return voucherType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INVOICE", value = "凭证类型 （FINANCIAL_BILLS-财政电子票 MEDICAL_INVOICE-医疗票据 DONATION_INVOICE-公益捐赠电子票据 SETTLEMENT_INVOICE-往来结算票据 DUES_INVOICE-社会团体会费收据 INVOICE-增值税票 PLAIN-增值税电子普通发票 SPECIAL-增值税专用发票 PLAIN_INVOICE-增值税普通发票 PAPER_INVOICE-增值税普通发票(卷式) CONSUME-账单 ALIPAY_CONSUME-支付宝账单 TRAVEL-出行凭证 TAXI-出租车票 BUS_TICKET-汽车票 TRAIN-火车票 TOLL-过路费 BOARD_PASS-登机牌 HTL_ORDER-酒店水单 MEMO-酒店水单 OTHERS-杂票 FIXED-定额发票 LIST-小票 COMMON_INVOICE-通用发票）")

  public String getVoucherType() {
    return voucherType;
  }


  public void setVoucherType(String voucherType) {
    this.voucherType = voucherType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpenseVoucherInfo expenseVoucherInfo = (ExpenseVoucherInfo) o;
    return Objects.equals(this.accountId, expenseVoucherInfo.accountId) &&
        Objects.equals(this.consumptionDate, expenseVoucherInfo.consumptionDate) &&
        Objects.equals(this.employeeId, expenseVoucherInfo.employeeId) &&
        Objects.equals(this.employeeOpenId, expenseVoucherInfo.employeeOpenId) &&
        Objects.equals(this.extension, expenseVoucherInfo.extension) &&
        Objects.equals(this.gmtCreate, expenseVoucherInfo.gmtCreate) &&
        Objects.equals(this.gmtModified, expenseVoucherInfo.gmtModified) &&
        Objects.equals(this.industry, expenseVoucherInfo.industry) &&
        Objects.equals(this.isOffSet, expenseVoucherInfo.isOffSet) &&
        Objects.equals(this.medium, expenseVoucherInfo.medium) &&
        Objects.equals(this.outerSourceId, expenseVoucherInfo.outerSourceId) &&
        Objects.equals(this.parentType, expenseVoucherInfo.parentType) &&
        Objects.equals(this.voucherAmount, expenseVoucherInfo.voucherAmount) &&
        Objects.equals(this.voucherDate, expenseVoucherInfo.voucherDate) &&
        Objects.equals(this.voucherId, expenseVoucherInfo.voucherId) &&
        Objects.equals(this.voucherNo, expenseVoucherInfo.voucherNo) &&
        Objects.equals(this.voucherState, expenseVoucherInfo.voucherState) &&
        Objects.equals(this.voucherType, expenseVoucherInfo.voucherType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, consumptionDate, employeeId, employeeOpenId, extension, gmtCreate, gmtModified, industry, isOffSet, medium, outerSourceId, parentType, voucherAmount, voucherDate, voucherId, voucherNo, voucherState, voucherType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseVoucherInfo {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    consumptionDate: ").append(toIndentedString(consumptionDate)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    employeeOpenId: ").append(toIndentedString(employeeOpenId)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    isOffSet: ").append(toIndentedString(isOffSet)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    outerSourceId: ").append(toIndentedString(outerSourceId)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
    sb.append("    voucherAmount: ").append(toIndentedString(voucherAmount)).append("\n");
    sb.append("    voucherDate: ").append(toIndentedString(voucherDate)).append("\n");
    sb.append("    voucherId: ").append(toIndentedString(voucherId)).append("\n");
    sb.append("    voucherNo: ").append(toIndentedString(voucherNo)).append("\n");
    sb.append("    voucherState: ").append(toIndentedString(voucherState)).append("\n");
    sb.append("    voucherType: ").append(toIndentedString(voucherType)).append("\n");
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
    openapiFields.add("consumption_date");
    openapiFields.add("employee_id");
    openapiFields.add("employee_open_id");
    openapiFields.add("extension");
    openapiFields.add("gmt_create");
    openapiFields.add("gmt_modified");
    openapiFields.add("industry");
    openapiFields.add("is_off_set");
    openapiFields.add("medium");
    openapiFields.add("outer_source_id");
    openapiFields.add("parent_type");
    openapiFields.add("voucher_amount");
    openapiFields.add("voucher_date");
    openapiFields.add("voucher_id");
    openapiFields.add("voucher_no");
    openapiFields.add("voucher_state");
    openapiFields.add("voucher_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExpenseVoucherInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExpenseVoucherInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExpenseVoucherInfo is not found in the empty JSON string", ExpenseVoucherInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExpenseVoucherInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExpenseVoucherInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("consumption_date") != null && !jsonObj.get("consumption_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumption_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumption_date").toString()));
      }
      if (jsonObj.get("employee_id") != null && !jsonObj.get("employee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_id").toString()));
      }
      if (jsonObj.get("employee_open_id") != null && !jsonObj.get("employee_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_open_id").toString()));
      }
      if (jsonObj.get("extension") != null && !jsonObj.get("extension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extension").toString()));
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      if (jsonObj.get("industry") != null && !jsonObj.get("industry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `industry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("industry").toString()));
      }
      if (jsonObj.get("is_off_set") != null && !jsonObj.get("is_off_set").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_off_set` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_off_set").toString()));
      }
      if (jsonObj.get("medium") != null && !jsonObj.get("medium").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `medium` to be a primitive type in the JSON string but got `%s`", jsonObj.get("medium").toString()));
      }
      if (jsonObj.get("outer_source_id") != null && !jsonObj.get("outer_source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outer_source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outer_source_id").toString()));
      }
      if (jsonObj.get("parent_type") != null && !jsonObj.get("parent_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_type").toString()));
      }
      if (jsonObj.get("voucher_amount") != null && !jsonObj.get("voucher_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_amount").toString()));
      }
      if (jsonObj.get("voucher_date") != null && !jsonObj.get("voucher_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_date").toString()));
      }
      if (jsonObj.get("voucher_id") != null && !jsonObj.get("voucher_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_id").toString()));
      }
      if (jsonObj.get("voucher_no") != null && !jsonObj.get("voucher_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_no").toString()));
      }
      if (jsonObj.get("voucher_state") != null && !jsonObj.get("voucher_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_state").toString()));
      }
      if (jsonObj.get("voucher_type") != null && !jsonObj.get("voucher_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExpenseVoucherInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExpenseVoucherInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExpenseVoucherInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExpenseVoucherInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ExpenseVoucherInfo>() {
           @Override
           public void write(JsonWriter out, ExpenseVoucherInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExpenseVoucherInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExpenseVoucherInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExpenseVoucherInfo
  * @throws IOException if the JSON string is invalid with respect to ExpenseVoucherInfo
  */
  public static ExpenseVoucherInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExpenseVoucherInfo.class);
  }

 /**
  * Convert an instance of ExpenseVoucherInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

