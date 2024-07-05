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
import com.alipay.v3.model.ActivityBaseInfo;
import com.alipay.v3.model.BelongMerchantInfo;
import com.alipay.v3.model.CustomerGuide;
import com.alipay.v3.model.VoucherAvailableScopeInfo;
import com.alipay.v3.model.VoucherCustomerGuideInfo;
import com.alipay.v3.model.VoucherDeductInfo;
import com.alipay.v3.model.VoucherDisplayInfo;
import com.alipay.v3.model.VoucherDisplayPatternInfo;
import com.alipay.v3.model.VoucherInventoryInfo;
import com.alipay.v3.model.VoucherSendModeInfo;
import com.alipay.v3.model.VoucherSendRuleDetail;
import com.alipay.v3.model.VoucherSummary;
import com.alipay.v3.model.VoucherUseRule;
import com.alipay.v3.model.VoucherUseRuleInfo;
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
 * AlipayMarketingActivityOrdervoucherQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityOrdervoucherQueryResponseModel {
  public static final String SERIALIZED_NAME_ACTIVITY_BASE_INFO = "activity_base_info";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_BASE_INFO)
  private ActivityBaseInfo activityBaseInfo;

  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId;

  public static final String SERIALIZED_NAME_ACTIVITY_NAME = "activity_name";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_NAME)
  private String activityName;

  public static final String SERIALIZED_NAME_ACTIVITY_OPERATION_STATUS = "activity_operation_status";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_OPERATION_STATUS)
  private String activityOperationStatus;

  public static final String SERIALIZED_NAME_ACTIVITY_STATUS = "activity_status";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_STATUS)
  private String activityStatus;

  public static final String SERIALIZED_NAME_BELONG_MERCHANT_INFO = "belong_merchant_info";
  @SerializedName(SERIALIZED_NAME_BELONG_MERCHANT_INFO)
  private BelongMerchantInfo belongMerchantInfo;

  public static final String SERIALIZED_NAME_BIZ_TAG = "biz_tag";
  @SerializedName(SERIALIZED_NAME_BIZ_TAG)
  private String bizTag;

  public static final String SERIALIZED_NAME_CUSTOMER_GUIDE = "customer_guide";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_GUIDE)
  private CustomerGuide customerGuide;

  public static final String SERIALIZED_NAME_PUBLISH_END_TIME = "publish_end_time";
  @SerializedName(SERIALIZED_NAME_PUBLISH_END_TIME)
  private String publishEndTime;

  public static final String SERIALIZED_NAME_PUBLISH_START_TIME = "publish_start_time";
  @SerializedName(SERIALIZED_NAME_PUBLISH_START_TIME)
  private String publishStartTime;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private VoucherSummary summary;

  public static final String SERIALIZED_NAME_VOUCHER_AVAILABLE_SCOPE_INFO = "voucher_available_scope_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_AVAILABLE_SCOPE_INFO)
  private VoucherAvailableScopeInfo voucherAvailableScopeInfo;

  public static final String SERIALIZED_NAME_VOUCHER_CUSTOMER_GUIDE_INFO = "voucher_customer_guide_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_CUSTOMER_GUIDE_INFO)
  private VoucherCustomerGuideInfo voucherCustomerGuideInfo;

  public static final String SERIALIZED_NAME_VOUCHER_DEDUCT_INFO = "voucher_deduct_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DEDUCT_INFO)
  private VoucherDeductInfo voucherDeductInfo;

  public static final String SERIALIZED_NAME_VOUCHER_DISPLAY_INFO = "voucher_display_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DISPLAY_INFO)
  private VoucherDisplayInfo voucherDisplayInfo;

  public static final String SERIALIZED_NAME_VOUCHER_DISPLAY_PATTERN_INFO = "voucher_display_pattern_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DISPLAY_PATTERN_INFO)
  private VoucherDisplayPatternInfo voucherDisplayPatternInfo;

  public static final String SERIALIZED_NAME_VOUCHER_INVENTORY_INFO = "voucher_inventory_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_INVENTORY_INFO)
  private VoucherInventoryInfo voucherInventoryInfo;

  public static final String SERIALIZED_NAME_VOUCHER_SEND_MODE_INFO = "voucher_send_mode_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_SEND_MODE_INFO)
  private VoucherSendModeInfo voucherSendModeInfo;

  public static final String SERIALIZED_NAME_VOUCHER_SEND_RULE = "voucher_send_rule";
  @SerializedName(SERIALIZED_NAME_VOUCHER_SEND_RULE)
  private VoucherSendRuleDetail voucherSendRule;

  public static final String SERIALIZED_NAME_VOUCHER_TYPE = "voucher_type";
  @SerializedName(SERIALIZED_NAME_VOUCHER_TYPE)
  private String voucherType;

  public static final String SERIALIZED_NAME_VOUCHER_USE_RULE = "voucher_use_rule";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_RULE)
  private VoucherUseRule voucherUseRule;

  public static final String SERIALIZED_NAME_VOUCHER_USE_RULE_INFO = "voucher_use_rule_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_RULE_INFO)
  private VoucherUseRuleInfo voucherUseRuleInfo;

  public AlipayMarketingActivityOrdervoucherQueryResponseModel() { 
  }

  public AlipayMarketingActivityOrdervoucherQueryResponseModel activityBaseInfo(ActivityBaseInfo activityBaseInfo) {
    
    this.activityBaseInfo = activityBaseInfo;
    return this;
  }

   /**
   * Get activityBaseInfo
   * @return activityBaseInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ActivityBaseInfo getActivityBaseInfo() {
    return activityBaseInfo;
  }


  public void setActivityBaseInfo(ActivityBaseInfo activityBaseInfo) {
    this.activityBaseInfo = activityBaseInfo;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel activityId(String activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 活动id
   * @return activityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016042700826004508401111111", value = "活动id")

  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel activityName(String activityName) {
    
    this.activityName = activityName;
    return this;
  }

   /**
   * 活动名称。不对用户进行展示，仅供商家在后台管理活动使用。
   * @return activityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "满10减1优惠券", value = "活动名称。不对用户进行展示，仅供商家在后台管理活动使用。")

  public String getActivityName() {
    return activityName;
  }


  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel activityOperationStatus(String activityOperationStatus) {
    
    this.activityOperationStatus = activityOperationStatus;
    return this;
  }

   /**
   * 活动操作状态
   * @return activityOperationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MODIFYING", value = "活动操作状态")

  public String getActivityOperationStatus() {
    return activityOperationStatus;
  }


  public void setActivityOperationStatus(String activityOperationStatus) {
    this.activityOperationStatus = activityOperationStatus;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel activityStatus(String activityStatus) {
    
    this.activityStatus = activityStatus;
    return this;
  }

   /**
   * 活动状态。已激活状态代表活动正常运行，已终止状态代表商家终止活动，不可再发放。
   * @return activityStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACTIVE", value = "活动状态。已激活状态代表活动正常运行，已终止状态代表商家终止活动，不可再发放。")

  public String getActivityStatus() {
    return activityStatus;
  }


  public void setActivityStatus(String activityStatus) {
    this.activityStatus = activityStatus;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel belongMerchantInfo(BelongMerchantInfo belongMerchantInfo) {
    
    this.belongMerchantInfo = belongMerchantInfo;
    return this;
  }

   /**
   * Get belongMerchantInfo
   * @return belongMerchantInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BelongMerchantInfo getBelongMerchantInfo() {
    return belongMerchantInfo;
  }


  public void setBelongMerchantInfo(BelongMerchantInfo belongMerchantInfo) {
    this.belongMerchantInfo = belongMerchantInfo;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel bizTag(String bizTag) {
    
    this.bizTag = bizTag;
    return this;
  }

   /**
   * 商家券业务标签，影响商家券对C端用户的展示形式。
   * @return bizTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GROUP_BUY_EXCHANGE_VOUCHER", value = "商家券业务标签，影响商家券对C端用户的展示形式。")

  public String getBizTag() {
    return bizTag;
  }


  public void setBizTag(String bizTag) {
    this.bizTag = bizTag;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel customerGuide(CustomerGuide customerGuide) {
    
    this.customerGuide = customerGuide;
    return this;
  }

   /**
   * Get customerGuide
   * @return customerGuide
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CustomerGuide getCustomerGuide() {
    return customerGuide;
  }


  public void setCustomerGuide(CustomerGuide customerGuide) {
    this.customerGuide = customerGuide;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel publishEndTime(String publishEndTime) {
    
    this.publishEndTime = publishEndTime;
    return this;
  }

   /**
   * 券发放结束时间。格式为：yyyy-MM-dd HH:mm:ss
   * @return publishEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-29 23:59:59", value = "券发放结束时间。格式为：yyyy-MM-dd HH:mm:ss")

  public String getPublishEndTime() {
    return publishEndTime;
  }


  public void setPublishEndTime(String publishEndTime) {
    this.publishEndTime = publishEndTime;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel publishStartTime(String publishStartTime) {
    
    this.publishStartTime = publishStartTime;
    return this;
  }

   /**
   * 券发放开始时间。格式为：yyyy-MM-dd HH:mm:ss
   * @return publishStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-01 00:00:01", value = "券发放开始时间。格式为：yyyy-MM-dd HH:mm:ss")

  public String getPublishStartTime() {
    return publishStartTime;
  }


  public void setPublishStartTime(String publishStartTime) {
    this.publishStartTime = publishStartTime;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel summary(VoucherSummary summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherSummary getSummary() {
    return summary;
  }


  public void setSummary(VoucherSummary summary) {
    this.summary = summary;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel voucherAvailableScopeInfo(VoucherAvailableScopeInfo voucherAvailableScopeInfo) {
    
    this.voucherAvailableScopeInfo = voucherAvailableScopeInfo;
    return this;
  }

   /**
   * Get voucherAvailableScopeInfo
   * @return voucherAvailableScopeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherAvailableScopeInfo getVoucherAvailableScopeInfo() {
    return voucherAvailableScopeInfo;
  }


  public void setVoucherAvailableScopeInfo(VoucherAvailableScopeInfo voucherAvailableScopeInfo) {
    this.voucherAvailableScopeInfo = voucherAvailableScopeInfo;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel voucherCustomerGuideInfo(VoucherCustomerGuideInfo voucherCustomerGuideInfo) {
    
    this.voucherCustomerGuideInfo = voucherCustomerGuideInfo;
    return this;
  }

   /**
   * Get voucherCustomerGuideInfo
   * @return voucherCustomerGuideInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherCustomerGuideInfo getVoucherCustomerGuideInfo() {
    return voucherCustomerGuideInfo;
  }


  public void setVoucherCustomerGuideInfo(VoucherCustomerGuideInfo voucherCustomerGuideInfo) {
    this.voucherCustomerGuideInfo = voucherCustomerGuideInfo;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel voucherDeductInfo(VoucherDeductInfo voucherDeductInfo) {
    
    this.voucherDeductInfo = voucherDeductInfo;
    return this;
  }

   /**
   * Get voucherDeductInfo
   * @return voucherDeductInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherDeductInfo getVoucherDeductInfo() {
    return voucherDeductInfo;
  }


  public void setVoucherDeductInfo(VoucherDeductInfo voucherDeductInfo) {
    this.voucherDeductInfo = voucherDeductInfo;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel voucherDisplayInfo(VoucherDisplayInfo voucherDisplayInfo) {
    
    this.voucherDisplayInfo = voucherDisplayInfo;
    return this;
  }

   /**
   * Get voucherDisplayInfo
   * @return voucherDisplayInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherDisplayInfo getVoucherDisplayInfo() {
    return voucherDisplayInfo;
  }


  public void setVoucherDisplayInfo(VoucherDisplayInfo voucherDisplayInfo) {
    this.voucherDisplayInfo = voucherDisplayInfo;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel voucherDisplayPatternInfo(VoucherDisplayPatternInfo voucherDisplayPatternInfo) {
    
    this.voucherDisplayPatternInfo = voucherDisplayPatternInfo;
    return this;
  }

   /**
   * Get voucherDisplayPatternInfo
   * @return voucherDisplayPatternInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherDisplayPatternInfo getVoucherDisplayPatternInfo() {
    return voucherDisplayPatternInfo;
  }


  public void setVoucherDisplayPatternInfo(VoucherDisplayPatternInfo voucherDisplayPatternInfo) {
    this.voucherDisplayPatternInfo = voucherDisplayPatternInfo;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel voucherInventoryInfo(VoucherInventoryInfo voucherInventoryInfo) {
    
    this.voucherInventoryInfo = voucherInventoryInfo;
    return this;
  }

   /**
   * Get voucherInventoryInfo
   * @return voucherInventoryInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherInventoryInfo getVoucherInventoryInfo() {
    return voucherInventoryInfo;
  }


  public void setVoucherInventoryInfo(VoucherInventoryInfo voucherInventoryInfo) {
    this.voucherInventoryInfo = voucherInventoryInfo;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel voucherSendModeInfo(VoucherSendModeInfo voucherSendModeInfo) {
    
    this.voucherSendModeInfo = voucherSendModeInfo;
    return this;
  }

   /**
   * Get voucherSendModeInfo
   * @return voucherSendModeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherSendModeInfo getVoucherSendModeInfo() {
    return voucherSendModeInfo;
  }


  public void setVoucherSendModeInfo(VoucherSendModeInfo voucherSendModeInfo) {
    this.voucherSendModeInfo = voucherSendModeInfo;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel voucherSendRule(VoucherSendRuleDetail voucherSendRule) {
    
    this.voucherSendRule = voucherSendRule;
    return this;
  }

   /**
   * Get voucherSendRule
   * @return voucherSendRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherSendRuleDetail getVoucherSendRule() {
    return voucherSendRule;
  }


  public void setVoucherSendRule(VoucherSendRuleDetail voucherSendRule) {
    this.voucherSendRule = voucherSendRule;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel voucherType(String voucherType) {
    
    this.voucherType = voucherType;
    return this;
  }

   /**
   * 券类型
   * @return voucherType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FIX_VOUCHER", value = "券类型")

  public String getVoucherType() {
    return voucherType;
  }


  public void setVoucherType(String voucherType) {
    this.voucherType = voucherType;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel voucherUseRule(VoucherUseRule voucherUseRule) {
    
    this.voucherUseRule = voucherUseRule;
    return this;
  }

   /**
   * Get voucherUseRule
   * @return voucherUseRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherUseRule getVoucherUseRule() {
    return voucherUseRule;
  }


  public void setVoucherUseRule(VoucherUseRule voucherUseRule) {
    this.voucherUseRule = voucherUseRule;
  }


  public AlipayMarketingActivityOrdervoucherQueryResponseModel voucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
    
    this.voucherUseRuleInfo = voucherUseRuleInfo;
    return this;
  }

   /**
   * Get voucherUseRuleInfo
   * @return voucherUseRuleInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherUseRuleInfo getVoucherUseRuleInfo() {
    return voucherUseRuleInfo;
  }


  public void setVoucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
    this.voucherUseRuleInfo = voucherUseRuleInfo;
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
   * @return the AlipayMarketingActivityOrdervoucherQueryResponseModel instance itself
   */
  public AlipayMarketingActivityOrdervoucherQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayMarketingActivityOrdervoucherQueryResponseModel alipayMarketingActivityOrdervoucherQueryResponseModel = (AlipayMarketingActivityOrdervoucherQueryResponseModel) o;
    return Objects.equals(this.activityBaseInfo, alipayMarketingActivityOrdervoucherQueryResponseModel.activityBaseInfo) &&
        Objects.equals(this.activityId, alipayMarketingActivityOrdervoucherQueryResponseModel.activityId) &&
        Objects.equals(this.activityName, alipayMarketingActivityOrdervoucherQueryResponseModel.activityName) &&
        Objects.equals(this.activityOperationStatus, alipayMarketingActivityOrdervoucherQueryResponseModel.activityOperationStatus) &&
        Objects.equals(this.activityStatus, alipayMarketingActivityOrdervoucherQueryResponseModel.activityStatus) &&
        Objects.equals(this.belongMerchantInfo, alipayMarketingActivityOrdervoucherQueryResponseModel.belongMerchantInfo) &&
        Objects.equals(this.bizTag, alipayMarketingActivityOrdervoucherQueryResponseModel.bizTag) &&
        Objects.equals(this.customerGuide, alipayMarketingActivityOrdervoucherQueryResponseModel.customerGuide) &&
        Objects.equals(this.publishEndTime, alipayMarketingActivityOrdervoucherQueryResponseModel.publishEndTime) &&
        Objects.equals(this.publishStartTime, alipayMarketingActivityOrdervoucherQueryResponseModel.publishStartTime) &&
        Objects.equals(this.summary, alipayMarketingActivityOrdervoucherQueryResponseModel.summary) &&
        Objects.equals(this.voucherAvailableScopeInfo, alipayMarketingActivityOrdervoucherQueryResponseModel.voucherAvailableScopeInfo) &&
        Objects.equals(this.voucherCustomerGuideInfo, alipayMarketingActivityOrdervoucherQueryResponseModel.voucherCustomerGuideInfo) &&
        Objects.equals(this.voucherDeductInfo, alipayMarketingActivityOrdervoucherQueryResponseModel.voucherDeductInfo) &&
        Objects.equals(this.voucherDisplayInfo, alipayMarketingActivityOrdervoucherQueryResponseModel.voucherDisplayInfo) &&
        Objects.equals(this.voucherDisplayPatternInfo, alipayMarketingActivityOrdervoucherQueryResponseModel.voucherDisplayPatternInfo) &&
        Objects.equals(this.voucherInventoryInfo, alipayMarketingActivityOrdervoucherQueryResponseModel.voucherInventoryInfo) &&
        Objects.equals(this.voucherSendModeInfo, alipayMarketingActivityOrdervoucherQueryResponseModel.voucherSendModeInfo) &&
        Objects.equals(this.voucherSendRule, alipayMarketingActivityOrdervoucherQueryResponseModel.voucherSendRule) &&
        Objects.equals(this.voucherType, alipayMarketingActivityOrdervoucherQueryResponseModel.voucherType) &&
        Objects.equals(this.voucherUseRule, alipayMarketingActivityOrdervoucherQueryResponseModel.voucherUseRule) &&
        Objects.equals(this.voucherUseRuleInfo, alipayMarketingActivityOrdervoucherQueryResponseModel.voucherUseRuleInfo)&&
        Objects.equals(this.additionalProperties, alipayMarketingActivityOrdervoucherQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityBaseInfo, activityId, activityName, activityOperationStatus, activityStatus, belongMerchantInfo, bizTag, customerGuide, publishEndTime, publishStartTime, summary, voucherAvailableScopeInfo, voucherCustomerGuideInfo, voucherDeductInfo, voucherDisplayInfo, voucherDisplayPatternInfo, voucherInventoryInfo, voucherSendModeInfo, voucherSendRule, voucherType, voucherUseRule, voucherUseRuleInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityOrdervoucherQueryResponseModel {\n");
    sb.append("    activityBaseInfo: ").append(toIndentedString(activityBaseInfo)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
    sb.append("    activityOperationStatus: ").append(toIndentedString(activityOperationStatus)).append("\n");
    sb.append("    activityStatus: ").append(toIndentedString(activityStatus)).append("\n");
    sb.append("    belongMerchantInfo: ").append(toIndentedString(belongMerchantInfo)).append("\n");
    sb.append("    bizTag: ").append(toIndentedString(bizTag)).append("\n");
    sb.append("    customerGuide: ").append(toIndentedString(customerGuide)).append("\n");
    sb.append("    publishEndTime: ").append(toIndentedString(publishEndTime)).append("\n");
    sb.append("    publishStartTime: ").append(toIndentedString(publishStartTime)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    voucherAvailableScopeInfo: ").append(toIndentedString(voucherAvailableScopeInfo)).append("\n");
    sb.append("    voucherCustomerGuideInfo: ").append(toIndentedString(voucherCustomerGuideInfo)).append("\n");
    sb.append("    voucherDeductInfo: ").append(toIndentedString(voucherDeductInfo)).append("\n");
    sb.append("    voucherDisplayInfo: ").append(toIndentedString(voucherDisplayInfo)).append("\n");
    sb.append("    voucherDisplayPatternInfo: ").append(toIndentedString(voucherDisplayPatternInfo)).append("\n");
    sb.append("    voucherInventoryInfo: ").append(toIndentedString(voucherInventoryInfo)).append("\n");
    sb.append("    voucherSendModeInfo: ").append(toIndentedString(voucherSendModeInfo)).append("\n");
    sb.append("    voucherSendRule: ").append(toIndentedString(voucherSendRule)).append("\n");
    sb.append("    voucherType: ").append(toIndentedString(voucherType)).append("\n");
    sb.append("    voucherUseRule: ").append(toIndentedString(voucherUseRule)).append("\n");
    sb.append("    voucherUseRuleInfo: ").append(toIndentedString(voucherUseRuleInfo)).append("\n");
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
    openapiFields.add("activity_base_info");
    openapiFields.add("activity_id");
    openapiFields.add("activity_name");
    openapiFields.add("activity_operation_status");
    openapiFields.add("activity_status");
    openapiFields.add("belong_merchant_info");
    openapiFields.add("biz_tag");
    openapiFields.add("customer_guide");
    openapiFields.add("publish_end_time");
    openapiFields.add("publish_start_time");
    openapiFields.add("summary");
    openapiFields.add("voucher_available_scope_info");
    openapiFields.add("voucher_customer_guide_info");
    openapiFields.add("voucher_deduct_info");
    openapiFields.add("voucher_display_info");
    openapiFields.add("voucher_display_pattern_info");
    openapiFields.add("voucher_inventory_info");
    openapiFields.add("voucher_send_mode_info");
    openapiFields.add("voucher_send_rule");
    openapiFields.add("voucher_type");
    openapiFields.add("voucher_use_rule");
    openapiFields.add("voucher_use_rule_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityOrdervoucherQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityOrdervoucherQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityOrdervoucherQueryResponseModel is not found in the empty JSON string", AlipayMarketingActivityOrdervoucherQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `activity_base_info`
      if (jsonObj.getAsJsonObject("activity_base_info") != null) {
        ActivityBaseInfo.validateJsonObject(jsonObj.getAsJsonObject("activity_base_info"));
      }
      if (jsonObj.get("activity_id") != null && !jsonObj.get("activity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_id").toString()));
      }
      if (jsonObj.get("activity_name") != null && !jsonObj.get("activity_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_name").toString()));
      }
      if (jsonObj.get("activity_operation_status") != null && !jsonObj.get("activity_operation_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_operation_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_operation_status").toString()));
      }
      if (jsonObj.get("activity_status") != null && !jsonObj.get("activity_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_status").toString()));
      }
      // validate the optional field `belong_merchant_info`
      if (jsonObj.getAsJsonObject("belong_merchant_info") != null) {
        BelongMerchantInfo.validateJsonObject(jsonObj.getAsJsonObject("belong_merchant_info"));
      }
      if (jsonObj.get("biz_tag") != null && !jsonObj.get("biz_tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_tag").toString()));
      }
      // validate the optional field `customer_guide`
      if (jsonObj.getAsJsonObject("customer_guide") != null) {
        CustomerGuide.validateJsonObject(jsonObj.getAsJsonObject("customer_guide"));
      }
      if (jsonObj.get("publish_end_time") != null && !jsonObj.get("publish_end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publish_end_time").toString()));
      }
      if (jsonObj.get("publish_start_time") != null && !jsonObj.get("publish_start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publish_start_time").toString()));
      }
      // validate the optional field `summary`
      if (jsonObj.getAsJsonObject("summary") != null) {
        VoucherSummary.validateJsonObject(jsonObj.getAsJsonObject("summary"));
      }
      // validate the optional field `voucher_available_scope_info`
      if (jsonObj.getAsJsonObject("voucher_available_scope_info") != null) {
        VoucherAvailableScopeInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_available_scope_info"));
      }
      // validate the optional field `voucher_customer_guide_info`
      if (jsonObj.getAsJsonObject("voucher_customer_guide_info") != null) {
        VoucherCustomerGuideInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_customer_guide_info"));
      }
      // validate the optional field `voucher_deduct_info`
      if (jsonObj.getAsJsonObject("voucher_deduct_info") != null) {
        VoucherDeductInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_deduct_info"));
      }
      // validate the optional field `voucher_display_info`
      if (jsonObj.getAsJsonObject("voucher_display_info") != null) {
        VoucherDisplayInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_display_info"));
      }
      // validate the optional field `voucher_display_pattern_info`
      if (jsonObj.getAsJsonObject("voucher_display_pattern_info") != null) {
        VoucherDisplayPatternInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_display_pattern_info"));
      }
      // validate the optional field `voucher_inventory_info`
      if (jsonObj.getAsJsonObject("voucher_inventory_info") != null) {
        VoucherInventoryInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_inventory_info"));
      }
      // validate the optional field `voucher_send_mode_info`
      if (jsonObj.getAsJsonObject("voucher_send_mode_info") != null) {
        VoucherSendModeInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_send_mode_info"));
      }
      // validate the optional field `voucher_send_rule`
      if (jsonObj.getAsJsonObject("voucher_send_rule") != null) {
        VoucherSendRuleDetail.validateJsonObject(jsonObj.getAsJsonObject("voucher_send_rule"));
      }
      if (jsonObj.get("voucher_type") != null && !jsonObj.get("voucher_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_type").toString()));
      }
      // validate the optional field `voucher_use_rule`
      if (jsonObj.getAsJsonObject("voucher_use_rule") != null) {
        VoucherUseRule.validateJsonObject(jsonObj.getAsJsonObject("voucher_use_rule"));
      }
      // validate the optional field `voucher_use_rule_info`
      if (jsonObj.getAsJsonObject("voucher_use_rule_info") != null) {
        VoucherUseRuleInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_use_rule_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityOrdervoucherQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityOrdervoucherQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityOrdervoucherQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityOrdervoucherQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityOrdervoucherQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityOrdervoucherQueryResponseModel value) throws IOException {
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
           public AlipayMarketingActivityOrdervoucherQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMarketingActivityOrdervoucherQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMarketingActivityOrdervoucherQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityOrdervoucherQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityOrdervoucherQueryResponseModel
  */
  public static AlipayMarketingActivityOrdervoucherQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityOrdervoucherQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityOrdervoucherQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

