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
 * PaymentVoucherSendRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentVoucherSendRule {
  public static final String SERIALIZED_NAME_MAX_QUANTITY_BY_DAY = "max_quantity_by_day";
  @SerializedName(SERIALIZED_NAME_MAX_QUANTITY_BY_DAY)
  private Integer maxQuantityByDay;

  public static final String SERIALIZED_NAME_NATURAL_PERSON_LIMIT = "natural_person_limit";
  @SerializedName(SERIALIZED_NAME_NATURAL_PERSON_LIMIT)
  private Boolean naturalPersonLimit;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_LIMIT = "phone_number_limit";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_LIMIT)
  private Boolean phoneNumberLimit;

  public static final String SERIALIZED_NAME_REAL_NAME_LIMIT = "real_name_limit";
  @SerializedName(SERIALIZED_NAME_REAL_NAME_LIMIT)
  private Boolean realNameLimit;

  public static final String SERIALIZED_NAME_VOUCHER_QUANTITY = "voucher_quantity";
  @SerializedName(SERIALIZED_NAME_VOUCHER_QUANTITY)
  private Integer voucherQuantity;

  public static final String SERIALIZED_NAME_VOUCHER_QUANTITY_LIMIT_PER_USER = "voucher_quantity_limit_per_user";
  @SerializedName(SERIALIZED_NAME_VOUCHER_QUANTITY_LIMIT_PER_USER)
  private Integer voucherQuantityLimitPerUser;

  public static final String SERIALIZED_NAME_VOUCHER_QUANTITY_LIMIT_PER_USER_PERIOD_TYPE = "voucher_quantity_limit_per_user_period_type";
  @SerializedName(SERIALIZED_NAME_VOUCHER_QUANTITY_LIMIT_PER_USER_PERIOD_TYPE)
  private String voucherQuantityLimitPerUserPeriodType;

  public PaymentVoucherSendRule() { 
  }

  public PaymentVoucherSendRule maxQuantityByDay(Integer maxQuantityByDay) {
    
    this.maxQuantityByDay = maxQuantityByDay;
    return this;
  }

   /**
   * 设置此字段，允许指定单天最大发券数量。  限制: 每天发放张数*活动天数应小于等于优惠券发放总量
   * @return maxQuantityByDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "设置此字段，允许指定单天最大发券数量。  限制: 每天发放张数*活动天数应小于等于优惠券发放总量")

  public Integer getMaxQuantityByDay() {
    return maxQuantityByDay;
  }


  public void setMaxQuantityByDay(Integer maxQuantityByDay) {
    this.maxQuantityByDay = maxQuantityByDay;
  }


  public PaymentVoucherSendRule naturalPersonLimit(Boolean naturalPersonLimit) {
    
    this.naturalPersonLimit = naturalPersonLimit;
    return this;
  }

   /**
   * 限制相同身份证号领取次数(voucher_quantity_limit_per_user)。默认false不限制。 枚举值 true：是 false：否
   * @return naturalPersonLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "限制相同身份证号领取次数(voucher_quantity_limit_per_user)。默认false不限制。 枚举值 true：是 false：否")

  public Boolean getNaturalPersonLimit() {
    return naturalPersonLimit;
  }


  public void setNaturalPersonLimit(Boolean naturalPersonLimit) {
    this.naturalPersonLimit = naturalPersonLimit;
  }


  public PaymentVoucherSendRule phoneNumberLimit(Boolean phoneNumberLimit) {
    
    this.phoneNumberLimit = phoneNumberLimit;
    return this;
  }

   /**
   * 限制相同手机号领取次数(voucher_quantity_limit_per_user)。默认false不限制 枚举值 true：是 false：否
   * @return phoneNumberLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "限制相同手机号领取次数(voucher_quantity_limit_per_user)。默认false不限制 枚举值 true：是 false：否")

  public Boolean getPhoneNumberLimit() {
    return phoneNumberLimit;
  }


  public void setPhoneNumberLimit(Boolean phoneNumberLimit) {
    this.phoneNumberLimit = phoneNumberLimit;
  }


  public PaymentVoucherSendRule realNameLimit(Boolean realNameLimit) {
    
    this.realNameLimit = realNameLimit;
    return this;
  }

   /**
   * 限制支付宝实名用户才能领取支付券,默认为false表示不限制 枚举值 true\\false
   * @return realNameLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "限制支付宝实名用户才能领取支付券,默认为false表示不限制 枚举值 true\\false")

  public Boolean getRealNameLimit() {
    return realNameLimit;
  }


  public void setRealNameLimit(Boolean realNameLimit) {
    this.realNameLimit = realNameLimit;
  }


  public PaymentVoucherSendRule voucherQuantity(Integer voucherQuantity) {
    
    this.voucherQuantity = voucherQuantity;
    return this;
  }

   /**
   * 发行券的总数量。 限制： 1、发放总个数最少1个 2、发放总个数最多99999999个
   * @return voucherQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发行券的总数量。 限制： 1、发放总个数最少1个 2、发放总个数最多99999999个")

  public Integer getVoucherQuantity() {
    return voucherQuantity;
  }


  public void setVoucherQuantity(Integer voucherQuantity) {
    this.voucherQuantity = voucherQuantity;
  }


  public PaymentVoucherSendRule voucherQuantityLimitPerUser(Integer voucherQuantityLimitPerUser) {
    
    this.voucherQuantityLimitPerUser = voucherQuantityLimitPerUser;
    return this;
  }

   /**
   * 每人领取限制。 默认按照支付宝账号进行领取限制;  不填写或填入0表示没有领取限制.
   * @return voucherQuantityLimitPerUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "每人领取限制。 默认按照支付宝账号进行领取限制;  不填写或填入0表示没有领取限制.")

  public Integer getVoucherQuantityLimitPerUser() {
    return voucherQuantityLimitPerUser;
  }


  public void setVoucherQuantityLimitPerUser(Integer voucherQuantityLimitPerUser) {
    this.voucherQuantityLimitPerUser = voucherQuantityLimitPerUser;
  }


  public PaymentVoucherSendRule voucherQuantityLimitPerUserPeriodType(String voucherQuantityLimitPerUserPeriodType) {
    
    this.voucherQuantityLimitPerUserPeriodType = voucherQuantityLimitPerUserPeriodType;
    return this;
  }

   /**
   * 周期限领配置,限制每人在固定周期内领取张数(voucher_quantity_limit_per_user),默认LIFE_CYCLE
   * @return voucherQuantityLimitPerUserPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "周期限领配置,限制每人在固定周期内领取张数(voucher_quantity_limit_per_user),默认LIFE_CYCLE")

  public String getVoucherQuantityLimitPerUserPeriodType() {
    return voucherQuantityLimitPerUserPeriodType;
  }


  public void setVoucherQuantityLimitPerUserPeriodType(String voucherQuantityLimitPerUserPeriodType) {
    this.voucherQuantityLimitPerUserPeriodType = voucherQuantityLimitPerUserPeriodType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentVoucherSendRule paymentVoucherSendRule = (PaymentVoucherSendRule) o;
    return Objects.equals(this.maxQuantityByDay, paymentVoucherSendRule.maxQuantityByDay) &&
        Objects.equals(this.naturalPersonLimit, paymentVoucherSendRule.naturalPersonLimit) &&
        Objects.equals(this.phoneNumberLimit, paymentVoucherSendRule.phoneNumberLimit) &&
        Objects.equals(this.realNameLimit, paymentVoucherSendRule.realNameLimit) &&
        Objects.equals(this.voucherQuantity, paymentVoucherSendRule.voucherQuantity) &&
        Objects.equals(this.voucherQuantityLimitPerUser, paymentVoucherSendRule.voucherQuantityLimitPerUser) &&
        Objects.equals(this.voucherQuantityLimitPerUserPeriodType, paymentVoucherSendRule.voucherQuantityLimitPerUserPeriodType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxQuantityByDay, naturalPersonLimit, phoneNumberLimit, realNameLimit, voucherQuantity, voucherQuantityLimitPerUser, voucherQuantityLimitPerUserPeriodType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentVoucherSendRule {\n");
    sb.append("    maxQuantityByDay: ").append(toIndentedString(maxQuantityByDay)).append("\n");
    sb.append("    naturalPersonLimit: ").append(toIndentedString(naturalPersonLimit)).append("\n");
    sb.append("    phoneNumberLimit: ").append(toIndentedString(phoneNumberLimit)).append("\n");
    sb.append("    realNameLimit: ").append(toIndentedString(realNameLimit)).append("\n");
    sb.append("    voucherQuantity: ").append(toIndentedString(voucherQuantity)).append("\n");
    sb.append("    voucherQuantityLimitPerUser: ").append(toIndentedString(voucherQuantityLimitPerUser)).append("\n");
    sb.append("    voucherQuantityLimitPerUserPeriodType: ").append(toIndentedString(voucherQuantityLimitPerUserPeriodType)).append("\n");
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
    openapiFields.add("max_quantity_by_day");
    openapiFields.add("natural_person_limit");
    openapiFields.add("phone_number_limit");
    openapiFields.add("real_name_limit");
    openapiFields.add("voucher_quantity");
    openapiFields.add("voucher_quantity_limit_per_user");
    openapiFields.add("voucher_quantity_limit_per_user_period_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentVoucherSendRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentVoucherSendRule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentVoucherSendRule is not found in the empty JSON string", PaymentVoucherSendRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentVoucherSendRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentVoucherSendRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("voucher_quantity_limit_per_user_period_type") != null && !jsonObj.get("voucher_quantity_limit_per_user_period_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_quantity_limit_per_user_period_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_quantity_limit_per_user_period_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentVoucherSendRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentVoucherSendRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentVoucherSendRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentVoucherSendRule.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentVoucherSendRule>() {
           @Override
           public void write(JsonWriter out, PaymentVoucherSendRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentVoucherSendRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentVoucherSendRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentVoucherSendRule
  * @throws IOException if the JSON string is invalid with respect to PaymentVoucherSendRule
  */
  public static PaymentVoucherSendRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentVoucherSendRule.class);
  }

 /**
  * Convert an instance of PaymentVoucherSendRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

