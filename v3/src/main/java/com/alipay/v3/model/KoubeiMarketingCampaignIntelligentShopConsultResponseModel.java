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
import com.alipay.v3.model.IntelligentPromoShopSummaryInfo;
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
 * KoubeiMarketingCampaignIntelligentShopConsultResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KoubeiMarketingCampaignIntelligentShopConsultResponseModel {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private String items;

  public static final String SERIALIZED_NAME_SHOPS = "shops";
  @SerializedName(SERIALIZED_NAME_SHOPS)
  private List<IntelligentPromoShopSummaryInfo> shops = null;

  public KoubeiMarketingCampaignIntelligentShopConsultResponseModel() { 
  }

  public KoubeiMarketingCampaignIntelligentShopConsultResponseModel items(String items) {
    
    this.items = items;
    return this;
  }

   /**
   * 总共项数
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "总共项数")

  public String getItems() {
    return items;
  }


  public void setItems(String items) {
    this.items = items;
  }


  public KoubeiMarketingCampaignIntelligentShopConsultResponseModel shops(List<IntelligentPromoShopSummaryInfo> shops) {
    
    this.shops = shops;
    return this;
  }

  public KoubeiMarketingCampaignIntelligentShopConsultResponseModel addShopsItem(IntelligentPromoShopSummaryInfo shopsItem) {
    if (this.shops == null) {
      this.shops = new ArrayList<>();
    }
    this.shops.add(shopsItem);
    return this;
  }

   /**
   * 智能营销方案符合标准的门店列表
   * @return shops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "智能营销方案符合标准的门店列表")

  public List<IntelligentPromoShopSummaryInfo> getShops() {
    return shops;
  }


  public void setShops(List<IntelligentPromoShopSummaryInfo> shops) {
    this.shops = shops;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KoubeiMarketingCampaignIntelligentShopConsultResponseModel koubeiMarketingCampaignIntelligentShopConsultResponseModel = (KoubeiMarketingCampaignIntelligentShopConsultResponseModel) o;
    return Objects.equals(this.items, koubeiMarketingCampaignIntelligentShopConsultResponseModel.items) &&
        Objects.equals(this.shops, koubeiMarketingCampaignIntelligentShopConsultResponseModel.shops);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, shops);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KoubeiMarketingCampaignIntelligentShopConsultResponseModel {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    shops: ").append(toIndentedString(shops)).append("\n");
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
    openapiFields.add("items");
    openapiFields.add("shops");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KoubeiMarketingCampaignIntelligentShopConsultResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (KoubeiMarketingCampaignIntelligentShopConsultResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in KoubeiMarketingCampaignIntelligentShopConsultResponseModel is not found in the empty JSON string", KoubeiMarketingCampaignIntelligentShopConsultResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KoubeiMarketingCampaignIntelligentShopConsultResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KoubeiMarketingCampaignIntelligentShopConsultResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be a primitive type in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }
      JsonArray jsonArrayshops = jsonObj.getAsJsonArray("shops");
      if (jsonArrayshops != null) {
        // ensure the json data is an array
        if (!jsonObj.get("shops").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `shops` to be an array in the JSON string but got `%s`", jsonObj.get("shops").toString()));
        }

        // validate the optional field `shops` (array)
        for (int i = 0; i < jsonArrayshops.size(); i++) {
          IntelligentPromoShopSummaryInfo.validateJsonObject(jsonArrayshops.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KoubeiMarketingCampaignIntelligentShopConsultResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KoubeiMarketingCampaignIntelligentShopConsultResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KoubeiMarketingCampaignIntelligentShopConsultResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KoubeiMarketingCampaignIntelligentShopConsultResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<KoubeiMarketingCampaignIntelligentShopConsultResponseModel>() {
           @Override
           public void write(JsonWriter out, KoubeiMarketingCampaignIntelligentShopConsultResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KoubeiMarketingCampaignIntelligentShopConsultResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KoubeiMarketingCampaignIntelligentShopConsultResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KoubeiMarketingCampaignIntelligentShopConsultResponseModel
  * @throws IOException if the JSON string is invalid with respect to KoubeiMarketingCampaignIntelligentShopConsultResponseModel
  */
  public static KoubeiMarketingCampaignIntelligentShopConsultResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KoubeiMarketingCampaignIntelligentShopConsultResponseModel.class);
  }

 /**
  * Convert an instance of KoubeiMarketingCampaignIntelligentShopConsultResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

