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
 * AlipayPcreditHuabeiAuthSettleApplyResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayPcreditHuabeiAuthSettleApplyResponseModel {
  public static final String SERIALIZED_NAME_FAIL_REASON = "fail_reason";
  @SerializedName(SERIALIZED_NAME_FAIL_REASON)
  private String failReason;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public AlipayPcreditHuabeiAuthSettleApplyResponseModel() { 
  }

  public AlipayPcreditHuabeiAuthSettleApplyResponseModel failReason(String failReason) {
    
    this.failReason = failReason;
    return this;
  }

   /**
   * 根据商户传入的轻会员协议结算周期内累计消费数据与支付宝端轻会员协议结算周期内消费数据比对之后，若数据不一致，则会返回对应的异常数据比对结果。
   * @return failReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "累计支付宝支付金额不一致,支付宝:100.00元,商户:150.00元", value = "根据商户传入的轻会员协议结算周期内累计消费数据与支付宝端轻会员协议结算周期内消费数据比对之后，若数据不一致，则会返回对应的异常数据比对结果。")

  public String getFailReason() {
    return failReason;
  }


  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  public AlipayPcreditHuabeiAuthSettleApplyResponseModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 商户本次操作的请求流水号，用于标示请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8077735255938032", value = "商户本次操作的请求流水号，用于标示请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayPcreditHuabeiAuthSettleApplyResponseModel alipayPcreditHuabeiAuthSettleApplyResponseModel = (AlipayPcreditHuabeiAuthSettleApplyResponseModel) o;
    return Objects.equals(this.failReason, alipayPcreditHuabeiAuthSettleApplyResponseModel.failReason) &&
        Objects.equals(this.outRequestNo, alipayPcreditHuabeiAuthSettleApplyResponseModel.outRequestNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failReason, outRequestNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayPcreditHuabeiAuthSettleApplyResponseModel {\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
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
    openapiFields.add("fail_reason");
    openapiFields.add("out_request_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayPcreditHuabeiAuthSettleApplyResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayPcreditHuabeiAuthSettleApplyResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayPcreditHuabeiAuthSettleApplyResponseModel is not found in the empty JSON string", AlipayPcreditHuabeiAuthSettleApplyResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayPcreditHuabeiAuthSettleApplyResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayPcreditHuabeiAuthSettleApplyResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("fail_reason") != null && !jsonObj.get("fail_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fail_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fail_reason").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayPcreditHuabeiAuthSettleApplyResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayPcreditHuabeiAuthSettleApplyResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayPcreditHuabeiAuthSettleApplyResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayPcreditHuabeiAuthSettleApplyResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayPcreditHuabeiAuthSettleApplyResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayPcreditHuabeiAuthSettleApplyResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayPcreditHuabeiAuthSettleApplyResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayPcreditHuabeiAuthSettleApplyResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayPcreditHuabeiAuthSettleApplyResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayPcreditHuabeiAuthSettleApplyResponseModel
  */
  public static AlipayPcreditHuabeiAuthSettleApplyResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayPcreditHuabeiAuthSettleApplyResponseModel.class);
  }

 /**
  * Convert an instance of AlipayPcreditHuabeiAuthSettleApplyResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

