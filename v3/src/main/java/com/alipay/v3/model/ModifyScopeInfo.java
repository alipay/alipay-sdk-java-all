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
 * ModifyScopeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModifyScopeInfo {
  public static final String SERIALIZED_NAME_ADAPTER_TYPE = "adapter_type";
  @SerializedName(SERIALIZED_NAME_ADAPTER_TYPE)
  private String adapterType;

  public static final String SERIALIZED_NAME_ADD_OWNER_ID_LIST = "add_owner_id_list";
  @SerializedName(SERIALIZED_NAME_ADD_OWNER_ID_LIST)
  private List<String> addOwnerIdList = null;

  public static final String SERIALIZED_NAME_DELETE_OWNER_ID_LIST = "delete_owner_id_list";
  @SerializedName(SERIALIZED_NAME_DELETE_OWNER_ID_LIST)
  private List<String> deleteOwnerIdList = null;

  public static final String SERIALIZED_NAME_OWNER_TYPE = "owner_type";
  @SerializedName(SERIALIZED_NAME_OWNER_TYPE)
  private String ownerType;

  public ModifyScopeInfo() { 
  }

  public ModifyScopeInfo adapterType(String adapterType) {
    
    this.adapterType = adapterType;
    return this;
  }

   /**
   * 制度的适用范围类型
   * @return adapterType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EMPLOYEE_ALL", value = "制度的适用范围类型")

  public String getAdapterType() {
    return adapterType;
  }


  public void setAdapterType(String adapterType) {
    this.adapterType = adapterType;
  }


  public ModifyScopeInfo addOwnerIdList(List<String> addOwnerIdList) {
    
    this.addOwnerIdList = addOwnerIdList;
    return this;
  }

  public ModifyScopeInfo addAddOwnerIdListItem(String addOwnerIdListItem) {
    if (this.addOwnerIdList == null) {
      this.addOwnerIdList = new ArrayList<>();
    }
    this.addOwnerIdList.add(addOwnerIdListItem);
    return this;
  }

   /**
   * 增加的归属id列表
   * @return addOwnerIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"1001004110381022\"]", value = "增加的归属id列表")

  public List<String> getAddOwnerIdList() {
    return addOwnerIdList;
  }


  public void setAddOwnerIdList(List<String> addOwnerIdList) {
    this.addOwnerIdList = addOwnerIdList;
  }


  public ModifyScopeInfo deleteOwnerIdList(List<String> deleteOwnerIdList) {
    
    this.deleteOwnerIdList = deleteOwnerIdList;
    return this;
  }

  public ModifyScopeInfo addDeleteOwnerIdListItem(String deleteOwnerIdListItem) {
    if (this.deleteOwnerIdList == null) {
      this.deleteOwnerIdList = new ArrayList<>();
    }
    this.deleteOwnerIdList.add(deleteOwnerIdListItem);
    return this;
  }

   /**
   * 删除归属id列表
   * @return deleteOwnerIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2288000000040864\"]", value = "删除归属id列表")

  public List<String> getDeleteOwnerIdList() {
    return deleteOwnerIdList;
  }


  public void setDeleteOwnerIdList(List<String> deleteOwnerIdList) {
    this.deleteOwnerIdList = deleteOwnerIdList;
  }


  public ModifyScopeInfo ownerType(String ownerType) {
    
    this.ownerType = ownerType;
    return this;
  }

   /**
   * 归属id类型
   * @return ownerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENTERPRISE_PAY_UID", value = "归属id类型")

  public String getOwnerType() {
    return ownerType;
  }


  public void setOwnerType(String ownerType) {
    this.ownerType = ownerType;
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
   * @return the ModifyScopeInfo instance itself
   */
  public ModifyScopeInfo putAdditionalProperty(String key, Object value) {
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
    ModifyScopeInfo modifyScopeInfo = (ModifyScopeInfo) o;
    return Objects.equals(this.adapterType, modifyScopeInfo.adapterType) &&
        Objects.equals(this.addOwnerIdList, modifyScopeInfo.addOwnerIdList) &&
        Objects.equals(this.deleteOwnerIdList, modifyScopeInfo.deleteOwnerIdList) &&
        Objects.equals(this.ownerType, modifyScopeInfo.ownerType)&&
        Objects.equals(this.additionalProperties, modifyScopeInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adapterType, addOwnerIdList, deleteOwnerIdList, ownerType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyScopeInfo {\n");
    sb.append("    adapterType: ").append(toIndentedString(adapterType)).append("\n");
    sb.append("    addOwnerIdList: ").append(toIndentedString(addOwnerIdList)).append("\n");
    sb.append("    deleteOwnerIdList: ").append(toIndentedString(deleteOwnerIdList)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
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
    openapiFields.add("adapter_type");
    openapiFields.add("add_owner_id_list");
    openapiFields.add("delete_owner_id_list");
    openapiFields.add("owner_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModifyScopeInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ModifyScopeInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModifyScopeInfo is not found in the empty JSON string", ModifyScopeInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("adapter_type") != null && !jsonObj.get("adapter_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adapter_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adapter_type").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("add_owner_id_list") != null && !jsonObj.get("add_owner_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `add_owner_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("add_owner_id_list").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("delete_owner_id_list") != null && !jsonObj.get("delete_owner_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `delete_owner_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("delete_owner_id_list").toString()));
      }
      if (jsonObj.get("owner_type") != null && !jsonObj.get("owner_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModifyScopeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModifyScopeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModifyScopeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModifyScopeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ModifyScopeInfo>() {
           @Override
           public void write(JsonWriter out, ModifyScopeInfo value) throws IOException {
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
           public ModifyScopeInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ModifyScopeInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ModifyScopeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModifyScopeInfo
  * @throws IOException if the JSON string is invalid with respect to ModifyScopeInfo
  */
  public static ModifyScopeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModifyScopeInfo.class);
  }

 /**
  * Convert an instance of ModifyScopeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

