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
import com.alipay.v3.model.QueryComplexLabelRule;
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
 * QueryGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QueryGroup {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LABEL_RULE = "label_rule";
  @SerializedName(SERIALIZED_NAME_LABEL_RULE)
  private List<QueryComplexLabelRule> labelRule = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public QueryGroup() { 
  }

  public QueryGroup count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * 人群中包含人数
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "888888", value = "人群中包含人数")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public QueryGroup id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 分组id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "分组id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public QueryGroup labelRule(List<QueryComplexLabelRule> labelRule) {
    
    this.labelRule = labelRule;
    return this;
  }

  public QueryGroup addLabelRuleItem(QueryComplexLabelRule labelRuleItem) {
    if (this.labelRule == null) {
      this.labelRule = new ArrayList<>();
    }
    this.labelRule.add(labelRuleItem);
    return this;
  }

   /**
   * 分组中的圈人规则
   * @return labelRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分组中的圈人规则")

  public List<QueryComplexLabelRule> getLabelRule() {
    return labelRule;
  }


  public void setLabelRule(List<QueryComplexLabelRule> labelRule) {
    this.labelRule = labelRule;
  }


  public QueryGroup name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 用户分组名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "测试分组", value = "用户分组名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
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
   * @return the QueryGroup instance itself
   */
  public QueryGroup putAdditionalProperty(String key, Object value) {
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
    QueryGroup queryGroup = (QueryGroup) o;
    return Objects.equals(this.count, queryGroup.count) &&
        Objects.equals(this.id, queryGroup.id) &&
        Objects.equals(this.labelRule, queryGroup.labelRule) &&
        Objects.equals(this.name, queryGroup.name)&&
        Objects.equals(this.additionalProperties, queryGroup.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, id, labelRule, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryGroup {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labelRule: ").append(toIndentedString(labelRule)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("id");
    openapiFields.add("label_rule");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QueryGroup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (QueryGroup.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryGroup is not found in the empty JSON string", QueryGroup.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      JsonArray jsonArraylabelRule = jsonObj.getAsJsonArray("label_rule");
      if (jsonArraylabelRule != null) {
        // ensure the json data is an array
        if (!jsonObj.get("label_rule").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `label_rule` to be an array in the JSON string but got `%s`", jsonObj.get("label_rule").toString()));
        }

        // validate the optional field `label_rule` (array)
        for (int i = 0; i < jsonArraylabelRule.size(); i++) {
          QueryComplexLabelRule.validateJsonObject(jsonArraylabelRule.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryGroup>() {
           @Override
           public void write(JsonWriter out, QueryGroup value) throws IOException {
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
           public QueryGroup read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             QueryGroup instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of QueryGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryGroup
  * @throws IOException if the JSON string is invalid with respect to QueryGroup
  */
  public static QueryGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryGroup.class);
  }

 /**
  * Convert an instance of QueryGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

