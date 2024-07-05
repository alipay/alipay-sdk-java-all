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
import com.alipay.v3.model.CloudResumeCertificateInfo;
import com.alipay.v3.model.CloudResumeEducationExperience;
import com.alipay.v3.model.CloudResumeHeadPic;
import com.alipay.v3.model.CloudResumePositionIntention;
import com.alipay.v3.model.CloudResumeSkillInfo;
import com.alipay.v3.model.CloudResumeWorkExperience;
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
 * ZhimaCustomerJobworthCloudresumeQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCustomerJobworthCloudresumeQueryResponseModel {
  public static final String SERIALIZED_NAME_BIRTHDAY = "birthday";
  @SerializedName(SERIALIZED_NAME_BIRTHDAY)
  private String birthday;

  public static final String SERIALIZED_NAME_CERTIFICATES = "certificates";
  @SerializedName(SERIALIZED_NAME_CERTIFICATES)
  private List<CloudResumeCertificateInfo> certificates = null;

  public static final String SERIALIZED_NAME_EDUCATION_EXPERIENCES = "education_experiences";
  @SerializedName(SERIALIZED_NAME_EDUCATION_EXPERIENCES)
  private List<CloudResumeEducationExperience> educationExperiences = null;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_INTENTION_STATUS = "intention_status";
  @SerializedName(SERIALIZED_NAME_INTENTION_STATUS)
  private String intentionStatus;

  public static final String SERIALIZED_NAME_PERSON_DESC = "person_desc";
  @SerializedName(SERIALIZED_NAME_PERSON_DESC)
  private String personDesc;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_PIC_URL = "pic_url";
  @SerializedName(SERIALIZED_NAME_PIC_URL)
  private CloudResumeHeadPic picUrl;

  public static final String SERIALIZED_NAME_POSITION_INTENTIONS = "position_intentions";
  @SerializedName(SERIALIZED_NAME_POSITION_INTENTIONS)
  private List<CloudResumePositionIntention> positionIntentions = null;

  public static final String SERIALIZED_NAME_POSITION_TYPE = "position_type";
  @SerializedName(SERIALIZED_NAME_POSITION_TYPE)
  private String positionType;

  public static final String SERIALIZED_NAME_RESIDENTIAL_AREA = "residential_area";
  @SerializedName(SERIALIZED_NAME_RESIDENTIAL_AREA)
  private String residentialArea;

  public static final String SERIALIZED_NAME_SKILLS = "skills";
  @SerializedName(SERIALIZED_NAME_SKILLS)
  private List<CloudResumeSkillInfo> skills = null;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_WORK_EXPERIENCES = "work_experiences";
  @SerializedName(SERIALIZED_NAME_WORK_EXPERIENCES)
  private List<CloudResumeWorkExperience> workExperiences = null;

  public static final String SERIALIZED_NAME_WORK_START_DATE = "work_start_date";
  @SerializedName(SERIALIZED_NAME_WORK_START_DATE)
  private Integer workStartDate;

  public ZhimaCustomerJobworthCloudresumeQueryResponseModel() { 
  }

  public ZhimaCustomerJobworthCloudresumeQueryResponseModel birthday(String birthday) {
    
    this.birthday = birthday;
    return this;
  }

   /**
   * 出生日期
   * @return birthday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20001001", value = "出生日期")

  public String getBirthday() {
    return birthday;
  }


  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }


  public ZhimaCustomerJobworthCloudresumeQueryResponseModel certificates(List<CloudResumeCertificateInfo> certificates) {
    
    this.certificates = certificates;
    return this;
  }

  public ZhimaCustomerJobworthCloudresumeQueryResponseModel addCertificatesItem(CloudResumeCertificateInfo certificatesItem) {
    if (this.certificates == null) {
      this.certificates = new ArrayList<>();
    }
    this.certificates.add(certificatesItem);
    return this;
  }

   /**
   * 证书名称
   * @return certificates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "证书名称")

  public List<CloudResumeCertificateInfo> getCertificates() {
    return certificates;
  }


  public void setCertificates(List<CloudResumeCertificateInfo> certificates) {
    this.certificates = certificates;
  }


  public ZhimaCustomerJobworthCloudresumeQueryResponseModel educationExperiences(List<CloudResumeEducationExperience> educationExperiences) {
    
    this.educationExperiences = educationExperiences;
    return this;
  }

  public ZhimaCustomerJobworthCloudresumeQueryResponseModel addEducationExperiencesItem(CloudResumeEducationExperience educationExperiencesItem) {
    if (this.educationExperiences == null) {
      this.educationExperiences = new ArrayList<>();
    }
    this.educationExperiences.add(educationExperiencesItem);
    return this;
  }

   /**
   * 教育经历
   * @return educationExperiences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "教育经历")

  public List<CloudResumeEducationExperience> getEducationExperiences() {
    return educationExperiences;
  }


  public void setEducationExperiences(List<CloudResumeEducationExperience> educationExperiences) {
    this.educationExperiences = educationExperiences;
  }


  public ZhimaCustomerJobworthCloudresumeQueryResponseModel email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 用户在芝麻工作证填写的邮箱
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123@126.com", value = "用户在芝麻工作证填写的邮箱")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public ZhimaCustomerJobworthCloudresumeQueryResponseModel gender(String gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * 性别
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "男", value = "性别")

  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    this.gender = gender;
  }


  public ZhimaCustomerJobworthCloudresumeQueryResponseModel intentionStatus(String intentionStatus) {
    
    this.intentionStatus = intentionStatus;
    return this;
  }

   /**
   * 用户的求职状态
   * @return intentionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ALWAYS_ON_JOB", value = "用户的求职状态")

  public String getIntentionStatus() {
    return intentionStatus;
  }


  public void setIntentionStatus(String intentionStatus) {
    this.intentionStatus = intentionStatus;
  }


  public ZhimaCustomerJobworthCloudresumeQueryResponseModel personDesc(String personDesc) {
    
    this.personDesc = personDesc;
    return this;
  }

   /**
   * 用户在芝麻工作证填写的自我介绍
   * @return personDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "我是张三，性格开朗", value = "用户在芝麻工作证填写的自我介绍")

  public String getPersonDesc() {
    return personDesc;
  }


  public void setPersonDesc(String personDesc) {
    this.personDesc = personDesc;
  }


  public ZhimaCustomerJobworthCloudresumeQueryResponseModel phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * 手机号码
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13311111111", value = "手机号码")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public ZhimaCustomerJobworthCloudresumeQueryResponseModel picUrl(CloudResumeHeadPic picUrl) {
    
    this.picUrl = picUrl;
    return this;
  }

   /**
   * Get picUrl
   * @return picUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CloudResumeHeadPic getPicUrl() {
    return picUrl;
  }


  public void setPicUrl(CloudResumeHeadPic picUrl) {
    this.picUrl = picUrl;
  }


  public ZhimaCustomerJobworthCloudresumeQueryResponseModel positionIntentions(List<CloudResumePositionIntention> positionIntentions) {
    
    this.positionIntentions = positionIntentions;
    return this;
  }

  public ZhimaCustomerJobworthCloudresumeQueryResponseModel addPositionIntentionsItem(CloudResumePositionIntention positionIntentionsItem) {
    if (this.positionIntentions == null) {
      this.positionIntentions = new ArrayList<>();
    }
    this.positionIntentions.add(positionIntentionsItem);
    return this;
  }

   /**
   * 求职期望
   * @return positionIntentions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "求职期望")

  public List<CloudResumePositionIntention> getPositionIntentions() {
    return positionIntentions;
  }


  public void setPositionIntentions(List<CloudResumePositionIntention> positionIntentions) {
    this.positionIntentions = positionIntentions;
  }


  public ZhimaCustomerJobworthCloudresumeQueryResponseModel positionType(String positionType) {
    
    this.positionType = positionType;
    return this;
  }

   /**
   * 职业身份
   * @return positionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IN_SCHOOL", value = "职业身份")

  public String getPositionType() {
    return positionType;
  }


  public void setPositionType(String positionType) {
    this.positionType = positionType;
  }


  public ZhimaCustomerJobworthCloudresumeQueryResponseModel residentialArea(String residentialArea) {
    
    this.residentialArea = residentialArea;
    return this;
  }

   /**
   * 常驻地址
   * @return residentialArea
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "浙江省杭州市", value = "常驻地址")

  public String getResidentialArea() {
    return residentialArea;
  }


  public void setResidentialArea(String residentialArea) {
    this.residentialArea = residentialArea;
  }


  public ZhimaCustomerJobworthCloudresumeQueryResponseModel skills(List<CloudResumeSkillInfo> skills) {
    
    this.skills = skills;
    return this;
  }

  public ZhimaCustomerJobworthCloudresumeQueryResponseModel addSkillsItem(CloudResumeSkillInfo skillsItem) {
    if (this.skills == null) {
      this.skills = new ArrayList<>();
    }
    this.skills.add(skillsItem);
    return this;
  }

   /**
   * 技能信息
   * @return skills
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "技能信息")

  public List<CloudResumeSkillInfo> getSkills() {
    return skills;
  }


  public void setSkills(List<CloudResumeSkillInfo> skills) {
    this.skills = skills;
  }


  public ZhimaCustomerJobworthCloudresumeQueryResponseModel userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * 姓名
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "姓名")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }


  public ZhimaCustomerJobworthCloudresumeQueryResponseModel workExperiences(List<CloudResumeWorkExperience> workExperiences) {
    
    this.workExperiences = workExperiences;
    return this;
  }

  public ZhimaCustomerJobworthCloudresumeQueryResponseModel addWorkExperiencesItem(CloudResumeWorkExperience workExperiencesItem) {
    if (this.workExperiences == null) {
      this.workExperiences = new ArrayList<>();
    }
    this.workExperiences.add(workExperiencesItem);
    return this;
  }

   /**
   * 工作经历
   * @return workExperiences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "工作经历")

  public List<CloudResumeWorkExperience> getWorkExperiences() {
    return workExperiences;
  }


  public void setWorkExperiences(List<CloudResumeWorkExperience> workExperiences) {
    this.workExperiences = workExperiences;
  }


  public ZhimaCustomerJobworthCloudresumeQueryResponseModel workStartDate(Integer workStartDate) {
    
    this.workStartDate = workStartDate;
    return this;
  }

   /**
   * 工作开始日期（时间戳）
   * @return workStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1669388400000", value = "工作开始日期（时间戳）")

  public Integer getWorkStartDate() {
    return workStartDate;
  }


  public void setWorkStartDate(Integer workStartDate) {
    this.workStartDate = workStartDate;
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
   * @return the ZhimaCustomerJobworthCloudresumeQueryResponseModel instance itself
   */
  public ZhimaCustomerJobworthCloudresumeQueryResponseModel putAdditionalProperty(String key, Object value) {
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
    ZhimaCustomerJobworthCloudresumeQueryResponseModel zhimaCustomerJobworthCloudresumeQueryResponseModel = (ZhimaCustomerJobworthCloudresumeQueryResponseModel) o;
    return Objects.equals(this.birthday, zhimaCustomerJobworthCloudresumeQueryResponseModel.birthday) &&
        Objects.equals(this.certificates, zhimaCustomerJobworthCloudresumeQueryResponseModel.certificates) &&
        Objects.equals(this.educationExperiences, zhimaCustomerJobworthCloudresumeQueryResponseModel.educationExperiences) &&
        Objects.equals(this.email, zhimaCustomerJobworthCloudresumeQueryResponseModel.email) &&
        Objects.equals(this.gender, zhimaCustomerJobworthCloudresumeQueryResponseModel.gender) &&
        Objects.equals(this.intentionStatus, zhimaCustomerJobworthCloudresumeQueryResponseModel.intentionStatus) &&
        Objects.equals(this.personDesc, zhimaCustomerJobworthCloudresumeQueryResponseModel.personDesc) &&
        Objects.equals(this.phone, zhimaCustomerJobworthCloudresumeQueryResponseModel.phone) &&
        Objects.equals(this.picUrl, zhimaCustomerJobworthCloudresumeQueryResponseModel.picUrl) &&
        Objects.equals(this.positionIntentions, zhimaCustomerJobworthCloudresumeQueryResponseModel.positionIntentions) &&
        Objects.equals(this.positionType, zhimaCustomerJobworthCloudresumeQueryResponseModel.positionType) &&
        Objects.equals(this.residentialArea, zhimaCustomerJobworthCloudresumeQueryResponseModel.residentialArea) &&
        Objects.equals(this.skills, zhimaCustomerJobworthCloudresumeQueryResponseModel.skills) &&
        Objects.equals(this.userName, zhimaCustomerJobworthCloudresumeQueryResponseModel.userName) &&
        Objects.equals(this.workExperiences, zhimaCustomerJobworthCloudresumeQueryResponseModel.workExperiences) &&
        Objects.equals(this.workStartDate, zhimaCustomerJobworthCloudresumeQueryResponseModel.workStartDate)&&
        Objects.equals(this.additionalProperties, zhimaCustomerJobworthCloudresumeQueryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birthday, certificates, educationExperiences, email, gender, intentionStatus, personDesc, phone, picUrl, positionIntentions, positionType, residentialArea, skills, userName, workExperiences, workStartDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCustomerJobworthCloudresumeQueryResponseModel {\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    educationExperiences: ").append(toIndentedString(educationExperiences)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    intentionStatus: ").append(toIndentedString(intentionStatus)).append("\n");
    sb.append("    personDesc: ").append(toIndentedString(personDesc)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    picUrl: ").append(toIndentedString(picUrl)).append("\n");
    sb.append("    positionIntentions: ").append(toIndentedString(positionIntentions)).append("\n");
    sb.append("    positionType: ").append(toIndentedString(positionType)).append("\n");
    sb.append("    residentialArea: ").append(toIndentedString(residentialArea)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    workExperiences: ").append(toIndentedString(workExperiences)).append("\n");
    sb.append("    workStartDate: ").append(toIndentedString(workStartDate)).append("\n");
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
    openapiFields.add("birthday");
    openapiFields.add("certificates");
    openapiFields.add("education_experiences");
    openapiFields.add("email");
    openapiFields.add("gender");
    openapiFields.add("intention_status");
    openapiFields.add("person_desc");
    openapiFields.add("phone");
    openapiFields.add("pic_url");
    openapiFields.add("position_intentions");
    openapiFields.add("position_type");
    openapiFields.add("residential_area");
    openapiFields.add("skills");
    openapiFields.add("user_name");
    openapiFields.add("work_experiences");
    openapiFields.add("work_start_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCustomerJobworthCloudresumeQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCustomerJobworthCloudresumeQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCustomerJobworthCloudresumeQueryResponseModel is not found in the empty JSON string", ZhimaCustomerJobworthCloudresumeQueryResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("birthday") != null && !jsonObj.get("birthday").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `birthday` to be a primitive type in the JSON string but got `%s`", jsonObj.get("birthday").toString()));
      }
      JsonArray jsonArraycertificates = jsonObj.getAsJsonArray("certificates");
      if (jsonArraycertificates != null) {
        // ensure the json data is an array
        if (!jsonObj.get("certificates").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `certificates` to be an array in the JSON string but got `%s`", jsonObj.get("certificates").toString()));
        }

        // validate the optional field `certificates` (array)
        for (int i = 0; i < jsonArraycertificates.size(); i++) {
          CloudResumeCertificateInfo.validateJsonObject(jsonArraycertificates.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayeducationExperiences = jsonObj.getAsJsonArray("education_experiences");
      if (jsonArrayeducationExperiences != null) {
        // ensure the json data is an array
        if (!jsonObj.get("education_experiences").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `education_experiences` to be an array in the JSON string but got `%s`", jsonObj.get("education_experiences").toString()));
        }

        // validate the optional field `education_experiences` (array)
        for (int i = 0; i < jsonArrayeducationExperiences.size(); i++) {
          CloudResumeEducationExperience.validateJsonObject(jsonArrayeducationExperiences.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if (jsonObj.get("intention_status") != null && !jsonObj.get("intention_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `intention_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("intention_status").toString()));
      }
      if (jsonObj.get("person_desc") != null && !jsonObj.get("person_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `person_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("person_desc").toString()));
      }
      if (jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      // validate the optional field `pic_url`
      if (jsonObj.getAsJsonObject("pic_url") != null) {
        CloudResumeHeadPic.validateJsonObject(jsonObj.getAsJsonObject("pic_url"));
      }
      JsonArray jsonArraypositionIntentions = jsonObj.getAsJsonArray("position_intentions");
      if (jsonArraypositionIntentions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("position_intentions").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `position_intentions` to be an array in the JSON string but got `%s`", jsonObj.get("position_intentions").toString()));
        }

        // validate the optional field `position_intentions` (array)
        for (int i = 0; i < jsonArraypositionIntentions.size(); i++) {
          CloudResumePositionIntention.validateJsonObject(jsonArraypositionIntentions.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("position_type") != null && !jsonObj.get("position_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position_type").toString()));
      }
      if (jsonObj.get("residential_area") != null && !jsonObj.get("residential_area").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `residential_area` to be a primitive type in the JSON string but got `%s`", jsonObj.get("residential_area").toString()));
      }
      JsonArray jsonArrayskills = jsonObj.getAsJsonArray("skills");
      if (jsonArrayskills != null) {
        // ensure the json data is an array
        if (!jsonObj.get("skills").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `skills` to be an array in the JSON string but got `%s`", jsonObj.get("skills").toString()));
        }

        // validate the optional field `skills` (array)
        for (int i = 0; i < jsonArrayskills.size(); i++) {
          CloudResumeSkillInfo.validateJsonObject(jsonArrayskills.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("user_name") != null && !jsonObj.get("user_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_name").toString()));
      }
      JsonArray jsonArrayworkExperiences = jsonObj.getAsJsonArray("work_experiences");
      if (jsonArrayworkExperiences != null) {
        // ensure the json data is an array
        if (!jsonObj.get("work_experiences").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `work_experiences` to be an array in the JSON string but got `%s`", jsonObj.get("work_experiences").toString()));
        }

        // validate the optional field `work_experiences` (array)
        for (int i = 0; i < jsonArrayworkExperiences.size(); i++) {
          CloudResumeWorkExperience.validateJsonObject(jsonArrayworkExperiences.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCustomerJobworthCloudresumeQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCustomerJobworthCloudresumeQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCustomerJobworthCloudresumeQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCustomerJobworthCloudresumeQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCustomerJobworthCloudresumeQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCustomerJobworthCloudresumeQueryResponseModel value) throws IOException {
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
           public ZhimaCustomerJobworthCloudresumeQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ZhimaCustomerJobworthCloudresumeQueryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ZhimaCustomerJobworthCloudresumeQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCustomerJobworthCloudresumeQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCustomerJobworthCloudresumeQueryResponseModel
  */
  public static ZhimaCustomerJobworthCloudresumeQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCustomerJobworthCloudresumeQueryResponseModel.class);
  }

 /**
  * Convert an instance of ZhimaCustomerJobworthCloudresumeQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

