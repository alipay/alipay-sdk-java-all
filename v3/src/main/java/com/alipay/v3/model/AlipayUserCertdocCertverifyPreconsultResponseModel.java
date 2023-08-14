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
 * AlipayUserCertdocCertverifyPreconsultResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayUserCertdocCertverifyPreconsultResponseModel {
  public static final String SERIALIZED_NAME_VERIFY_ID = "verify_id";
  @SerializedName(SERIALIZED_NAME_VERIFY_ID)
  private String verifyId;

  public AlipayUserCertdocCertverifyPreconsultResponseModel() { 
  }

  public AlipayUserCertdocCertverifyPreconsultResponseModel verifyId(String verifyId) {
    
    this.verifyId = verifyId;
    return this;
  }

   /**
   * 申请验证ID。有效期为 2 小时，过期后在校验接口使用会报错 \&quot;校验信息已过期\&quot;。
   * @return verifyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "671ffcda5447bc87e9ed2f669eb143d4", value = "申请验证ID。有效期为 2 小时，过期后在校验接口使用会报错 \"校验信息已过期\"。")

  public String getVerifyId() {
    return verifyId;
  }


  public void setVerifyId(String verifyId) {
    this.verifyId = verifyId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayUserCertdocCertverifyPreconsultResponseModel alipayUserCertdocCertverifyPreconsultResponseModel = (AlipayUserCertdocCertverifyPreconsultResponseModel) o;
    return Objects.equals(this.verifyId, alipayUserCertdocCertverifyPreconsultResponseModel.verifyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verifyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayUserCertdocCertverifyPreconsultResponseModel {\n");
    sb.append("    verifyId: ").append(toIndentedString(verifyId)).append("\n");
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
    openapiFields.add("verify_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayUserCertdocCertverifyPreconsultResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayUserCertdocCertverifyPreconsultResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayUserCertdocCertverifyPreconsultResponseModel is not found in the empty JSON string", AlipayUserCertdocCertverifyPreconsultResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayUserCertdocCertverifyPreconsultResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayUserCertdocCertverifyPreconsultResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("verify_id") != null && !jsonObj.get("verify_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verify_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verify_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayUserCertdocCertverifyPreconsultResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayUserCertdocCertverifyPreconsultResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayUserCertdocCertverifyPreconsultResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayUserCertdocCertverifyPreconsultResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayUserCertdocCertverifyPreconsultResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayUserCertdocCertverifyPreconsultResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayUserCertdocCertverifyPreconsultResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayUserCertdocCertverifyPreconsultResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayUserCertdocCertverifyPreconsultResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayUserCertdocCertverifyPreconsultResponseModel
  */
  public static AlipayUserCertdocCertverifyPreconsultResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayUserCertdocCertverifyPreconsultResponseModel.class);
  }

 /**
  * Convert an instance of AlipayUserCertdocCertverifyPreconsultResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

