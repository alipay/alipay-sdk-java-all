/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-07-05
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
 * AlipayOpenMiniInnerversionUploadResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerversionUploadResponseModel {
  public static final String SERIALIZED_NAME_BUILD_INFO = "build_info";
  @SerializedName(SERIALIZED_NAME_BUILD_INFO)
  private String buildInfo;

  public static final String SERIALIZED_NAME_BUILD_PACKAGE_URL = "build_package_url";
  @SerializedName(SERIALIZED_NAME_BUILD_PACKAGE_URL)
  private String buildPackageUrl;

  public static final String SERIALIZED_NAME_BUILD_STATUS = "build_status";
  @SerializedName(SERIALIZED_NAME_BUILD_STATUS)
  private String buildStatus;

  public static final String SERIALIZED_NAME_BUILD_VERSION = "build_version";
  @SerializedName(SERIALIZED_NAME_BUILD_VERSION)
  private String buildVersion;

  public static final String SERIALIZED_NAME_NEED_ROTATION = "need_rotation";
  @SerializedName(SERIALIZED_NAME_NEED_ROTATION)
  private String needRotation;

  public static final String SERIALIZED_NAME_NEW_BUILD_PACKAGE_URL = "new_build_package_url";
  @SerializedName(SERIALIZED_NAME_NEW_BUILD_PACKAGE_URL)
  private String newBuildPackageUrl;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "package_id";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private String packageId;

  public static final String SERIALIZED_NAME_VERSION_CREATED = "version_created";
  @SerializedName(SERIALIZED_NAME_VERSION_CREATED)
  private String versionCreated;

  public AlipayOpenMiniInnerversionUploadResponseModel() { 
  }

  public AlipayOpenMiniInnerversionUploadResponseModel buildInfo(String buildInfo) {
    
    this.buildInfo = buildInfo;
    return this;
  }

   /**
   * 构建信息
   * @return buildInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "构建信息", value = "构建信息")

  public String getBuildInfo() {
    return buildInfo;
  }


  public void setBuildInfo(String buildInfo) {
    this.buildInfo = buildInfo;
  }


  public AlipayOpenMiniInnerversionUploadResponseModel buildPackageUrl(String buildPackageUrl) {
    
    this.buildPackageUrl = buildPackageUrl;
    return this;
  }

   /**
   * 包地址
   * @return buildPackageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://alipay-rmsdeploy-image.cn-hangzhou.alipay.aliyun-inc.com/qcloud/build-target-c1d90a3bcf354803ad01b28cdccd83a4.tar", value = "包地址")

  public String getBuildPackageUrl() {
    return buildPackageUrl;
  }


  public void setBuildPackageUrl(String buildPackageUrl) {
    this.buildPackageUrl = buildPackageUrl;
  }


  public AlipayOpenMiniInnerversionUploadResponseModel buildStatus(String buildStatus) {
    
    this.buildStatus = buildStatus;
    return this;
  }

   /**
   * 构建状态
   * @return buildStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "构建状态", value = "构建状态")

  public String getBuildStatus() {
    return buildStatus;
  }


  public void setBuildStatus(String buildStatus) {
    this.buildStatus = buildStatus;
  }


  public AlipayOpenMiniInnerversionUploadResponseModel buildVersion(String buildVersion) {
    
    this.buildVersion = buildVersion;
    return this;
  }

   /**
   * 构建版本
   * @return buildVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0.5", value = "构建版本")

  public String getBuildVersion() {
    return buildVersion;
  }


  public void setBuildVersion(String buildVersion) {
    this.buildVersion = buildVersion;
  }


  public AlipayOpenMiniInnerversionUploadResponseModel needRotation(String needRotation) {
    
    this.needRotation = needRotation;
    return this;
  }

   /**
   * 是否需要轮询
   * @return needRotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TRUE", value = "是否需要轮询")

  public String getNeedRotation() {
    return needRotation;
  }


  public void setNeedRotation(String needRotation) {
    this.needRotation = needRotation;
  }


  public AlipayOpenMiniInnerversionUploadResponseModel newBuildPackageUrl(String newBuildPackageUrl) {
    
    this.newBuildPackageUrl = newBuildPackageUrl;
    return this;
  }

   /**
   * appx构建返回值
   * @return newBuildPackageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://alipay-rmsdeploy-image.cn-hangzhou.alipay.aliyun-inc.com/qcloud/build-target-c1d90a3bcf354803ad01b28cdccd83a4.tar", value = "appx构建返回值")

  public String getNewBuildPackageUrl() {
    return newBuildPackageUrl;
  }


  public void setNewBuildPackageUrl(String newBuildPackageUrl) {
    this.newBuildPackageUrl = newBuildPackageUrl;
  }


  public AlipayOpenMiniInnerversionUploadResponseModel packageId(String packageId) {
    
    this.packageId = packageId;
    return this;
  }

   /**
   * 包管理包ID
   * @return packageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "34845", value = "包管理包ID")

  public String getPackageId() {
    return packageId;
  }


  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }


  public AlipayOpenMiniInnerversionUploadResponseModel versionCreated(String versionCreated) {
    
    this.versionCreated = versionCreated;
    return this;
  }

   /**
   * 版本创建结果
   * @return versionCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TRUE", value = "版本创建结果")

  public String getVersionCreated() {
    return versionCreated;
  }


  public void setVersionCreated(String versionCreated) {
    this.versionCreated = versionCreated;
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
   * @return the AlipayOpenMiniInnerversionUploadResponseModel instance itself
   */
  public AlipayOpenMiniInnerversionUploadResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenMiniInnerversionUploadResponseModel alipayOpenMiniInnerversionUploadResponseModel = (AlipayOpenMiniInnerversionUploadResponseModel) o;
    return Objects.equals(this.buildInfo, alipayOpenMiniInnerversionUploadResponseModel.buildInfo) &&
        Objects.equals(this.buildPackageUrl, alipayOpenMiniInnerversionUploadResponseModel.buildPackageUrl) &&
        Objects.equals(this.buildStatus, alipayOpenMiniInnerversionUploadResponseModel.buildStatus) &&
        Objects.equals(this.buildVersion, alipayOpenMiniInnerversionUploadResponseModel.buildVersion) &&
        Objects.equals(this.needRotation, alipayOpenMiniInnerversionUploadResponseModel.needRotation) &&
        Objects.equals(this.newBuildPackageUrl, alipayOpenMiniInnerversionUploadResponseModel.newBuildPackageUrl) &&
        Objects.equals(this.packageId, alipayOpenMiniInnerversionUploadResponseModel.packageId) &&
        Objects.equals(this.versionCreated, alipayOpenMiniInnerversionUploadResponseModel.versionCreated)&&
        Objects.equals(this.additionalProperties, alipayOpenMiniInnerversionUploadResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildInfo, buildPackageUrl, buildStatus, buildVersion, needRotation, newBuildPackageUrl, packageId, versionCreated, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerversionUploadResponseModel {\n");
    sb.append("    buildInfo: ").append(toIndentedString(buildInfo)).append("\n");
    sb.append("    buildPackageUrl: ").append(toIndentedString(buildPackageUrl)).append("\n");
    sb.append("    buildStatus: ").append(toIndentedString(buildStatus)).append("\n");
    sb.append("    buildVersion: ").append(toIndentedString(buildVersion)).append("\n");
    sb.append("    needRotation: ").append(toIndentedString(needRotation)).append("\n");
    sb.append("    newBuildPackageUrl: ").append(toIndentedString(newBuildPackageUrl)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    versionCreated: ").append(toIndentedString(versionCreated)).append("\n");
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
    openapiFields.add("build_info");
    openapiFields.add("build_package_url");
    openapiFields.add("build_status");
    openapiFields.add("build_version");
    openapiFields.add("need_rotation");
    openapiFields.add("new_build_package_url");
    openapiFields.add("package_id");
    openapiFields.add("version_created");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerversionUploadResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerversionUploadResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerversionUploadResponseModel is not found in the empty JSON string", AlipayOpenMiniInnerversionUploadResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("build_info") != null && !jsonObj.get("build_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build_info").toString()));
      }
      if (jsonObj.get("build_package_url") != null && !jsonObj.get("build_package_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build_package_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build_package_url").toString()));
      }
      if (jsonObj.get("build_status") != null && !jsonObj.get("build_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build_status").toString()));
      }
      if (jsonObj.get("build_version") != null && !jsonObj.get("build_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build_version").toString()));
      }
      if (jsonObj.get("need_rotation") != null && !jsonObj.get("need_rotation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `need_rotation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("need_rotation").toString()));
      }
      if (jsonObj.get("new_build_package_url") != null && !jsonObj.get("new_build_package_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new_build_package_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new_build_package_url").toString()));
      }
      if (jsonObj.get("package_id") != null && !jsonObj.get("package_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package_id").toString()));
      }
      if (jsonObj.get("version_created") != null && !jsonObj.get("version_created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version_created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version_created").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerversionUploadResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerversionUploadResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerversionUploadResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerversionUploadResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerversionUploadResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerversionUploadResponseModel value) throws IOException {
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
           public AlipayOpenMiniInnerversionUploadResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenMiniInnerversionUploadResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenMiniInnerversionUploadResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerversionUploadResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerversionUploadResponseModel
  */
  public static AlipayOpenMiniInnerversionUploadResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerversionUploadResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerversionUploadResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

