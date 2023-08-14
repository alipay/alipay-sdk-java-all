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
 * VoucherGoodsQuantitySpecificationInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherGoodsQuantitySpecificationInfo {
  public static final String SERIALIZED_NAME_DIRECTIONAL_TYPE = "directional_type";
  @SerializedName(SERIALIZED_NAME_DIRECTIONAL_TYPE)
  private String directionalType;

  public static final String SERIALIZED_NAME_SPECIFICATION_QUANTITY = "specification_quantity";
  @SerializedName(SERIALIZED_NAME_SPECIFICATION_QUANTITY)
  private Integer specificationQuantity;

  public static final String SERIALIZED_NAME_SPECIFICATION_UNIT = "specification_unit";
  @SerializedName(SERIALIZED_NAME_SPECIFICATION_UNIT)
  private String specificationUnit;

  public VoucherGoodsQuantitySpecificationInfo() { 
  }

  public VoucherGoodsQuantitySpecificationInfo directionalType(String directionalType) {
    
    this.directionalType = directionalType;
    return this;
  }

   /**
   * 定向类型用于规格设置，比如：FIX 表示 固定满X件，APPOINT 表示指定第N件
   * @return directionalType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "定向类型用于规格设置，比如：FIX 表示 固定满X件，APPOINT 表示指定第N件")

  public String getDirectionalType() {
    return directionalType;
  }


  public void setDirectionalType(String directionalType) {
    this.directionalType = directionalType;
  }


  public VoucherGoodsQuantitySpecificationInfo specificationQuantity(Integer specificationQuantity) {
    
    this.specificationQuantity = specificationQuantity;
    return this;
  }

   /**
   * 数量
   * @return specificationQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "数量")

  public Integer getSpecificationQuantity() {
    return specificationQuantity;
  }


  public void setSpecificationQuantity(Integer specificationQuantity) {
    this.specificationQuantity = specificationQuantity;
  }


  public VoucherGoodsQuantitySpecificationInfo specificationUnit(String specificationUnit) {
    
    this.specificationUnit = specificationUnit;
    return this;
  }

   /**
   * 单位
   * @return specificationUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单位")

  public String getSpecificationUnit() {
    return specificationUnit;
  }


  public void setSpecificationUnit(String specificationUnit) {
    this.specificationUnit = specificationUnit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherGoodsQuantitySpecificationInfo voucherGoodsQuantitySpecificationInfo = (VoucherGoodsQuantitySpecificationInfo) o;
    return Objects.equals(this.directionalType, voucherGoodsQuantitySpecificationInfo.directionalType) &&
        Objects.equals(this.specificationQuantity, voucherGoodsQuantitySpecificationInfo.specificationQuantity) &&
        Objects.equals(this.specificationUnit, voucherGoodsQuantitySpecificationInfo.specificationUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directionalType, specificationQuantity, specificationUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherGoodsQuantitySpecificationInfo {\n");
    sb.append("    directionalType: ").append(toIndentedString(directionalType)).append("\n");
    sb.append("    specificationQuantity: ").append(toIndentedString(specificationQuantity)).append("\n");
    sb.append("    specificationUnit: ").append(toIndentedString(specificationUnit)).append("\n");
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
    openapiFields.add("directional_type");
    openapiFields.add("specification_quantity");
    openapiFields.add("specification_unit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherGoodsQuantitySpecificationInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherGoodsQuantitySpecificationInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherGoodsQuantitySpecificationInfo is not found in the empty JSON string", VoucherGoodsQuantitySpecificationInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherGoodsQuantitySpecificationInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherGoodsQuantitySpecificationInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("directional_type") != null && !jsonObj.get("directional_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `directional_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("directional_type").toString()));
      }
      if (jsonObj.get("specification_unit") != null && !jsonObj.get("specification_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specification_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specification_unit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherGoodsQuantitySpecificationInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherGoodsQuantitySpecificationInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherGoodsQuantitySpecificationInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherGoodsQuantitySpecificationInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherGoodsQuantitySpecificationInfo>() {
           @Override
           public void write(JsonWriter out, VoucherGoodsQuantitySpecificationInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherGoodsQuantitySpecificationInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherGoodsQuantitySpecificationInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherGoodsQuantitySpecificationInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherGoodsQuantitySpecificationInfo
  */
  public static VoucherGoodsQuantitySpecificationInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherGoodsQuantitySpecificationInfo.class);
  }

 /**
  * Convert an instance of VoucherGoodsQuantitySpecificationInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

