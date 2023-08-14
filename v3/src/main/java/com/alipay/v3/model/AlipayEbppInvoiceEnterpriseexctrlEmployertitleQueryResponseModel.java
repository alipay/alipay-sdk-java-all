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
import com.alipay.v3.model.EnterpriseTitleInfo;
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
 * AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private String msg;

  public static final String SERIALIZED_NAME_TITLE_INFO = "title_info";
  @SerializedName(SERIALIZED_NAME_TITLE_INFO)
  private EnterpriseTitleInfo titleInfo;

  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel() { 
  }

  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 返回码 10000-成功 其他都是失败
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "返回码 10000-成功 其他都是失败")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * 返回消息
   * @return msg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "成功", value = "返回消息")

  public String getMsg() {
    return msg;
  }


  public void setMsg(String msg) {
    this.msg = msg;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel titleInfo(EnterpriseTitleInfo titleInfo) {
    
    this.titleInfo = titleInfo;
    return this;
  }

   /**
   * Get titleInfo
   * @return titleInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnterpriseTitleInfo getTitleInfo() {
    return titleInfo;
  }


  public void setTitleInfo(EnterpriseTitleInfo titleInfo) {
    this.titleInfo = titleInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel alipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel = (AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel) o;
    return Objects.equals(this.code, alipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel.code) &&
        Objects.equals(this.msg, alipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel.msg) &&
        Objects.equals(this.titleInfo, alipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel.titleInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, msg, titleInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    titleInfo: ").append(toIndentedString(titleInfo)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("msg");
    openapiFields.add("title_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel is not found in the empty JSON string", AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("msg") != null && !jsonObj.get("msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msg").toString()));
      }
      // validate the optional field `title_info`
      if (jsonObj.getAsJsonObject("title_info") != null) {
        EnterpriseTitleInfo.validateJsonObject(jsonObj.getAsJsonObject("title_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel
  */
  public static AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

