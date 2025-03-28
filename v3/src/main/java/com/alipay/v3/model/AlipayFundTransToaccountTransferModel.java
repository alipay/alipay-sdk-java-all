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
 * AlipayFundTransToaccountTransferModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundTransToaccountTransferModel {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_EXT_PARAM = "ext_param";
  @SerializedName(SERIALIZED_NAME_EXT_PARAM)
  private String extParam;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PAYEE_ACCOUNT = "payee_account";
  @SerializedName(SERIALIZED_NAME_PAYEE_ACCOUNT)
  private String payeeAccount;

  public static final String SERIALIZED_NAME_PAYEE_REAL_NAME = "payee_real_name";
  @SerializedName(SERIALIZED_NAME_PAYEE_REAL_NAME)
  private String payeeRealName;

  public static final String SERIALIZED_NAME_PAYEE_TYPE = "payee_type";
  @SerializedName(SERIALIZED_NAME_PAYEE_TYPE)
  private String payeeType;

  public static final String SERIALIZED_NAME_PAYER_REAL_NAME = "payer_real_name";
  @SerializedName(SERIALIZED_NAME_PAYER_REAL_NAME)
  private String payerRealName;

  public static final String SERIALIZED_NAME_PAYER_SHOW_NAME = "payer_show_name";
  @SerializedName(SERIALIZED_NAME_PAYER_SHOW_NAME)
  private String payerShowName;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark;

  public AlipayFundTransToaccountTransferModel() { 
  }

  public AlipayFundTransToaccountTransferModel amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 转账金额，单位：元。  只支持2位小数，小数点前最大支持13位，金额必须大于等于0.1元。   最大转账金额以实际签约的限额为准。
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12.23", value = "转账金额，单位：元。  只支持2位小数，小数点前最大支持13位，金额必须大于等于0.1元。   最大转账金额以实际签约的限额为准。")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public AlipayFundTransToaccountTransferModel extParam(String extParam) {
    
    this.extParam = extParam;
    return this;
  }

   /**
   * 扩展参数，json字符串格式，目前仅支持的key&#x3D;order_title，表示收款方的转账账单标题，value可以根据自己的业务定制。
   * @return extParam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"order_title\":\"兑奖红包\"}", value = "扩展参数，json字符串格式，目前仅支持的key=order_title，表示收款方的转账账单标题，value可以根据自己的业务定制。")

  public String getExtParam() {
    return extParam;
  }


  public void setExtParam(String extParam) {
    this.extParam = extParam;
  }


  public AlipayFundTransToaccountTransferModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 商户转账唯一订单号。发起转账来源方定义的转账单据ID，用于将转账回执通知给来源方。  不同来源方给出的ID可以重复，同一个来源方必须保证其ID的唯一性。  只支持半角英文、数字，及“-”、“_”。
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3142321423432", value = "商户转账唯一订单号。发起转账来源方定义的转账单据ID，用于将转账回执通知给来源方。  不同来源方给出的ID可以重复，同一个来源方必须保证其ID的唯一性。  只支持半角英文、数字，及“-”、“_”。")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayFundTransToaccountTransferModel payeeAccount(String payeeAccount) {
    
    this.payeeAccount = payeeAccount;
    return this;
  }

   /**
   * 收款方账户。与payee_type配合使用。付款方和收款方不能是同一个账户。
   * @return payeeAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abc@sina.com", value = "收款方账户。与payee_type配合使用。付款方和收款方不能是同一个账户。")

  public String getPayeeAccount() {
    return payeeAccount;
  }


  public void setPayeeAccount(String payeeAccount) {
    this.payeeAccount = payeeAccount;
  }


  public AlipayFundTransToaccountTransferModel payeeRealName(String payeeRealName) {
    
    this.payeeRealName = payeeRealName;
    return this;
  }

   /**
   * 收款方真实姓名（最长支持100个英文/50个汉字）。  如果本参数不为空，则会校验该账户在支付宝登记的实名是否与收款方真实姓名一致。
   * @return payeeRealName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "收款方真实姓名（最长支持100个英文/50个汉字）。  如果本参数不为空，则会校验该账户在支付宝登记的实名是否与收款方真实姓名一致。")

  public String getPayeeRealName() {
    return payeeRealName;
  }


  public void setPayeeRealName(String payeeRealName) {
    this.payeeRealName = payeeRealName;
  }


  public AlipayFundTransToaccountTransferModel payeeType(String payeeType) {
    
    this.payeeType = payeeType;
    return this;
  }

   /**
   * 收款方账户类型。可取值： 1、ALIPAY_USERID：支付宝账号对应的支付宝唯一用户号。以2088开头的16位纯数字组成。 2、ALIPAY_LOGONID：支付宝登录号，支持邮箱和手机号格式。 2、ALIPAY_OPENID：支付宝openid
   * @return payeeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ALIPAY_LOGONID", value = "收款方账户类型。可取值： 1、ALIPAY_USERID：支付宝账号对应的支付宝唯一用户号。以2088开头的16位纯数字组成。 2、ALIPAY_LOGONID：支付宝登录号，支持邮箱和手机号格式。 2、ALIPAY_OPENID：支付宝openid")

  public String getPayeeType() {
    return payeeType;
  }


  public void setPayeeType(String payeeType) {
    this.payeeType = payeeType;
  }


  public AlipayFundTransToaccountTransferModel payerRealName(String payerRealName) {
    
    this.payerRealName = payerRealName;
    return this;
  }

   /**
   * 付款方真实姓名（最长支持100个英文/50个汉字）。  如果本参数不为空，则会校验该账户在支付宝登记的实名是否与付款方真实姓名一致。
   * @return payerRealName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "上海交通卡公司", value = "付款方真实姓名（最长支持100个英文/50个汉字）。  如果本参数不为空，则会校验该账户在支付宝登记的实名是否与付款方真实姓名一致。")

  public String getPayerRealName() {
    return payerRealName;
  }


  public void setPayerRealName(String payerRealName) {
    this.payerRealName = payerRealName;
  }


  public AlipayFundTransToaccountTransferModel payerShowName(String payerShowName) {
    
    this.payerShowName = payerShowName;
    return this;
  }

   /**
   * 付款方姓名（最长支持100个英文/50个汉字）。显示在收款方的账单详情页。如果该字段不传，则默认显示付款方的支付宝认证姓名或单位名称。
   * @return payerShowName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "上海交通卡退款", value = "付款方姓名（最长支持100个英文/50个汉字）。显示在收款方的账单详情页。如果该字段不传，则默认显示付款方的支付宝认证姓名或单位名称。")

  public String getPayerShowName() {
    return payerShowName;
  }


  public void setPayerShowName(String payerShowName) {
    this.payerShowName = payerShowName;
  }


  public AlipayFundTransToaccountTransferModel remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 转账备注（支持200个英文/100个汉字）。  当付款方为企业账户，且转账金额达到（大于等于）50000元，remark不能为空。收款方可见，会展示在收款用户的收支详情中。
   * @return remark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "转账备注", value = "转账备注（支持200个英文/100个汉字）。  当付款方为企业账户，且转账金额达到（大于等于）50000元，remark不能为空。收款方可见，会展示在收款用户的收支详情中。")

  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
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
   * @return the AlipayFundTransToaccountTransferModel instance itself
   */
  public AlipayFundTransToaccountTransferModel putAdditionalProperty(String key, Object value) {
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
    AlipayFundTransToaccountTransferModel alipayFundTransToaccountTransferModel = (AlipayFundTransToaccountTransferModel) o;
    return Objects.equals(this.amount, alipayFundTransToaccountTransferModel.amount) &&
        Objects.equals(this.extParam, alipayFundTransToaccountTransferModel.extParam) &&
        Objects.equals(this.outBizNo, alipayFundTransToaccountTransferModel.outBizNo) &&
        Objects.equals(this.payeeAccount, alipayFundTransToaccountTransferModel.payeeAccount) &&
        Objects.equals(this.payeeRealName, alipayFundTransToaccountTransferModel.payeeRealName) &&
        Objects.equals(this.payeeType, alipayFundTransToaccountTransferModel.payeeType) &&
        Objects.equals(this.payerRealName, alipayFundTransToaccountTransferModel.payerRealName) &&
        Objects.equals(this.payerShowName, alipayFundTransToaccountTransferModel.payerShowName) &&
        Objects.equals(this.remark, alipayFundTransToaccountTransferModel.remark)&&
        Objects.equals(this.additionalProperties, alipayFundTransToaccountTransferModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, extParam, outBizNo, payeeAccount, payeeRealName, payeeType, payerRealName, payerShowName, remark, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundTransToaccountTransferModel {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    extParam: ").append(toIndentedString(extParam)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    payeeAccount: ").append(toIndentedString(payeeAccount)).append("\n");
    sb.append("    payeeRealName: ").append(toIndentedString(payeeRealName)).append("\n");
    sb.append("    payeeType: ").append(toIndentedString(payeeType)).append("\n");
    sb.append("    payerRealName: ").append(toIndentedString(payerRealName)).append("\n");
    sb.append("    payerShowName: ").append(toIndentedString(payerShowName)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
    openapiFields.add("ext_param");
    openapiFields.add("out_biz_no");
    openapiFields.add("payee_account");
    openapiFields.add("payee_real_name");
    openapiFields.add("payee_type");
    openapiFields.add("payer_real_name");
    openapiFields.add("payer_show_name");
    openapiFields.add("remark");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundTransToaccountTransferModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundTransToaccountTransferModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundTransToaccountTransferModel is not found in the empty JSON string", AlipayFundTransToaccountTransferModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("ext_param") != null && !jsonObj.get("ext_param").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_param` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_param").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("payee_account") != null && !jsonObj.get("payee_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_account").toString()));
      }
      if (jsonObj.get("payee_real_name") != null && !jsonObj.get("payee_real_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_real_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_real_name").toString()));
      }
      if (jsonObj.get("payee_type") != null && !jsonObj.get("payee_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_type").toString()));
      }
      if (jsonObj.get("payer_real_name") != null && !jsonObj.get("payer_real_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_real_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_real_name").toString()));
      }
      if (jsonObj.get("payer_show_name") != null && !jsonObj.get("payer_show_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_show_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_show_name").toString()));
      }
      if (jsonObj.get("remark") != null && !jsonObj.get("remark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remark").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundTransToaccountTransferModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundTransToaccountTransferModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundTransToaccountTransferModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundTransToaccountTransferModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundTransToaccountTransferModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundTransToaccountTransferModel value) throws IOException {
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
           public AlipayFundTransToaccountTransferModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayFundTransToaccountTransferModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayFundTransToaccountTransferModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundTransToaccountTransferModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundTransToaccountTransferModel
  */
  public static AlipayFundTransToaccountTransferModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundTransToaccountTransferModel.class);
  }

 /**
  * Convert an instance of AlipayFundTransToaccountTransferModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

