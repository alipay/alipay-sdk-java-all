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
 * AlipayOpenMiniInnerappPluginservicePublishResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerappPluginservicePublishResponseModel {
  public static final String SERIALIZED_NAME_ABILITY_ID = "ability_id";
  @SerializedName(SERIALIZED_NAME_ABILITY_ID)
  private String abilityId;

  public AlipayOpenMiniInnerappPluginservicePublishResponseModel() { 
  }

  public AlipayOpenMiniInnerappPluginservicePublishResponseModel abilityId(String abilityId) {
    
    this.abilityId = abilityId;
    return this;
  }

   /**
   * PL2012211102012056
   * @return abilityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "能力中心id", value = "PL2012211102012056")

  public String getAbilityId() {
    return abilityId;
  }


  public void setAbilityId(String abilityId) {
    this.abilityId = abilityId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniInnerappPluginservicePublishResponseModel alipayOpenMiniInnerappPluginservicePublishResponseModel = (AlipayOpenMiniInnerappPluginservicePublishResponseModel) o;
    return Objects.equals(this.abilityId, alipayOpenMiniInnerappPluginservicePublishResponseModel.abilityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abilityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerappPluginservicePublishResponseModel {\n");
    sb.append("    abilityId: ").append(toIndentedString(abilityId)).append("\n");
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
    openapiFields.add("ability_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerappPluginservicePublishResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerappPluginservicePublishResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerappPluginservicePublishResponseModel is not found in the empty JSON string", AlipayOpenMiniInnerappPluginservicePublishResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniInnerappPluginservicePublishResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniInnerappPluginservicePublishResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ability_id") != null && !jsonObj.get("ability_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ability_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ability_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerappPluginservicePublishResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerappPluginservicePublishResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerappPluginservicePublishResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerappPluginservicePublishResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerappPluginservicePublishResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerappPluginservicePublishResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniInnerappPluginservicePublishResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniInnerappPluginservicePublishResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerappPluginservicePublishResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerappPluginservicePublishResponseModel
  */
  public static AlipayOpenMiniInnerappPluginservicePublishResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerappPluginservicePublishResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerappPluginservicePublishResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

