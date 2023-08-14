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
 * DeliverAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeliverAddress {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ADDRESS_CODE = "address_code";
  @SerializedName(SERIALIZED_NAME_ADDRESS_CODE)
  private String addressCode;

  public static final String SERIALIZED_NAME_DEFAULT_DELIVER_ADDRESS = "default_deliver_address";
  @SerializedName(SERIALIZED_NAME_DEFAULT_DELIVER_ADDRESS)
  private String defaultDeliverAddress;

  public static final String SERIALIZED_NAME_DELIVER_AREA = "deliver_area";
  @SerializedName(SERIALIZED_NAME_DELIVER_AREA)
  private String deliverArea;

  public static final String SERIALIZED_NAME_DELIVER_CITY = "deliver_city";
  @SerializedName(SERIALIZED_NAME_DELIVER_CITY)
  private String deliverCity;

  public static final String SERIALIZED_NAME_DELIVER_FULLNAME = "deliver_fullname";
  @SerializedName(SERIALIZED_NAME_DELIVER_FULLNAME)
  private String deliverFullname;

  public static final String SERIALIZED_NAME_DELIVER_MOBILE = "deliver_mobile";
  @SerializedName(SERIALIZED_NAME_DELIVER_MOBILE)
  private String deliverMobile;

  public static final String SERIALIZED_NAME_DELIVER_PHONE = "deliver_phone";
  @SerializedName(SERIALIZED_NAME_DELIVER_PHONE)
  private String deliverPhone;

  public static final String SERIALIZED_NAME_DELIVER_PROVINCE = "deliver_province";
  @SerializedName(SERIALIZED_NAME_DELIVER_PROVINCE)
  private String deliverProvince;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public DeliverAddress() { 
  }

  public DeliverAddress address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 地址
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "地址", value = "地址")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public DeliverAddress addressCode(String addressCode) {
    
    this.addressCode = addressCode;
    return this;
  }

   /**
   * 区域编码
   * @return addressCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "330106", value = "区域编码")

  public String getAddressCode() {
    return addressCode;
  }


  public void setAddressCode(String addressCode) {
    this.addressCode = addressCode;
  }


  public DeliverAddress defaultDeliverAddress(String defaultDeliverAddress) {
    
    this.defaultDeliverAddress = defaultDeliverAddress;
    return this;
  }

   /**
   * 是否默认收货地址
   * @return defaultDeliverAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T", value = "是否默认收货地址")

  public String getDefaultDeliverAddress() {
    return defaultDeliverAddress;
  }


  public void setDefaultDeliverAddress(String defaultDeliverAddress) {
    this.defaultDeliverAddress = defaultDeliverAddress;
  }


  public DeliverAddress deliverArea(String deliverArea) {
    
    this.deliverArea = deliverArea;
    return this;
  }

   /**
   * 收货人所在区县
   * @return deliverArea
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "西湖区", value = "收货人所在区县")

  public String getDeliverArea() {
    return deliverArea;
  }


  public void setDeliverArea(String deliverArea) {
    this.deliverArea = deliverArea;
  }


  public DeliverAddress deliverCity(String deliverCity) {
    
    this.deliverCity = deliverCity;
    return this;
  }

   /**
   * 收货人所在城市
   * @return deliverCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州市", value = "收货人所在城市")

  public String getDeliverCity() {
    return deliverCity;
  }


  public void setDeliverCity(String deliverCity) {
    this.deliverCity = deliverCity;
  }


  public DeliverAddress deliverFullname(String deliverFullname) {
    
    this.deliverFullname = deliverFullname;
    return this;
  }

   /**
   * 收货人全名
   * @return deliverFullname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "支小宝", value = "收货人全名")

  public String getDeliverFullname() {
    return deliverFullname;
  }


  public void setDeliverFullname(String deliverFullname) {
    this.deliverFullname = deliverFullname;
  }


  public DeliverAddress deliverMobile(String deliverMobile) {
    
    this.deliverMobile = deliverMobile;
    return this;
  }

   /**
   * 收货地址的联系人移动电话
   * @return deliverMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "131XXXXXXXX", value = "收货地址的联系人移动电话")

  public String getDeliverMobile() {
    return deliverMobile;
  }


  public void setDeliverMobile(String deliverMobile) {
    this.deliverMobile = deliverMobile;
  }


  public DeliverAddress deliverPhone(String deliverPhone) {
    
    this.deliverPhone = deliverPhone;
    return this;
  }

   /**
   * 收货地址的联系人固定电话
   * @return deliverPhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0517-28888888", value = "收货地址的联系人固定电话")

  public String getDeliverPhone() {
    return deliverPhone;
  }


  public void setDeliverPhone(String deliverPhone) {
    this.deliverPhone = deliverPhone;
  }


  public DeliverAddress deliverProvince(String deliverProvince) {
    
    this.deliverProvince = deliverProvince;
    return this;
  }

   /**
   * 收货人所在省份
   * @return deliverProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "浙江省", value = "收货人所在省份")

  public String getDeliverProvince() {
    return deliverProvince;
  }


  public void setDeliverProvince(String deliverProvince) {
    this.deliverProvince = deliverProvince;
  }


  public DeliverAddress zip(String zip) {
    
    this.zip = zip;
    return this;
  }

   /**
   * 邮政编码
   * @return zip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "310000", value = "邮政编码")

  public String getZip() {
    return zip;
  }


  public void setZip(String zip) {
    this.zip = zip;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliverAddress deliverAddress = (DeliverAddress) o;
    return Objects.equals(this.address, deliverAddress.address) &&
        Objects.equals(this.addressCode, deliverAddress.addressCode) &&
        Objects.equals(this.defaultDeliverAddress, deliverAddress.defaultDeliverAddress) &&
        Objects.equals(this.deliverArea, deliverAddress.deliverArea) &&
        Objects.equals(this.deliverCity, deliverAddress.deliverCity) &&
        Objects.equals(this.deliverFullname, deliverAddress.deliverFullname) &&
        Objects.equals(this.deliverMobile, deliverAddress.deliverMobile) &&
        Objects.equals(this.deliverPhone, deliverAddress.deliverPhone) &&
        Objects.equals(this.deliverProvince, deliverAddress.deliverProvince) &&
        Objects.equals(this.zip, deliverAddress.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, addressCode, defaultDeliverAddress, deliverArea, deliverCity, deliverFullname, deliverMobile, deliverPhone, deliverProvince, zip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliverAddress {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressCode: ").append(toIndentedString(addressCode)).append("\n");
    sb.append("    defaultDeliverAddress: ").append(toIndentedString(defaultDeliverAddress)).append("\n");
    sb.append("    deliverArea: ").append(toIndentedString(deliverArea)).append("\n");
    sb.append("    deliverCity: ").append(toIndentedString(deliverCity)).append("\n");
    sb.append("    deliverFullname: ").append(toIndentedString(deliverFullname)).append("\n");
    sb.append("    deliverMobile: ").append(toIndentedString(deliverMobile)).append("\n");
    sb.append("    deliverPhone: ").append(toIndentedString(deliverPhone)).append("\n");
    sb.append("    deliverProvince: ").append(toIndentedString(deliverProvince)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("address_code");
    openapiFields.add("default_deliver_address");
    openapiFields.add("deliver_area");
    openapiFields.add("deliver_city");
    openapiFields.add("deliver_fullname");
    openapiFields.add("deliver_mobile");
    openapiFields.add("deliver_phone");
    openapiFields.add("deliver_province");
    openapiFields.add("zip");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeliverAddress
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeliverAddress.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliverAddress is not found in the empty JSON string", DeliverAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeliverAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeliverAddress` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("address_code") != null && !jsonObj.get("address_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_code").toString()));
      }
      if (jsonObj.get("default_deliver_address") != null && !jsonObj.get("default_deliver_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_deliver_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_deliver_address").toString()));
      }
      if (jsonObj.get("deliver_area") != null && !jsonObj.get("deliver_area").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliver_area` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliver_area").toString()));
      }
      if (jsonObj.get("deliver_city") != null && !jsonObj.get("deliver_city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliver_city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliver_city").toString()));
      }
      if (jsonObj.get("deliver_fullname") != null && !jsonObj.get("deliver_fullname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliver_fullname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliver_fullname").toString()));
      }
      if (jsonObj.get("deliver_mobile") != null && !jsonObj.get("deliver_mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliver_mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliver_mobile").toString()));
      }
      if (jsonObj.get("deliver_phone") != null && !jsonObj.get("deliver_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliver_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliver_phone").toString()));
      }
      if (jsonObj.get("deliver_province") != null && !jsonObj.get("deliver_province").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliver_province` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliver_province").toString()));
      }
      if (jsonObj.get("zip") != null && !jsonObj.get("zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliverAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliverAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliverAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliverAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliverAddress>() {
           @Override
           public void write(JsonWriter out, DeliverAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliverAddress read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeliverAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliverAddress
  * @throws IOException if the JSON string is invalid with respect to DeliverAddress
  */
  public static DeliverAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliverAddress.class);
  }

 /**
  * Convert an instance of DeliverAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

