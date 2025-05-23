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
import com.alipay.v3.model.ExpenseConsumeInfo;
import com.alipay.v3.model.ExpenseInvoiceInfo;
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
 * ExpenseCtrlConsumeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExpenseCtrlConsumeInfo {
  public static final String SERIALIZED_NAME_EXPENSE_CONSUME_INFO = "expense_consume_info";
  @SerializedName(SERIALIZED_NAME_EXPENSE_CONSUME_INFO)
  private ExpenseConsumeInfo expenseConsumeInfo;

  public static final String SERIALIZED_NAME_RELATED_ENTERPRISE_CONSUME_LIST = "related_enterprise_consume_list";
  @SerializedName(SERIALIZED_NAME_RELATED_ENTERPRISE_CONSUME_LIST)
  private List<ExpenseConsumeInfo> relatedEnterpriseConsumeList = null;

  public static final String SERIALIZED_NAME_RELATED_ENTERPRISE_INVOICE_LIST = "related_enterprise_invoice_list";
  @SerializedName(SERIALIZED_NAME_RELATED_ENTERPRISE_INVOICE_LIST)
  private List<ExpenseInvoiceInfo> relatedEnterpriseInvoiceList = null;

  public ExpenseCtrlConsumeInfo() { 
  }

  public ExpenseCtrlConsumeInfo expenseConsumeInfo(ExpenseConsumeInfo expenseConsumeInfo) {
    
    this.expenseConsumeInfo = expenseConsumeInfo;
    return this;
  }

   /**
   * Get expenseConsumeInfo
   * @return expenseConsumeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExpenseConsumeInfo getExpenseConsumeInfo() {
    return expenseConsumeInfo;
  }


  public void setExpenseConsumeInfo(ExpenseConsumeInfo expenseConsumeInfo) {
    this.expenseConsumeInfo = expenseConsumeInfo;
  }


  public ExpenseCtrlConsumeInfo relatedEnterpriseConsumeList(List<ExpenseConsumeInfo> relatedEnterpriseConsumeList) {
    
    this.relatedEnterpriseConsumeList = relatedEnterpriseConsumeList;
    return this;
  }

  public ExpenseCtrlConsumeInfo addRelatedEnterpriseConsumeListItem(ExpenseConsumeInfo relatedEnterpriseConsumeListItem) {
    if (this.relatedEnterpriseConsumeList == null) {
      this.relatedEnterpriseConsumeList = new ArrayList<>();
    }
    this.relatedEnterpriseConsumeList.add(relatedEnterpriseConsumeListItem);
    return this;
  }

   /**
   * 关联凑票账单列表（开票限额，多次消费后合并开票）
   * @return relatedEnterpriseConsumeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "关联凑票账单列表（开票限额，多次消费后合并开票）")

  public List<ExpenseConsumeInfo> getRelatedEnterpriseConsumeList() {
    return relatedEnterpriseConsumeList;
  }


  public void setRelatedEnterpriseConsumeList(List<ExpenseConsumeInfo> relatedEnterpriseConsumeList) {
    this.relatedEnterpriseConsumeList = relatedEnterpriseConsumeList;
  }


  public ExpenseCtrlConsumeInfo relatedEnterpriseInvoiceList(List<ExpenseInvoiceInfo> relatedEnterpriseInvoiceList) {
    
    this.relatedEnterpriseInvoiceList = relatedEnterpriseInvoiceList;
    return this;
  }

  public ExpenseCtrlConsumeInfo addRelatedEnterpriseInvoiceListItem(ExpenseInvoiceInfo relatedEnterpriseInvoiceListItem) {
    if (this.relatedEnterpriseInvoiceList == null) {
      this.relatedEnterpriseInvoiceList = new ArrayList<>();
    }
    this.relatedEnterpriseInvoiceList.add(relatedEnterpriseInvoiceListItem);
    return this;
  }

   /**
   * 关联发票凭证对象
   * @return relatedEnterpriseInvoiceList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "关联发票凭证对象")

  public List<ExpenseInvoiceInfo> getRelatedEnterpriseInvoiceList() {
    return relatedEnterpriseInvoiceList;
  }


  public void setRelatedEnterpriseInvoiceList(List<ExpenseInvoiceInfo> relatedEnterpriseInvoiceList) {
    this.relatedEnterpriseInvoiceList = relatedEnterpriseInvoiceList;
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
   * @return the ExpenseCtrlConsumeInfo instance itself
   */
  public ExpenseCtrlConsumeInfo putAdditionalProperty(String key, Object value) {
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
    ExpenseCtrlConsumeInfo expenseCtrlConsumeInfo = (ExpenseCtrlConsumeInfo) o;
    return Objects.equals(this.expenseConsumeInfo, expenseCtrlConsumeInfo.expenseConsumeInfo) &&
        Objects.equals(this.relatedEnterpriseConsumeList, expenseCtrlConsumeInfo.relatedEnterpriseConsumeList) &&
        Objects.equals(this.relatedEnterpriseInvoiceList, expenseCtrlConsumeInfo.relatedEnterpriseInvoiceList)&&
        Objects.equals(this.additionalProperties, expenseCtrlConsumeInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expenseConsumeInfo, relatedEnterpriseConsumeList, relatedEnterpriseInvoiceList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseCtrlConsumeInfo {\n");
    sb.append("    expenseConsumeInfo: ").append(toIndentedString(expenseConsumeInfo)).append("\n");
    sb.append("    relatedEnterpriseConsumeList: ").append(toIndentedString(relatedEnterpriseConsumeList)).append("\n");
    sb.append("    relatedEnterpriseInvoiceList: ").append(toIndentedString(relatedEnterpriseInvoiceList)).append("\n");
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
    openapiFields.add("expense_consume_info");
    openapiFields.add("related_enterprise_consume_list");
    openapiFields.add("related_enterprise_invoice_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExpenseCtrlConsumeInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExpenseCtrlConsumeInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExpenseCtrlConsumeInfo is not found in the empty JSON string", ExpenseCtrlConsumeInfo.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `expense_consume_info`
      if (jsonObj.getAsJsonObject("expense_consume_info") != null) {
        ExpenseConsumeInfo.validateJsonObject(jsonObj.getAsJsonObject("expense_consume_info"));
      }
      JsonArray jsonArrayrelatedEnterpriseConsumeList = jsonObj.getAsJsonArray("related_enterprise_consume_list");
      if (jsonArrayrelatedEnterpriseConsumeList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("related_enterprise_consume_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `related_enterprise_consume_list` to be an array in the JSON string but got `%s`", jsonObj.get("related_enterprise_consume_list").toString()));
        }

        // validate the optional field `related_enterprise_consume_list` (array)
        for (int i = 0; i < jsonArrayrelatedEnterpriseConsumeList.size(); i++) {
          ExpenseConsumeInfo.validateJsonObject(jsonArrayrelatedEnterpriseConsumeList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayrelatedEnterpriseInvoiceList = jsonObj.getAsJsonArray("related_enterprise_invoice_list");
      if (jsonArrayrelatedEnterpriseInvoiceList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("related_enterprise_invoice_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `related_enterprise_invoice_list` to be an array in the JSON string but got `%s`", jsonObj.get("related_enterprise_invoice_list").toString()));
        }

        // validate the optional field `related_enterprise_invoice_list` (array)
        for (int i = 0; i < jsonArrayrelatedEnterpriseInvoiceList.size(); i++) {
          ExpenseInvoiceInfo.validateJsonObject(jsonArrayrelatedEnterpriseInvoiceList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExpenseCtrlConsumeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExpenseCtrlConsumeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExpenseCtrlConsumeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExpenseCtrlConsumeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ExpenseCtrlConsumeInfo>() {
           @Override
           public void write(JsonWriter out, ExpenseCtrlConsumeInfo value) throws IOException {
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
           public ExpenseCtrlConsumeInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExpenseCtrlConsumeInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExpenseCtrlConsumeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExpenseCtrlConsumeInfo
  * @throws IOException if the JSON string is invalid with respect to ExpenseCtrlConsumeInfo
  */
  public static ExpenseCtrlConsumeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExpenseCtrlConsumeInfo.class);
  }

 /**
  * Convert an instance of ExpenseCtrlConsumeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

