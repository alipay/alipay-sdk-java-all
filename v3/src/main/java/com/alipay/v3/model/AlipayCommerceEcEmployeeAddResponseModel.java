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
 * AlipayCommerceEcEmployeeAddResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceEcEmployeeAddResponseModel {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_SIGN_URL = "sign_url";
  @SerializedName(SERIALIZED_NAME_SIGN_URL)
  private String signUrl;

  public AlipayCommerceEcEmployeeAddResponseModel() { 
  }

  public AlipayCommerceEcEmployeeAddResponseModel employeeId(String employeeId) {
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * 员工id
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2288033000090876", value = "员工id")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }


  public AlipayCommerceEcEmployeeAddResponseModel signUrl(String signUrl) {
    
    this.signUrl = signUrl;
    return this;
  }

   /**
   * 资金代付签约链接 1.员工未绑支付宝，拉起员工绑定页面 2.员工已绑支付宝，拉起资金签约页面
   * @return signUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://ur.alipay.com/3I2tPbLkAiktIoqe2dseZUzT", value = "资金代付签约链接 1.员工未绑支付宝，拉起员工绑定页面 2.员工已绑支付宝，拉起资金签约页面")

  public String getSignUrl() {
    return signUrl;
  }


  public void setSignUrl(String signUrl) {
    this.signUrl = signUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceEcEmployeeAddResponseModel alipayCommerceEcEmployeeAddResponseModel = (AlipayCommerceEcEmployeeAddResponseModel) o;
    return Objects.equals(this.employeeId, alipayCommerceEcEmployeeAddResponseModel.employeeId) &&
        Objects.equals(this.signUrl, alipayCommerceEcEmployeeAddResponseModel.signUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, signUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceEcEmployeeAddResponseModel {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    signUrl: ").append(toIndentedString(signUrl)).append("\n");
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
    openapiFields.add("employee_id");
    openapiFields.add("sign_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceEcEmployeeAddResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceEcEmployeeAddResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceEcEmployeeAddResponseModel is not found in the empty JSON string", AlipayCommerceEcEmployeeAddResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceEcEmployeeAddResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceEcEmployeeAddResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("employee_id") != null && !jsonObj.get("employee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_id").toString()));
      }
      if (jsonObj.get("sign_url") != null && !jsonObj.get("sign_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceEcEmployeeAddResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceEcEmployeeAddResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceEcEmployeeAddResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceEcEmployeeAddResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceEcEmployeeAddResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceEcEmployeeAddResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceEcEmployeeAddResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceEcEmployeeAddResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceEcEmployeeAddResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceEcEmployeeAddResponseModel
  */
  public static AlipayCommerceEcEmployeeAddResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceEcEmployeeAddResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceEcEmployeeAddResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

