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
 * AlipayCommerceEcEmployeeInfoModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceEcEmployeeInfoModifyModel {
  public static final String SERIALIZED_NAME_DEPARTMENT_IDS = "department_ids";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT_IDS)
  private List<String> departmentIds = null;

  public static final String SERIALIZED_NAME_EMPLOYEE_EMAIL = "employee_email";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_EMAIL)
  private String employeeEmail;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_EMPLOYEE_MOBILE = "employee_mobile";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_MOBILE)
  private String employeeMobile;

  public static final String SERIALIZED_NAME_EMPLOYEE_NAME = "employee_name";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NAME)
  private String employeeName;

  public static final String SERIALIZED_NAME_EMPLOYEE_NO = "employee_no";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NO)
  private String employeeNo;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_PROFILES = "profiles";
  @SerializedName(SERIALIZED_NAME_PROFILES)
  private String profiles;

  public static final String SERIALIZED_NAME_ROLE_LIST = "role_list";
  @SerializedName(SERIALIZED_NAME_ROLE_LIST)
  private List<String> roleList = null;

  public AlipayCommerceEcEmployeeInfoModifyModel() { 
  }

  public AlipayCommerceEcEmployeeInfoModifyModel departmentIds(List<String> departmentIds) {
    
    this.departmentIds = departmentIds;
    return this;
  }

  public AlipayCommerceEcEmployeeInfoModifyModel addDepartmentIdsItem(String departmentIdsItem) {
    if (this.departmentIds == null) {
      this.departmentIds = new ArrayList<>();
    }
    this.departmentIds.add(departmentIdsItem);
    return this;
  }

   /**
   * 员工所属部门。如果不传值，则不更新所属部门
   * @return departmentIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"1001107000098337\"]", value = "员工所属部门。如果不传值，则不更新所属部门")

  public List<String> getDepartmentIds() {
    return departmentIds;
  }


  public void setDepartmentIds(List<String> departmentIds) {
    this.departmentIds = departmentIds;
  }


  public AlipayCommerceEcEmployeeInfoModifyModel employeeEmail(String employeeEmail) {
    
    this.employeeEmail = employeeEmail;
    return this;
  }

   /**
   * 员工邮箱。如果不传值，则不更新邮箱。
   * @return employeeEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aajka@email.com", value = "员工邮箱。如果不传值，则不更新邮箱。")

  public String getEmployeeEmail() {
    return employeeEmail;
  }


  public void setEmployeeEmail(String employeeEmail) {
    this.employeeEmail = employeeEmail;
  }


  public AlipayCommerceEcEmployeeInfoModifyModel employeeId(String employeeId) {
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * 员工id
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22887387848484", value = "员工id")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }


  public AlipayCommerceEcEmployeeInfoModifyModel employeeMobile(String employeeMobile) {
    
    this.employeeMobile = employeeMobile;
    return this;
  }

   /**
   * 员工手机号。如果不传值，则不更新手机号。
   * @return employeeMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "158****4364", value = "员工手机号。如果不传值，则不更新手机号。")

  public String getEmployeeMobile() {
    return employeeMobile;
  }


  public void setEmployeeMobile(String employeeMobile) {
    this.employeeMobile = employeeMobile;
  }


  public AlipayCommerceEcEmployeeInfoModifyModel employeeName(String employeeName) {
    
    this.employeeName = employeeName;
    return this;
  }

   /**
   * 员工姓名
   * @return employeeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "员工姓名")

  public String getEmployeeName() {
    return employeeName;
  }


  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }


  public AlipayCommerceEcEmployeeInfoModifyModel employeeNo(String employeeNo) {
    
    this.employeeNo = employeeNo;
    return this;
  }

   /**
   * 员工工号。如果不传值，则不更新工号。
   * @return employeeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "D83030", value = "员工工号。如果不传值，则不更新工号。")

  public String getEmployeeNo() {
    return employeeNo;
  }


  public void setEmployeeNo(String employeeNo) {
    this.employeeNo = employeeNo;
  }


  public AlipayCommerceEcEmployeeInfoModifyModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业id
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088474883838", value = "企业id")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayCommerceEcEmployeeInfoModifyModel profiles(String profiles) {
    
    this.profiles = profiles;
    return this;
  }

   /**
   * 个性化信息。如果不传值，则不更新个性化信息。 &lt;a href&#x3D;&#39;https://opendocs.alipay.com/pre-open/0ceh47?pathHash&#x3D;14fac87c&#39;&gt;详见文档&lt;/a&gt;
   * @return profiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"consume_remark\":\"员工账单备注内容示例\",\"inst_id\":\"CMBC\",card_type:\"CC\",\"check_bind_card\":\"Y\"}", value = "个性化信息。如果不传值，则不更新个性化信息。 <a href='https://opendocs.alipay.com/pre-open/0ceh47?pathHash=14fac87c'>详见文档</a>")

  public String getProfiles() {
    return profiles;
  }


  public void setProfiles(String profiles) {
    this.profiles = profiles;
  }


  public AlipayCommerceEcEmployeeInfoModifyModel roleList(List<String> roleList) {
    
    this.roleList = roleList;
    return this;
  }

  public AlipayCommerceEcEmployeeInfoModifyModel addRoleListItem(String roleListItem) {
    if (this.roleList == null) {
      this.roleList = new ArrayList<>();
    }
    this.roleList.add(roleListItem);
    return this;
  }

   /**
   * 角色列表，目前只支持填一种角色。如果不传值，则不更新角色。
   * @return roleList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"USER\"]", value = "角色列表，目前只支持填一种角色。如果不传值，则不更新角色。")

  public List<String> getRoleList() {
    return roleList;
  }


  public void setRoleList(List<String> roleList) {
    this.roleList = roleList;
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
   * @return the AlipayCommerceEcEmployeeInfoModifyModel instance itself
   */
  public AlipayCommerceEcEmployeeInfoModifyModel putAdditionalProperty(String key, Object value) {
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
    AlipayCommerceEcEmployeeInfoModifyModel alipayCommerceEcEmployeeInfoModifyModel = (AlipayCommerceEcEmployeeInfoModifyModel) o;
    return Objects.equals(this.departmentIds, alipayCommerceEcEmployeeInfoModifyModel.departmentIds) &&
        Objects.equals(this.employeeEmail, alipayCommerceEcEmployeeInfoModifyModel.employeeEmail) &&
        Objects.equals(this.employeeId, alipayCommerceEcEmployeeInfoModifyModel.employeeId) &&
        Objects.equals(this.employeeMobile, alipayCommerceEcEmployeeInfoModifyModel.employeeMobile) &&
        Objects.equals(this.employeeName, alipayCommerceEcEmployeeInfoModifyModel.employeeName) &&
        Objects.equals(this.employeeNo, alipayCommerceEcEmployeeInfoModifyModel.employeeNo) &&
        Objects.equals(this.enterpriseId, alipayCommerceEcEmployeeInfoModifyModel.enterpriseId) &&
        Objects.equals(this.profiles, alipayCommerceEcEmployeeInfoModifyModel.profiles) &&
        Objects.equals(this.roleList, alipayCommerceEcEmployeeInfoModifyModel.roleList)&&
        Objects.equals(this.additionalProperties, alipayCommerceEcEmployeeInfoModifyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departmentIds, employeeEmail, employeeId, employeeMobile, employeeName, employeeNo, enterpriseId, profiles, roleList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceEcEmployeeInfoModifyModel {\n");
    sb.append("    departmentIds: ").append(toIndentedString(departmentIds)).append("\n");
    sb.append("    employeeEmail: ").append(toIndentedString(employeeEmail)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    employeeMobile: ").append(toIndentedString(employeeMobile)).append("\n");
    sb.append("    employeeName: ").append(toIndentedString(employeeName)).append("\n");
    sb.append("    employeeNo: ").append(toIndentedString(employeeNo)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    roleList: ").append(toIndentedString(roleList)).append("\n");
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
    openapiFields.add("department_ids");
    openapiFields.add("employee_email");
    openapiFields.add("employee_id");
    openapiFields.add("employee_mobile");
    openapiFields.add("employee_name");
    openapiFields.add("employee_no");
    openapiFields.add("enterprise_id");
    openapiFields.add("profiles");
    openapiFields.add("role_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceEcEmployeeInfoModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceEcEmployeeInfoModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceEcEmployeeInfoModifyModel is not found in the empty JSON string", AlipayCommerceEcEmployeeInfoModifyModel.openapiRequiredFields.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("department_ids") != null && !jsonObj.get("department_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `department_ids` to be an array in the JSON string but got `%s`", jsonObj.get("department_ids").toString()));
      }
      if (jsonObj.get("employee_email") != null && !jsonObj.get("employee_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_email").toString()));
      }
      if (jsonObj.get("employee_id") != null && !jsonObj.get("employee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_id").toString()));
      }
      if (jsonObj.get("employee_mobile") != null && !jsonObj.get("employee_mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_mobile").toString()));
      }
      if (jsonObj.get("employee_name") != null && !jsonObj.get("employee_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_name").toString()));
      }
      if (jsonObj.get("employee_no") != null && !jsonObj.get("employee_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_no").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("profiles") != null && !jsonObj.get("profiles").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profiles` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profiles").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("role_list") != null && !jsonObj.get("role_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_list` to be an array in the JSON string but got `%s`", jsonObj.get("role_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceEcEmployeeInfoModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceEcEmployeeInfoModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceEcEmployeeInfoModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceEcEmployeeInfoModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceEcEmployeeInfoModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceEcEmployeeInfoModifyModel value) throws IOException {
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
           public AlipayCommerceEcEmployeeInfoModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayCommerceEcEmployeeInfoModifyModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayCommerceEcEmployeeInfoModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceEcEmployeeInfoModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceEcEmployeeInfoModifyModel
  */
  public static AlipayCommerceEcEmployeeInfoModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceEcEmployeeInfoModifyModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceEcEmployeeInfoModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

