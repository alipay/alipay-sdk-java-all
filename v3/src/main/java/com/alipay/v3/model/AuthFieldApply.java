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
 * AuthFieldApply
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthFieldApply {
  public static final String SERIALIZED_NAME_API_NAME = "api_name";
  @SerializedName(SERIALIZED_NAME_API_NAME)
  private String apiName;

  public static final String SERIALIZED_NAME_CUSTOMER_ANSWER = "customer_answer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ANSWER)
  private String customerAnswer;

  public static final String SERIALIZED_NAME_FIELD_NAME = "field_name";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_PACKAGE_CODE = "package_code";
  @SerializedName(SERIALIZED_NAME_PACKAGE_CODE)
  private String packageCode;

  public static final String SERIALIZED_NAME_QPS_ANSWER = "qps_answer";
  @SerializedName(SERIALIZED_NAME_QPS_ANSWER)
  private String qpsAnswer;

  public static final String SERIALIZED_NAME_SCENE_CODE = "scene_code";
  @SerializedName(SERIALIZED_NAME_SCENE_CODE)
  private String sceneCode;

  public static final String SERIALIZED_NAME_TINY_APP_TEMPLATE_ID = "tiny_app_template_id";
  @SerializedName(SERIALIZED_NAME_TINY_APP_TEMPLATE_ID)
  private String tinyAppTemplateId;

  public AuthFieldApply() { 
  }

  public AuthFieldApply apiName(String apiName) {
    
    this.apiName = apiName;
    return this;
  }

   /**
   * 接口英文名称，通过alipay.open.app.api.query接口查询获得。
   * @return apiName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipay.user.info.share", value = "接口英文名称，通过alipay.open.app.api.query接口查询获得。")

  public String getApiName() {
    return apiName;
  }


  public void setApiName(String apiName) {
    this.apiName = apiName;
  }


  public AuthFieldApply customerAnswer(String customerAnswer) {
    
    this.customerAnswer = customerAnswer;
    return this;
  }

   /**
   * 贵公司是否有自己的客服渠道，能及时响应和处理舆情数量是多少？
   * @return customerAnswer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "有自己的客服团队xx人，能够及时响应并处理舆能力", value = "贵公司是否有自己的客服渠道，能及时响应和处理舆情数量是多少？")

  public String getCustomerAnswer() {
    return customerAnswer;
  }


  public void setCustomerAnswer(String customerAnswer) {
    this.customerAnswer = customerAnswer;
  }


  public AuthFieldApply fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * 字段英文名称，通过alipay.open.app.api.query接口查询获得。
   * @return fieldName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mobile", value = "字段英文名称，通过alipay.open.app.api.query接口查询获得。")

  public String getFieldName() {
    return fieldName;
  }


  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public AuthFieldApply memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 备注
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "获取xx的用途：（1）xxxx（2）xxxx", value = "备注")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public AuthFieldApply packageCode(String packageCode) {
    
    this.packageCode = packageCode;
    return this;
  }

   /**
   * 功能code，通过alipay.open.app.api.query接口查询获得
   * @return packageCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20201019201538211864", value = "功能code，通过alipay.open.app.api.query接口查询获得")

  public String getPackageCode() {
    return packageCode;
  }


  public void setPackageCode(String packageCode) {
    this.packageCode = packageCode;
  }


  public AuthFieldApply qpsAnswer(String qpsAnswer) {
    
    this.qpsAnswer = qpsAnswer;
    return this;
  }

   /**
   * 接入后一年内预计接口秒级调用量峰值是多少？（最高峰值：1000QPS）
   * @return qpsAnswer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "预计接口秒级调用量峰值：xx QPS", value = "接入后一年内预计接口秒级调用量峰值是多少？（最高峰值：1000QPS）")

  public String getQpsAnswer() {
    return qpsAnswer;
  }


  public void setQpsAnswer(String qpsAnswer) {
    this.qpsAnswer = qpsAnswer;
  }


  public AuthFieldApply sceneCode(String sceneCode) {
    
    this.sceneCode = sceneCode;
    return this;
  }

   /**
   * 场景code，alipay.open.app.api.scene.query 接口查询获得
   * @return sceneCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6", value = "场景code，alipay.open.app.api.scene.query 接口查询获得")

  public String getSceneCode() {
    return sceneCode;
  }


  public void setSceneCode(String sceneCode) {
    this.sceneCode = sceneCode;
  }


  public AuthFieldApply tinyAppTemplateId(String tinyAppTemplateId) {
    
    this.tinyAppTemplateId = tinyAppTemplateId;
    return this;
  }

   /**
   * 当为使用使用模板的小程序申请时可传入所使用的小程序模板id
   * @return tinyAppTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "小程序模板id", value = "当为使用使用模板的小程序申请时可传入所使用的小程序模板id")

  public String getTinyAppTemplateId() {
    return tinyAppTemplateId;
  }


  public void setTinyAppTemplateId(String tinyAppTemplateId) {
    this.tinyAppTemplateId = tinyAppTemplateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthFieldApply authFieldApply = (AuthFieldApply) o;
    return Objects.equals(this.apiName, authFieldApply.apiName) &&
        Objects.equals(this.customerAnswer, authFieldApply.customerAnswer) &&
        Objects.equals(this.fieldName, authFieldApply.fieldName) &&
        Objects.equals(this.memo, authFieldApply.memo) &&
        Objects.equals(this.packageCode, authFieldApply.packageCode) &&
        Objects.equals(this.qpsAnswer, authFieldApply.qpsAnswer) &&
        Objects.equals(this.sceneCode, authFieldApply.sceneCode) &&
        Objects.equals(this.tinyAppTemplateId, authFieldApply.tinyAppTemplateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiName, customerAnswer, fieldName, memo, packageCode, qpsAnswer, sceneCode, tinyAppTemplateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthFieldApply {\n");
    sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
    sb.append("    customerAnswer: ").append(toIndentedString(customerAnswer)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    packageCode: ").append(toIndentedString(packageCode)).append("\n");
    sb.append("    qpsAnswer: ").append(toIndentedString(qpsAnswer)).append("\n");
    sb.append("    sceneCode: ").append(toIndentedString(sceneCode)).append("\n");
    sb.append("    tinyAppTemplateId: ").append(toIndentedString(tinyAppTemplateId)).append("\n");
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
    openapiFields.add("api_name");
    openapiFields.add("customer_answer");
    openapiFields.add("field_name");
    openapiFields.add("memo");
    openapiFields.add("package_code");
    openapiFields.add("qps_answer");
    openapiFields.add("scene_code");
    openapiFields.add("tiny_app_template_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthFieldApply
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthFieldApply.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthFieldApply is not found in the empty JSON string", AuthFieldApply.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthFieldApply.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthFieldApply` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("api_name") != null && !jsonObj.get("api_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_name").toString()));
      }
      if (jsonObj.get("customer_answer") != null && !jsonObj.get("customer_answer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_answer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_answer").toString()));
      }
      if (jsonObj.get("field_name") != null && !jsonObj.get("field_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field_name").toString()));
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("package_code") != null && !jsonObj.get("package_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package_code").toString()));
      }
      if (jsonObj.get("qps_answer") != null && !jsonObj.get("qps_answer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qps_answer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qps_answer").toString()));
      }
      if (jsonObj.get("scene_code") != null && !jsonObj.get("scene_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scene_code").toString()));
      }
      if (jsonObj.get("tiny_app_template_id") != null && !jsonObj.get("tiny_app_template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tiny_app_template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tiny_app_template_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthFieldApply.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthFieldApply' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthFieldApply> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthFieldApply.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthFieldApply>() {
           @Override
           public void write(JsonWriter out, AuthFieldApply value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthFieldApply read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthFieldApply given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthFieldApply
  * @throws IOException if the JSON string is invalid with respect to AuthFieldApply
  */
  public static AuthFieldApply fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthFieldApply.class);
  }

 /**
  * Convert an instance of AuthFieldApply to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

