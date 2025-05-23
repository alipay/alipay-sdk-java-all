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
 * AlipayOpenMiniTipsStatisticQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniTipsStatisticQueryResponseModel {
  public static final String SERIALIZED_NAME_APP_COLLECT_CNT = "app_collect_cnt";
  @SerializedName(SERIALIZED_NAME_APP_COLLECT_CNT)
  private Integer appCollectCnt;

  public static final String SERIALIZED_NAME_APP_UV = "app_uv";
  @SerializedName(SERIALIZED_NAME_APP_UV)
  private Integer appUv;

  public static final String SERIALIZED_NAME_DELIVERY_CONTENT = "delivery_content";
  @SerializedName(SERIALIZED_NAME_DELIVERY_CONTENT)
  private String deliveryContent;

  public static final String SERIALIZED_NAME_DELIVERY_ID = "delivery_id";
  @SerializedName(SERIALIZED_NAME_DELIVERY_ID)
  private String deliveryId;

  public static final String SERIALIZED_NAME_TIPS_COLLECT_RATE = "tips_collect_rate";
  @SerializedName(SERIALIZED_NAME_TIPS_COLLECT_RATE)
  private String tipsCollectRate;

  public static final String SERIALIZED_NAME_TIPS_COLLECT_UV = "tips_collect_uv";
  @SerializedName(SERIALIZED_NAME_TIPS_COLLECT_UV)
  private Integer tipsCollectUv;

  public static final String SERIALIZED_NAME_TIPS_EXPO_UV = "tips_expo_uv";
  @SerializedName(SERIALIZED_NAME_TIPS_EXPO_UV)
  private Integer tipsExpoUv;

  public static final String SERIALIZED_NAME_TOTAL_APP_COLLECT_CNT = "total_app_collect_cnt";
  @SerializedName(SERIALIZED_NAME_TOTAL_APP_COLLECT_CNT)
  private Integer totalAppCollectCnt;

  public static final String SERIALIZED_NAME_TOTAL_APP_UV = "total_app_uv";
  @SerializedName(SERIALIZED_NAME_TOTAL_APP_UV)
  private Integer totalAppUv;

  public static final String SERIALIZED_NAME_TOTAL_TIPS_COLLECT_RATE = "total_tips_collect_rate";
  @SerializedName(SERIALIZED_NAME_TOTAL_TIPS_COLLECT_RATE)
  private String totalTipsCollectRate;

  public static final String SERIALIZED_NAME_TOTAL_TIPS_COLLECT_UV = "total_tips_collect_uv";
  @SerializedName(SERIALIZED_NAME_TOTAL_TIPS_COLLECT_UV)
  private Integer totalTipsCollectUv;

  public static final String SERIALIZED_NAME_TOTAL_TIPS_EXPO_UV = "total_tips_expo_uv";
  @SerializedName(SERIALIZED_NAME_TOTAL_TIPS_EXPO_UV)
  private Integer totalTipsExpoUv;

  public AlipayOpenMiniTipsStatisticQueryResponseModel() { 
  }

  public AlipayOpenMiniTipsStatisticQueryResponseModel appCollectCnt(Integer appCollectCnt) {
    
    this.appCollectCnt = appCollectCnt;
    return this;
  }

   /**
   * 昨日（接口调用当日的前一天）小程序收藏人数，时间内未创建投放活动，则响应时不传出参数。单位：个。
   * @return appCollectCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4798780", value = "昨日（接口调用当日的前一天）小程序收藏人数，时间内未创建投放活动，则响应时不传出参数。单位：个。")

  public Integer getAppCollectCnt() {
    return appCollectCnt;
  }


  public void setAppCollectCnt(Integer appCollectCnt) {
    this.appCollectCnt = appCollectCnt;
  }


  public AlipayOpenMiniTipsStatisticQueryResponseModel appUv(Integer appUv) {
    
    this.appUv = appUv;
    return this;
  }

   /**
   * 昨日（接口调用当日的前一天）小程序访问人数。当小程序日访问量为0，或以活动维度查询，或时间内未创建投放活动，则响应时不传出参数。单位：个。
   * @return appUv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3080000", value = "昨日（接口调用当日的前一天）小程序访问人数。当小程序日访问量为0，或以活动维度查询，或时间内未创建投放活动，则响应时不传出参数。单位：个。")

  public Integer getAppUv() {
    return appUv;
  }


  public void setAppUv(Integer appUv) {
    this.appUv = appUv;
  }


  public AlipayOpenMiniTipsStatisticQueryResponseModel deliveryContent(String deliveryContent) {
    
    this.deliveryContent = deliveryContent;
    return this;
  }

   /**
   * 收藏文案内容（仅以app维度查询时为空）,仅活动维度查询成功时返回。
   * @return deliveryContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "点击收藏，下次使用更方便", value = "收藏文案内容（仅以app维度查询时为空）,仅活动维度查询成功时返回。")

  public String getDeliveryContent() {
    return deliveryContent;
  }


  public void setDeliveryContent(String deliveryContent) {
    this.deliveryContent = deliveryContent;
  }


  public AlipayOpenMiniTipsStatisticQueryResponseModel deliveryId(String deliveryId) {
    
    this.deliveryId = deliveryId;
    return this;
  }

   /**
   * 收藏引导投放活动ID（仅以app维度查询时为空）,仅活动维度查询成功时返回。
   * @return deliveryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018092061468502", value = "收藏引导投放活动ID（仅以app维度查询时为空）,仅活动维度查询成功时返回。")

  public String getDeliveryId() {
    return deliveryId;
  }


  public void setDeliveryId(String deliveryId) {
    this.deliveryId = deliveryId;
  }


  public AlipayOpenMiniTipsStatisticQueryResponseModel tipsCollectRate(String tipsCollectRate) {
    
    this.tipsCollectRate = tipsCollectRate;
    return this;
  }

   /**
   * 昨日（接口调用当日的前一天）收藏引导文案收藏转化率，数据为小数字符串类型，取小数点后两位，单位为百分比。小程序曝光数为0，或时间内未创建投放活动，则响应时不传出参数。
   * @return tipsCollectRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "33.33", value = "昨日（接口调用当日的前一天）收藏引导文案收藏转化率，数据为小数字符串类型，取小数点后两位，单位为百分比。小程序曝光数为0，或时间内未创建投放活动，则响应时不传出参数。")

  public String getTipsCollectRate() {
    return tipsCollectRate;
  }


  public void setTipsCollectRate(String tipsCollectRate) {
    this.tipsCollectRate = tipsCollectRate;
  }


  public AlipayOpenMiniTipsStatisticQueryResponseModel tipsCollectUv(Integer tipsCollectUv) {
    
    this.tipsCollectUv = tipsCollectUv;
    return this;
  }

   /**
   * 昨日（接口调用当日的前一天）收藏引导文案收藏用户数，时间内未创建投放活动，则响应时不传出参数。单位：个。
   * @return tipsCollectUv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "440000", value = "昨日（接口调用当日的前一天）收藏引导文案收藏用户数，时间内未创建投放活动，则响应时不传出参数。单位：个。")

  public Integer getTipsCollectUv() {
    return tipsCollectUv;
  }


  public void setTipsCollectUv(Integer tipsCollectUv) {
    this.tipsCollectUv = tipsCollectUv;
  }


  public AlipayOpenMiniTipsStatisticQueryResponseModel tipsExpoUv(Integer tipsExpoUv) {
    
    this.tipsExpoUv = tipsExpoUv;
    return this;
  }

   /**
   * 昨日（接口调用当日的前一天）收藏引导文案曝光用户数，时间内未创建投放活动，则响应时不传出参数。单位：个。
   * @return tipsExpoUv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "434000", value = "昨日（接口调用当日的前一天）收藏引导文案曝光用户数，时间内未创建投放活动，则响应时不传出参数。单位：个。")

  public Integer getTipsExpoUv() {
    return tipsExpoUv;
  }


  public void setTipsExpoUv(Integer tipsExpoUv) {
    this.tipsExpoUv = tipsExpoUv;
  }


  public AlipayOpenMiniTipsStatisticQueryResponseModel totalAppCollectCnt(Integer totalAppCollectCnt) {
    
    this.totalAppCollectCnt = totalAppCollectCnt;
    return this;
  }

   /**
   * 时间段内累计小程序收藏人数，时间内未创建投放活动，则响应时不传出参数。单位：个。
   * @return totalAppCollectCnt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7800000", value = "时间段内累计小程序收藏人数，时间内未创建投放活动，则响应时不传出参数。单位：个。")

  public Integer getTotalAppCollectCnt() {
    return totalAppCollectCnt;
  }


  public void setTotalAppCollectCnt(Integer totalAppCollectCnt) {
    this.totalAppCollectCnt = totalAppCollectCnt;
  }


  public AlipayOpenMiniTipsStatisticQueryResponseModel totalAppUv(Integer totalAppUv) {
    
    this.totalAppUv = totalAppUv;
    return this;
  }

   /**
   * 时间段内累计小程序访问人数。当小程序日访问量为0，或以活动维度查询，或时间内未创建投放活动，则响应时不传出参数。单位：个。
   * @return totalAppUv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "79980000", value = "时间段内累计小程序访问人数。当小程序日访问量为0，或以活动维度查询，或时间内未创建投放活动，则响应时不传出参数。单位：个。")

  public Integer getTotalAppUv() {
    return totalAppUv;
  }


  public void setTotalAppUv(Integer totalAppUv) {
    this.totalAppUv = totalAppUv;
  }


  public AlipayOpenMiniTipsStatisticQueryResponseModel totalTipsCollectRate(String totalTipsCollectRate) {
    
    this.totalTipsCollectRate = totalTipsCollectRate;
    return this;
  }

   /**
   * 时间段内收藏引导文案收藏转化率，数据为小数字符串类型，取小数点后两位，单位为百分比。小程序曝光数为0，或时间内未创建投放活动，则响应时不传出参数。
   * @return totalTipsCollectRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "33.33", value = "时间段内收藏引导文案收藏转化率，数据为小数字符串类型，取小数点后两位，单位为百分比。小程序曝光数为0，或时间内未创建投放活动，则响应时不传出参数。")

  public String getTotalTipsCollectRate() {
    return totalTipsCollectRate;
  }


  public void setTotalTipsCollectRate(String totalTipsCollectRate) {
    this.totalTipsCollectRate = totalTipsCollectRate;
  }


  public AlipayOpenMiniTipsStatisticQueryResponseModel totalTipsCollectUv(Integer totalTipsCollectUv) {
    
    this.totalTipsCollectUv = totalTipsCollectUv;
    return this;
  }

   /**
   * 时间段内累计收藏引导文案收藏用户数，时间内未创建投放活动，则响应时不传出参数。单位：个。
   * @return totalTipsCollectUv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5030000", value = "时间段内累计收藏引导文案收藏用户数，时间内未创建投放活动，则响应时不传出参数。单位：个。")

  public Integer getTotalTipsCollectUv() {
    return totalTipsCollectUv;
  }


  public void setTotalTipsCollectUv(Integer totalTipsCollectUv) {
    this.totalTipsCollectUv = totalTipsCollectUv;
  }


  public AlipayOpenMiniTipsStatisticQueryResponseModel totalTipsExpoUv(Integer totalTipsExpoUv) {
    
    this.totalTipsExpoUv = totalTipsExpoUv;
    return this;
  }

   /**
   * 时间段内累计收藏引导文案曝光用户数，仅当小程序/活动投放活动时返回。时间内未创建投放活动，则响应时不传出参数。单位：个。
   * @return totalTipsExpoUv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2333900", value = "时间段内累计收藏引导文案曝光用户数，仅当小程序/活动投放活动时返回。时间内未创建投放活动，则响应时不传出参数。单位：个。")

  public Integer getTotalTipsExpoUv() {
    return totalTipsExpoUv;
  }


  public void setTotalTipsExpoUv(Integer totalTipsExpoUv) {
    this.totalTipsExpoUv = totalTipsExpoUv;
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
   * @return the AlipayOpenMiniTipsStatisticQueryResponseModel instance itself
   */
  public AlipayOpenMiniTipsStatisticQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenMiniTipsStatisticQueryResponseModel alipayOpenMiniTipsStatisticQueryResponseModel = (AlipayOpenMiniTipsStatisticQueryResponseModel) o;
    return Objects.equals(this.appCollectCnt, alipayOpenMiniTipsStatisticQueryResponseModel.appCollectCnt) &&
        Objects.equals(this.appUv, alipayOpenMiniTipsStatisticQueryResponseModel.appUv) &&
        Objects.equals(this.deliveryContent, alipayOpenMiniTipsStatisticQueryResponseModel.deliveryContent) &&
        Objects.equals(this.deliveryId, alipayOpenMiniTipsStatisticQueryResponseModel.deliveryId) &&
        Objects.equals(this.tipsCollectRate, alipayOpenMiniTipsStatisticQueryResponseModel.tipsCollectRate) &&
        Objects.equals(this.tipsCollectUv, alipayOpenMiniTipsStatisticQueryResponseModel.tipsCollectUv) &&
        Objects.equals(this.tipsExpoUv, alipayOpenMiniTipsStatisticQueryResponseModel.tipsExpoUv) &&
        Objects.equals(this.totalAppCollectCnt, alipayOpenMiniTipsStatisticQueryResponseModel.totalAppCollectCnt) &&
        Objects.equals(this.totalAppUv, alipayOpenMiniTipsStatisticQueryResponseModel.totalAppUv) &&
        Objects.equals(this.totalTipsCollectRate, alipayOpenMiniTipsStatisticQueryResponseModel.totalTipsCollectRate) &&
        Objects.equals(this.totalTipsCollectUv, alipayOpenMiniTipsStatisticQueryResponseModel.totalTipsCollectUv) &&
        Objects.equals(this.totalTipsExpoUv, alipayOpenMiniTipsStatisticQueryResponseModel.totalTipsExpoUv)&&
        Objects.equals(this.additionalProperties, alipayOpenMiniTipsStatisticQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appCollectCnt, appUv, deliveryContent, deliveryId, tipsCollectRate, tipsCollectUv, tipsExpoUv, totalAppCollectCnt, totalAppUv, totalTipsCollectRate, totalTipsCollectUv, totalTipsExpoUv, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniTipsStatisticQueryResponseModel {\n");
    sb.append("    appCollectCnt: ").append(toIndentedString(appCollectCnt)).append("\n");
    sb.append("    appUv: ").append(toIndentedString(appUv)).append("\n");
    sb.append("    deliveryContent: ").append(toIndentedString(deliveryContent)).append("\n");
    sb.append("    deliveryId: ").append(toIndentedString(deliveryId)).append("\n");
    sb.append("    tipsCollectRate: ").append(toIndentedString(tipsCollectRate)).append("\n");
    sb.append("    tipsCollectUv: ").append(toIndentedString(tipsCollectUv)).append("\n");
    sb.append("    tipsExpoUv: ").append(toIndentedString(tipsExpoUv)).append("\n");
    sb.append("    totalAppCollectCnt: ").append(toIndentedString(totalAppCollectCnt)).append("\n");
    sb.append("    totalAppUv: ").append(toIndentedString(totalAppUv)).append("\n");
    sb.append("    totalTipsCollectRate: ").append(toIndentedString(totalTipsCollectRate)).append("\n");
    sb.append("    totalTipsCollectUv: ").append(toIndentedString(totalTipsCollectUv)).append("\n");
    sb.append("    totalTipsExpoUv: ").append(toIndentedString(totalTipsExpoUv)).append("\n");
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
    openapiFields.add("app_collect_cnt");
    openapiFields.add("app_uv");
    openapiFields.add("delivery_content");
    openapiFields.add("delivery_id");
    openapiFields.add("tips_collect_rate");
    openapiFields.add("tips_collect_uv");
    openapiFields.add("tips_expo_uv");
    openapiFields.add("total_app_collect_cnt");
    openapiFields.add("total_app_uv");
    openapiFields.add("total_tips_collect_rate");
    openapiFields.add("total_tips_collect_uv");
    openapiFields.add("total_tips_expo_uv");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniTipsStatisticQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniTipsStatisticQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniTipsStatisticQueryResponseModel is not found in the empty JSON string", AlipayOpenMiniTipsStatisticQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("delivery_content") != null && !jsonObj.get("delivery_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_content").toString()));
      }
      if (jsonObj.get("delivery_id") != null && !jsonObj.get("delivery_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_id").toString()));
      }
      if (jsonObj.get("tips_collect_rate") != null && !jsonObj.get("tips_collect_rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tips_collect_rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tips_collect_rate").toString()));
      }
      if (jsonObj.get("total_tips_collect_rate") != null && !jsonObj.get("total_tips_collect_rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_tips_collect_rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_tips_collect_rate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniTipsStatisticQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniTipsStatisticQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniTipsStatisticQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniTipsStatisticQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniTipsStatisticQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniTipsStatisticQueryResponseModel value) throws IOException {
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
           public AlipayOpenMiniTipsStatisticQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenMiniTipsStatisticQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenMiniTipsStatisticQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniTipsStatisticQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniTipsStatisticQueryResponseModel
  */
  public static AlipayOpenMiniTipsStatisticQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniTipsStatisticQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniTipsStatisticQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

