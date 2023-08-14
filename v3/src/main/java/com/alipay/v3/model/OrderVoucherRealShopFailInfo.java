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
 * OrderVoucherRealShopFailInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderVoucherRealShopFailInfo {
  public static final String SERIALIZED_NAME_FAIL_MESSAGE = "fail_message";
  @SerializedName(SERIALIZED_NAME_FAIL_MESSAGE)
  private String failMessage;

  public static final String SERIALIZED_NAME_FAIL_REASONS = "fail_reasons";
  @SerializedName(SERIALIZED_NAME_FAIL_REASONS)
  private List<String> failReasons = null;

  public static final String SERIALIZED_NAME_REAL_SHOP_ID = "real_shop_id";
  @SerializedName(SERIALIZED_NAME_REAL_SHOP_ID)
  private String realShopId;

  public OrderVoucherRealShopFailInfo() { 
  }

  public OrderVoucherRealShopFailInfo failMessage(String failMessage) {
    
    this.failMessage = failMessage;
    return this;
  }

   /**
   * 请求失败提示信息。
   * @return failMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求失败提示信息。")

  public String getFailMessage() {
    return failMessage;
  }


  public void setFailMessage(String failMessage) {
    this.failMessage = failMessage;
  }


  public OrderVoucherRealShopFailInfo failReasons(List<String> failReasons) {
    
    this.failReasons = failReasons;
    return this;
  }

  public OrderVoucherRealShopFailInfo addFailReasonsItem(String failReasonsItem) {
    if (this.failReasons == null) {
      this.failReasons = new ArrayList<>();
    }
    this.failReasons.add(failReasonsItem);
    return this;
  }

   /**
   * 请求失败原因。
   * @return failReasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求失败原因。")

  public List<String> getFailReasons() {
    return failReasons;
  }


  public void setFailReasons(List<String> failReasons) {
    this.failReasons = failReasons;
  }


  public OrderVoucherRealShopFailInfo realShopId(String realShopId) {
    
    this.realShopId = realShopId;
    return this;
  }

   /**
   * 请求失败的代运营商业关系门店 ID。
   * @return realShopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求失败的代运营商业关系门店 ID。")

  public String getRealShopId() {
    return realShopId;
  }


  public void setRealShopId(String realShopId) {
    this.realShopId = realShopId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderVoucherRealShopFailInfo orderVoucherRealShopFailInfo = (OrderVoucherRealShopFailInfo) o;
    return Objects.equals(this.failMessage, orderVoucherRealShopFailInfo.failMessage) &&
        Objects.equals(this.failReasons, orderVoucherRealShopFailInfo.failReasons) &&
        Objects.equals(this.realShopId, orderVoucherRealShopFailInfo.realShopId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failMessage, failReasons, realShopId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderVoucherRealShopFailInfo {\n");
    sb.append("    failMessage: ").append(toIndentedString(failMessage)).append("\n");
    sb.append("    failReasons: ").append(toIndentedString(failReasons)).append("\n");
    sb.append("    realShopId: ").append(toIndentedString(realShopId)).append("\n");
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
    openapiFields.add("fail_message");
    openapiFields.add("fail_reasons");
    openapiFields.add("real_shop_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderVoucherRealShopFailInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderVoucherRealShopFailInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderVoucherRealShopFailInfo is not found in the empty JSON string", OrderVoucherRealShopFailInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderVoucherRealShopFailInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderVoucherRealShopFailInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("fail_message") != null && !jsonObj.get("fail_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fail_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fail_message").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("fail_reasons") != null && !jsonObj.get("fail_reasons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fail_reasons` to be an array in the JSON string but got `%s`", jsonObj.get("fail_reasons").toString()));
      }
      if (jsonObj.get("real_shop_id") != null && !jsonObj.get("real_shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `real_shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("real_shop_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderVoucherRealShopFailInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderVoucherRealShopFailInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderVoucherRealShopFailInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderVoucherRealShopFailInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderVoucherRealShopFailInfo>() {
           @Override
           public void write(JsonWriter out, OrderVoucherRealShopFailInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderVoucherRealShopFailInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderVoucherRealShopFailInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderVoucherRealShopFailInfo
  * @throws IOException if the JSON string is invalid with respect to OrderVoucherRealShopFailInfo
  */
  public static OrderVoucherRealShopFailInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderVoucherRealShopFailInfo.class);
  }

 /**
  * Convert an instance of OrderVoucherRealShopFailInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

