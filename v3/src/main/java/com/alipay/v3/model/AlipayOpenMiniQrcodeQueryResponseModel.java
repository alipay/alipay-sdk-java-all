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
import com.alipay.v3.model.QrCodeRouteGroup;
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
 * AlipayOpenMiniQrcodeQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniQrcodeQueryResponseModel {
  public static final String SERIALIZED_NAME_QR_CODE_ROUTE_GROUPS = "qr_code_route_groups";
  @SerializedName(SERIALIZED_NAME_QR_CODE_ROUTE_GROUPS)
  private List<QrCodeRouteGroup> qrCodeRouteGroups = null;

  public static final String SERIALIZED_NAME_TOTAL_ITEMS = "total_items";
  @SerializedName(SERIALIZED_NAME_TOTAL_ITEMS)
  private Integer totalItems;

  public AlipayOpenMiniQrcodeQueryResponseModel() { 
  }

  public AlipayOpenMiniQrcodeQueryResponseModel qrCodeRouteGroups(List<QrCodeRouteGroup> qrCodeRouteGroups) {
    
    this.qrCodeRouteGroups = qrCodeRouteGroups;
    return this;
  }

  public AlipayOpenMiniQrcodeQueryResponseModel addQrCodeRouteGroupsItem(QrCodeRouteGroup qrCodeRouteGroupsItem) {
    if (this.qrCodeRouteGroups == null) {
      this.qrCodeRouteGroups = new ArrayList<>();
    }
    this.qrCodeRouteGroups.add(qrCodeRouteGroupsItem);
    return this;
  }

   /**
   * 规则路由数据列表
   * @return qrCodeRouteGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "规则路由数据列表")

  public List<QrCodeRouteGroup> getQrCodeRouteGroups() {
    return qrCodeRouteGroups;
  }


  public void setQrCodeRouteGroups(List<QrCodeRouteGroup> qrCodeRouteGroups) {
    this.qrCodeRouteGroups = qrCodeRouteGroups;
  }


  public AlipayOpenMiniQrcodeQueryResponseModel totalItems(Integer totalItems) {
    
    this.totalItems = totalItems;
    return this;
  }

   /**
   * 数据总数
   * @return totalItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "数据总数")

  public Integer getTotalItems() {
    return totalItems;
  }


  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniQrcodeQueryResponseModel alipayOpenMiniQrcodeQueryResponseModel = (AlipayOpenMiniQrcodeQueryResponseModel) o;
    return Objects.equals(this.qrCodeRouteGroups, alipayOpenMiniQrcodeQueryResponseModel.qrCodeRouteGroups) &&
        Objects.equals(this.totalItems, alipayOpenMiniQrcodeQueryResponseModel.totalItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qrCodeRouteGroups, totalItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniQrcodeQueryResponseModel {\n");
    sb.append("    qrCodeRouteGroups: ").append(toIndentedString(qrCodeRouteGroups)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
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
    openapiFields.add("qr_code_route_groups");
    openapiFields.add("total_items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniQrcodeQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniQrcodeQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniQrcodeQueryResponseModel is not found in the empty JSON string", AlipayOpenMiniQrcodeQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniQrcodeQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniQrcodeQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayqrCodeRouteGroups = jsonObj.getAsJsonArray("qr_code_route_groups");
      if (jsonArrayqrCodeRouteGroups != null) {
        // ensure the json data is an array
        if (!jsonObj.get("qr_code_route_groups").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `qr_code_route_groups` to be an array in the JSON string but got `%s`", jsonObj.get("qr_code_route_groups").toString()));
        }

        // validate the optional field `qr_code_route_groups` (array)
        for (int i = 0; i < jsonArrayqrCodeRouteGroups.size(); i++) {
          QrCodeRouteGroup.validateJsonObject(jsonArrayqrCodeRouteGroups.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniQrcodeQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniQrcodeQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniQrcodeQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniQrcodeQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniQrcodeQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniQrcodeQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniQrcodeQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniQrcodeQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniQrcodeQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniQrcodeQueryResponseModel
  */
  public static AlipayOpenMiniQrcodeQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniQrcodeQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniQrcodeQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

