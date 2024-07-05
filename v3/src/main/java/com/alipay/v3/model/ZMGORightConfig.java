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
 * ZMGORightConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZMGORightConfig {
  public static final String SERIALIZED_NAME_CUMULATIVE_PREFERENTIAL_REDIRECT_SCHEMA = "cumulative_preferential_redirect_schema";
  @SerializedName(SERIALIZED_NAME_CUMULATIVE_PREFERENTIAL_REDIRECT_SCHEMA)
  private String cumulativePreferentialRedirectSchema;

  public static final String SERIALIZED_NAME_CUSTOM_BENEFIT_DESC = "custom_benefit_desc";
  @SerializedName(SERIALIZED_NAME_CUSTOM_BENEFIT_DESC)
  private String customBenefitDesc;

  public static final String SERIALIZED_NAME_CUSTOM_SUB_BENEFIT_DESC = "custom_sub_benefit_desc";
  @SerializedName(SERIALIZED_NAME_CUSTOM_SUB_BENEFIT_DESC)
  private String customSubBenefitDesc;

  public ZMGORightConfig() { 
  }

  public ZMGORightConfig cumulativePreferentialRedirectSchema(String cumulativePreferentialRedirectSchema) {
    
    this.cumulativePreferentialRedirectSchema = cumulativePreferentialRedirectSchema;
    return this;
  }

   /**
   * 芝麻GO管理页已享优惠进度的重定向链接
   * @return cumulativePreferentialRedirectSchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "芝麻GO管理页已享优惠进度的重定向链接")

  public String getCumulativePreferentialRedirectSchema() {
    return cumulativePreferentialRedirectSchema;
  }


  public void setCumulativePreferentialRedirectSchema(String cumulativePreferentialRedirectSchema) {
    this.cumulativePreferentialRedirectSchema = cumulativePreferentialRedirectSchema;
  }


  public ZMGORightConfig customBenefitDesc(String customBenefitDesc) {
    
    this.customBenefitDesc = customBenefitDesc;
    return this;
  }

   /**
   * 权益描述
   * @return customBenefitDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "权益描述")

  public String getCustomBenefitDesc() {
    return customBenefitDesc;
  }


  public void setCustomBenefitDesc(String customBenefitDesc) {
    this.customBenefitDesc = customBenefitDesc;
  }


  public ZMGORightConfig customSubBenefitDesc(String customSubBenefitDesc) {
    
    this.customSubBenefitDesc = customSubBenefitDesc;
    return this;
  }

   /**
   * 权益描述子标题
   * @return customSubBenefitDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "权益描述子标题")

  public String getCustomSubBenefitDesc() {
    return customSubBenefitDesc;
  }


  public void setCustomSubBenefitDesc(String customSubBenefitDesc) {
    this.customSubBenefitDesc = customSubBenefitDesc;
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
   * @return the ZMGORightConfig instance itself
   */
  public ZMGORightConfig putAdditionalProperty(String key, Object value) {
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
    ZMGORightConfig zmGORightConfig = (ZMGORightConfig) o;
    return Objects.equals(this.cumulativePreferentialRedirectSchema, zmGORightConfig.cumulativePreferentialRedirectSchema) &&
        Objects.equals(this.customBenefitDesc, zmGORightConfig.customBenefitDesc) &&
        Objects.equals(this.customSubBenefitDesc, zmGORightConfig.customSubBenefitDesc)&&
        Objects.equals(this.additionalProperties, zmGORightConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cumulativePreferentialRedirectSchema, customBenefitDesc, customSubBenefitDesc, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZMGORightConfig {\n");
    sb.append("    cumulativePreferentialRedirectSchema: ").append(toIndentedString(cumulativePreferentialRedirectSchema)).append("\n");
    sb.append("    customBenefitDesc: ").append(toIndentedString(customBenefitDesc)).append("\n");
    sb.append("    customSubBenefitDesc: ").append(toIndentedString(customSubBenefitDesc)).append("\n");
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
    openapiFields.add("cumulative_preferential_redirect_schema");
    openapiFields.add("custom_benefit_desc");
    openapiFields.add("custom_sub_benefit_desc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZMGORightConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZMGORightConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZMGORightConfig is not found in the empty JSON string", ZMGORightConfig.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("cumulative_preferential_redirect_schema") != null && !jsonObj.get("cumulative_preferential_redirect_schema").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cumulative_preferential_redirect_schema` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cumulative_preferential_redirect_schema").toString()));
      }
      if (jsonObj.get("custom_benefit_desc") != null && !jsonObj.get("custom_benefit_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_benefit_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_benefit_desc").toString()));
      }
      if (jsonObj.get("custom_sub_benefit_desc") != null && !jsonObj.get("custom_sub_benefit_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_sub_benefit_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_sub_benefit_desc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZMGORightConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZMGORightConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZMGORightConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZMGORightConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ZMGORightConfig>() {
           @Override
           public void write(JsonWriter out, ZMGORightConfig value) throws IOException {
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
           public ZMGORightConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ZMGORightConfig instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ZMGORightConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZMGORightConfig
  * @throws IOException if the JSON string is invalid with respect to ZMGORightConfig
  */
  public static ZMGORightConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZMGORightConfig.class);
  }

 /**
  * Convert an instance of ZMGORightConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

