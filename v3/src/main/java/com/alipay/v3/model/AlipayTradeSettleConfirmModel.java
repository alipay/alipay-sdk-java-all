/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-07-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.SettleConfirmExtendParams;
import com.alipay.v3.model.SettleInfo;
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
 * AlipayTradeSettleConfirmModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeSettleConfirmModel {
  public static final String SERIALIZED_NAME_EXTEND_PARAMS = "extend_params";
  @SerializedName(SERIALIZED_NAME_EXTEND_PARAMS)
  private SettleConfirmExtendParams extendParams;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_SETTLE_INFO = "settle_info";
  @SerializedName(SERIALIZED_NAME_SETTLE_INFO)
  private SettleInfo settleInfo;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AlipayTradeSettleConfirmModel() { 
  }

  public AlipayTradeSettleConfirmModel extendParams(SettleConfirmExtendParams extendParams) {
    
    this.extendParams = extendParams;
    return this;
  }

   /**
   * Get extendParams
   * @return extendParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SettleConfirmExtendParams getExtendParams() {
    return extendParams;
  }


  public void setExtendParams(SettleConfirmExtendParams extendParams) {
    this.extendParams = extendParams;
  }


  public AlipayTradeSettleConfirmModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 确认结算请求流水号，开发者自行生成并保证唯一性，作为业务幂等性控制
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20160727001", value = "确认结算请求流水号，开发者自行生成并保证唯一性，作为业务幂等性控制")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayTradeSettleConfirmModel settleInfo(SettleInfo settleInfo) {
    
    this.settleInfo = settleInfo;
    return this;
  }

   /**
   * Get settleInfo
   * @return settleInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SettleInfo getSettleInfo() {
    return settleInfo;
  }


  public void setSettleInfo(SettleInfo settleInfo) {
    this.settleInfo = settleInfo;
  }


  public AlipayTradeSettleConfirmModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝交易号
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015070921001004130000127421", value = "支付宝交易号")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
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
   * @return the AlipayTradeSettleConfirmModel instance itself
   */
  public AlipayTradeSettleConfirmModel putAdditionalProperty(String key, Object value) {
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
    AlipayTradeSettleConfirmModel alipayTradeSettleConfirmModel = (AlipayTradeSettleConfirmModel) o;
    return Objects.equals(this.extendParams, alipayTradeSettleConfirmModel.extendParams) &&
        Objects.equals(this.outRequestNo, alipayTradeSettleConfirmModel.outRequestNo) &&
        Objects.equals(this.settleInfo, alipayTradeSettleConfirmModel.settleInfo) &&
        Objects.equals(this.tradeNo, alipayTradeSettleConfirmModel.tradeNo)&&
        Objects.equals(this.additionalProperties, alipayTradeSettleConfirmModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendParams, outRequestNo, settleInfo, tradeNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeSettleConfirmModel {\n");
    sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    settleInfo: ").append(toIndentedString(settleInfo)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
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
    openapiFields.add("extend_params");
    openapiFields.add("out_request_no");
    openapiFields.add("settle_info");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeSettleConfirmModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeSettleConfirmModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeSettleConfirmModel is not found in the empty JSON string", AlipayTradeSettleConfirmModel.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `extend_params`
      if (jsonObj.getAsJsonObject("extend_params") != null) {
        SettleConfirmExtendParams.validateJsonObject(jsonObj.getAsJsonObject("extend_params"));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      // validate the optional field `settle_info`
      if (jsonObj.getAsJsonObject("settle_info") != null) {
        SettleInfo.validateJsonObject(jsonObj.getAsJsonObject("settle_info"));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeSettleConfirmModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeSettleConfirmModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeSettleConfirmModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeSettleConfirmModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeSettleConfirmModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeSettleConfirmModel value) throws IOException {
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
           public AlipayTradeSettleConfirmModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayTradeSettleConfirmModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayTradeSettleConfirmModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeSettleConfirmModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeSettleConfirmModel
  */
  public static AlipayTradeSettleConfirmModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeSettleConfirmModel.class);
  }

 /**
  * Convert an instance of AlipayTradeSettleConfirmModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

