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
 * ExpenseMerchantInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExpenseMerchantInfo {
  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_ROLE_ID = "role_id";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  private String roleId;

  public static final String SERIALIZED_NAME_ROLE_TYPE = "role_type";
  @SerializedName(SERIALIZED_NAME_ROLE_TYPE)
  private String roleType;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId;

  public static final String SERIALIZED_NAME_SHOP_NAME = "shop_name";
  @SerializedName(SERIALIZED_NAME_SHOP_NAME)
  private String shopName;

  public ExpenseMerchantInfo() { 
  }

  public ExpenseMerchantInfo merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * 商户名称
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "肯德基", value = "商户名称")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public ExpenseMerchantInfo pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 商户ID
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxx", value = "商户ID")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }


  public ExpenseMerchantInfo roleId(String roleId) {
    
    this.roleId = roleId;
    return this;
  }

   /**
   * 商户ID
   * @return roleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxx", value = "商户ID")

  public String getRoleId() {
    return roleId;
  }


  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }


  public ExpenseMerchantInfo roleType(String roleType) {
    
    this.roleType = roleType;
    return this;
  }

   /**
   * 角色类型 0-直连商户 1-间联商户
   * @return roleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "角色类型 0-直连商户 1-间联商户")

  public String getRoleType() {
    return roleType;
  }


  public void setRoleType(String roleType) {
    this.roleType = roleType;
  }


  public ExpenseMerchantInfo shopId(String shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 门店ID
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxx", value = "门店ID")

  public String getShopId() {
    return shopId;
  }


  public void setShopId(String shopId) {
    this.shopId = shopId;
  }


  public ExpenseMerchantInfo shopName(String shopName) {
    
    this.shopName = shopName;
    return this;
  }

   /**
   * 门店名称
   * @return shopName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "肯德基陆家嘴店", value = "门店名称")

  public String getShopName() {
    return shopName;
  }


  public void setShopName(String shopName) {
    this.shopName = shopName;
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
   * @return the ExpenseMerchantInfo instance itself
   */
  public ExpenseMerchantInfo putAdditionalProperty(String key, Object value) {
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
    ExpenseMerchantInfo expenseMerchantInfo = (ExpenseMerchantInfo) o;
    return Objects.equals(this.merchantName, expenseMerchantInfo.merchantName) &&
        Objects.equals(this.pid, expenseMerchantInfo.pid) &&
        Objects.equals(this.roleId, expenseMerchantInfo.roleId) &&
        Objects.equals(this.roleType, expenseMerchantInfo.roleType) &&
        Objects.equals(this.shopId, expenseMerchantInfo.shopId) &&
        Objects.equals(this.shopName, expenseMerchantInfo.shopName)&&
        Objects.equals(this.additionalProperties, expenseMerchantInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantName, pid, roleId, roleType, shopId, shopName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseMerchantInfo {\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
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
    openapiFields.add("merchant_name");
    openapiFields.add("pid");
    openapiFields.add("role_id");
    openapiFields.add("role_type");
    openapiFields.add("shop_id");
    openapiFields.add("shop_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExpenseMerchantInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExpenseMerchantInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExpenseMerchantInfo is not found in the empty JSON string", ExpenseMerchantInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("merchant_name") != null && !jsonObj.get("merchant_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_name").toString()));
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
      if (jsonObj.get("role_id") != null && !jsonObj.get("role_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role_id").toString()));
      }
      if (jsonObj.get("role_type") != null && !jsonObj.get("role_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role_type").toString()));
      }
      if (jsonObj.get("shop_id") != null && !jsonObj.get("shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_id").toString()));
      }
      if (jsonObj.get("shop_name") != null && !jsonObj.get("shop_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExpenseMerchantInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExpenseMerchantInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExpenseMerchantInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExpenseMerchantInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ExpenseMerchantInfo>() {
           @Override
           public void write(JsonWriter out, ExpenseMerchantInfo value) throws IOException {
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
           public ExpenseMerchantInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExpenseMerchantInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExpenseMerchantInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExpenseMerchantInfo
  * @throws IOException if the JSON string is invalid with respect to ExpenseMerchantInfo
  */
  public static ExpenseMerchantInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExpenseMerchantInfo.class);
  }

 /**
  * Convert an instance of ExpenseMerchantInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

