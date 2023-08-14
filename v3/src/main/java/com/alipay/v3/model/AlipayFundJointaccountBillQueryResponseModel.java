/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-08-14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.JointAccountBillDetailDTO;
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
 * AlipayFundJointaccountBillQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundJointaccountBillQueryResponseModel {
  public static final String SERIALIZED_NAME_BILL_LIST = "bill_list";
  @SerializedName(SERIALIZED_NAME_BILL_LIST)
  private List<JointAccountBillDetailDTO> billList = null;

  public static final String SERIALIZED_NAME_BIZ_SCENE = "biz_scene";
  @SerializedName(SERIALIZED_NAME_BIZ_SCENE)
  private String bizScene;

  public static final String SERIALIZED_NAME_HAS_NEXT_PAGE = "has_next_page";
  @SerializedName(SERIALIZED_NAME_HAS_NEXT_PAGE)
  private Boolean hasNextPage;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private String pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private String pageSize;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public AlipayFundJointaccountBillQueryResponseModel() { 
  }

  public AlipayFundJointaccountBillQueryResponseModel billList(List<JointAccountBillDetailDTO> billList) {
    
    this.billList = billList;
    return this;
  }

  public AlipayFundJointaccountBillQueryResponseModel addBillListItem(JointAccountBillDetailDTO billListItem) {
    if (this.billList == null) {
      this.billList = new ArrayList<>();
    }
    this.billList.add(billListItem);
    return this;
  }

   /**
   * 返回账单列表。账单列表为空时，返回为空
   * @return billList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回账单列表。账单列表为空时，返回为空")

  public List<JointAccountBillDetailDTO> getBillList() {
    return billList;
  }


  public void setBillList(List<JointAccountBillDetailDTO> billList) {
    this.billList = billList;
  }


  public AlipayFundJointaccountBillQueryResponseModel bizScene(String bizScene) {
    
    this.bizScene = bizScene;
    return this;
  }

   /**
   * 场景
   * @return bizScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT", value = "场景")

  public String getBizScene() {
    return bizScene;
  }


  public void setBizScene(String bizScene) {
    this.bizScene = bizScene;
  }


  public AlipayFundJointaccountBillQueryResponseModel hasNextPage(Boolean hasNextPage) {
    
    this.hasNextPage = hasNextPage;
    return this;
  }

   /**
   * 是否有下一页
   * @return hasNextPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否有下一页")

  public Boolean getHasNextPage() {
    return hasNextPage;
  }


  public void setHasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }


  public AlipayFundJointaccountBillQueryResponseModel pageNum(String pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 当期页数
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当期页数")

  public String getPageNum() {
    return pageNum;
  }


  public void setPageNum(String pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayFundJointaccountBillQueryResponseModel pageSize(String pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 当期页记录数
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "当期页记录数")

  public String getPageSize() {
    return pageSize;
  }


  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayFundJointaccountBillQueryResponseModel productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * 产品码
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENTERPRISE_PAY", value = "产品码")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundJointaccountBillQueryResponseModel alipayFundJointaccountBillQueryResponseModel = (AlipayFundJointaccountBillQueryResponseModel) o;
    return Objects.equals(this.billList, alipayFundJointaccountBillQueryResponseModel.billList) &&
        Objects.equals(this.bizScene, alipayFundJointaccountBillQueryResponseModel.bizScene) &&
        Objects.equals(this.hasNextPage, alipayFundJointaccountBillQueryResponseModel.hasNextPage) &&
        Objects.equals(this.pageNum, alipayFundJointaccountBillQueryResponseModel.pageNum) &&
        Objects.equals(this.pageSize, alipayFundJointaccountBillQueryResponseModel.pageSize) &&
        Objects.equals(this.productCode, alipayFundJointaccountBillQueryResponseModel.productCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billList, bizScene, hasNextPage, pageNum, pageSize, productCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundJointaccountBillQueryResponseModel {\n");
    sb.append("    billList: ").append(toIndentedString(billList)).append("\n");
    sb.append("    bizScene: ").append(toIndentedString(bizScene)).append("\n");
    sb.append("    hasNextPage: ").append(toIndentedString(hasNextPage)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
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
    openapiFields.add("bill_list");
    openapiFields.add("biz_scene");
    openapiFields.add("has_next_page");
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("product_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundJointaccountBillQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundJointaccountBillQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundJointaccountBillQueryResponseModel is not found in the empty JSON string", AlipayFundJointaccountBillQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundJointaccountBillQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundJointaccountBillQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraybillList = jsonObj.getAsJsonArray("bill_list");
      if (jsonArraybillList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("bill_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `bill_list` to be an array in the JSON string but got `%s`", jsonObj.get("bill_list").toString()));
        }

        // validate the optional field `bill_list` (array)
        for (int i = 0; i < jsonArraybillList.size(); i++) {
          JointAccountBillDetailDTO.validateJsonObject(jsonArraybillList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("biz_scene") != null && !jsonObj.get("biz_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_scene").toString()));
      }
      if (jsonObj.get("page_num") != null && !jsonObj.get("page_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_num").toString()));
      }
      if (jsonObj.get("page_size") != null && !jsonObj.get("page_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_size").toString()));
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundJointaccountBillQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundJointaccountBillQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundJointaccountBillQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundJointaccountBillQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundJointaccountBillQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundJointaccountBillQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundJointaccountBillQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundJointaccountBillQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundJointaccountBillQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundJointaccountBillQueryResponseModel
  */
  public static AlipayFundJointaccountBillQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundJointaccountBillQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundJointaccountBillQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

