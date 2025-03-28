/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2025-03-05
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
 * AlipaySecurityRiskCustomerriskSendModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipaySecurityRiskCustomerriskSendModel {
  public static final String SERIALIZED_NAME_BANK_CARD_NO = "bank_card_no";
  @SerializedName(SERIALIZED_NAME_BANK_CARD_NO)
  private String bankCardNo;

  public static final String SERIALIZED_NAME_BUSINESS_LICENSE_NO = "business_license_no";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LICENSE_NO)
  private String businessLicenseNo;

  public static final String SERIALIZED_NAME_CERT_NO = "cert_no";
  @SerializedName(SERIALIZED_NAME_CERT_NO)
  private String certNo;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_MERCH_NAME = "merch_name";
  @SerializedName(SERIALIZED_NAME_MERCH_NAME)
  private String merchName;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_MOBILE_IP = "mobile_ip";
  @SerializedName(SERIALIZED_NAME_MOBILE_IP)
  private String mobileIp;

  public static final String SERIALIZED_NAME_ORDER_IP = "order_ip";
  @SerializedName(SERIALIZED_NAME_ORDER_IP)
  private String orderIp;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_PLAT_ACCOUNT = "plat_account";
  @SerializedName(SERIALIZED_NAME_PLAT_ACCOUNT)
  private String platAccount;

  public static final String SERIALIZED_NAME_PROCESS_CODE = "process_code";
  @SerializedName(SERIALIZED_NAME_PROCESS_CODE)
  private String processCode;

  public static final String SERIALIZED_NAME_SMID = "smid";
  @SerializedName(SERIALIZED_NAME_SMID)
  private String smid;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AlipaySecurityRiskCustomerriskSendModel() { 
  }

  public AlipaySecurityRiskCustomerriskSendModel bankCardNo(String bankCardNo) {
    
    this.bankCardNo = bankCardNo;
    return this;
  }

   /**
   * 交易对应的银行卡的卡号（支付宝直连和间连合作伙伴均可回传此参数）
   * @return bankCardNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "421234234234234000", value = "交易对应的银行卡的卡号（支付宝直连和间连合作伙伴均可回传此参数）")

  public String getBankCardNo() {
    return bankCardNo;
  }


  public void setBankCardNo(String bankCardNo) {
    this.bankCardNo = bankCardNo;
  }


  public AlipaySecurityRiskCustomerriskSendModel businessLicenseNo(String businessLicenseNo) {
    
    this.businessLicenseNo = businessLicenseNo;
    return this;
  }

   /**
   * 该账号对应的营业执照号码（支付宝直连和间连合作伙伴均可回传此参数）
   * @return businessLicenseNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "34xggdf345", value = "该账号对应的营业执照号码（支付宝直连和间连合作伙伴均可回传此参数）")

  public String getBusinessLicenseNo() {
    return businessLicenseNo;
  }


  public void setBusinessLicenseNo(String businessLicenseNo) {
    this.businessLicenseNo = businessLicenseNo;
  }


  public AlipaySecurityRiskCustomerriskSendModel certNo(String certNo) {
    
    this.certNo = certNo;
    return this;
  }

   /**
   * 该用户对应的身份证号码（支付宝直连和间连合作伙伴均可回传此参数）
   * @return certNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "659004198009128344", value = "该用户对应的身份证号码（支付宝直连和间连合作伙伴均可回传此参数）")

  public String getCertNo() {
    return certNo;
  }


  public void setCertNo(String certNo) {
    this.certNo = certNo;
  }


  public AlipaySecurityRiskCustomerriskSendModel emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * 账户注册时填写的邮箱地址(适用于支付宝直连商户回传此信息)
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345@abcd.com", value = "账户注册时填写的邮箱地址(适用于支付宝直连商户回传此信息)")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public AlipaySecurityRiskCustomerriskSendModel externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * 适用于间连业务场景下，商户在银行被分配的ID（适用于支付宝间连合作伙伴回传此信息）
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088011993690428", value = "适用于间连业务场景下，商户在银行被分配的ID（适用于支付宝间连合作伙伴回传此信息）")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public AlipaySecurityRiskCustomerriskSendModel merchName(String merchName) {
    
    this.merchName = merchName;
    return this;
  }

   /**
   * 该笔风险交易购买的具体商品名称（适用于支付宝直连商户回传此信息）
   * @return merchName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "游戏道具", value = "该笔风险交易购买的具体商品名称（适用于支付宝直连商户回传此信息）")

  public String getMerchName() {
    return merchName;
  }


  public void setMerchName(String merchName) {
    this.merchName = merchName;
  }


  public AlipaySecurityRiskCustomerriskSendModel mobile(String mobile) {
    
    this.mobile = mobile;
    return this;
  }

   /**
   * 手机（支付宝直连和间连合作伙伴均可回传此参数）
   * @return mobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1359892324", value = "手机（支付宝直连和间连合作伙伴均可回传此参数）")

  public String getMobile() {
    return mobile;
  }


  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public AlipaySecurityRiskCustomerriskSendModel mobileIp(String mobileIp) {
    
    this.mobileIp = mobileIp;
    return this;
  }

   /**
   * 该账号登录合作伙伴平台时的IP地址（适用于支付宝直连商户回传此信息）
   * @return mobileIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.253.231.22", value = "该账号登录合作伙伴平台时的IP地址（适用于支付宝直连商户回传此信息）")

  public String getMobileIp() {
    return mobileIp;
  }


  public void setMobileIp(String mobileIp) {
    this.mobileIp = mobileIp;
  }


  public AlipaySecurityRiskCustomerriskSendModel orderIp(String orderIp) {
    
    this.orderIp = orderIp;
    return this;
  }

   /**
   * 该账户在商户平台下单时的MAC地址或IP地址（适用于支付宝直连商户回传此信息）
   * @return orderIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-01010000-10111010", value = "该账户在商户平台下单时的MAC地址或IP地址（适用于支付宝直连商户回传此信息）")

  public String getOrderIp() {
    return orderIp;
  }


  public void setOrderIp(String orderIp) {
    this.orderIp = orderIp;
  }


  public AlipaySecurityRiskCustomerriskSendModel pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 适用于直连商户场景下的支付宝合作伙伴ID（适用于支付宝直连合作伙伴回传此信息）
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123456789012", value = "适用于直连商户场景下的支付宝合作伙伴ID（适用于支付宝直连合作伙伴回传此信息）")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }


  public AlipaySecurityRiskCustomerriskSendModel platAccount(String platAccount) {
    
    this.platAccount = platAccount;
    return this;
  }

   /**
   * 指第三方在商户平台注册成功后，平台给予的账户号（适用于支付宝直连商户回传此信息）
   * @return platAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abc123", value = "指第三方在商户平台注册成功后，平台给予的账户号（适用于支付宝直连商户回传此信息）")

  public String getPlatAccount() {
    return platAccount;
  }


  public void setPlatAccount(String platAccount) {
    this.platAccount = platAccount;
  }


  public AlipaySecurityRiskCustomerriskSendModel processCode(String processCode) {
    
    this.processCode = processCode;
    return this;
  }

   /**
   * 直连场景下，商户对该账户采取的措施：  多种处理结果可调用多次，每次回传一种处理结果。  （01：暂停发货；  02：延迟结算；  03：关停账户；  04：暂停发货+关停账户；  05：延迟结算+关停账户；  06：其他；  07：平台进行退款退订；  08：平台跟用户沟通后，用户撤诉。  间连场景下，商户回传处理结果：  对商户的处理情况：  01：已延迟结算，02：关停商户，99：其他  多重处理结果可调用多次，每次回传一种处理结果
   * @return processCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "直连场景下，商户对该账户采取的措施：  多种处理结果可调用多次，每次回传一种处理结果。  （01：暂停发货；  02：延迟结算；  03：关停账户；  04：暂停发货+关停账户；  05：延迟结算+关停账户；  06：其他；  07：平台进行退款退订；  08：平台跟用户沟通后，用户撤诉。  间连场景下，商户回传处理结果：  对商户的处理情况：  01：已延迟结算，02：关停商户，99：其他  多重处理结果可调用多次，每次回传一种处理结果")

  public String getProcessCode() {
    return processCode;
  }


  public void setProcessCode(String processCode) {
    this.processCode = processCode;
  }


  public AlipaySecurityRiskCustomerriskSendModel smid(String smid) {
    
    this.smid = smid;
    return this;
  }

   /**
   * 指间连交易场景下商家被支付宝分配的ID（适用于支付宝间连合作伙伴回传此信息）
   * @return smid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "17022079254", value = "指间连交易场景下商家被支付宝分配的ID（适用于支付宝间连合作伙伴回传此信息）")

  public String getSmid() {
    return smid;
  }


  public void setSmid(String smid) {
    this.smid = smid;
  }


  public AlipaySecurityRiskCustomerriskSendModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝推送的风险消息中的交易号（支付宝直连和间连合作伙伴均需回传此参数）
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017113021001004640000000000", value = "支付宝推送的风险消息中的交易号（支付宝直连和间连合作伙伴均需回传此参数）")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
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
   * @return the AlipaySecurityRiskCustomerriskSendModel instance itself
   */
  public AlipaySecurityRiskCustomerriskSendModel putAdditionalProperty(String key, Object value) {
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
    AlipaySecurityRiskCustomerriskSendModel alipaySecurityRiskCustomerriskSendModel = (AlipaySecurityRiskCustomerriskSendModel) o;
    return Objects.equals(this.bankCardNo, alipaySecurityRiskCustomerriskSendModel.bankCardNo) &&
        Objects.equals(this.businessLicenseNo, alipaySecurityRiskCustomerriskSendModel.businessLicenseNo) &&
        Objects.equals(this.certNo, alipaySecurityRiskCustomerriskSendModel.certNo) &&
        Objects.equals(this.emailAddress, alipaySecurityRiskCustomerriskSendModel.emailAddress) &&
        Objects.equals(this.externalId, alipaySecurityRiskCustomerriskSendModel.externalId) &&
        Objects.equals(this.merchName, alipaySecurityRiskCustomerriskSendModel.merchName) &&
        Objects.equals(this.mobile, alipaySecurityRiskCustomerriskSendModel.mobile) &&
        Objects.equals(this.mobileIp, alipaySecurityRiskCustomerriskSendModel.mobileIp) &&
        Objects.equals(this.orderIp, alipaySecurityRiskCustomerriskSendModel.orderIp) &&
        Objects.equals(this.pid, alipaySecurityRiskCustomerriskSendModel.pid) &&
        Objects.equals(this.platAccount, alipaySecurityRiskCustomerriskSendModel.platAccount) &&
        Objects.equals(this.processCode, alipaySecurityRiskCustomerriskSendModel.processCode) &&
        Objects.equals(this.smid, alipaySecurityRiskCustomerriskSendModel.smid) &&
        Objects.equals(this.tradeNo, alipaySecurityRiskCustomerriskSendModel.tradeNo)&&
        Objects.equals(this.additionalProperties, alipaySecurityRiskCustomerriskSendModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankCardNo, businessLicenseNo, certNo, emailAddress, externalId, merchName, mobile, mobileIp, orderIp, pid, platAccount, processCode, smid, tradeNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipaySecurityRiskCustomerriskSendModel {\n");
    sb.append("    bankCardNo: ").append(toIndentedString(bankCardNo)).append("\n");
    sb.append("    businessLicenseNo: ").append(toIndentedString(businessLicenseNo)).append("\n");
    sb.append("    certNo: ").append(toIndentedString(certNo)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    merchName: ").append(toIndentedString(merchName)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    mobileIp: ").append(toIndentedString(mobileIp)).append("\n");
    sb.append("    orderIp: ").append(toIndentedString(orderIp)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    platAccount: ").append(toIndentedString(platAccount)).append("\n");
    sb.append("    processCode: ").append(toIndentedString(processCode)).append("\n");
    sb.append("    smid: ").append(toIndentedString(smid)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
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
    openapiFields.add("bank_card_no");
    openapiFields.add("business_license_no");
    openapiFields.add("cert_no");
    openapiFields.add("email_address");
    openapiFields.add("external_id");
    openapiFields.add("merch_name");
    openapiFields.add("mobile");
    openapiFields.add("mobile_ip");
    openapiFields.add("order_ip");
    openapiFields.add("pid");
    openapiFields.add("plat_account");
    openapiFields.add("process_code");
    openapiFields.add("smid");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipaySecurityRiskCustomerriskSendModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipaySecurityRiskCustomerriskSendModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipaySecurityRiskCustomerriskSendModel is not found in the empty JSON string", AlipaySecurityRiskCustomerriskSendModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("bank_card_no") != null && !jsonObj.get("bank_card_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_card_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_card_no").toString()));
      }
      if (jsonObj.get("business_license_no") != null && !jsonObj.get("business_license_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_license_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_license_no").toString()));
      }
      if (jsonObj.get("cert_no") != null && !jsonObj.get("cert_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_no").toString()));
      }
      if (jsonObj.get("email_address") != null && !jsonObj.get("email_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_address").toString()));
      }
      if (jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if (jsonObj.get("merch_name") != null && !jsonObj.get("merch_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merch_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merch_name").toString()));
      }
      if (jsonObj.get("mobile") != null && !jsonObj.get("mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile").toString()));
      }
      if (jsonObj.get("mobile_ip") != null && !jsonObj.get("mobile_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile_ip").toString()));
      }
      if (jsonObj.get("order_ip") != null && !jsonObj.get("order_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_ip").toString()));
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
      if (jsonObj.get("plat_account") != null && !jsonObj.get("plat_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plat_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plat_account").toString()));
      }
      if (jsonObj.get("process_code") != null && !jsonObj.get("process_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `process_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("process_code").toString()));
      }
      if (jsonObj.get("smid") != null && !jsonObj.get("smid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `smid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("smid").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipaySecurityRiskCustomerriskSendModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipaySecurityRiskCustomerriskSendModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipaySecurityRiskCustomerriskSendModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipaySecurityRiskCustomerriskSendModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipaySecurityRiskCustomerriskSendModel>() {
           @Override
           public void write(JsonWriter out, AlipaySecurityRiskCustomerriskSendModel value) throws IOException {
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
           public AlipaySecurityRiskCustomerriskSendModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipaySecurityRiskCustomerriskSendModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipaySecurityRiskCustomerriskSendModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipaySecurityRiskCustomerriskSendModel
  * @throws IOException if the JSON string is invalid with respect to AlipaySecurityRiskCustomerriskSendModel
  */
  public static AlipaySecurityRiskCustomerriskSendModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipaySecurityRiskCustomerriskSendModel.class);
  }

 /**
  * Convert an instance of AlipaySecurityRiskCustomerriskSendModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

