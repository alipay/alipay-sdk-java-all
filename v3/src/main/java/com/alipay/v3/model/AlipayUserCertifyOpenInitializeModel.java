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
import com.alipay.v3.model.OpenCertifyIdentityParam;
import com.alipay.v3.model.OpenCertifyMerchantConfig;
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
 * AlipayUserCertifyOpenInitializeModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayUserCertifyOpenInitializeModel {
  public static final String SERIALIZED_NAME_BIZ_CODE = "biz_code";
  @SerializedName(SERIALIZED_NAME_BIZ_CODE)
  private String bizCode;

  public static final String SERIALIZED_NAME_FACE_CONTRAST_PICTURE = "face_contrast_picture";
  @SerializedName(SERIALIZED_NAME_FACE_CONTRAST_PICTURE)
  private String faceContrastPicture;

  public static final String SERIALIZED_NAME_IDENTITY_PARAM = "identity_param";
  @SerializedName(SERIALIZED_NAME_IDENTITY_PARAM)
  private OpenCertifyIdentityParam identityParam;

  public static final String SERIALIZED_NAME_MERCHANT_CONFIG = "merchant_config";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CONFIG)
  private OpenCertifyMerchantConfig merchantConfig;

  public static final String SERIALIZED_NAME_OUTER_ORDER_NO = "outer_order_no";
  @SerializedName(SERIALIZED_NAME_OUTER_ORDER_NO)
  private String outerOrderNo;

  public AlipayUserCertifyOpenInitializeModel() { 
  }

  public AlipayUserCertifyOpenInitializeModel bizCode(String bizCode) {
    
    this.bizCode = bizCode;
    return this;
  }

   /**
   * 认证场景码。入参支持的认证场景码和商户签约的认证场景相关，取值如下: FACE：多因子人脸认证 CERT_PHOTO：多因子证照认证 CERT_PHOTO_FACE ：多因子证照和人脸认证 SMART_FACE：多因子快捷认证
   * @return bizCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FACE", value = "认证场景码。入参支持的认证场景码和商户签约的认证场景相关，取值如下: FACE：多因子人脸认证 CERT_PHOTO：多因子证照认证 CERT_PHOTO_FACE ：多因子证照和人脸认证 SMART_FACE：多因子快捷认证")

  public String getBizCode() {
    return bizCode;
  }


  public void setBizCode(String bizCode) {
    this.bizCode = bizCode;
  }


  public AlipayUserCertifyOpenInitializeModel faceContrastPicture(String faceContrastPicture) {
    
    this.faceContrastPicture = faceContrastPicture;
    return this;
  }

   /**
   * 自定义人脸比对图片的base64编码格式的string字符串
   * @return faceContrastPicture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xydasf==", value = "自定义人脸比对图片的base64编码格式的string字符串")

  public String getFaceContrastPicture() {
    return faceContrastPicture;
  }


  public void setFaceContrastPicture(String faceContrastPicture) {
    this.faceContrastPicture = faceContrastPicture;
  }


  public AlipayUserCertifyOpenInitializeModel identityParam(OpenCertifyIdentityParam identityParam) {
    
    this.identityParam = identityParam;
    return this;
  }

   /**
   * Get identityParam
   * @return identityParam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OpenCertifyIdentityParam getIdentityParam() {
    return identityParam;
  }


  public void setIdentityParam(OpenCertifyIdentityParam identityParam) {
    this.identityParam = identityParam;
  }


  public AlipayUserCertifyOpenInitializeModel merchantConfig(OpenCertifyMerchantConfig merchantConfig) {
    
    this.merchantConfig = merchantConfig;
    return this;
  }

   /**
   * Get merchantConfig
   * @return merchantConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OpenCertifyMerchantConfig getMerchantConfig() {
    return merchantConfig;
  }


  public void setMerchantConfig(OpenCertifyMerchantConfig merchantConfig) {
    this.merchantConfig = merchantConfig;
  }


  public AlipayUserCertifyOpenInitializeModel outerOrderNo(String outerOrderNo) {
    
    this.outerOrderNo = outerOrderNo;
    return this;
  }

   /**
   * 商户请求的唯一标识，商户要保证其唯一性，值为32位长度的字母数字组合。建议：前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
   * @return outerOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZGYD201809132323000001234", value = "商户请求的唯一标识，商户要保证其唯一性，值为32位长度的字母数字组合。建议：前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列")

  public String getOuterOrderNo() {
    return outerOrderNo;
  }


  public void setOuterOrderNo(String outerOrderNo) {
    this.outerOrderNo = outerOrderNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayUserCertifyOpenInitializeModel alipayUserCertifyOpenInitializeModel = (AlipayUserCertifyOpenInitializeModel) o;
    return Objects.equals(this.bizCode, alipayUserCertifyOpenInitializeModel.bizCode) &&
        Objects.equals(this.faceContrastPicture, alipayUserCertifyOpenInitializeModel.faceContrastPicture) &&
        Objects.equals(this.identityParam, alipayUserCertifyOpenInitializeModel.identityParam) &&
        Objects.equals(this.merchantConfig, alipayUserCertifyOpenInitializeModel.merchantConfig) &&
        Objects.equals(this.outerOrderNo, alipayUserCertifyOpenInitializeModel.outerOrderNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizCode, faceContrastPicture, identityParam, merchantConfig, outerOrderNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayUserCertifyOpenInitializeModel {\n");
    sb.append("    bizCode: ").append(toIndentedString(bizCode)).append("\n");
    sb.append("    faceContrastPicture: ").append(toIndentedString(faceContrastPicture)).append("\n");
    sb.append("    identityParam: ").append(toIndentedString(identityParam)).append("\n");
    sb.append("    merchantConfig: ").append(toIndentedString(merchantConfig)).append("\n");
    sb.append("    outerOrderNo: ").append(toIndentedString(outerOrderNo)).append("\n");
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
    openapiFields.add("biz_code");
    openapiFields.add("face_contrast_picture");
    openapiFields.add("identity_param");
    openapiFields.add("merchant_config");
    openapiFields.add("outer_order_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayUserCertifyOpenInitializeModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayUserCertifyOpenInitializeModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayUserCertifyOpenInitializeModel is not found in the empty JSON string", AlipayUserCertifyOpenInitializeModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayUserCertifyOpenInitializeModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayUserCertifyOpenInitializeModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("biz_code") != null && !jsonObj.get("biz_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_code").toString()));
      }
      if (jsonObj.get("face_contrast_picture") != null && !jsonObj.get("face_contrast_picture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `face_contrast_picture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("face_contrast_picture").toString()));
      }
      // validate the optional field `identity_param`
      if (jsonObj.getAsJsonObject("identity_param") != null) {
        OpenCertifyIdentityParam.validateJsonObject(jsonObj.getAsJsonObject("identity_param"));
      }
      // validate the optional field `merchant_config`
      if (jsonObj.getAsJsonObject("merchant_config") != null) {
        OpenCertifyMerchantConfig.validateJsonObject(jsonObj.getAsJsonObject("merchant_config"));
      }
      if (jsonObj.get("outer_order_no") != null && !jsonObj.get("outer_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outer_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outer_order_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayUserCertifyOpenInitializeModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayUserCertifyOpenInitializeModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayUserCertifyOpenInitializeModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayUserCertifyOpenInitializeModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayUserCertifyOpenInitializeModel>() {
           @Override
           public void write(JsonWriter out, AlipayUserCertifyOpenInitializeModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayUserCertifyOpenInitializeModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayUserCertifyOpenInitializeModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayUserCertifyOpenInitializeModel
  * @throws IOException if the JSON string is invalid with respect to AlipayUserCertifyOpenInitializeModel
  */
  public static AlipayUserCertifyOpenInitializeModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayUserCertifyOpenInitializeModel.class);
  }

 /**
  * Convert an instance of AlipayUserCertifyOpenInitializeModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

