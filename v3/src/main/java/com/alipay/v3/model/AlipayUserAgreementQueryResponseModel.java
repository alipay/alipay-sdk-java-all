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
 * AlipayUserAgreementQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayUserAgreementQueryResponseModel {
  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_ALIPAY_LOGON_ID = "alipay_logon_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_LOGON_ID)
  private String alipayLogonId;

  public static final String SERIALIZED_NAME_CREDIT_AUTH_MODE = "credit_auth_mode";
  @SerializedName(SERIALIZED_NAME_CREDIT_AUTH_MODE)
  private String creditAuthMode;

  public static final String SERIALIZED_NAME_DEVICE_ID = "device_id";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

  public static final String SERIALIZED_NAME_EXTERNAL_AGREEMENT_NO = "external_agreement_no";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_AGREEMENT_NO)
  private String externalAgreementNo;

  public static final String SERIALIZED_NAME_EXTERNAL_LOGON_ID = "external_logon_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_LOGON_ID)
  private String externalLogonId;

  public static final String SERIALIZED_NAME_INVALID_TIME = "invalid_time";
  @SerializedName(SERIALIZED_NAME_INVALID_TIME)
  private String invalidTime;

  public static final String SERIALIZED_NAME_LAST_DEDUCT_TIME = "last_deduct_time";
  @SerializedName(SERIALIZED_NAME_LAST_DEDUCT_TIME)
  private String lastDeductTime;

  public static final String SERIALIZED_NAME_NEXT_DEDUCT_TIME = "next_deduct_time";
  @SerializedName(SERIALIZED_NAME_NEXT_DEDUCT_TIME)
  private String nextDeductTime;

  public static final String SERIALIZED_NAME_PERSONAL_PRODUCT_CODE = "personal_product_code";
  @SerializedName(SERIALIZED_NAME_PERSONAL_PRODUCT_CODE)
  private String personalProductCode;

  public static final String SERIALIZED_NAME_PRICIPAL_TYPE = "pricipal_type";
  @SerializedName(SERIALIZED_NAME_PRICIPAL_TYPE)
  private String pricipalType;

  public static final String SERIALIZED_NAME_PRINCIPAL_ID = "principal_id";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_ID)
  private String principalId;

  public static final String SERIALIZED_NAME_PRINCIPAL_OPEN_ID = "principal_open_id";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_OPEN_ID)
  private String principalOpenId;

  public static final String SERIALIZED_NAME_SIGN_SCENE = "sign_scene";
  @SerializedName(SERIALIZED_NAME_SIGN_SCENE)
  private String signScene;

  public static final String SERIALIZED_NAME_SIGN_TIME = "sign_time";
  @SerializedName(SERIALIZED_NAME_SIGN_TIME)
  private String signTime;

  public static final String SERIALIZED_NAME_SINGLE_QUOTA = "single_quota";
  @SerializedName(SERIALIZED_NAME_SINGLE_QUOTA)
  private String singleQuota;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_THIRD_PARTY_TYPE = "third_party_type";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_TYPE)
  private String thirdPartyType;

  public static final String SERIALIZED_NAME_VALID_TIME = "valid_time";
  @SerializedName(SERIALIZED_NAME_VALID_TIME)
  private String validTime;

  public static final String SERIALIZED_NAME_ZM_OPEN_ID = "zm_open_id";
  @SerializedName(SERIALIZED_NAME_ZM_OPEN_ID)
  private String zmOpenId;

  public AlipayUserAgreementQueryResponseModel() { 
  }

  public AlipayUserAgreementQueryResponseModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 用户签约成功后的协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170322450983769228", value = "用户签约成功后的协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayUserAgreementQueryResponseModel alipayLogonId(String alipayLogonId) {
    
    this.alipayLogonId = alipayLogonId;
    return this;
  }

   /**
   * 返回脱敏的支付宝账号
   * @return alipayLogonId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test***ali@alipay.net", value = "返回脱敏的支付宝账号")

  public String getAlipayLogonId() {
    return alipayLogonId;
  }


  public void setAlipayLogonId(String alipayLogonId) {
    this.alipayLogonId = alipayLogonId;
  }


  public AlipayUserAgreementQueryResponseModel creditAuthMode(String creditAuthMode) {
    
    this.creditAuthMode = creditAuthMode;
    return this;
  }

   /**
   * 授信模式，目前只在花芝代扣（即花芝go）协议时才会返回
   * @return creditAuthMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEDUCT_HUAZHI", value = "授信模式，目前只在花芝代扣（即花芝go）协议时才会返回")

  public String getCreditAuthMode() {
    return creditAuthMode;
  }


  public void setCreditAuthMode(String creditAuthMode) {
    this.creditAuthMode = creditAuthMode;
  }


  public AlipayUserAgreementQueryResponseModel deviceId(String deviceId) {
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * 设备Id
   * @return deviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RSED235F875932", value = "设备Id")

  public String getDeviceId() {
    return deviceId;
  }


  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  public AlipayUserAgreementQueryResponseModel externalAgreementNo(String externalAgreementNo) {
    
    this.externalAgreementNo = externalAgreementNo;
    return this;
  }

   /**
   * 代扣协议中标示用户的唯一签约号(确保在商户系统中唯一)。当入参中传了此参数时返回。
   * @return externalAgreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test", value = "代扣协议中标示用户的唯一签约号(确保在商户系统中唯一)。当入参中传了此参数时返回。")

  public String getExternalAgreementNo() {
    return externalAgreementNo;
  }


  public void setExternalAgreementNo(String externalAgreementNo) {
    this.externalAgreementNo = externalAgreementNo;
  }


  public AlipayUserAgreementQueryResponseModel externalLogonId(String externalLogonId) {
    
    this.externalLogonId = externalLogonId;
    return this;
  }

   /**
   * 外部登录Id。当入参中传了此参数时返回。
   * @return externalLogonId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101118392209", value = "外部登录Id。当入参中传了此参数时返回。")

  public String getExternalLogonId() {
    return externalLogonId;
  }


  public void setExternalLogonId(String externalLogonId) {
    this.externalLogonId = externalLogonId;
  }


  public AlipayUserAgreementQueryResponseModel invalidTime(String invalidTime) {
    
    this.invalidTime = invalidTime;
    return this;
  }

   /**
   * 协议失效时间，格式为 yyyy-MM-dd HH:mm:ss。
   * @return invalidTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2117-05-24 00:00:00", value = "协议失效时间，格式为 yyyy-MM-dd HH:mm:ss。")

  public String getInvalidTime() {
    return invalidTime;
  }


  public void setInvalidTime(String invalidTime) {
    this.invalidTime = invalidTime;
  }


  public AlipayUserAgreementQueryResponseModel lastDeductTime(String lastDeductTime) {
    
    this.lastDeductTime = lastDeductTime;
    return this;
  }

   /**
   * 周期扣协议，上次扣款成功时间
   * @return lastDeductTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-05-15", value = "周期扣协议，上次扣款成功时间")

  public String getLastDeductTime() {
    return lastDeductTime;
  }


  public void setLastDeductTime(String lastDeductTime) {
    this.lastDeductTime = lastDeductTime;
  }


  public AlipayUserAgreementQueryResponseModel nextDeductTime(String nextDeductTime) {
    
    this.nextDeductTime = nextDeductTime;
    return this;
  }

   /**
   * 周期扣协议，预计下次扣款时间
   * @return nextDeductTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-06-15", value = "周期扣协议，预计下次扣款时间")

  public String getNextDeductTime() {
    return nextDeductTime;
  }


  public void setNextDeductTime(String nextDeductTime) {
    this.nextDeductTime = nextDeductTime;
  }


  public AlipayUserAgreementQueryResponseModel personalProductCode(String personalProductCode) {
    
    this.personalProductCode = personalProductCode;
    return this;
  }

   /**
   * 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码。
   * @return personalProductCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GENERAL_WITHHOLDING_P", value = "协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码。")

  public String getPersonalProductCode() {
    return personalProductCode;
  }


  public void setPersonalProductCode(String personalProductCode) {
    this.personalProductCode = personalProductCode;
  }


  public AlipayUserAgreementQueryResponseModel pricipalType(String pricipalType) {
    
    this.pricipalType = pricipalType;
    return this;
  }

   /**
   * 签约主体类型。
   * @return pricipalType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CARD", value = "签约主体类型。")

  public String getPricipalType() {
    return pricipalType;
  }


  public void setPricipalType(String pricipalType) {
    this.pricipalType = pricipalType;
  }


  public AlipayUserAgreementQueryResponseModel principalId(String principalId) {
    
    this.principalId = principalId;
    return this;
  }

   /**
   * 签约主体标识。 当principal_type为CARD 时，该字段为支付宝用户号;
   * @return principalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101122675263", value = "签约主体标识。 当principal_type为CARD 时，该字段为支付宝用户号;")

  public String getPrincipalId() {
    return principalId;
  }


  public void setPrincipalId(String principalId) {
    this.principalId = principalId;
  }


  public AlipayUserAgreementQueryResponseModel principalOpenId(String principalOpenId) {
    
    this.principalOpenId = principalOpenId;
    return this;
  }

   /**
   * 签约主体标识。 当principal_type为CARD 时，该字段为支付宝用户号;
   * @return principalOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "签约主体标识。 当principal_type为CARD 时，该字段为支付宝用户号;")

  public String getPrincipalOpenId() {
    return principalOpenId;
  }


  public void setPrincipalOpenId(String principalOpenId) {
    this.principalOpenId = principalOpenId;
  }


  public AlipayUserAgreementQueryResponseModel signScene(String signScene) {
    
    this.signScene = signScene;
    return this;
  }

   /**
   * 签约协议的场景。
   * @return signScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INDUSTRY|CARRENTAL", value = "签约协议的场景。")

  public String getSignScene() {
    return signScene;
  }


  public void setSignScene(String signScene) {
    this.signScene = signScene;
  }


  public AlipayUserAgreementQueryResponseModel signTime(String signTime) {
    
    this.signTime = signTime;
    return this;
  }

   /**
   * 协议签约时间，格式为 yyyy-MM-dd HH:mm:ss。
   * @return signTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-05-24 15:00:40", value = "协议签约时间，格式为 yyyy-MM-dd HH:mm:ss。")

  public String getSignTime() {
    return signTime;
  }


  public void setSignTime(String signTime) {
    this.signTime = signTime;
  }


  public AlipayUserAgreementQueryResponseModel singleQuota(String singleQuota) {
    
    this.singleQuota = singleQuota;
    return this;
  }

   /**
   * 单笔代扣额度
   * @return singleQuota
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.00", value = "单笔代扣额度")

  public String getSingleQuota() {
    return singleQuota;
  }


  public void setSingleQuota(String singleQuota) {
    this.singleQuota = singleQuota;
  }


  public AlipayUserAgreementQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 协议当前状态  1. TEMP：暂存，协议未生效过；  2. NORMAL：正常；  3. STOP：暂停
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NORMAL", value = "协议当前状态  1. TEMP：暂存，协议未生效过；  2. NORMAL：正常；  3. STOP：暂停")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayUserAgreementQueryResponseModel thirdPartyType(String thirdPartyType) {
    
    this.thirdPartyType = thirdPartyType;
    return this;
  }

   /**
   * 签约第三方主体类型。对于三方协议，表示当前用户和哪一类的第三方主体进行签约。 默认为PARTNER。
   * @return thirdPartyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PARTNER", value = "签约第三方主体类型。对于三方协议，表示当前用户和哪一类的第三方主体进行签约。 默认为PARTNER。")

  public String getThirdPartyType() {
    return thirdPartyType;
  }


  public void setThirdPartyType(String thirdPartyType) {
    this.thirdPartyType = thirdPartyType;
  }


  public AlipayUserAgreementQueryResponseModel validTime(String validTime) {
    
    this.validTime = validTime;
    return this;
  }

   /**
   * 协议生效时间，格式为 yyyy-MM-dd HH:mm:ss。
   * @return validTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-05-24 15:00:40", value = "协议生效时间，格式为 yyyy-MM-dd HH:mm:ss。")

  public String getValidTime() {
    return validTime;
  }


  public void setValidTime(String validTime) {
    this.validTime = validTime;
  }


  public AlipayUserAgreementQueryResponseModel zmOpenId(String zmOpenId) {
    
    this.zmOpenId = zmOpenId;
    return this;
  }

   /**
   * 用户的芝麻信用 openId，供商 户查询用户芝麻信用使用。
   * @return zmOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "268816057852461313538942792", value = "用户的芝麻信用 openId，供商 户查询用户芝麻信用使用。")

  public String getZmOpenId() {
    return zmOpenId;
  }


  public void setZmOpenId(String zmOpenId) {
    this.zmOpenId = zmOpenId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayUserAgreementQueryResponseModel alipayUserAgreementQueryResponseModel = (AlipayUserAgreementQueryResponseModel) o;
    return Objects.equals(this.agreementNo, alipayUserAgreementQueryResponseModel.agreementNo) &&
        Objects.equals(this.alipayLogonId, alipayUserAgreementQueryResponseModel.alipayLogonId) &&
        Objects.equals(this.creditAuthMode, alipayUserAgreementQueryResponseModel.creditAuthMode) &&
        Objects.equals(this.deviceId, alipayUserAgreementQueryResponseModel.deviceId) &&
        Objects.equals(this.externalAgreementNo, alipayUserAgreementQueryResponseModel.externalAgreementNo) &&
        Objects.equals(this.externalLogonId, alipayUserAgreementQueryResponseModel.externalLogonId) &&
        Objects.equals(this.invalidTime, alipayUserAgreementQueryResponseModel.invalidTime) &&
        Objects.equals(this.lastDeductTime, alipayUserAgreementQueryResponseModel.lastDeductTime) &&
        Objects.equals(this.nextDeductTime, alipayUserAgreementQueryResponseModel.nextDeductTime) &&
        Objects.equals(this.personalProductCode, alipayUserAgreementQueryResponseModel.personalProductCode) &&
        Objects.equals(this.pricipalType, alipayUserAgreementQueryResponseModel.pricipalType) &&
        Objects.equals(this.principalId, alipayUserAgreementQueryResponseModel.principalId) &&
        Objects.equals(this.principalOpenId, alipayUserAgreementQueryResponseModel.principalOpenId) &&
        Objects.equals(this.signScene, alipayUserAgreementQueryResponseModel.signScene) &&
        Objects.equals(this.signTime, alipayUserAgreementQueryResponseModel.signTime) &&
        Objects.equals(this.singleQuota, alipayUserAgreementQueryResponseModel.singleQuota) &&
        Objects.equals(this.status, alipayUserAgreementQueryResponseModel.status) &&
        Objects.equals(this.thirdPartyType, alipayUserAgreementQueryResponseModel.thirdPartyType) &&
        Objects.equals(this.validTime, alipayUserAgreementQueryResponseModel.validTime) &&
        Objects.equals(this.zmOpenId, alipayUserAgreementQueryResponseModel.zmOpenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementNo, alipayLogonId, creditAuthMode, deviceId, externalAgreementNo, externalLogonId, invalidTime, lastDeductTime, nextDeductTime, personalProductCode, pricipalType, principalId, principalOpenId, signScene, signTime, singleQuota, status, thirdPartyType, validTime, zmOpenId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayUserAgreementQueryResponseModel {\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    alipayLogonId: ").append(toIndentedString(alipayLogonId)).append("\n");
    sb.append("    creditAuthMode: ").append(toIndentedString(creditAuthMode)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    externalAgreementNo: ").append(toIndentedString(externalAgreementNo)).append("\n");
    sb.append("    externalLogonId: ").append(toIndentedString(externalLogonId)).append("\n");
    sb.append("    invalidTime: ").append(toIndentedString(invalidTime)).append("\n");
    sb.append("    lastDeductTime: ").append(toIndentedString(lastDeductTime)).append("\n");
    sb.append("    nextDeductTime: ").append(toIndentedString(nextDeductTime)).append("\n");
    sb.append("    personalProductCode: ").append(toIndentedString(personalProductCode)).append("\n");
    sb.append("    pricipalType: ").append(toIndentedString(pricipalType)).append("\n");
    sb.append("    principalId: ").append(toIndentedString(principalId)).append("\n");
    sb.append("    principalOpenId: ").append(toIndentedString(principalOpenId)).append("\n");
    sb.append("    signScene: ").append(toIndentedString(signScene)).append("\n");
    sb.append("    signTime: ").append(toIndentedString(signTime)).append("\n");
    sb.append("    singleQuota: ").append(toIndentedString(singleQuota)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    thirdPartyType: ").append(toIndentedString(thirdPartyType)).append("\n");
    sb.append("    validTime: ").append(toIndentedString(validTime)).append("\n");
    sb.append("    zmOpenId: ").append(toIndentedString(zmOpenId)).append("\n");
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
    openapiFields.add("agreement_no");
    openapiFields.add("alipay_logon_id");
    openapiFields.add("credit_auth_mode");
    openapiFields.add("device_id");
    openapiFields.add("external_agreement_no");
    openapiFields.add("external_logon_id");
    openapiFields.add("invalid_time");
    openapiFields.add("last_deduct_time");
    openapiFields.add("next_deduct_time");
    openapiFields.add("personal_product_code");
    openapiFields.add("pricipal_type");
    openapiFields.add("principal_id");
    openapiFields.add("principal_open_id");
    openapiFields.add("sign_scene");
    openapiFields.add("sign_time");
    openapiFields.add("single_quota");
    openapiFields.add("status");
    openapiFields.add("third_party_type");
    openapiFields.add("valid_time");
    openapiFields.add("zm_open_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayUserAgreementQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayUserAgreementQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayUserAgreementQueryResponseModel is not found in the empty JSON string", AlipayUserAgreementQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayUserAgreementQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayUserAgreementQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("alipay_logon_id") != null && !jsonObj.get("alipay_logon_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_logon_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_logon_id").toString()));
      }
      if (jsonObj.get("credit_auth_mode") != null && !jsonObj.get("credit_auth_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credit_auth_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credit_auth_mode").toString()));
      }
      if (jsonObj.get("device_id") != null && !jsonObj.get("device_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_id").toString()));
      }
      if (jsonObj.get("external_agreement_no") != null && !jsonObj.get("external_agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_agreement_no").toString()));
      }
      if (jsonObj.get("external_logon_id") != null && !jsonObj.get("external_logon_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_logon_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_logon_id").toString()));
      }
      if (jsonObj.get("invalid_time") != null && !jsonObj.get("invalid_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invalid_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invalid_time").toString()));
      }
      if (jsonObj.get("last_deduct_time") != null && !jsonObj.get("last_deduct_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_deduct_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_deduct_time").toString()));
      }
      if (jsonObj.get("next_deduct_time") != null && !jsonObj.get("next_deduct_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_deduct_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_deduct_time").toString()));
      }
      if (jsonObj.get("personal_product_code") != null && !jsonObj.get("personal_product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personal_product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personal_product_code").toString()));
      }
      if (jsonObj.get("pricipal_type") != null && !jsonObj.get("pricipal_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pricipal_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pricipal_type").toString()));
      }
      if (jsonObj.get("principal_id") != null && !jsonObj.get("principal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `principal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("principal_id").toString()));
      }
      if (jsonObj.get("principal_open_id") != null && !jsonObj.get("principal_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `principal_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("principal_open_id").toString()));
      }
      if (jsonObj.get("sign_scene") != null && !jsonObj.get("sign_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_scene").toString()));
      }
      if (jsonObj.get("sign_time") != null && !jsonObj.get("sign_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_time").toString()));
      }
      if (jsonObj.get("single_quota") != null && !jsonObj.get("single_quota").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `single_quota` to be a primitive type in the JSON string but got `%s`", jsonObj.get("single_quota").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("third_party_type") != null && !jsonObj.get("third_party_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `third_party_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("third_party_type").toString()));
      }
      if (jsonObj.get("valid_time") != null && !jsonObj.get("valid_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valid_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valid_time").toString()));
      }
      if (jsonObj.get("zm_open_id") != null && !jsonObj.get("zm_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zm_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zm_open_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayUserAgreementQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayUserAgreementQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayUserAgreementQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayUserAgreementQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayUserAgreementQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayUserAgreementQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayUserAgreementQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayUserAgreementQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayUserAgreementQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayUserAgreementQueryResponseModel
  */
  public static AlipayUserAgreementQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayUserAgreementQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayUserAgreementQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

