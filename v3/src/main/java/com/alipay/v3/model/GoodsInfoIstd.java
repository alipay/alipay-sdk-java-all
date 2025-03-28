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
 * GoodsInfoIstd
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GoodsInfoIstd {
  public static final String SERIALIZED_NAME_DELIVERY_INFO = "delivery_info";
  @SerializedName(SERIALIZED_NAME_DELIVERY_INFO)
  private String deliveryInfo;

  public static final String SERIALIZED_NAME_FIRST_CLASS = "first_class";
  @SerializedName(SERIALIZED_NAME_FIRST_CLASS)
  private String firstClass;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private Integer length;

  public static final String SERIALIZED_NAME_PICKUP_INFO = "pickup_info";
  @SerializedName(SERIALIZED_NAME_PICKUP_INFO)
  private String pickupInfo;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_SECOND_CLASS = "second_class";
  @SerializedName(SERIALIZED_NAME_SECOND_CLASS)
  private String secondClass;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private String weight;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public GoodsInfoIstd() { 
  }

  public GoodsInfoIstd deliveryInfo(String deliveryInfo) {
    
    this.deliveryInfo = deliveryInfo;
    return this;
  }

   /**
   * 交货信息，用于骑手交付商品
   * @return deliveryInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "交货信息，用于骑手交付商品")

  public String getDeliveryInfo() {
    return deliveryInfo;
  }


  public void setDeliveryInfo(String deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
  }


  public GoodsInfoIstd firstClass(String firstClass) {
    
    this.firstClass = firstClass;
    return this;
  }

   /**
   * 一级品类类目
   * @return firstClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "一级品类类目")

  public String getFirstClass() {
    return firstClass;
  }


  public void setFirstClass(String firstClass) {
    this.firstClass = firstClass;
  }


  public GoodsInfoIstd height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * 商品高度，单位为cm
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品高度，单位为cm")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public GoodsInfoIstd length(Integer length) {
    
    this.length = length;
    return this;
  }

   /**
   * 商品长度，单位为cm
   * @return length
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品长度，单位为cm")

  public Integer getLength() {
    return length;
  }


  public void setLength(Integer length) {
    this.length = length;
  }


  public GoodsInfoIstd pickupInfo(String pickupInfo) {
    
    this.pickupInfo = pickupInfo;
    return this;
  }

   /**
   * 取货信息，用于骑手到店取货
   * @return pickupInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "取货信息，用于骑手到店取货")

  public String getPickupInfo() {
    return pickupInfo;
  }


  public void setPickupInfo(String pickupInfo) {
    this.pickupInfo = pickupInfo;
  }


  public GoodsInfoIstd price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * 总价
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "总价")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    this.price = price;
  }


  public GoodsInfoIstd secondClass(String secondClass) {
    
    this.secondClass = secondClass;
    return this;
  }

   /**
   * 二级品类类目
   * @return secondClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "二级品类类目")

  public String getSecondClass() {
    return secondClass;
  }


  public void setSecondClass(String secondClass) {
    this.secondClass = secondClass;
  }


  public GoodsInfoIstd weight(String weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * 货物重量，单位为kg，精确到小数点后两位
   * @return weight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "货物重量，单位为kg，精确到小数点后两位")

  public String getWeight() {
    return weight;
  }


  public void setWeight(String weight) {
    this.weight = weight;
  }


  public GoodsInfoIstd width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * 商品宽度，单位为cm
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品宽度，单位为cm")

  public Integer getWidth() {
    return width;
  }


  public void setWidth(Integer width) {
    this.width = width;
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
   * @return the GoodsInfoIstd instance itself
   */
  public GoodsInfoIstd putAdditionalProperty(String key, Object value) {
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
    GoodsInfoIstd goodsInfoIstd = (GoodsInfoIstd) o;
    return Objects.equals(this.deliveryInfo, goodsInfoIstd.deliveryInfo) &&
        Objects.equals(this.firstClass, goodsInfoIstd.firstClass) &&
        Objects.equals(this.height, goodsInfoIstd.height) &&
        Objects.equals(this.length, goodsInfoIstd.length) &&
        Objects.equals(this.pickupInfo, goodsInfoIstd.pickupInfo) &&
        Objects.equals(this.price, goodsInfoIstd.price) &&
        Objects.equals(this.secondClass, goodsInfoIstd.secondClass) &&
        Objects.equals(this.weight, goodsInfoIstd.weight) &&
        Objects.equals(this.width, goodsInfoIstd.width)&&
        Objects.equals(this.additionalProperties, goodsInfoIstd.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryInfo, firstClass, height, length, pickupInfo, price, secondClass, weight, width, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsInfoIstd {\n");
    sb.append("    deliveryInfo: ").append(toIndentedString(deliveryInfo)).append("\n");
    sb.append("    firstClass: ").append(toIndentedString(firstClass)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    pickupInfo: ").append(toIndentedString(pickupInfo)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    secondClass: ").append(toIndentedString(secondClass)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("delivery_info");
    openapiFields.add("first_class");
    openapiFields.add("height");
    openapiFields.add("length");
    openapiFields.add("pickup_info");
    openapiFields.add("price");
    openapiFields.add("second_class");
    openapiFields.add("weight");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GoodsInfoIstd
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GoodsInfoIstd.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoodsInfoIstd is not found in the empty JSON string", GoodsInfoIstd.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("delivery_info") != null && !jsonObj.get("delivery_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_info").toString()));
      }
      if (jsonObj.get("first_class") != null && !jsonObj.get("first_class").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_class` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_class").toString()));
      }
      if (jsonObj.get("pickup_info") != null && !jsonObj.get("pickup_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pickup_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pickup_info").toString()));
      }
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price").toString()));
      }
      if (jsonObj.get("second_class") != null && !jsonObj.get("second_class").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `second_class` to be a primitive type in the JSON string but got `%s`", jsonObj.get("second_class").toString()));
      }
      if (jsonObj.get("weight") != null && !jsonObj.get("weight").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `weight` to be a primitive type in the JSON string but got `%s`", jsonObj.get("weight").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoodsInfoIstd.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoodsInfoIstd' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoodsInfoIstd> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoodsInfoIstd.class));

       return (TypeAdapter<T>) new TypeAdapter<GoodsInfoIstd>() {
           @Override
           public void write(JsonWriter out, GoodsInfoIstd value) throws IOException {
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
           public GoodsInfoIstd read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GoodsInfoIstd instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GoodsInfoIstd given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoodsInfoIstd
  * @throws IOException if the JSON string is invalid with respect to GoodsInfoIstd
  */
  public static GoodsInfoIstd fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoodsInfoIstd.class);
  }

 /**
  * Convert an instance of GoodsInfoIstd to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

