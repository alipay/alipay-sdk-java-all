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
 * AlipayOpenAppServiceQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAppServiceQueryResponseModel {
  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason;

  public static final String SERIALIZED_NAME_SERVICE_CODE = "service_code";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODE)
  private String serviceCode;

  public static final String SERIALIZED_NAME_SERVICE_XML = "service_xml";
  @SerializedName(SERIALIZED_NAME_SERVICE_XML)
  private String serviceXml;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TEMPLATE_TYPE = "template_type";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TYPE)
  private String templateType;

  public AlipayOpenAppServiceQueryResponseModel() { 
  }

  public AlipayOpenAppServiceQueryResponseModel rejectReason(String rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * 驳回理由
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "不符合运营规范", value = "驳回理由")

  public String getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }


  public AlipayOpenAppServiceQueryResponseModel serviceCode(String serviceCode) {
    
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * 服务id
   * @return serviceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "s1111", value = "服务id")

  public String getServiceCode() {
    return serviceCode;
  }


  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }


  public AlipayOpenAppServiceQueryResponseModel serviceXml(String serviceXml) {
    
    this.serviceXml = serviceXml;
    return this;
  }

   /**
   * 服务描述xml格式
   * @return serviceXml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<?xml version=\"1.0\" encoding=\"utf-8\"?</serviceSchema>...<serviceSchema>", value = "服务描述xml格式")

  public String getServiceXml() {
    return serviceXml;
  }


  public void setServiceXml(String serviceXml) {
    this.serviceXml = serviceXml;
  }


  public AlipayOpenAppServiceQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 服务状态，EDITING(编辑中)/AUDITING(审核中)/AUDIT_REJECT(审核驳回)/PROMOTION(可推广)/STOP_PROMOTION(停止推广)/INVALID(失效)/PUNISHED(处罚)
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUDITING", value = "服务状态，EDITING(编辑中)/AUDITING(审核中)/AUDIT_REJECT(审核驳回)/PROMOTION(可推广)/STOP_PROMOTION(停止推广)/INVALID(失效)/PUNISHED(处罚)")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayOpenAppServiceQueryResponseModel templateType(String templateType) {
    
    this.templateType = templateType;
    return this;
  }

   /**
   * 服务模板类型
   * @return templateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT", value = "服务模板类型")

  public String getTemplateType() {
    return templateType;
  }


  public void setTemplateType(String templateType) {
    this.templateType = templateType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenAppServiceQueryResponseModel alipayOpenAppServiceQueryResponseModel = (AlipayOpenAppServiceQueryResponseModel) o;
    return Objects.equals(this.rejectReason, alipayOpenAppServiceQueryResponseModel.rejectReason) &&
        Objects.equals(this.serviceCode, alipayOpenAppServiceQueryResponseModel.serviceCode) &&
        Objects.equals(this.serviceXml, alipayOpenAppServiceQueryResponseModel.serviceXml) &&
        Objects.equals(this.status, alipayOpenAppServiceQueryResponseModel.status) &&
        Objects.equals(this.templateType, alipayOpenAppServiceQueryResponseModel.templateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectReason, serviceCode, serviceXml, status, templateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAppServiceQueryResponseModel {\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    serviceXml: ").append(toIndentedString(serviceXml)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
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
    openapiFields.add("reject_reason");
    openapiFields.add("service_code");
    openapiFields.add("service_xml");
    openapiFields.add("status");
    openapiFields.add("template_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAppServiceQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAppServiceQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAppServiceQueryResponseModel is not found in the empty JSON string", AlipayOpenAppServiceQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenAppServiceQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenAppServiceQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("reject_reason") != null && !jsonObj.get("reject_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reject_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reject_reason").toString()));
      }
      if (jsonObj.get("service_code") != null && !jsonObj.get("service_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_code").toString()));
      }
      if (jsonObj.get("service_xml") != null && !jsonObj.get("service_xml").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_xml` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_xml").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("template_type") != null && !jsonObj.get("template_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAppServiceQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAppServiceQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAppServiceQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAppServiceQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAppServiceQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAppServiceQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenAppServiceQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenAppServiceQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAppServiceQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAppServiceQueryResponseModel
  */
  public static AlipayOpenAppServiceQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAppServiceQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAppServiceQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

