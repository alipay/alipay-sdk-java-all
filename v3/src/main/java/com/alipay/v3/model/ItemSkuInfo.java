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
import com.alipay.v3.model.ItemExtInfo;
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
 * ItemSkuInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ItemSkuInfo {
  public static final String SERIALIZED_NAME_COST_PRICE = "cost_price";
  @SerializedName(SERIALIZED_NAME_COST_PRICE)
  private Integer costPrice;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private List<ItemExtInfo> extInfo = null;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_ORIGINAL_PRICE = "original_price";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_PRICE)
  private Integer originalPrice;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Integer price;

  public static final String SERIALIZED_NAME_SKU_ID = "sku_id";
  @SerializedName(SERIALIZED_NAME_SKU_ID)
  private String skuId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public ItemSkuInfo() { 
  }

  public ItemSkuInfo costPrice(Integer costPrice) {
    
    this.costPrice = costPrice;
    return this;
  }

   /**
   * 成本价，单位分
   * @return costPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "成本价，单位分")

  public Integer getCostPrice() {
    return costPrice;
  }


  public void setCostPrice(Integer costPrice) {
    this.costPrice = costPrice;
  }


  public ItemSkuInfo extInfo(List<ItemExtInfo> extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

  public ItemSkuInfo addExtInfoItem(ItemExtInfo extInfoItem) {
    if (this.extInfo == null) {
      this.extInfo = new ArrayList<>();
    }
    this.extInfo.add(extInfoItem);
    return this;
  }

   /**
   * SKU扩展信息
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SKU扩展信息")

  public List<ItemExtInfo> getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(List<ItemExtInfo> extInfo) {
    this.extInfo = extInfo;
  }


  public ItemSkuInfo gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 创建时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-09-26 11:12:54", value = "创建时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public ItemSkuInfo gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 更新时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-09-26 11:12:54", value = "更新时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public ItemSkuInfo itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 商品id
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018091300502200004400104166", value = "商品id")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public ItemSkuInfo originalPrice(Integer originalPrice) {
    
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * 标价，单位分
   * @return originalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "标价，单位分")

  public Integer getOriginalPrice() {
    return originalPrice;
  }


  public void setOriginalPrice(Integer originalPrice) {
    this.originalPrice = originalPrice;
  }


  public ItemSkuInfo price(Integer price) {
    
    this.price = price;
    return this;
  }

   /**
   * 售价，单位分
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "售价，单位分")

  public Integer getPrice() {
    return price;
  }


  public void setPrice(Integer price) {
    this.price = price;
  }


  public ItemSkuInfo skuId(String skuId) {
    
    this.skuId = skuId;
    return this;
  }

   /**
   * 商品sku id
   * @return skuId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018091300502200001600103072", value = "商品sku id")

  public String getSkuId() {
    return skuId;
  }


  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }


  public ItemSkuInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 商品SKU状态：EFFECT、INVALID
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EFFECT", value = "商品SKU状态：EFFECT、INVALID")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
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
   * @return the ItemSkuInfo instance itself
   */
  public ItemSkuInfo putAdditionalProperty(String key, Object value) {
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
    ItemSkuInfo itemSkuInfo = (ItemSkuInfo) o;
    return Objects.equals(this.costPrice, itemSkuInfo.costPrice) &&
        Objects.equals(this.extInfo, itemSkuInfo.extInfo) &&
        Objects.equals(this.gmtCreate, itemSkuInfo.gmtCreate) &&
        Objects.equals(this.gmtModified, itemSkuInfo.gmtModified) &&
        Objects.equals(this.itemId, itemSkuInfo.itemId) &&
        Objects.equals(this.originalPrice, itemSkuInfo.originalPrice) &&
        Objects.equals(this.price, itemSkuInfo.price) &&
        Objects.equals(this.skuId, itemSkuInfo.skuId) &&
        Objects.equals(this.status, itemSkuInfo.status)&&
        Objects.equals(this.additionalProperties, itemSkuInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costPrice, extInfo, gmtCreate, gmtModified, itemId, originalPrice, price, skuId, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemSkuInfo {\n");
    sb.append("    costPrice: ").append(toIndentedString(costPrice)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("cost_price");
    openapiFields.add("ext_info");
    openapiFields.add("gmt_create");
    openapiFields.add("gmt_modified");
    openapiFields.add("item_id");
    openapiFields.add("original_price");
    openapiFields.add("price");
    openapiFields.add("sku_id");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ItemSkuInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ItemSkuInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ItemSkuInfo is not found in the empty JSON string", ItemSkuInfo.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayextInfo = jsonObj.getAsJsonArray("ext_info");
      if (jsonArrayextInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ext_info").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be an array in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
        }

        // validate the optional field `ext_info` (array)
        for (int i = 0; i < jsonArrayextInfo.size(); i++) {
          ItemExtInfo.validateJsonObject(jsonArrayextInfo.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      if (jsonObj.get("item_id") != null && !jsonObj.get("item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_id").toString()));
      }
      if (jsonObj.get("sku_id") != null && !jsonObj.get("sku_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku_id").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ItemSkuInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ItemSkuInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ItemSkuInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ItemSkuInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ItemSkuInfo>() {
           @Override
           public void write(JsonWriter out, ItemSkuInfo value) throws IOException {
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
           public ItemSkuInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ItemSkuInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ItemSkuInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ItemSkuInfo
  * @throws IOException if the JSON string is invalid with respect to ItemSkuInfo
  */
  public static ItemSkuInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemSkuInfo.class);
  }

 /**
  * Convert an instance of ItemSkuInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

