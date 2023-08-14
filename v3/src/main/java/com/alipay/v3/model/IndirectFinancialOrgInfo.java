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
 * IndirectFinancialOrgInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IndirectFinancialOrgInfo {
  public static final String SERIALIZED_NAME_FINANCIAL_ORG_CERT_IMG = "financial_org_cert_img";
  @SerializedName(SERIALIZED_NAME_FINANCIAL_ORG_CERT_IMG)
  private List<String> financialOrgCertImg = null;

  public static final String SERIALIZED_NAME_FINANCIAL_ORG_TYPE = "financial_org_type";
  @SerializedName(SERIALIZED_NAME_FINANCIAL_ORG_TYPE)
  private String financialOrgType;

  public IndirectFinancialOrgInfo() { 
  }

  public IndirectFinancialOrgInfo financialOrgCertImg(List<String> financialOrgCertImg) {
    
    this.financialOrgCertImg = financialOrgCertImg;
    return this;
  }

  public IndirectFinancialOrgInfo addFinancialOrgCertImgItem(String financialOrgCertImgItem) {
    if (this.financialOrgCertImg == null) {
      this.financialOrgCertImg = new ArrayList<>();
    }
    this.financialOrgCertImg.add(financialOrgCertImgItem);
    return this;
  }

   /**
   * 金融机构许可证图片，最多五张（使用图片上传接口）
   * @return financialOrgCertImg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"a5d373f6-3e79-405f-9993-fb7ea051c372.jpg\"]", value = "金融机构许可证图片，最多五张（使用图片上传接口）")

  public List<String> getFinancialOrgCertImg() {
    return financialOrgCertImg;
  }


  public void setFinancialOrgCertImg(List<String> financialOrgCertImg) {
    this.financialOrgCertImg = financialOrgCertImg;
  }


  public IndirectFinancialOrgInfo financialOrgType(String financialOrgType) {
    
    this.financialOrgType = financialOrgType;
    return this;
  }

   /**
   * 银行业(BANK)、支付机构(PAYMENT)、保险业(INSURANCE)、交易及结算类金融机构(SETTLE)、OTHER(OTHER)
   * @return financialOrgType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PAYMENT", value = "银行业(BANK)、支付机构(PAYMENT)、保险业(INSURANCE)、交易及结算类金融机构(SETTLE)、OTHER(OTHER)")

  public String getFinancialOrgType() {
    return financialOrgType;
  }


  public void setFinancialOrgType(String financialOrgType) {
    this.financialOrgType = financialOrgType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndirectFinancialOrgInfo indirectFinancialOrgInfo = (IndirectFinancialOrgInfo) o;
    return Objects.equals(this.financialOrgCertImg, indirectFinancialOrgInfo.financialOrgCertImg) &&
        Objects.equals(this.financialOrgType, indirectFinancialOrgInfo.financialOrgType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialOrgCertImg, financialOrgType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndirectFinancialOrgInfo {\n");
    sb.append("    financialOrgCertImg: ").append(toIndentedString(financialOrgCertImg)).append("\n");
    sb.append("    financialOrgType: ").append(toIndentedString(financialOrgType)).append("\n");
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
    openapiFields.add("financial_org_cert_img");
    openapiFields.add("financial_org_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IndirectFinancialOrgInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IndirectFinancialOrgInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IndirectFinancialOrgInfo is not found in the empty JSON string", IndirectFinancialOrgInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IndirectFinancialOrgInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IndirectFinancialOrgInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("financial_org_cert_img") != null && !jsonObj.get("financial_org_cert_img").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `financial_org_cert_img` to be an array in the JSON string but got `%s`", jsonObj.get("financial_org_cert_img").toString()));
      }
      if (jsonObj.get("financial_org_type") != null && !jsonObj.get("financial_org_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `financial_org_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("financial_org_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IndirectFinancialOrgInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IndirectFinancialOrgInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IndirectFinancialOrgInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IndirectFinancialOrgInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<IndirectFinancialOrgInfo>() {
           @Override
           public void write(JsonWriter out, IndirectFinancialOrgInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IndirectFinancialOrgInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IndirectFinancialOrgInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IndirectFinancialOrgInfo
  * @throws IOException if the JSON string is invalid with respect to IndirectFinancialOrgInfo
  */
  public static IndirectFinancialOrgInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IndirectFinancialOrgInfo.class);
  }

 /**
  * Convert an instance of IndirectFinancialOrgInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

