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
 * AlipayMarketingCardBenefitDeleteResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingCardBenefitDeleteResponseModel {
  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Boolean result;

  public AlipayMarketingCardBenefitDeleteResponseModel() { 
  }

  public AlipayMarketingCardBenefitDeleteResponseModel result(Boolean result) {
    
    this.result = result;
    return this;
  }

   /**
   * 权益删除结果；true成功，false失败
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "权益删除结果；true成功，false失败")

  public Boolean getResult() {
    return result;
  }


  public void setResult(Boolean result) {
    this.result = result;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingCardBenefitDeleteResponseModel alipayMarketingCardBenefitDeleteResponseModel = (AlipayMarketingCardBenefitDeleteResponseModel) o;
    return Objects.equals(this.result, alipayMarketingCardBenefitDeleteResponseModel.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingCardBenefitDeleteResponseModel {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
    openapiFields.add("result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingCardBenefitDeleteResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingCardBenefitDeleteResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingCardBenefitDeleteResponseModel is not found in the empty JSON string", AlipayMarketingCardBenefitDeleteResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingCardBenefitDeleteResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingCardBenefitDeleteResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingCardBenefitDeleteResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingCardBenefitDeleteResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingCardBenefitDeleteResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingCardBenefitDeleteResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingCardBenefitDeleteResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingCardBenefitDeleteResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingCardBenefitDeleteResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingCardBenefitDeleteResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingCardBenefitDeleteResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingCardBenefitDeleteResponseModel
  */
  public static AlipayMarketingCardBenefitDeleteResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingCardBenefitDeleteResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingCardBenefitDeleteResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

