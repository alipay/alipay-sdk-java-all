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
import com.alipay.v3.model.AttachmentExplain;
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
 * ConfigInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConfigInfo {
  public static final String SERIALIZED_NAME_ATTACHMENT_EXPLAIN = "attachment_explain";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_EXPLAIN)
  private AttachmentExplain attachmentExplain;

  public static final String SERIALIZED_NAME_COLLECT_ATTACHEMENT = "collect_attachement";
  @SerializedName(SERIALIZED_NAME_COLLECT_ATTACHEMENT)
  private Boolean collectAttachement;

  public static final String SERIALIZED_NAME_COLLECT_CERT_TYPES = "collect_cert_types";
  @SerializedName(SERIALIZED_NAME_COLLECT_CERT_TYPES)
  private List<String> collectCertTypes = null;

  public static final String SERIALIZED_NAME_COMPANY_NO = "company_no";
  @SerializedName(SERIALIZED_NAME_COMPANY_NO)
  private String companyNo;

  public static final String SERIALIZED_NAME_CONTRACT_VALIDITY = "contract_validity";
  @SerializedName(SERIALIZED_NAME_CONTRACT_VALIDITY)
  private Integer contractValidity;

  public static final String SERIALIZED_NAME_JUMP_URL = "jump_url";
  @SerializedName(SERIALIZED_NAME_JUMP_URL)
  private String jumpUrl;

  public static final String SERIALIZED_NAME_MERCHANT_MINI_SIGN_URL = "merchant_mini_sign_url";
  @SerializedName(SERIALIZED_NAME_MERCHANT_MINI_SIGN_URL)
  private String merchantMiniSignUrl;

  public static final String SERIALIZED_NAME_NOTICE_DEVELOPER_URL = "notice_developer_url";
  @SerializedName(SERIALIZED_NAME_NOTICE_DEVELOPER_URL)
  private String noticeDeveloperUrl;

  public static final String SERIALIZED_NAME_PLATFORM_ORDER_NO = "platform_order_no";
  @SerializedName(SERIALIZED_NAME_PLATFORM_ORDER_NO)
  private String platformOrderNo;

  public static final String SERIALIZED_NAME_SERIAL_NO = "serial_no";
  @SerializedName(SERIALIZED_NAME_SERIAL_NO)
  private String serialNo;

  public static final String SERIALIZED_NAME_SIGN_MODEL = "sign_model";
  @SerializedName(SERIALIZED_NAME_SIGN_MODEL)
  private Integer signModel;

  public ConfigInfo() { 
  }

  public ConfigInfo attachmentExplain(AttachmentExplain attachmentExplain) {
    
    this.attachmentExplain = attachmentExplain;
    return this;
  }

   /**
   * Get attachmentExplain
   * @return attachmentExplain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AttachmentExplain getAttachmentExplain() {
    return attachmentExplain;
  }


  public void setAttachmentExplain(AttachmentExplain attachmentExplain) {
    this.attachmentExplain = attachmentExplain;
  }


  public ConfigInfo collectAttachement(Boolean collectAttachement) {
    
    this.collectAttachement = collectAttachement;
    return this;
  }

   /**
   * 是否收集附件
   * @return collectAttachement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否收集附件")

  public Boolean getCollectAttachement() {
    return collectAttachement;
  }


  public void setCollectAttachement(Boolean collectAttachement) {
    this.collectAttachement = collectAttachement;
  }


  public ConfigInfo collectCertTypes(List<String> collectCertTypes) {
    
    this.collectCertTypes = collectCertTypes;
    return this;
  }

  public ConfigInfo addCollectCertTypesItem(String collectCertTypesItem) {
    if (this.collectCertTypes == null) {
      this.collectCertTypes = new ArrayList<>();
    }
    this.collectCertTypes.add(collectCertTypesItem);
    return this;
  }

   /**
   * 收集证件类型列表
   * @return collectCertTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"IDCARD\"]", value = "收集证件类型列表")

  public List<String> getCollectCertTypes() {
    return collectCertTypes;
  }


  public void setCollectCertTypes(List<String> collectCertTypes) {
    this.collectCertTypes = collectCertTypes;
  }


  public ConfigInfo companyNo(String companyNo) {
    
    this.companyNo = companyNo;
    return this;
  }

   /**
   * 公司编号-SF
   * @return companyNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SF", value = "公司编号-SF")

  public String getCompanyNo() {
    return companyNo;
  }


  public void setCompanyNo(String companyNo) {
    this.companyNo = companyNo;
  }


  public ConfigInfo contractValidity(Integer contractValidity) {
    
    this.contractValidity = contractValidity;
    return this;
  }

   /**
   * 文档过期时间
   * @return contractValidity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1577243641153", value = "文档过期时间")

  public Integer getContractValidity() {
    return contractValidity;
  }


  public void setContractValidity(Integer contractValidity) {
    this.contractValidity = contractValidity;
  }


  public ConfigInfo jumpUrl(String jumpUrl) {
    
    this.jumpUrl = jumpUrl;
    return this;
  }

   /**
   * 支付宝小程序跳转
   * @return jumpUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://platformapi/startapp?appId=2019042364288308&page=pages%2Fwater%2Fwater%3FactivityId%3D0ow26mr0eowt22mqz1gap8bale802821", value = "支付宝小程序跳转")

  public String getJumpUrl() {
    return jumpUrl;
  }


  public void setJumpUrl(String jumpUrl) {
    this.jumpUrl = jumpUrl;
  }


  public ConfigInfo merchantMiniSignUrl(String merchantMiniSignUrl) {
    
    this.merchantMiniSignUrl = merchantMiniSignUrl;
    return this;
  }

   /**
   * 商户小程序签署地址（signModel字段值为1时 必填）
   * @return merchantMiniSignUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://platformapi/startapp?appId=2019042364288308&page=pages%2Fwater%2Fwater%3FactivityId%3D0ow26mr0eowt22mqz1gap8bale802821", value = "商户小程序签署地址（signModel字段值为1时 必填）")

  public String getMerchantMiniSignUrl() {
    return merchantMiniSignUrl;
  }


  public void setMerchantMiniSignUrl(String merchantMiniSignUrl) {
    this.merchantMiniSignUrl = merchantMiniSignUrl;
  }


  public ConfigInfo noticeDeveloperUrl(String noticeDeveloperUrl) {
    
    this.noticeDeveloperUrl = noticeDeveloperUrl;
    return this;
  }

   /**
   * 回调地址，签署的过程和签署完成都会回调。
   * @return noticeDeveloperUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://abc.com/callback", value = "回调地址，签署的过程和签署完成都会回调。")

  public String getNoticeDeveloperUrl() {
    return noticeDeveloperUrl;
  }


  public void setNoticeDeveloperUrl(String noticeDeveloperUrl) {
    this.noticeDeveloperUrl = noticeDeveloperUrl;
  }


  public ConfigInfo platformOrderNo(String platformOrderNo) {
    
    this.platformOrderNo = platformOrderNo;
    return this;
  }

   /**
   * 平台订单号
   * @return platformOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DD1234", value = "平台订单号")

  public String getPlatformOrderNo() {
    return platformOrderNo;
  }


  public void setPlatformOrderNo(String platformOrderNo) {
    this.platformOrderNo = platformOrderNo;
  }


  public ConfigInfo serialNo(String serialNo) {
    
    this.serialNo = serialNo;
    return this;
  }

   /**
   * 物流单号
   * @return serialNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1576726491.1902587", value = "物流单号")

  public String getSerialNo() {
    return serialNo;
  }


  public void setSerialNo(String serialNo) {
    this.serialNo = serialNo;
  }


  public ConfigInfo signModel(Integer signModel) {
    
    this.signModel = signModel;
    return this;
  }

   /**
   * 签署方式  0-e签宝小程序签署 1-商户小程序签署  默认0
   * @return signModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "签署方式  0-e签宝小程序签署 1-商户小程序签署  默认0")

  public Integer getSignModel() {
    return signModel;
  }


  public void setSignModel(Integer signModel) {
    this.signModel = signModel;
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
   * @return the ConfigInfo instance itself
   */
  public ConfigInfo putAdditionalProperty(String key, Object value) {
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
    ConfigInfo configInfo = (ConfigInfo) o;
    return Objects.equals(this.attachmentExplain, configInfo.attachmentExplain) &&
        Objects.equals(this.collectAttachement, configInfo.collectAttachement) &&
        Objects.equals(this.collectCertTypes, configInfo.collectCertTypes) &&
        Objects.equals(this.companyNo, configInfo.companyNo) &&
        Objects.equals(this.contractValidity, configInfo.contractValidity) &&
        Objects.equals(this.jumpUrl, configInfo.jumpUrl) &&
        Objects.equals(this.merchantMiniSignUrl, configInfo.merchantMiniSignUrl) &&
        Objects.equals(this.noticeDeveloperUrl, configInfo.noticeDeveloperUrl) &&
        Objects.equals(this.platformOrderNo, configInfo.platformOrderNo) &&
        Objects.equals(this.serialNo, configInfo.serialNo) &&
        Objects.equals(this.signModel, configInfo.signModel)&&
        Objects.equals(this.additionalProperties, configInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentExplain, collectAttachement, collectCertTypes, companyNo, contractValidity, jumpUrl, merchantMiniSignUrl, noticeDeveloperUrl, platformOrderNo, serialNo, signModel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigInfo {\n");
    sb.append("    attachmentExplain: ").append(toIndentedString(attachmentExplain)).append("\n");
    sb.append("    collectAttachement: ").append(toIndentedString(collectAttachement)).append("\n");
    sb.append("    collectCertTypes: ").append(toIndentedString(collectCertTypes)).append("\n");
    sb.append("    companyNo: ").append(toIndentedString(companyNo)).append("\n");
    sb.append("    contractValidity: ").append(toIndentedString(contractValidity)).append("\n");
    sb.append("    jumpUrl: ").append(toIndentedString(jumpUrl)).append("\n");
    sb.append("    merchantMiniSignUrl: ").append(toIndentedString(merchantMiniSignUrl)).append("\n");
    sb.append("    noticeDeveloperUrl: ").append(toIndentedString(noticeDeveloperUrl)).append("\n");
    sb.append("    platformOrderNo: ").append(toIndentedString(platformOrderNo)).append("\n");
    sb.append("    serialNo: ").append(toIndentedString(serialNo)).append("\n");
    sb.append("    signModel: ").append(toIndentedString(signModel)).append("\n");
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
    openapiFields.add("attachment_explain");
    openapiFields.add("collect_attachement");
    openapiFields.add("collect_cert_types");
    openapiFields.add("company_no");
    openapiFields.add("contract_validity");
    openapiFields.add("jump_url");
    openapiFields.add("merchant_mini_sign_url");
    openapiFields.add("notice_developer_url");
    openapiFields.add("platform_order_no");
    openapiFields.add("serial_no");
    openapiFields.add("sign_model");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConfigInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConfigInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigInfo is not found in the empty JSON string", ConfigInfo.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `attachment_explain`
      if (jsonObj.getAsJsonObject("attachment_explain") != null) {
        AttachmentExplain.validateJsonObject(jsonObj.getAsJsonObject("attachment_explain"));
      }
      // ensure the json data is an array
      if (jsonObj.get("collect_cert_types") != null && !jsonObj.get("collect_cert_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `collect_cert_types` to be an array in the JSON string but got `%s`", jsonObj.get("collect_cert_types").toString()));
      }
      if (jsonObj.get("company_no") != null && !jsonObj.get("company_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_no").toString()));
      }
      if (jsonObj.get("jump_url") != null && !jsonObj.get("jump_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jump_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jump_url").toString()));
      }
      if (jsonObj.get("merchant_mini_sign_url") != null && !jsonObj.get("merchant_mini_sign_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_mini_sign_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_mini_sign_url").toString()));
      }
      if (jsonObj.get("notice_developer_url") != null && !jsonObj.get("notice_developer_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notice_developer_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notice_developer_url").toString()));
      }
      if (jsonObj.get("platform_order_no") != null && !jsonObj.get("platform_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform_order_no").toString()));
      }
      if (jsonObj.get("serial_no") != null && !jsonObj.get("serial_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serial_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serial_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigInfo>() {
           @Override
           public void write(JsonWriter out, ConfigInfo value) throws IOException {
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
           public ConfigInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ConfigInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ConfigInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigInfo
  * @throws IOException if the JSON string is invalid with respect to ConfigInfo
  */
  public static ConfigInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigInfo.class);
  }

 /**
  * Convert an instance of ConfigInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

