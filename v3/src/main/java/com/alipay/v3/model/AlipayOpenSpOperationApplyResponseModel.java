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
import com.alipay.v3.model.RecommendAccountDTO;
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
 * AlipayOpenSpOperationApplyResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSpOperationApplyResponseModel {
  public static final String SERIALIZED_NAME_BATCH_NO = "batch_no";
  @SerializedName(SERIALIZED_NAME_BATCH_NO)
  private String batchNo;

  public static final String SERIALIZED_NAME_BIND_ACCOUNT = "bind_account";
  @SerializedName(SERIALIZED_NAME_BIND_ACCOUNT)
  private RecommendAccountDTO bindAccount;

  public static final String SERIALIZED_NAME_RECOMMEND_ACCOUNTS = "recommend_accounts";
  @SerializedName(SERIALIZED_NAME_RECOMMEND_ACCOUNTS)
  private List<RecommendAccountDTO> recommendAccounts = null;

  public AlipayOpenSpOperationApplyResponseModel() { 
  }

  public AlipayOpenSpOperationApplyResponseModel batchNo(String batchNo) {
    
    this.batchNo = batchNo;
    return this;
  }

   /**
   * 支付宝操作批次号
   * @return batchNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020222342342", value = "支付宝操作批次号")

  public String getBatchNo() {
    return batchNo;
  }


  public void setBatchNo(String batchNo) {
    this.batchNo = batchNo;
  }


  public AlipayOpenSpOperationApplyResponseModel bindAccount(RecommendAccountDTO bindAccount) {
    
    this.bindAccount = bindAccount;
    return this;
  }

   /**
   * Get bindAccount
   * @return bindAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecommendAccountDTO getBindAccount() {
    return bindAccount;
  }


  public void setBindAccount(RecommendAccountDTO bindAccount) {
    this.bindAccount = bindAccount;
  }


  public AlipayOpenSpOperationApplyResponseModel recommendAccounts(List<RecommendAccountDTO> recommendAccounts) {
    
    this.recommendAccounts = recommendAccounts;
    return this;
  }

  public AlipayOpenSpOperationApplyResponseModel addRecommendAccountsItem(RecommendAccountDTO recommendAccountsItem) {
    if (this.recommendAccounts == null) {
      this.recommendAccounts = new ArrayList<>();
    }
    this.recommendAccounts.add(recommendAccountsItem);
    return this;
  }

   /**
   * 只针对服务商代间连商家发起代运营绑定、授权时，如果传递的alipay_account不符合绑定或授权要求，这个字段会返回推荐的商家支付宝账号列表，包括：支付宝账号和名称，为保护商家信息，账号和名称都按照规范脱敏。
   * @return recommendAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "只针对服务商代间连商家发起代运营绑定、授权时，如果传递的alipay_account不符合绑定或授权要求，这个字段会返回推荐的商家支付宝账号列表，包括：支付宝账号和名称，为保护商家信息，账号和名称都按照规范脱敏。")

  public List<RecommendAccountDTO> getRecommendAccounts() {
    return recommendAccounts;
  }


  public void setRecommendAccounts(List<RecommendAccountDTO> recommendAccounts) {
    this.recommendAccounts = recommendAccounts;
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
   * @return the AlipayOpenSpOperationApplyResponseModel instance itself
   */
  public AlipayOpenSpOperationApplyResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenSpOperationApplyResponseModel alipayOpenSpOperationApplyResponseModel = (AlipayOpenSpOperationApplyResponseModel) o;
    return Objects.equals(this.batchNo, alipayOpenSpOperationApplyResponseModel.batchNo) &&
        Objects.equals(this.bindAccount, alipayOpenSpOperationApplyResponseModel.bindAccount) &&
        Objects.equals(this.recommendAccounts, alipayOpenSpOperationApplyResponseModel.recommendAccounts)&&
        Objects.equals(this.additionalProperties, alipayOpenSpOperationApplyResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchNo, bindAccount, recommendAccounts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSpOperationApplyResponseModel {\n");
    sb.append("    batchNo: ").append(toIndentedString(batchNo)).append("\n");
    sb.append("    bindAccount: ").append(toIndentedString(bindAccount)).append("\n");
    sb.append("    recommendAccounts: ").append(toIndentedString(recommendAccounts)).append("\n");
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
    openapiFields.add("batch_no");
    openapiFields.add("bind_account");
    openapiFields.add("recommend_accounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSpOperationApplyResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSpOperationApplyResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSpOperationApplyResponseModel is not found in the empty JSON string", AlipayOpenSpOperationApplyResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("batch_no") != null && !jsonObj.get("batch_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_no").toString()));
      }
      // validate the optional field `bind_account`
      if (jsonObj.getAsJsonObject("bind_account") != null) {
        RecommendAccountDTO.validateJsonObject(jsonObj.getAsJsonObject("bind_account"));
      }
      JsonArray jsonArrayrecommendAccounts = jsonObj.getAsJsonArray("recommend_accounts");
      if (jsonArrayrecommendAccounts != null) {
        // ensure the json data is an array
        if (!jsonObj.get("recommend_accounts").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `recommend_accounts` to be an array in the JSON string but got `%s`", jsonObj.get("recommend_accounts").toString()));
        }

        // validate the optional field `recommend_accounts` (array)
        for (int i = 0; i < jsonArrayrecommendAccounts.size(); i++) {
          RecommendAccountDTO.validateJsonObject(jsonArrayrecommendAccounts.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSpOperationApplyResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSpOperationApplyResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSpOperationApplyResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSpOperationApplyResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSpOperationApplyResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSpOperationApplyResponseModel value) throws IOException {
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
           public AlipayOpenSpOperationApplyResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenSpOperationApplyResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenSpOperationApplyResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSpOperationApplyResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSpOperationApplyResponseModel
  */
  public static AlipayOpenSpOperationApplyResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSpOperationApplyResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSpOperationApplyResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

