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
 * ModifyIssueRuleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModifyIssueRuleInfo {
  public static final String SERIALIZED_NAME_EFFECTIVE_PERIOD = "effective_period";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_PERIOD)
  private String effectivePeriod;

  public static final String SERIALIZED_NAME_ISSUE_RULE_ID = "issue_rule_id";
  @SerializedName(SERIALIZED_NAME_ISSUE_RULE_ID)
  private String issueRuleId;

  public static final String SERIALIZED_NAME_ISSUE_RULE_NAME = "issue_rule_name";
  @SerializedName(SERIALIZED_NAME_ISSUE_RULE_NAME)
  private String issueRuleName;

  public static final String SERIALIZED_NAME_ISSUE_TYPE = "issue_type";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE)
  private String issueType;

  public static final String SERIALIZED_NAME_QUOTA_TYPE = "quota_type";
  @SerializedName(SERIALIZED_NAME_QUOTA_TYPE)
  private String quotaType;

  public ModifyIssueRuleInfo() { 
  }

  public ModifyIssueRuleInfo effectivePeriod(String effectivePeriod) {
    
    this.effectivePeriod = effectivePeriod;
    return this;
  }

   /**
   * 发放资产的有效时间段，该字段为空时，默认为不限制。当发放资产为余额时，仅支持设置为不限，当发放资产为点券时，可支持设置多种值。具体传值格式请参考文档 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/pre-open/07nwcs\&quot;&gt;接入文档&lt;/a&gt;
   * @return effectivePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\\\"all\\\":true}", value = "发放资产的有效时间段，该字段为空时，默认为不限制。当发放资产为余额时，仅支持设置为不限，当发放资产为点券时，可支持设置多种值。具体传值格式请参考文档 <a href=\"https://opendocs.alipay.com/pre-open/07nwcs\">接入文档</a>")

  public String getEffectivePeriod() {
    return effectivePeriod;
  }


  public void setEffectivePeriod(String effectivePeriod) {
    this.effectivePeriod = effectivePeriod;
  }


  public ModifyIssueRuleInfo issueRuleId(String issueRuleId) {
    
    this.issueRuleId = issueRuleId;
    return this;
  }

   /**
   * 发放规则id
   * @return issueRuleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"2024090500152621040000040033\"", value = "发放规则id")

  public String getIssueRuleId() {
    return issueRuleId;
  }


  public void setIssueRuleId(String issueRuleId) {
    this.issueRuleId = issueRuleId;
  }


  public ModifyIssueRuleInfo issueRuleName(String issueRuleName) {
    
    this.issueRuleName = issueRuleName;
    return this;
  }

   /**
   * 发放规则名称
   * @return issueRuleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "发放餐补", value = "发放规则名称")

  public String getIssueRuleName() {
    return issueRuleName;
  }


  public void setIssueRuleName(String issueRuleName) {
    this.issueRuleName = issueRuleName;
  }


  public ModifyIssueRuleInfo issueType(String issueType) {
    
    this.issueType = issueType;
    return this;
  }

   /**
   * 额度发放周期
   * @return issueType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ISSUE_DAY", value = "额度发放周期")

  public String getIssueType() {
    return issueType;
  }


  public void setIssueType(String issueType) {
    this.issueType = issueType;
  }


  public ModifyIssueRuleInfo quotaType(String quotaType) {
    
    this.quotaType = quotaType;
    return this;
  }

   /**
   * 发放规则发放的额度类型
   * @return quotaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COUPON", value = "发放规则发放的额度类型")

  public String getQuotaType() {
    return quotaType;
  }


  public void setQuotaType(String quotaType) {
    this.quotaType = quotaType;
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
   * @return the ModifyIssueRuleInfo instance itself
   */
  public ModifyIssueRuleInfo putAdditionalProperty(String key, Object value) {
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
    ModifyIssueRuleInfo modifyIssueRuleInfo = (ModifyIssueRuleInfo) o;
    return Objects.equals(this.effectivePeriod, modifyIssueRuleInfo.effectivePeriod) &&
        Objects.equals(this.issueRuleId, modifyIssueRuleInfo.issueRuleId) &&
        Objects.equals(this.issueRuleName, modifyIssueRuleInfo.issueRuleName) &&
        Objects.equals(this.issueType, modifyIssueRuleInfo.issueType) &&
        Objects.equals(this.quotaType, modifyIssueRuleInfo.quotaType)&&
        Objects.equals(this.additionalProperties, modifyIssueRuleInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectivePeriod, issueRuleId, issueRuleName, issueType, quotaType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyIssueRuleInfo {\n");
    sb.append("    effectivePeriod: ").append(toIndentedString(effectivePeriod)).append("\n");
    sb.append("    issueRuleId: ").append(toIndentedString(issueRuleId)).append("\n");
    sb.append("    issueRuleName: ").append(toIndentedString(issueRuleName)).append("\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
    sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
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
    openapiFields.add("effective_period");
    openapiFields.add("issue_rule_id");
    openapiFields.add("issue_rule_name");
    openapiFields.add("issue_type");
    openapiFields.add("quota_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModifyIssueRuleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ModifyIssueRuleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModifyIssueRuleInfo is not found in the empty JSON string", ModifyIssueRuleInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("effective_period") != null && !jsonObj.get("effective_period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_period").toString()));
      }
      if (jsonObj.get("issue_rule_id") != null && !jsonObj.get("issue_rule_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_rule_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_rule_id").toString()));
      }
      if (jsonObj.get("issue_rule_name") != null && !jsonObj.get("issue_rule_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_rule_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_rule_name").toString()));
      }
      if (jsonObj.get("issue_type") != null && !jsonObj.get("issue_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_type").toString()));
      }
      if (jsonObj.get("quota_type") != null && !jsonObj.get("quota_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModifyIssueRuleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModifyIssueRuleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModifyIssueRuleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModifyIssueRuleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ModifyIssueRuleInfo>() {
           @Override
           public void write(JsonWriter out, ModifyIssueRuleInfo value) throws IOException {
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
           public ModifyIssueRuleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ModifyIssueRuleInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ModifyIssueRuleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModifyIssueRuleInfo
  * @throws IOException if the JSON string is invalid with respect to ModifyIssueRuleInfo
  */
  public static ModifyIssueRuleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModifyIssueRuleInfo.class);
  }

 /**
  * Convert an instance of ModifyIssueRuleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

