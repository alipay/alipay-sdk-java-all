/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2025-03-05
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
 * AlipayOpenAgentCreateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAgentCreateResponseModel {
  public static final String SERIALIZED_NAME_BATCH_NO = "batch_no";
  @SerializedName(SERIALIZED_NAME_BATCH_NO)
  private String batchNo;

  public static final String SERIALIZED_NAME_BATCH_STATUS = "batch_status";
  @SerializedName(SERIALIZED_NAME_BATCH_STATUS)
  private String batchStatus;

  public AlipayOpenAgentCreateResponseModel() { 
  }

  public AlipayOpenAgentCreateResponseModel batchNo(String batchNo) {
    
    this.batchNo = batchNo;
    return this;
  }

   /**
   * 本次代商户操作的全局唯一事务编号，后续代商户创建小程序、代签约当面付等产品、提交事务等接口都需要传递该batch_no值，且要确认只有 init 状态的batch_no才能发起调用。
   * @return batchNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017110616474516400082883", value = "本次代商户操作的全局唯一事务编号，后续代商户创建小程序、代签约当面付等产品、提交事务等接口都需要传递该batch_no值，且要确认只有 init 状态的batch_no才能发起调用。")

  public String getBatchNo() {
    return batchNo;
  }


  public void setBatchNo(String batchNo) {
    this.batchNo = batchNo;
  }


  public AlipayOpenAgentCreateResponseModel batchStatus(String batchStatus) {
    
    this.batchStatus = batchStatus;
    return this;
  }

   /**
   * ISV 代商户操作事务状态，事务状态包括：  init&#x3D;初始状态，本接口alipay.open.agent.create返回 init 状态，只有init状态允许进行各种业务接口调用；  submit&#x3D;提交状态，事务已经到达终态，调用alipay.open.agent.confirm接口可以提交init状态的事务  cancel&#x3D;取消状态，事务已经到达终态，调用alipay.open.agent.cancel接口可以取消init状态的事务  timeout&#x3D;超时状态，事务已经到达终态，init状态的事务，在【1个小时】后会自动超时  注意：只有 init 状态才允许进行接口调用，其它状态都是终态，不允许继续进行接口调用。
   * @return batchStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "init", value = "ISV 代商户操作事务状态，事务状态包括：  init=初始状态，本接口alipay.open.agent.create返回 init 状态，只有init状态允许进行各种业务接口调用；  submit=提交状态，事务已经到达终态，调用alipay.open.agent.confirm接口可以提交init状态的事务  cancel=取消状态，事务已经到达终态，调用alipay.open.agent.cancel接口可以取消init状态的事务  timeout=超时状态，事务已经到达终态，init状态的事务，在【1个小时】后会自动超时  注意：只有 init 状态才允许进行接口调用，其它状态都是终态，不允许继续进行接口调用。")

  public String getBatchStatus() {
    return batchStatus;
  }


  public void setBatchStatus(String batchStatus) {
    this.batchStatus = batchStatus;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AlipayOpenAgentCreateResponseModel instance itself
   */
  public AlipayOpenAgentCreateResponseModel putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenAgentCreateResponseModel alipayOpenAgentCreateResponseModel = (AlipayOpenAgentCreateResponseModel) o;
    return Objects.equals(this.batchNo, alipayOpenAgentCreateResponseModel.batchNo) &&
        Objects.equals(this.batchStatus, alipayOpenAgentCreateResponseModel.batchStatus)&&
        Objects.equals(this.additionalProperties, alipayOpenAgentCreateResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchNo, batchStatus, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAgentCreateResponseModel {\n");
    sb.append("    batchNo: ").append(toIndentedString(batchNo)).append("\n");
    sb.append("    batchStatus: ").append(toIndentedString(batchStatus)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("batch_no");
    openapiFields.add("batch_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAgentCreateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAgentCreateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAgentCreateResponseModel is not found in the empty JSON string", AlipayOpenAgentCreateResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("batch_no") != null && !jsonObj.get("batch_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_no").toString()));
      }
      if (jsonObj.get("batch_status") != null && !jsonObj.get("batch_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAgentCreateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAgentCreateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAgentCreateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAgentCreateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAgentCreateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAgentCreateResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenAgentCreateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenAgentCreateResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenAgentCreateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAgentCreateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAgentCreateResponseModel
  */
  public static AlipayOpenAgentCreateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAgentCreateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAgentCreateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

