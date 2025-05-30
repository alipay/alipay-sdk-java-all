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
 * AlipayOpenMiniInnerappCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerappCreateModel {
  public static final String SERIALIZED_NAME_APP_CATEGORY_IDS = "app_category_ids";
  @SerializedName(SERIALIZED_NAME_APP_CATEGORY_IDS)
  private String appCategoryIds;

  public static final String SERIALIZED_NAME_APP_DESC = "app_desc";
  @SerializedName(SERIALIZED_NAME_APP_DESC)
  private String appDesc;

  public static final String SERIALIZED_NAME_APP_ENGLISH_NAME = "app_english_name";
  @SerializedName(SERIALIZED_NAME_APP_ENGLISH_NAME)
  private String appEnglishName;

  public static final String SERIALIZED_NAME_APP_LOGO = "app_logo";
  @SerializedName(SERIALIZED_NAME_APP_LOGO)
  private String appLogo;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_APP_ORIGIN = "app_origin";
  @SerializedName(SERIALIZED_NAME_APP_ORIGIN)
  private String appOrigin;

  public static final String SERIALIZED_NAME_APP_SLOGAN = "app_slogan";
  @SerializedName(SERIALIZED_NAME_APP_SLOGAN)
  private String appSlogan;

  public static final String SERIALIZED_NAME_APP_SUB_TYPE = "app_sub_type";
  @SerializedName(SERIALIZED_NAME_APP_SUB_TYPE)
  private String appSubType;

  public static final String SERIALIZED_NAME_APP_TYPE = "app_type";
  @SerializedName(SERIALIZED_NAME_APP_TYPE)
  private String appType;

  public static final String SERIALIZED_NAME_ISV_APP_ID = "isv_app_id";
  @SerializedName(SERIALIZED_NAME_ISV_APP_ID)
  private String isvAppId;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_MINI_CATEGORY_IDS = "mini_category_ids";
  @SerializedName(SERIALIZED_NAME_MINI_CATEGORY_IDS)
  private String miniCategoryIds;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_SERVICE_EMAIL = "service_email";
  @SerializedName(SERIALIZED_NAME_SERVICE_EMAIL)
  private String serviceEmail;

  public static final String SERIALIZED_NAME_SERVICE_PHONE = "service_phone";
  @SerializedName(SERIALIZED_NAME_SERVICE_PHONE)
  private String servicePhone;

  public AlipayOpenMiniInnerappCreateModel() { 
  }

  public AlipayOpenMiniInnerappCreateModel appCategoryIds(String appCategoryIds) {
    
    this.appCategoryIds = appCategoryIds;
    return this;
  }

   /**
   * 小程序类目，二级类目与三级类目下划线隔开，最多可以选择3个类目，类目之间以;隔开
   * @return appCategoryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "107211_107236", value = "小程序类目，二级类目与三级类目下划线隔开，最多可以选择3个类目，类目之间以;隔开")

  public String getAppCategoryIds() {
    return appCategoryIds;
  }


  public void setAppCategoryIds(String appCategoryIds) {
    this.appCategoryIds = appCategoryIds;
  }


  public AlipayOpenMiniInnerappCreateModel appDesc(String appDesc) {
    
    this.appDesc = appDesc;
    return this;
  }

   /**
   * 小程序描述，20-200个字符
   * @return appDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "我的一个计算小程序，这里注意长度是20-200个字符，10-100中文字", value = "小程序描述，20-200个字符")

  public String getAppDesc() {
    return appDesc;
  }


  public void setAppDesc(String appDesc) {
    this.appDesc = appDesc;
  }


  public AlipayOpenMiniInnerappCreateModel appEnglishName(String appEnglishName) {
    
    this.appEnglishName = appEnglishName;
    return this;
  }

   /**
   * 小程序英文名称，插件不填
   * @return appEnglishName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tinyName", value = "小程序英文名称，插件不填")

  public String getAppEnglishName() {
    return appEnglishName;
  }


  public void setAppEnglishName(String appEnglishName) {
    this.appEnglishName = appEnglishName;
  }


  public AlipayOpenMiniInnerappCreateModel appLogo(String appLogo) {
    
    this.appLogo = appLogo;
    return this;
  }

   /**
   * 小程序logo
   * @return appLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://appstoreisvpic.alipayobjects.com/0aef2a4a-0b90-444d-916b-e8b25cd787c9.png", value = "小程序logo")

  public String getAppLogo() {
    return appLogo;
  }


  public void setAppLogo(String appLogo) {
    this.appLogo = appLogo;
  }


  public AlipayOpenMiniInnerappCreateModel appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 小程序名称
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "我的小程序", value = "小程序名称")

  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public AlipayOpenMiniInnerappCreateModel appOrigin(String appOrigin) {
    
    this.appOrigin = appOrigin;
    return this;
  }

   /**
   * 来源的业务方,接入文档中申请的业务来源
   * @return appOrigin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AAA", value = "来源的业务方,接入文档中申请的业务来源")

  public String getAppOrigin() {
    return appOrigin;
  }


  public void setAppOrigin(String appOrigin) {
    this.appOrigin = appOrigin;
  }


  public AlipayOpenMiniInnerappCreateModel appSlogan(String appSlogan) {
    
    this.appSlogan = appSlogan;
    return this;
  }

   /**
   * 小程序简介，在搜索透出,插件不需要填
   * @return appSlogan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "我的小程序", value = "小程序简介，在搜索透出,插件不需要填")

  public String getAppSlogan() {
    return appSlogan;
  }


  public void setAppSlogan(String appSlogan) {
    this.appSlogan = appSlogan;
  }


  public AlipayOpenMiniInnerappCreateModel appSubType(String appSubType) {
    
    this.appSubType = appSubType;
    return this;
  }

   /**
   * 应用子类型
   * @return appSubType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TINYAPP_NORMAL，TINYAPP_TEMPLATE，TINYAPP_PLUGIN", value = "应用子类型")

  public String getAppSubType() {
    return appSubType;
  }


  public void setAppSubType(String appSubType) {
    this.appSubType = appSubType;
  }


  public AlipayOpenMiniInnerappCreateModel appType(String appType) {
    
    this.appType = appType;
    return this;
  }

   /**
   * 应用类型
   * @return appType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TINYAPP", value = "应用类型")

  public String getAppType() {
    return appType;
  }


  public void setAppType(String appType) {
    this.appType = appType;
  }


  public AlipayOpenMiniInnerappCreateModel isvAppId(String isvAppId) {
    
    this.isvAppId = isvAppId;
    return this;
  }

   /**
   * 三方应用ID，仅在创建模板小程序时需要传入
   * @return isvAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019****", value = "三方应用ID，仅在创建模板小程序时需要传入")

  public String getIsvAppId() {
    return isvAppId;
  }


  public void setIsvAppId(String isvAppId) {
    this.isvAppId = isvAppId;
  }


  public AlipayOpenMiniInnerappCreateModel miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 小程序ID，仅特殊场景使用，普通业务方无需关注该参数
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300*****", value = "小程序ID，仅特殊场景使用，普通业务方无需关注该参数")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public AlipayOpenMiniInnerappCreateModel miniCategoryIds(String miniCategoryIds) {
    
    this.miniCategoryIds = miniCategoryIds;
    return this;
  }

   /**
   * 新小程序前台类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目_第二个三级类目，详细类目可以通过 https://docs.open.alipay.com/api_49/alipay.open.mini.category.query接口查询mini_category_list。使用后不再读取app_category_ids值，老前台类目将废弃
   * @return miniCategoryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XS1001_XS2001_XS3002;XS1011_XS2089;XS1002_XS2008_XS3024", value = "新小程序前台类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目_第二个三级类目，详细类目可以通过 https://docs.open.alipay.com/api_49/alipay.open.mini.category.query接口查询mini_category_list。使用后不再读取app_category_ids值，老前台类目将废弃")

  public String getMiniCategoryIds() {
    return miniCategoryIds;
  }


  public void setMiniCategoryIds(String miniCategoryIds) {
    this.miniCategoryIds = miniCategoryIds;
  }


  public AlipayOpenMiniInnerappCreateModel pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 创建的小程序所属的PID
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088****", value = "创建的小程序所属的PID")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }


  public AlipayOpenMiniInnerappCreateModel serviceEmail(String serviceEmail) {
    
    this.serviceEmail = serviceEmail;
    return this;
  }

   /**
   * 邮箱，与客服电话二选一
   * @return serviceEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123@alibaba.cn", value = "邮箱，与客服电话二选一")

  public String getServiceEmail() {
    return serviceEmail;
  }


  public void setServiceEmail(String serviceEmail) {
    this.serviceEmail = serviceEmail;
  }


  public AlipayOpenMiniInnerappCreateModel servicePhone(String servicePhone) {
    
    this.servicePhone = servicePhone;
    return this;
  }

   /**
   * 客服电话，插件不需要
   * @return servicePhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "021-333333", value = "客服电话，插件不需要")

  public String getServicePhone() {
    return servicePhone;
  }


  public void setServicePhone(String servicePhone) {
    this.servicePhone = servicePhone;
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
   * @return the AlipayOpenMiniInnerappCreateModel instance itself
   */
  public AlipayOpenMiniInnerappCreateModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenMiniInnerappCreateModel alipayOpenMiniInnerappCreateModel = (AlipayOpenMiniInnerappCreateModel) o;
    return Objects.equals(this.appCategoryIds, alipayOpenMiniInnerappCreateModel.appCategoryIds) &&
        Objects.equals(this.appDesc, alipayOpenMiniInnerappCreateModel.appDesc) &&
        Objects.equals(this.appEnglishName, alipayOpenMiniInnerappCreateModel.appEnglishName) &&
        Objects.equals(this.appLogo, alipayOpenMiniInnerappCreateModel.appLogo) &&
        Objects.equals(this.appName, alipayOpenMiniInnerappCreateModel.appName) &&
        Objects.equals(this.appOrigin, alipayOpenMiniInnerappCreateModel.appOrigin) &&
        Objects.equals(this.appSlogan, alipayOpenMiniInnerappCreateModel.appSlogan) &&
        Objects.equals(this.appSubType, alipayOpenMiniInnerappCreateModel.appSubType) &&
        Objects.equals(this.appType, alipayOpenMiniInnerappCreateModel.appType) &&
        Objects.equals(this.isvAppId, alipayOpenMiniInnerappCreateModel.isvAppId) &&
        Objects.equals(this.miniAppId, alipayOpenMiniInnerappCreateModel.miniAppId) &&
        Objects.equals(this.miniCategoryIds, alipayOpenMiniInnerappCreateModel.miniCategoryIds) &&
        Objects.equals(this.pid, alipayOpenMiniInnerappCreateModel.pid) &&
        Objects.equals(this.serviceEmail, alipayOpenMiniInnerappCreateModel.serviceEmail) &&
        Objects.equals(this.servicePhone, alipayOpenMiniInnerappCreateModel.servicePhone)&&
        Objects.equals(this.additionalProperties, alipayOpenMiniInnerappCreateModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appCategoryIds, appDesc, appEnglishName, appLogo, appName, appOrigin, appSlogan, appSubType, appType, isvAppId, miniAppId, miniCategoryIds, pid, serviceEmail, servicePhone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerappCreateModel {\n");
    sb.append("    appCategoryIds: ").append(toIndentedString(appCategoryIds)).append("\n");
    sb.append("    appDesc: ").append(toIndentedString(appDesc)).append("\n");
    sb.append("    appEnglishName: ").append(toIndentedString(appEnglishName)).append("\n");
    sb.append("    appLogo: ").append(toIndentedString(appLogo)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appOrigin: ").append(toIndentedString(appOrigin)).append("\n");
    sb.append("    appSlogan: ").append(toIndentedString(appSlogan)).append("\n");
    sb.append("    appSubType: ").append(toIndentedString(appSubType)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    isvAppId: ").append(toIndentedString(isvAppId)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    miniCategoryIds: ").append(toIndentedString(miniCategoryIds)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    serviceEmail: ").append(toIndentedString(serviceEmail)).append("\n");
    sb.append("    servicePhone: ").append(toIndentedString(servicePhone)).append("\n");
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
    openapiFields.add("app_category_ids");
    openapiFields.add("app_desc");
    openapiFields.add("app_english_name");
    openapiFields.add("app_logo");
    openapiFields.add("app_name");
    openapiFields.add("app_origin");
    openapiFields.add("app_slogan");
    openapiFields.add("app_sub_type");
    openapiFields.add("app_type");
    openapiFields.add("isv_app_id");
    openapiFields.add("mini_app_id");
    openapiFields.add("mini_category_ids");
    openapiFields.add("pid");
    openapiFields.add("service_email");
    openapiFields.add("service_phone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerappCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerappCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerappCreateModel is not found in the empty JSON string", AlipayOpenMiniInnerappCreateModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("app_category_ids") != null && !jsonObj.get("app_category_ids").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_category_ids` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_category_ids").toString()));
      }
      if (jsonObj.get("app_desc") != null && !jsonObj.get("app_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_desc").toString()));
      }
      if (jsonObj.get("app_english_name") != null && !jsonObj.get("app_english_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_english_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_english_name").toString()));
      }
      if (jsonObj.get("app_logo") != null && !jsonObj.get("app_logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_logo").toString()));
      }
      if (jsonObj.get("app_name") != null && !jsonObj.get("app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_name").toString()));
      }
      if (jsonObj.get("app_origin") != null && !jsonObj.get("app_origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_origin").toString()));
      }
      if (jsonObj.get("app_slogan") != null && !jsonObj.get("app_slogan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_slogan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_slogan").toString()));
      }
      if (jsonObj.get("app_sub_type") != null && !jsonObj.get("app_sub_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_sub_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_sub_type").toString()));
      }
      if (jsonObj.get("app_type") != null && !jsonObj.get("app_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_type").toString()));
      }
      if (jsonObj.get("isv_app_id") != null && !jsonObj.get("isv_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_app_id").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("mini_category_ids") != null && !jsonObj.get("mini_category_ids").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_category_ids` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_category_ids").toString()));
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
      if (jsonObj.get("service_email") != null && !jsonObj.get("service_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_email").toString()));
      }
      if (jsonObj.get("service_phone") != null && !jsonObj.get("service_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_phone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerappCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerappCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerappCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerappCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerappCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerappCreateModel value) throws IOException {
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
           public AlipayOpenMiniInnerappCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenMiniInnerappCreateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenMiniInnerappCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerappCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerappCreateModel
  */
  public static AlipayOpenMiniInnerappCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerappCreateModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerappCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

