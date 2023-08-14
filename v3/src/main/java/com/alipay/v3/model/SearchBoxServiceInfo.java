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
 * SearchBoxServiceInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchBoxServiceInfo {
  public static final String SERIALIZED_NAME_SERVICE_CATEGORY_CODE = "service_category_code";
  @SerializedName(SERIALIZED_NAME_SERVICE_CATEGORY_CODE)
  private String serviceCategoryCode;

  public static final String SERIALIZED_NAME_SERVICE_CATEGORY_NAME = "service_category_name";
  @SerializedName(SERIALIZED_NAME_SERVICE_CATEGORY_NAME)
  private String serviceCategoryName;

  public static final String SERIALIZED_NAME_SERVICE_CODE = "service_code";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODE)
  private String serviceCode;

  public static final String SERIALIZED_NAME_SERVICE_NAME = "service_name";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public SearchBoxServiceInfo() { 
  }

  public SearchBoxServiceInfo serviceCategoryCode(String serviceCategoryCode) {
    
    this.serviceCategoryCode = serviceCategoryCode;
    return this;
  }

   /**
   * 服务类目编码
   * @return serviceCategoryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "服务类目编码")

  public String getServiceCategoryCode() {
    return serviceCategoryCode;
  }


  public void setServiceCategoryCode(String serviceCategoryCode) {
    this.serviceCategoryCode = serviceCategoryCode;
  }


  public SearchBoxServiceInfo serviceCategoryName(String serviceCategoryName) {
    
    this.serviceCategoryName = serviceCategoryName;
    return this;
  }

   /**
   * 服务类目名称
   * @return serviceCategoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "服务类目名称")

  public String getServiceCategoryName() {
    return serviceCategoryName;
  }


  public void setServiceCategoryName(String serviceCategoryName) {
    this.serviceCategoryName = serviceCategoryName;
  }


  public SearchBoxServiceInfo serviceCode(String serviceCode) {
    
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * 服务编码
   * @return serviceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "服务编码")

  public String getServiceCode() {
    return serviceCode;
  }


  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }


  public SearchBoxServiceInfo serviceName(String serviceName) {
    
    this.serviceName = serviceName;
    return this;
  }

   /**
   * 服务名称
   * @return serviceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "服务名称")

  public String getServiceName() {
    return serviceName;
  }


  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchBoxServiceInfo searchBoxServiceInfo = (SearchBoxServiceInfo) o;
    return Objects.equals(this.serviceCategoryCode, searchBoxServiceInfo.serviceCategoryCode) &&
        Objects.equals(this.serviceCategoryName, searchBoxServiceInfo.serviceCategoryName) &&
        Objects.equals(this.serviceCode, searchBoxServiceInfo.serviceCode) &&
        Objects.equals(this.serviceName, searchBoxServiceInfo.serviceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceCategoryCode, serviceCategoryName, serviceCode, serviceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchBoxServiceInfo {\n");
    sb.append("    serviceCategoryCode: ").append(toIndentedString(serviceCategoryCode)).append("\n");
    sb.append("    serviceCategoryName: ").append(toIndentedString(serviceCategoryName)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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
    openapiFields.add("service_category_code");
    openapiFields.add("service_category_name");
    openapiFields.add("service_code");
    openapiFields.add("service_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchBoxServiceInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchBoxServiceInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchBoxServiceInfo is not found in the empty JSON string", SearchBoxServiceInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchBoxServiceInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchBoxServiceInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("service_category_code") != null && !jsonObj.get("service_category_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_category_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_category_code").toString()));
      }
      if (jsonObj.get("service_category_name") != null && !jsonObj.get("service_category_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_category_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_category_name").toString()));
      }
      if (jsonObj.get("service_code") != null && !jsonObj.get("service_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_code").toString()));
      }
      if (jsonObj.get("service_name") != null && !jsonObj.get("service_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchBoxServiceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchBoxServiceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchBoxServiceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchBoxServiceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchBoxServiceInfo>() {
           @Override
           public void write(JsonWriter out, SearchBoxServiceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchBoxServiceInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchBoxServiceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchBoxServiceInfo
  * @throws IOException if the JSON string is invalid with respect to SearchBoxServiceInfo
  */
  public static SearchBoxServiceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchBoxServiceInfo.class);
  }

 /**
  * Convert an instance of SearchBoxServiceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

