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
import com.alipay.v3.model.DiscountVoucher;
import com.alipay.v3.model.ExchangeVoucher;
import com.alipay.v3.model.FixVoucher;
import com.alipay.v3.model.SpecialVoucher;
import com.alipay.v3.model.VoucherAvailableScope;
import com.alipay.v3.model.VoucherValidPeriod;
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
 * VoucherUseRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherUseRule {
  public static final String SERIALIZED_NAME_DISCOUNT_VOUCHER = "discount_voucher";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_VOUCHER)
  private DiscountVoucher discountVoucher;

  public static final String SERIALIZED_NAME_EXCHANGE_VOUCHER = "exchange_voucher";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_VOUCHER)
  private ExchangeVoucher exchangeVoucher;

  public static final String SERIALIZED_NAME_FIX_VOUCHER = "fix_voucher";
  @SerializedName(SERIALIZED_NAME_FIX_VOUCHER)
  private FixVoucher fixVoucher;

  public static final String SERIALIZED_NAME_SPECIAL_VOUCHER = "special_voucher";
  @SerializedName(SERIALIZED_NAME_SPECIAL_VOUCHER)
  private SpecialVoucher specialVoucher;

  public static final String SERIALIZED_NAME_VOUCHER_AVAILABLE_SCOPE = "voucher_available_scope";
  @SerializedName(SERIALIZED_NAME_VOUCHER_AVAILABLE_SCOPE)
  private VoucherAvailableScope voucherAvailableScope;

  public static final String SERIALIZED_NAME_VOUCHER_VALID_PERIOD = "voucher_valid_period";
  @SerializedName(SERIALIZED_NAME_VOUCHER_VALID_PERIOD)
  private VoucherValidPeriod voucherValidPeriod;

  public VoucherUseRule() { 
  }

  public VoucherUseRule discountVoucher(DiscountVoucher discountVoucher) {
    
    this.discountVoucher = discountVoucher;
    return this;
  }

   /**
   * Get discountVoucher
   * @return discountVoucher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DiscountVoucher getDiscountVoucher() {
    return discountVoucher;
  }


  public void setDiscountVoucher(DiscountVoucher discountVoucher) {
    this.discountVoucher = discountVoucher;
  }


  public VoucherUseRule exchangeVoucher(ExchangeVoucher exchangeVoucher) {
    
    this.exchangeVoucher = exchangeVoucher;
    return this;
  }

   /**
   * Get exchangeVoucher
   * @return exchangeVoucher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExchangeVoucher getExchangeVoucher() {
    return exchangeVoucher;
  }


  public void setExchangeVoucher(ExchangeVoucher exchangeVoucher) {
    this.exchangeVoucher = exchangeVoucher;
  }


  public VoucherUseRule fixVoucher(FixVoucher fixVoucher) {
    
    this.fixVoucher = fixVoucher;
    return this;
  }

   /**
   * Get fixVoucher
   * @return fixVoucher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FixVoucher getFixVoucher() {
    return fixVoucher;
  }


  public void setFixVoucher(FixVoucher fixVoucher) {
    this.fixVoucher = fixVoucher;
  }


  public VoucherUseRule specialVoucher(SpecialVoucher specialVoucher) {
    
    this.specialVoucher = specialVoucher;
    return this;
  }

   /**
   * Get specialVoucher
   * @return specialVoucher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpecialVoucher getSpecialVoucher() {
    return specialVoucher;
  }


  public void setSpecialVoucher(SpecialVoucher specialVoucher) {
    this.specialVoucher = specialVoucher;
  }


  public VoucherUseRule voucherAvailableScope(VoucherAvailableScope voucherAvailableScope) {
    
    this.voucherAvailableScope = voucherAvailableScope;
    return this;
  }

   /**
   * Get voucherAvailableScope
   * @return voucherAvailableScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherAvailableScope getVoucherAvailableScope() {
    return voucherAvailableScope;
  }


  public void setVoucherAvailableScope(VoucherAvailableScope voucherAvailableScope) {
    this.voucherAvailableScope = voucherAvailableScope;
  }


  public VoucherUseRule voucherValidPeriod(VoucherValidPeriod voucherValidPeriod) {
    
    this.voucherValidPeriod = voucherValidPeriod;
    return this;
  }

   /**
   * Get voucherValidPeriod
   * @return voucherValidPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherValidPeriod getVoucherValidPeriod() {
    return voucherValidPeriod;
  }


  public void setVoucherValidPeriod(VoucherValidPeriod voucherValidPeriod) {
    this.voucherValidPeriod = voucherValidPeriod;
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
   * @return the VoucherUseRule instance itself
   */
  public VoucherUseRule putAdditionalProperty(String key, Object value) {
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
    VoucherUseRule voucherUseRule = (VoucherUseRule) o;
    return Objects.equals(this.discountVoucher, voucherUseRule.discountVoucher) &&
        Objects.equals(this.exchangeVoucher, voucherUseRule.exchangeVoucher) &&
        Objects.equals(this.fixVoucher, voucherUseRule.fixVoucher) &&
        Objects.equals(this.specialVoucher, voucherUseRule.specialVoucher) &&
        Objects.equals(this.voucherAvailableScope, voucherUseRule.voucherAvailableScope) &&
        Objects.equals(this.voucherValidPeriod, voucherUseRule.voucherValidPeriod)&&
        Objects.equals(this.additionalProperties, voucherUseRule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountVoucher, exchangeVoucher, fixVoucher, specialVoucher, voucherAvailableScope, voucherValidPeriod, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherUseRule {\n");
    sb.append("    discountVoucher: ").append(toIndentedString(discountVoucher)).append("\n");
    sb.append("    exchangeVoucher: ").append(toIndentedString(exchangeVoucher)).append("\n");
    sb.append("    fixVoucher: ").append(toIndentedString(fixVoucher)).append("\n");
    sb.append("    specialVoucher: ").append(toIndentedString(specialVoucher)).append("\n");
    sb.append("    voucherAvailableScope: ").append(toIndentedString(voucherAvailableScope)).append("\n");
    sb.append("    voucherValidPeriod: ").append(toIndentedString(voucherValidPeriod)).append("\n");
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
    openapiFields.add("discount_voucher");
    openapiFields.add("exchange_voucher");
    openapiFields.add("fix_voucher");
    openapiFields.add("special_voucher");
    openapiFields.add("voucher_available_scope");
    openapiFields.add("voucher_valid_period");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherUseRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherUseRule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherUseRule is not found in the empty JSON string", VoucherUseRule.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `discount_voucher`
      if (jsonObj.getAsJsonObject("discount_voucher") != null) {
        DiscountVoucher.validateJsonObject(jsonObj.getAsJsonObject("discount_voucher"));
      }
      // validate the optional field `exchange_voucher`
      if (jsonObj.getAsJsonObject("exchange_voucher") != null) {
        ExchangeVoucher.validateJsonObject(jsonObj.getAsJsonObject("exchange_voucher"));
      }
      // validate the optional field `fix_voucher`
      if (jsonObj.getAsJsonObject("fix_voucher") != null) {
        FixVoucher.validateJsonObject(jsonObj.getAsJsonObject("fix_voucher"));
      }
      // validate the optional field `special_voucher`
      if (jsonObj.getAsJsonObject("special_voucher") != null) {
        SpecialVoucher.validateJsonObject(jsonObj.getAsJsonObject("special_voucher"));
      }
      // validate the optional field `voucher_available_scope`
      if (jsonObj.getAsJsonObject("voucher_available_scope") != null) {
        VoucherAvailableScope.validateJsonObject(jsonObj.getAsJsonObject("voucher_available_scope"));
      }
      // validate the optional field `voucher_valid_period`
      if (jsonObj.getAsJsonObject("voucher_valid_period") != null) {
        VoucherValidPeriod.validateJsonObject(jsonObj.getAsJsonObject("voucher_valid_period"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherUseRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherUseRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherUseRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherUseRule.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherUseRule>() {
           @Override
           public void write(JsonWriter out, VoucherUseRule value) throws IOException {
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
           public VoucherUseRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VoucherUseRule instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VoucherUseRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherUseRule
  * @throws IOException if the JSON string is invalid with respect to VoucherUseRule
  */
  public static VoucherUseRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherUseRule.class);
  }

 /**
  * Convert an instance of VoucherUseRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

