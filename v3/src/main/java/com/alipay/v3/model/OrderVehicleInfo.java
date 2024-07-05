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
 * OrderVehicleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderVehicleInfo {
  public static final String SERIALIZED_NAME_LICENSE_PLATE_NO = "license_plate_no";
  @SerializedName(SERIALIZED_NAME_LICENSE_PLATE_NO)
  private String licensePlateNo;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_SHIFT_NO = "shift_no";
  @SerializedName(SERIALIZED_NAME_SHIFT_NO)
  private String shiftNo;

  public OrderVehicleInfo() { 
  }

  public OrderVehicleInfo licensePlateNo(String licensePlateNo) {
    
    this.licensePlateNo = licensePlateNo;
    return this;
  }

   /**
   * 交通工具牌照号，如车牌号等
   * @return licensePlateNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "沪A888888", value = "交通工具牌照号，如车牌号等")

  public String getLicensePlateNo() {
    return licensePlateNo;
  }


  public void setLicensePlateNo(String licensePlateNo) {
    this.licensePlateNo = licensePlateNo;
  }


  public OrderVehicleInfo memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 备注信息
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "备注", value = "备注信息")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public OrderVehicleInfo shiftNo(String shiftNo) {
    
    this.shiftNo = shiftNo;
    return this;
  }

   /**
   * 班次
   * @return shiftNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "班次", value = "班次")

  public String getShiftNo() {
    return shiftNo;
  }


  public void setShiftNo(String shiftNo) {
    this.shiftNo = shiftNo;
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
   * @return the OrderVehicleInfo instance itself
   */
  public OrderVehicleInfo putAdditionalProperty(String key, Object value) {
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
    OrderVehicleInfo orderVehicleInfo = (OrderVehicleInfo) o;
    return Objects.equals(this.licensePlateNo, orderVehicleInfo.licensePlateNo) &&
        Objects.equals(this.memo, orderVehicleInfo.memo) &&
        Objects.equals(this.shiftNo, orderVehicleInfo.shiftNo)&&
        Objects.equals(this.additionalProperties, orderVehicleInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licensePlateNo, memo, shiftNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderVehicleInfo {\n");
    sb.append("    licensePlateNo: ").append(toIndentedString(licensePlateNo)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    shiftNo: ").append(toIndentedString(shiftNo)).append("\n");
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
    openapiFields.add("license_plate_no");
    openapiFields.add("memo");
    openapiFields.add("shift_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderVehicleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderVehicleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderVehicleInfo is not found in the empty JSON string", OrderVehicleInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("license_plate_no") != null && !jsonObj.get("license_plate_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_plate_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_plate_no").toString()));
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("shift_no") != null && !jsonObj.get("shift_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shift_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shift_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderVehicleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderVehicleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderVehicleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderVehicleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderVehicleInfo>() {
           @Override
           public void write(JsonWriter out, OrderVehicleInfo value) throws IOException {
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
           public OrderVehicleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrderVehicleInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrderVehicleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderVehicleInfo
  * @throws IOException if the JSON string is invalid with respect to OrderVehicleInfo
  */
  public static OrderVehicleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderVehicleInfo.class);
  }

 /**
  * Convert an instance of OrderVehicleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

