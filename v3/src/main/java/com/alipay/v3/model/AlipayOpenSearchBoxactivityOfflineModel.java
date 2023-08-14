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
 * AlipayOpenSearchBoxactivityOfflineModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSearchBoxactivityOfflineModel {
  public static final String SERIALIZED_NAME_BOX_ACTIVITY_ID = "box_activity_id";
  @SerializedName(SERIALIZED_NAME_BOX_ACTIVITY_ID)
  private String boxActivityId;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public AlipayOpenSearchBoxactivityOfflineModel() { 
  }

  public AlipayOpenSearchBoxactivityOfflineModel boxActivityId(String boxActivityId) {
    
    this.boxActivityId = boxActivityId;
    return this;
  }

   /**
   * 搜索直达活动id
   * @return boxActivityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20211223000000100000", value = "搜索直达活动id")

  public String getBoxActivityId() {
    return boxActivityId;
  }


  public void setBoxActivityId(String boxActivityId) {
    this.boxActivityId = boxActivityId;
  }


  public AlipayOpenSearchBoxactivityOfflineModel merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * 商户id，代运营模式下传入。代运营模式，需要服务商已获得商家\&quot;运营支付宝小程序\&quot;授权。
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxxxxxxxxxx", value = "商户id，代运营模式下传入。代运营模式，需要服务商已获得商家\"运营支付宝小程序\"授权。")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenSearchBoxactivityOfflineModel alipayOpenSearchBoxactivityOfflineModel = (AlipayOpenSearchBoxactivityOfflineModel) o;
    return Objects.equals(this.boxActivityId, alipayOpenSearchBoxactivityOfflineModel.boxActivityId) &&
        Objects.equals(this.merchantId, alipayOpenSearchBoxactivityOfflineModel.merchantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxActivityId, merchantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSearchBoxactivityOfflineModel {\n");
    sb.append("    boxActivityId: ").append(toIndentedString(boxActivityId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
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
    openapiFields.add("box_activity_id");
    openapiFields.add("merchant_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSearchBoxactivityOfflineModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSearchBoxactivityOfflineModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSearchBoxactivityOfflineModel is not found in the empty JSON string", AlipayOpenSearchBoxactivityOfflineModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenSearchBoxactivityOfflineModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenSearchBoxactivityOfflineModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("box_activity_id") != null && !jsonObj.get("box_activity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_activity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box_activity_id").toString()));
      }
      if (jsonObj.get("merchant_id") != null && !jsonObj.get("merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSearchBoxactivityOfflineModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSearchBoxactivityOfflineModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSearchBoxactivityOfflineModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSearchBoxactivityOfflineModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSearchBoxactivityOfflineModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSearchBoxactivityOfflineModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSearchBoxactivityOfflineModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSearchBoxactivityOfflineModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSearchBoxactivityOfflineModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSearchBoxactivityOfflineModel
  */
  public static AlipayOpenSearchBoxactivityOfflineModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSearchBoxactivityOfflineModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSearchBoxactivityOfflineModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

