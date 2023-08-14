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
import com.alipay.v3.model.FundExtInfo;
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
 * InviteMemberBusinessParamsDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InviteMemberBusinessParamsDTO {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_FUND_EXT_INFO = "fund_ext_info";
  @SerializedName(SERIALIZED_NAME_FUND_EXT_INFO)
  private FundExtInfo fundExtInfo;

  public static final String SERIALIZED_NAME_GROUP_ID_LIST = "group_id_list";
  @SerializedName(SERIALIZED_NAME_GROUP_ID_LIST)
  private List<String> groupIdList = null;

  public InviteMemberBusinessParamsDTO() { 
  }

  public InviteMemberBusinessParamsDTO employeeId(String employeeId) {
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * 企业员工工卡
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "983748293742", value = "企业员工工卡")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }


  public InviteMemberBusinessParamsDTO fundExtInfo(FundExtInfo fundExtInfo) {
    
    this.fundExtInfo = fundExtInfo;
    return this;
  }

   /**
   * Get fundExtInfo
   * @return fundExtInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FundExtInfo getFundExtInfo() {
    return fundExtInfo;
  }


  public void setFundExtInfo(FundExtInfo fundExtInfo) {
    this.fundExtInfo = fundExtInfo;
  }


  public InviteMemberBusinessParamsDTO groupIdList(List<String> groupIdList) {
    
    this.groupIdList = groupIdList;
    return this;
  }

  public InviteMemberBusinessParamsDTO addGroupIdListItem(String groupIdListItem) {
    if (this.groupIdList == null) {
      this.groupIdList = new ArrayList<>();
    }
    this.groupIdList.add(groupIdListItem);
    return this;
  }

   /**
   * 员工关联的群组ID，当前系统仅支持一个
   * @return groupIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"11\"]", value = "员工关联的群组ID，当前系统仅支持一个")

  public List<String> getGroupIdList() {
    return groupIdList;
  }


  public void setGroupIdList(List<String> groupIdList) {
    this.groupIdList = groupIdList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteMemberBusinessParamsDTO inviteMemberBusinessParamsDTO = (InviteMemberBusinessParamsDTO) o;
    return Objects.equals(this.employeeId, inviteMemberBusinessParamsDTO.employeeId) &&
        Objects.equals(this.fundExtInfo, inviteMemberBusinessParamsDTO.fundExtInfo) &&
        Objects.equals(this.groupIdList, inviteMemberBusinessParamsDTO.groupIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, fundExtInfo, groupIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteMemberBusinessParamsDTO {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    fundExtInfo: ").append(toIndentedString(fundExtInfo)).append("\n");
    sb.append("    groupIdList: ").append(toIndentedString(groupIdList)).append("\n");
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
    openapiFields.add("employee_id");
    openapiFields.add("fund_ext_info");
    openapiFields.add("group_id_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InviteMemberBusinessParamsDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InviteMemberBusinessParamsDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InviteMemberBusinessParamsDTO is not found in the empty JSON string", InviteMemberBusinessParamsDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InviteMemberBusinessParamsDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InviteMemberBusinessParamsDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("employee_id") != null && !jsonObj.get("employee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_id").toString()));
      }
      // validate the optional field `fund_ext_info`
      if (jsonObj.getAsJsonObject("fund_ext_info") != null) {
        FundExtInfo.validateJsonObject(jsonObj.getAsJsonObject("fund_ext_info"));
      }
      // ensure the json data is an array
      if (jsonObj.get("group_id_list") != null && !jsonObj.get("group_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("group_id_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InviteMemberBusinessParamsDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InviteMemberBusinessParamsDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InviteMemberBusinessParamsDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InviteMemberBusinessParamsDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<InviteMemberBusinessParamsDTO>() {
           @Override
           public void write(JsonWriter out, InviteMemberBusinessParamsDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InviteMemberBusinessParamsDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InviteMemberBusinessParamsDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InviteMemberBusinessParamsDTO
  * @throws IOException if the JSON string is invalid with respect to InviteMemberBusinessParamsDTO
  */
  public static InviteMemberBusinessParamsDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InviteMemberBusinessParamsDTO.class);
  }

 /**
  * Convert an instance of InviteMemberBusinessParamsDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

