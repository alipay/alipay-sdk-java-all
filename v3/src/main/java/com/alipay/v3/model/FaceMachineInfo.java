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
 * FaceMachineInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FaceMachineInfo {
  public static final String SERIALIZED_NAME_CAMERA_DRIVE_VER = "camera_drive_ver";
  @SerializedName(SERIALIZED_NAME_CAMERA_DRIVE_VER)
  private String cameraDriveVer;

  public static final String SERIALIZED_NAME_CAMERA_MODEL = "camera_model";
  @SerializedName(SERIALIZED_NAME_CAMERA_MODEL)
  private String cameraModel;

  public static final String SERIALIZED_NAME_CAMERA_NAME = "camera_name";
  @SerializedName(SERIALIZED_NAME_CAMERA_NAME)
  private String cameraName;

  public static final String SERIALIZED_NAME_CAMERA_VER = "camera_ver";
  @SerializedName(SERIALIZED_NAME_CAMERA_VER)
  private String cameraVer;

  public static final String SERIALIZED_NAME_EXT = "ext";
  @SerializedName(SERIALIZED_NAME_EXT)
  private String ext;

  public static final String SERIALIZED_NAME_MACHINE_CODE = "machine_code";
  @SerializedName(SERIALIZED_NAME_MACHINE_CODE)
  private String machineCode;

  public static final String SERIALIZED_NAME_MACHINE_MODEL = "machine_model";
  @SerializedName(SERIALIZED_NAME_MACHINE_MODEL)
  private String machineModel;

  public static final String SERIALIZED_NAME_MACHINE_VER = "machine_ver";
  @SerializedName(SERIALIZED_NAME_MACHINE_VER)
  private String machineVer;

  public FaceMachineInfo() { 
  }

  public FaceMachineInfo cameraDriveVer(String cameraDriveVer) {
    
    this.cameraDriveVer = cameraDriveVer;
    return this;
  }

   /**
   * 摄像头驱动版本号
   * @return cameraDriveVer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "摄像头驱动版本号")

  public String getCameraDriveVer() {
    return cameraDriveVer;
  }


  public void setCameraDriveVer(String cameraDriveVer) {
    this.cameraDriveVer = cameraDriveVer;
  }


  public FaceMachineInfo cameraModel(String cameraModel) {
    
    this.cameraModel = cameraModel;
    return this;
  }

   /**
   * 摄像头型号
   * @return cameraModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AstraP1", value = "摄像头型号")

  public String getCameraModel() {
    return cameraModel;
  }


  public void setCameraModel(String cameraModel) {
    this.cameraModel = cameraModel;
  }


  public FaceMachineInfo cameraName(String cameraName) {
    
    this.cameraName = cameraName;
    return this;
  }

   /**
   * 摄像头名称
   * @return cameraName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AstraP1", value = "摄像头名称")

  public String getCameraName() {
    return cameraName;
  }


  public void setCameraName(String cameraName) {
    this.cameraName = cameraName;
  }


  public FaceMachineInfo cameraVer(String cameraVer) {
    
    this.cameraVer = cameraVer;
    return this;
  }

   /**
   * 摄像头版本号
   * @return cameraVer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "摄像头版本号")

  public String getCameraVer() {
    return cameraVer;
  }


  public void setCameraVer(String cameraVer) {
    this.cameraVer = cameraVer;
  }


  public FaceMachineInfo ext(String ext) {
    
    this.ext = ext;
    return this;
  }

   /**
   * 扩展信息
   * @return ext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "扩展信息", value = "扩展信息")

  public String getExt() {
    return ext;
  }


  public void setExt(String ext) {
    this.ext = ext;
  }


  public FaceMachineInfo machineCode(String machineCode) {
    
    this.machineCode = machineCode;
    return this;
  }

   /**
   * 机具编码
   * @return machineCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WyDAz27pfsEDANGk7QnmxZlv", value = "机具编码")

  public String getMachineCode() {
    return machineCode;
  }


  public void setMachineCode(String machineCode) {
    this.machineCode = machineCode;
  }


  public FaceMachineInfo machineModel(String machineModel) {
    
    this.machineModel = machineModel;
    return this;
  }

   /**
   * 机具型号
   * @return machineModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T2", value = "机具型号")

  public String getMachineModel() {
    return machineModel;
  }


  public void setMachineModel(String machineModel) {
    this.machineModel = machineModel;
  }


  public FaceMachineInfo machineVer(String machineVer) {
    
    this.machineVer = machineVer;
    return this;
  }

   /**
   * 机具版本号
   * @return machineVer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7.1.1", value = "机具版本号")

  public String getMachineVer() {
    return machineVer;
  }


  public void setMachineVer(String machineVer) {
    this.machineVer = machineVer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceMachineInfo faceMachineInfo = (FaceMachineInfo) o;
    return Objects.equals(this.cameraDriveVer, faceMachineInfo.cameraDriveVer) &&
        Objects.equals(this.cameraModel, faceMachineInfo.cameraModel) &&
        Objects.equals(this.cameraName, faceMachineInfo.cameraName) &&
        Objects.equals(this.cameraVer, faceMachineInfo.cameraVer) &&
        Objects.equals(this.ext, faceMachineInfo.ext) &&
        Objects.equals(this.machineCode, faceMachineInfo.machineCode) &&
        Objects.equals(this.machineModel, faceMachineInfo.machineModel) &&
        Objects.equals(this.machineVer, faceMachineInfo.machineVer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cameraDriveVer, cameraModel, cameraName, cameraVer, ext, machineCode, machineModel, machineVer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceMachineInfo {\n");
    sb.append("    cameraDriveVer: ").append(toIndentedString(cameraDriveVer)).append("\n");
    sb.append("    cameraModel: ").append(toIndentedString(cameraModel)).append("\n");
    sb.append("    cameraName: ").append(toIndentedString(cameraName)).append("\n");
    sb.append("    cameraVer: ").append(toIndentedString(cameraVer)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    machineCode: ").append(toIndentedString(machineCode)).append("\n");
    sb.append("    machineModel: ").append(toIndentedString(machineModel)).append("\n");
    sb.append("    machineVer: ").append(toIndentedString(machineVer)).append("\n");
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
    openapiFields.add("camera_drive_ver");
    openapiFields.add("camera_model");
    openapiFields.add("camera_name");
    openapiFields.add("camera_ver");
    openapiFields.add("ext");
    openapiFields.add("machine_code");
    openapiFields.add("machine_model");
    openapiFields.add("machine_ver");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FaceMachineInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FaceMachineInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FaceMachineInfo is not found in the empty JSON string", FaceMachineInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FaceMachineInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FaceMachineInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("camera_drive_ver") != null && !jsonObj.get("camera_drive_ver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `camera_drive_ver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("camera_drive_ver").toString()));
      }
      if (jsonObj.get("camera_model") != null && !jsonObj.get("camera_model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `camera_model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("camera_model").toString()));
      }
      if (jsonObj.get("camera_name") != null && !jsonObj.get("camera_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `camera_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("camera_name").toString()));
      }
      if (jsonObj.get("camera_ver") != null && !jsonObj.get("camera_ver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `camera_ver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("camera_ver").toString()));
      }
      if (jsonObj.get("ext") != null && !jsonObj.get("ext").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext").toString()));
      }
      if (jsonObj.get("machine_code") != null && !jsonObj.get("machine_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `machine_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("machine_code").toString()));
      }
      if (jsonObj.get("machine_model") != null && !jsonObj.get("machine_model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `machine_model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("machine_model").toString()));
      }
      if (jsonObj.get("machine_ver") != null && !jsonObj.get("machine_ver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `machine_ver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("machine_ver").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FaceMachineInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FaceMachineInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FaceMachineInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FaceMachineInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<FaceMachineInfo>() {
           @Override
           public void write(JsonWriter out, FaceMachineInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FaceMachineInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FaceMachineInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FaceMachineInfo
  * @throws IOException if the JSON string is invalid with respect to FaceMachineInfo
  */
  public static FaceMachineInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FaceMachineInfo.class);
  }

 /**
  * Convert an instance of FaceMachineInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

