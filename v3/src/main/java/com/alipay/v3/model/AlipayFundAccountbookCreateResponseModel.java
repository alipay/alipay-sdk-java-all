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
import com.alipay.v3.model.ExtCardInfo;
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
 * AlipayFundAccountbookCreateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundAccountbookCreateResponseModel {
  public static final String SERIALIZED_NAME_ACCOUNT_BOOK_ID = "account_book_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_BOOK_ID)
  private String accountBookId;

  public static final String SERIALIZED_NAME_EXT_CARD_INFO = "ext_card_info";
  @SerializedName(SERIALIZED_NAME_EXT_CARD_INFO)
  private ExtCardInfo extCardInfo;

  public AlipayFundAccountbookCreateResponseModel() { 
  }

  public AlipayFundAccountbookCreateResponseModel accountBookId(String accountBookId) {
    
    this.accountBookId = accountBookId;
    return this;
  }

   /**
   * 开通的资金记账本id
   * @return accountBookId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123412341234", value = "开通的资金记账本id")

  public String getAccountBookId() {
    return accountBookId;
  }


  public void setAccountBookId(String accountBookId) {
    this.accountBookId = accountBookId;
  }


  public AlipayFundAccountbookCreateResponseModel extCardInfo(ExtCardInfo extCardInfo) {
    
    this.extCardInfo = extCardInfo;
    return this;
  }

   /**
   * Get extCardInfo
   * @return extCardInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExtCardInfo getExtCardInfo() {
    return extCardInfo;
  }


  public void setExtCardInfo(ExtCardInfo extCardInfo) {
    this.extCardInfo = extCardInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundAccountbookCreateResponseModel alipayFundAccountbookCreateResponseModel = (AlipayFundAccountbookCreateResponseModel) o;
    return Objects.equals(this.accountBookId, alipayFundAccountbookCreateResponseModel.accountBookId) &&
        Objects.equals(this.extCardInfo, alipayFundAccountbookCreateResponseModel.extCardInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountBookId, extCardInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundAccountbookCreateResponseModel {\n");
    sb.append("    accountBookId: ").append(toIndentedString(accountBookId)).append("\n");
    sb.append("    extCardInfo: ").append(toIndentedString(extCardInfo)).append("\n");
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
    openapiFields.add("account_book_id");
    openapiFields.add("ext_card_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundAccountbookCreateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundAccountbookCreateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundAccountbookCreateResponseModel is not found in the empty JSON string", AlipayFundAccountbookCreateResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundAccountbookCreateResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundAccountbookCreateResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_book_id") != null && !jsonObj.get("account_book_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_book_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_book_id").toString()));
      }
      // validate the optional field `ext_card_info`
      if (jsonObj.getAsJsonObject("ext_card_info") != null) {
        ExtCardInfo.validateJsonObject(jsonObj.getAsJsonObject("ext_card_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundAccountbookCreateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundAccountbookCreateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundAccountbookCreateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundAccountbookCreateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundAccountbookCreateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundAccountbookCreateResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundAccountbookCreateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundAccountbookCreateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundAccountbookCreateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundAccountbookCreateResponseModel
  */
  public static AlipayFundAccountbookCreateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundAccountbookCreateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundAccountbookCreateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

