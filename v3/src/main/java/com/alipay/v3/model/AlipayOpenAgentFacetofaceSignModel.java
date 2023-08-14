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
import com.alipay.v3.model.SignAddressInfo;
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
 * AlipayOpenAgentFacetofaceSignModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAgentFacetofaceSignModel {
  public static final String SERIALIZED_NAME_BATCH_NO = "batch_no";
  @SerializedName(SERIALIZED_NAME_BATCH_NO)
  private String batchNo;

  public static final String SERIALIZED_NAME_BUSINESS_LICENSE_MOBILE = "business_license_mobile";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LICENSE_MOBILE)
  private String businessLicenseMobile;

  public static final String SERIALIZED_NAME_BUSINESS_LICENSE_NO = "business_license_no";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LICENSE_NO)
  private String businessLicenseNo;

  public static final String SERIALIZED_NAME_DATE_LIMITATION = "date_limitation";
  @SerializedName(SERIALIZED_NAME_DATE_LIMITATION)
  private String dateLimitation;

  public static final String SERIALIZED_NAME_LONG_TERM = "long_term";
  @SerializedName(SERIALIZED_NAME_LONG_TERM)
  private Boolean longTerm;

  public static final String SERIALIZED_NAME_MCC_CODE = "mcc_code";
  @SerializedName(SERIALIZED_NAME_MCC_CODE)
  private String mccCode;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private String rate;

  public static final String SERIALIZED_NAME_SHOP_ADDRESS = "shop_address";
  @SerializedName(SERIALIZED_NAME_SHOP_ADDRESS)
  private SignAddressInfo shopAddress;

  public static final String SERIALIZED_NAME_SHOP_NAME = "shop_name";
  @SerializedName(SERIALIZED_NAME_SHOP_NAME)
  private String shopName;

  public static final String SERIALIZED_NAME_SIGN_AND_AUTH = "sign_and_auth";
  @SerializedName(SERIALIZED_NAME_SIGN_AND_AUTH)
  private Boolean signAndAuth;

  public AlipayOpenAgentFacetofaceSignModel() { 
  }

  public AlipayOpenAgentFacetofaceSignModel batchNo(String batchNo) {
    
    this.batchNo = batchNo;
    return this;
  }

   /**
   * 代商户操作事务编号，通过https://opendocs.alipay.com/apis/api_50/alipay.open.agent.create (开启代商户签约、创建应用事务)接口进行事务创建后获取。
   * @return batchNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017110616474516400082883", value = "代商户操作事务编号，通过https://opendocs.alipay.com/apis/api_50/alipay.open.agent.create (开启代商户签约、创建应用事务)接口进行事务创建后获取。")

  public String getBatchNo() {
    return batchNo;
  }


  public void setBatchNo(String batchNo) {
    this.batchNo = batchNo;
  }


  public AlipayOpenAgentFacetofaceSignModel businessLicenseMobile(String businessLicenseMobile) {
    
    this.businessLicenseMobile = businessLicenseMobile;
    return this;
  }

   /**
   * 被邀请授权的营业执照法人手机号码，上传非同人营业执照时必填
   * @return businessLicenseMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13189652239", value = "被邀请授权的营业执照法人手机号码，上传非同人营业执照时必填")

  public String getBusinessLicenseMobile() {
    return businessLicenseMobile;
  }


  public void setBusinessLicenseMobile(String businessLicenseMobile) {
    this.businessLicenseMobile = businessLicenseMobile;
  }


  public AlipayOpenAgentFacetofaceSignModel businessLicenseNo(String businessLicenseNo) {
    
    this.businessLicenseNo = businessLicenseNo;
    return this;
  }

   /**
   * 营业执照号码
   * @return businessLicenseNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1532501100006302", value = "营业执照号码")

  public String getBusinessLicenseNo() {
    return businessLicenseNo;
  }


  public void setBusinessLicenseNo(String businessLicenseNo) {
    this.businessLicenseNo = businessLicenseNo;
  }


  public AlipayOpenAgentFacetofaceSignModel dateLimitation(String dateLimitation) {
    
    this.dateLimitation = dateLimitation;
    return this;
  }

   /**
   * 营业期限
   * @return dateLimitation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-11-11", value = "营业期限")

  public String getDateLimitation() {
    return dateLimitation;
  }


  public void setDateLimitation(String dateLimitation) {
    this.dateLimitation = dateLimitation;
  }


  public AlipayOpenAgentFacetofaceSignModel longTerm(Boolean longTerm) {
    
    this.longTerm = longTerm;
    return this;
  }

   /**
   * 营业期限是否长期有效
   * @return longTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "营业期限是否长期有效")

  public Boolean getLongTerm() {
    return longTerm;
  }


  public void setLongTerm(Boolean longTerm) {
    this.longTerm = longTerm;
  }


  public AlipayOpenAgentFacetofaceSignModel mccCode(String mccCode) {
    
    this.mccCode = mccCode;
    return this;
  }

   /**
   * 商家经营类目编码。参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/01n22g#%E5%95%86%E5%AE%B6%E7%BB%8F%E8%90%A5%E7%B1%BB%E7%9B%AE\&quot;&gt;商家经营类目2.0&lt;/a&gt; 中的“一级类目code_二级类目code”。
   * @return mccCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A0001_B0199", value = "商家经营类目编码。参见 <a href=\"https://opendocs.alipay.com/open/01n22g#%E5%95%86%E5%AE%B6%E7%BB%8F%E8%90%A5%E7%B1%BB%E7%9B%AE\">商家经营类目2.0</a> 中的“一级类目code_二级类目code”。")

  public String getMccCode() {
    return mccCode;
  }


  public void setMccCode(String mccCode) {
    this.mccCode = mccCode;
  }


  public AlipayOpenAgentFacetofaceSignModel rate(String rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * 服务费率（%），0.38~0.6 之间（小数点后两位，可取0.38%及0.6%）。 当签约且授权标识 sign_and_auth&#x3D;true 时，该费率信息必填。
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.38", value = "服务费率（%），0.38~0.6 之间（小数点后两位，可取0.38%及0.6%）。 当签约且授权标识 sign_and_auth=true 时，该费率信息必填。")

  public String getRate() {
    return rate;
  }


  public void setRate(String rate) {
    this.rate = rate;
  }


  public AlipayOpenAgentFacetofaceSignModel shopAddress(SignAddressInfo shopAddress) {
    
    this.shopAddress = shopAddress;
    return this;
  }

   /**
   * Get shopAddress
   * @return shopAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignAddressInfo getShopAddress() {
    return shopAddress;
  }


  public void setShopAddress(SignAddressInfo shopAddress) {
    this.shopAddress = shopAddress;
  }


  public AlipayOpenAgentFacetofaceSignModel shopName(String shopName) {
    
    this.shopName = shopName;
    return this;
  }

   /**
   * 店铺名称
   * @return shopName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-", value = "店铺名称")

  public String getShopName() {
    return shopName;
  }


  public void setShopName(String shopName) {
    this.shopName = shopName;
  }


  public AlipayOpenAgentFacetofaceSignModel signAndAuth(Boolean signAndAuth) {
    
    this.signAndAuth = signAndAuth;
    return this;
  }

   /**
   * 签约且授权标识，默认为false，只进行签约操作； 如果设置为true，则表示签约成功后，会自动进行应用授权操作。
   * @return signAndAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "签约且授权标识，默认为false，只进行签约操作； 如果设置为true，则表示签约成功后，会自动进行应用授权操作。")

  public Boolean getSignAndAuth() {
    return signAndAuth;
  }


  public void setSignAndAuth(Boolean signAndAuth) {
    this.signAndAuth = signAndAuth;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenAgentFacetofaceSignModel alipayOpenAgentFacetofaceSignModel = (AlipayOpenAgentFacetofaceSignModel) o;
    return Objects.equals(this.batchNo, alipayOpenAgentFacetofaceSignModel.batchNo) &&
        Objects.equals(this.businessLicenseMobile, alipayOpenAgentFacetofaceSignModel.businessLicenseMobile) &&
        Objects.equals(this.businessLicenseNo, alipayOpenAgentFacetofaceSignModel.businessLicenseNo) &&
        Objects.equals(this.dateLimitation, alipayOpenAgentFacetofaceSignModel.dateLimitation) &&
        Objects.equals(this.longTerm, alipayOpenAgentFacetofaceSignModel.longTerm) &&
        Objects.equals(this.mccCode, alipayOpenAgentFacetofaceSignModel.mccCode) &&
        Objects.equals(this.rate, alipayOpenAgentFacetofaceSignModel.rate) &&
        Objects.equals(this.shopAddress, alipayOpenAgentFacetofaceSignModel.shopAddress) &&
        Objects.equals(this.shopName, alipayOpenAgentFacetofaceSignModel.shopName) &&
        Objects.equals(this.signAndAuth, alipayOpenAgentFacetofaceSignModel.signAndAuth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchNo, businessLicenseMobile, businessLicenseNo, dateLimitation, longTerm, mccCode, rate, shopAddress, shopName, signAndAuth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAgentFacetofaceSignModel {\n");
    sb.append("    batchNo: ").append(toIndentedString(batchNo)).append("\n");
    sb.append("    businessLicenseMobile: ").append(toIndentedString(businessLicenseMobile)).append("\n");
    sb.append("    businessLicenseNo: ").append(toIndentedString(businessLicenseNo)).append("\n");
    sb.append("    dateLimitation: ").append(toIndentedString(dateLimitation)).append("\n");
    sb.append("    longTerm: ").append(toIndentedString(longTerm)).append("\n");
    sb.append("    mccCode: ").append(toIndentedString(mccCode)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    shopAddress: ").append(toIndentedString(shopAddress)).append("\n");
    sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
    sb.append("    signAndAuth: ").append(toIndentedString(signAndAuth)).append("\n");
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
    openapiFields.add("batch_no");
    openapiFields.add("business_license_mobile");
    openapiFields.add("business_license_no");
    openapiFields.add("date_limitation");
    openapiFields.add("long_term");
    openapiFields.add("mcc_code");
    openapiFields.add("rate");
    openapiFields.add("shop_address");
    openapiFields.add("shop_name");
    openapiFields.add("sign_and_auth");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAgentFacetofaceSignModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAgentFacetofaceSignModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAgentFacetofaceSignModel is not found in the empty JSON string", AlipayOpenAgentFacetofaceSignModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenAgentFacetofaceSignModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenAgentFacetofaceSignModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("batch_no") != null && !jsonObj.get("batch_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_no").toString()));
      }
      if (jsonObj.get("business_license_mobile") != null && !jsonObj.get("business_license_mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_license_mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_license_mobile").toString()));
      }
      if (jsonObj.get("business_license_no") != null && !jsonObj.get("business_license_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_license_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_license_no").toString()));
      }
      if (jsonObj.get("date_limitation") != null && !jsonObj.get("date_limitation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_limitation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_limitation").toString()));
      }
      if (jsonObj.get("mcc_code") != null && !jsonObj.get("mcc_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mcc_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc_code").toString()));
      }
      if (jsonObj.get("rate") != null && !jsonObj.get("rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rate").toString()));
      }
      // validate the optional field `shop_address`
      if (jsonObj.getAsJsonObject("shop_address") != null) {
        SignAddressInfo.validateJsonObject(jsonObj.getAsJsonObject("shop_address"));
      }
      if (jsonObj.get("shop_name") != null && !jsonObj.get("shop_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAgentFacetofaceSignModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAgentFacetofaceSignModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAgentFacetofaceSignModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAgentFacetofaceSignModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAgentFacetofaceSignModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAgentFacetofaceSignModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenAgentFacetofaceSignModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenAgentFacetofaceSignModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAgentFacetofaceSignModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAgentFacetofaceSignModel
  */
  public static AlipayOpenAgentFacetofaceSignModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAgentFacetofaceSignModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAgentFacetofaceSignModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

