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
import com.alipay.v3.model.BizOrderQueryResponse;
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
 * AlipayOfflineMarketApplyorderBatchqueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOfflineMarketApplyorderBatchqueryResponseModel {
  public static final String SERIALIZED_NAME_BIZ_ORDER_INFOS = "biz_order_infos";
  @SerializedName(SERIALIZED_NAME_BIZ_ORDER_INFOS)
  private List<BizOrderQueryResponse> bizOrderInfos = null;

  public static final String SERIALIZED_NAME_CURRENT_PAGE_NO = "current_page_no";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE_NO)
  private Integer currentPageNo;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL_ITEMS = "total_items";
  @SerializedName(SERIALIZED_NAME_TOTAL_ITEMS)
  private Integer totalItems;

  public static final String SERIALIZED_NAME_TOTAL_PAGE_NO = "total_page_no";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGE_NO)
  private Integer totalPageNo;

  public AlipayOfflineMarketApplyorderBatchqueryResponseModel() { 
  }

  public AlipayOfflineMarketApplyorderBatchqueryResponseModel bizOrderInfos(List<BizOrderQueryResponse> bizOrderInfos) {
    
    this.bizOrderInfos = bizOrderInfos;
    return this;
  }

  public AlipayOfflineMarketApplyorderBatchqueryResponseModel addBizOrderInfosItem(BizOrderQueryResponse bizOrderInfosItem) {
    if (this.bizOrderInfos == null) {
      this.bizOrderInfos = new ArrayList<>();
    }
    this.bizOrderInfos.add(bizOrderInfosItem);
    return this;
  }

   /**
   * 支付宝操作流水信息列表
   * @return bizOrderInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝操作流水信息列表")

  public List<BizOrderQueryResponse> getBizOrderInfos() {
    return bizOrderInfos;
  }


  public void setBizOrderInfos(List<BizOrderQueryResponse> bizOrderInfos) {
    this.bizOrderInfos = bizOrderInfos;
  }


  public AlipayOfflineMarketApplyorderBatchqueryResponseModel currentPageNo(Integer currentPageNo) {
    
    this.currentPageNo = currentPageNo;
    return this;
  }

   /**
   * 当前页码
   * @return currentPageNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当前页码")

  public Integer getCurrentPageNo() {
    return currentPageNo;
  }


  public void setCurrentPageNo(Integer currentPageNo) {
    this.currentPageNo = currentPageNo;
  }


  public AlipayOfflineMarketApplyorderBatchqueryResponseModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页记录数
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "每页记录数")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayOfflineMarketApplyorderBatchqueryResponseModel totalItems(Integer totalItems) {
    
    this.totalItems = totalItems;
    return this;
  }

   /**
   * 总记录数
   * @return totalItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "总记录数")

  public Integer getTotalItems() {
    return totalItems;
  }


  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }


  public AlipayOfflineMarketApplyorderBatchqueryResponseModel totalPageNo(Integer totalPageNo) {
    
    this.totalPageNo = totalPageNo;
    return this;
  }

   /**
   * 总页码数目
   * @return totalPageNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "总页码数目")

  public Integer getTotalPageNo() {
    return totalPageNo;
  }


  public void setTotalPageNo(Integer totalPageNo) {
    this.totalPageNo = totalPageNo;
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
   * @return the AlipayOfflineMarketApplyorderBatchqueryResponseModel instance itself
   */
  public AlipayOfflineMarketApplyorderBatchqueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayOfflineMarketApplyorderBatchqueryResponseModel alipayOfflineMarketApplyorderBatchqueryResponseModel = (AlipayOfflineMarketApplyorderBatchqueryResponseModel) o;
    return Objects.equals(this.bizOrderInfos, alipayOfflineMarketApplyorderBatchqueryResponseModel.bizOrderInfos) &&
        Objects.equals(this.currentPageNo, alipayOfflineMarketApplyorderBatchqueryResponseModel.currentPageNo) &&
        Objects.equals(this.pageSize, alipayOfflineMarketApplyorderBatchqueryResponseModel.pageSize) &&
        Objects.equals(this.totalItems, alipayOfflineMarketApplyorderBatchqueryResponseModel.totalItems) &&
        Objects.equals(this.totalPageNo, alipayOfflineMarketApplyorderBatchqueryResponseModel.totalPageNo)&&
        Objects.equals(this.additionalProperties, alipayOfflineMarketApplyorderBatchqueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizOrderInfos, currentPageNo, pageSize, totalItems, totalPageNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOfflineMarketApplyorderBatchqueryResponseModel {\n");
    sb.append("    bizOrderInfos: ").append(toIndentedString(bizOrderInfos)).append("\n");
    sb.append("    currentPageNo: ").append(toIndentedString(currentPageNo)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    totalPageNo: ").append(toIndentedString(totalPageNo)).append("\n");
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
    openapiFields.add("biz_order_infos");
    openapiFields.add("current_page_no");
    openapiFields.add("page_size");
    openapiFields.add("total_items");
    openapiFields.add("total_page_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOfflineMarketApplyorderBatchqueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOfflineMarketApplyorderBatchqueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOfflineMarketApplyorderBatchqueryResponseModel is not found in the empty JSON string", AlipayOfflineMarketApplyorderBatchqueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArraybizOrderInfos = jsonObj.getAsJsonArray("biz_order_infos");
      if (jsonArraybizOrderInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("biz_order_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `biz_order_infos` to be an array in the JSON string but got `%s`", jsonObj.get("biz_order_infos").toString()));
        }

        // validate the optional field `biz_order_infos` (array)
        for (int i = 0; i < jsonArraybizOrderInfos.size(); i++) {
          BizOrderQueryResponse.validateJsonObject(jsonArraybizOrderInfos.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOfflineMarketApplyorderBatchqueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOfflineMarketApplyorderBatchqueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOfflineMarketApplyorderBatchqueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOfflineMarketApplyorderBatchqueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOfflineMarketApplyorderBatchqueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOfflineMarketApplyorderBatchqueryResponseModel value) throws IOException {
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
           public AlipayOfflineMarketApplyorderBatchqueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOfflineMarketApplyorderBatchqueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOfflineMarketApplyorderBatchqueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOfflineMarketApplyorderBatchqueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOfflineMarketApplyorderBatchqueryResponseModel
  */
  public static AlipayOfflineMarketApplyorderBatchqueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOfflineMarketApplyorderBatchqueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOfflineMarketApplyorderBatchqueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

