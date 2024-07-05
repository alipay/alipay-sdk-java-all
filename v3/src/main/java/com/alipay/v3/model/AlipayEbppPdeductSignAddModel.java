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
 * AlipayEbppPdeductSignAddModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppPdeductSignAddModel {
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

  public static final String SERIALIZED_NAME_DEDUCT_PROD_CODE = "deduct_prod_code";
  @SerializedName(SERIALIZED_NAME_DEDUCT_PROD_CODE)
  private String deductProdCode;

  public static final String SERIALIZED_NAME_DEDUCT_TYPE = "deduct_type";
  @SerializedName(SERIALIZED_NAME_DEDUCT_TYPE)
  private String deductType;

  public static final String SERIALIZED_NAME_EXT_USER_INFO = "ext_user_info";
  @SerializedName(SERIALIZED_NAME_EXT_USER_INFO)
  private String extUserInfo;

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

  public static final String SERIALIZED_NAME_PAY_PASSWORD_TOKEN = "pay_password_token";
  @SerializedName(SERIALIZED_NAME_PAY_PASSWORD_TOKEN)
  private String payPasswordToken;

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

  public AlipayEbppPdeductSignAddModel() { 
  }

  public AlipayEbppPdeductSignAddModel agentChannel(String agentChannel) {
    
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


  public AlipayEbppPdeductSignAddModel agentCode(String agentCode) {
    
    this.agentCode = agentCode;
    return this;
  }

   /**
   * 从服务窗发起则为publicId的值
   * @return agentCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "从服务窗发起则为publicId的值")

  public String getAgentCode() {
    return agentCode;
  }


  public void setAgentCode(String agentCode) {
    this.agentCode = agentCode;
  }


  public AlipayEbppPdeductSignAddModel billKey(String billKey) {
    
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


  public AlipayEbppPdeductSignAddModel bizType(String bizType) {
    
    this.bizType = bizType;
    return this;
  }

   /**
   * 业务类型。枚举支持： *JF：公共事业缴纳。 *WUYE：物业缴费。 *HK：信用卡还款。 *TX：通讯缴费。 *IND：保险缴费。
   * @return bizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JF", value = "业务类型。枚举支持： *JF：公共事业缴纳。 *WUYE：物业缴费。 *HK：信用卡还款。 *TX：通讯缴费。 *IND：保险缴费。")

  public String getBizType() {
    return bizType;
  }


  public void setBizType(String bizType) {
    this.bizType = bizType;
  }


  public AlipayEbppPdeductSignAddModel chargeInst(String chargeInst) {
    
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


  public AlipayEbppPdeductSignAddModel deductProdCode(String deductProdCode) {
    
    this.deductProdCode = deductProdCode;
    return this;
  }

   /**
   * 代扣产品码。 缴费业务场景中，传入INST_DIRECT_DEDUCT。保险业务场景中, 传入INSURANCE_MERCHANT_DEDUCT。
   * @return deductProdCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INSURANCE_MERCHANT_DEDUCT", value = "代扣产品码。 缴费业务场景中，传入INST_DIRECT_DEDUCT。保险业务场景中, 传入INSURANCE_MERCHANT_DEDUCT。")

  public String getDeductProdCode() {
    return deductProdCode;
  }


  public void setDeductProdCode(String deductProdCode) {
    this.deductProdCode = deductProdCode;
  }


  public AlipayEbppPdeductSignAddModel deductType(String deductType) {
    
    this.deductType = deductType;
    return this;
  }

   /**
   * 签约类型可为空
   * @return deductType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "direct_sign_deduct", value = "签约类型可为空")

  public String getDeductType() {
    return deductType;
  }


  public void setDeductType(String deductType) {
    this.deductType = deductType;
  }


  public AlipayEbppPdeductSignAddModel extUserInfo(String extUserInfo) {
    
    this.extUserInfo = extUserInfo;
    return this;
  }

   /**
   * 外部用户实名认证相关信息, 用于做签约时的实名校验。   注：     name: 姓名  cert_type: 身份证：IDENTITY_CARD、护照：PASSPORT、军官证：OFFICER_CARD、士兵证：SOLDIER_CARD、户口本：HOKOU等  cert_no: 证件号码  need_check_info取值 T/F，只有为T时才做强制校验。  mobile:手机号，目前暂不使用此字段做校验  min_age: 允许的最小买家年龄,min_age为整数，必须大于等于0.
   * @return extUserInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"name\":\"张三\",\"cert_type\":\"IDENTITY_CARD\",\"cert_no\":\"362334768769238881\",\"need_check_info\":\"F\",\"min_age\":\"18\",\"mobile\":\"\"}", value = "外部用户实名认证相关信息, 用于做签约时的实名校验。   注：     name: 姓名  cert_type: 身份证：IDENTITY_CARD、护照：PASSPORT、军官证：OFFICER_CARD、士兵证：SOLDIER_CARD、户口本：HOKOU等  cert_no: 证件号码  need_check_info取值 T/F，只有为T时才做强制校验。  mobile:手机号，目前暂不使用此字段做校验  min_age: 允许的最小买家年龄,min_age为整数，必须大于等于0.")

  public String getExtUserInfo() {
    return extUserInfo;
  }


  public void setExtUserInfo(String extUserInfo) {
    this.extUserInfo = extUserInfo;
  }


  public AlipayEbppPdeductSignAddModel extendField(String extendField) {
    
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


  public AlipayEbppPdeductSignAddModel notifyConfig(String notifyConfig) {
    
    this.notifyConfig = notifyConfig;
    return this;
  }

   /**
   * 通知方式设置，可为空
   * @return notifyConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "null", value = "通知方式设置，可为空")

  public String getNotifyConfig() {
    return notifyConfig;
  }


  public void setNotifyConfig(String notifyConfig) {
    this.notifyConfig = notifyConfig;
  }


  public AlipayEbppPdeductSignAddModel openId(String openId) {
    
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


  public AlipayEbppPdeductSignAddModel outAgreementId(String outAgreementId) {
    
    this.outAgreementId = outAgreementId;
    return this;
  }

   /**
   * 外部产生的协议ID
   * @return outAgreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "外部产生的协议ID")

  public String getOutAgreementId() {
    return outAgreementId;
  }


  public void setOutAgreementId(String outAgreementId) {
    this.outAgreementId = outAgreementId;
  }


  public AlipayEbppPdeductSignAddModel ownerName(String ownerName) {
    
    this.ownerName = ownerName;
    return this;
  }

   /**
   * 户名，户主真实姓名
   * @return ownerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "王海龙", value = "户名，户主真实姓名")

  public String getOwnerName() {
    return ownerName;
  }


  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }


  public AlipayEbppPdeductSignAddModel payConfig(String payConfig) {
    
    this.payConfig = payConfig;
    return this;
  }

   /**
   * 支付工具设置，目前可为空
   * @return payConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "null", value = "支付工具设置，目前可为空")

  public String getPayConfig() {
    return payConfig;
  }


  public void setPayConfig(String payConfig) {
    this.payConfig = payConfig;
  }


  public AlipayEbppPdeductSignAddModel payPasswordToken(String payPasswordToken) {
    
    this.payPasswordToken = payPasswordToken;
    return this;
  }

   /**
   * 支付密码鉴权token，需要用户首先处于登陆态，然后访问https://ebppprod.alipay.com/deduct/enterMobileicPayPassword.htm?cb&#x3D;自己指定的回跳连接地址，访问页面后会进到独立密码校验页，用户输入密码校验成功后，会生成token回调到指定的回跳地址，如果设置cb&#x3D;www.alipay.com则最后回调的内容是www.alipay.com?token&#x3D;312314ADFDSFAS，然后签约时直接取得地址后token的值即可。
   * @return payPasswordToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11505a6f41688644a4b85f9bf80ef071", value = "支付密码鉴权token，需要用户首先处于登陆态，然后访问https://ebppprod.alipay.com/deduct/enterMobileicPayPassword.htm?cb=自己指定的回跳连接地址，访问页面后会进到独立密码校验页，用户输入密码校验成功后，会生成token回调到指定的回跳地址，如果设置cb=www.alipay.com则最后回调的内容是www.alipay.com?token=312314ADFDSFAS，然后签约时直接取得地址后token的值即可。")

  public String getPayPasswordToken() {
    return payPasswordToken;
  }


  public void setPayPasswordToken(String payPasswordToken) {
    this.payPasswordToken = payPasswordToken;
  }


  public AlipayEbppPdeductSignAddModel pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 商户id，商户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102118849556", value = "商户id，商户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }


  public AlipayEbppPdeductSignAddModel signExpireDate(String signExpireDate) {
    
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


  public AlipayEbppPdeductSignAddModel subBizType(String subBizType) {
    
    this.subBizType = subBizType;
    return this;
  }

   /**
   * 业务子类型。业务子类型是业务类型的下一级概念。枚举支持： *WATER：缴水费。 *ELECTRIC：缴电费。 *GAS：缴燃气费。 *COMMUN：缴固话宽带费。 *CATV：缴有线电视费。 *TRAFFIC：缴交通罚款。 *WUYE：缴物业费。 *RC：定期还车贷代扣。 *RH：定期还房贷代扣。 *RR：定期还房租代扣。 *RN：定期还网贷代扣。 *CZ：手机充值代扣。 *CAR：车险。 *LIFE：寿险。 *HEALTH：健康险。 例如：WATER表示JF下面的水费。
   * @return subBizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ELECTRIC", value = "业务子类型。业务子类型是业务类型的下一级概念。枚举支持： *WATER：缴水费。 *ELECTRIC：缴电费。 *GAS：缴燃气费。 *COMMUN：缴固话宽带费。 *CATV：缴有线电视费。 *TRAFFIC：缴交通罚款。 *WUYE：缴物业费。 *RC：定期还车贷代扣。 *RH：定期还房贷代扣。 *RR：定期还房租代扣。 *RN：定期还网贷代扣。 *CZ：手机充值代扣。 *CAR：车险。 *LIFE：寿险。 *HEALTH：健康险。 例如：WATER表示JF下面的水费。")

  public String getSubBizType() {
    return subBizType;
  }


  public void setSubBizType(String subBizType) {
    this.subBizType = subBizType;
  }


  public AlipayEbppPdeductSignAddModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088111133334134", value = "用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。")

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
   * @return the AlipayEbppPdeductSignAddModel instance itself
   */
  public AlipayEbppPdeductSignAddModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppPdeductSignAddModel alipayEbppPdeductSignAddModel = (AlipayEbppPdeductSignAddModel) o;
    return Objects.equals(this.agentChannel, alipayEbppPdeductSignAddModel.agentChannel) &&
        Objects.equals(this.agentCode, alipayEbppPdeductSignAddModel.agentCode) &&
        Objects.equals(this.billKey, alipayEbppPdeductSignAddModel.billKey) &&
        Objects.equals(this.bizType, alipayEbppPdeductSignAddModel.bizType) &&
        Objects.equals(this.chargeInst, alipayEbppPdeductSignAddModel.chargeInst) &&
        Objects.equals(this.deductProdCode, alipayEbppPdeductSignAddModel.deductProdCode) &&
        Objects.equals(this.deductType, alipayEbppPdeductSignAddModel.deductType) &&
        Objects.equals(this.extUserInfo, alipayEbppPdeductSignAddModel.extUserInfo) &&
        Objects.equals(this.extendField, alipayEbppPdeductSignAddModel.extendField) &&
        Objects.equals(this.notifyConfig, alipayEbppPdeductSignAddModel.notifyConfig) &&
        Objects.equals(this.openId, alipayEbppPdeductSignAddModel.openId) &&
        Objects.equals(this.outAgreementId, alipayEbppPdeductSignAddModel.outAgreementId) &&
        Objects.equals(this.ownerName, alipayEbppPdeductSignAddModel.ownerName) &&
        Objects.equals(this.payConfig, alipayEbppPdeductSignAddModel.payConfig) &&
        Objects.equals(this.payPasswordToken, alipayEbppPdeductSignAddModel.payPasswordToken) &&
        Objects.equals(this.pid, alipayEbppPdeductSignAddModel.pid) &&
        Objects.equals(this.signExpireDate, alipayEbppPdeductSignAddModel.signExpireDate) &&
        Objects.equals(this.subBizType, alipayEbppPdeductSignAddModel.subBizType) &&
        Objects.equals(this.userId, alipayEbppPdeductSignAddModel.userId)&&
        Objects.equals(this.additionalProperties, alipayEbppPdeductSignAddModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentChannel, agentCode, billKey, bizType, chargeInst, deductProdCode, deductType, extUserInfo, extendField, notifyConfig, openId, outAgreementId, ownerName, payConfig, payPasswordToken, pid, signExpireDate, subBizType, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppPdeductSignAddModel {\n");
    sb.append("    agentChannel: ").append(toIndentedString(agentChannel)).append("\n");
    sb.append("    agentCode: ").append(toIndentedString(agentCode)).append("\n");
    sb.append("    billKey: ").append(toIndentedString(billKey)).append("\n");
    sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
    sb.append("    chargeInst: ").append(toIndentedString(chargeInst)).append("\n");
    sb.append("    deductProdCode: ").append(toIndentedString(deductProdCode)).append("\n");
    sb.append("    deductType: ").append(toIndentedString(deductType)).append("\n");
    sb.append("    extUserInfo: ").append(toIndentedString(extUserInfo)).append("\n");
    sb.append("    extendField: ").append(toIndentedString(extendField)).append("\n");
    sb.append("    notifyConfig: ").append(toIndentedString(notifyConfig)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    outAgreementId: ").append(toIndentedString(outAgreementId)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    payConfig: ").append(toIndentedString(payConfig)).append("\n");
    sb.append("    payPasswordToken: ").append(toIndentedString(payPasswordToken)).append("\n");
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
    openapiFields.add("deduct_prod_code");
    openapiFields.add("deduct_type");
    openapiFields.add("ext_user_info");
    openapiFields.add("extend_field");
    openapiFields.add("notify_config");
    openapiFields.add("open_id");
    openapiFields.add("out_agreement_id");
    openapiFields.add("owner_name");
    openapiFields.add("pay_config");
    openapiFields.add("pay_password_token");
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
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppPdeductSignAddModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppPdeductSignAddModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppPdeductSignAddModel is not found in the empty JSON string", AlipayEbppPdeductSignAddModel.openapiRequiredFields.toString()));
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
      if (jsonObj.get("deduct_prod_code") != null && !jsonObj.get("deduct_prod_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deduct_prod_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deduct_prod_code").toString()));
      }
      if (jsonObj.get("deduct_type") != null && !jsonObj.get("deduct_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deduct_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deduct_type").toString()));
      }
      if (jsonObj.get("ext_user_info") != null && !jsonObj.get("ext_user_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_user_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_user_info").toString()));
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
      if (jsonObj.get("pay_password_token") != null && !jsonObj.get("pay_password_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_password_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_password_token").toString()));
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
       if (!AlipayEbppPdeductSignAddModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppPdeductSignAddModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppPdeductSignAddModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppPdeductSignAddModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppPdeductSignAddModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppPdeductSignAddModel value) throws IOException {
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
           public AlipayEbppPdeductSignAddModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppPdeductSignAddModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppPdeductSignAddModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppPdeductSignAddModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppPdeductSignAddModel
  */
  public static AlipayEbppPdeductSignAddModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppPdeductSignAddModel.class);
  }

 /**
  * Convert an instance of AlipayEbppPdeductSignAddModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

