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
 * MerchantQueryResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantQueryResult {
  public static final String SERIALIZED_NAME_ALIAS_NAME = "alias_name";
  @SerializedName(SERIALIZED_NAME_ALIAS_NAME)
  private String aliasName;

  public static final String SERIALIZED_NAME_CERT_NO = "cert_no";
  @SerializedName(SERIALIZED_NAME_CERT_NO)
  private String certNo;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_DETAIL_ADDRESS = "detail_address";
  @SerializedName(SERIALIZED_NAME_DETAIL_ADDRESS)
  private String detailAddress;

  public static final String SERIALIZED_NAME_DISTINCT = "distinct";
  @SerializedName(SERIALIZED_NAME_DISTINCT)
  private String distinct;

  public static final String SERIALIZED_NAME_MCC_CODE = "mcc_code";
  @SerializedName(SERIALIZED_NAME_MCC_CODE)
  private String mccCode;

  public static final String SERIALIZED_NAME_MERCHANT_TYPE = "merchant_type";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TYPE)
  private String merchantType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  private String province;

  public MerchantQueryResult() { 
  }

  public MerchantQueryResult aliasName(String aliasName) {
    
    this.aliasName = aliasName;
    return this;
  }

   /**
   * 商户的别名，用户商户对客展示的名称
   * @return aliasName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "商户小店", value = "商户的别名，用户商户对客展示的名称")

  public String getAliasName() {
    return aliasName;
  }


  public void setAliasName(String aliasName) {
    this.aliasName = aliasName;
  }


  public MerchantQueryResult certNo(String certNo) {
    
    this.certNo = certNo;
    return this;
  }

   /**
   * 商户认证证件号，企业营业执照号
   * @return certNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9133010608210550XR", value = "商户认证证件号，企业营业执照号")

  public String getCertNo() {
    return certNo;
  }


  public void setCertNo(String certNo) {
    this.certNo = certNo;
  }


  public MerchantQueryResult city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * 市名称
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州市", value = "市名称")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public MerchantQueryResult detailAddress(String detailAddress) {
    
    this.detailAddress = detailAddress;
    return this;
  }

   /**
   * 商户经营详细地址
   * @return detailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "文三路127号", value = "商户经营详细地址")

  public String getDetailAddress() {
    return detailAddress;
  }


  public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
  }


  public MerchantQueryResult distinct(String distinct) {
    
    this.distinct = distinct;
    return this;
  }

   /**
   * 区县名称
   * @return distinct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "西湖区", value = "区县名称")

  public String getDistinct() {
    return distinct;
  }


  public void setDistinct(String distinct) {
    this.distinct = distinct;
  }


  public MerchantQueryResult mccCode(String mccCode) {
    
    this.mccCode = mccCode;
    return this;
  }

   /**
   * 商户新版mcc code
   * @return mccCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "B0001", value = "商户新版mcc code")

  public String getMccCode() {
    return mccCode;
  }


  public void setMccCode(String mccCode) {
    this.mccCode = mccCode;
  }


  public MerchantQueryResult merchantType(String merchantType) {
    
    this.merchantType = merchantType;
    return this;
  }

   /**
   * 描述商户类型，个人-P/企业-B
   * @return merchantType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "P", value = "描述商户类型，个人-P/企业-B")

  public String getMerchantType() {
    return merchantType;
  }


  public void setMerchantType(String merchantType) {
    this.merchantType = merchantType;
  }


  public MerchantQueryResult name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 商户认证名称信息
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "支付宝商户", value = "商户认证名称信息")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public MerchantQueryResult province(String province) {
    
    this.province = province;
    return this;
  }

   /**
   * 省名称
   * @return province
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "浙江省", value = "省名称")

  public String getProvince() {
    return province;
  }


  public void setProvince(String province) {
    this.province = province;
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
   * @return the MerchantQueryResult instance itself
   */
  public MerchantQueryResult putAdditionalProperty(String key, Object value) {
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
    MerchantQueryResult merchantQueryResult = (MerchantQueryResult) o;
    return Objects.equals(this.aliasName, merchantQueryResult.aliasName) &&
        Objects.equals(this.certNo, merchantQueryResult.certNo) &&
        Objects.equals(this.city, merchantQueryResult.city) &&
        Objects.equals(this.detailAddress, merchantQueryResult.detailAddress) &&
        Objects.equals(this.distinct, merchantQueryResult.distinct) &&
        Objects.equals(this.mccCode, merchantQueryResult.mccCode) &&
        Objects.equals(this.merchantType, merchantQueryResult.merchantType) &&
        Objects.equals(this.name, merchantQueryResult.name) &&
        Objects.equals(this.province, merchantQueryResult.province)&&
        Objects.equals(this.additionalProperties, merchantQueryResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliasName, certNo, city, detailAddress, distinct, mccCode, merchantType, name, province, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantQueryResult {\n");
    sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
    sb.append("    certNo: ").append(toIndentedString(certNo)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    detailAddress: ").append(toIndentedString(detailAddress)).append("\n");
    sb.append("    distinct: ").append(toIndentedString(distinct)).append("\n");
    sb.append("    mccCode: ").append(toIndentedString(mccCode)).append("\n");
    sb.append("    merchantType: ").append(toIndentedString(merchantType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
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
    openapiFields.add("alias_name");
    openapiFields.add("cert_no");
    openapiFields.add("city");
    openapiFields.add("detail_address");
    openapiFields.add("distinct");
    openapiFields.add("mcc_code");
    openapiFields.add("merchant_type");
    openapiFields.add("name");
    openapiFields.add("province");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantQueryResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MerchantQueryResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantQueryResult is not found in the empty JSON string", MerchantQueryResult.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("alias_name") != null && !jsonObj.get("alias_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alias_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alias_name").toString()));
      }
      if (jsonObj.get("cert_no") != null && !jsonObj.get("cert_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_no").toString()));
      }
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (jsonObj.get("detail_address") != null && !jsonObj.get("detail_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail_address").toString()));
      }
      if (jsonObj.get("distinct") != null && !jsonObj.get("distinct").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `distinct` to be a primitive type in the JSON string but got `%s`", jsonObj.get("distinct").toString()));
      }
      if (jsonObj.get("mcc_code") != null && !jsonObj.get("mcc_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mcc_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc_code").toString()));
      }
      if (jsonObj.get("merchant_type") != null && !jsonObj.get("merchant_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_type").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("province") != null && !jsonObj.get("province").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantQueryResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantQueryResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantQueryResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantQueryResult.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantQueryResult>() {
           @Override
           public void write(JsonWriter out, MerchantQueryResult value) throws IOException {
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
           public MerchantQueryResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MerchantQueryResult instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MerchantQueryResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantQueryResult
  * @throws IOException if the JSON string is invalid with respect to MerchantQueryResult
  */
  public static MerchantQueryResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantQueryResult.class);
  }

 /**
  * Convert an instance of MerchantQueryResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

