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
import com.alipay.v3.model.DeliveryAvailableScope;
import com.alipay.v3.model.DeliveryCityCodeRule;
import com.alipay.v3.model.DeliveryMerchantInfo;
import com.alipay.v3.model.DeliveryMerchantRule;
import com.alipay.v3.model.DeliverySearchBoxRule;
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
 * DeliveryTargetRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeliveryTargetRule {
  public static final String SERIALIZED_NAME_BRAND_ID_LIST = "brand_id_list";
  @SerializedName(SERIALIZED_NAME_BRAND_ID_LIST)
  private List<String> brandIdList = null;

  public static final String SERIALIZED_NAME_DELIVERY_AVAILABLE_SCOPE = "delivery_available_scope";
  @SerializedName(SERIALIZED_NAME_DELIVERY_AVAILABLE_SCOPE)
  private DeliveryAvailableScope deliveryAvailableScope;

  public static final String SERIALIZED_NAME_DELIVERY_CITY_CODE_RULE = "delivery_city_code_rule";
  @SerializedName(SERIALIZED_NAME_DELIVERY_CITY_CODE_RULE)
  private DeliveryCityCodeRule deliveryCityCodeRule;

  public static final String SERIALIZED_NAME_DELIVERY_MERCHANT_INFOS = "delivery_merchant_infos";
  @SerializedName(SERIALIZED_NAME_DELIVERY_MERCHANT_INFOS)
  private List<DeliveryMerchantInfo> deliveryMerchantInfos = null;

  public static final String SERIALIZED_NAME_DELIVERY_MERCHANT_MODE = "delivery_merchant_mode";
  @SerializedName(SERIALIZED_NAME_DELIVERY_MERCHANT_MODE)
  private String deliveryMerchantMode;

  public static final String SERIALIZED_NAME_DELIVERY_MERCHANT_RULE = "delivery_merchant_rule";
  @SerializedName(SERIALIZED_NAME_DELIVERY_MERCHANT_RULE)
  private DeliveryMerchantRule deliveryMerchantRule;

  public static final String SERIALIZED_NAME_DELIVERY_PROMO_TAGS = "delivery_promo_tags";
  @SerializedName(SERIALIZED_NAME_DELIVERY_PROMO_TAGS)
  private String deliveryPromoTags;

  public static final String SERIALIZED_NAME_DELIVERY_RECALL_MODE = "delivery_recall_mode";
  @SerializedName(SERIALIZED_NAME_DELIVERY_RECALL_MODE)
  private String deliveryRecallMode;

  public static final String SERIALIZED_NAME_DELIVERY_SEARCH_BOX_RULE = "delivery_search_box_rule";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SEARCH_BOX_RULE)
  private DeliverySearchBoxRule deliverySearchBoxRule;

  public static final String SERIALIZED_NAME_DELIVERY_TYPE = "delivery_type";
  @SerializedName(SERIALIZED_NAME_DELIVERY_TYPE)
  private String deliveryType;

  public DeliveryTargetRule() { 
  }

  public DeliveryTargetRule brandIdList(List<String> brandIdList) {
    
    this.brandIdList = brandIdList;
    return this;
  }

  public DeliveryTargetRule addBrandIdListItem(String brandIdListItem) {
    if (this.brandIdList == null) {
      this.brandIdList = new ArrayList<>();
    }
    this.brandIdList.add(brandIdListItem);
    return this;
  }

   /**
   * 指定品牌id。 说明：如商户需选择某个品牌下维护的收款账号，请上传相关品牌id
   * @return brandIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指定品牌id。 说明：如商户需选择某个品牌下维护的收款账号，请上传相关品牌id")

  public List<String> getBrandIdList() {
    return brandIdList;
  }


  public void setBrandIdList(List<String> brandIdList) {
    this.brandIdList = brandIdList;
  }


  public DeliveryTargetRule deliveryAvailableScope(DeliveryAvailableScope deliveryAvailableScope) {
    
    this.deliveryAvailableScope = deliveryAvailableScope;
    return this;
  }

   /**
   * Get deliveryAvailableScope
   * @return deliveryAvailableScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryAvailableScope getDeliveryAvailableScope() {
    return deliveryAvailableScope;
  }


  public void setDeliveryAvailableScope(DeliveryAvailableScope deliveryAvailableScope) {
    this.deliveryAvailableScope = deliveryAvailableScope;
  }


  public DeliveryTargetRule deliveryCityCodeRule(DeliveryCityCodeRule deliveryCityCodeRule) {
    
    this.deliveryCityCodeRule = deliveryCityCodeRule;
    return this;
  }

   /**
   * Get deliveryCityCodeRule
   * @return deliveryCityCodeRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryCityCodeRule getDeliveryCityCodeRule() {
    return deliveryCityCodeRule;
  }


  public void setDeliveryCityCodeRule(DeliveryCityCodeRule deliveryCityCodeRule) {
    this.deliveryCityCodeRule = deliveryCityCodeRule;
  }


  public DeliveryTargetRule deliveryMerchantInfos(List<DeliveryMerchantInfo> deliveryMerchantInfos) {
    
    this.deliveryMerchantInfos = deliveryMerchantInfos;
    return this;
  }

  public DeliveryTargetRule addDeliveryMerchantInfosItem(DeliveryMerchantInfo deliveryMerchantInfosItem) {
    if (this.deliveryMerchantInfos == null) {
      this.deliveryMerchantInfos = new ArrayList<>();
    }
    this.deliveryMerchantInfos.add(deliveryMerchantInfosItem);
    return this;
  }

   /**
   * 曝光商户选取列表。 说明：需要传入您期望曝光的商户的商户号，传入为空时默认使用投放优惠券活动的适用范围。 限制：曝光商户号需与投放归属商户号相同，或传入有跨主体授权关系的商户号或有弱绑定关系的M3账号
   * @return deliveryMerchantInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "曝光商户选取列表。 说明：需要传入您期望曝光的商户的商户号，传入为空时默认使用投放优惠券活动的适用范围。 限制：曝光商户号需与投放归属商户号相同，或传入有跨主体授权关系的商户号或有弱绑定关系的M3账号")

  public List<DeliveryMerchantInfo> getDeliveryMerchantInfos() {
    return deliveryMerchantInfos;
  }


  public void setDeliveryMerchantInfos(List<DeliveryMerchantInfo> deliveryMerchantInfos) {
    this.deliveryMerchantInfos = deliveryMerchantInfos;
  }


  public DeliveryTargetRule deliveryMerchantMode(String deliveryMerchantMode) {
    
    this.deliveryMerchantMode = deliveryMerchantMode;
    return this;
  }

   /**
   * 指定支付成功页模式。
   * @return deliveryMerchantMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指定支付成功页模式。")

  public String getDeliveryMerchantMode() {
    return deliveryMerchantMode;
  }


  public void setDeliveryMerchantMode(String deliveryMerchantMode) {
    this.deliveryMerchantMode = deliveryMerchantMode;
  }


  public DeliveryTargetRule deliveryMerchantRule(DeliveryMerchantRule deliveryMerchantRule) {
    
    this.deliveryMerchantRule = deliveryMerchantRule;
    return this;
  }

   /**
   * Get deliveryMerchantRule
   * @return deliveryMerchantRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryMerchantRule getDeliveryMerchantRule() {
    return deliveryMerchantRule;
  }


  public void setDeliveryMerchantRule(DeliveryMerchantRule deliveryMerchantRule) {
    this.deliveryMerchantRule = deliveryMerchantRule;
  }


  public DeliveryTargetRule deliveryPromoTags(String deliveryPromoTags) {
    
    this.deliveryPromoTags = deliveryPromoTags;
    return this;
  }

   /**
   * 推荐定向曝光订单优惠标记。 1. 创建交易订单时，上传符合的订单优惠标。在业务参数信息“business_params”的子字段“delivery_promo_tags”填充订单优惠标。“统一收单交易支付接口”详情查看：https://opendocs.alipay.com/open/02ekfp?scene&#x3D;32。 2. 订单优惠标，检验规则： * 单个优惠标最大长度32字节。多个标记值以英文逗号分隔。 * 单个优惠标仅支持字母/数字/下划线。 3. 订单优惠标规则和其他推荐规则同时叠加。
   * @return deliveryPromoTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "推荐定向曝光订单优惠标记。 1. 创建交易订单时，上传符合的订单优惠标。在业务参数信息“business_params”的子字段“delivery_promo_tags”填充订单优惠标。“统一收单交易支付接口”详情查看：https://opendocs.alipay.com/open/02ekfp?scene=32。 2. 订单优惠标，检验规则： * 单个优惠标最大长度32字节。多个标记值以英文逗号分隔。 * 单个优惠标仅支持字母/数字/下划线。 3. 订单优惠标规则和其他推荐规则同时叠加。")

  public String getDeliveryPromoTags() {
    return deliveryPromoTags;
  }


  public void setDeliveryPromoTags(String deliveryPromoTags) {
    this.deliveryPromoTags = deliveryPromoTags;
  }


  public DeliveryTargetRule deliveryRecallMode(String deliveryRecallMode) {
    
    this.deliveryRecallMode = deliveryRecallMode;
    return this;
  }

   /**
   * 投放召回模式，现在支持CITY_RECALL（城市召回)和SHOP_RECALL（门店召回)两种模式。
   * @return deliveryRecallMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "投放召回模式，现在支持CITY_RECALL（城市召回)和SHOP_RECALL（门店召回)两种模式。")

  public String getDeliveryRecallMode() {
    return deliveryRecallMode;
  }


  public void setDeliveryRecallMode(String deliveryRecallMode) {
    this.deliveryRecallMode = deliveryRecallMode;
  }


  public DeliveryTargetRule deliverySearchBoxRule(DeliverySearchBoxRule deliverySearchBoxRule) {
    
    this.deliverySearchBoxRule = deliverySearchBoxRule;
    return this;
  }

   /**
   * Get deliverySearchBoxRule
   * @return deliverySearchBoxRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliverySearchBoxRule getDeliverySearchBoxRule() {
    return deliverySearchBoxRule;
  }


  public void setDeliverySearchBoxRule(DeliverySearchBoxRule deliverySearchBoxRule) {
    this.deliverySearchBoxRule = deliverySearchBoxRule;
  }


  public DeliveryTargetRule deliveryType(String deliveryType) {
    
    this.deliveryType = deliveryType;
    return this;
  }

   /**
   * 小程序推广可用。
   * @return deliveryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "小程序推广可用。")

  public String getDeliveryType() {
    return deliveryType;
  }


  public void setDeliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryTargetRule deliveryTargetRule = (DeliveryTargetRule) o;
    return Objects.equals(this.brandIdList, deliveryTargetRule.brandIdList) &&
        Objects.equals(this.deliveryAvailableScope, deliveryTargetRule.deliveryAvailableScope) &&
        Objects.equals(this.deliveryCityCodeRule, deliveryTargetRule.deliveryCityCodeRule) &&
        Objects.equals(this.deliveryMerchantInfos, deliveryTargetRule.deliveryMerchantInfos) &&
        Objects.equals(this.deliveryMerchantMode, deliveryTargetRule.deliveryMerchantMode) &&
        Objects.equals(this.deliveryMerchantRule, deliveryTargetRule.deliveryMerchantRule) &&
        Objects.equals(this.deliveryPromoTags, deliveryTargetRule.deliveryPromoTags) &&
        Objects.equals(this.deliveryRecallMode, deliveryTargetRule.deliveryRecallMode) &&
        Objects.equals(this.deliverySearchBoxRule, deliveryTargetRule.deliverySearchBoxRule) &&
        Objects.equals(this.deliveryType, deliveryTargetRule.deliveryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandIdList, deliveryAvailableScope, deliveryCityCodeRule, deliveryMerchantInfos, deliveryMerchantMode, deliveryMerchantRule, deliveryPromoTags, deliveryRecallMode, deliverySearchBoxRule, deliveryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryTargetRule {\n");
    sb.append("    brandIdList: ").append(toIndentedString(brandIdList)).append("\n");
    sb.append("    deliveryAvailableScope: ").append(toIndentedString(deliveryAvailableScope)).append("\n");
    sb.append("    deliveryCityCodeRule: ").append(toIndentedString(deliveryCityCodeRule)).append("\n");
    sb.append("    deliveryMerchantInfos: ").append(toIndentedString(deliveryMerchantInfos)).append("\n");
    sb.append("    deliveryMerchantMode: ").append(toIndentedString(deliveryMerchantMode)).append("\n");
    sb.append("    deliveryMerchantRule: ").append(toIndentedString(deliveryMerchantRule)).append("\n");
    sb.append("    deliveryPromoTags: ").append(toIndentedString(deliveryPromoTags)).append("\n");
    sb.append("    deliveryRecallMode: ").append(toIndentedString(deliveryRecallMode)).append("\n");
    sb.append("    deliverySearchBoxRule: ").append(toIndentedString(deliverySearchBoxRule)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
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
    openapiFields.add("brand_id_list");
    openapiFields.add("delivery_available_scope");
    openapiFields.add("delivery_city_code_rule");
    openapiFields.add("delivery_merchant_infos");
    openapiFields.add("delivery_merchant_mode");
    openapiFields.add("delivery_merchant_rule");
    openapiFields.add("delivery_promo_tags");
    openapiFields.add("delivery_recall_mode");
    openapiFields.add("delivery_search_box_rule");
    openapiFields.add("delivery_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeliveryTargetRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeliveryTargetRule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliveryTargetRule is not found in the empty JSON string", DeliveryTargetRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeliveryTargetRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeliveryTargetRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("brand_id_list") != null && !jsonObj.get("brand_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("brand_id_list").toString()));
      }
      // validate the optional field `delivery_available_scope`
      if (jsonObj.getAsJsonObject("delivery_available_scope") != null) {
        DeliveryAvailableScope.validateJsonObject(jsonObj.getAsJsonObject("delivery_available_scope"));
      }
      // validate the optional field `delivery_city_code_rule`
      if (jsonObj.getAsJsonObject("delivery_city_code_rule") != null) {
        DeliveryCityCodeRule.validateJsonObject(jsonObj.getAsJsonObject("delivery_city_code_rule"));
      }
      JsonArray jsonArraydeliveryMerchantInfos = jsonObj.getAsJsonArray("delivery_merchant_infos");
      if (jsonArraydeliveryMerchantInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("delivery_merchant_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `delivery_merchant_infos` to be an array in the JSON string but got `%s`", jsonObj.get("delivery_merchant_infos").toString()));
        }

        // validate the optional field `delivery_merchant_infos` (array)
        for (int i = 0; i < jsonArraydeliveryMerchantInfos.size(); i++) {
          DeliveryMerchantInfo.validateJsonObject(jsonArraydeliveryMerchantInfos.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("delivery_merchant_mode") != null && !jsonObj.get("delivery_merchant_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_merchant_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_merchant_mode").toString()));
      }
      // validate the optional field `delivery_merchant_rule`
      if (jsonObj.getAsJsonObject("delivery_merchant_rule") != null) {
        DeliveryMerchantRule.validateJsonObject(jsonObj.getAsJsonObject("delivery_merchant_rule"));
      }
      if (jsonObj.get("delivery_promo_tags") != null && !jsonObj.get("delivery_promo_tags").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_promo_tags` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_promo_tags").toString()));
      }
      if (jsonObj.get("delivery_recall_mode") != null && !jsonObj.get("delivery_recall_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_recall_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_recall_mode").toString()));
      }
      // validate the optional field `delivery_search_box_rule`
      if (jsonObj.getAsJsonObject("delivery_search_box_rule") != null) {
        DeliverySearchBoxRule.validateJsonObject(jsonObj.getAsJsonObject("delivery_search_box_rule"));
      }
      if (jsonObj.get("delivery_type") != null && !jsonObj.get("delivery_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliveryTargetRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryTargetRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryTargetRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryTargetRule.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryTargetRule>() {
           @Override
           public void write(JsonWriter out, DeliveryTargetRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliveryTargetRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeliveryTargetRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryTargetRule
  * @throws IOException if the JSON string is invalid with respect to DeliveryTargetRule
  */
  public static DeliveryTargetRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryTargetRule.class);
  }

 /**
  * Convert an instance of DeliveryTargetRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

