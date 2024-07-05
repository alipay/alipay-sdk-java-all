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
 * SettleCardInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SettleCardInfo {
  public static final String SERIALIZED_NAME_ACCOUNT_BRANCH_NAME = "account_branch_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_BRANCH_NAME)
  private String accountBranchName;

  public static final String SERIALIZED_NAME_ACCOUNT_HOLDER_NAME = "account_holder_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HOLDER_NAME)
  private String accountHolderName;

  public static final String SERIALIZED_NAME_ACCOUNT_INST_CITY = "account_inst_city";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_INST_CITY)
  private String accountInstCity;

  public static final String SERIALIZED_NAME_ACCOUNT_INST_ID = "account_inst_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_INST_ID)
  private String accountInstId;

  public static final String SERIALIZED_NAME_ACCOUNT_INST_NAME = "account_inst_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_INST_NAME)
  private String accountInstName;

  public static final String SERIALIZED_NAME_ACCOUNT_INST_PROVINCE = "account_inst_province";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_INST_PROVINCE)
  private String accountInstProvince;

  public static final String SERIALIZED_NAME_ACCOUNT_NO = "account_no";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NO)
  private String accountNo;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public static final String SERIALIZED_NAME_BANK_CODE = "bank_code";
  @SerializedName(SERIALIZED_NAME_BANK_CODE)
  private String bankCode;

  public static final String SERIALIZED_NAME_USAGE_TYPE = "usage_type";
  @SerializedName(SERIALIZED_NAME_USAGE_TYPE)
  private String usageType;

  public SettleCardInfo() { 
  }

  public SettleCardInfo accountBranchName(String accountBranchName) {
    
    this.accountBranchName = accountBranchName;
    return this;
  }

   /**
   * 开户支行名
   * @return accountBranchName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开户支行名")

  public String getAccountBranchName() {
    return accountBranchName;
  }


  public void setAccountBranchName(String accountBranchName) {
    this.accountBranchName = accountBranchName;
  }


  public SettleCardInfo accountHolderName(String accountHolderName) {
    
    this.accountHolderName = accountHolderName;
    return this;
  }

   /**
   * 卡户名
   * @return accountHolderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "卡户名")

  public String getAccountHolderName() {
    return accountHolderName;
  }


  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }


  public SettleCardInfo accountInstCity(String accountInstCity) {
    
    this.accountInstCity = accountInstCity;
    return this;
  }

   /**
   * 开户行所在地-市
   * @return accountInstCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开户行所在地-市")

  public String getAccountInstCity() {
    return accountInstCity;
  }


  public void setAccountInstCity(String accountInstCity) {
    this.accountInstCity = accountInstCity;
  }


  public SettleCardInfo accountInstId(String accountInstId) {
    
    this.accountInstId = accountInstId;
    return this;
  }

   /**
   * 开户行简称缩写
   * @return accountInstId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开户行简称缩写")

  public String getAccountInstId() {
    return accountInstId;
  }


  public void setAccountInstId(String accountInstId) {
    this.accountInstId = accountInstId;
  }


  public SettleCardInfo accountInstName(String accountInstName) {
    
    this.accountInstName = accountInstName;
    return this;
  }

   /**
   * 银行名称
   * @return accountInstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "银行名称")

  public String getAccountInstName() {
    return accountInstName;
  }


  public void setAccountInstName(String accountInstName) {
    this.accountInstName = accountInstName;
  }


  public SettleCardInfo accountInstProvince(String accountInstProvince) {
    
    this.accountInstProvince = accountInstProvince;
    return this;
  }

   /**
   * 开户行所在地-省
   * @return accountInstProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开户行所在地-省")

  public String getAccountInstProvince() {
    return accountInstProvince;
  }


  public void setAccountInstProvince(String accountInstProvince) {
    this.accountInstProvince = accountInstProvince;
  }


  public SettleCardInfo accountNo(String accountNo) {
    
    this.accountNo = accountNo;
    return this;
  }

   /**
   * 银行卡号
   * @return accountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "银行卡号")

  public String getAccountNo() {
    return accountNo;
  }


  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }


  public SettleCardInfo accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * 卡类型  借记卡-DC  信用卡-CC
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "卡类型  借记卡-DC  信用卡-CC")

  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public SettleCardInfo bankCode(String bankCode) {
    
    this.bankCode = bankCode;
    return this;
  }

   /**
   * 联行号
   * @return bankCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "联行号")

  public String getBankCode() {
    return bankCode;
  }


  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }


  public SettleCardInfo usageType(String usageType) {
    
    this.usageType = usageType;
    return this;
  }

   /**
   * 账号使用类型  对公-01  对私-02
   * @return usageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "账号使用类型  对公-01  对私-02")

  public String getUsageType() {
    return usageType;
  }


  public void setUsageType(String usageType) {
    this.usageType = usageType;
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
   * @return the SettleCardInfo instance itself
   */
  public SettleCardInfo putAdditionalProperty(String key, Object value) {
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
    SettleCardInfo settleCardInfo = (SettleCardInfo) o;
    return Objects.equals(this.accountBranchName, settleCardInfo.accountBranchName) &&
        Objects.equals(this.accountHolderName, settleCardInfo.accountHolderName) &&
        Objects.equals(this.accountInstCity, settleCardInfo.accountInstCity) &&
        Objects.equals(this.accountInstId, settleCardInfo.accountInstId) &&
        Objects.equals(this.accountInstName, settleCardInfo.accountInstName) &&
        Objects.equals(this.accountInstProvince, settleCardInfo.accountInstProvince) &&
        Objects.equals(this.accountNo, settleCardInfo.accountNo) &&
        Objects.equals(this.accountType, settleCardInfo.accountType) &&
        Objects.equals(this.bankCode, settleCardInfo.bankCode) &&
        Objects.equals(this.usageType, settleCardInfo.usageType)&&
        Objects.equals(this.additionalProperties, settleCardInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountBranchName, accountHolderName, accountInstCity, accountInstId, accountInstName, accountInstProvince, accountNo, accountType, bankCode, usageType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettleCardInfo {\n");
    sb.append("    accountBranchName: ").append(toIndentedString(accountBranchName)).append("\n");
    sb.append("    accountHolderName: ").append(toIndentedString(accountHolderName)).append("\n");
    sb.append("    accountInstCity: ").append(toIndentedString(accountInstCity)).append("\n");
    sb.append("    accountInstId: ").append(toIndentedString(accountInstId)).append("\n");
    sb.append("    accountInstName: ").append(toIndentedString(accountInstName)).append("\n");
    sb.append("    accountInstProvince: ").append(toIndentedString(accountInstProvince)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
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
    openapiFields.add("account_branch_name");
    openapiFields.add("account_holder_name");
    openapiFields.add("account_inst_city");
    openapiFields.add("account_inst_id");
    openapiFields.add("account_inst_name");
    openapiFields.add("account_inst_province");
    openapiFields.add("account_no");
    openapiFields.add("account_type");
    openapiFields.add("bank_code");
    openapiFields.add("usage_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SettleCardInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SettleCardInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SettleCardInfo is not found in the empty JSON string", SettleCardInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("account_branch_name") != null && !jsonObj.get("account_branch_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_branch_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_branch_name").toString()));
      }
      if (jsonObj.get("account_holder_name") != null && !jsonObj.get("account_holder_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_holder_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_holder_name").toString()));
      }
      if (jsonObj.get("account_inst_city") != null && !jsonObj.get("account_inst_city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_inst_city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_inst_city").toString()));
      }
      if (jsonObj.get("account_inst_id") != null && !jsonObj.get("account_inst_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_inst_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_inst_id").toString()));
      }
      if (jsonObj.get("account_inst_name") != null && !jsonObj.get("account_inst_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_inst_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_inst_name").toString()));
      }
      if (jsonObj.get("account_inst_province") != null && !jsonObj.get("account_inst_province").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_inst_province` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_inst_province").toString()));
      }
      if (jsonObj.get("account_no") != null && !jsonObj.get("account_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_no").toString()));
      }
      if (jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_type").toString()));
      }
      if (jsonObj.get("bank_code") != null && !jsonObj.get("bank_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_code").toString()));
      }
      if (jsonObj.get("usage_type") != null && !jsonObj.get("usage_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `usage_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("usage_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SettleCardInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SettleCardInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SettleCardInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SettleCardInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SettleCardInfo>() {
           @Override
           public void write(JsonWriter out, SettleCardInfo value) throws IOException {
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
           public SettleCardInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SettleCardInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SettleCardInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SettleCardInfo
  * @throws IOException if the JSON string is invalid with respect to SettleCardInfo
  */
  public static SettleCardInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SettleCardInfo.class);
  }

 /**
  * Convert an instance of SettleCardInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

