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
import com.alipay.v3.model.VoucherConsultInfo;
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
 * AlipayMarketingCampaignOrderVoucherConsultResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingCampaignOrderVoucherConsultResponseModel {
  public static final String SERIALIZED_NAME_OPTIMAL_TOTAL_PROMO_AMOUNT = "optimal_total_promo_amount";
  @SerializedName(SERIALIZED_NAME_OPTIMAL_TOTAL_PROMO_AMOUNT)
  private String optimalTotalPromoAmount;

  public static final String SERIALIZED_NAME_VOUCHER_CONSULT_LIST = "voucher_consult_list";
  @SerializedName(SERIALIZED_NAME_VOUCHER_CONSULT_LIST)
  private List<VoucherConsultInfo> voucherConsultList = null;

  public AlipayMarketingCampaignOrderVoucherConsultResponseModel() { 
  }

  public AlipayMarketingCampaignOrderVoucherConsultResponseModel optimalTotalPromoAmount(String optimalTotalPromoAmount) {
    
    this.optimalTotalPromoAmount = optimalTotalPromoAmount;
    return this;
  }

   /**
   * 最优券叠加总优惠金额，单位为元
   * @return optimalTotalPromoAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15.50", value = "最优券叠加总优惠金额，单位为元")

  public String getOptimalTotalPromoAmount() {
    return optimalTotalPromoAmount;
  }


  public void setOptimalTotalPromoAmount(String optimalTotalPromoAmount) {
    this.optimalTotalPromoAmount = optimalTotalPromoAmount;
  }


  public AlipayMarketingCampaignOrderVoucherConsultResponseModel voucherConsultList(List<VoucherConsultInfo> voucherConsultList) {
    
    this.voucherConsultList = voucherConsultList;
    return this;
  }

  public AlipayMarketingCampaignOrderVoucherConsultResponseModel addVoucherConsultListItem(VoucherConsultInfo voucherConsultListItem) {
    if (this.voucherConsultList == null) {
      this.voucherConsultList = new ArrayList<>();
    }
    this.voucherConsultList.add(voucherConsultListItem);
    return this;
  }

   /**
   * 优惠券咨询结果列表
   * @return voucherConsultList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "优惠券咨询结果列表")

  public List<VoucherConsultInfo> getVoucherConsultList() {
    return voucherConsultList;
  }


  public void setVoucherConsultList(List<VoucherConsultInfo> voucherConsultList) {
    this.voucherConsultList = voucherConsultList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingCampaignOrderVoucherConsultResponseModel alipayMarketingCampaignOrderVoucherConsultResponseModel = (AlipayMarketingCampaignOrderVoucherConsultResponseModel) o;
    return Objects.equals(this.optimalTotalPromoAmount, alipayMarketingCampaignOrderVoucherConsultResponseModel.optimalTotalPromoAmount) &&
        Objects.equals(this.voucherConsultList, alipayMarketingCampaignOrderVoucherConsultResponseModel.voucherConsultList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optimalTotalPromoAmount, voucherConsultList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingCampaignOrderVoucherConsultResponseModel {\n");
    sb.append("    optimalTotalPromoAmount: ").append(toIndentedString(optimalTotalPromoAmount)).append("\n");
    sb.append("    voucherConsultList: ").append(toIndentedString(voucherConsultList)).append("\n");
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
    openapiFields.add("optimal_total_promo_amount");
    openapiFields.add("voucher_consult_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingCampaignOrderVoucherConsultResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingCampaignOrderVoucherConsultResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingCampaignOrderVoucherConsultResponseModel is not found in the empty JSON string", AlipayMarketingCampaignOrderVoucherConsultResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingCampaignOrderVoucherConsultResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingCampaignOrderVoucherConsultResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("optimal_total_promo_amount") != null && !jsonObj.get("optimal_total_promo_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `optimal_total_promo_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("optimal_total_promo_amount").toString()));
      }
      JsonArray jsonArrayvoucherConsultList = jsonObj.getAsJsonArray("voucher_consult_list");
      if (jsonArrayvoucherConsultList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("voucher_consult_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `voucher_consult_list` to be an array in the JSON string but got `%s`", jsonObj.get("voucher_consult_list").toString()));
        }

        // validate the optional field `voucher_consult_list` (array)
        for (int i = 0; i < jsonArrayvoucherConsultList.size(); i++) {
          VoucherConsultInfo.validateJsonObject(jsonArrayvoucherConsultList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingCampaignOrderVoucherConsultResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingCampaignOrderVoucherConsultResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingCampaignOrderVoucherConsultResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingCampaignOrderVoucherConsultResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingCampaignOrderVoucherConsultResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingCampaignOrderVoucherConsultResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingCampaignOrderVoucherConsultResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingCampaignOrderVoucherConsultResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingCampaignOrderVoucherConsultResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingCampaignOrderVoucherConsultResponseModel
  */
  public static AlipayMarketingCampaignOrderVoucherConsultResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingCampaignOrderVoucherConsultResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingCampaignOrderVoucherConsultResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

