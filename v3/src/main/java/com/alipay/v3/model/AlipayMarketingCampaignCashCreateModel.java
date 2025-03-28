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
 * AlipayMarketingCampaignCashCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingCampaignCashCreateModel {
  public static final String SERIALIZED_NAME_COUPON_NAME = "coupon_name";
  @SerializedName(SERIALIZED_NAME_COUPON_NAME)
  private String couponName;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_MERCHANT_LINK = "merchant_link";
  @SerializedName(SERIALIZED_NAME_MERCHANT_LINK)
  private String merchantLink;

  public static final String SERIALIZED_NAME_PRIZE_MSG = "prize_msg";
  @SerializedName(SERIALIZED_NAME_PRIZE_MSG)
  private String prizeMsg;

  public static final String SERIALIZED_NAME_PRIZE_TYPE = "prize_type";
  @SerializedName(SERIALIZED_NAME_PRIZE_TYPE)
  private String prizeType;

  public static final String SERIALIZED_NAME_SEND_FREQENCY = "send_freqency";
  @SerializedName(SERIALIZED_NAME_SEND_FREQENCY)
  private String sendFreqency;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_TOTAL_MONEY = "total_money";
  @SerializedName(SERIALIZED_NAME_TOTAL_MONEY)
  private String totalMoney;

  public static final String SERIALIZED_NAME_TOTAL_NUM = "total_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM)
  private String totalNum;

  public AlipayMarketingCampaignCashCreateModel() { 
  }

  public AlipayMarketingCampaignCashCreateModel couponName(String couponName) {
    
    this.couponName = couponName;
    return this;
  }

   /**
   * 红包名称,商户在查询列表、详情看到的名字,同时也会显示在商户付款页面。
   * @return couponName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XXX周年庆红包", value = "红包名称,商户在查询列表、详情看到的名字,同时也会显示在商户付款页面。")

  public String getCouponName() {
    return couponName;
  }


  public void setCouponName(String couponName) {
    this.couponName = couponName;
  }


  public AlipayMarketingCampaignCashCreateModel endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 活动结束时间,必须大于活动开始时间, 基本格式:yyyy-MM-dd HH:mm:ss,活动有效时间最长为6个月，过期后需要创建新的活动。
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-09-20 22:48:30", value = "活动结束时间,必须大于活动开始时间, 基本格式:yyyy-MM-dd HH:mm:ss,活动有效时间最长为6个月，过期后需要创建新的活动。")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public AlipayMarketingCampaignCashCreateModel merchantLink(String merchantLink) {
    
    this.merchantLink = merchantLink;
    return this;
  }

   /**
   * 商户打款后的跳转链接，从支付宝收银台打款成功后的跳转链接。不填时，打款后停留在支付宝支付成功页。商户实际跳转会自动添加crowdNo作为跳转参数。示例: http://www.yourhomepage.com?crowdNo&#x3D;XXX
   * @return merchantLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://www.weibo.com", value = "商户打款后的跳转链接，从支付宝收银台打款成功后的跳转链接。不填时，打款后停留在支付宝支付成功页。商户实际跳转会自动添加crowdNo作为跳转参数。示例: http://www.yourhomepage.com?crowdNo=XXX")

  public String getMerchantLink() {
    return merchantLink;
  }


  public void setMerchantLink(String merchantLink) {
    this.merchantLink = merchantLink;
  }


  public AlipayMarketingCampaignCashCreateModel prizeMsg(String prizeMsg) {
    
    this.prizeMsg = prizeMsg;
    return this;
  }

   /**
   * 活动文案，用户在账单、红包中看到的账单描述、红包描述。
   * @return prizeMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XXX送您大红包", value = "活动文案，用户在账单、红包中看到的账单描述、红包描述。")

  public String getPrizeMsg() {
    return prizeMsg;
  }


  public void setPrizeMsg(String prizeMsg) {
    this.prizeMsg = prizeMsg;
  }


  public AlipayMarketingCampaignCashCreateModel prizeType(String prizeType) {
    
    this.prizeType = prizeType;
    return this;
  }

   /**
   * 现金红包的发放形式,。枚举支持： *fixed：固定金额。 *random：随机金额。选择随机金额时，单个红包的金额在平均金额的0.5~1.5倍之间浮动。 
   * @return prizeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "random", value = "现金红包的发放形式,。枚举支持： *fixed：固定金额。 *random：随机金额。选择随机金额时，单个红包的金额在平均金额的0.5~1.5倍之间浮动。 ")

  public String getPrizeType() {
    return prizeType;
  }


  public void setPrizeType(String prizeType) {
    this.prizeType = prizeType;
  }


  public AlipayMarketingCampaignCashCreateModel sendFreqency(String sendFreqency) {
    
    this.sendFreqency = sendFreqency;
    return this;
  }

   /**
   * 用户在当前活动参与次数、频率限制。支持日(D)、周(W)、月(M)、终身(L)维度的限制，整个字段不填时默认值为L1（即用户终生仅能参与1次）。 注意：  1. 终身(L)限制必选且最大值为 100。  2. 日(D)、周(W)、月(M)限制可选且最多只能选择一个（即限制日领取次数就不能再限制月领取次数），频率设置必须小于等于终身(L)的次数。  3. 多个配置之间使用\&quot;|\&quot;进行分隔。如 D3|L4（表示限制用户终生只能参与4次，单日只能参与3次）。  4. 允许多次领取时，活动触发接口需要传入out_biz_no来配合。
   * @return sendFreqency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "D3|L10", value = "用户在当前活动参与次数、频率限制。支持日(D)、周(W)、月(M)、终身(L)维度的限制，整个字段不填时默认值为L1（即用户终生仅能参与1次）。 注意：  1. 终身(L)限制必选且最大值为 100。  2. 日(D)、周(W)、月(M)限制可选且最多只能选择一个（即限制日领取次数就不能再限制月领取次数），频率设置必须小于等于终身(L)的次数。  3. 多个配置之间使用\"|\"进行分隔。如 D3|L4（表示限制用户终生只能参与4次，单日只能参与3次）。  4. 允许多次领取时，活动触发接口需要传入out_biz_no来配合。")

  public String getSendFreqency() {
    return sendFreqency;
  }


  public void setSendFreqency(String sendFreqency) {
    this.sendFreqency = sendFreqency;
  }


  public AlipayMarketingCampaignCashCreateModel startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 活动开始时间，必须大于活动创建的时间。入参支持如下两种形式：  1. 填入固定时间，时间格式为 yyyy-MM-dd HH:mm:ss，如 2020-12-10 22:28:30  2. 填字符串 NowTime，表示创建即生效。
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NowTime", value = "活动开始时间，必须大于活动创建的时间。入参支持如下两种形式：  1. 填入固定时间，时间格式为 yyyy-MM-dd HH:mm:ss，如 2020-12-10 22:28:30  2. 填字符串 NowTime，表示创建即生效。")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public AlipayMarketingCampaignCashCreateModel totalMoney(String totalMoney) {
    
    this.totalMoney = totalMoney;
    return this;
  }

   /**
   * 活动发放的现金总金额,最小金额1.00元,最大金额10000000.00元。每个红包的最大金额不允许超过200元,最小金额不得低于0.20元。 实际的金额限制可能会根据业务进行动态调整。
   * @return totalMoney
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000000.00", value = "活动发放的现金总金额,最小金额1.00元,最大金额10000000.00元。每个红包的最大金额不允许超过200元,最小金额不得低于0.20元。 实际的金额限制可能会根据业务进行动态调整。")

  public String getTotalMoney() {
    return totalMoney;
  }


  public void setTotalMoney(String totalMoney) {
    this.totalMoney = totalMoney;
  }


  public AlipayMarketingCampaignCashCreateModel totalNum(String totalNum) {
    
    this.totalNum = totalNum;
    return this;
  }

   /**
   * 红包发放个数，最小为 1 个，最大10000000个。 说明：不同的发放形式（即prize_type）会使得发放个数含义不同：  1. 若prize_type 为 fixed（固定金额），则每个用户领取的红包金额为total_money除以total_num得到固定金额。  2. 若prize_type为 random（随机金额），则每个用户领取的红包金额为total_money除以total_num得到的平均金额值的0.5~1.5倍。由于金额是随机的，在红包金额全部被领取完时，有可能total_num有所剩余、或者大于设置值的情况。
   * @return totalNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "红包发放个数，最小为 1 个，最大10000000个。 说明：不同的发放形式（即prize_type）会使得发放个数含义不同：  1. 若prize_type 为 fixed（固定金额），则每个用户领取的红包金额为total_money除以total_num得到固定金额。  2. 若prize_type为 random（随机金额），则每个用户领取的红包金额为total_money除以total_num得到的平均金额值的0.5~1.5倍。由于金额是随机的，在红包金额全部被领取完时，有可能total_num有所剩余、或者大于设置值的情况。")

  public String getTotalNum() {
    return totalNum;
  }


  public void setTotalNum(String totalNum) {
    this.totalNum = totalNum;
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
   * @return the AlipayMarketingCampaignCashCreateModel instance itself
   */
  public AlipayMarketingCampaignCashCreateModel putAdditionalProperty(String key, Object value) {
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
    AlipayMarketingCampaignCashCreateModel alipayMarketingCampaignCashCreateModel = (AlipayMarketingCampaignCashCreateModel) o;
    return Objects.equals(this.couponName, alipayMarketingCampaignCashCreateModel.couponName) &&
        Objects.equals(this.endTime, alipayMarketingCampaignCashCreateModel.endTime) &&
        Objects.equals(this.merchantLink, alipayMarketingCampaignCashCreateModel.merchantLink) &&
        Objects.equals(this.prizeMsg, alipayMarketingCampaignCashCreateModel.prizeMsg) &&
        Objects.equals(this.prizeType, alipayMarketingCampaignCashCreateModel.prizeType) &&
        Objects.equals(this.sendFreqency, alipayMarketingCampaignCashCreateModel.sendFreqency) &&
        Objects.equals(this.startTime, alipayMarketingCampaignCashCreateModel.startTime) &&
        Objects.equals(this.totalMoney, alipayMarketingCampaignCashCreateModel.totalMoney) &&
        Objects.equals(this.totalNum, alipayMarketingCampaignCashCreateModel.totalNum)&&
        Objects.equals(this.additionalProperties, alipayMarketingCampaignCashCreateModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(couponName, endTime, merchantLink, prizeMsg, prizeType, sendFreqency, startTime, totalMoney, totalNum, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingCampaignCashCreateModel {\n");
    sb.append("    couponName: ").append(toIndentedString(couponName)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    merchantLink: ").append(toIndentedString(merchantLink)).append("\n");
    sb.append("    prizeMsg: ").append(toIndentedString(prizeMsg)).append("\n");
    sb.append("    prizeType: ").append(toIndentedString(prizeType)).append("\n");
    sb.append("    sendFreqency: ").append(toIndentedString(sendFreqency)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    totalMoney: ").append(toIndentedString(totalMoney)).append("\n");
    sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
    openapiFields.add("coupon_name");
    openapiFields.add("end_time");
    openapiFields.add("merchant_link");
    openapiFields.add("prize_msg");
    openapiFields.add("prize_type");
    openapiFields.add("send_freqency");
    openapiFields.add("start_time");
    openapiFields.add("total_money");
    openapiFields.add("total_num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingCampaignCashCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingCampaignCashCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingCampaignCashCreateModel is not found in the empty JSON string", AlipayMarketingCampaignCashCreateModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("coupon_name") != null && !jsonObj.get("coupon_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coupon_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coupon_name").toString()));
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (jsonObj.get("merchant_link") != null && !jsonObj.get("merchant_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_link").toString()));
      }
      if (jsonObj.get("prize_msg") != null && !jsonObj.get("prize_msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prize_msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prize_msg").toString()));
      }
      if (jsonObj.get("prize_type") != null && !jsonObj.get("prize_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prize_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prize_type").toString()));
      }
      if (jsonObj.get("send_freqency") != null && !jsonObj.get("send_freqency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `send_freqency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("send_freqency").toString()));
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if (jsonObj.get("total_money") != null && !jsonObj.get("total_money").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_money` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_money").toString()));
      }
      if (jsonObj.get("total_num") != null && !jsonObj.get("total_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_num").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingCampaignCashCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingCampaignCashCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingCampaignCashCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingCampaignCashCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingCampaignCashCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingCampaignCashCreateModel value) throws IOException {
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
           public AlipayMarketingCampaignCashCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMarketingCampaignCashCreateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMarketingCampaignCashCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingCampaignCashCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingCampaignCashCreateModel
  */
  public static AlipayMarketingCampaignCashCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingCampaignCashCreateModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingCampaignCashCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

