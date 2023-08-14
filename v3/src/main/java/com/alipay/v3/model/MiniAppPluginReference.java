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
 * MiniAppPluginReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MiniAppPluginReference {
  public static final String SERIALIZED_NAME_LAZY = "lazy";
  @SerializedName(SERIALIZED_NAME_LAZY)
  private Boolean lazy;

  public static final String SERIALIZED_NAME_PLUGIN_ID = "plugin_id";
  @SerializedName(SERIALIZED_NAME_PLUGIN_ID)
  private String pluginId;

  public static final String SERIALIZED_NAME_PLUGIN_LAZY = "plugin_lazy";
  @SerializedName(SERIALIZED_NAME_PLUGIN_LAZY)
  private Boolean pluginLazy;

  public static final String SERIALIZED_NAME_PLUGIN_VERSION = "plugin_version";
  @SerializedName(SERIALIZED_NAME_PLUGIN_VERSION)
  private String pluginVersion;

  public MiniAppPluginReference() { 
  }

  public MiniAppPluginReference lazy(Boolean lazy) {
    
    this.lazy = lazy;
    return this;
  }

   /**
   * 是否懒加载
   * @return lazy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否懒加载")

  public Boolean getLazy() {
    return lazy;
  }


  public void setLazy(Boolean lazy) {
    this.lazy = lazy;
  }


  public MiniAppPluginReference pluginId(String pluginId) {
    
    this.pluginId = pluginId;
    return this;
  }

   /**
   * 插件id，即插件的唯一标识，形如小程序的appId
   * @return pluginId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "插件id，即插件的唯一标识，形如小程序的appId")

  public String getPluginId() {
    return pluginId;
  }


  public void setPluginId(String pluginId) {
    this.pluginId = pluginId;
  }


  public MiniAppPluginReference pluginLazy(Boolean pluginLazy) {
    
    this.pluginLazy = pluginLazy;
    return this;
  }

   /**
   * 是否懒加载
   * @return pluginLazy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否懒加载")

  public Boolean getPluginLazy() {
    return pluginLazy;
  }


  public void setPluginLazy(Boolean pluginLazy) {
    this.pluginLazy = pluginLazy;
  }


  public MiniAppPluginReference pluginVersion(String pluginVersion) {
    
    this.pluginVersion = pluginVersion;
    return this;
  }

   /**
   * 小程序引用的插件版本，可以指定插件版本，如：1.0.11；也可以填*，表示引用最新的插件版本，此时，当插件发布新版本后，小程序内的插件会自动更新到最新的版本。
   * @return pluginVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "小程序引用的插件版本，可以指定插件版本，如：1.0.11；也可以填*，表示引用最新的插件版本，此时，当插件发布新版本后，小程序内的插件会自动更新到最新的版本。")

  public String getPluginVersion() {
    return pluginVersion;
  }


  public void setPluginVersion(String pluginVersion) {
    this.pluginVersion = pluginVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MiniAppPluginReference miniAppPluginReference = (MiniAppPluginReference) o;
    return Objects.equals(this.lazy, miniAppPluginReference.lazy) &&
        Objects.equals(this.pluginId, miniAppPluginReference.pluginId) &&
        Objects.equals(this.pluginLazy, miniAppPluginReference.pluginLazy) &&
        Objects.equals(this.pluginVersion, miniAppPluginReference.pluginVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lazy, pluginId, pluginLazy, pluginVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiniAppPluginReference {\n");
    sb.append("    lazy: ").append(toIndentedString(lazy)).append("\n");
    sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
    sb.append("    pluginLazy: ").append(toIndentedString(pluginLazy)).append("\n");
    sb.append("    pluginVersion: ").append(toIndentedString(pluginVersion)).append("\n");
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
    openapiFields.add("lazy");
    openapiFields.add("plugin_id");
    openapiFields.add("plugin_lazy");
    openapiFields.add("plugin_version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MiniAppPluginReference
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MiniAppPluginReference.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MiniAppPluginReference is not found in the empty JSON string", MiniAppPluginReference.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MiniAppPluginReference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MiniAppPluginReference` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("plugin_id") != null && !jsonObj.get("plugin_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_id").toString()));
      }
      if (jsonObj.get("plugin_version") != null && !jsonObj.get("plugin_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MiniAppPluginReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MiniAppPluginReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MiniAppPluginReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MiniAppPluginReference.class));

       return (TypeAdapter<T>) new TypeAdapter<MiniAppPluginReference>() {
           @Override
           public void write(JsonWriter out, MiniAppPluginReference value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MiniAppPluginReference read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MiniAppPluginReference given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MiniAppPluginReference
  * @throws IOException if the JSON string is invalid with respect to MiniAppPluginReference
  */
  public static MiniAppPluginReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MiniAppPluginReference.class);
  }

 /**
  * Convert an instance of MiniAppPluginReference to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

