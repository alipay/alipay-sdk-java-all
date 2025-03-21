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
 * AlipayDataBillBalanceQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayDataBillBalanceQueryResponseModel {
  public static final String SERIALIZED_NAME_AVAILABLE_AMOUNT = "available_amount";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_AMOUNT)
  private String availableAmount;

  public static final String SERIALIZED_NAME_FREEZE_AMOUNT = "freeze_amount";
  @SerializedName(SERIALIZED_NAME_FREEZE_AMOUNT)
  private String freezeAmount;

  public static final String SERIALIZED_NAME_SETTLE_AMOUNT = "settle_amount";
  @SerializedName(SERIALIZED_NAME_SETTLE_AMOUNT)
  private String settleAmount;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private String totalAmount;

  public AlipayDataBillBalanceQueryResponseModel() { 
  }

  public AlipayDataBillBalanceQueryResponseModel availableAmount(String availableAmount) {
    
    this.availableAmount = availableAmount;
    return this;
  }

   /**
   * 账户可用余额
   * @return availableAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9000.00", value = "账户可用余额")

  public String getAvailableAmount() {
    return availableAmount;
  }


  public void setAvailableAmount(String availableAmount) {
    this.availableAmount = availableAmount;
  }


  public AlipayDataBillBalanceQueryResponseModel freezeAmount(String freezeAmount) {
    
    this.freezeAmount = freezeAmount;
    return this;
  }

   /**
   * 冻结金额。单位（元）
   * @return freezeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000.00", value = "冻结金额。单位（元）")

  public String getFreezeAmount() {
    return freezeAmount;
  }


  public void setFreezeAmount(String freezeAmount) {
    this.freezeAmount = freezeAmount;
  }


  public AlipayDataBillBalanceQueryResponseModel settleAmount(String settleAmount) {
    
    this.settleAmount = settleAmount;
    return this;
  }

   /**
   * 待结算金额，单位（元）
   * @return settleAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "500.00", value = "待结算金额，单位（元）")

  public String getSettleAmount() {
    return settleAmount;
  }


  public void setSettleAmount(String settleAmount) {
    this.settleAmount = settleAmount;
  }


  public AlipayDataBillBalanceQueryResponseModel totalAmount(String totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * 支付宝账户余额
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000.00", value = "支付宝账户余额")

  public String getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
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
   * @return the AlipayDataBillBalanceQueryResponseModel instance itself
   */
  public AlipayDataBillBalanceQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayDataBillBalanceQueryResponseModel alipayDataBillBalanceQueryResponseModel = (AlipayDataBillBalanceQueryResponseModel) o;
    return Objects.equals(this.availableAmount, alipayDataBillBalanceQueryResponseModel.availableAmount) &&
        Objects.equals(this.freezeAmount, alipayDataBillBalanceQueryResponseModel.freezeAmount) &&
        Objects.equals(this.settleAmount, alipayDataBillBalanceQueryResponseModel.settleAmount) &&
        Objects.equals(this.totalAmount, alipayDataBillBalanceQueryResponseModel.totalAmount)&&
        Objects.equals(this.additionalProperties, alipayDataBillBalanceQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableAmount, freezeAmount, settleAmount, totalAmount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayDataBillBalanceQueryResponseModel {\n");
    sb.append("    availableAmount: ").append(toIndentedString(availableAmount)).append("\n");
    sb.append("    freezeAmount: ").append(toIndentedString(freezeAmount)).append("\n");
    sb.append("    settleAmount: ").append(toIndentedString(settleAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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
    openapiFields.add("available_amount");
    openapiFields.add("freeze_amount");
    openapiFields.add("settle_amount");
    openapiFields.add("total_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayDataBillBalanceQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayDataBillBalanceQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayDataBillBalanceQueryResponseModel is not found in the empty JSON string", AlipayDataBillBalanceQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("available_amount") != null && !jsonObj.get("available_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available_amount").toString()));
      }
      if (jsonObj.get("freeze_amount") != null && !jsonObj.get("freeze_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `freeze_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("freeze_amount").toString()));
      }
      if (jsonObj.get("settle_amount") != null && !jsonObj.get("settle_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_amount").toString()));
      }
      if (jsonObj.get("total_amount") != null && !jsonObj.get("total_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayDataBillBalanceQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayDataBillBalanceQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayDataBillBalanceQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayDataBillBalanceQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayDataBillBalanceQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayDataBillBalanceQueryResponseModel value) throws IOException {
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
           public AlipayDataBillBalanceQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayDataBillBalanceQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayDataBillBalanceQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayDataBillBalanceQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayDataBillBalanceQueryResponseModel
  */
  public static AlipayDataBillBalanceQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayDataBillBalanceQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayDataBillBalanceQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

