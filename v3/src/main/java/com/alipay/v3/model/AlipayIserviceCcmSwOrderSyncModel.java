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
import com.alipay.v3.model.LogisticInfo;
import com.alipay.v3.model.SpuInfo;
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
 * AlipayIserviceCcmSwOrderSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmSwOrderSyncModel {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_LINK_URL = "link_url";
  @SerializedName(SERIALIZED_NAME_LINK_URL)
  private String linkUrl;

  public static final String SERIALIZED_NAME_LOGISTIC_COUNT = "logistic_count";
  @SerializedName(SERIALIZED_NAME_LOGISTIC_COUNT)
  private Integer logisticCount;

  public static final String SERIALIZED_NAME_LOGISTICS = "logistics";
  @SerializedName(SERIALIZED_NAME_LOGISTICS)
  private List<LogisticInfo> logistics = null;

  public static final String SERIALIZED_NAME_ORDER_CREATE_TIME = "order_create_time";
  @SerializedName(SERIALIZED_NAME_ORDER_CREATE_TIME)
  private String orderCreateTime;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ORDER_TYPE = "order_type";
  @SerializedName(SERIALIZED_NAME_ORDER_TYPE)
  private String orderType;

  public static final String SERIALIZED_NAME_SPU_COUNT = "spu_count";
  @SerializedName(SERIALIZED_NAME_SPU_COUNT)
  private Integer spuCount;

  public static final String SERIALIZED_NAME_SPUS = "spus";
  @SerializedName(SERIALIZED_NAME_SPUS)
  private List<SpuInfo> spus = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SUB_STATUS = "sub_status";
  @SerializedName(SERIALIZED_NAME_SUB_STATUS)
  private String subStatus;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AlipayIserviceCcmSwOrderSyncModel() { 
  }

  public AlipayIserviceCcmSwOrderSyncModel amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 订单金额
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12234.33", value = "订单金额")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public AlipayIserviceCcmSwOrderSyncModel linkUrl(String linkUrl) {
    
    this.linkUrl = linkUrl;
    return this;
  }

   /**
   * 订单链接
   * @return linkUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://taobao.com/order/1214134234", value = "订单链接")

  public String getLinkUrl() {
    return linkUrl;
  }


  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }


  public AlipayIserviceCcmSwOrderSyncModel logisticCount(Integer logisticCount) {
    
    this.logisticCount = logisticCount;
    return this;
  }

   /**
   * 订单物流数量
   * @return logisticCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "订单物流数量")

  public Integer getLogisticCount() {
    return logisticCount;
  }


  public void setLogisticCount(Integer logisticCount) {
    this.logisticCount = logisticCount;
  }


  public AlipayIserviceCcmSwOrderSyncModel logistics(List<LogisticInfo> logistics) {
    
    this.logistics = logistics;
    return this;
  }

  public AlipayIserviceCcmSwOrderSyncModel addLogisticsItem(LogisticInfo logisticsItem) {
    if (this.logistics == null) {
      this.logistics = new ArrayList<>();
    }
    this.logistics.add(logisticsItem);
    return this;
  }

   /**
   * 物流信息列表
   * @return logistics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "物流信息列表")

  public List<LogisticInfo> getLogistics() {
    return logistics;
  }


  public void setLogistics(List<LogisticInfo> logistics) {
    this.logistics = logistics;
  }


  public AlipayIserviceCcmSwOrderSyncModel orderCreateTime(String orderCreateTime) {
    
    this.orderCreateTime = orderCreateTime;
    return this;
  }

   /**
   * 订单创建时间
   * @return orderCreateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-04-04 09:09:09", value = "订单创建时间")

  public String getOrderCreateTime() {
    return orderCreateTime;
  }


  public void setOrderCreateTime(String orderCreateTime) {
    this.orderCreateTime = orderCreateTime;
  }


  public AlipayIserviceCcmSwOrderSyncModel orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 订单id
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123121414", value = "订单id")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public AlipayIserviceCcmSwOrderSyncModel orderType(String orderType) {
    
    this.orderType = orderType;
    return this;
  }

   /**
   * 普通订单：NORMAL 预售订单：PRE_SALE
   * @return orderType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NORMAL", value = "普通订单：NORMAL 预售订单：PRE_SALE")

  public String getOrderType() {
    return orderType;
  }


  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }


  public AlipayIserviceCcmSwOrderSyncModel spuCount(Integer spuCount) {
    
    this.spuCount = spuCount;
    return this;
  }

   /**
   * 订单商品种类
   * @return spuCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "订单商品种类")

  public Integer getSpuCount() {
    return spuCount;
  }


  public void setSpuCount(Integer spuCount) {
    this.spuCount = spuCount;
  }


  public AlipayIserviceCcmSwOrderSyncModel spus(List<SpuInfo> spus) {
    
    this.spus = spus;
    return this;
  }

  public AlipayIserviceCcmSwOrderSyncModel addSpusItem(SpuInfo spusItem) {
    if (this.spus == null) {
      this.spus = new ArrayList<>();
    }
    this.spus.add(spusItem);
    return this;
  }

   /**
   * 订单商品信息
   * @return spus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "订单商品信息")

  public List<SpuInfo> getSpus() {
    return spus;
  }


  public void setSpus(List<SpuInfo> spus) {
    this.spus = spus;
  }


  public AlipayIserviceCcmSwOrderSyncModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 订单状态，目前支持以下几种状态 下单未支付 WAIT_PAY 支付未发货 PAIED 已发货 IN_DELIVERY 售后中 IN_AFTER_SALE 订单完成 FINISHED
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WAIT_PAY", value = "订单状态，目前支持以下几种状态 下单未支付 WAIT_PAY 支付未发货 PAIED 已发货 IN_DELIVERY 售后中 IN_AFTER_SALE 订单完成 FINISHED")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayIserviceCcmSwOrderSyncModel subStatus(String subStatus) {
    
    this.subStatus = subStatus;
    return this;
  }

   /**
   * 订单子状态
   * @return subStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SIGNED", value = "订单子状态")

  public String getSubStatus() {
    return subStatus;
  }


  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
  }


  public AlipayIserviceCcmSwOrderSyncModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 下单用户id(外部系统ID)
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "90932423423", value = "下单用户id(外部系统ID)")

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
    AlipayIserviceCcmSwOrderSyncModel alipayIserviceCcmSwOrderSyncModel = (AlipayIserviceCcmSwOrderSyncModel) o;
    return Objects.equals(this.amount, alipayIserviceCcmSwOrderSyncModel.amount) &&
        Objects.equals(this.linkUrl, alipayIserviceCcmSwOrderSyncModel.linkUrl) &&
        Objects.equals(this.logisticCount, alipayIserviceCcmSwOrderSyncModel.logisticCount) &&
        Objects.equals(this.logistics, alipayIserviceCcmSwOrderSyncModel.logistics) &&
        Objects.equals(this.orderCreateTime, alipayIserviceCcmSwOrderSyncModel.orderCreateTime) &&
        Objects.equals(this.orderId, alipayIserviceCcmSwOrderSyncModel.orderId) &&
        Objects.equals(this.orderType, alipayIserviceCcmSwOrderSyncModel.orderType) &&
        Objects.equals(this.spuCount, alipayIserviceCcmSwOrderSyncModel.spuCount) &&
        Objects.equals(this.spus, alipayIserviceCcmSwOrderSyncModel.spus) &&
        Objects.equals(this.status, alipayIserviceCcmSwOrderSyncModel.status) &&
        Objects.equals(this.subStatus, alipayIserviceCcmSwOrderSyncModel.subStatus) &&
        Objects.equals(this.userId, alipayIserviceCcmSwOrderSyncModel.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, linkUrl, logisticCount, logistics, orderCreateTime, orderId, orderType, spuCount, spus, status, subStatus, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmSwOrderSyncModel {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
    sb.append("    logisticCount: ").append(toIndentedString(logisticCount)).append("\n");
    sb.append("    logistics: ").append(toIndentedString(logistics)).append("\n");
    sb.append("    orderCreateTime: ").append(toIndentedString(orderCreateTime)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    spuCount: ").append(toIndentedString(spuCount)).append("\n");
    sb.append("    spus: ").append(toIndentedString(spus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("link_url");
    openapiFields.add("logistic_count");
    openapiFields.add("logistics");
    openapiFields.add("order_create_time");
    openapiFields.add("order_id");
    openapiFields.add("order_type");
    openapiFields.add("spu_count");
    openapiFields.add("spus");
    openapiFields.add("status");
    openapiFields.add("sub_status");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmSwOrderSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmSwOrderSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmSwOrderSyncModel is not found in the empty JSON string", AlipayIserviceCcmSwOrderSyncModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayIserviceCcmSwOrderSyncModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayIserviceCcmSwOrderSyncModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("link_url") != null && !jsonObj.get("link_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_url").toString()));
      }
      JsonArray jsonArraylogistics = jsonObj.getAsJsonArray("logistics");
      if (jsonArraylogistics != null) {
        // ensure the json data is an array
        if (!jsonObj.get("logistics").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `logistics` to be an array in the JSON string but got `%s`", jsonObj.get("logistics").toString()));
        }

        // validate the optional field `logistics` (array)
        for (int i = 0; i < jsonArraylogistics.size(); i++) {
          LogisticInfo.validateJsonObject(jsonArraylogistics.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("order_create_time") != null && !jsonObj.get("order_create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_create_time").toString()));
      }
      if (jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if (jsonObj.get("order_type") != null && !jsonObj.get("order_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_type").toString()));
      }
      JsonArray jsonArrayspus = jsonObj.getAsJsonArray("spus");
      if (jsonArrayspus != null) {
        // ensure the json data is an array
        if (!jsonObj.get("spus").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `spus` to be an array in the JSON string but got `%s`", jsonObj.get("spus").toString()));
        }

        // validate the optional field `spus` (array)
        for (int i = 0; i < jsonArrayspus.size(); i++) {
          SpuInfo.validateJsonObject(jsonArrayspus.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("sub_status") != null && !jsonObj.get("sub_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_status").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmSwOrderSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmSwOrderSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmSwOrderSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmSwOrderSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmSwOrderSyncModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmSwOrderSyncModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayIserviceCcmSwOrderSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayIserviceCcmSwOrderSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmSwOrderSyncModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmSwOrderSyncModel
  */
  public static AlipayIserviceCcmSwOrderSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmSwOrderSyncModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmSwOrderSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

