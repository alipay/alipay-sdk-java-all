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
 * MiniAppDeployResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MiniAppDeployResponse {
  public static final String SERIALIZED_NAME_ANDROID_CLIENT_MAX = "android_client_max";
  @SerializedName(SERIALIZED_NAME_ANDROID_CLIENT_MAX)
  private String androidClientMax;

  public static final String SERIALIZED_NAME_ANDROID_CLIENT_MIN = "android_client_min";
  @SerializedName(SERIALIZED_NAME_ANDROID_CLIENT_MIN)
  private String androidClientMin;

  public static final String SERIALIZED_NAME_APP_VERSION = "app_version";
  @SerializedName(SERIALIZED_NAME_APP_VERSION)
  private String appVersion;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundle_id";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_DEPLOY_VERSION = "deploy_version";
  @SerializedName(SERIALIZED_NAME_DEPLOY_VERSION)
  private String deployVersion;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_IOS_CLIENT_MAX = "ios_client_max";
  @SerializedName(SERIALIZED_NAME_IOS_CLIENT_MAX)
  private String iosClientMax;

  public static final String SERIALIZED_NAME_IOS_CLIENT_MIN = "ios_client_min";
  @SerializedName(SERIALIZED_NAME_IOS_CLIENT_MIN)
  private String iosClientMin;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_PACKAGE_SIZE = "package_size";
  @SerializedName(SERIALIZED_NAME_PACKAGE_SIZE)
  private String packageSize;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public MiniAppDeployResponse() { 
  }

  public MiniAppDeployResponse androidClientMax(String androidClientMax) {
    
    this.androidClientMax = androidClientMax;
    return this;
  }

   /**
   * 安卓最大版本号
   * @return androidClientMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "安卓最大版本号")

  public String getAndroidClientMax() {
    return androidClientMax;
  }


  public void setAndroidClientMax(String androidClientMax) {
    this.androidClientMax = androidClientMax;
  }


  public MiniAppDeployResponse androidClientMin(String androidClientMin) {
    
    this.androidClientMin = androidClientMin;
    return this;
  }

   /**
   * 安卓最低版本号
   * @return androidClientMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "安卓最低版本号")

  public String getAndroidClientMin() {
    return androidClientMin;
  }


  public void setAndroidClientMin(String androidClientMin) {
    this.androidClientMin = androidClientMin;
  }


  public MiniAppDeployResponse appVersion(String appVersion) {
    
    this.appVersion = appVersion;
    return this;
  }

   /**
   * 小程序版本号
   * @return appVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "小程序版本号")

  public String getAppVersion() {
    return appVersion;
  }


  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }


  public MiniAppDeployResponse bundleId(String bundleId) {
    
    this.bundleId = bundleId;
    return this;
  }

   /**
   * 端标识
   * @return bundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "端标识")

  public String getBundleId() {
    return bundleId;
  }


  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public MiniAppDeployResponse deployVersion(String deployVersion) {
    
    this.deployVersion = deployVersion;
    return this;
  }

   /**
   * 发布版本
   * @return deployVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发布版本")

  public String getDeployVersion() {
    return deployVersion;
  }


  public void setDeployVersion(String deployVersion) {
    this.deployVersion = deployVersion;
  }


  public MiniAppDeployResponse gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 创建时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "创建时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public MiniAppDeployResponse gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 修改时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "修改时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public MiniAppDeployResponse iosClientMax(String iosClientMax) {
    
    this.iosClientMax = iosClientMax;
    return this;
  }

   /**
   * iOS最大版本号
   * @return iosClientMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "iOS最大版本号")

  public String getIosClientMax() {
    return iosClientMax;
  }


  public void setIosClientMax(String iosClientMax) {
    this.iosClientMax = iosClientMax;
  }


  public MiniAppDeployResponse iosClientMin(String iosClientMin) {
    
    this.iosClientMin = iosClientMin;
    return this;
  }

   /**
   * iOS最小版本号
   * @return iosClientMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "iOS最小版本号")

  public String getIosClientMin() {
    return iosClientMin;
  }


  public void setIosClientMin(String iosClientMin) {
    this.iosClientMin = iosClientMin;
  }


  public MiniAppDeployResponse miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 小程序ID
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "小程序ID")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public MiniAppDeployResponse packageSize(String packageSize) {
    
    this.packageSize = packageSize;
    return this;
  }

   /**
   * 包大小
   * @return packageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "包大小")

  public String getPackageSize() {
    return packageSize;
  }


  public void setPackageSize(String packageSize) {
    this.packageSize = packageSize;
  }


  public MiniAppDeployResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 发布状态     INVALID(\&quot;INVALID\&quot;, \&quot;非法\&quot;),     INIT(\&quot;INIT\&quot;, \&quot;初始化状态\&quot;),     PRE_ONLINE(\&quot;PRE_ONLINE\&quot;, \&quot;预发\&quot;);     GRAY(\&quot;GRAY\&quot;, \&quot;灰度\&quot;),     ONLINE(\&quot;ONLINE\&quot;, \&quot;上架\&quot;),     ABANDON(\&quot;ABANDON\&quot;, \&quot;废弃\&quot;),
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发布状态     INVALID(\"INVALID\", \"非法\"),     INIT(\"INIT\", \"初始化状态\"),     PRE_ONLINE(\"PRE_ONLINE\", \"预发\");     GRAY(\"GRAY\", \"灰度\"),     ONLINE(\"ONLINE\", \"上架\"),     ABANDON(\"ABANDON\", \"废弃\"),")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
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
   * @return the MiniAppDeployResponse instance itself
   */
  public MiniAppDeployResponse putAdditionalProperty(String key, Object value) {
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
    MiniAppDeployResponse miniAppDeployResponse = (MiniAppDeployResponse) o;
    return Objects.equals(this.androidClientMax, miniAppDeployResponse.androidClientMax) &&
        Objects.equals(this.androidClientMin, miniAppDeployResponse.androidClientMin) &&
        Objects.equals(this.appVersion, miniAppDeployResponse.appVersion) &&
        Objects.equals(this.bundleId, miniAppDeployResponse.bundleId) &&
        Objects.equals(this.deployVersion, miniAppDeployResponse.deployVersion) &&
        Objects.equals(this.gmtCreate, miniAppDeployResponse.gmtCreate) &&
        Objects.equals(this.gmtModified, miniAppDeployResponse.gmtModified) &&
        Objects.equals(this.iosClientMax, miniAppDeployResponse.iosClientMax) &&
        Objects.equals(this.iosClientMin, miniAppDeployResponse.iosClientMin) &&
        Objects.equals(this.miniAppId, miniAppDeployResponse.miniAppId) &&
        Objects.equals(this.packageSize, miniAppDeployResponse.packageSize) &&
        Objects.equals(this.status, miniAppDeployResponse.status)&&
        Objects.equals(this.additionalProperties, miniAppDeployResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidClientMax, androidClientMin, appVersion, bundleId, deployVersion, gmtCreate, gmtModified, iosClientMax, iosClientMin, miniAppId, packageSize, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiniAppDeployResponse {\n");
    sb.append("    androidClientMax: ").append(toIndentedString(androidClientMax)).append("\n");
    sb.append("    androidClientMin: ").append(toIndentedString(androidClientMin)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    deployVersion: ").append(toIndentedString(deployVersion)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    iosClientMax: ").append(toIndentedString(iosClientMax)).append("\n");
    sb.append("    iosClientMin: ").append(toIndentedString(iosClientMin)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    packageSize: ").append(toIndentedString(packageSize)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("android_client_max");
    openapiFields.add("android_client_min");
    openapiFields.add("app_version");
    openapiFields.add("bundle_id");
    openapiFields.add("deploy_version");
    openapiFields.add("gmt_create");
    openapiFields.add("gmt_modified");
    openapiFields.add("ios_client_max");
    openapiFields.add("ios_client_min");
    openapiFields.add("mini_app_id");
    openapiFields.add("package_size");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MiniAppDeployResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MiniAppDeployResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MiniAppDeployResponse is not found in the empty JSON string", MiniAppDeployResponse.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("android_client_max") != null && !jsonObj.get("android_client_max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `android_client_max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("android_client_max").toString()));
      }
      if (jsonObj.get("android_client_min") != null && !jsonObj.get("android_client_min").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `android_client_min` to be a primitive type in the JSON string but got `%s`", jsonObj.get("android_client_min").toString()));
      }
      if (jsonObj.get("app_version") != null && !jsonObj.get("app_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_version").toString()));
      }
      if (jsonObj.get("bundle_id") != null && !jsonObj.get("bundle_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bundle_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bundle_id").toString()));
      }
      if (jsonObj.get("deploy_version") != null && !jsonObj.get("deploy_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deploy_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deploy_version").toString()));
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      if (jsonObj.get("ios_client_max") != null && !jsonObj.get("ios_client_max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ios_client_max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ios_client_max").toString()));
      }
      if (jsonObj.get("ios_client_min") != null && !jsonObj.get("ios_client_min").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ios_client_min` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ios_client_min").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("package_size") != null && !jsonObj.get("package_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package_size").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MiniAppDeployResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MiniAppDeployResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MiniAppDeployResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MiniAppDeployResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<MiniAppDeployResponse>() {
           @Override
           public void write(JsonWriter out, MiniAppDeployResponse value) throws IOException {
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
           public MiniAppDeployResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MiniAppDeployResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MiniAppDeployResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MiniAppDeployResponse
  * @throws IOException if the JSON string is invalid with respect to MiniAppDeployResponse
  */
  public static MiniAppDeployResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MiniAppDeployResponse.class);
  }

 /**
  * Convert an instance of MiniAppDeployResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

