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
 * SpecialVoucher
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SpecialVoucher {
  public static final String SERIALIZED_NAME_FLOOR_AMOUNT = "floor_amount";
  @SerializedName(SERIALIZED_NAME_FLOOR_AMOUNT)
  private String floorAmount;

  public static final String SERIALIZED_NAME_GOODS_NAME = "goods_name";
  @SerializedName(SERIALIZED_NAME_GOODS_NAME)
  private String goodsName;

  public static final String SERIALIZED_NAME_ORIGIN_AMOUNT = "origin_amount";
  @SerializedName(SERIALIZED_NAME_ORIGIN_AMOUNT)
  private String originAmount;

  public static final String SERIALIZED_NAME_SPECIAL_AMOUNT = "special_amount";
  @SerializedName(SERIALIZED_NAME_SPECIAL_AMOUNT)
  private String specialAmount;

  public SpecialVoucher() { 
  }

  public SpecialVoucher floorAmount(String floorAmount) {
    
    this.floorAmount = floorAmount;
    return this;
  }

   /**
   * 门槛金额。说明：该字段可不填，认为无门槛;
   * @return floorAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "门槛金额。说明：该字段可不填，认为无门槛;")

  public String getFloorAmount() {
    return floorAmount;
  }


  public void setFloorAmount(String floorAmount) {
    this.floorAmount = floorAmount;
  }


  public SpecialVoucher goodsName(String goodsName) {
    
    this.goodsName = goodsName;
    return this;
  }

   /**
   * 商品名称。
   * @return goodsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品名称。")

  public String getGoodsName() {
    return goodsName;
  }


  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public SpecialVoucher originAmount(String originAmount) {
    
    this.originAmount = originAmount;
    return this;
  }

   /**
   * 原价。 限制： 币种为人民币，单位为元。小数点以后最多保留两位; 取值范围:0.1&lt;&#x3D;x&lt;&#x3D;9999。
   * @return originAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "原价。 限制： 币种为人民币，单位为元。小数点以后最多保留两位; 取值范围:0.1<=x<=9999。")

  public String getOriginAmount() {
    return originAmount;
  }


  public void setOriginAmount(String originAmount) {
    this.originAmount = originAmount;
  }


  public SpecialVoucher specialAmount(String specialAmount) {
    
    this.specialAmount = specialAmount;
    return this;
  }

   /**
   * 特价，即：原价-特价&#x3D;优惠金额。
   * @return specialAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "特价，即：原价-特价=优惠金额。")

  public String getSpecialAmount() {
    return specialAmount;
  }


  public void setSpecialAmount(String specialAmount) {
    this.specialAmount = specialAmount;
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
   * @return the SpecialVoucher instance itself
   */
  public SpecialVoucher putAdditionalProperty(String key, Object value) {
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
    SpecialVoucher specialVoucher = (SpecialVoucher) o;
    return Objects.equals(this.floorAmount, specialVoucher.floorAmount) &&
        Objects.equals(this.goodsName, specialVoucher.goodsName) &&
        Objects.equals(this.originAmount, specialVoucher.originAmount) &&
        Objects.equals(this.specialAmount, specialVoucher.specialAmount)&&
        Objects.equals(this.additionalProperties, specialVoucher.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(floorAmount, goodsName, originAmount, specialAmount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialVoucher {\n");
    sb.append("    floorAmount: ").append(toIndentedString(floorAmount)).append("\n");
    sb.append("    goodsName: ").append(toIndentedString(goodsName)).append("\n");
    sb.append("    originAmount: ").append(toIndentedString(originAmount)).append("\n");
    sb.append("    specialAmount: ").append(toIndentedString(specialAmount)).append("\n");
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
    openapiFields.add("floor_amount");
    openapiFields.add("goods_name");
    openapiFields.add("origin_amount");
    openapiFields.add("special_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SpecialVoucher
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SpecialVoucher.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpecialVoucher is not found in the empty JSON string", SpecialVoucher.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("floor_amount") != null && !jsonObj.get("floor_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `floor_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("floor_amount").toString()));
      }
      if (jsonObj.get("goods_name") != null && !jsonObj.get("goods_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_name").toString()));
      }
      if (jsonObj.get("origin_amount") != null && !jsonObj.get("origin_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_amount").toString()));
      }
      if (jsonObj.get("special_amount") != null && !jsonObj.get("special_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `special_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("special_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpecialVoucher.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpecialVoucher' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpecialVoucher> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpecialVoucher.class));

       return (TypeAdapter<T>) new TypeAdapter<SpecialVoucher>() {
           @Override
           public void write(JsonWriter out, SpecialVoucher value) throws IOException {
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
           public SpecialVoucher read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SpecialVoucher instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SpecialVoucher given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SpecialVoucher
  * @throws IOException if the JSON string is invalid with respect to SpecialVoucher
  */
  public static SpecialVoucher fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpecialVoucher.class);
  }

 /**
  * Convert an instance of SpecialVoucher to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

