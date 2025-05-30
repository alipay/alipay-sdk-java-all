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
import com.alipay.v3.model.SubMerchant;
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
 * RoyaltyDetailInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoyaltyDetailInfo {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public static final String SERIALIZED_NAME_SCENE = "scene";
  @SerializedName(SERIALIZED_NAME_SCENE)
  private String scene;

  public static final String SERIALIZED_NAME_TRANS_IN_ACCOUNT_ID = "trans_in_account_id";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_ACCOUNT_ID)
  private String transInAccountId;

  public static final String SERIALIZED_NAME_TRANS_IN_ACCOUNT_ID_TYPE = "trans_in_account_id_type";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_ACCOUNT_ID_TYPE)
  private String transInAccountIdType;

  public static final String SERIALIZED_NAME_TRANS_IN_ACCOUNT_TYPE = "trans_in_account_type";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_ACCOUNT_TYPE)
  private String transInAccountType;

  public static final String SERIALIZED_NAME_TRANS_IN_ENTITY_BIZ_TYPE = "trans_in_entity_biz_type";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_ENTITY_BIZ_TYPE)
  private String transInEntityBizType;

  public static final String SERIALIZED_NAME_TRANS_IN_ENTITY_ID = "trans_in_entity_id";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_ENTITY_ID)
  private String transInEntityId;

  public static final String SERIALIZED_NAME_TRANS_IN_ENTITY_TYPE = "trans_in_entity_type";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_ENTITY_TYPE)
  private String transInEntityType;

  public static final String SERIALIZED_NAME_TRANS_IN_SUB_MERCHANT = "trans_in_sub_merchant";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_SUB_MERCHANT)
  private SubMerchant transInSubMerchant;

  public static final String SERIALIZED_NAME_TRANS_OUT_ENTITY_BIZ_TYPE = "trans_out_entity_biz_type";
  @SerializedName(SERIALIZED_NAME_TRANS_OUT_ENTITY_BIZ_TYPE)
  private String transOutEntityBizType;

  public static final String SERIALIZED_NAME_TRANS_OUT_ENTITY_ID = "trans_out_entity_id";
  @SerializedName(SERIALIZED_NAME_TRANS_OUT_ENTITY_ID)
  private String transOutEntityId;

  public static final String SERIALIZED_NAME_TRANS_OUT_ENTITY_TYPE = "trans_out_entity_type";
  @SerializedName(SERIALIZED_NAME_TRANS_OUT_ENTITY_TYPE)
  private String transOutEntityType;

  public static final String SERIALIZED_NAME_TRANS_OUT_SUB_MERCHANT = "trans_out_sub_merchant";
  @SerializedName(SERIALIZED_NAME_TRANS_OUT_SUB_MERCHANT)
  private SubMerchant transOutSubMerchant;

  public RoyaltyDetailInfo() { 
  }

  public RoyaltyDetailInfo amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 分账金额，单位为元
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.00", value = "分账金额，单位为元")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public RoyaltyDetailInfo desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 分账描述
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "分账给2088101126708402", value = "分账描述")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public RoyaltyDetailInfo scene(String scene) {
    
    this.scene = scene;
    return this;
  }

   /**
   * 分账场景，目前仅支持5中类型，RETURN_MONEY(垫资还款), CHARGE（费用）, REPLENISH（补贴），FUND_TRANS_IN_SWITCHING（存量资金搬迁），PUNISHMENT（处罚）
   * @return scene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PUNISHMENT", value = "分账场景，目前仅支持5中类型，RETURN_MONEY(垫资还款), CHARGE（费用）, REPLENISH（补贴），FUND_TRANS_IN_SWITCHING（存量资金搬迁），PUNISHMENT（处罚）")

  public String getScene() {
    return scene;
  }


  public void setScene(String scene) {
    this.scene = scene;
  }


  public RoyaltyDetailInfo transInAccountId(String transInAccountId) {
    
    this.transInAccountId = transInAccountId;
    return this;
  }

   /**
   * 分账转入账户id。当分账账户id类型是cardSerialNo时，本参数为用户在支付宝绑定的卡编号；当分账账户id类型是userId时，本参数为用户的支付宝账号对应的支付宝唯一用户号；当分账账户id类型是loginName时，本参数为用户的支付宝登录号;当分账账户id类型是openId时，本参数为用户的在该应用下的支付宝OpenId; 当 trans_in_account_type 为defaultSettle时，本参数必须为空
   * @return transInAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101126708402", value = "分账转入账户id。当分账账户id类型是cardSerialNo时，本参数为用户在支付宝绑定的卡编号；当分账账户id类型是userId时，本参数为用户的支付宝账号对应的支付宝唯一用户号；当分账账户id类型是loginName时，本参数为用户的支付宝登录号;当分账账户id类型是openId时，本参数为用户的在该应用下的支付宝OpenId; 当 trans_in_account_type 为defaultSettle时，本参数必须为空")

  public String getTransInAccountId() {
    return transInAccountId;
  }


  public void setTransInAccountId(String transInAccountId) {
    this.transInAccountId = transInAccountId;
  }


  public RoyaltyDetailInfo transInAccountIdType(String transInAccountIdType) {
    
    this.transInAccountIdType = transInAccountIdType;
    return this;
  }

   /**
   * 分账转入账户id类型。 当trans_in_account_type 为bankCard时，本参数为cardSerialNo，表示分账账户id是银行卡编号; 当trans_in_account_type 为alipayBalance时，本参数为userId或者loginName或者openId，其中userId表示分账账户id是支付宝唯一用户号，loginName表示分账账户id是支付宝登录号，openId表示分账账户id是支付宝OpenId; 当 trans_in_account_type 为 defaultSettle 时，本参数必须为空。
   * @return transInAccountIdType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cardSerialNo", value = "分账转入账户id类型。 当trans_in_account_type 为bankCard时，本参数为cardSerialNo，表示分账账户id是银行卡编号; 当trans_in_account_type 为alipayBalance时，本参数为userId或者loginName或者openId，其中userId表示分账账户id是支付宝唯一用户号，loginName表示分账账户id是支付宝登录号，openId表示分账账户id是支付宝OpenId; 当 trans_in_account_type 为 defaultSettle 时，本参数必须为空。")

  public String getTransInAccountIdType() {
    return transInAccountIdType;
  }


  public void setTransInAccountIdType(String transInAccountIdType) {
    this.transInAccountIdType = transInAccountIdType;
  }


  public RoyaltyDetailInfo transInAccountType(String transInAccountType) {
    
    this.transInAccountType = transInAccountType;
    return this;
  }

   /**
   * 分账账户类型。 bankCard: 分账账户为银行卡； alipayBalance: 分账账户为支付宝余额户; defaultSettle: 按默认结算规则分账
   * @return transInAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipayBalance", value = "分账账户类型。 bankCard: 分账账户为银行卡； alipayBalance: 分账账户为支付宝余额户; defaultSettle: 按默认结算规则分账")

  public String getTransInAccountType() {
    return transInAccountType;
  }


  public void setTransInAccountType(String transInAccountType) {
    this.transInAccountType = transInAccountType;
  }


  public RoyaltyDetailInfo transInEntityBizType(String transInEntityBizType) {
    
    this.transInEntityBizType = transInEntityBizType;
    return this;
  }

   /**
   * 分账账户业务类型，目前仅支持已结算类型 settled
   * @return transInEntityBizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "settled", value = "分账账户业务类型，目前仅支持已结算类型 settled")

  public String getTransInEntityBizType() {
    return transInEntityBizType;
  }


  public void setTransInEntityBizType(String transInEntityBizType) {
    this.transInEntityBizType = transInEntityBizType;
  }


  public RoyaltyDetailInfo transInEntityId(String transInEntityId) {
    
    this.transInEntityId = transInEntityId;
    return this;
  }

   /**
   * 分账转出主体账 号。    当分账转出主体类型为SecondMerchant，本参数为二级商户的SecondMerchantID    当分账转出类型为Store，本参数为StoreID
   * @return transInEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SecondMerchant", value = "分账转出主体账 号。    当分账转出主体类型为SecondMerchant，本参数为二级商户的SecondMerchantID    当分账转出类型为Store，本参数为StoreID")

  public String getTransInEntityId() {
    return transInEntityId;
  }


  public void setTransInEntityId(String transInEntityId) {
    this.transInEntityId = transInEntityId;
  }


  public RoyaltyDetailInfo transInEntityType(String transInEntityType) {
    
    this.transInEntityType = transInEntityType;
    return this;
  }

   /**
   * 分账转入主体类型。 SecondMerchant：分账转入主体为二级商户 Store: 分账转入主体为门店
   * @return transInEntityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Store", value = "分账转入主体类型。 SecondMerchant：分账转入主体为二级商户 Store: 分账转入主体为门店")

  public String getTransInEntityType() {
    return transInEntityType;
  }


  public void setTransInEntityType(String transInEntityType) {
    this.transInEntityType = transInEntityType;
  }


  public RoyaltyDetailInfo transInSubMerchant(SubMerchant transInSubMerchant) {
    
    this.transInSubMerchant = transInSubMerchant;
    return this;
  }

   /**
   * Get transInSubMerchant
   * @return transInSubMerchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubMerchant getTransInSubMerchant() {
    return transInSubMerchant;
  }


  public void setTransInSubMerchant(SubMerchant transInSubMerchant) {
    this.transInSubMerchant = transInSubMerchant;
  }


  public RoyaltyDetailInfo transOutEntityBizType(String transOutEntityBizType) {
    
    this.transOutEntityBizType = transOutEntityBizType;
    return this;
  }

   /**
   * 分账转出方主体业务类型，目前仅支持已结算类型 settled
   * @return transOutEntityBizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "settled", value = "分账转出方主体业务类型，目前仅支持已结算类型 settled")

  public String getTransOutEntityBizType() {
    return transOutEntityBizType;
  }


  public void setTransOutEntityBizType(String transOutEntityBizType) {
    this.transOutEntityBizType = transOutEntityBizType;
  }


  public RoyaltyDetailInfo transOutEntityId(String transOutEntityId) {
    
    this.transOutEntityId = transOutEntityId;
    return this;
  }

   /**
   * 分账转出主体账。    当分账转出主体类型为SecondMerchant，本参数为二级商户的SecondMerchantId    当分账转出类型为Store，本参数为StoreID
   * @return transOutEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088", value = "分账转出主体账。    当分账转出主体类型为SecondMerchant，本参数为二级商户的SecondMerchantId    当分账转出类型为Store，本参数为StoreID")

  public String getTransOutEntityId() {
    return transOutEntityId;
  }


  public void setTransOutEntityId(String transOutEntityId) {
    this.transOutEntityId = transOutEntityId;
  }


  public RoyaltyDetailInfo transOutEntityType(String transOutEntityType) {
    
    this.transOutEntityType = transOutEntityType;
    return this;
  }

   /**
   * 分账转出主体类型。 SecondMerchant：结算主体为二级商户 Store: 结算主体为门店
   * @return transOutEntityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SecondMerchant", value = "分账转出主体类型。 SecondMerchant：结算主体为二级商户 Store: 结算主体为门店")

  public String getTransOutEntityType() {
    return transOutEntityType;
  }


  public void setTransOutEntityType(String transOutEntityType) {
    this.transOutEntityType = transOutEntityType;
  }


  public RoyaltyDetailInfo transOutSubMerchant(SubMerchant transOutSubMerchant) {
    
    this.transOutSubMerchant = transOutSubMerchant;
    return this;
  }

   /**
   * Get transOutSubMerchant
   * @return transOutSubMerchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubMerchant getTransOutSubMerchant() {
    return transOutSubMerchant;
  }


  public void setTransOutSubMerchant(SubMerchant transOutSubMerchant) {
    this.transOutSubMerchant = transOutSubMerchant;
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
   * @return the RoyaltyDetailInfo instance itself
   */
  public RoyaltyDetailInfo putAdditionalProperty(String key, Object value) {
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
    RoyaltyDetailInfo royaltyDetailInfo = (RoyaltyDetailInfo) o;
    return Objects.equals(this.amount, royaltyDetailInfo.amount) &&
        Objects.equals(this.desc, royaltyDetailInfo.desc) &&
        Objects.equals(this.scene, royaltyDetailInfo.scene) &&
        Objects.equals(this.transInAccountId, royaltyDetailInfo.transInAccountId) &&
        Objects.equals(this.transInAccountIdType, royaltyDetailInfo.transInAccountIdType) &&
        Objects.equals(this.transInAccountType, royaltyDetailInfo.transInAccountType) &&
        Objects.equals(this.transInEntityBizType, royaltyDetailInfo.transInEntityBizType) &&
        Objects.equals(this.transInEntityId, royaltyDetailInfo.transInEntityId) &&
        Objects.equals(this.transInEntityType, royaltyDetailInfo.transInEntityType) &&
        Objects.equals(this.transInSubMerchant, royaltyDetailInfo.transInSubMerchant) &&
        Objects.equals(this.transOutEntityBizType, royaltyDetailInfo.transOutEntityBizType) &&
        Objects.equals(this.transOutEntityId, royaltyDetailInfo.transOutEntityId) &&
        Objects.equals(this.transOutEntityType, royaltyDetailInfo.transOutEntityType) &&
        Objects.equals(this.transOutSubMerchant, royaltyDetailInfo.transOutSubMerchant)&&
        Objects.equals(this.additionalProperties, royaltyDetailInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, desc, scene, transInAccountId, transInAccountIdType, transInAccountType, transInEntityBizType, transInEntityId, transInEntityType, transInSubMerchant, transOutEntityBizType, transOutEntityId, transOutEntityType, transOutSubMerchant, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoyaltyDetailInfo {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
    sb.append("    transInAccountId: ").append(toIndentedString(transInAccountId)).append("\n");
    sb.append("    transInAccountIdType: ").append(toIndentedString(transInAccountIdType)).append("\n");
    sb.append("    transInAccountType: ").append(toIndentedString(transInAccountType)).append("\n");
    sb.append("    transInEntityBizType: ").append(toIndentedString(transInEntityBizType)).append("\n");
    sb.append("    transInEntityId: ").append(toIndentedString(transInEntityId)).append("\n");
    sb.append("    transInEntityType: ").append(toIndentedString(transInEntityType)).append("\n");
    sb.append("    transInSubMerchant: ").append(toIndentedString(transInSubMerchant)).append("\n");
    sb.append("    transOutEntityBizType: ").append(toIndentedString(transOutEntityBizType)).append("\n");
    sb.append("    transOutEntityId: ").append(toIndentedString(transOutEntityId)).append("\n");
    sb.append("    transOutEntityType: ").append(toIndentedString(transOutEntityType)).append("\n");
    sb.append("    transOutSubMerchant: ").append(toIndentedString(transOutSubMerchant)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("desc");
    openapiFields.add("scene");
    openapiFields.add("trans_in_account_id");
    openapiFields.add("trans_in_account_id_type");
    openapiFields.add("trans_in_account_type");
    openapiFields.add("trans_in_entity_biz_type");
    openapiFields.add("trans_in_entity_id");
    openapiFields.add("trans_in_entity_type");
    openapiFields.add("trans_in_sub_merchant");
    openapiFields.add("trans_out_entity_biz_type");
    openapiFields.add("trans_out_entity_id");
    openapiFields.add("trans_out_entity_type");
    openapiFields.add("trans_out_sub_merchant");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RoyaltyDetailInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RoyaltyDetailInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RoyaltyDetailInfo is not found in the empty JSON string", RoyaltyDetailInfo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("desc") != null && !jsonObj.get("desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desc").toString()));
      }
      if (jsonObj.get("scene") != null && !jsonObj.get("scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scene").toString()));
      }
      if (jsonObj.get("trans_in_account_id") != null && !jsonObj.get("trans_in_account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_account_id").toString()));
      }
      if (jsonObj.get("trans_in_account_id_type") != null && !jsonObj.get("trans_in_account_id_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_account_id_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_account_id_type").toString()));
      }
      if (jsonObj.get("trans_in_account_type") != null && !jsonObj.get("trans_in_account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_account_type").toString()));
      }
      if (jsonObj.get("trans_in_entity_biz_type") != null && !jsonObj.get("trans_in_entity_biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_entity_biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_entity_biz_type").toString()));
      }
      if (jsonObj.get("trans_in_entity_id") != null && !jsonObj.get("trans_in_entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_entity_id").toString()));
      }
      if (jsonObj.get("trans_in_entity_type") != null && !jsonObj.get("trans_in_entity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_entity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_entity_type").toString()));
      }
      // validate the optional field `trans_in_sub_merchant`
      if (jsonObj.getAsJsonObject("trans_in_sub_merchant") != null) {
        SubMerchant.validateJsonObject(jsonObj.getAsJsonObject("trans_in_sub_merchant"));
      }
      if (jsonObj.get("trans_out_entity_biz_type") != null && !jsonObj.get("trans_out_entity_biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_out_entity_biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_out_entity_biz_type").toString()));
      }
      if (jsonObj.get("trans_out_entity_id") != null && !jsonObj.get("trans_out_entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_out_entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_out_entity_id").toString()));
      }
      if (jsonObj.get("trans_out_entity_type") != null && !jsonObj.get("trans_out_entity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_out_entity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_out_entity_type").toString()));
      }
      // validate the optional field `trans_out_sub_merchant`
      if (jsonObj.getAsJsonObject("trans_out_sub_merchant") != null) {
        SubMerchant.validateJsonObject(jsonObj.getAsJsonObject("trans_out_sub_merchant"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RoyaltyDetailInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RoyaltyDetailInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RoyaltyDetailInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RoyaltyDetailInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<RoyaltyDetailInfo>() {
           @Override
           public void write(JsonWriter out, RoyaltyDetailInfo value) throws IOException {
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
           public RoyaltyDetailInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RoyaltyDetailInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RoyaltyDetailInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RoyaltyDetailInfo
  * @throws IOException if the JSON string is invalid with respect to RoyaltyDetailInfo
  */
  public static RoyaltyDetailInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RoyaltyDetailInfo.class);
  }

 /**
  * Convert an instance of RoyaltyDetailInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

