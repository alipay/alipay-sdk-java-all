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
import com.alipay.v3.model.TemplateUsageInfo;
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
 * AlipayOpenMiniTemplateUsageQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniTemplateUsageQueryResponseModel {
  public static final String SERIALIZED_NAME_APP_IDS = "app_ids";
  @SerializedName(SERIALIZED_NAME_APP_IDS)
  private List<String> appIds = null;

  public static final String SERIALIZED_NAME_TEMPLATE_USAGE_INFO_LIST = "template_usage_info_list";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_USAGE_INFO_LIST)
  private List<TemplateUsageInfo> templateUsageInfoList = null;

  public AlipayOpenMiniTemplateUsageQueryResponseModel() { 
  }

  public AlipayOpenMiniTemplateUsageQueryResponseModel appIds(List<String> appIds) {
    
    this.appIds = appIds;
    return this;
  }

  public AlipayOpenMiniTemplateUsageQueryResponseModel addAppIdsItem(String appIdsItem) {
    if (this.appIds == null) {
      this.appIds = new ArrayList<>();
    }
    this.appIds.add(appIdsItem);
    return this;
  }

   /**
   * 小程序appId列表
   * @return appIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"208812345678\",\"208812345679\"]", value = "小程序appId列表")

  public List<String> getAppIds() {
    return appIds;
  }


  public void setAppIds(List<String> appIds) {
    this.appIds = appIds;
  }


  public AlipayOpenMiniTemplateUsageQueryResponseModel templateUsageInfoList(List<TemplateUsageInfo> templateUsageInfoList) {
    
    this.templateUsageInfoList = templateUsageInfoList;
    return this;
  }

  public AlipayOpenMiniTemplateUsageQueryResponseModel addTemplateUsageInfoListItem(TemplateUsageInfo templateUsageInfoListItem) {
    if (this.templateUsageInfoList == null) {
      this.templateUsageInfoList = new ArrayList<>();
    }
    this.templateUsageInfoList.add(templateUsageInfoListItem);
    return this;
  }

   /**
   * 模板使用信息
   * @return templateUsageInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "模板使用信息")

  public List<TemplateUsageInfo> getTemplateUsageInfoList() {
    return templateUsageInfoList;
  }


  public void setTemplateUsageInfoList(List<TemplateUsageInfo> templateUsageInfoList) {
    this.templateUsageInfoList = templateUsageInfoList;
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
   * @return the AlipayOpenMiniTemplateUsageQueryResponseModel instance itself
   */
  public AlipayOpenMiniTemplateUsageQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenMiniTemplateUsageQueryResponseModel alipayOpenMiniTemplateUsageQueryResponseModel = (AlipayOpenMiniTemplateUsageQueryResponseModel) o;
    return Objects.equals(this.appIds, alipayOpenMiniTemplateUsageQueryResponseModel.appIds) &&
        Objects.equals(this.templateUsageInfoList, alipayOpenMiniTemplateUsageQueryResponseModel.templateUsageInfoList)&&
        Objects.equals(this.additionalProperties, alipayOpenMiniTemplateUsageQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appIds, templateUsageInfoList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniTemplateUsageQueryResponseModel {\n");
    sb.append("    appIds: ").append(toIndentedString(appIds)).append("\n");
    sb.append("    templateUsageInfoList: ").append(toIndentedString(templateUsageInfoList)).append("\n");
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
    openapiFields.add("app_ids");
    openapiFields.add("template_usage_info_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniTemplateUsageQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniTemplateUsageQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniTemplateUsageQueryResponseModel is not found in the empty JSON string", AlipayOpenMiniTemplateUsageQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("app_ids") != null && !jsonObj.get("app_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_ids` to be an array in the JSON string but got `%s`", jsonObj.get("app_ids").toString()));
      }
      JsonArray jsonArraytemplateUsageInfoList = jsonObj.getAsJsonArray("template_usage_info_list");
      if (jsonArraytemplateUsageInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("template_usage_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `template_usage_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("template_usage_info_list").toString()));
        }

        // validate the optional field `template_usage_info_list` (array)
        for (int i = 0; i < jsonArraytemplateUsageInfoList.size(); i++) {
          TemplateUsageInfo.validateJsonObject(jsonArraytemplateUsageInfoList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniTemplateUsageQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniTemplateUsageQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniTemplateUsageQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniTemplateUsageQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniTemplateUsageQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniTemplateUsageQueryResponseModel value) throws IOException {
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
           public AlipayOpenMiniTemplateUsageQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenMiniTemplateUsageQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenMiniTemplateUsageQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniTemplateUsageQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniTemplateUsageQueryResponseModel
  */
  public static AlipayOpenMiniTemplateUsageQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniTemplateUsageQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniTemplateUsageQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

