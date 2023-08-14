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
 * AlipayOpenPublicLifeMsgSendResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicLifeMsgSendResponseModel {
  public static final String SERIALIZED_NAME_ALIPAY_MSG_ID = "alipay_msg_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_MSG_ID)
  private String alipayMsgId;

  public AlipayOpenPublicLifeMsgSendResponseModel() { 
  }

  public AlipayOpenPublicLifeMsgSendResponseModel alipayMsgId(String alipayMsgId) {
    
    this.alipayMsgId = alipayMsgId;
    return this;
  }

   /**
   * 生活号消息唯一标识
   * @return alipayMsgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016042811340001", value = "生活号消息唯一标识")

  public String getAlipayMsgId() {
    return alipayMsgId;
  }


  public void setAlipayMsgId(String alipayMsgId) {
    this.alipayMsgId = alipayMsgId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicLifeMsgSendResponseModel alipayOpenPublicLifeMsgSendResponseModel = (AlipayOpenPublicLifeMsgSendResponseModel) o;
    return Objects.equals(this.alipayMsgId, alipayOpenPublicLifeMsgSendResponseModel.alipayMsgId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alipayMsgId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicLifeMsgSendResponseModel {\n");
    sb.append("    alipayMsgId: ").append(toIndentedString(alipayMsgId)).append("\n");
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
    openapiFields.add("alipay_msg_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicLifeMsgSendResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicLifeMsgSendResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicLifeMsgSendResponseModel is not found in the empty JSON string", AlipayOpenPublicLifeMsgSendResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicLifeMsgSendResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicLifeMsgSendResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("alipay_msg_id") != null && !jsonObj.get("alipay_msg_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_msg_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_msg_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicLifeMsgSendResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicLifeMsgSendResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicLifeMsgSendResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicLifeMsgSendResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicLifeMsgSendResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicLifeMsgSendResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicLifeMsgSendResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicLifeMsgSendResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicLifeMsgSendResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicLifeMsgSendResponseModel
  */
  public static AlipayOpenPublicLifeMsgSendResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicLifeMsgSendResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicLifeMsgSendResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

