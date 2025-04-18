/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2025-03-05
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
 * BkAgentReqInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BkAgentReqInfo {
  public static final String SERIALIZED_NAME_ACQ_CODE = "acq_code";
  @SerializedName(SERIALIZED_NAME_ACQ_CODE)
  private String acqCode;

  public static final String SERIALIZED_NAME_DEVICE_TYPE = "device_type";
  @SerializedName(SERIALIZED_NAME_DEVICE_TYPE)
  private String deviceType;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_MERCH_CODE = "merch_code";
  @SerializedName(SERIALIZED_NAME_MERCH_CODE)
  private String merchCode;

  public static final String SERIALIZED_NAME_SERIAL_NUM = "serial_num";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUM)
  private String serialNum;

  public BkAgentReqInfo() { 
  }

  public BkAgentReqInfo acqCode(String acqCode) {
    
    this.acqCode = acqCode;
    return this;
  }

   /**
   * 收单机构在清算组织登记或分配的机构代码
   * @return acqCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "收单机构在清算组织登记或分配的机构代码")

  public String getAcqCode() {
    return acqCode;
  }


  public void setAcqCode(String acqCode) {
    this.acqCode = acqCode;
  }


  public BkAgentReqInfo deviceType(String deviceType) {
    
    this.deviceType = deviceType;
    return this;
  }

   /**
   * 终端设备类型，受理方可参考终端注册时的设备类型填写。
   * @return deviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "终端设备类型，受理方可参考终端注册时的设备类型填写。")

  public String getDeviceType() {
    return deviceType;
  }


  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }


  public BkAgentReqInfo location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * 终端设备实时经纬度信息，格式为纬度/经度，+表示北纬、东经，-表示南纬、西经。
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "终端设备实时经纬度信息，格式为纬度/经度，+表示北纬、东经，-表示南纬、西经。")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public BkAgentReqInfo merchCode(String merchCode) {
    
    this.merchCode = merchCode;
    return this;
  }

   /**
   * 收单机构在清算组织登记的商户编码
   * @return merchCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "收单机构在清算组织登记的商户编码")

  public String getMerchCode() {
    return merchCode;
  }


  public void setMerchCode(String merchCode) {
    this.merchCode = merchCode;
  }


  public BkAgentReqInfo serialNum(String serialNum) {
    
    this.serialNum = serialNum;
    return this;
  }

   /**
   * 终端类型填写为 02、 03、04、05、06、08、09 或 10 时，必 须填写终端序列号。
   * @return serialNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "终端类型填写为 02、 03、04、05、06、08、09 或 10 时，必 须填写终端序列号。")

  public String getSerialNum() {
    return serialNum;
  }


  public void setSerialNum(String serialNum) {
    this.serialNum = serialNum;
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
   * @return the BkAgentReqInfo instance itself
   */
  public BkAgentReqInfo putAdditionalProperty(String key, Object value) {
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
    BkAgentReqInfo bkAgentReqInfo = (BkAgentReqInfo) o;
    return Objects.equals(this.acqCode, bkAgentReqInfo.acqCode) &&
        Objects.equals(this.deviceType, bkAgentReqInfo.deviceType) &&
        Objects.equals(this.location, bkAgentReqInfo.location) &&
        Objects.equals(this.merchCode, bkAgentReqInfo.merchCode) &&
        Objects.equals(this.serialNum, bkAgentReqInfo.serialNum)&&
        Objects.equals(this.additionalProperties, bkAgentReqInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acqCode, deviceType, location, merchCode, serialNum, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BkAgentReqInfo {\n");
    sb.append("    acqCode: ").append(toIndentedString(acqCode)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    merchCode: ").append(toIndentedString(merchCode)).append("\n");
    sb.append("    serialNum: ").append(toIndentedString(serialNum)).append("\n");
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
    openapiFields.add("acq_code");
    openapiFields.add("device_type");
    openapiFields.add("location");
    openapiFields.add("merch_code");
    openapiFields.add("serial_num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BkAgentReqInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BkAgentReqInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BkAgentReqInfo is not found in the empty JSON string", BkAgentReqInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("acq_code") != null && !jsonObj.get("acq_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acq_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acq_code").toString()));
      }
      if (jsonObj.get("device_type") != null && !jsonObj.get("device_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_type").toString()));
      }
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if (jsonObj.get("merch_code") != null && !jsonObj.get("merch_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merch_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merch_code").toString()));
      }
      if (jsonObj.get("serial_num") != null && !jsonObj.get("serial_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serial_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serial_num").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BkAgentReqInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BkAgentReqInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BkAgentReqInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BkAgentReqInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BkAgentReqInfo>() {
           @Override
           public void write(JsonWriter out, BkAgentReqInfo value) throws IOException {
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
           public BkAgentReqInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BkAgentReqInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BkAgentReqInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BkAgentReqInfo
  * @throws IOException if the JSON string is invalid with respect to BkAgentReqInfo
  */
  public static BkAgentReqInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BkAgentReqInfo.class);
  }

 /**
  * Convert an instance of BkAgentReqInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

