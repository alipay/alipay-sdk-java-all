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
import com.alipay.v3.model.BoxBusinessDistrictInfo;
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
 * BoxBusinessDistrictModule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BoxBusinessDistrictModule {
  public static final String SERIALIZED_NAME_BUSINESS_DISTRICT_INFOS = "business_district_infos";
  @SerializedName(SERIALIZED_NAME_BUSINESS_DISTRICT_INFOS)
  private List<BoxBusinessDistrictInfo> businessDistrictInfos = null;

  public static final String SERIALIZED_NAME_MODULE_ID = "module_id";
  @SerializedName(SERIALIZED_NAME_MODULE_ID)
  private String moduleId;

  public static final String SERIALIZED_NAME_MODULE_TYPE = "module_type";
  @SerializedName(SERIALIZED_NAME_MODULE_TYPE)
  private String moduleType;

  public BoxBusinessDistrictModule() { 
  }

  public BoxBusinessDistrictModule businessDistrictInfos(List<BoxBusinessDistrictInfo> businessDistrictInfos) {
    
    this.businessDistrictInfos = businessDistrictInfos;
    return this;
  }

  public BoxBusinessDistrictModule addBusinessDistrictInfosItem(BoxBusinessDistrictInfo businessDistrictInfosItem) {
    if (this.businessDistrictInfos == null) {
      this.businessDistrictInfos = new ArrayList<>();
    }
    this.businessDistrictInfos.add(businessDistrictInfosItem);
    return this;
  }

   /**
   * 商圈选择
   * @return businessDistrictInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商圈选择")

  public List<BoxBusinessDistrictInfo> getBusinessDistrictInfos() {
    return businessDistrictInfos;
  }


  public void setBusinessDistrictInfos(List<BoxBusinessDistrictInfo> businessDistrictInfos) {
    this.businessDistrictInfos = businessDistrictInfos;
  }


  public BoxBusinessDistrictModule moduleId(String moduleId) {
    
    this.moduleId = moduleId;
    return this;
  }

   /**
   * 模块ID
   * @return moduleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20220308000000168465", value = "模块ID")

  public String getModuleId() {
    return moduleId;
  }


  public void setModuleId(String moduleId) {
    this.moduleId = moduleId;
  }


  public BoxBusinessDistrictModule moduleType(String moduleType) {
    
    this.moduleType = moduleType;
    return this;
  }

   /**
   * 搜索直达模块类型，BOX_EXCLUSIVE_BASE-基础信息/BOX_EXCLUSIVE_KEYWORD-关键词/BOX_EXCLUSIVE_FUNCTIONS-功能服务/BOX_EXCLUSIVE_ACCOUNTS-关联账号/BOX_ATMOSPHERE_IMAGE-氛围图/BOX_BUSINESS_DISTRICT-商圈信息/BOX_EXCLUSIVE_AREA_KEYWORD-地域触发词
   * @return moduleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BOX_BUSINESS_DISTRICT", value = "搜索直达模块类型，BOX_EXCLUSIVE_BASE-基础信息/BOX_EXCLUSIVE_KEYWORD-关键词/BOX_EXCLUSIVE_FUNCTIONS-功能服务/BOX_EXCLUSIVE_ACCOUNTS-关联账号/BOX_ATMOSPHERE_IMAGE-氛围图/BOX_BUSINESS_DISTRICT-商圈信息/BOX_EXCLUSIVE_AREA_KEYWORD-地域触发词")

  public String getModuleType() {
    return moduleType;
  }


  public void setModuleType(String moduleType) {
    this.moduleType = moduleType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoxBusinessDistrictModule boxBusinessDistrictModule = (BoxBusinessDistrictModule) o;
    return Objects.equals(this.businessDistrictInfos, boxBusinessDistrictModule.businessDistrictInfos) &&
        Objects.equals(this.moduleId, boxBusinessDistrictModule.moduleId) &&
        Objects.equals(this.moduleType, boxBusinessDistrictModule.moduleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessDistrictInfos, moduleId, moduleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxBusinessDistrictModule {\n");
    sb.append("    businessDistrictInfos: ").append(toIndentedString(businessDistrictInfos)).append("\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    moduleType: ").append(toIndentedString(moduleType)).append("\n");
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
    openapiFields.add("business_district_infos");
    openapiFields.add("module_id");
    openapiFields.add("module_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BoxBusinessDistrictModule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BoxBusinessDistrictModule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BoxBusinessDistrictModule is not found in the empty JSON string", BoxBusinessDistrictModule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BoxBusinessDistrictModule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BoxBusinessDistrictModule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraybusinessDistrictInfos = jsonObj.getAsJsonArray("business_district_infos");
      if (jsonArraybusinessDistrictInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("business_district_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `business_district_infos` to be an array in the JSON string but got `%s`", jsonObj.get("business_district_infos").toString()));
        }

        // validate the optional field `business_district_infos` (array)
        for (int i = 0; i < jsonArraybusinessDistrictInfos.size(); i++) {
          BoxBusinessDistrictInfo.validateJsonObject(jsonArraybusinessDistrictInfos.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("module_id") != null && !jsonObj.get("module_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `module_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("module_id").toString()));
      }
      if (jsonObj.get("module_type") != null && !jsonObj.get("module_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `module_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("module_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BoxBusinessDistrictModule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BoxBusinessDistrictModule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BoxBusinessDistrictModule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BoxBusinessDistrictModule.class));

       return (TypeAdapter<T>) new TypeAdapter<BoxBusinessDistrictModule>() {
           @Override
           public void write(JsonWriter out, BoxBusinessDistrictModule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BoxBusinessDistrictModule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BoxBusinessDistrictModule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BoxBusinessDistrictModule
  * @throws IOException if the JSON string is invalid with respect to BoxBusinessDistrictModule
  */
  public static BoxBusinessDistrictModule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BoxBusinessDistrictModule.class);
  }

 /**
  * Convert an instance of BoxBusinessDistrictModule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

