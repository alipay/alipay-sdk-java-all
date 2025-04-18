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
 * AlipayOpenSearchSubservicekeywordApplyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSearchSubservicekeywordApplyModel {
  public static final String SERIALIZED_NAME_CONFIG_ID = "config_id";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private String configId;

  public static final String SERIALIZED_NAME_KEY_WORDS = "key_words";
  @SerializedName(SERIALIZED_NAME_KEY_WORDS)
  private List<String> keyWords = null;

  public static final String SERIALIZED_NAME_SUB_SERVICE_CODE = "sub_service_code";
  @SerializedName(SERIALIZED_NAME_SUB_SERVICE_CODE)
  private String subServiceCode;

  public static final String SERIALIZED_NAME_TARGET_APPID = "target_appid";
  @SerializedName(SERIALIZED_NAME_TARGET_APPID)
  private String targetAppid;

  public AlipayOpenSearchSubservicekeywordApplyModel() { 
  }

  public AlipayOpenSearchSubservicekeywordApplyModel configId(String configId) {
    
    this.configId = configId;
    return this;
  }

   /**
   * 关键词配置id，由支付宝生成，关键词申请通过后会通知接口返回，也可以申请单状态获取
   * @return configId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20221108000000245181", value = "关键词配置id，由支付宝生成，关键词申请通过后会通知接口返回，也可以申请单状态获取")

  public String getConfigId() {
    return configId;
  }


  public void setConfigId(String configId) {
    this.configId = configId;
  }


  public AlipayOpenSearchSubservicekeywordApplyModel keyWords(List<String> keyWords) {
    
    this.keyWords = keyWords;
    return this;
  }

  public AlipayOpenSearchSubservicekeywordApplyModel addKeyWordsItem(String keyWordsItem) {
    if (this.keyWords == null) {
      this.keyWords = new ArrayList<>();
    }
    this.keyWords.add(keyWordsItem);
    return this;
  }

   /**
   * 服务关键词列表，每批最多传入30个，关键词长度小于12个汉字。 超过数量限制会申请失败，剩余关键词可通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/062ndt?pathHash&#x3D;e3e78b68&amp;ref&#x3D;api&amp;scene&#x3D;common\&quot;&gt;alipay.open.search.appkeywordquota.query&lt;/a&gt;查询
   * @return keyWords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"a\",\"b\"]", value = "服务关键词列表，每批最多传入30个，关键词长度小于12个汉字。 超过数量限制会申请失败，剩余关键词可通过 <a href=\"https://opendocs.alipay.com/mini/062ndt?pathHash=e3e78b68&ref=api&scene=common\">alipay.open.search.appkeywordquota.query</a>查询")

  public List<String> getKeyWords() {
    return keyWords;
  }


  public void setKeyWords(List<String> keyWords) {
    this.keyWords = keyWords;
  }


  public AlipayOpenSearchSubservicekeywordApplyModel subServiceCode(String subServiceCode) {
    
    this.subServiceCode = subServiceCode;
    return this;
  }

   /**
   * 子服务code，提报服务关键词，alipay.open.app.service.list.query(服务批量查询)这个接口可以获取
   * @return subServiceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020071621000604578858", value = "子服务code，提报服务关键词，alipay.open.app.service.list.query(服务批量查询)这个接口可以获取")

  public String getSubServiceCode() {
    return subServiceCode;
  }


  public void setSubServiceCode(String subServiceCode) {
    this.subServiceCode = subServiceCode;
  }


  public AlipayOpenSearchSubservicekeywordApplyModel targetAppid(String targetAppid) {
    
    this.targetAppid = targetAppid;
    return this;
  }

   /**
   * 小程序id
   * @return targetAppid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021001112626071", value = "小程序id")

  public String getTargetAppid() {
    return targetAppid;
  }


  public void setTargetAppid(String targetAppid) {
    this.targetAppid = targetAppid;
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
   * @return the AlipayOpenSearchSubservicekeywordApplyModel instance itself
   */
  public AlipayOpenSearchSubservicekeywordApplyModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenSearchSubservicekeywordApplyModel alipayOpenSearchSubservicekeywordApplyModel = (AlipayOpenSearchSubservicekeywordApplyModel) o;
    return Objects.equals(this.configId, alipayOpenSearchSubservicekeywordApplyModel.configId) &&
        Objects.equals(this.keyWords, alipayOpenSearchSubservicekeywordApplyModel.keyWords) &&
        Objects.equals(this.subServiceCode, alipayOpenSearchSubservicekeywordApplyModel.subServiceCode) &&
        Objects.equals(this.targetAppid, alipayOpenSearchSubservicekeywordApplyModel.targetAppid)&&
        Objects.equals(this.additionalProperties, alipayOpenSearchSubservicekeywordApplyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configId, keyWords, subServiceCode, targetAppid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSearchSubservicekeywordApplyModel {\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    keyWords: ").append(toIndentedString(keyWords)).append("\n");
    sb.append("    subServiceCode: ").append(toIndentedString(subServiceCode)).append("\n");
    sb.append("    targetAppid: ").append(toIndentedString(targetAppid)).append("\n");
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
    openapiFields.add("config_id");
    openapiFields.add("key_words");
    openapiFields.add("sub_service_code");
    openapiFields.add("target_appid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSearchSubservicekeywordApplyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSearchSubservicekeywordApplyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSearchSubservicekeywordApplyModel is not found in the empty JSON string", AlipayOpenSearchSubservicekeywordApplyModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("config_id") != null && !jsonObj.get("config_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `config_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("config_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("key_words") != null && !jsonObj.get("key_words").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_words` to be an array in the JSON string but got `%s`", jsonObj.get("key_words").toString()));
      }
      if (jsonObj.get("sub_service_code") != null && !jsonObj.get("sub_service_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_service_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_service_code").toString()));
      }
      if (jsonObj.get("target_appid") != null && !jsonObj.get("target_appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_appid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSearchSubservicekeywordApplyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSearchSubservicekeywordApplyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSearchSubservicekeywordApplyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSearchSubservicekeywordApplyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSearchSubservicekeywordApplyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSearchSubservicekeywordApplyModel value) throws IOException {
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
           public AlipayOpenSearchSubservicekeywordApplyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenSearchSubservicekeywordApplyModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenSearchSubservicekeywordApplyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSearchSubservicekeywordApplyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSearchSubservicekeywordApplyModel
  */
  public static AlipayOpenSearchSubservicekeywordApplyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSearchSubservicekeywordApplyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSearchSubservicekeywordApplyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

