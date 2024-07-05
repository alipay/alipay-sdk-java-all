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
 * ZolozAuthenticationCustomerFacemanageDeleteModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZolozAuthenticationCustomerFacemanageDeleteModel {
  public static final String SERIALIZED_NAME_AREACODE = "areacode";
  @SerializedName(SERIALIZED_NAME_AREACODE)
  private String areacode;

  public static final String SERIALIZED_NAME_BIZ_TYPE = "biz_type";
  @SerializedName(SERIALIZED_NAME_BIZ_TYPE)
  private String bizType;

  public static final String SERIALIZED_NAME_BIZSCALE = "bizscale";
  @SerializedName(SERIALIZED_NAME_BIZSCALE)
  private String bizscale;

  public static final String SERIALIZED_NAME_BRANDCODE = "brandcode";
  @SerializedName(SERIALIZED_NAME_BRANDCODE)
  private String brandcode;

  public static final String SERIALIZED_NAME_DEVICENUM = "devicenum";
  @SerializedName(SERIALIZED_NAME_DEVICENUM)
  private String devicenum;

  public static final String SERIALIZED_NAME_EXTINFO = "extinfo";
  @SerializedName(SERIALIZED_NAME_EXTINFO)
  private String extinfo;

  public static final String SERIALIZED_NAME_FACETYPE = "facetype";
  @SerializedName(SERIALIZED_NAME_FACETYPE)
  private String facetype;

  public static final String SERIALIZED_NAME_FACEVAL = "faceval";
  @SerializedName(SERIALIZED_NAME_FACEVAL)
  private String faceval;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_STORECODE = "storecode";
  @SerializedName(SERIALIZED_NAME_STORECODE)
  private String storecode;

  public static final String SERIALIZED_NAME_VALIDTIMES = "validtimes";
  @SerializedName(SERIALIZED_NAME_VALIDTIMES)
  private String validtimes;

  public ZolozAuthenticationCustomerFacemanageDeleteModel() { 
  }

  public ZolozAuthenticationCustomerFacemanageDeleteModel areacode(String areacode) {
    
    this.areacode = areacode;
    return this;
  }

   /**
   * 地域编码
   * @return areacode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "010", value = "地域编码")

  public String getAreacode() {
    return areacode;
  }


  public void setAreacode(String areacode) {
    this.areacode = areacode;
  }


  public ZolozAuthenticationCustomerFacemanageDeleteModel bizType(String bizType) {
    
    this.bizType = bizType;
    return this;
  }

   /**
   * 人脸产品能力
   * @return bizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "人脸产品能力")

  public String getBizType() {
    return bizType;
  }


  public void setBizType(String bizType) {
    this.bizType = bizType;
  }


  public ZolozAuthenticationCustomerFacemanageDeleteModel bizscale(String bizscale) {
    
    this.bizscale = bizscale;
    return this;
  }

   /**
   * 业务量
   * @return bizscale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9999999999", value = "业务量")

  public String getBizscale() {
    return bizscale;
  }


  public void setBizscale(String bizscale) {
    this.bizscale = bizscale;
  }


  public ZolozAuthenticationCustomerFacemanageDeleteModel brandcode(String brandcode) {
    
    this.brandcode = brandcode;
    return this;
  }

   /**
   * 商户品牌
   * @return brandcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "KFC", value = "商户品牌")

  public String getBrandcode() {
    return brandcode;
  }


  public void setBrandcode(String brandcode) {
    this.brandcode = brandcode;
  }


  public ZolozAuthenticationCustomerFacemanageDeleteModel devicenum(String devicenum) {
    
    this.devicenum = devicenum;
    return this;
  }

   /**
   * 商户机具唯一编码，关键参数
   * @return devicenum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "商户机具唯一编码", value = "商户机具唯一编码，关键参数")

  public String getDevicenum() {
    return devicenum;
  }


  public void setDevicenum(String devicenum) {
    this.devicenum = devicenum;
  }


  public ZolozAuthenticationCustomerFacemanageDeleteModel extinfo(String extinfo) {
    
    this.extinfo = extinfo;
    return this;
  }

   /**
   * 拓展参数
   * @return extinfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "拓展参数")

  public String getExtinfo() {
    return extinfo;
  }


  public void setExtinfo(String extinfo) {
    this.extinfo = extinfo;
  }


  public ZolozAuthenticationCustomerFacemanageDeleteModel facetype(String facetype) {
    
    this.facetype = facetype;
    return this;
  }

   /**
   * 入库类型 IDCARD:身份证 ALIPAY_USER:支付宝用户id, ALIPAY_TEL:手机号入库 CUSTOMER:自定义
   * @return facetype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IDCARD,ALIPAY_USER, ALIPAY_TEL,CUSTOMER", value = "入库类型 IDCARD:身份证 ALIPAY_USER:支付宝用户id, ALIPAY_TEL:手机号入库 CUSTOMER:自定义")

  public String getFacetype() {
    return facetype;
  }


  public void setFacetype(String facetype) {
    this.facetype = facetype;
  }


  public ZolozAuthenticationCustomerFacemanageDeleteModel faceval(String faceval) {
    
    this.faceval = faceval;
    return this;
  }

   /**
   * 入库用户信息
   * @return faceval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "类型为IDCARD数据格式：[{\"certName\": \"张三\",\"certNo\":\"3101101999xxxxxxxx\",\"certType\":\"IDCARD\"}]类型ALIPAY_USER数据格式:[{\"alipayUid\":\"20885022\"}]", value = "入库用户信息")

  public String getFaceval() {
    return faceval;
  }


  public void setFaceval(String faceval) {
    this.faceval = faceval;
  }


  public ZolozAuthenticationCustomerFacemanageDeleteModel group(String group) {
    
    this.group = group;
    return this;
  }

   /**
   * 分组
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "group0", value = "分组")

  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public ZolozAuthenticationCustomerFacemanageDeleteModel storecode(String storecode) {
    
    this.storecode = storecode;
    return this;
  }

   /**
   * 门店编码
   * @return storecode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HZ1000435", value = "门店编码")

  public String getStorecode() {
    return storecode;
  }


  public void setStorecode(String storecode) {
    this.storecode = storecode;
  }


  public ZolozAuthenticationCustomerFacemanageDeleteModel validtimes(String validtimes) {
    
    this.validtimes = validtimes;
    return this;
  }

   /**
   * 有效期天数，如7天、30天、365天
   * @return validtimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "有效期天数，如7天、30天、365天")

  public String getValidtimes() {
    return validtimes;
  }


  public void setValidtimes(String validtimes) {
    this.validtimes = validtimes;
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
   * @return the ZolozAuthenticationCustomerFacemanageDeleteModel instance itself
   */
  public ZolozAuthenticationCustomerFacemanageDeleteModel putAdditionalProperty(String key, Object value) {
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
    ZolozAuthenticationCustomerFacemanageDeleteModel zolozAuthenticationCustomerFacemanageDeleteModel = (ZolozAuthenticationCustomerFacemanageDeleteModel) o;
    return Objects.equals(this.areacode, zolozAuthenticationCustomerFacemanageDeleteModel.areacode) &&
        Objects.equals(this.bizType, zolozAuthenticationCustomerFacemanageDeleteModel.bizType) &&
        Objects.equals(this.bizscale, zolozAuthenticationCustomerFacemanageDeleteModel.bizscale) &&
        Objects.equals(this.brandcode, zolozAuthenticationCustomerFacemanageDeleteModel.brandcode) &&
        Objects.equals(this.devicenum, zolozAuthenticationCustomerFacemanageDeleteModel.devicenum) &&
        Objects.equals(this.extinfo, zolozAuthenticationCustomerFacemanageDeleteModel.extinfo) &&
        Objects.equals(this.facetype, zolozAuthenticationCustomerFacemanageDeleteModel.facetype) &&
        Objects.equals(this.faceval, zolozAuthenticationCustomerFacemanageDeleteModel.faceval) &&
        Objects.equals(this.group, zolozAuthenticationCustomerFacemanageDeleteModel.group) &&
        Objects.equals(this.storecode, zolozAuthenticationCustomerFacemanageDeleteModel.storecode) &&
        Objects.equals(this.validtimes, zolozAuthenticationCustomerFacemanageDeleteModel.validtimes)&&
        Objects.equals(this.additionalProperties, zolozAuthenticationCustomerFacemanageDeleteModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areacode, bizType, bizscale, brandcode, devicenum, extinfo, facetype, faceval, group, storecode, validtimes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZolozAuthenticationCustomerFacemanageDeleteModel {\n");
    sb.append("    areacode: ").append(toIndentedString(areacode)).append("\n");
    sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
    sb.append("    bizscale: ").append(toIndentedString(bizscale)).append("\n");
    sb.append("    brandcode: ").append(toIndentedString(brandcode)).append("\n");
    sb.append("    devicenum: ").append(toIndentedString(devicenum)).append("\n");
    sb.append("    extinfo: ").append(toIndentedString(extinfo)).append("\n");
    sb.append("    facetype: ").append(toIndentedString(facetype)).append("\n");
    sb.append("    faceval: ").append(toIndentedString(faceval)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    storecode: ").append(toIndentedString(storecode)).append("\n");
    sb.append("    validtimes: ").append(toIndentedString(validtimes)).append("\n");
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
    openapiFields.add("areacode");
    openapiFields.add("biz_type");
    openapiFields.add("bizscale");
    openapiFields.add("brandcode");
    openapiFields.add("devicenum");
    openapiFields.add("extinfo");
    openapiFields.add("facetype");
    openapiFields.add("faceval");
    openapiFields.add("group");
    openapiFields.add("storecode");
    openapiFields.add("validtimes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZolozAuthenticationCustomerFacemanageDeleteModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZolozAuthenticationCustomerFacemanageDeleteModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZolozAuthenticationCustomerFacemanageDeleteModel is not found in the empty JSON string", ZolozAuthenticationCustomerFacemanageDeleteModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("areacode") != null && !jsonObj.get("areacode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `areacode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("areacode").toString()));
      }
      if (jsonObj.get("biz_type") != null && !jsonObj.get("biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_type").toString()));
      }
      if (jsonObj.get("bizscale") != null && !jsonObj.get("bizscale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bizscale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bizscale").toString()));
      }
      if (jsonObj.get("brandcode") != null && !jsonObj.get("brandcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brandcode").toString()));
      }
      if (jsonObj.get("devicenum") != null && !jsonObj.get("devicenum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `devicenum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("devicenum").toString()));
      }
      if (jsonObj.get("extinfo") != null && !jsonObj.get("extinfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extinfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extinfo").toString()));
      }
      if (jsonObj.get("facetype") != null && !jsonObj.get("facetype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `facetype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("facetype").toString()));
      }
      if (jsonObj.get("faceval") != null && !jsonObj.get("faceval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `faceval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("faceval").toString()));
      }
      if (jsonObj.get("group") != null && !jsonObj.get("group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
      if (jsonObj.get("storecode") != null && !jsonObj.get("storecode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storecode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storecode").toString()));
      }
      if (jsonObj.get("validtimes") != null && !jsonObj.get("validtimes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validtimes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validtimes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZolozAuthenticationCustomerFacemanageDeleteModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZolozAuthenticationCustomerFacemanageDeleteModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZolozAuthenticationCustomerFacemanageDeleteModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZolozAuthenticationCustomerFacemanageDeleteModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZolozAuthenticationCustomerFacemanageDeleteModel>() {
           @Override
           public void write(JsonWriter out, ZolozAuthenticationCustomerFacemanageDeleteModel value) throws IOException {
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
           public ZolozAuthenticationCustomerFacemanageDeleteModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ZolozAuthenticationCustomerFacemanageDeleteModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ZolozAuthenticationCustomerFacemanageDeleteModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZolozAuthenticationCustomerFacemanageDeleteModel
  * @throws IOException if the JSON string is invalid with respect to ZolozAuthenticationCustomerFacemanageDeleteModel
  */
  public static ZolozAuthenticationCustomerFacemanageDeleteModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZolozAuthenticationCustomerFacemanageDeleteModel.class);
  }

 /**
  * Convert an instance of ZolozAuthenticationCustomerFacemanageDeleteModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

