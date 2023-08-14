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
 * InvoiceItemContent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InvoiceItemContent {
  public static final String SERIALIZED_NAME_ITEM_AMOUNT = "item_amount";
  @SerializedName(SERIALIZED_NAME_ITEM_AMOUNT)
  private String itemAmount;

  public static final String SERIALIZED_NAME_ITEM_NAME = "item_name";
  @SerializedName(SERIALIZED_NAME_ITEM_NAME)
  private String itemName;

  public static final String SERIALIZED_NAME_ITEM_NO = "item_no";
  @SerializedName(SERIALIZED_NAME_ITEM_NO)
  private String itemNo;

  public static final String SERIALIZED_NAME_ITEM_PRICE = "item_price";
  @SerializedName(SERIALIZED_NAME_ITEM_PRICE)
  private String itemPrice;

  public static final String SERIALIZED_NAME_ITEM_QUANTITY = "item_quantity";
  @SerializedName(SERIALIZED_NAME_ITEM_QUANTITY)
  private Integer itemQuantity;

  public static final String SERIALIZED_NAME_ITEM_SUM_PRICE = "item_sum_price";
  @SerializedName(SERIALIZED_NAME_ITEM_SUM_PRICE)
  private String itemSumPrice;

  public static final String SERIALIZED_NAME_ITEM_TAX_PRICE = "item_tax_price";
  @SerializedName(SERIALIZED_NAME_ITEM_TAX_PRICE)
  private String itemTaxPrice;

  public static final String SERIALIZED_NAME_ITEM_TAX_RATE = "item_tax_rate";
  @SerializedName(SERIALIZED_NAME_ITEM_TAX_RATE)
  private String itemTaxRate;

  public static final String SERIALIZED_NAME_ITEM_UNIT = "item_unit";
  @SerializedName(SERIALIZED_NAME_ITEM_UNIT)
  private String itemUnit;

  public static final String SERIALIZED_NAME_ROW_TYPE = "row_type";
  @SerializedName(SERIALIZED_NAME_ROW_TYPE)
  private Integer rowType;

  public InvoiceItemContent() { 
  }

  public InvoiceItemContent itemAmount(String itemAmount) {
    
    this.itemAmount = itemAmount;
    return this;
  }

   /**
   * 价税合计。(等于sumPrice和tax之和)
   * @return itemAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "价税合计。(等于sumPrice和tax之和)")

  public String getItemAmount() {
    return itemAmount;
  }


  public void setItemAmount(String itemAmount) {
    this.itemAmount = itemAmount;
  }


  public InvoiceItemContent itemName(String itemName) {
    
    this.itemName = itemName;
    return this;
  }

   /**
   * 发票项目名称（或商品名称）
   * @return itemName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票项目名称（或商品名称）")

  public String getItemName() {
    return itemName;
  }


  public void setItemName(String itemName) {
    this.itemName = itemName;
  }


  public InvoiceItemContent itemNo(String itemNo) {
    
    this.itemNo = itemNo;
    return this;
  }

   /**
   * 商品编号
   * @return itemNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品编号")

  public String getItemNo() {
    return itemNo;
  }


  public void setItemNo(String itemNo) {
    this.itemNo = itemNo;
  }


  public InvoiceItemContent itemPrice(String itemPrice) {
    
    this.itemPrice = itemPrice;
    return this;
  }

   /**
   * 单价，格式：100.00。新版电子发票，折扣行此参数不能传，非折扣行必传
   * @return itemPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单价，格式：100.00。新版电子发票，折扣行此参数不能传，非折扣行必传")

  public String getItemPrice() {
    return itemPrice;
  }


  public void setItemPrice(String itemPrice) {
    this.itemPrice = itemPrice;
  }


  public InvoiceItemContent itemQuantity(Integer itemQuantity) {
    
    this.itemQuantity = itemQuantity;
    return this;
  }

   /**
   * 数量。新版电子发票，折扣行此参数不能传，非折扣行必传
   * @return itemQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "数量。新版电子发票，折扣行此参数不能传，非折扣行必传")

  public Integer getItemQuantity() {
    return itemQuantity;
  }


  public void setItemQuantity(Integer itemQuantity) {
    this.itemQuantity = itemQuantity;
  }


  public InvoiceItemContent itemSumPrice(String itemSumPrice) {
    
    this.itemSumPrice = itemSumPrice;
    return this;
  }

   /**
   * 单项总价，格式：100.00
   * @return itemSumPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单项总价，格式：100.00")

  public String getItemSumPrice() {
    return itemSumPrice;
  }


  public void setItemSumPrice(String itemSumPrice) {
    this.itemSumPrice = itemSumPrice;
  }


  public InvoiceItemContent itemTaxPrice(String itemTaxPrice) {
    
    this.itemTaxPrice = itemTaxPrice;
    return this;
  }

   /**
   * 税额
   * @return itemTaxPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "税额")

  public String getItemTaxPrice() {
    return itemTaxPrice;
  }


  public void setItemTaxPrice(String itemTaxPrice) {
    this.itemTaxPrice = itemTaxPrice;
  }


  public InvoiceItemContent itemTaxRate(String itemTaxRate) {
    
    this.itemTaxRate = itemTaxRate;
    return this;
  }

   /**
   * 税率
   * @return itemTaxRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "税率")

  public String getItemTaxRate() {
    return itemTaxRate;
  }


  public void setItemTaxRate(String itemTaxRate) {
    this.itemTaxRate = itemTaxRate;
  }


  public InvoiceItemContent itemUnit(String itemUnit) {
    
    this.itemUnit = itemUnit;
    return this;
  }

   /**
   * 台
   * @return itemUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "台")

  public String getItemUnit() {
    return itemUnit;
  }


  public void setItemUnit(String itemUnit) {
    this.itemUnit = itemUnit;
  }


  public InvoiceItemContent rowType(Integer rowType) {
    
    this.rowType = rowType;
    return this;
  }

   /**
   * 发票行性质。0表示正常行，1表示折扣行，2表示被折扣行。比如充电器单价100元，折扣10元，则明细为2行，充电器行性质为2，折扣行性质为1。如果充电器没有折扣，则值应为0
   * @return rowType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票行性质。0表示正常行，1表示折扣行，2表示被折扣行。比如充电器单价100元，折扣10元，则明细为2行，充电器行性质为2，折扣行性质为1。如果充电器没有折扣，则值应为0")

  public Integer getRowType() {
    return rowType;
  }


  public void setRowType(Integer rowType) {
    this.rowType = rowType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceItemContent invoiceItemContent = (InvoiceItemContent) o;
    return Objects.equals(this.itemAmount, invoiceItemContent.itemAmount) &&
        Objects.equals(this.itemName, invoiceItemContent.itemName) &&
        Objects.equals(this.itemNo, invoiceItemContent.itemNo) &&
        Objects.equals(this.itemPrice, invoiceItemContent.itemPrice) &&
        Objects.equals(this.itemQuantity, invoiceItemContent.itemQuantity) &&
        Objects.equals(this.itemSumPrice, invoiceItemContent.itemSumPrice) &&
        Objects.equals(this.itemTaxPrice, invoiceItemContent.itemTaxPrice) &&
        Objects.equals(this.itemTaxRate, invoiceItemContent.itemTaxRate) &&
        Objects.equals(this.itemUnit, invoiceItemContent.itemUnit) &&
        Objects.equals(this.rowType, invoiceItemContent.rowType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemAmount, itemName, itemNo, itemPrice, itemQuantity, itemSumPrice, itemTaxPrice, itemTaxRate, itemUnit, rowType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceItemContent {\n");
    sb.append("    itemAmount: ").append(toIndentedString(itemAmount)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemNo: ").append(toIndentedString(itemNo)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
    sb.append("    itemQuantity: ").append(toIndentedString(itemQuantity)).append("\n");
    sb.append("    itemSumPrice: ").append(toIndentedString(itemSumPrice)).append("\n");
    sb.append("    itemTaxPrice: ").append(toIndentedString(itemTaxPrice)).append("\n");
    sb.append("    itemTaxRate: ").append(toIndentedString(itemTaxRate)).append("\n");
    sb.append("    itemUnit: ").append(toIndentedString(itemUnit)).append("\n");
    sb.append("    rowType: ").append(toIndentedString(rowType)).append("\n");
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
    openapiFields.add("item_amount");
    openapiFields.add("item_name");
    openapiFields.add("item_no");
    openapiFields.add("item_price");
    openapiFields.add("item_quantity");
    openapiFields.add("item_sum_price");
    openapiFields.add("item_tax_price");
    openapiFields.add("item_tax_rate");
    openapiFields.add("item_unit");
    openapiFields.add("row_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoiceItemContent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InvoiceItemContent.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceItemContent is not found in the empty JSON string", InvoiceItemContent.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InvoiceItemContent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceItemContent` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("item_amount") != null && !jsonObj.get("item_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_amount").toString()));
      }
      if (jsonObj.get("item_name") != null && !jsonObj.get("item_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_name").toString()));
      }
      if (jsonObj.get("item_no") != null && !jsonObj.get("item_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_no").toString()));
      }
      if (jsonObj.get("item_price") != null && !jsonObj.get("item_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_price").toString()));
      }
      if (jsonObj.get("item_sum_price") != null && !jsonObj.get("item_sum_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_sum_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_sum_price").toString()));
      }
      if (jsonObj.get("item_tax_price") != null && !jsonObj.get("item_tax_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_tax_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_tax_price").toString()));
      }
      if (jsonObj.get("item_tax_rate") != null && !jsonObj.get("item_tax_rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_tax_rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_tax_rate").toString()));
      }
      if (jsonObj.get("item_unit") != null && !jsonObj.get("item_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_unit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceItemContent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceItemContent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceItemContent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceItemContent.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceItemContent>() {
           @Override
           public void write(JsonWriter out, InvoiceItemContent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceItemContent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceItemContent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceItemContent
  * @throws IOException if the JSON string is invalid with respect to InvoiceItemContent
  */
  public static InvoiceItemContent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceItemContent.class);
  }

 /**
  * Convert an instance of InvoiceItemContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

