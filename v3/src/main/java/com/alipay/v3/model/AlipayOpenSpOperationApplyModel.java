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
 * AlipayOpenSpOperationApplyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSpOperationApplyModel {
  public static final String SERIALIZED_NAME_ACCESS_PRODUCT_CODE = "access_product_code";
  @SerializedName(SERIALIZED_NAME_ACCESS_PRODUCT_CODE)
  private String accessProductCode;

  public static final String SERIALIZED_NAME_ALIPAY_ACCOUNT = "alipay_account";
  @SerializedName(SERIALIZED_NAME_ALIPAY_ACCOUNT)
  private String alipayAccount;

  public static final String SERIALIZED_NAME_ISV_SCENE_PERMISSIONS = "isv_scene_permissions";
  @SerializedName(SERIALIZED_NAME_ISV_SCENE_PERMISSIONS)
  private String isvScenePermissions;

  public static final String SERIALIZED_NAME_MERCHANT_NO = "merchant_no";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NO)
  private String merchantNo;

  public static final String SERIALIZED_NAME_OPERATE_TYPE = "operate_type";
  @SerializedName(SERIALIZED_NAME_OPERATE_TYPE)
  private String operateType;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public AlipayOpenSpOperationApplyModel() { 
  }

  public AlipayOpenSpOperationApplyModel accessProductCode(String accessProductCode) {
    
    this.accessProductCode = accessProductCode;
    return this;
  }

   /**
   * 接入的产品编号。 枚举如下： * OPENAPI_BIND_DEFAULT：操作类型为账号绑定。 * OPENAPI_AUTH_DEFAULT：操作类型为代运营授权时。
   * @return accessProductCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OPENAPI_BIND_DEFAULT", value = "接入的产品编号。 枚举如下： * OPENAPI_BIND_DEFAULT：操作类型为账号绑定。 * OPENAPI_AUTH_DEFAULT：操作类型为代运营授权时。")

  public String getAccessProductCode() {
    return accessProductCode;
  }


  public void setAccessProductCode(String accessProductCode) {
    this.accessProductCode = accessProductCode;
  }


  public AlipayOpenSpOperationApplyModel alipayAccount(String alipayAccount) {
    
    this.alipayAccount = alipayAccount;
    return this;
  }

   /**
   * 支付宝登录账号，通常为手机号或者邮箱。 间连场景必填。 直连场景选填，特别注意merchant_no和alipay_account不能同时为空，都有值优先取merchant_no。
   * @return alipayAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxx@gmail.com", value = "支付宝登录账号，通常为手机号或者邮箱。 间连场景必填。 直连场景选填，特别注意merchant_no和alipay_account不能同时为空，都有值优先取merchant_no。")

  public String getAlipayAccount() {
    return alipayAccount;
  }


  public void setAlipayAccount(String alipayAccount) {
    this.alipayAccount = alipayAccount;
  }


  public AlipayOpenSpOperationApplyModel isvScenePermissions(String isvScenePermissions) {
    
    this.isvScenePermissions = isvScenePermissions;
    return this;
  }

   /**
   * 场景授权列表结构结构：场景codeA:权限code1,权限code2;场景codeB:权限code1,权限code2; 说明： * 本参数和access_product_code只需要传一个。 * 场景 + 权限Code含义：    SHOP_MANAGE:SHOP_MANAGE_BASE：管理门店信息    MINI_APP_OPER:MINI_APP_OPER_BASE：运营支付宝小程序    PROMOTION_MANAGE:PROMOTION_MANAGE_BASE：运营营销活动    OPERATION_POINTS:OPERATION_POINTS_BASE：管理运营积分    INCENTIVE_POINT_MANAGE:INCENTIVE_POINT_MANAGE_BASE：管理激励点数
   * @return isvScenePermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SHOP_MANAGE:SHOP_MANAGE_BASE;MINI_APP_OPER:MINI_APP_OPER_BASE;PROMOTION_MANAGE:PROMOTION_MANAGE_BASE;OPERATION_POINTS:OPERATION_POINTS_BASE", value = "场景授权列表结构结构：场景codeA:权限code1,权限code2;场景codeB:权限code1,权限code2; 说明： * 本参数和access_product_code只需要传一个。 * 场景 + 权限Code含义：    SHOP_MANAGE:SHOP_MANAGE_BASE：管理门店信息    MINI_APP_OPER:MINI_APP_OPER_BASE：运营支付宝小程序    PROMOTION_MANAGE:PROMOTION_MANAGE_BASE：运营营销活动    OPERATION_POINTS:OPERATION_POINTS_BASE：管理运营积分    INCENTIVE_POINT_MANAGE:INCENTIVE_POINT_MANAGE_BASE：管理激励点数")

  public String getIsvScenePermissions() {
    return isvScenePermissions;
  }


  public void setIsvScenePermissions(String isvScenePermissions) {
    this.isvScenePermissions = isvScenePermissions;
  }


  public AlipayOpenSpOperationApplyModel merchantNo(String merchantNo) {
    
    this.merchantNo = merchantNo;
    return this;
  }

   /**
   * 支付宝商户号。 间连场景，merchant_no必填，传入商户smid，特别注意仅支持2088开头的间连商户。 直连场景，merchant_no选填，传入商户支付宝pid，特别注意merchant_no和alipay_account不能同时为空，优先取merchant_no。
   * @return merchantNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088XXXX", value = "支付宝商户号。 间连场景，merchant_no必填，传入商户smid，特别注意仅支持2088开头的间连商户。 直连场景，merchant_no选填，传入商户支付宝pid，特别注意merchant_no和alipay_account不能同时为空，优先取merchant_no。")

  public String getMerchantNo() {
    return merchantNo;
  }


  public void setMerchantNo(String merchantNo) {
    this.merchantNo = merchantNo;
  }


  public AlipayOpenSpOperationApplyModel operateType(String operateType) {
    
    this.operateType = operateType;
    return this;
  }

   /**
   * 代运营操作类型。枚举如下： * ACCOUNT_BIND：代表绑定支付宝账号，仅对于间连商户。 * OPERATION_AUTH：代表代运营授权，支持间连和直连商户，其中间连场景包含绑定支付宝账号。
   * @return operateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACCOUNT_BIND", value = "代运营操作类型。枚举如下： * ACCOUNT_BIND：代表绑定支付宝账号，仅对于间连商户。 * OPERATION_AUTH：代表代运营授权，支持间连和直连商户，其中间连场景包含绑定支付宝账号。")

  public String getOperateType() {
    return operateType;
  }


  public void setOperateType(String operateType) {
    this.operateType = operateType;
  }


  public AlipayOpenSpOperationApplyModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部操作流水，ISV自定义。每次操作需要确保唯一。
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020124234523465636345634", value = "外部操作流水，ISV自定义。每次操作需要确保唯一。")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
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
   * @return the AlipayOpenSpOperationApplyModel instance itself
   */
  public AlipayOpenSpOperationApplyModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenSpOperationApplyModel alipayOpenSpOperationApplyModel = (AlipayOpenSpOperationApplyModel) o;
    return Objects.equals(this.accessProductCode, alipayOpenSpOperationApplyModel.accessProductCode) &&
        Objects.equals(this.alipayAccount, alipayOpenSpOperationApplyModel.alipayAccount) &&
        Objects.equals(this.isvScenePermissions, alipayOpenSpOperationApplyModel.isvScenePermissions) &&
        Objects.equals(this.merchantNo, alipayOpenSpOperationApplyModel.merchantNo) &&
        Objects.equals(this.operateType, alipayOpenSpOperationApplyModel.operateType) &&
        Objects.equals(this.outBizNo, alipayOpenSpOperationApplyModel.outBizNo)&&
        Objects.equals(this.additionalProperties, alipayOpenSpOperationApplyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessProductCode, alipayAccount, isvScenePermissions, merchantNo, operateType, outBizNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSpOperationApplyModel {\n");
    sb.append("    accessProductCode: ").append(toIndentedString(accessProductCode)).append("\n");
    sb.append("    alipayAccount: ").append(toIndentedString(alipayAccount)).append("\n");
    sb.append("    isvScenePermissions: ").append(toIndentedString(isvScenePermissions)).append("\n");
    sb.append("    merchantNo: ").append(toIndentedString(merchantNo)).append("\n");
    sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
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
    openapiFields.add("access_product_code");
    openapiFields.add("alipay_account");
    openapiFields.add("isv_scene_permissions");
    openapiFields.add("merchant_no");
    openapiFields.add("operate_type");
    openapiFields.add("out_biz_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSpOperationApplyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSpOperationApplyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSpOperationApplyModel is not found in the empty JSON string", AlipayOpenSpOperationApplyModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("access_product_code") != null && !jsonObj.get("access_product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_product_code").toString()));
      }
      if (jsonObj.get("alipay_account") != null && !jsonObj.get("alipay_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_account").toString()));
      }
      if (jsonObj.get("isv_scene_permissions") != null && !jsonObj.get("isv_scene_permissions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_scene_permissions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_scene_permissions").toString()));
      }
      if (jsonObj.get("merchant_no") != null && !jsonObj.get("merchant_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_no").toString()));
      }
      if (jsonObj.get("operate_type") != null && !jsonObj.get("operate_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operate_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operate_type").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSpOperationApplyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSpOperationApplyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSpOperationApplyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSpOperationApplyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSpOperationApplyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSpOperationApplyModel value) throws IOException {
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
           public AlipayOpenSpOperationApplyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenSpOperationApplyModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenSpOperationApplyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSpOperationApplyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSpOperationApplyModel
  */
  public static AlipayOpenSpOperationApplyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSpOperationApplyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSpOperationApplyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

