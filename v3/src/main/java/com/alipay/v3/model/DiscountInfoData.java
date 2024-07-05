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
 * DiscountInfoData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DiscountInfoData {
  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private String discountAmount;

  public static final String SERIALIZED_NAME_DISCOUNT_NAME = "discount_name";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_NAME)
  private String discountName;

  public static final String SERIALIZED_NAME_DISCOUNT_PAGE_LINK = "discount_page_link";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_PAGE_LINK)
  private String discountPageLink;

  public static final String SERIALIZED_NAME_DISCOUNT_QUANTITY = "discount_quantity";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_QUANTITY)
  private Integer discountQuantity;

  public static final String SERIALIZED_NAME_EXTERNAL_DISCOUNT_ID = "external_discount_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_DISCOUNT_ID)
  private String externalDiscountId;

  public DiscountInfoData() { 
  }

  public DiscountInfoData discountAmount(String discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * 优惠金额
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.44", value = "优惠金额")

  public String getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }


  public DiscountInfoData discountName(String discountName) {
    
    this.discountName = discountName;
    return this;
  }

   /**
   * 优惠名称
   * @return discountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "商家红包", value = "优惠名称")

  public String getDiscountName() {
    return discountName;
  }


  public void setDiscountName(String discountName) {
    this.discountName = discountName;
  }


  public DiscountInfoData discountPageLink(String discountPageLink) {
    
    this.discountPageLink = discountPageLink;
    return this;
  }

   /**
   * 优惠跳转链接地址
   * @return discountPageLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.alipay.com/", value = "优惠跳转链接地址")

  public String getDiscountPageLink() {
    return discountPageLink;
  }


  public void setDiscountPageLink(String discountPageLink) {
    this.discountPageLink = discountPageLink;
  }


  public DiscountInfoData discountQuantity(Integer discountQuantity) {
    
    this.discountQuantity = discountQuantity;
    return this;
  }

   /**
   * 优惠数量
   * @return discountQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "优惠数量")

  public Integer getDiscountQuantity() {
    return discountQuantity;
  }


  public void setDiscountQuantity(Integer discountQuantity) {
    this.discountQuantity = discountQuantity;
  }


  public DiscountInfoData externalDiscountId(String externalDiscountId) {
    
    this.externalDiscountId = externalDiscountId;
    return this;
  }

   /**
   * 外部优惠id
   * @return externalDiscountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "discount001", value = "外部优惠id")

  public String getExternalDiscountId() {
    return externalDiscountId;
  }


  public void setExternalDiscountId(String externalDiscountId) {
    this.externalDiscountId = externalDiscountId;
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
   * @return the DiscountInfoData instance itself
   */
  public DiscountInfoData putAdditionalProperty(String key, Object value) {
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
    DiscountInfoData discountInfoData = (DiscountInfoData) o;
    return Objects.equals(this.discountAmount, discountInfoData.discountAmount) &&
        Objects.equals(this.discountName, discountInfoData.discountName) &&
        Objects.equals(this.discountPageLink, discountInfoData.discountPageLink) &&
        Objects.equals(this.discountQuantity, discountInfoData.discountQuantity) &&
        Objects.equals(this.externalDiscountId, discountInfoData.externalDiscountId)&&
        Objects.equals(this.additionalProperties, discountInfoData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountAmount, discountName, discountPageLink, discountQuantity, externalDiscountId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountInfoData {\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountName: ").append(toIndentedString(discountName)).append("\n");
    sb.append("    discountPageLink: ").append(toIndentedString(discountPageLink)).append("\n");
    sb.append("    discountQuantity: ").append(toIndentedString(discountQuantity)).append("\n");
    sb.append("    externalDiscountId: ").append(toIndentedString(externalDiscountId)).append("\n");
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
    openapiFields.add("discount_amount");
    openapiFields.add("discount_name");
    openapiFields.add("discount_page_link");
    openapiFields.add("discount_quantity");
    openapiFields.add("external_discount_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DiscountInfoData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DiscountInfoData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DiscountInfoData is not found in the empty JSON string", DiscountInfoData.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("discount_amount") != null && !jsonObj.get("discount_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_amount").toString()));
      }
      if (jsonObj.get("discount_name") != null && !jsonObj.get("discount_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_name").toString()));
      }
      if (jsonObj.get("discount_page_link") != null && !jsonObj.get("discount_page_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_page_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_page_link").toString()));
      }
      if (jsonObj.get("external_discount_id") != null && !jsonObj.get("external_discount_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_discount_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_discount_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiscountInfoData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiscountInfoData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiscountInfoData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiscountInfoData.class));

       return (TypeAdapter<T>) new TypeAdapter<DiscountInfoData>() {
           @Override
           public void write(JsonWriter out, DiscountInfoData value) throws IOException {
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
           public DiscountInfoData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DiscountInfoData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DiscountInfoData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DiscountInfoData
  * @throws IOException if the JSON string is invalid with respect to DiscountInfoData
  */
  public static DiscountInfoData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiscountInfoData.class);
  }

 /**
  * Convert an instance of DiscountInfoData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

