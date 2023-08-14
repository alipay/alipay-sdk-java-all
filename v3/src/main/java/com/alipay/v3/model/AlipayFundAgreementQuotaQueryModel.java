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
 * AlipayFundAgreementQuotaQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundAgreementQuotaQueryModel {
  public static final String SERIALIZED_NAME_AGREEMENT_NO_LIST = "agreement_no_list";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO_LIST)
  private List<String> agreementNoList = null;

  public static final String SERIALIZED_NAME_BIZ_SCENE = "biz_scene";
  @SerializedName(SERIALIZED_NAME_BIZ_SCENE)
  private String bizScene;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public AlipayFundAgreementQuotaQueryModel() { 
  }

  public AlipayFundAgreementQuotaQueryModel agreementNoList(List<String> agreementNoList) {
    
    this.agreementNoList = agreementNoList;
    return this;
  }

  public AlipayFundAgreementQuotaQueryModel addAgreementNoListItem(String agreementNoListItem) {
    if (this.agreementNoList == null) {
      this.agreementNoList = new ArrayList<>();
    }
    this.agreementNoList.add(agreementNoListItem);
    return this;
  }

   /**
   * 授权协议号
   * @return agreementNoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"20205321001042231004\"]", value = "授权协议号")

  public List<String> getAgreementNoList() {
    return agreementNoList;
  }


  public void setAgreementNoList(List<String> agreementNoList) {
    this.agreementNoList = agreementNoList;
  }


  public AlipayFundAgreementQuotaQueryModel bizScene(String bizScene) {
    
    this.bizScene = bizScene;
    return this;
  }

   /**
   * 场景码，非固定值，使用的对应的资金场景码保持一致
   * @return bizScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENTRUST_TRANSFER", value = "场景码，非固定值，使用的对应的资金场景码保持一致")

  public String getBizScene() {
    return bizScene;
  }


  public void setBizScene(String bizScene) {
    this.bizScene = bizScene;
  }


  public AlipayFundAgreementQuotaQueryModel productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * 额度产品码，非固定值，使用的对应的资金产品码保持一致
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BATCH_API_TO_ACC_NO_PWD", value = "额度产品码，非固定值，使用的对应的资金产品码保持一致")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundAgreementQuotaQueryModel alipayFundAgreementQuotaQueryModel = (AlipayFundAgreementQuotaQueryModel) o;
    return Objects.equals(this.agreementNoList, alipayFundAgreementQuotaQueryModel.agreementNoList) &&
        Objects.equals(this.bizScene, alipayFundAgreementQuotaQueryModel.bizScene) &&
        Objects.equals(this.productCode, alipayFundAgreementQuotaQueryModel.productCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementNoList, bizScene, productCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundAgreementQuotaQueryModel {\n");
    sb.append("    agreementNoList: ").append(toIndentedString(agreementNoList)).append("\n");
    sb.append("    bizScene: ").append(toIndentedString(bizScene)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
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
    openapiFields.add("agreement_no_list");
    openapiFields.add("biz_scene");
    openapiFields.add("product_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundAgreementQuotaQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundAgreementQuotaQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundAgreementQuotaQueryModel is not found in the empty JSON string", AlipayFundAgreementQuotaQueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundAgreementQuotaQueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundAgreementQuotaQueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("agreement_no_list") != null && !jsonObj.get("agreement_no_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no_list` to be an array in the JSON string but got `%s`", jsonObj.get("agreement_no_list").toString()));
      }
      if (jsonObj.get("biz_scene") != null && !jsonObj.get("biz_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_scene").toString()));
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundAgreementQuotaQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundAgreementQuotaQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundAgreementQuotaQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundAgreementQuotaQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundAgreementQuotaQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundAgreementQuotaQueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundAgreementQuotaQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundAgreementQuotaQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundAgreementQuotaQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundAgreementQuotaQueryModel
  */
  public static AlipayFundAgreementQuotaQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundAgreementQuotaQueryModel.class);
  }

 /**
  * Convert an instance of AlipayFundAgreementQuotaQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

