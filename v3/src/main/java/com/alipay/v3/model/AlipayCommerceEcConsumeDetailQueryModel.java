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
 * AlipayCommerceEcConsumeDetailQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceEcConsumeDetailQueryModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_PAY_NO = "pay_no";
  @SerializedName(SERIALIZED_NAME_PAY_NO)
  private String payNo;

  public static final String SERIALIZED_NAME_QUERY_OPTIONS = "query_options";
  @SerializedName(SERIALIZED_NAME_QUERY_OPTIONS)
  private List<String> queryOptions = null;

  public AlipayCommerceEcConsumeDetailQueryModel() { 
  }

  public AlipayCommerceEcConsumeDetailQueryModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 共同账户ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123456789000", value = "共同账户ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayCommerceEcConsumeDetailQueryModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权签约协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20205820659822371223", value = "授权签约协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayCommerceEcConsumeDetailQueryModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业ID
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123456789000", value = "企业ID")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayCommerceEcConsumeDetailQueryModel payNo(String payNo) {
    
    this.payNo = payNo;
    return this;
  }

   /**
   * 支付宝账单号
   * @return payNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020123100152601930000003650", value = "支付宝账单号")

  public String getPayNo() {
    return payNo;
  }


  public void setPayNo(String payNo) {
    this.payNo = payNo;
  }


  public AlipayCommerceEcConsumeDetailQueryModel queryOptions(List<String> queryOptions) {
    
    this.queryOptions = queryOptions;
    return this;
  }

  public AlipayCommerceEcConsumeDetailQueryModel addQueryOptionsItem(String queryOptionsItem) {
    if (this.queryOptions == null) {
      this.queryOptions = new ArrayList<>();
    }
    this.queryOptions.add(queryOptionsItem);
    return this;
  }

   /**
   * 查询选项
   * @return queryOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"Refund\"]", value = "查询选项")

  public List<String> getQueryOptions() {
    return queryOptions;
  }


  public void setQueryOptions(List<String> queryOptions) {
    this.queryOptions = queryOptions;
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
   * @return the AlipayCommerceEcConsumeDetailQueryModel instance itself
   */
  public AlipayCommerceEcConsumeDetailQueryModel putAdditionalProperty(String key, Object value) {
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
    AlipayCommerceEcConsumeDetailQueryModel alipayCommerceEcConsumeDetailQueryModel = (AlipayCommerceEcConsumeDetailQueryModel) o;
    return Objects.equals(this.accountId, alipayCommerceEcConsumeDetailQueryModel.accountId) &&
        Objects.equals(this.agreementNo, alipayCommerceEcConsumeDetailQueryModel.agreementNo) &&
        Objects.equals(this.enterpriseId, alipayCommerceEcConsumeDetailQueryModel.enterpriseId) &&
        Objects.equals(this.payNo, alipayCommerceEcConsumeDetailQueryModel.payNo) &&
        Objects.equals(this.queryOptions, alipayCommerceEcConsumeDetailQueryModel.queryOptions)&&
        Objects.equals(this.additionalProperties, alipayCommerceEcConsumeDetailQueryModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreementNo, enterpriseId, payNo, queryOptions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceEcConsumeDetailQueryModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    payNo: ").append(toIndentedString(payNo)).append("\n");
    sb.append("    queryOptions: ").append(toIndentedString(queryOptions)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("agreement_no");
    openapiFields.add("enterprise_id");
    openapiFields.add("pay_no");
    openapiFields.add("query_options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceEcConsumeDetailQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceEcConsumeDetailQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceEcConsumeDetailQueryModel is not found in the empty JSON string", AlipayCommerceEcConsumeDetailQueryModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("pay_no") != null && !jsonObj.get("pay_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_no").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("query_options") != null && !jsonObj.get("query_options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `query_options` to be an array in the JSON string but got `%s`", jsonObj.get("query_options").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceEcConsumeDetailQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceEcConsumeDetailQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceEcConsumeDetailQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceEcConsumeDetailQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceEcConsumeDetailQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceEcConsumeDetailQueryModel value) throws IOException {
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
           public AlipayCommerceEcConsumeDetailQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayCommerceEcConsumeDetailQueryModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayCommerceEcConsumeDetailQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceEcConsumeDetailQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceEcConsumeDetailQueryModel
  */
  public static AlipayCommerceEcConsumeDetailQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceEcConsumeDetailQueryModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceEcConsumeDetailQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

