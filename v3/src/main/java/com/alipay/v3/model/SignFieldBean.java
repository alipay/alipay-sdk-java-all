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
import com.alipay.v3.model.SignerBean;
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
 * SignFieldBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SignFieldBean {
  public static final String SERIALIZED_NAME_SIGN_FIELD_TYPE = "sign_field_type";
  @SerializedName(SERIALIZED_NAME_SIGN_FIELD_TYPE)
  private String signFieldType;

  public static final String SERIALIZED_NAME_SIGNER = "signer";
  @SerializedName(SERIALIZED_NAME_SIGNER)
  private SignerBean signer;

  public static final String SERIALIZED_NAME_STRUCT_KEY = "struct_key";
  @SerializedName(SERIALIZED_NAME_STRUCT_KEY)
  private String structKey;

  public SignFieldBean() { 
  }

  public SignFieldBean signFieldType(String signFieldType) {
    
    this.signFieldType = signFieldType;
    return this;
  }

   /**
   * 签署类型：  platform-平台自动签：无需指定签署人。创建流程后，系统将自动盖上商户的默认企业印章。  person-个人签署：需要指定签署人个人信息。创建流程后，需通过签署插件完成签署。 org-企业签署：需要指定签署企业信息与经办人个人信息。创建流程后，需经办人代企业完成签署。（企业暂不支持插件签署，可通过获取签署地址接口获取企业签署地址）
   * @return signFieldType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "person", value = "签署类型：  platform-平台自动签：无需指定签署人。创建流程后，系统将自动盖上商户的默认企业印章。  person-个人签署：需要指定签署人个人信息。创建流程后，需通过签署插件完成签署。 org-企业签署：需要指定签署企业信息与经办人个人信息。创建流程后，需经办人代企业完成签署。（企业暂不支持插件签署，可通过获取签署地址接口获取企业签署地址）")

  public String getSignFieldType() {
    return signFieldType;
  }


  public void setSignFieldType(String signFieldType) {
    this.signFieldType = signFieldType;
  }


  public SignFieldBean signer(SignerBean signer) {
    
    this.signer = signer;
    return this;
  }

   /**
   * Get signer
   * @return signer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignerBean getSigner() {
    return signer;
  }


  public void setSigner(SignerBean signer) {
    this.signer = signer;
  }


  public SignFieldBean structKey(String structKey) {
    
    this.structKey = structKey;
    return this;
  }

   /**
   * 签署区key值
   * @return structKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "signer1", value = "签署区key值")

  public String getStructKey() {
    return structKey;
  }


  public void setStructKey(String structKey) {
    this.structKey = structKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignFieldBean signFieldBean = (SignFieldBean) o;
    return Objects.equals(this.signFieldType, signFieldBean.signFieldType) &&
        Objects.equals(this.signer, signFieldBean.signer) &&
        Objects.equals(this.structKey, signFieldBean.structKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signFieldType, signer, structKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignFieldBean {\n");
    sb.append("    signFieldType: ").append(toIndentedString(signFieldType)).append("\n");
    sb.append("    signer: ").append(toIndentedString(signer)).append("\n");
    sb.append("    structKey: ").append(toIndentedString(structKey)).append("\n");
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
    openapiFields.add("sign_field_type");
    openapiFields.add("signer");
    openapiFields.add("struct_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SignFieldBean
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SignFieldBean.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SignFieldBean is not found in the empty JSON string", SignFieldBean.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SignFieldBean.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SignFieldBean` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("sign_field_type") != null && !jsonObj.get("sign_field_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_field_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_field_type").toString()));
      }
      // validate the optional field `signer`
      if (jsonObj.getAsJsonObject("signer") != null) {
        SignerBean.validateJsonObject(jsonObj.getAsJsonObject("signer"));
      }
      if (jsonObj.get("struct_key") != null && !jsonObj.get("struct_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `struct_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("struct_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SignFieldBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SignFieldBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SignFieldBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SignFieldBean.class));

       return (TypeAdapter<T>) new TypeAdapter<SignFieldBean>() {
           @Override
           public void write(JsonWriter out, SignFieldBean value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SignFieldBean read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SignFieldBean given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SignFieldBean
  * @throws IOException if the JSON string is invalid with respect to SignFieldBean
  */
  public static SignFieldBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SignFieldBean.class);
  }

 /**
  * Convert an instance of SignFieldBean to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

