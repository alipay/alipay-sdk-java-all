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
import com.alipay.v3.model.ActivityBaseInfo;
import com.alipay.v3.model.VoucherAvailableScopeInfo;
import com.alipay.v3.model.VoucherDeductInfo;
import com.alipay.v3.model.VoucherDisplayPatternInfo;
import com.alipay.v3.model.VoucherSendModeInfo;
import com.alipay.v3.model.VoucherUseRuleInfo;
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
 * VoucherPackageActivityInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherPackageActivityInfo {
  public static final String SERIALIZED_NAME_ACTIVITY_BASE_INFO = "activity_base_info";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_BASE_INFO)
  private ActivityBaseInfo activityBaseInfo;

  public static final String SERIALIZED_NAME_VOUCHER_AVAILABLE_SCOPE_INFO = "voucher_available_scope_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_AVAILABLE_SCOPE_INFO)
  private VoucherAvailableScopeInfo voucherAvailableScopeInfo;

  public static final String SERIALIZED_NAME_VOUCHER_DEDUCT_INFO = "voucher_deduct_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DEDUCT_INFO)
  private VoucherDeductInfo voucherDeductInfo;

  public static final String SERIALIZED_NAME_VOUCHER_DISPLAY_PATTERN_INFO = "voucher_display_pattern_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DISPLAY_PATTERN_INFO)
  private VoucherDisplayPatternInfo voucherDisplayPatternInfo;

  public static final String SERIALIZED_NAME_VOUCHER_SEND_MODE_INFO = "voucher_send_mode_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_SEND_MODE_INFO)
  private VoucherSendModeInfo voucherSendModeInfo;

  public static final String SERIALIZED_NAME_VOUCHER_USE_RULE_INFO = "voucher_use_rule_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_RULE_INFO)
  private VoucherUseRuleInfo voucherUseRuleInfo;

  public VoucherPackageActivityInfo() { 
  }

  public VoucherPackageActivityInfo activityBaseInfo(ActivityBaseInfo activityBaseInfo) {
    
    this.activityBaseInfo = activityBaseInfo;
    return this;
  }

   /**
   * Get activityBaseInfo
   * @return activityBaseInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ActivityBaseInfo getActivityBaseInfo() {
    return activityBaseInfo;
  }


  public void setActivityBaseInfo(ActivityBaseInfo activityBaseInfo) {
    this.activityBaseInfo = activityBaseInfo;
  }


  public VoucherPackageActivityInfo voucherAvailableScopeInfo(VoucherAvailableScopeInfo voucherAvailableScopeInfo) {
    
    this.voucherAvailableScopeInfo = voucherAvailableScopeInfo;
    return this;
  }

   /**
   * Get voucherAvailableScopeInfo
   * @return voucherAvailableScopeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherAvailableScopeInfo getVoucherAvailableScopeInfo() {
    return voucherAvailableScopeInfo;
  }


  public void setVoucherAvailableScopeInfo(VoucherAvailableScopeInfo voucherAvailableScopeInfo) {
    this.voucherAvailableScopeInfo = voucherAvailableScopeInfo;
  }


  public VoucherPackageActivityInfo voucherDeductInfo(VoucherDeductInfo voucherDeductInfo) {
    
    this.voucherDeductInfo = voucherDeductInfo;
    return this;
  }

   /**
   * Get voucherDeductInfo
   * @return voucherDeductInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherDeductInfo getVoucherDeductInfo() {
    return voucherDeductInfo;
  }


  public void setVoucherDeductInfo(VoucherDeductInfo voucherDeductInfo) {
    this.voucherDeductInfo = voucherDeductInfo;
  }


  public VoucherPackageActivityInfo voucherDisplayPatternInfo(VoucherDisplayPatternInfo voucherDisplayPatternInfo) {
    
    this.voucherDisplayPatternInfo = voucherDisplayPatternInfo;
    return this;
  }

   /**
   * Get voucherDisplayPatternInfo
   * @return voucherDisplayPatternInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherDisplayPatternInfo getVoucherDisplayPatternInfo() {
    return voucherDisplayPatternInfo;
  }


  public void setVoucherDisplayPatternInfo(VoucherDisplayPatternInfo voucherDisplayPatternInfo) {
    this.voucherDisplayPatternInfo = voucherDisplayPatternInfo;
  }


  public VoucherPackageActivityInfo voucherSendModeInfo(VoucherSendModeInfo voucherSendModeInfo) {
    
    this.voucherSendModeInfo = voucherSendModeInfo;
    return this;
  }

   /**
   * Get voucherSendModeInfo
   * @return voucherSendModeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherSendModeInfo getVoucherSendModeInfo() {
    return voucherSendModeInfo;
  }


  public void setVoucherSendModeInfo(VoucherSendModeInfo voucherSendModeInfo) {
    this.voucherSendModeInfo = voucherSendModeInfo;
  }


  public VoucherPackageActivityInfo voucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
    
    this.voucherUseRuleInfo = voucherUseRuleInfo;
    return this;
  }

   /**
   * Get voucherUseRuleInfo
   * @return voucherUseRuleInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherUseRuleInfo getVoucherUseRuleInfo() {
    return voucherUseRuleInfo;
  }


  public void setVoucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
    this.voucherUseRuleInfo = voucherUseRuleInfo;
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
   * @return the VoucherPackageActivityInfo instance itself
   */
  public VoucherPackageActivityInfo putAdditionalProperty(String key, Object value) {
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
    VoucherPackageActivityInfo voucherPackageActivityInfo = (VoucherPackageActivityInfo) o;
    return Objects.equals(this.activityBaseInfo, voucherPackageActivityInfo.activityBaseInfo) &&
        Objects.equals(this.voucherAvailableScopeInfo, voucherPackageActivityInfo.voucherAvailableScopeInfo) &&
        Objects.equals(this.voucherDeductInfo, voucherPackageActivityInfo.voucherDeductInfo) &&
        Objects.equals(this.voucherDisplayPatternInfo, voucherPackageActivityInfo.voucherDisplayPatternInfo) &&
        Objects.equals(this.voucherSendModeInfo, voucherPackageActivityInfo.voucherSendModeInfo) &&
        Objects.equals(this.voucherUseRuleInfo, voucherPackageActivityInfo.voucherUseRuleInfo)&&
        Objects.equals(this.additionalProperties, voucherPackageActivityInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityBaseInfo, voucherAvailableScopeInfo, voucherDeductInfo, voucherDisplayPatternInfo, voucherSendModeInfo, voucherUseRuleInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherPackageActivityInfo {\n");
    sb.append("    activityBaseInfo: ").append(toIndentedString(activityBaseInfo)).append("\n");
    sb.append("    voucherAvailableScopeInfo: ").append(toIndentedString(voucherAvailableScopeInfo)).append("\n");
    sb.append("    voucherDeductInfo: ").append(toIndentedString(voucherDeductInfo)).append("\n");
    sb.append("    voucherDisplayPatternInfo: ").append(toIndentedString(voucherDisplayPatternInfo)).append("\n");
    sb.append("    voucherSendModeInfo: ").append(toIndentedString(voucherSendModeInfo)).append("\n");
    sb.append("    voucherUseRuleInfo: ").append(toIndentedString(voucherUseRuleInfo)).append("\n");
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
    openapiFields.add("activity_base_info");
    openapiFields.add("voucher_available_scope_info");
    openapiFields.add("voucher_deduct_info");
    openapiFields.add("voucher_display_pattern_info");
    openapiFields.add("voucher_send_mode_info");
    openapiFields.add("voucher_use_rule_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherPackageActivityInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherPackageActivityInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherPackageActivityInfo is not found in the empty JSON string", VoucherPackageActivityInfo.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `activity_base_info`
      if (jsonObj.getAsJsonObject("activity_base_info") != null) {
        ActivityBaseInfo.validateJsonObject(jsonObj.getAsJsonObject("activity_base_info"));
      }
      // validate the optional field `voucher_available_scope_info`
      if (jsonObj.getAsJsonObject("voucher_available_scope_info") != null) {
        VoucherAvailableScopeInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_available_scope_info"));
      }
      // validate the optional field `voucher_deduct_info`
      if (jsonObj.getAsJsonObject("voucher_deduct_info") != null) {
        VoucherDeductInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_deduct_info"));
      }
      // validate the optional field `voucher_display_pattern_info`
      if (jsonObj.getAsJsonObject("voucher_display_pattern_info") != null) {
        VoucherDisplayPatternInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_display_pattern_info"));
      }
      // validate the optional field `voucher_send_mode_info`
      if (jsonObj.getAsJsonObject("voucher_send_mode_info") != null) {
        VoucherSendModeInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_send_mode_info"));
      }
      // validate the optional field `voucher_use_rule_info`
      if (jsonObj.getAsJsonObject("voucher_use_rule_info") != null) {
        VoucherUseRuleInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_use_rule_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherPackageActivityInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherPackageActivityInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherPackageActivityInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherPackageActivityInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherPackageActivityInfo>() {
           @Override
           public void write(JsonWriter out, VoucherPackageActivityInfo value) throws IOException {
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
           public VoucherPackageActivityInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VoucherPackageActivityInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VoucherPackageActivityInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherPackageActivityInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherPackageActivityInfo
  */
  public static VoucherPackageActivityInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherPackageActivityInfo.class);
  }

 /**
  * Convert an instance of VoucherPackageActivityInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

