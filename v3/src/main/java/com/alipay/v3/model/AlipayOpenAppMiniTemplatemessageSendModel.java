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
 * AlipayOpenAppMiniTemplatemessageSendModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAppMiniTemplatemessageSendModel {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_FORM_ID = "form_id";
  @SerializedName(SERIALIZED_NAME_FORM_ID)
  private String formId;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private String page;

  public static final String SERIALIZED_NAME_TO_OPEN_ID = "to_open_id";
  @SerializedName(SERIALIZED_NAME_TO_OPEN_ID)
  private String toOpenId;

  public static final String SERIALIZED_NAME_TO_USER_ID = "to_user_id";
  @SerializedName(SERIALIZED_NAME_TO_USER_ID)
  private String toUserId;

  public static final String SERIALIZED_NAME_USER_TEMPLATE_ID = "user_template_id";
  @SerializedName(SERIALIZED_NAME_USER_TEMPLATE_ID)
  private String userTemplateId;

  public AlipayOpenAppMiniTemplatemessageSendModel() { 
  }

  public AlipayOpenAppMiniTemplatemessageSendModel data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * 模板消息内容。商家/开发者将模板占位符替换为自定义内容
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"keyword1\": {\"value\" : \"12:00\"},\"keyword2\": {\"value\" : \"20180808\"},\"keyword3\": {\"value\" : \"支付宝\"}}", value = "模板消息内容。商家/开发者将模板占位符替换为自定义内容")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public AlipayOpenAppMiniTemplatemessageSendModel formId(String formId) {
    
    this.formId = formId;
    return this;
  }

   /**
   * 支付消息模板：需传入用户发生的交易行为的支付宝交易号 trade_no；&lt;/br&gt;表单提交模板：需传入用户在小程序触发表单提交事件获得的表单号；&lt;/br&gt;刷脸消息模板：需传入在IOT刷脸后得到的ftoken等，用于信息发送的校验。&lt;/br&gt;
   * @return formId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017010100000000580012345678", value = "支付消息模板：需传入用户发生的交易行为的支付宝交易号 trade_no；</br>表单提交模板：需传入用户在小程序触发表单提交事件获得的表单号；</br>刷脸消息模板：需传入在IOT刷脸后得到的ftoken等，用于信息发送的校验。</br>")

  public String getFormId() {
    return formId;
  }


  public void setFormId(String formId) {
    this.formId = formId;
  }


  public AlipayOpenAppMiniTemplatemessageSendModel page(String page) {
    
    this.page = page;
    return this;
  }

   /**
   * 小程序的跳转页面。用于用户点击模板消息 进入小程序查看 按钮后，跳转至商家小程序对应页面。
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "page/component/index", value = "小程序的跳转页面。用于用户点击模板消息 进入小程序查看 按钮后，跳转至商家小程序对应页面。")

  public String getPage() {
    return page;
  }


  public void setPage(String page) {
    this.page = page;
  }


  public AlipayOpenAppMiniTemplatemessageSendModel toOpenId(String toOpenId) {
    
    this.toOpenId = toOpenId;
    return this;
  }

   /**
   * 支付宝openId，用于支付宝用户在当前应用下的用户标识。
   * @return toOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "支付宝openId，用于支付宝用户在当前应用下的用户标识。")

  public String getToOpenId() {
    return toOpenId;
  }


  public void setToOpenId(String toOpenId) {
    this.toOpenId = toOpenId;
  }


  public AlipayOpenAppMiniTemplatemessageSendModel toUserId(String toUserId) {
    
    this.toUserId = toUserId;
    return this;
  }

   /**
   * 接收模板消息用户支付宝 user_id，可通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/api/openapi-authorize\&quot;&gt;用户授权&lt;/a&gt; 获取
   * @return toUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102122458832", value = "接收模板消息用户支付宝 user_id，可通过 <a href=\"https://opendocs.alipay.com/mini/api/openapi-authorize\">用户授权</a> 获取")

  public String getToUserId() {
    return toUserId;
  }


  public void setToUserId(String toUserId) {
    this.toUserId = toUserId;
  }


  public AlipayOpenAppMiniTemplatemessageSendModel userTemplateId(String userTemplateId) {
    
    this.userTemplateId = userTemplateId;
    return this;
  }

   /**
   * 商家在商家自运营中心选用的消息模板ID，详情参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/03l9bb?pathHash&#x3D;19d2e0aa&amp;ref&#x3D;api#%E9%A2%86%E7%94%A8%E8%AE%A2%E9%98%85%E6%B6%88%E6%81%AF%E6%A8%A1%E6%9D%BF\&quot;&gt;选用消息模板&lt;/a&gt; 。
   * @return userTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MDI4YzIxMDE2M2I5YTQzYjUxNWE4MjA4NmU1MTIyYmM=", value = "商家在商家自运营中心选用的消息模板ID，详情参见 <a href=\"https://opendocs.alipay.com/mini/03l9bb?pathHash=19d2e0aa&ref=api#%E9%A2%86%E7%94%A8%E8%AE%A2%E9%98%85%E6%B6%88%E6%81%AF%E6%A8%A1%E6%9D%BF\">选用消息模板</a> 。")

  public String getUserTemplateId() {
    return userTemplateId;
  }


  public void setUserTemplateId(String userTemplateId) {
    this.userTemplateId = userTemplateId;
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
   * @return the AlipayOpenAppMiniTemplatemessageSendModel instance itself
   */
  public AlipayOpenAppMiniTemplatemessageSendModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenAppMiniTemplatemessageSendModel alipayOpenAppMiniTemplatemessageSendModel = (AlipayOpenAppMiniTemplatemessageSendModel) o;
    return Objects.equals(this.data, alipayOpenAppMiniTemplatemessageSendModel.data) &&
        Objects.equals(this.formId, alipayOpenAppMiniTemplatemessageSendModel.formId) &&
        Objects.equals(this.page, alipayOpenAppMiniTemplatemessageSendModel.page) &&
        Objects.equals(this.toOpenId, alipayOpenAppMiniTemplatemessageSendModel.toOpenId) &&
        Objects.equals(this.toUserId, alipayOpenAppMiniTemplatemessageSendModel.toUserId) &&
        Objects.equals(this.userTemplateId, alipayOpenAppMiniTemplatemessageSendModel.userTemplateId)&&
        Objects.equals(this.additionalProperties, alipayOpenAppMiniTemplatemessageSendModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, formId, page, toOpenId, toUserId, userTemplateId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAppMiniTemplatemessageSendModel {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    toOpenId: ").append(toIndentedString(toOpenId)).append("\n");
    sb.append("    toUserId: ").append(toIndentedString(toUserId)).append("\n");
    sb.append("    userTemplateId: ").append(toIndentedString(userTemplateId)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("form_id");
    openapiFields.add("page");
    openapiFields.add("to_open_id");
    openapiFields.add("to_user_id");
    openapiFields.add("user_template_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAppMiniTemplatemessageSendModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAppMiniTemplatemessageSendModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAppMiniTemplatemessageSendModel is not found in the empty JSON string", AlipayOpenAppMiniTemplatemessageSendModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      if (jsonObj.get("form_id") != null && !jsonObj.get("form_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `form_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("form_id").toString()));
      }
      if (jsonObj.get("page") != null && !jsonObj.get("page").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page").toString()));
      }
      if (jsonObj.get("to_open_id") != null && !jsonObj.get("to_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to_open_id").toString()));
      }
      if (jsonObj.get("to_user_id") != null && !jsonObj.get("to_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to_user_id").toString()));
      }
      if (jsonObj.get("user_template_id") != null && !jsonObj.get("user_template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_template_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAppMiniTemplatemessageSendModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAppMiniTemplatemessageSendModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAppMiniTemplatemessageSendModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAppMiniTemplatemessageSendModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAppMiniTemplatemessageSendModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAppMiniTemplatemessageSendModel value) throws IOException {
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
           public AlipayOpenAppMiniTemplatemessageSendModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenAppMiniTemplatemessageSendModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenAppMiniTemplatemessageSendModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAppMiniTemplatemessageSendModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAppMiniTemplatemessageSendModel
  */
  public static AlipayOpenAppMiniTemplatemessageSendModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAppMiniTemplatemessageSendModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAppMiniTemplatemessageSendModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

