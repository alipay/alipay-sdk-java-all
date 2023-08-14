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
 * AlipayOpenPublicShortlinkCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicShortlinkCreateModel {
  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark;

  public static final String SERIALIZED_NAME_SCENE_ID = "scene_id";
  @SerializedName(SERIALIZED_NAME_SCENE_ID)
  private String sceneId;

  public AlipayOpenPublicShortlinkCreateModel() { 
  }

  public AlipayOpenPublicShortlinkCreateModel remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 对于场景 ID 的描述，由商户自定义。
   * @return remark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "门店1支付推广", value = "对于场景 ID 的描述，由商户自定义。")

  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public AlipayOpenPublicShortlinkCreateModel sceneId(String sceneId) {
    
    this.sceneId = sceneId;
    return this;
  }

   /**
   * 短链接对应的场景 ID。由商户自定义，仅支持数字、字母及下划线。
   * @return sceneId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "store_pay_01", value = "短链接对应的场景 ID。由商户自定义，仅支持数字、字母及下划线。")

  public String getSceneId() {
    return sceneId;
  }


  public void setSceneId(String sceneId) {
    this.sceneId = sceneId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicShortlinkCreateModel alipayOpenPublicShortlinkCreateModel = (AlipayOpenPublicShortlinkCreateModel) o;
    return Objects.equals(this.remark, alipayOpenPublicShortlinkCreateModel.remark) &&
        Objects.equals(this.sceneId, alipayOpenPublicShortlinkCreateModel.sceneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remark, sceneId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicShortlinkCreateModel {\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    sceneId: ").append(toIndentedString(sceneId)).append("\n");
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
    openapiFields.add("remark");
    openapiFields.add("scene_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicShortlinkCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicShortlinkCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicShortlinkCreateModel is not found in the empty JSON string", AlipayOpenPublicShortlinkCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicShortlinkCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicShortlinkCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("remark") != null && !jsonObj.get("remark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remark").toString()));
      }
      if (jsonObj.get("scene_id") != null && !jsonObj.get("scene_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scene_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicShortlinkCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicShortlinkCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicShortlinkCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicShortlinkCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicShortlinkCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicShortlinkCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicShortlinkCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicShortlinkCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicShortlinkCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicShortlinkCreateModel
  */
  public static AlipayOpenPublicShortlinkCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicShortlinkCreateModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicShortlinkCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

