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
import com.alipay.v3.model.OpenidComplex;
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
 * AlipayOpenAppTestGrayCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAppTestGrayCreateModel {
  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_BODY1 = "body_1";
  @SerializedName(SERIALIZED_NAME_BODY1)
  private String body1;

  public static final String SERIALIZED_NAME_COMPLEX_PARAM = "complex_param";
  @SerializedName(SERIALIZED_NAME_COMPLEX_PARAM)
  private OpenidComplex complexParam;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AlipayOpenAppTestGrayCreateModel() { 
  }

  public AlipayOpenAppTestGrayCreateModel body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * b1
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "b1", value = "b1")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public AlipayOpenAppTestGrayCreateModel body1(String body1) {
    
    this.body1 = body1;
    return this;
  }

   /**
   * body
   * @return body1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "body")

  public String getBody1() {
    return body1;
  }


  public void setBody1(String body1) {
    this.body1 = body1;
  }


  public AlipayOpenAppTestGrayCreateModel complexParam(OpenidComplex complexParam) {
    
    this.complexParam = complexParam;
    return this;
  }

   /**
   * Get complexParam
   * @return complexParam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OpenidComplex getComplexParam() {
    return complexParam;
  }


  public void setComplexParam(OpenidComplex complexParam) {
    this.complexParam = complexParam;
  }


  public AlipayOpenAppTestGrayCreateModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * xx
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxx", value = "xx")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayOpenAppTestGrayCreateModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 1
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088001159940003", value = "1")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenAppTestGrayCreateModel alipayOpenAppTestGrayCreateModel = (AlipayOpenAppTestGrayCreateModel) o;
    return Objects.equals(this.body, alipayOpenAppTestGrayCreateModel.body) &&
        Objects.equals(this.body1, alipayOpenAppTestGrayCreateModel.body1) &&
        Objects.equals(this.complexParam, alipayOpenAppTestGrayCreateModel.complexParam) &&
        Objects.equals(this.openId, alipayOpenAppTestGrayCreateModel.openId) &&
        Objects.equals(this.userId, alipayOpenAppTestGrayCreateModel.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, body1, complexParam, openId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAppTestGrayCreateModel {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    body1: ").append(toIndentedString(body1)).append("\n");
    sb.append("    complexParam: ").append(toIndentedString(complexParam)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("body");
    openapiFields.add("body_1");
    openapiFields.add("complex_param");
    openapiFields.add("open_id");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAppTestGrayCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAppTestGrayCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAppTestGrayCreateModel is not found in the empty JSON string", AlipayOpenAppTestGrayCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenAppTestGrayCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenAppTestGrayCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("body") != null && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if (jsonObj.get("body_1") != null && !jsonObj.get("body_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body_1").toString()));
      }
      // validate the optional field `complex_param`
      if (jsonObj.getAsJsonObject("complex_param") != null) {
        OpenidComplex.validateJsonObject(jsonObj.getAsJsonObject("complex_param"));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAppTestGrayCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAppTestGrayCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAppTestGrayCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAppTestGrayCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAppTestGrayCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAppTestGrayCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenAppTestGrayCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenAppTestGrayCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAppTestGrayCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAppTestGrayCreateModel
  */
  public static AlipayOpenAppTestGrayCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAppTestGrayCreateModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAppTestGrayCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

