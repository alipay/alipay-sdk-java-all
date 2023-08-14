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
 * InvoiceItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InvoiceItem {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_ITEM_NAME = "item_name";
  @SerializedName(SERIALIZED_NAME_ITEM_NAME)
  private String itemName;

  public static final String SERIALIZED_NAME_ITEM_NO = "item_no";
  @SerializedName(SERIALIZED_NAME_ITEM_NO)
  private String itemNo;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private String quantity;

  public static final String SERIALIZED_NAME_ROW_TYPE = "row_type";
  @SerializedName(SERIALIZED_NAME_ROW_TYPE)
  private Integer rowType;

  public static final String SERIALIZED_NAME_SPECIFICATION = "specification";
  @SerializedName(SERIALIZED_NAME_SPECIFICATION)
  private String specification;

  public static final String SERIALIZED_NAME_SUM_PRICE = "sum_price";
  @SerializedName(SERIALIZED_NAME_SUM_PRICE)
  private String sumPrice;

  public static final String SERIALIZED_NAME_TAX = "tax";
  @SerializedName(SERIALIZED_NAME_TAX)
  private String tax;

  public static final String SERIALIZED_NAME_TAX_RATE = "tax_rate";
  @SerializedName(SERIALIZED_NAME_TAX_RATE)
  private String taxRate;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public static final String SERIALIZED_NAME_ZERO_RATE_FLAG = "zero_rate_flag";
  @SerializedName(SERIALIZED_NAME_ZERO_RATE_FLAG)
  private String zeroRateFlag;

  public InvoiceItem() { 
  }

  public InvoiceItem amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 含税总金额 (等于sum_price和tax之和)， 单位：元，格式为2位小数，精度2位小数
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1170.00", value = "含税总金额 (等于sum_price和tax之和)， 单位：元，格式为2位小数，精度2位小数")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public InvoiceItem itemName(String itemName) {
    
    this.itemName = itemName;
    return this;
  }

   /**
   * 发票项目名称（或商品名称）
   * @return itemName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "电视机", value = "发票项目名称（或商品名称）")

  public String getItemName() {
    return itemName;
  }


  public void setItemName(String itemName) {
    this.itemName = itemName;
  }


  public InvoiceItem itemNo(String itemNo) {
    
    this.itemNo = itemNo;
    return this;
  }

   /**
   * 发票项目编号（或商品编号）
   * @return itemNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1010101010000000000", value = "发票项目编号（或商品编号）")

  public String getItemNo() {
    return itemNo;
  }


  public void setItemNo(String itemNo) {
    this.itemNo = itemNo;
  }


  public InvoiceItem price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * 单价（不含税），格式为2位小数。最大支持6位小数，不足2位小数时需转化为2位小数格式。 折扣行此参数不能传
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.00", value = "单价（不含税），格式为2位小数。最大支持6位小数，不足2位小数时需转化为2位小数格式。 折扣行此参数不能传")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    this.price = price;
  }


  public InvoiceItem quantity(String quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * 数量，须大于0，最多6位小数。 折扣行此参数不能传
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "数量，须大于0，最多6位小数。 折扣行此参数不能传")

  public String getQuantity() {
    return quantity;
  }


  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }


  public InvoiceItem rowType(Integer rowType) {
    
    this.rowType = rowType;
    return this;
  }

   /**
   * 发票行性质。0表示正常行，1表示折扣行，2表示被折扣行。 比如充电器单价100元，折扣10元，则明细为2行，充电器行性质为2，折扣行性质为1。如果充电器没有折扣，则值应为0。
   * @return rowType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "发票行性质。0表示正常行，1表示折扣行，2表示被折扣行。 比如充电器单价100元，折扣10元，则明细为2行，充电器行性质为2，折扣行性质为1。如果充电器没有折扣，则值应为0。")

  public Integer getRowType() {
    return rowType;
  }


  public void setRowType(Integer rowType) {
    this.rowType = rowType;
  }


  public InvoiceItem specification(String specification) {
    
    this.specification = specification;
    return this;
  }

   /**
   * 规格型号
   * @return specification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "X100", value = "规格型号")

  public String getSpecification() {
    return specification;
  }


  public void setSpecification(String specification) {
    this.specification = specification;
  }


  public InvoiceItem sumPrice(String sumPrice) {
    
    this.sumPrice = sumPrice;
    return this;
  }

   /**
   * 不含税总金额，格式为2位小数 单位：元，精度2位小数
   * @return sumPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000.00", value = "不含税总金额，格式为2位小数 单位：元，精度2位小数")

  public String getSumPrice() {
    return sumPrice;
  }


  public void setSumPrice(String sumPrice) {
    this.sumPrice = sumPrice;
  }


  public InvoiceItem tax(String tax) {
    
    this.tax = tax;
    return this;
  }

   /**
   * 税额， 格式为2位小数
   * @return tax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "170.00", value = "税额， 格式为2位小数")

  public String getTax() {
    return tax;
  }


  public void setTax(String tax) {
    this.tax = tax;
  }


  public InvoiceItem taxRate(String taxRate) {
    
    this.taxRate = taxRate;
    return this;
  }

   /**
   * 税率。格式为2位小数，如：0.00, 0.03, 0.13等等
   * @return taxRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.17", value = "税率。格式为2位小数，如：0.00, 0.03, 0.13等等")

  public String getTaxRate() {
    return taxRate;
  }


  public void setTaxRate(String taxRate) {
    this.taxRate = taxRate;
  }


  public InvoiceItem unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * 单位，折扣行不能传
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "台", value = "单位，折扣行不能传")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  public InvoiceItem zeroRateFlag(String zeroRateFlag) {
    
    this.zeroRateFlag = zeroRateFlag;
    return this;
  }

   /**
   * 0税率标识，只有税率为0的情况才有值，0&#x3D;出口零税率，1&#x3D;免税，2&#x3D;不征收，3&#x3D;普通零税率
   * @return zeroRateFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "0税率标识，只有税率为0的情况才有值，0=出口零税率，1=免税，2=不征收，3=普通零税率")

  public String getZeroRateFlag() {
    return zeroRateFlag;
  }


  public void setZeroRateFlag(String zeroRateFlag) {
    this.zeroRateFlag = zeroRateFlag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceItem invoiceItem = (InvoiceItem) o;
    return Objects.equals(this.amount, invoiceItem.amount) &&
        Objects.equals(this.itemName, invoiceItem.itemName) &&
        Objects.equals(this.itemNo, invoiceItem.itemNo) &&
        Objects.equals(this.price, invoiceItem.price) &&
        Objects.equals(this.quantity, invoiceItem.quantity) &&
        Objects.equals(this.rowType, invoiceItem.rowType) &&
        Objects.equals(this.specification, invoiceItem.specification) &&
        Objects.equals(this.sumPrice, invoiceItem.sumPrice) &&
        Objects.equals(this.tax, invoiceItem.tax) &&
        Objects.equals(this.taxRate, invoiceItem.taxRate) &&
        Objects.equals(this.unit, invoiceItem.unit) &&
        Objects.equals(this.zeroRateFlag, invoiceItem.zeroRateFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, itemName, itemNo, price, quantity, rowType, specification, sumPrice, tax, taxRate, unit, zeroRateFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceItem {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemNo: ").append(toIndentedString(itemNo)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    rowType: ").append(toIndentedString(rowType)).append("\n");
    sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
    sb.append("    sumPrice: ").append(toIndentedString(sumPrice)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    zeroRateFlag: ").append(toIndentedString(zeroRateFlag)).append("\n");
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
    openapiFields.add("item_name");
    openapiFields.add("item_no");
    openapiFields.add("price");
    openapiFields.add("quantity");
    openapiFields.add("row_type");
    openapiFields.add("specification");
    openapiFields.add("sum_price");
    openapiFields.add("tax");
    openapiFields.add("tax_rate");
    openapiFields.add("unit");
    openapiFields.add("zero_rate_flag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoiceItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InvoiceItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceItem is not found in the empty JSON string", InvoiceItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InvoiceItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("item_name") != null && !jsonObj.get("item_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_name").toString()));
      }
      if (jsonObj.get("item_no") != null && !jsonObj.get("item_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_no").toString()));
      }
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price").toString()));
      }
      if (jsonObj.get("quantity") != null && !jsonObj.get("quantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quantity").toString()));
      }
      if (jsonObj.get("specification") != null && !jsonObj.get("specification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specification").toString()));
      }
      if (jsonObj.get("sum_price") != null && !jsonObj.get("sum_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sum_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sum_price").toString()));
      }
      if (jsonObj.get("tax") != null && !jsonObj.get("tax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax").toString()));
      }
      if (jsonObj.get("tax_rate") != null && !jsonObj.get("tax_rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_rate").toString()));
      }
      if (jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
      if (jsonObj.get("zero_rate_flag") != null && !jsonObj.get("zero_rate_flag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zero_rate_flag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zero_rate_flag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceItem.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceItem>() {
           @Override
           public void write(JsonWriter out, InvoiceItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceItem
  * @throws IOException if the JSON string is invalid with respect to InvoiceItem
  */
  public static InvoiceItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceItem.class);
  }

 /**
  * Convert an instance of InvoiceItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

