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
 * ExpenseQuotaInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExpenseQuotaInfo {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_EFFECTIVE_END_DATE = "effective_end_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_END_DATE)
  private String effectiveEndDate;

  public static final String SERIALIZED_NAME_EFFECTIVE_START_DATE = "effective_start_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_START_DATE)
  private String effectiveStartDate;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_FREEZE = "freeze";
  @SerializedName(SERIALIZED_NAME_FREEZE)
  private Boolean freeze;

  public static final String SERIALIZED_NAME_OWNER_ID = "owner_id";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_OWNER_OPEN_ID = "owner_open_id";
  @SerializedName(SERIALIZED_NAME_OWNER_OPEN_ID)
  private String ownerOpenId;

  public static final String SERIALIZED_NAME_OWNER_TYPE = "owner_type";
  @SerializedName(SERIALIZED_NAME_OWNER_TYPE)
  private String ownerType;

  public static final String SERIALIZED_NAME_QUOTA_AVAILABLE = "quota_available";
  @SerializedName(SERIALIZED_NAME_QUOTA_AVAILABLE)
  private String quotaAvailable;

  public static final String SERIALIZED_NAME_QUOTA_ID = "quota_id";
  @SerializedName(SERIALIZED_NAME_QUOTA_ID)
  private String quotaId;

  public static final String SERIALIZED_NAME_QUOTA_LOCKED = "quota_locked";
  @SerializedName(SERIALIZED_NAME_QUOTA_LOCKED)
  private String quotaLocked;

  public static final String SERIALIZED_NAME_QUOTA_TOTAL = "quota_total";
  @SerializedName(SERIALIZED_NAME_QUOTA_TOTAL)
  private String quotaTotal;

  public static final String SERIALIZED_NAME_QUOTA_TYPE = "quota_type";
  @SerializedName(SERIALIZED_NAME_QUOTA_TYPE)
  private String quotaType;

  public static final String SERIALIZED_NAME_QUOTA_USED = "quota_used";
  @SerializedName(SERIALIZED_NAME_QUOTA_USED)
  private String quotaUsed;

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private String targetId;

  public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  private String targetType;

  public ExpenseQuotaInfo() { 
  }

  public ExpenseQuotaInfo currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * 额度对应的币种
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "额度对应的币种")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public ExpenseQuotaInfo effectiveEndDate(String effectiveEndDate) {
    
    this.effectiveEndDate = effectiveEndDate;
    return this;
  }

   /**
   * 额度失效时间
   * @return effectiveEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-01 00:00:00", value = "额度失效时间")

  public String getEffectiveEndDate() {
    return effectiveEndDate;
  }


  public void setEffectiveEndDate(String effectiveEndDate) {
    this.effectiveEndDate = effectiveEndDate;
  }


  public ExpenseQuotaInfo effectiveStartDate(String effectiveStartDate) {
    
    this.effectiveStartDate = effectiveStartDate;
    return this;
  }

   /**
   * 额度生效时间
   * @return effectiveStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01 00:00:00", value = "额度生效时间")

  public String getEffectiveStartDate() {
    return effectiveStartDate;
  }


  public void setEffectiveStartDate(String effectiveStartDate) {
    this.effectiveStartDate = effectiveStartDate;
  }


  public ExpenseQuotaInfo enterpriseId(String enterpriseId) {
    
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


  public ExpenseQuotaInfo freeze(Boolean freeze) {
    
    this.freeze = freeze;
    return this;
  }

   /**
   * 额度是否冻结，冻结后因公付不可用
   * @return freeze
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "额度是否冻结，冻结后因公付不可用")

  public Boolean getFreeze() {
    return freeze;
  }


  public void setFreeze(Boolean freeze) {
    this.freeze = freeze;
  }


  public ExpenseQuotaInfo ownerId(String ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * 额度所属者ID owner_type为EMPLOYEE时为员工支付宝ID owner_type为ENTERPRISE_PAY_UID时为员工企业码ID owner_type为PHONE时为员工手机号 owner_type为ENTERPRISE时为企业ID
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxx", value = "额度所属者ID owner_type为EMPLOYEE时为员工支付宝ID owner_type为ENTERPRISE_PAY_UID时为员工企业码ID owner_type为PHONE时为员工手机号 owner_type为ENTERPRISE时为企业ID")

  public String getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public ExpenseQuotaInfo ownerOpenId(String ownerOpenId) {
    
    this.ownerOpenId = ownerOpenId;
    return this;
  }

   /**
   * owner_type为EMPLOYEE时为员工open_id owner_type为PHONE时为员工手机号 owner_type为ENTERPRISE_PAY_UID时为员工企业码ID
   * @return ownerOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcdxxxx", value = "owner_type为EMPLOYEE时为员工open_id owner_type为PHONE时为员工手机号 owner_type为ENTERPRISE_PAY_UID时为员工企业码ID")

  public String getOwnerOpenId() {
    return ownerOpenId;
  }


  public void setOwnerOpenId(String ownerOpenId) {
    this.ownerOpenId = ownerOpenId;
  }


  public ExpenseQuotaInfo ownerType(String ownerType) {
    
    this.ownerType = ownerType;
    return this;
  }

   /**
   * 额度所属者id类型
   * @return ownerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EMPLOYEE", value = "额度所属者id类型")

  public String getOwnerType() {
    return ownerType;
  }


  public void setOwnerType(String ownerType) {
    this.ownerType = ownerType;
  }


  public ExpenseQuotaInfo quotaAvailable(String quotaAvailable) {
    
    this.quotaAvailable = quotaAvailable;
    return this;
  }

   /**
   * 可用金额（单位分）
   * @return quotaAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "可用金额（单位分）")

  public String getQuotaAvailable() {
    return quotaAvailable;
  }


  public void setQuotaAvailable(String quotaAvailable) {
    this.quotaAvailable = quotaAvailable;
  }


  public ExpenseQuotaInfo quotaId(String quotaId) {
    
    this.quotaId = quotaId;
    return this;
  }

   /**
   * 额度ID
   * @return quotaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021062800152601350000001468", value = "额度ID")

  public String getQuotaId() {
    return quotaId;
  }


  public void setQuotaId(String quotaId) {
    this.quotaId = quotaId;
  }


  public ExpenseQuotaInfo quotaLocked(String quotaLocked) {
    
    this.quotaLocked = quotaLocked;
    return this;
  }

   /**
   * 锁定金额（单位分）
   * @return quotaLocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "锁定金额（单位分）")

  public String getQuotaLocked() {
    return quotaLocked;
  }


  public void setQuotaLocked(String quotaLocked) {
    this.quotaLocked = quotaLocked;
  }


  public ExpenseQuotaInfo quotaTotal(String quotaTotal) {
    
    this.quotaTotal = quotaTotal;
    return this;
  }

   /**
   * 总金额（单位分）
   * @return quotaTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "总金额（单位分）")

  public String getQuotaTotal() {
    return quotaTotal;
  }


  public void setQuotaTotal(String quotaTotal) {
    this.quotaTotal = quotaTotal;
  }


  public ExpenseQuotaInfo quotaType(String quotaType) {
    
    this.quotaType = quotaType;
    return this;
  }

   /**
   * 额度类型
   * @return quotaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CAP", value = "额度类型")

  public String getQuotaType() {
    return quotaType;
  }


  public void setQuotaType(String quotaType) {
    this.quotaType = quotaType;
  }


  public ExpenseQuotaInfo quotaUsed(String quotaUsed) {
    
    this.quotaUsed = quotaUsed;
    return this;
  }

   /**
   * 已用金额（单位分）
   * @return quotaUsed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "70", value = "已用金额（单位分）")

  public String getQuotaUsed() {
    return quotaUsed;
  }


  public void setQuotaUsed(String quotaUsed) {
    this.quotaUsed = quotaUsed;
  }


  public ExpenseQuotaInfo targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * 额度维度ID 当 target_type&#x3D;EXPENSE_TYPE 时，值为 MEAL（工作餐） 当target_type&#x3D;RULE_GROUP_AGGREGATION 时，值为费控规则聚合ID 当target_type&#x3D;INSTITUTION 时，值为制度ID
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MEAL", value = "额度维度ID 当 target_type=EXPENSE_TYPE 时，值为 MEAL（工作餐） 当target_type=RULE_GROUP_AGGREGATION 时，值为费控规则聚合ID 当target_type=INSTITUTION 时，值为制度ID")

  public String getTargetId() {
    return targetId;
  }


  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public ExpenseQuotaInfo targetType(String targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * 额度维度
   * @return targetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EXPENSE_TYPE", value = "额度维度")

  public String getTargetType() {
    return targetType;
  }


  public void setTargetType(String targetType) {
    this.targetType = targetType;
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
   * @return the ExpenseQuotaInfo instance itself
   */
  public ExpenseQuotaInfo putAdditionalProperty(String key, Object value) {
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
    ExpenseQuotaInfo expenseQuotaInfo = (ExpenseQuotaInfo) o;
    return Objects.equals(this.currency, expenseQuotaInfo.currency) &&
        Objects.equals(this.effectiveEndDate, expenseQuotaInfo.effectiveEndDate) &&
        Objects.equals(this.effectiveStartDate, expenseQuotaInfo.effectiveStartDate) &&
        Objects.equals(this.enterpriseId, expenseQuotaInfo.enterpriseId) &&
        Objects.equals(this.freeze, expenseQuotaInfo.freeze) &&
        Objects.equals(this.ownerId, expenseQuotaInfo.ownerId) &&
        Objects.equals(this.ownerOpenId, expenseQuotaInfo.ownerOpenId) &&
        Objects.equals(this.ownerType, expenseQuotaInfo.ownerType) &&
        Objects.equals(this.quotaAvailable, expenseQuotaInfo.quotaAvailable) &&
        Objects.equals(this.quotaId, expenseQuotaInfo.quotaId) &&
        Objects.equals(this.quotaLocked, expenseQuotaInfo.quotaLocked) &&
        Objects.equals(this.quotaTotal, expenseQuotaInfo.quotaTotal) &&
        Objects.equals(this.quotaType, expenseQuotaInfo.quotaType) &&
        Objects.equals(this.quotaUsed, expenseQuotaInfo.quotaUsed) &&
        Objects.equals(this.targetId, expenseQuotaInfo.targetId) &&
        Objects.equals(this.targetType, expenseQuotaInfo.targetType)&&
        Objects.equals(this.additionalProperties, expenseQuotaInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, effectiveEndDate, effectiveStartDate, enterpriseId, freeze, ownerId, ownerOpenId, ownerType, quotaAvailable, quotaId, quotaLocked, quotaTotal, quotaType, quotaUsed, targetId, targetType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseQuotaInfo {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    effectiveStartDate: ").append(toIndentedString(effectiveStartDate)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    freeze: ").append(toIndentedString(freeze)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ownerOpenId: ").append(toIndentedString(ownerOpenId)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    quotaAvailable: ").append(toIndentedString(quotaAvailable)).append("\n");
    sb.append("    quotaId: ").append(toIndentedString(quotaId)).append("\n");
    sb.append("    quotaLocked: ").append(toIndentedString(quotaLocked)).append("\n");
    sb.append("    quotaTotal: ").append(toIndentedString(quotaTotal)).append("\n");
    sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
    sb.append("    quotaUsed: ").append(toIndentedString(quotaUsed)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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
    openapiFields.add("currency");
    openapiFields.add("effective_end_date");
    openapiFields.add("effective_start_date");
    openapiFields.add("enterprise_id");
    openapiFields.add("freeze");
    openapiFields.add("owner_id");
    openapiFields.add("owner_open_id");
    openapiFields.add("owner_type");
    openapiFields.add("quota_available");
    openapiFields.add("quota_id");
    openapiFields.add("quota_locked");
    openapiFields.add("quota_total");
    openapiFields.add("quota_type");
    openapiFields.add("quota_used");
    openapiFields.add("target_id");
    openapiFields.add("target_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExpenseQuotaInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExpenseQuotaInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExpenseQuotaInfo is not found in the empty JSON string", ExpenseQuotaInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (jsonObj.get("effective_end_date") != null && !jsonObj.get("effective_end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_end_date").toString()));
      }
      if (jsonObj.get("effective_start_date") != null && !jsonObj.get("effective_start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_start_date").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("owner_id") != null && !jsonObj.get("owner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_id").toString()));
      }
      if (jsonObj.get("owner_open_id") != null && !jsonObj.get("owner_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_open_id").toString()));
      }
      if (jsonObj.get("owner_type") != null && !jsonObj.get("owner_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_type").toString()));
      }
      if (jsonObj.get("quota_available") != null && !jsonObj.get("quota_available").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_available` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_available").toString()));
      }
      if (jsonObj.get("quota_id") != null && !jsonObj.get("quota_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_id").toString()));
      }
      if (jsonObj.get("quota_locked") != null && !jsonObj.get("quota_locked").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_locked` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_locked").toString()));
      }
      if (jsonObj.get("quota_total") != null && !jsonObj.get("quota_total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_total").toString()));
      }
      if (jsonObj.get("quota_type") != null && !jsonObj.get("quota_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_type").toString()));
      }
      if (jsonObj.get("quota_used") != null && !jsonObj.get("quota_used").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_used` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_used").toString()));
      }
      if (jsonObj.get("target_id") != null && !jsonObj.get("target_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_id").toString()));
      }
      if (jsonObj.get("target_type") != null && !jsonObj.get("target_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExpenseQuotaInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExpenseQuotaInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExpenseQuotaInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExpenseQuotaInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ExpenseQuotaInfo>() {
           @Override
           public void write(JsonWriter out, ExpenseQuotaInfo value) throws IOException {
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
           public ExpenseQuotaInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExpenseQuotaInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExpenseQuotaInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExpenseQuotaInfo
  * @throws IOException if the JSON string is invalid with respect to ExpenseQuotaInfo
  */
  public static ExpenseQuotaInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExpenseQuotaInfo.class);
  }

 /**
  * Convert an instance of ExpenseQuotaInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

