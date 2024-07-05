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
import com.alipay.v3.model.ItemExtInfo;
import com.alipay.v3.model.ItemPropertyInfo;
import com.alipay.v3.model.MaterialModifyInfo;
import com.alipay.v3.model.SkuModifyInfo;
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
 * AntMerchantExpandItemOpenModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AntMerchantExpandItemOpenModifyModel {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private List<ItemExtInfo> extInfo = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_MATERIAL_LIST = "material_list";
  @SerializedName(SERIALIZED_NAME_MATERIAL_LIST)
  private List<MaterialModifyInfo> materialList = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROPERTY_LIST = "property_list";
  @SerializedName(SERIALIZED_NAME_PROPERTY_LIST)
  private List<ItemPropertyInfo> propertyList = null;

  public static final String SERIALIZED_NAME_SKU_LIST = "sku_list";
  @SerializedName(SERIALIZED_NAME_SKU_LIST)
  private List<SkuModifyInfo> skuList = null;

  public static final String SERIALIZED_NAME_STANDARD_CATEGORY_ID = "standard_category_id";
  @SerializedName(SERIALIZED_NAME_STANDARD_CATEGORY_ID)
  private String standardCategoryId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AntMerchantExpandItemOpenModifyModel() { 
  }

  public AntMerchantExpandItemOpenModifyModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 商品描述
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "精选东北优质非转基因大豆", value = "商品描述")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AntMerchantExpandItemOpenModifyModel extInfo(List<ItemExtInfo> extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

  public AntMerchantExpandItemOpenModifyModel addExtInfoItem(ItemExtInfo extInfoItem) {
    if (this.extInfo == null) {
      this.extInfo = new ArrayList<>();
    }
    this.extInfo.add(extInfoItem);
    return this;
  }

   /**
   * 商品扩展信息（覆盖商品已存在扩展信息、具体KEY请参见产品文档）
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品扩展信息（覆盖商品已存在扩展信息、具体KEY请参见产品文档）")

  public List<ItemExtInfo> getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(List<ItemExtInfo> extInfo) {
    this.extInfo = extInfo;
  }


  public AntMerchantExpandItemOpenModifyModel itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 商品ID
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019073100702219000000100000", value = "商品ID")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public AntMerchantExpandItemOpenModifyModel materialList(List<MaterialModifyInfo> materialList) {
    
    this.materialList = materialList;
    return this;
  }

  public AntMerchantExpandItemOpenModifyModel addMaterialListItem(MaterialModifyInfo materialListItem) {
    if (this.materialList == null) {
      this.materialList = new ArrayList<>();
    }
    this.materialList.add(materialListItem);
    return this;
  }

   /**
   * 商品素材列表（会和商品已存在素材做差异化比较后做增删改操作）
   * @return materialList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品素材列表（会和商品已存在素材做差异化比较后做增删改操作）")

  public List<MaterialModifyInfo> getMaterialList() {
    return materialList;
  }


  public void setMaterialList(List<MaterialModifyInfo> materialList) {
    this.materialList = materialList;
  }


  public AntMerchantExpandItemOpenModifyModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 商品名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "西红柿炒蛋", value = "商品名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AntMerchantExpandItemOpenModifyModel propertyList(List<ItemPropertyInfo> propertyList) {
    
    this.propertyList = propertyList;
    return this;
  }

  public AntMerchantExpandItemOpenModifyModel addPropertyListItem(ItemPropertyInfo propertyListItem) {
    if (this.propertyList == null) {
      this.propertyList = new ArrayList<>();
    }
    this.propertyList.add(propertyListItem);
    return this;
  }

   /**
   * 商品属性列表（覆盖商品已存在属性）
   * @return propertyList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品属性列表（覆盖商品已存在属性）")

  public List<ItemPropertyInfo> getPropertyList() {
    return propertyList;
  }


  public void setPropertyList(List<ItemPropertyInfo> propertyList) {
    this.propertyList = propertyList;
  }


  public AntMerchantExpandItemOpenModifyModel skuList(List<SkuModifyInfo> skuList) {
    
    this.skuList = skuList;
    return this;
  }

  public AntMerchantExpandItemOpenModifyModel addSkuListItem(SkuModifyInfo skuListItem) {
    if (this.skuList == null) {
      this.skuList = new ArrayList<>();
    }
    this.skuList.add(skuListItem);
    return this;
  }

   /**
   * SKU列表（会和商品已存在SKU做差异化比较后做增删改操作）
   * @return skuList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SKU列表（会和商品已存在SKU做差异化比较后做增删改操作）")

  public List<SkuModifyInfo> getSkuList() {
    return skuList;
  }


  public void setSkuList(List<SkuModifyInfo> skuList) {
    this.skuList = skuList;
  }


  public AntMerchantExpandItemOpenModifyModel standardCategoryId(String standardCategoryId) {
    
    this.standardCategoryId = standardCategoryId;
    return this;
  }

   /**
   * 商品所属标准类目ID，当 type 为STANDARD_GOODS（标品）时必填。 请填入 https://opendocs.alipay.com/mini/011lxt 小程序商品类目表中三级类目ID。
   * @return standardCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019073100992228000000100000", value = "商品所属标准类目ID，当 type 为STANDARD_GOODS（标品）时必填。 请填入 https://opendocs.alipay.com/mini/011lxt 小程序商品类目表中三级类目ID。")

  public String getStandardCategoryId() {
    return standardCategoryId;
  }


  public void setStandardCategoryId(String standardCategoryId) {
    this.standardCategoryId = standardCategoryId;
  }


  public AntMerchantExpandItemOpenModifyModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 商品状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EFFECT", value = "商品状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AntMerchantExpandItemOpenModifyModel type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 商品类型：STANDARD_GOODS（标品）、NON_STANDARD_GOODS（非标品）
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "STANDARD_GOODS", value = "商品类型：STANDARD_GOODS（标品）、NON_STANDARD_GOODS（非标品）")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
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
   * @return the AntMerchantExpandItemOpenModifyModel instance itself
   */
  public AntMerchantExpandItemOpenModifyModel putAdditionalProperty(String key, Object value) {
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
    AntMerchantExpandItemOpenModifyModel antMerchantExpandItemOpenModifyModel = (AntMerchantExpandItemOpenModifyModel) o;
    return Objects.equals(this.description, antMerchantExpandItemOpenModifyModel.description) &&
        Objects.equals(this.extInfo, antMerchantExpandItemOpenModifyModel.extInfo) &&
        Objects.equals(this.itemId, antMerchantExpandItemOpenModifyModel.itemId) &&
        Objects.equals(this.materialList, antMerchantExpandItemOpenModifyModel.materialList) &&
        Objects.equals(this.name, antMerchantExpandItemOpenModifyModel.name) &&
        Objects.equals(this.propertyList, antMerchantExpandItemOpenModifyModel.propertyList) &&
        Objects.equals(this.skuList, antMerchantExpandItemOpenModifyModel.skuList) &&
        Objects.equals(this.standardCategoryId, antMerchantExpandItemOpenModifyModel.standardCategoryId) &&
        Objects.equals(this.status, antMerchantExpandItemOpenModifyModel.status) &&
        Objects.equals(this.type, antMerchantExpandItemOpenModifyModel.type)&&
        Objects.equals(this.additionalProperties, antMerchantExpandItemOpenModifyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, extInfo, itemId, materialList, name, propertyList, skuList, standardCategoryId, status, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntMerchantExpandItemOpenModifyModel {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    materialList: ").append(toIndentedString(materialList)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    propertyList: ").append(toIndentedString(propertyList)).append("\n");
    sb.append("    skuList: ").append(toIndentedString(skuList)).append("\n");
    sb.append("    standardCategoryId: ").append(toIndentedString(standardCategoryId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("ext_info");
    openapiFields.add("item_id");
    openapiFields.add("material_list");
    openapiFields.add("name");
    openapiFields.add("property_list");
    openapiFields.add("sku_list");
    openapiFields.add("standard_category_id");
    openapiFields.add("status");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AntMerchantExpandItemOpenModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AntMerchantExpandItemOpenModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AntMerchantExpandItemOpenModifyModel is not found in the empty JSON string", AntMerchantExpandItemOpenModifyModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      JsonArray jsonArrayextInfo = jsonObj.getAsJsonArray("ext_info");
      if (jsonArrayextInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ext_info").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be an array in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
        }

        // validate the optional field `ext_info` (array)
        for (int i = 0; i < jsonArrayextInfo.size(); i++) {
          ItemExtInfo.validateJsonObject(jsonArrayextInfo.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("item_id") != null && !jsonObj.get("item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_id").toString()));
      }
      JsonArray jsonArraymaterialList = jsonObj.getAsJsonArray("material_list");
      if (jsonArraymaterialList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("material_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `material_list` to be an array in the JSON string but got `%s`", jsonObj.get("material_list").toString()));
        }

        // validate the optional field `material_list` (array)
        for (int i = 0; i < jsonArraymaterialList.size(); i++) {
          MaterialModifyInfo.validateJsonObject(jsonArraymaterialList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      JsonArray jsonArraypropertyList = jsonObj.getAsJsonArray("property_list");
      if (jsonArraypropertyList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("property_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `property_list` to be an array in the JSON string but got `%s`", jsonObj.get("property_list").toString()));
        }

        // validate the optional field `property_list` (array)
        for (int i = 0; i < jsonArraypropertyList.size(); i++) {
          ItemPropertyInfo.validateJsonObject(jsonArraypropertyList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayskuList = jsonObj.getAsJsonArray("sku_list");
      if (jsonArrayskuList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("sku_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `sku_list` to be an array in the JSON string but got `%s`", jsonObj.get("sku_list").toString()));
        }

        // validate the optional field `sku_list` (array)
        for (int i = 0; i < jsonArrayskuList.size(); i++) {
          SkuModifyInfo.validateJsonObject(jsonArrayskuList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("standard_category_id") != null && !jsonObj.get("standard_category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard_category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard_category_id").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AntMerchantExpandItemOpenModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AntMerchantExpandItemOpenModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AntMerchantExpandItemOpenModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AntMerchantExpandItemOpenModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AntMerchantExpandItemOpenModifyModel>() {
           @Override
           public void write(JsonWriter out, AntMerchantExpandItemOpenModifyModel value) throws IOException {
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
           public AntMerchantExpandItemOpenModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AntMerchantExpandItemOpenModifyModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AntMerchantExpandItemOpenModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AntMerchantExpandItemOpenModifyModel
  * @throws IOException if the JSON string is invalid with respect to AntMerchantExpandItemOpenModifyModel
  */
  public static AntMerchantExpandItemOpenModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AntMerchantExpandItemOpenModifyModel.class);
  }

 /**
  * Convert an instance of AntMerchantExpandItemOpenModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

