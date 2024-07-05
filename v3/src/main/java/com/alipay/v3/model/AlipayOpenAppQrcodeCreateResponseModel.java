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
 * AlipayOpenAppQrcodeCreateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAppQrcodeCreateResponseModel {
  public static final String SERIALIZED_NAME_QR_CODE_URL = "qr_code_url";
  @SerializedName(SERIALIZED_NAME_QR_CODE_URL)
  private String qrCodeUrl;

  public static final String SERIALIZED_NAME_QR_CODE_URL_CIRCLE_BLUE = "qr_code_url_circle_blue";
  @SerializedName(SERIALIZED_NAME_QR_CODE_URL_CIRCLE_BLUE)
  private String qrCodeUrlCircleBlue;

  public static final String SERIALIZED_NAME_QR_CODE_URL_CIRCLE_WHITE = "qr_code_url_circle_white";
  @SerializedName(SERIALIZED_NAME_QR_CODE_URL_CIRCLE_WHITE)
  private String qrCodeUrlCircleWhite;

  public AlipayOpenAppQrcodeCreateResponseModel() { 
  }

  public AlipayOpenAppQrcodeCreateResponseModel qrCodeUrl(String qrCodeUrl) {
    
    this.qrCodeUrl = qrCodeUrl;
    return this;
  }

   /**
   * 方形二维码图片链接地址
   * @return qrCodeUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://mmtcdp.stable.alipay.net/wsdk/img?fileid=A*lSbPT5i9C1wAAAAAAAAAAABjAQAAAA&t=9005d7f574f30246b89c20c17302115f&bz=mmtcafts&", value = "方形二维码图片链接地址")

  public String getQrCodeUrl() {
    return qrCodeUrl;
  }


  public void setQrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
  }


  public AlipayOpenAppQrcodeCreateResponseModel qrCodeUrlCircleBlue(String qrCodeUrlCircleBlue) {
    
    this.qrCodeUrlCircleBlue = qrCodeUrlCircleBlue;
    return this;
  }

   /**
   * 圆形二维码地址，蓝色slogan
   * @return qrCodeUrlCircleBlue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://mdgwdev.alipay.net/wsdk/img?fileid=A*KUfuQrWzFdsAAAAAAAAAAAAAAQAAAQ&bz=am_afts_openhome&zoom=800w_800h", value = "圆形二维码地址，蓝色slogan")

  public String getQrCodeUrlCircleBlue() {
    return qrCodeUrlCircleBlue;
  }


  public void setQrCodeUrlCircleBlue(String qrCodeUrlCircleBlue) {
    this.qrCodeUrlCircleBlue = qrCodeUrlCircleBlue;
  }


  public AlipayOpenAppQrcodeCreateResponseModel qrCodeUrlCircleWhite(String qrCodeUrlCircleWhite) {
    
    this.qrCodeUrlCircleWhite = qrCodeUrlCircleWhite;
    return this;
  }

   /**
   * 圆形二维码地址，白色slogan
   * @return qrCodeUrlCircleWhite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://mdgwdev.alipay.net/wsdk/img?fileid=A*fRfsRq-nXbkAAAAAAAAAAAAAAQAAAQ&bz=am_afts_openhome&zoom=800w_800h", value = "圆形二维码地址，白色slogan")

  public String getQrCodeUrlCircleWhite() {
    return qrCodeUrlCircleWhite;
  }


  public void setQrCodeUrlCircleWhite(String qrCodeUrlCircleWhite) {
    this.qrCodeUrlCircleWhite = qrCodeUrlCircleWhite;
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
   * @return the AlipayOpenAppQrcodeCreateResponseModel instance itself
   */
  public AlipayOpenAppQrcodeCreateResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenAppQrcodeCreateResponseModel alipayOpenAppQrcodeCreateResponseModel = (AlipayOpenAppQrcodeCreateResponseModel) o;
    return Objects.equals(this.qrCodeUrl, alipayOpenAppQrcodeCreateResponseModel.qrCodeUrl) &&
        Objects.equals(this.qrCodeUrlCircleBlue, alipayOpenAppQrcodeCreateResponseModel.qrCodeUrlCircleBlue) &&
        Objects.equals(this.qrCodeUrlCircleWhite, alipayOpenAppQrcodeCreateResponseModel.qrCodeUrlCircleWhite)&&
        Objects.equals(this.additionalProperties, alipayOpenAppQrcodeCreateResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qrCodeUrl, qrCodeUrlCircleBlue, qrCodeUrlCircleWhite, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAppQrcodeCreateResponseModel {\n");
    sb.append("    qrCodeUrl: ").append(toIndentedString(qrCodeUrl)).append("\n");
    sb.append("    qrCodeUrlCircleBlue: ").append(toIndentedString(qrCodeUrlCircleBlue)).append("\n");
    sb.append("    qrCodeUrlCircleWhite: ").append(toIndentedString(qrCodeUrlCircleWhite)).append("\n");
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
    openapiFields.add("qr_code_url");
    openapiFields.add("qr_code_url_circle_blue");
    openapiFields.add("qr_code_url_circle_white");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAppQrcodeCreateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAppQrcodeCreateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAppQrcodeCreateResponseModel is not found in the empty JSON string", AlipayOpenAppQrcodeCreateResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("qr_code_url") != null && !jsonObj.get("qr_code_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qr_code_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qr_code_url").toString()));
      }
      if (jsonObj.get("qr_code_url_circle_blue") != null && !jsonObj.get("qr_code_url_circle_blue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qr_code_url_circle_blue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qr_code_url_circle_blue").toString()));
      }
      if (jsonObj.get("qr_code_url_circle_white") != null && !jsonObj.get("qr_code_url_circle_white").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qr_code_url_circle_white` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qr_code_url_circle_white").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAppQrcodeCreateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAppQrcodeCreateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAppQrcodeCreateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAppQrcodeCreateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAppQrcodeCreateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAppQrcodeCreateResponseModel value) throws IOException {
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
           public AlipayOpenAppQrcodeCreateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenAppQrcodeCreateResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenAppQrcodeCreateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAppQrcodeCreateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAppQrcodeCreateResponseModel
  */
  public static AlipayOpenAppQrcodeCreateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAppQrcodeCreateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAppQrcodeCreateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

