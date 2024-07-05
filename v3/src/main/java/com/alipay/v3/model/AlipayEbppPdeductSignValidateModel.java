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
 * AlipayEbppPdeductSignValidateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppPdeductSignValidateModel {
  public static final String SERIALIZED_NAME_AGENT_CHANNEL = "agent_channel";
  @SerializedName(SERIALIZED_NAME_AGENT_CHANNEL)
  private String agentChannel;

  public static final String SERIALIZED_NAME_AGENT_CODE = "agent_code";
  @SerializedName(SERIALIZED_NAME_AGENT_CODE)
  private String agentCode;

  public static final String SERIALIZED_NAME_BILL_KEY = "bill_key";
  @SerializedName(SERIALIZED_NAME_BILL_KEY)
  private String billKey;

  public static final String SERIALIZED_NAME_BIZ_TYPE = "biz_type";
  @SerializedName(SERIALIZED_NAME_BIZ_TYPE)
  private String bizType;

  public static final String SERIALIZED_NAME_CHARGE_INST = "charge_inst";
  @SerializedName(SERIALIZED_NAME_CHARGE_INST)
  private String chargeInst;

  public static final String SERIALIZED_NAME_DEDUCT_TYPE = "deduct_type";
  @SerializedName(SERIALIZED_NAME_DEDUCT_TYPE)
  private String deductType;

  public static final String SERIALIZED_NAME_EXTEND_FIELD = "extend_field";
  @SerializedName(SERIALIZED_NAME_EXTEND_FIELD)
  private String extendField;

  public static final String SERIALIZED_NAME_NOTIFY_CONFIG = "notify_config";
  @SerializedName(SERIALIZED_NAME_NOTIFY_CONFIG)
  private String notifyConfig;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_OUT_AGREEMENT_ID = "out_agreement_id";
  @SerializedName(SERIALIZED_NAME_OUT_AGREEMENT_ID)
  private String outAgreementId;

  public static final String SERIALIZED_NAME_OWNER_NAME = "owner_name";
  @SerializedName(SERIALIZED_NAME_OWNER_NAME)
  private String ownerName;

  public static final String SERIALIZED_NAME_PAY_CONFIG = "pay_config";
  @SerializedName(SERIALIZED_NAME_PAY_CONFIG)
  private String payConfig;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_SIGN_EXPIRE_DATE = "sign_expire_date";
  @SerializedName(SERIALIZED_NAME_SIGN_EXPIRE_DATE)
  private String signExpireDate;

  public static final String SERIALIZED_NAME_SUB_BIZ_TYPE = "sub_biz_type";
  @SerializedName(SERIALIZED_NAME_SUB_BIZ_TYPE)
  private String subBizType;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AlipayEbppPdeductSignValidateModel() { 
  }

  public AlipayEbppPdeductSignValidateModel agentChannel(String agentChannel) {
    
    this.agentChannel = agentChannel;
    return this;
  }

   /**
   * 机构签约代扣来源渠道  PUBLICPLATFORM：服务窗
   * @return agentChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PUBLICPLATFORM", value = "机构签约代扣来源渠道  PUBLICPLATFORM：服务窗")

  public String getAgentChannel() {
    return agentChannel;
  }


  public void setAgentChannel(String agentChannel) {
    this.agentChannel = agentChannel;
  }


  public AlipayEbppPdeductSignValidateModel agentCode(String agentCode) {
    
    this.agentCode = agentCode;
    return this;
  }

   /**
   * 从服务窗发起则为该服务窗的appid的值
   * @return agentCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "从服务窗发起则为该服务窗的appid的值")

  public String getAgentCode() {
    return agentCode;
  }


  public void setAgentCode(String agentCode) {
    this.agentCode = agentCode;
  }


  public AlipayEbppPdeductSignValidateModel billKey(String billKey) {
    
    this.billKey = billKey;
    return this;
  }

   /**
   * 户号，机构针对于每户的水、电都会有唯一的标识户号
   * @return billKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "02659981", value = "户号，机构针对于每户的水、电都会有唯一的标识户号")

  public String getBillKey() {
    return billKey;
  }


  public void setBillKey(String billKey) {
    this.billKey = billKey;
  }


  public AlipayEbppPdeductSignValidateModel bizType(String bizType) {
    
    this.bizType = bizType;
    return this;
  }

   /**
   * 业务类型。  JF：缴水、电、燃气、固话宽带、有线电视、交通罚款费用  WUYE：缴物业费  HK：信用卡还款  TX：手机充值
   * @return bizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JF", value = "业务类型。  JF：缴水、电、燃气、固话宽带、有线电视、交通罚款费用  WUYE：缴物业费  HK：信用卡还款  TX：手机充值")

  public String getBizType() {
    return bizType;
  }


  public void setBizType(String bizType) {
    this.bizType = bizType;
  }


  public AlipayEbppPdeductSignValidateModel chargeInst(String chargeInst) {
    
    this.chargeInst = chargeInst;
    return this;
  }

   /**
   * 支付宝缴费系统中的出账机构ID
   * @return chargeInst
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CQCENTERELECTRIC", value = "支付宝缴费系统中的出账机构ID")

  public String getChargeInst() {
    return chargeInst;
  }


  public void setChargeInst(String chargeInst) {
    this.chargeInst = chargeInst;
  }


  public AlipayEbppPdeductSignValidateModel deductType(String deductType) {
    
    this.deductType = deductType;
    return this;
  }

   /**
   * 签约类型,可为空。目前类型有INST_DIRECT_DEDUCT
   * @return deductType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "direct_sign_deduct", value = "签约类型,可为空。目前类型有INST_DIRECT_DEDUCT")

  public String getDeductType() {
    return deductType;
  }


  public void setDeductType(String deductType) {
    this.deductType = deductType;
  }


  public AlipayEbppPdeductSignValidateModel extendField(String extendField) {
    
    this.extendField = extendField;
    return this;
  }

   /**
   * 扩展字段
   * @return extendField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "null", value = "扩展字段")

  public String getExtendField() {
    return extendField;
  }


  public void setExtendField(String extendField) {
    this.extendField = extendField;
  }


  public AlipayEbppPdeductSignValidateModel notifyConfig(String notifyConfig) {
    
    this.notifyConfig = notifyConfig;
    return this;
  }

   /**
   * 通知方式设置，本期预留字段，固定传空。
   * @return notifyConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "null", value = "通知方式设置，本期预留字段，固定传空。")

  public String getNotifyConfig() {
    return notifyConfig;
  }


  public void setNotifyConfig(String notifyConfig) {
    this.notifyConfig = notifyConfig;
  }


  public AlipayEbppPdeductSignValidateModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 用户UserId在应用AppId下的唯一用户标识
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "用户UserId在应用AppId下的唯一用户标识")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayEbppPdeductSignValidateModel outAgreementId(String outAgreementId) {
    
    this.outAgreementId = outAgreementId;
    return this;
  }

   /**
   * 外部机构签约的协议id
   * @return outAgreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "外部机构签约的协议id")

  public String getOutAgreementId() {
    return outAgreementId;
  }


  public void setOutAgreementId(String outAgreementId) {
    this.outAgreementId = outAgreementId;
  }


  public AlipayEbppPdeductSignValidateModel ownerName(String ownerName) {
    
    this.ownerName = ownerName;
    return this;
  }

   /**
   * 户名，户主真实姓名
   * @return ownerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "王龙海", value = "户名，户主真实姓名")

  public String getOwnerName() {
    return ownerName;
  }


  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }


  public AlipayEbppPdeductSignValidateModel payConfig(String payConfig) {
    
    this.payConfig = payConfig;
    return this;
  }

   /**
   * 支付工具设置，目前可为空。类型有：BALANCE;CARTOON;BIGAMOUNT_CREDIT_CARTOON;DEBIT_EXPRESS;OPTIMIZED_MOTO;PCREDIT_PAY;MONEY_FUND
   * @return payConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "null", value = "支付工具设置，目前可为空。类型有：BALANCE;CARTOON;BIGAMOUNT_CREDIT_CARTOON;DEBIT_EXPRESS;OPTIMIZED_MOTO;PCREDIT_PAY;MONEY_FUND")

  public String getPayConfig() {
    return payConfig;
  }


  public void setPayConfig(String payConfig) {
    this.payConfig = payConfig;
  }


  public AlipayEbppPdeductSignValidateModel pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 商户签约支付宝账号的userid，2088开头16位长度的字符串，在支付宝系统中唯一
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102118849556", value = "商户签约支付宝账号的userid，2088开头16位长度的字符串，在支付宝系统中唯一")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }


  public AlipayEbppPdeductSignValidateModel signExpireDate(String signExpireDate) {
    
    this.signExpireDate = signExpireDate;
    return this;
  }

   /**
   * 签约到期时间。空表示无限期，一期固定传空。
   * @return signExpireDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-03-12", value = "签约到期时间。空表示无限期，一期固定传空。")

  public String getSignExpireDate() {
    return signExpireDate;
  }


  public void setSignExpireDate(String signExpireDate) {
    this.signExpireDate = signExpireDate;
  }


  public AlipayEbppPdeductSignValidateModel subBizType(String subBizType) {
    
    this.subBizType = subBizType;
    return this;
  }

   /**
   * 业务子类型。  WATER：缴水费  ELECTRIC：缴电费  GAS：缴燃气费  COMMUN：缴固话宽带  CATV：缴有线电视费  TRAFFIC：缴交通罚款  WUYE：缴物业费  HK：信用卡还款  CZ：手机充值
   * @return subBizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ELECTRIC", value = "业务子类型。  WATER：缴水费  ELECTRIC：缴电费  GAS：缴燃气费  COMMUN：缴固话宽带  CATV：缴有线电视费  TRAFFIC：缴交通罚款  WUYE：缴物业费  HK：信用卡还款  CZ：手机充值")

  public String getSubBizType() {
    return subBizType;
  }


  public void setSubBizType(String subBizType) {
    this.subBizType = subBizType;
  }


  public AlipayEbppPdeductSignValidateModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 用户支付宝账号id，2088开头16位长度的字符串，在支付宝系统中唯一
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088111133334134", value = "用户支付宝账号id，2088开头16位长度的字符串，在支付宝系统中唯一")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
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
   * @return the AlipayEbppPdeductSignValidateModel instance itself
   */
  public AlipayEbppPdeductSignValidateModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppPdeductSignValidateModel alipayEbppPdeductSignValidateModel = (AlipayEbppPdeductSignValidateModel) o;
    return Objects.equals(this.agentChannel, alipayEbppPdeductSignValidateModel.agentChannel) &&
        Objects.equals(this.agentCode, alipayEbppPdeductSignValidateModel.agentCode) &&
        Objects.equals(this.billKey, alipayEbppPdeductSignValidateModel.billKey) &&
        Objects.equals(this.bizType, alipayEbppPdeductSignValidateModel.bizType) &&
        Objects.equals(this.chargeInst, alipayEbppPdeductSignValidateModel.chargeInst) &&
        Objects.equals(this.deductType, alipayEbppPdeductSignValidateModel.deductType) &&
        Objects.equals(this.extendField, alipayEbppPdeductSignValidateModel.extendField) &&
        Objects.equals(this.notifyConfig, alipayEbppPdeductSignValidateModel.notifyConfig) &&
        Objects.equals(this.openId, alipayEbppPdeductSignValidateModel.openId) &&
        Objects.equals(this.outAgreementId, alipayEbppPdeductSignValidateModel.outAgreementId) &&
        Objects.equals(this.ownerName, alipayEbppPdeductSignValidateModel.ownerName) &&
        Objects.equals(this.payConfig, alipayEbppPdeductSignValidateModel.payConfig) &&
        Objects.equals(this.pid, alipayEbppPdeductSignValidateModel.pid) &&
        Objects.equals(this.signExpireDate, alipayEbppPdeductSignValidateModel.signExpireDate) &&
        Objects.equals(this.subBizType, alipayEbppPdeductSignValidateModel.subBizType) &&
        Objects.equals(this.userId, alipayEbppPdeductSignValidateModel.userId)&&
        Objects.equals(this.additionalProperties, alipayEbppPdeductSignValidateModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentChannel, agentCode, billKey, bizType, chargeInst, deductType, extendField, notifyConfig, openId, outAgreementId, ownerName, payConfig, pid, signExpireDate, subBizType, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppPdeductSignValidateModel {\n");
    sb.append("    agentChannel: ").append(toIndentedString(agentChannel)).append("\n");
    sb.append("    agentCode: ").append(toIndentedString(agentCode)).append("\n");
    sb.append("    billKey: ").append(toIndentedString(billKey)).append("\n");
    sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
    sb.append("    chargeInst: ").append(toIndentedString(chargeInst)).append("\n");
    sb.append("    deductType: ").append(toIndentedString(deductType)).append("\n");
    sb.append("    extendField: ").append(toIndentedString(extendField)).append("\n");
    sb.append("    notifyConfig: ").append(toIndentedString(notifyConfig)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    outAgreementId: ").append(toIndentedString(outAgreementId)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    payConfig: ").append(toIndentedString(payConfig)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    signExpireDate: ").append(toIndentedString(signExpireDate)).append("\n");
    sb.append("    subBizType: ").append(toIndentedString(subBizType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("agent_channel");
    openapiFields.add("agent_code");
    openapiFields.add("bill_key");
    openapiFields.add("biz_type");
    openapiFields.add("charge_inst");
    openapiFields.add("deduct_type");
    openapiFields.add("extend_field");
    openapiFields.add("notify_config");
    openapiFields.add("open_id");
    openapiFields.add("out_agreement_id");
    openapiFields.add("owner_name");
    openapiFields.add("pay_config");
    openapiFields.add("pid");
    openapiFields.add("sign_expire_date");
    openapiFields.add("sub_biz_type");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppPdeductSignValidateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppPdeductSignValidateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppPdeductSignValidateModel is not found in the empty JSON string", AlipayEbppPdeductSignValidateModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("agent_channel") != null && !jsonObj.get("agent_channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agent_channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agent_channel").toString()));
      }
      if (jsonObj.get("agent_code") != null && !jsonObj.get("agent_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agent_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agent_code").toString()));
      }
      if (jsonObj.get("bill_key") != null && !jsonObj.get("bill_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_key").toString()));
      }
      if (jsonObj.get("biz_type") != null && !jsonObj.get("biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_type").toString()));
      }
      if (jsonObj.get("charge_inst") != null && !jsonObj.get("charge_inst").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charge_inst` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charge_inst").toString()));
      }
      if (jsonObj.get("deduct_type") != null && !jsonObj.get("deduct_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deduct_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deduct_type").toString()));
      }
      if (jsonObj.get("extend_field") != null && !jsonObj.get("extend_field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend_field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extend_field").toString()));
      }
      if (jsonObj.get("notify_config") != null && !jsonObj.get("notify_config").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notify_config` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notify_config").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("out_agreement_id") != null && !jsonObj.get("out_agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_agreement_id").toString()));
      }
      if (jsonObj.get("owner_name") != null && !jsonObj.get("owner_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_name").toString()));
      }
      if (jsonObj.get("pay_config") != null && !jsonObj.get("pay_config").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_config` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_config").toString()));
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
      if (jsonObj.get("sign_expire_date") != null && !jsonObj.get("sign_expire_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_expire_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_expire_date").toString()));
      }
      if (jsonObj.get("sub_biz_type") != null && !jsonObj.get("sub_biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_biz_type").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppPdeductSignValidateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppPdeductSignValidateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppPdeductSignValidateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppPdeductSignValidateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppPdeductSignValidateModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppPdeductSignValidateModel value) throws IOException {
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
           public AlipayEbppPdeductSignValidateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppPdeductSignValidateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppPdeductSignValidateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppPdeductSignValidateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppPdeductSignValidateModel
  */
  public static AlipayEbppPdeductSignValidateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppPdeductSignValidateModel.class);
  }

 /**
  * Convert an instance of AlipayEbppPdeductSignValidateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

