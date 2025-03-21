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
 * OpenApiRoyaltyDetailInfoPojo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OpenApiRoyaltyDetailInfoPojo {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_AMOUNT_PERCENTAGE = "amount_percentage";
  @SerializedName(SERIALIZED_NAME_AMOUNT_PERCENTAGE)
  private Integer amountPercentage;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public static final String SERIALIZED_NAME_ROYALTY_SCENE = "royalty_scene";
  @SerializedName(SERIALIZED_NAME_ROYALTY_SCENE)
  private String royaltyScene;

  public static final String SERIALIZED_NAME_ROYALTY_TYPE = "royalty_type";
  @SerializedName(SERIALIZED_NAME_ROYALTY_TYPE)
  private String royaltyType;

  public static final String SERIALIZED_NAME_TRANS_IN = "trans_in";
  @SerializedName(SERIALIZED_NAME_TRANS_IN)
  private String transIn;

  public static final String SERIALIZED_NAME_TRANS_IN_NAME = "trans_in_name";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_NAME)
  private String transInName;

  public static final String SERIALIZED_NAME_TRANS_IN_TYPE = "trans_in_type";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_TYPE)
  private String transInType;

  public static final String SERIALIZED_NAME_TRANS_OUT = "trans_out";
  @SerializedName(SERIALIZED_NAME_TRANS_OUT)
  private String transOut;

  public static final String SERIALIZED_NAME_TRANS_OUT_TYPE = "trans_out_type";
  @SerializedName(SERIALIZED_NAME_TRANS_OUT_TYPE)
  private String transOutType;

  public OpenApiRoyaltyDetailInfoPojo() { 
  }

  public OpenApiRoyaltyDetailInfoPojo amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 分账的金额，单位为元
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账的金额，单位为元")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public OpenApiRoyaltyDetailInfoPojo amountPercentage(Integer amountPercentage) {
    
    this.amountPercentage = amountPercentage;
    return this;
  }

   /**
   * 分账信息中分账百分比。取值范围为大于0，少于或等于100的整数。
   * @return amountPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账信息中分账百分比。取值范围为大于0，少于或等于100的整数。")

  public Integer getAmountPercentage() {
    return amountPercentage;
  }


  public void setAmountPercentage(Integer amountPercentage) {
    this.amountPercentage = amountPercentage;
  }


  public OpenApiRoyaltyDetailInfoPojo desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 分账描述
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账描述")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public OpenApiRoyaltyDetailInfoPojo royaltyScene(String royaltyScene) {
    
    this.royaltyScene = royaltyScene;
    return this;
  }

   /**
   * 可选值：达人佣金、平台服务费、技术服务费、其他
   * @return royaltyScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "可选值：达人佣金、平台服务费、技术服务费、其他")

  public String getRoyaltyScene() {
    return royaltyScene;
  }


  public void setRoyaltyScene(String royaltyScene) {
    this.royaltyScene = royaltyScene;
  }


  public OpenApiRoyaltyDetailInfoPojo royaltyType(String royaltyType) {
    
    this.royaltyType = royaltyType;
    return this;
  }

   /**
   * 分账类型.
   * @return royaltyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账类型.")

  public String getRoyaltyType() {
    return royaltyType;
  }


  public void setRoyaltyType(String royaltyType) {
    this.royaltyType = royaltyType;
  }


  public OpenApiRoyaltyDetailInfoPojo transIn(String transIn) {
    
    this.transIn = transIn;
    return this;
  }

   /**
   * 收入方账户。如果收入方账户类型为userId，本参数为收入方的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字；如果收入方类型为cardAliasNo，本参数为收入方在支付宝绑定的卡编号；如果收入方类型为loginName，本参数为收入方的支付宝登录号；
   * @return transIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "收入方账户。如果收入方账户类型为userId，本参数为收入方的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字；如果收入方类型为cardAliasNo，本参数为收入方在支付宝绑定的卡编号；如果收入方类型为loginName，本参数为收入方的支付宝登录号；")

  public String getTransIn() {
    return transIn;
  }


  public void setTransIn(String transIn) {
    this.transIn = transIn;
  }


  public OpenApiRoyaltyDetailInfoPojo transInName(String transInName) {
    
    this.transInName = transInName;
    return this;
  }

   /**
   * 分账收款方姓名，上送则进行姓名与支付宝账号的一致性校验，校验不一致则分账失败。不上送则不进行姓名校验
   * @return transInName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账收款方姓名，上送则进行姓名与支付宝账号的一致性校验，校验不一致则分账失败。不上送则不进行姓名校验")

  public String getTransInName() {
    return transInName;
  }


  public void setTransInName(String transInName) {
    this.transInName = transInName;
  }


  public OpenApiRoyaltyDetailInfoPojo transInType(String transInType) {
    
    this.transInType = transInType;
    return this;
  }

   /**
   * 收入方账户类型。
   * @return transInType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "收入方账户类型。")

  public String getTransInType() {
    return transInType;
  }


  public void setTransInType(String transInType) {
    this.transInType = transInType;
  }


  public OpenApiRoyaltyDetailInfoPojo transOut(String transOut) {
    
    this.transOut = transOut;
    return this;
  }

   /**
   * 支出方账户。如果支出方账户类型为userId，本参数为支出方的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字；如果支出方类型为loginName，本参数为支出方的支付宝登录号。 泛金融类商户分账时，该字段不要上送。
   * @return transOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支出方账户。如果支出方账户类型为userId，本参数为支出方的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字；如果支出方类型为loginName，本参数为支出方的支付宝登录号。 泛金融类商户分账时，该字段不要上送。")

  public String getTransOut() {
    return transOut;
  }


  public void setTransOut(String transOut) {
    this.transOut = transOut;
  }


  public OpenApiRoyaltyDetailInfoPojo transOutType(String transOutType) {
    
    this.transOutType = transOutType;
    return this;
  }

   /**
   * 支出方账户类型。
   * @return transOutType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支出方账户类型。")

  public String getTransOutType() {
    return transOutType;
  }


  public void setTransOutType(String transOutType) {
    this.transOutType = transOutType;
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
   * @return the OpenApiRoyaltyDetailInfoPojo instance itself
   */
  public OpenApiRoyaltyDetailInfoPojo putAdditionalProperty(String key, Object value) {
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
    OpenApiRoyaltyDetailInfoPojo openApiRoyaltyDetailInfoPojo = (OpenApiRoyaltyDetailInfoPojo) o;
    return Objects.equals(this.amount, openApiRoyaltyDetailInfoPojo.amount) &&
        Objects.equals(this.amountPercentage, openApiRoyaltyDetailInfoPojo.amountPercentage) &&
        Objects.equals(this.desc, openApiRoyaltyDetailInfoPojo.desc) &&
        Objects.equals(this.royaltyScene, openApiRoyaltyDetailInfoPojo.royaltyScene) &&
        Objects.equals(this.royaltyType, openApiRoyaltyDetailInfoPojo.royaltyType) &&
        Objects.equals(this.transIn, openApiRoyaltyDetailInfoPojo.transIn) &&
        Objects.equals(this.transInName, openApiRoyaltyDetailInfoPojo.transInName) &&
        Objects.equals(this.transInType, openApiRoyaltyDetailInfoPojo.transInType) &&
        Objects.equals(this.transOut, openApiRoyaltyDetailInfoPojo.transOut) &&
        Objects.equals(this.transOutType, openApiRoyaltyDetailInfoPojo.transOutType)&&
        Objects.equals(this.additionalProperties, openApiRoyaltyDetailInfoPojo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountPercentage, desc, royaltyScene, royaltyType, transIn, transInName, transInType, transOut, transOutType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiRoyaltyDetailInfoPojo {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountPercentage: ").append(toIndentedString(amountPercentage)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    royaltyScene: ").append(toIndentedString(royaltyScene)).append("\n");
    sb.append("    royaltyType: ").append(toIndentedString(royaltyType)).append("\n");
    sb.append("    transIn: ").append(toIndentedString(transIn)).append("\n");
    sb.append("    transInName: ").append(toIndentedString(transInName)).append("\n");
    sb.append("    transInType: ").append(toIndentedString(transInType)).append("\n");
    sb.append("    transOut: ").append(toIndentedString(transOut)).append("\n");
    sb.append("    transOutType: ").append(toIndentedString(transOutType)).append("\n");
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
    openapiFields.add("amount_percentage");
    openapiFields.add("desc");
    openapiFields.add("royalty_scene");
    openapiFields.add("royalty_type");
    openapiFields.add("trans_in");
    openapiFields.add("trans_in_name");
    openapiFields.add("trans_in_type");
    openapiFields.add("trans_out");
    openapiFields.add("trans_out_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OpenApiRoyaltyDetailInfoPojo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OpenApiRoyaltyDetailInfoPojo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenApiRoyaltyDetailInfoPojo is not found in the empty JSON string", OpenApiRoyaltyDetailInfoPojo.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("desc") != null && !jsonObj.get("desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desc").toString()));
      }
      if (jsonObj.get("royalty_scene") != null && !jsonObj.get("royalty_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `royalty_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("royalty_scene").toString()));
      }
      if (jsonObj.get("royalty_type") != null && !jsonObj.get("royalty_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `royalty_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("royalty_type").toString()));
      }
      if (jsonObj.get("trans_in") != null && !jsonObj.get("trans_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in").toString()));
      }
      if (jsonObj.get("trans_in_name") != null && !jsonObj.get("trans_in_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_name").toString()));
      }
      if (jsonObj.get("trans_in_type") != null && !jsonObj.get("trans_in_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_type").toString()));
      }
      if (jsonObj.get("trans_out") != null && !jsonObj.get("trans_out").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_out` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_out").toString()));
      }
      if (jsonObj.get("trans_out_type") != null && !jsonObj.get("trans_out_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_out_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_out_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenApiRoyaltyDetailInfoPojo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenApiRoyaltyDetailInfoPojo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenApiRoyaltyDetailInfoPojo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenApiRoyaltyDetailInfoPojo.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenApiRoyaltyDetailInfoPojo>() {
           @Override
           public void write(JsonWriter out, OpenApiRoyaltyDetailInfoPojo value) throws IOException {
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
           public OpenApiRoyaltyDetailInfoPojo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OpenApiRoyaltyDetailInfoPojo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OpenApiRoyaltyDetailInfoPojo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpenApiRoyaltyDetailInfoPojo
  * @throws IOException if the JSON string is invalid with respect to OpenApiRoyaltyDetailInfoPojo
  */
  public static OpenApiRoyaltyDetailInfoPojo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenApiRoyaltyDetailInfoPojo.class);
  }

 /**
  * Convert an instance of OpenApiRoyaltyDetailInfoPojo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

