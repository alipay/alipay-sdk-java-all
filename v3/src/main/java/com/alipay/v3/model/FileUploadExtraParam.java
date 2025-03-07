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
 * FileUploadExtraParam
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FileUploadExtraParam {
  public static final String SERIALIZED_NAME_EXTERN_UPLOAD = "extern_upload";
  @SerializedName(SERIALIZED_NAME_EXTERN_UPLOAD)
  private String externUpload;

  public static final String SERIALIZED_NAME_FILE_ENCRYPT_TYPE = "file_encrypt_type";
  @SerializedName(SERIALIZED_NAME_FILE_ENCRYPT_TYPE)
  private String fileEncryptType;

  public FileUploadExtraParam() { 
  }

  public FileUploadExtraParam externUpload(String externUpload) {
    
    this.externUpload = externUpload;
    return this;
  }

   /**
   * 是否同步上传到其他平台。素材类型为视频且需要同步优酷，请必传入参数youku，素材接口将代上传到优酷账号；素材类型为图片，无需传入参数
   * @return externUpload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "youku", value = "是否同步上传到其他平台。素材类型为视频且需要同步优酷，请必传入参数youku，素材接口将代上传到优酷账号；素材类型为图片，无需传入参数")

  public String getExternUpload() {
    return externUpload;
  }


  public void setExternUpload(String externUpload) {
    this.externUpload = externUpload;
  }


  public FileUploadExtraParam fileEncryptType(String fileEncryptType) {
    
    this.fileEncryptType = fileEncryptType;
    return this;
  }

   /**
   * 文件加密类型
   * @return fileEncryptType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NO_ENCRYPT", value = "文件加密类型")

  public String getFileEncryptType() {
    return fileEncryptType;
  }


  public void setFileEncryptType(String fileEncryptType) {
    this.fileEncryptType = fileEncryptType;
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
   * @return the FileUploadExtraParam instance itself
   */
  public FileUploadExtraParam putAdditionalProperty(String key, Object value) {
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
    FileUploadExtraParam fileUploadExtraParam = (FileUploadExtraParam) o;
    return Objects.equals(this.externUpload, fileUploadExtraParam.externUpload) &&
        Objects.equals(this.fileEncryptType, fileUploadExtraParam.fileEncryptType)&&
        Objects.equals(this.additionalProperties, fileUploadExtraParam.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externUpload, fileEncryptType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUploadExtraParam {\n");
    sb.append("    externUpload: ").append(toIndentedString(externUpload)).append("\n");
    sb.append("    fileEncryptType: ").append(toIndentedString(fileEncryptType)).append("\n");
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
    openapiFields.add("extern_upload");
    openapiFields.add("file_encrypt_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FileUploadExtraParam
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FileUploadExtraParam.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FileUploadExtraParam is not found in the empty JSON string", FileUploadExtraParam.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("extern_upload") != null && !jsonObj.get("extern_upload").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extern_upload` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extern_upload").toString()));
      }
      if (jsonObj.get("file_encrypt_type") != null && !jsonObj.get("file_encrypt_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_encrypt_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_encrypt_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileUploadExtraParam.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileUploadExtraParam' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileUploadExtraParam> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileUploadExtraParam.class));

       return (TypeAdapter<T>) new TypeAdapter<FileUploadExtraParam>() {
           @Override
           public void write(JsonWriter out, FileUploadExtraParam value) throws IOException {
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
           public FileUploadExtraParam read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FileUploadExtraParam instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FileUploadExtraParam given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileUploadExtraParam
  * @throws IOException if the JSON string is invalid with respect to FileUploadExtraParam
  */
  public static FileUploadExtraParam fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileUploadExtraParam.class);
  }

 /**
  * Convert an instance of FileUploadExtraParam to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

