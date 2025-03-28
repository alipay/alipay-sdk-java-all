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
import com.alipay.v3.model.ShopQueryOpenApiVO;
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
 * AntMerchantExpandShopPageQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AntMerchantExpandShopPageQueryResponseModel {
  public static final String SERIALIZED_NAME_ALIPAY_POIID = "alipay_poiid";
  @SerializedName(SERIALIZED_NAME_ALIPAY_POIID)
  private String alipayPoiid;

  public static final String SERIALIZED_NAME_SHOP_INFOS = "shop_infos";
  @SerializedName(SERIALIZED_NAME_SHOP_INFOS)
  private List<ShopQueryOpenApiVO> shopInfos = null;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "total_pages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;

  public AntMerchantExpandShopPageQueryResponseModel() { 
  }

  public AntMerchantExpandShopPageQueryResponseModel alipayPoiid(String alipayPoiid) {
    
    this.alipayPoiid = alipayPoiid;
    return this;
  }

   /**
   * 门店地址库 ID，按照一定的平台规则识别出的线下真实存在、真实经营的蚂蚁门店地址库 ID，将作用于服务商的返佣激励、商品/券等权益的公域分发。如平台未返回alipay_poiid，请在确认门店信息真实有效后，稍后再进行查询
   * @return alipayPoiid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022082900502055000000100000", value = "门店地址库 ID，按照一定的平台规则识别出的线下真实存在、真实经营的蚂蚁门店地址库 ID，将作用于服务商的返佣激励、商品/券等权益的公域分发。如平台未返回alipay_poiid，请在确认门店信息真实有效后，稍后再进行查询")

  public String getAlipayPoiid() {
    return alipayPoiid;
  }


  public void setAlipayPoiid(String alipayPoiid) {
    this.alipayPoiid = alipayPoiid;
  }


  public AntMerchantExpandShopPageQueryResponseModel shopInfos(List<ShopQueryOpenApiVO> shopInfos) {
    
    this.shopInfos = shopInfos;
    return this;
  }

  public AntMerchantExpandShopPageQueryResponseModel addShopInfosItem(ShopQueryOpenApiVO shopInfosItem) {
    if (this.shopInfos == null) {
      this.shopInfos = new ArrayList<>();
    }
    this.shopInfos.add(shopInfosItem);
    return this;
  }

   /**
   * 门店详情
   * @return shopInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "门店详情")

  public List<ShopQueryOpenApiVO> getShopInfos() {
    return shopInfos;
  }


  public void setShopInfos(List<ShopQueryOpenApiVO> shopInfos) {
    this.shopInfos = shopInfos;
  }


  public AntMerchantExpandShopPageQueryResponseModel totalPages(Integer totalPages) {
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * 总页数
   * @return totalPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "总页数")

  public Integer getTotalPages() {
    return totalPages;
  }


  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
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
   * @return the AntMerchantExpandShopPageQueryResponseModel instance itself
   */
  public AntMerchantExpandShopPageQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AntMerchantExpandShopPageQueryResponseModel antMerchantExpandShopPageQueryResponseModel = (AntMerchantExpandShopPageQueryResponseModel) o;
    return Objects.equals(this.alipayPoiid, antMerchantExpandShopPageQueryResponseModel.alipayPoiid) &&
        Objects.equals(this.shopInfos, antMerchantExpandShopPageQueryResponseModel.shopInfos) &&
        Objects.equals(this.totalPages, antMerchantExpandShopPageQueryResponseModel.totalPages)&&
        Objects.equals(this.additionalProperties, antMerchantExpandShopPageQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alipayPoiid, shopInfos, totalPages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntMerchantExpandShopPageQueryResponseModel {\n");
    sb.append("    alipayPoiid: ").append(toIndentedString(alipayPoiid)).append("\n");
    sb.append("    shopInfos: ").append(toIndentedString(shopInfos)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
    openapiFields.add("alipay_poiid");
    openapiFields.add("shop_infos");
    openapiFields.add("total_pages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AntMerchantExpandShopPageQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AntMerchantExpandShopPageQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AntMerchantExpandShopPageQueryResponseModel is not found in the empty JSON string", AntMerchantExpandShopPageQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("alipay_poiid") != null && !jsonObj.get("alipay_poiid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_poiid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_poiid").toString()));
      }
      JsonArray jsonArrayshopInfos = jsonObj.getAsJsonArray("shop_infos");
      if (jsonArrayshopInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("shop_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `shop_infos` to be an array in the JSON string but got `%s`", jsonObj.get("shop_infos").toString()));
        }

        // validate the optional field `shop_infos` (array)
        for (int i = 0; i < jsonArrayshopInfos.size(); i++) {
          ShopQueryOpenApiVO.validateJsonObject(jsonArrayshopInfos.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AntMerchantExpandShopPageQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AntMerchantExpandShopPageQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AntMerchantExpandShopPageQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AntMerchantExpandShopPageQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AntMerchantExpandShopPageQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AntMerchantExpandShopPageQueryResponseModel value) throws IOException {
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
           public AntMerchantExpandShopPageQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AntMerchantExpandShopPageQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AntMerchantExpandShopPageQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AntMerchantExpandShopPageQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AntMerchantExpandShopPageQueryResponseModel
  */
  public static AntMerchantExpandShopPageQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AntMerchantExpandShopPageQueryResponseModel.class);
  }

 /**
  * Convert an instance of AntMerchantExpandShopPageQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

