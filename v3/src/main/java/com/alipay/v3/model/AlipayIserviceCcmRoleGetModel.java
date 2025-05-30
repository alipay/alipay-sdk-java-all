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
 * AlipayIserviceCcmRoleGetModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmRoleGetModel {
  public static final String SERIALIZED_NAME_CCS_INSTANCE_ID = "ccs_instance_id";
  @SerializedName(SERIALIZED_NAME_CCS_INSTANCE_ID)
  private String ccsInstanceId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public AlipayIserviceCcmRoleGetModel() { 
  }

  public AlipayIserviceCcmRoleGetModel ccsInstanceId(String ccsInstanceId) {
    
    this.ccsInstanceId = ccsInstanceId;
    return this;
  }

   /**
   * 部门id，不传默认用租户ID
   * @return ccsInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "qi1_FAq1", value = "部门id，不传默认用租户ID")

  public String getCcsInstanceId() {
    return ccsInstanceId;
  }


  public void setCcsInstanceId(String ccsInstanceId) {
    this.ccsInstanceId = ccsInstanceId;
  }


  public AlipayIserviceCcmRoleGetModel id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 角色id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "角色id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayIserviceCcmRoleGetModel alipayIserviceCcmRoleGetModel = (AlipayIserviceCcmRoleGetModel) o;
    return Objects.equals(this.ccsInstanceId, alipayIserviceCcmRoleGetModel.ccsInstanceId) &&
        Objects.equals(this.id, alipayIserviceCcmRoleGetModel.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccsInstanceId, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmRoleGetModel {\n");
    sb.append("    ccsInstanceId: ").append(toIndentedString(ccsInstanceId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("ccs_instance_id");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmRoleGetModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmRoleGetModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmRoleGetModel is not found in the empty JSON string", AlipayIserviceCcmRoleGetModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayIserviceCcmRoleGetModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayIserviceCcmRoleGetModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ccs_instance_id") != null && !jsonObj.get("ccs_instance_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ccs_instance_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ccs_instance_id").toString()));
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmRoleGetModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmRoleGetModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmRoleGetModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmRoleGetModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmRoleGetModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmRoleGetModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayIserviceCcmRoleGetModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayIserviceCcmRoleGetModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmRoleGetModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmRoleGetModel
  */
  public static AlipayIserviceCcmRoleGetModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmRoleGetModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmRoleGetModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

