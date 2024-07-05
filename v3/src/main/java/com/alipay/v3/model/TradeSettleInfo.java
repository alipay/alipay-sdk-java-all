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
import com.alipay.v3.model.TradeSettleDetail;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * TradeSettleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TradeSettleInfo {
  public static final String SERIALIZED_NAME_TRADE_SETTLE_DETAIL_LIST = "trade_settle_detail_list";
  @SerializedName(SERIALIZED_NAME_TRADE_SETTLE_DETAIL_LIST)
  private List<TradeSettleDetail> tradeSettleDetailList = null;

  public static final String SERIALIZED_NAME_TRADE_UNSETTLED_AMOUNT = "trade_unsettled_amount";
  @SerializedName(SERIALIZED_NAME_TRADE_UNSETTLED_AMOUNT)
  private String tradeUnsettledAmount;

  public TradeSettleInfo() { 
  }

  public TradeSettleInfo tradeSettleDetailList(List<TradeSettleDetail> tradeSettleDetailList) {
    
    this.tradeSettleDetailList = tradeSettleDetailList;
    return this;
  }

  public TradeSettleInfo addTradeSettleDetailListItem(TradeSettleDetail tradeSettleDetailListItem) {
    if (this.tradeSettleDetailList == null) {
      this.tradeSettleDetailList = new ArrayList<>();
    }
    this.tradeSettleDetailList.add(tradeSettleDetailListItem);
    return this;
  }

   /**
   * 交易结算明细信息
   * @return tradeSettleDetailList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "交易结算明细信息")

  public List<TradeSettleDetail> getTradeSettleDetailList() {
    return tradeSettleDetailList;
  }


  public void setTradeSettleDetailList(List<TradeSettleDetail> tradeSettleDetailList) {
    this.tradeSettleDetailList = tradeSettleDetailList;
  }


  public TradeSettleInfo tradeUnsettledAmount(String tradeUnsettledAmount) {
    
    this.tradeUnsettledAmount = tradeUnsettledAmount;
    return this;
  }

   /**
   * 直付通账期、直连账期下返回，其他场景为空，表示一笔订单剩余待结算金额
   * @return tradeUnsettledAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.1", value = "直付通账期、直连账期下返回，其他场景为空，表示一笔订单剩余待结算金额")

  public String getTradeUnsettledAmount() {
    return tradeUnsettledAmount;
  }


  public void setTradeUnsettledAmount(String tradeUnsettledAmount) {
    this.tradeUnsettledAmount = tradeUnsettledAmount;
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
   * @return the TradeSettleInfo instance itself
   */
  public TradeSettleInfo putAdditionalProperty(String key, Object value) {
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
    TradeSettleInfo tradeSettleInfo = (TradeSettleInfo) o;
    return Objects.equals(this.tradeSettleDetailList, tradeSettleInfo.tradeSettleDetailList) &&
        Objects.equals(this.tradeUnsettledAmount, tradeSettleInfo.tradeUnsettledAmount)&&
        Objects.equals(this.additionalProperties, tradeSettleInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tradeSettleDetailList, tradeUnsettledAmount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeSettleInfo {\n");
    sb.append("    tradeSettleDetailList: ").append(toIndentedString(tradeSettleDetailList)).append("\n");
    sb.append("    tradeUnsettledAmount: ").append(toIndentedString(tradeUnsettledAmount)).append("\n");
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
    openapiFields.add("trade_settle_detail_list");
    openapiFields.add("trade_unsettled_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TradeSettleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TradeSettleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TradeSettleInfo is not found in the empty JSON string", TradeSettleInfo.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArraytradeSettleDetailList = jsonObj.getAsJsonArray("trade_settle_detail_list");
      if (jsonArraytradeSettleDetailList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("trade_settle_detail_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `trade_settle_detail_list` to be an array in the JSON string but got `%s`", jsonObj.get("trade_settle_detail_list").toString()));
        }

        // validate the optional field `trade_settle_detail_list` (array)
        for (int i = 0; i < jsonArraytradeSettleDetailList.size(); i++) {
          TradeSettleDetail.validateJsonObject(jsonArraytradeSettleDetailList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("trade_unsettled_amount") != null && !jsonObj.get("trade_unsettled_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_unsettled_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_unsettled_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TradeSettleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TradeSettleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TradeSettleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TradeSettleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TradeSettleInfo>() {
           @Override
           public void write(JsonWriter out, TradeSettleInfo value) throws IOException {
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
           public TradeSettleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TradeSettleInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TradeSettleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TradeSettleInfo
  * @throws IOException if the JSON string is invalid with respect to TradeSettleInfo
  */
  public static TradeSettleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TradeSettleInfo.class);
  }

 /**
  * Convert an instance of TradeSettleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

