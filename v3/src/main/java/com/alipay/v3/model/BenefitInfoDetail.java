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
 * BenefitInfoDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BenefitInfoDetail {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_BENEFIT_TYPE = "benefit_type";
  @SerializedName(SERIALIZED_NAME_BENEFIT_TYPE)
  private String benefitType;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private String count;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public BenefitInfoDetail() { 
  }

  public BenefitInfoDetail amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * PRE_FUND：实际核销或者商户赠送的金额  DISCOUNT：实际折扣掉的金额（获取权益不支持该类型）  COUPON：实际核销或者商户赠送的券
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PRE_FUND：实际核销或者商户赠送的金额  DISCOUNT：实际折扣掉的金额（获取权益不支持该类型）  COUPON：实际核销或者商户赠送的券")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public BenefitInfoDetail benefitType(String benefitType) {
    
    this.benefitType = benefitType;
    return this;
  }

   /**
   * 权益类型
   * @return benefitType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "权益类型")

  public String getBenefitType() {
    return benefitType;
  }


  public void setBenefitType(String benefitType) {
    this.benefitType = benefitType;
  }


  public BenefitInfoDetail count(String count) {
    
    this.count = count;
    return this;
  }

   /**
   * COUPON：当核销或者赠送券时，可以设置该值
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "COUPON：当核销或者赠送券时，可以设置该值")

  public String getCount() {
    return count;
  }


  public void setCount(String count) {
    this.count = count;
  }


  public BenefitInfoDetail description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 产生核销或者赠送权益的描述
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "产生核销或者赠送权益的描述")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
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
   * @return the BenefitInfoDetail instance itself
   */
  public BenefitInfoDetail putAdditionalProperty(String key, Object value) {
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
    BenefitInfoDetail benefitInfoDetail = (BenefitInfoDetail) o;
    return Objects.equals(this.amount, benefitInfoDetail.amount) &&
        Objects.equals(this.benefitType, benefitInfoDetail.benefitType) &&
        Objects.equals(this.count, benefitInfoDetail.count) &&
        Objects.equals(this.description, benefitInfoDetail.description)&&
        Objects.equals(this.additionalProperties, benefitInfoDetail.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, benefitType, count, description, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitInfoDetail {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    benefitType: ").append(toIndentedString(benefitType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("benefit_type");
    openapiFields.add("count");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BenefitInfoDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BenefitInfoDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BenefitInfoDetail is not found in the empty JSON string", BenefitInfoDetail.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("benefit_type") != null && !jsonObj.get("benefit_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `benefit_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("benefit_type").toString()));
      }
      if (jsonObj.get("count") != null && !jsonObj.get("count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("count").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BenefitInfoDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BenefitInfoDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BenefitInfoDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BenefitInfoDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<BenefitInfoDetail>() {
           @Override
           public void write(JsonWriter out, BenefitInfoDetail value) throws IOException {
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
           public BenefitInfoDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BenefitInfoDetail instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BenefitInfoDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BenefitInfoDetail
  * @throws IOException if the JSON string is invalid with respect to BenefitInfoDetail
  */
  public static BenefitInfoDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BenefitInfoDetail.class);
  }

 /**
  * Convert an instance of BenefitInfoDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

