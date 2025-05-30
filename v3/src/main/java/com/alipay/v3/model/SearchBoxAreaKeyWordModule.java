/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-01-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.SearchBoxKeywordInfo;
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
 * SearchBoxAreaKeyWordModule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchBoxAreaKeyWordModule {
  public static final String SERIALIZED_NAME_LATEST_AUDIT_AREA_KEYWORD_INFO = "latest_audit_area_keyword_info";
  @SerializedName(SERIALIZED_NAME_LATEST_AUDIT_AREA_KEYWORD_INFO)
  private SearchBoxKeywordInfo latestAuditAreaKeywordInfo;

  public static final String SERIALIZED_NAME_MODULE_ID = "module_id";
  @SerializedName(SERIALIZED_NAME_MODULE_ID)
  private String moduleId;

  public static final String SERIALIZED_NAME_MODULE_TYPE = "module_type";
  @SerializedName(SERIALIZED_NAME_MODULE_TYPE)
  private String moduleType;

  public static final String SERIALIZED_NAME_VALID_AREA_KEYWORD_INFO = "valid_area_keyword_info";
  @SerializedName(SERIALIZED_NAME_VALID_AREA_KEYWORD_INFO)
  private SearchBoxKeywordInfo validAreaKeywordInfo;

  public SearchBoxAreaKeyWordModule() { 
  }

  public SearchBoxAreaKeyWordModule latestAuditAreaKeywordInfo(SearchBoxKeywordInfo latestAuditAreaKeywordInfo) {
    
    this.latestAuditAreaKeywordInfo = latestAuditAreaKeywordInfo;
    return this;
  }

   /**
   * Get latestAuditAreaKeywordInfo
   * @return latestAuditAreaKeywordInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SearchBoxKeywordInfo getLatestAuditAreaKeywordInfo() {
    return latestAuditAreaKeywordInfo;
  }


  public void setLatestAuditAreaKeywordInfo(SearchBoxKeywordInfo latestAuditAreaKeywordInfo) {
    this.latestAuditAreaKeywordInfo = latestAuditAreaKeywordInfo;
  }


  public SearchBoxAreaKeyWordModule moduleId(String moduleId) {
    
    this.moduleId = moduleId;
    return this;
  }

   /**
   * 模块id
   * @return moduleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20220308000000168465", value = "模块id")

  public String getModuleId() {
    return moduleId;
  }


  public void setModuleId(String moduleId) {
    this.moduleId = moduleId;
  }


  public SearchBoxAreaKeyWordModule moduleType(String moduleType) {
    
    this.moduleType = moduleType;
    return this;
  }

   /**
   * 搜索直达模块类型，BOX_EXCLUSIVE_BASE-基础信息/BOX_EXCLUSIVE_KEYWORD-关键词/BOX_EXCLUSIVE_FUNCTIONS-功能服务/BOX_EXCLUSIVE_ACCOUNTS-关联账号/BOX_ATMOSPHERE_IMAGE-氛围图
   * @return moduleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BOX_EXCLUSIVE_AREA_KEYWORD", value = "搜索直达模块类型，BOX_EXCLUSIVE_BASE-基础信息/BOX_EXCLUSIVE_KEYWORD-关键词/BOX_EXCLUSIVE_FUNCTIONS-功能服务/BOX_EXCLUSIVE_ACCOUNTS-关联账号/BOX_ATMOSPHERE_IMAGE-氛围图")

  public String getModuleType() {
    return moduleType;
  }


  public void setModuleType(String moduleType) {
    this.moduleType = moduleType;
  }


  public SearchBoxAreaKeyWordModule validAreaKeywordInfo(SearchBoxKeywordInfo validAreaKeywordInfo) {
    
    this.validAreaKeywordInfo = validAreaKeywordInfo;
    return this;
  }

   /**
   * Get validAreaKeywordInfo
   * @return validAreaKeywordInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SearchBoxKeywordInfo getValidAreaKeywordInfo() {
    return validAreaKeywordInfo;
  }


  public void setValidAreaKeywordInfo(SearchBoxKeywordInfo validAreaKeywordInfo) {
    this.validAreaKeywordInfo = validAreaKeywordInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchBoxAreaKeyWordModule searchBoxAreaKeyWordModule = (SearchBoxAreaKeyWordModule) o;
    return Objects.equals(this.latestAuditAreaKeywordInfo, searchBoxAreaKeyWordModule.latestAuditAreaKeywordInfo) &&
        Objects.equals(this.moduleId, searchBoxAreaKeyWordModule.moduleId) &&
        Objects.equals(this.moduleType, searchBoxAreaKeyWordModule.moduleType) &&
        Objects.equals(this.validAreaKeywordInfo, searchBoxAreaKeyWordModule.validAreaKeywordInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latestAuditAreaKeywordInfo, moduleId, moduleType, validAreaKeywordInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchBoxAreaKeyWordModule {\n");
    sb.append("    latestAuditAreaKeywordInfo: ").append(toIndentedString(latestAuditAreaKeywordInfo)).append("\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    moduleType: ").append(toIndentedString(moduleType)).append("\n");
    sb.append("    validAreaKeywordInfo: ").append(toIndentedString(validAreaKeywordInfo)).append("\n");
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
    openapiFields.add("latest_audit_area_keyword_info");
    openapiFields.add("module_id");
    openapiFields.add("module_type");
    openapiFields.add("valid_area_keyword_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchBoxAreaKeyWordModule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchBoxAreaKeyWordModule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchBoxAreaKeyWordModule is not found in the empty JSON string", SearchBoxAreaKeyWordModule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchBoxAreaKeyWordModule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchBoxAreaKeyWordModule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `latest_audit_area_keyword_info`
      if (jsonObj.getAsJsonObject("latest_audit_area_keyword_info") != null) {
        SearchBoxKeywordInfo.validateJsonObject(jsonObj.getAsJsonObject("latest_audit_area_keyword_info"));
      }
      if (jsonObj.get("module_id") != null && !jsonObj.get("module_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `module_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("module_id").toString()));
      }
      if (jsonObj.get("module_type") != null && !jsonObj.get("module_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `module_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("module_type").toString()));
      }
      // validate the optional field `valid_area_keyword_info`
      if (jsonObj.getAsJsonObject("valid_area_keyword_info") != null) {
        SearchBoxKeywordInfo.validateJsonObject(jsonObj.getAsJsonObject("valid_area_keyword_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchBoxAreaKeyWordModule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchBoxAreaKeyWordModule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchBoxAreaKeyWordModule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchBoxAreaKeyWordModule.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchBoxAreaKeyWordModule>() {
           @Override
           public void write(JsonWriter out, SearchBoxAreaKeyWordModule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchBoxAreaKeyWordModule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchBoxAreaKeyWordModule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchBoxAreaKeyWordModule
  * @throws IOException if the JSON string is invalid with respect to SearchBoxAreaKeyWordModule
  */
  public static SearchBoxAreaKeyWordModule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchBoxAreaKeyWordModule.class);
  }

 /**
  * Convert an instance of SearchBoxAreaKeyWordModule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

