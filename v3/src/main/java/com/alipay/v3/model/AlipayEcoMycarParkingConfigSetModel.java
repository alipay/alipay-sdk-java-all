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
import com.alipay.v3.model.InterfaceInfoList;
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
 * AlipayEcoMycarParkingConfigSetModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoMycarParkingConfigSetModel {
  public static final String SERIALIZED_NAME_ACCOUNT_NO = "account_no";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NO)
  private String accountNo;

  public static final String SERIALIZED_NAME_INTERFACE_INFO_LIST = "interface_info_list";
  @SerializedName(SERIALIZED_NAME_INTERFACE_INFO_LIST)
  private List<InterfaceInfoList> interfaceInfoList = null;

  public static final String SERIALIZED_NAME_MERCHANT_LOGO = "merchant_logo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_LOGO)
  private String merchantLogo;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_MERCHANT_SERVICE_PHONE = "merchant_service_phone";
  @SerializedName(SERIALIZED_NAME_MERCHANT_SERVICE_PHONE)
  private String merchantServicePhone;

  public AlipayEcoMycarParkingConfigSetModel() { 
  }

  public AlipayEcoMycarParkingConfigSetModel accountNo(String accountNo) {
    
    this.accountNo = accountNo;
    return this;
  }

   /**
   * 签约支付宝账号
   * @return accountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567@126.com", value = "签约支付宝账号")

  public String getAccountNo() {
    return accountNo;
  }


  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }


  public AlipayEcoMycarParkingConfigSetModel interfaceInfoList(List<InterfaceInfoList> interfaceInfoList) {
    
    this.interfaceInfoList = interfaceInfoList;
    return this;
  }

  public AlipayEcoMycarParkingConfigSetModel addInterfaceInfoListItem(InterfaceInfoList interfaceInfoListItem) {
    if (this.interfaceInfoList == null) {
      this.interfaceInfoList = new ArrayList<>();
    }
    this.interfaceInfoList.add(interfaceInfoListItem);
    return this;
  }

   /**
   * 接口信息列表，停车业务需要配置的接口列表，该值为JSON数据格式的LIST对象，现阶段只需要配置一个页面接口即可 。每次请将所有的接口配置信息都传入，未传的接口信息将会被置空。
   * @return interfaceInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "接口信息列表，停车业务需要配置的接口列表，该值为JSON数据格式的LIST对象，现阶段只需要配置一个页面接口即可 。每次请将所有的接口配置信息都传入，未传的接口信息将会被置空。")

  public List<InterfaceInfoList> getInterfaceInfoList() {
    return interfaceInfoList;
  }


  public void setInterfaceInfoList(List<InterfaceInfoList> interfaceInfoList) {
    this.interfaceInfoList = interfaceInfoList;
  }


  public AlipayEcoMycarParkingConfigSetModel merchantLogo(String merchantLogo) {
    
    this.merchantLogo = merchantLogo;
    return this;
  }

   /**
   * 商户在停车平台首页露出的LOGO。 注意： *该图片为PNG格式，内容为BASE64的字符串，建议图片尺寸27px*27px，大小不要超过60K。 *若为空则停车平台首页将不露出商户LOGO。
   * @return merchantLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAIAAAACCAYAAABytg0kAAAAE0lEQVQImWP81mfxn4GJAYQgAAAqvgLBUG4ufAAAAABJRU5ErkJggg==", value = "商户在停车平台首页露出的LOGO。 注意： *该图片为PNG格式，内容为BASE64的字符串，建议图片尺寸27px*27px，大小不要超过60K。 *若为空则停车平台首页将不露出商户LOGO。")

  public String getMerchantLogo() {
    return merchantLogo;
  }


  public void setMerchantLogo(String merchantLogo) {
    this.merchantLogo = merchantLogo;
  }


  public AlipayEcoMycarParkingConfigSetModel merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * 商户简称，由开发者提供
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州立方", value = "商户简称，由开发者提供")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public AlipayEcoMycarParkingConfigSetModel merchantServicePhone(String merchantServicePhone) {
    
    this.merchantServicePhone = merchantServicePhone;
    return this;
  }

   /**
   * 商户客服电话
   * @return merchantServicePhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "021-25413215", value = "商户客服电话")

  public String getMerchantServicePhone() {
    return merchantServicePhone;
  }


  public void setMerchantServicePhone(String merchantServicePhone) {
    this.merchantServicePhone = merchantServicePhone;
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
   * @return the AlipayEcoMycarParkingConfigSetModel instance itself
   */
  public AlipayEcoMycarParkingConfigSetModel putAdditionalProperty(String key, Object value) {
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
    AlipayEcoMycarParkingConfigSetModel alipayEcoMycarParkingConfigSetModel = (AlipayEcoMycarParkingConfigSetModel) o;
    return Objects.equals(this.accountNo, alipayEcoMycarParkingConfigSetModel.accountNo) &&
        Objects.equals(this.interfaceInfoList, alipayEcoMycarParkingConfigSetModel.interfaceInfoList) &&
        Objects.equals(this.merchantLogo, alipayEcoMycarParkingConfigSetModel.merchantLogo) &&
        Objects.equals(this.merchantName, alipayEcoMycarParkingConfigSetModel.merchantName) &&
        Objects.equals(this.merchantServicePhone, alipayEcoMycarParkingConfigSetModel.merchantServicePhone)&&
        Objects.equals(this.additionalProperties, alipayEcoMycarParkingConfigSetModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNo, interfaceInfoList, merchantLogo, merchantName, merchantServicePhone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoMycarParkingConfigSetModel {\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    interfaceInfoList: ").append(toIndentedString(interfaceInfoList)).append("\n");
    sb.append("    merchantLogo: ").append(toIndentedString(merchantLogo)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantServicePhone: ").append(toIndentedString(merchantServicePhone)).append("\n");
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
    openapiFields.add("account_no");
    openapiFields.add("interface_info_list");
    openapiFields.add("merchant_logo");
    openapiFields.add("merchant_name");
    openapiFields.add("merchant_service_phone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoMycarParkingConfigSetModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoMycarParkingConfigSetModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoMycarParkingConfigSetModel is not found in the empty JSON string", AlipayEcoMycarParkingConfigSetModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("account_no") != null && !jsonObj.get("account_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_no").toString()));
      }
      JsonArray jsonArrayinterfaceInfoList = jsonObj.getAsJsonArray("interface_info_list");
      if (jsonArrayinterfaceInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("interface_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `interface_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("interface_info_list").toString()));
        }

        // validate the optional field `interface_info_list` (array)
        for (int i = 0; i < jsonArrayinterfaceInfoList.size(); i++) {
          InterfaceInfoList.validateJsonObject(jsonArrayinterfaceInfoList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("merchant_logo") != null && !jsonObj.get("merchant_logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_logo").toString()));
      }
      if (jsonObj.get("merchant_name") != null && !jsonObj.get("merchant_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_name").toString()));
      }
      if (jsonObj.get("merchant_service_phone") != null && !jsonObj.get("merchant_service_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_service_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_service_phone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoMycarParkingConfigSetModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoMycarParkingConfigSetModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoMycarParkingConfigSetModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoMycarParkingConfigSetModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoMycarParkingConfigSetModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoMycarParkingConfigSetModel value) throws IOException {
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
           public AlipayEcoMycarParkingConfigSetModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEcoMycarParkingConfigSetModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEcoMycarParkingConfigSetModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoMycarParkingConfigSetModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoMycarParkingConfigSetModel
  */
  public static AlipayEcoMycarParkingConfigSetModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoMycarParkingConfigSetModel.class);
  }

 /**
  * Convert an instance of AlipayEcoMycarParkingConfigSetModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

