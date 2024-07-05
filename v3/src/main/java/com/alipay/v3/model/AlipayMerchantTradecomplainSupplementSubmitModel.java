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
 * AlipayMerchantTradecomplainSupplementSubmitModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMerchantTradecomplainSupplementSubmitModel {
  public static final String SERIALIZED_NAME_COMPLAIN_EVENT_ID = "complain_event_id";
  @SerializedName(SERIALIZED_NAME_COMPLAIN_EVENT_ID)
  private String complainEventId;

  public static final String SERIALIZED_NAME_SUPPLEMENT_CONTENT = "supplement_content";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENT_CONTENT)
  private String supplementContent;

  public static final String SERIALIZED_NAME_SUPPLEMENT_IMAGES = "supplement_images";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENT_IMAGES)
  private String supplementImages;

  public AlipayMerchantTradecomplainSupplementSubmitModel() { 
  }

  public AlipayMerchantTradecomplainSupplementSubmitModel complainEventId(String complainEventId) {
    
    this.complainEventId = complainEventId;
    return this;
  }

   /**
   * 支付宝侧投诉单号
   * @return complainEventId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020092300102000000001459758", value = "支付宝侧投诉单号")

  public String getComplainEventId() {
    return complainEventId;
  }


  public void setComplainEventId(String complainEventId) {
    this.complainEventId = complainEventId;
  }


  public AlipayMerchantTradecomplainSupplementSubmitModel supplementContent(String supplementContent) {
    
    this.supplementContent = supplementContent;
    return this;
  }

   /**
   * 回复内容，最多不超过200个字
   * @return supplementContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "已发货，快递单号详见截图", value = "回复内容，最多不超过200个字")

  public String getSupplementContent() {
    return supplementContent;
  }


  public void setSupplementContent(String supplementContent) {
    this.supplementContent = supplementContent;
  }


  public AlipayMerchantTradecomplainSupplementSubmitModel supplementImages(String supplementImages) {
    
    this.supplementImages = supplementImages;
    return this;
  }

   /**
   * 商家补充凭证时的图片id，多个逗号隔开（图片id可以通过\&quot;商户上传处理图片\&quot;接口获取）
   * @return supplementImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ySYHS5CtTCmag14Wk8jeNAAAACMAAQEW,ySYHS5CtTCmag14Wk8jeNAAAACMAAQAX", value = "商家补充凭证时的图片id，多个逗号隔开（图片id可以通过\"商户上传处理图片\"接口获取）")

  public String getSupplementImages() {
    return supplementImages;
  }


  public void setSupplementImages(String supplementImages) {
    this.supplementImages = supplementImages;
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
   * @return the AlipayMerchantTradecomplainSupplementSubmitModel instance itself
   */
  public AlipayMerchantTradecomplainSupplementSubmitModel putAdditionalProperty(String key, Object value) {
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
    AlipayMerchantTradecomplainSupplementSubmitModel alipayMerchantTradecomplainSupplementSubmitModel = (AlipayMerchantTradecomplainSupplementSubmitModel) o;
    return Objects.equals(this.complainEventId, alipayMerchantTradecomplainSupplementSubmitModel.complainEventId) &&
        Objects.equals(this.supplementContent, alipayMerchantTradecomplainSupplementSubmitModel.supplementContent) &&
        Objects.equals(this.supplementImages, alipayMerchantTradecomplainSupplementSubmitModel.supplementImages)&&
        Objects.equals(this.additionalProperties, alipayMerchantTradecomplainSupplementSubmitModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complainEventId, supplementContent, supplementImages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMerchantTradecomplainSupplementSubmitModel {\n");
    sb.append("    complainEventId: ").append(toIndentedString(complainEventId)).append("\n");
    sb.append("    supplementContent: ").append(toIndentedString(supplementContent)).append("\n");
    sb.append("    supplementImages: ").append(toIndentedString(supplementImages)).append("\n");
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
    openapiFields.add("complain_event_id");
    openapiFields.add("supplement_content");
    openapiFields.add("supplement_images");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMerchantTradecomplainSupplementSubmitModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMerchantTradecomplainSupplementSubmitModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMerchantTradecomplainSupplementSubmitModel is not found in the empty JSON string", AlipayMerchantTradecomplainSupplementSubmitModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("complain_event_id") != null && !jsonObj.get("complain_event_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `complain_event_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("complain_event_id").toString()));
      }
      if (jsonObj.get("supplement_content") != null && !jsonObj.get("supplement_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supplement_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supplement_content").toString()));
      }
      if (jsonObj.get("supplement_images") != null && !jsonObj.get("supplement_images").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supplement_images` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supplement_images").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMerchantTradecomplainSupplementSubmitModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMerchantTradecomplainSupplementSubmitModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMerchantTradecomplainSupplementSubmitModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMerchantTradecomplainSupplementSubmitModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMerchantTradecomplainSupplementSubmitModel>() {
           @Override
           public void write(JsonWriter out, AlipayMerchantTradecomplainSupplementSubmitModel value) throws IOException {
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
           public AlipayMerchantTradecomplainSupplementSubmitModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayMerchantTradecomplainSupplementSubmitModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayMerchantTradecomplainSupplementSubmitModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMerchantTradecomplainSupplementSubmitModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMerchantTradecomplainSupplementSubmitModel
  */
  public static AlipayMerchantTradecomplainSupplementSubmitModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMerchantTradecomplainSupplementSubmitModel.class);
  }

 /**
  * Convert an instance of AlipayMerchantTradecomplainSupplementSubmitModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

