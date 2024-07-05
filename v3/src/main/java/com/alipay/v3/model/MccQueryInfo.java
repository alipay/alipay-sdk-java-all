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
 * MccQueryInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MccQueryInfo {
  public static final String SERIALIZED_NAME_IS_SPECIAL = "is_special";
  @SerializedName(SERIALIZED_NAME_IS_SPECIAL)
  private Boolean isSpecial;

  public static final String SERIALIZED_NAME_MCC_LEVEL1 = "mcc_level_1";
  @SerializedName(SERIALIZED_NAME_MCC_LEVEL1)
  private String mccLevel1;

  public static final String SERIALIZED_NAME_MCC_LEVEL1_NAME = "mcc_level_1_name";
  @SerializedName(SERIALIZED_NAME_MCC_LEVEL1_NAME)
  private String mccLevel1Name;

  public static final String SERIALIZED_NAME_MCC_LEVEL2 = "mcc_level_2";
  @SerializedName(SERIALIZED_NAME_MCC_LEVEL2)
  private String mccLevel2;

  public static final String SERIALIZED_NAME_MCC_LEVEL2_NAME = "mcc_level_2_name";
  @SerializedName(SERIALIZED_NAME_MCC_LEVEL2_NAME)
  private String mccLevel2Name;

  public static final String SERIALIZED_NAME_MCC_REQUIREMENTS = "mcc_requirements";
  @SerializedName(SERIALIZED_NAME_MCC_REQUIREMENTS)
  private String mccRequirements;

  public static final String SERIALIZED_NAME_SPECIAL_QUAL_REQUIRED = "special_qual_required";
  @SerializedName(SERIALIZED_NAME_SPECIAL_QUAL_REQUIRED)
  private Boolean specialQualRequired;

  public MccQueryInfo() { 
  }

  public MccQueryInfo isSpecial(Boolean isSpecial) {
    
    this.isSpecial = isSpecial;
    return this;
  }

   /**
   * 是否特殊行业
   * @return isSpecial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否特殊行业")

  public Boolean getIsSpecial() {
    return isSpecial;
  }


  public void setIsSpecial(Boolean isSpecial) {
    this.isSpecial = isSpecial;
  }


  public MccQueryInfo mccLevel1(String mccLevel1) {
    
    this.mccLevel1 = mccLevel1;
    return this;
  }

   /**
   * 一级类目code
   * @return mccLevel1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A0001", value = "一级类目code")

  public String getMccLevel1() {
    return mccLevel1;
  }


  public void setMccLevel1(String mccLevel1) {
    this.mccLevel1 = mccLevel1;
  }


  public MccQueryInfo mccLevel1Name(String mccLevel1Name) {
    
    this.mccLevel1Name = mccLevel1Name;
    return this;
  }

   /**
   * 商户一级类目名称
   * @return mccLevel1Name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "商业生活服务", value = "商户一级类目名称")

  public String getMccLevel1Name() {
    return mccLevel1Name;
  }


  public void setMccLevel1Name(String mccLevel1Name) {
    this.mccLevel1Name = mccLevel1Name;
  }


  public MccQueryInfo mccLevel2(String mccLevel2) {
    
    this.mccLevel2 = mccLevel2;
    return this;
  }

   /**
   * 二级类目code
   * @return mccLevel2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "B0001", value = "二级类目code")

  public String getMccLevel2() {
    return mccLevel2;
  }


  public void setMccLevel2(String mccLevel2) {
    this.mccLevel2 = mccLevel2;
  }


  public MccQueryInfo mccLevel2Name(String mccLevel2Name) {
    
    this.mccLevel2Name = mccLevel2Name;
    return this;
  }

   /**
   * 二级类目名称
   * @return mccLevel2Name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "中式正餐", value = "二级类目名称")

  public String getMccLevel2Name() {
    return mccLevel2Name;
  }


  public void setMccLevel2Name(String mccLevel2Name) {
    this.mccLevel2Name = mccLevel2Name;
  }


  public MccQueryInfo mccRequirements(String mccRequirements) {
    
    this.mccRequirements = mccRequirements;
    return this;
  }

   /**
   * 特殊行业需要上传的资质
   * @return mccRequirements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "申请成为该行业商家，请提交：1. 营业执照经营范围包含公路的投资、建设、收费、养护、管理、高速公路开发经营及服务", value = "特殊行业需要上传的资质")

  public String getMccRequirements() {
    return mccRequirements;
  }


  public void setMccRequirements(String mccRequirements) {
    this.mccRequirements = mccRequirements;
  }


  public MccQueryInfo specialQualRequired(Boolean specialQualRequired) {
    
    this.specialQualRequired = specialQualRequired;
    return this;
  }

   /**
   * 是否需要特殊资质
   * @return specialQualRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "是否需要特殊资质")

  public Boolean getSpecialQualRequired() {
    return specialQualRequired;
  }


  public void setSpecialQualRequired(Boolean specialQualRequired) {
    this.specialQualRequired = specialQualRequired;
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
   * @return the MccQueryInfo instance itself
   */
  public MccQueryInfo putAdditionalProperty(String key, Object value) {
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
    MccQueryInfo mccQueryInfo = (MccQueryInfo) o;
    return Objects.equals(this.isSpecial, mccQueryInfo.isSpecial) &&
        Objects.equals(this.mccLevel1, mccQueryInfo.mccLevel1) &&
        Objects.equals(this.mccLevel1Name, mccQueryInfo.mccLevel1Name) &&
        Objects.equals(this.mccLevel2, mccQueryInfo.mccLevel2) &&
        Objects.equals(this.mccLevel2Name, mccQueryInfo.mccLevel2Name) &&
        Objects.equals(this.mccRequirements, mccQueryInfo.mccRequirements) &&
        Objects.equals(this.specialQualRequired, mccQueryInfo.specialQualRequired)&&
        Objects.equals(this.additionalProperties, mccQueryInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSpecial, mccLevel1, mccLevel1Name, mccLevel2, mccLevel2Name, mccRequirements, specialQualRequired, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MccQueryInfo {\n");
    sb.append("    isSpecial: ").append(toIndentedString(isSpecial)).append("\n");
    sb.append("    mccLevel1: ").append(toIndentedString(mccLevel1)).append("\n");
    sb.append("    mccLevel1Name: ").append(toIndentedString(mccLevel1Name)).append("\n");
    sb.append("    mccLevel2: ").append(toIndentedString(mccLevel2)).append("\n");
    sb.append("    mccLevel2Name: ").append(toIndentedString(mccLevel2Name)).append("\n");
    sb.append("    mccRequirements: ").append(toIndentedString(mccRequirements)).append("\n");
    sb.append("    specialQualRequired: ").append(toIndentedString(specialQualRequired)).append("\n");
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
    openapiFields.add("is_special");
    openapiFields.add("mcc_level_1");
    openapiFields.add("mcc_level_1_name");
    openapiFields.add("mcc_level_2");
    openapiFields.add("mcc_level_2_name");
    openapiFields.add("mcc_requirements");
    openapiFields.add("special_qual_required");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MccQueryInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MccQueryInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MccQueryInfo is not found in the empty JSON string", MccQueryInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("mcc_level_1") != null && !jsonObj.get("mcc_level_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mcc_level_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc_level_1").toString()));
      }
      if (jsonObj.get("mcc_level_1_name") != null && !jsonObj.get("mcc_level_1_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mcc_level_1_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc_level_1_name").toString()));
      }
      if (jsonObj.get("mcc_level_2") != null && !jsonObj.get("mcc_level_2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mcc_level_2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc_level_2").toString()));
      }
      if (jsonObj.get("mcc_level_2_name") != null && !jsonObj.get("mcc_level_2_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mcc_level_2_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc_level_2_name").toString()));
      }
      if (jsonObj.get("mcc_requirements") != null && !jsonObj.get("mcc_requirements").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mcc_requirements` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc_requirements").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MccQueryInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MccQueryInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MccQueryInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MccQueryInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<MccQueryInfo>() {
           @Override
           public void write(JsonWriter out, MccQueryInfo value) throws IOException {
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
           public MccQueryInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MccQueryInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MccQueryInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MccQueryInfo
  * @throws IOException if the JSON string is invalid with respect to MccQueryInfo
  */
  public static MccQueryInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MccQueryInfo.class);
  }

 /**
  * Convert an instance of MccQueryInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

