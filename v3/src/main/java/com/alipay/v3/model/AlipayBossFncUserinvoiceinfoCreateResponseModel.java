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
 * AlipayBossFncUserinvoiceinfoCreateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayBossFncUserinvoiceinfoCreateResponseModel {
  public static final String SERIALIZED_NAME_RESULT_SET = "result_set";
  @SerializedName(SERIALIZED_NAME_RESULT_SET)
  private String resultSet;

  public AlipayBossFncUserinvoiceinfoCreateResponseModel() { 
  }

  public AlipayBossFncUserinvoiceinfoCreateResponseModel resultSet(String resultSet) {
    
    this.resultSet = resultSet;
    return this;
  }

   /**
   * 开票资料id，唯一性ID
   * @return resultSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018060810122000544800670000008977", value = "开票资料id，唯一性ID")

  public String getResultSet() {
    return resultSet;
  }


  public void setResultSet(String resultSet) {
    this.resultSet = resultSet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayBossFncUserinvoiceinfoCreateResponseModel alipayBossFncUserinvoiceinfoCreateResponseModel = (AlipayBossFncUserinvoiceinfoCreateResponseModel) o;
    return Objects.equals(this.resultSet, alipayBossFncUserinvoiceinfoCreateResponseModel.resultSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayBossFncUserinvoiceinfoCreateResponseModel {\n");
    sb.append("    resultSet: ").append(toIndentedString(resultSet)).append("\n");
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
    openapiFields.add("result_set");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayBossFncUserinvoiceinfoCreateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayBossFncUserinvoiceinfoCreateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayBossFncUserinvoiceinfoCreateResponseModel is not found in the empty JSON string", AlipayBossFncUserinvoiceinfoCreateResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayBossFncUserinvoiceinfoCreateResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayBossFncUserinvoiceinfoCreateResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("result_set") != null && !jsonObj.get("result_set").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result_set` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result_set").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayBossFncUserinvoiceinfoCreateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayBossFncUserinvoiceinfoCreateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayBossFncUserinvoiceinfoCreateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayBossFncUserinvoiceinfoCreateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayBossFncUserinvoiceinfoCreateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayBossFncUserinvoiceinfoCreateResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayBossFncUserinvoiceinfoCreateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayBossFncUserinvoiceinfoCreateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayBossFncUserinvoiceinfoCreateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayBossFncUserinvoiceinfoCreateResponseModel
  */
  public static AlipayBossFncUserinvoiceinfoCreateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayBossFncUserinvoiceinfoCreateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayBossFncUserinvoiceinfoCreateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

