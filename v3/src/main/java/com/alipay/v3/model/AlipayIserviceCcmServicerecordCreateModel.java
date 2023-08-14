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
import com.alipay.v3.model.ServiceRecordCatRequest;
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
 * AlipayIserviceCcmServicerecordCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmServicerecordCreateModel {
  public static final String SERIALIZED_NAME_ACID = "acid";
  @SerializedName(SERIALIZED_NAME_ACID)
  private String acid;

  public static final String SERIALIZED_NAME_AID = "aid";
  @SerializedName(SERIALIZED_NAME_AID)
  private String aid;

  public static final String SERIALIZED_NAME_ANI = "ani";
  @SerializedName(SERIALIZED_NAME_ANI)
  private String ani;

  public static final String SERIALIZED_NAME_ASID = "asid";
  @SerializedName(SERIALIZED_NAME_ASID)
  private String asid;

  public static final String SERIALIZED_NAME_CATEGORY_LIST = "category_list";
  @SerializedName(SERIALIZED_NAME_CATEGORY_LIST)
  private List<ServiceRecordCatRequest> categoryList = null;

  public static final String SERIALIZED_NAME_CHAT_BEGIN_TIME = "chat_begin_time";
  @SerializedName(SERIALIZED_NAME_CHAT_BEGIN_TIME)
  private String chatBeginTime;

  public static final String SERIALIZED_NAME_CHAT_END_TIME = "chat_end_time";
  @SerializedName(SERIALIZED_NAME_CHAT_END_TIME)
  private String chatEndTime;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_CREATOR_ID = "creator_id";
  @SerializedName(SERIALIZED_NAME_CREATOR_ID)
  private String creatorId;

  public static final String SERIALIZED_NAME_DISCON_SYMBOL = "discon_symbol";
  @SerializedName(SERIALIZED_NAME_DISCON_SYMBOL)
  private String disconSymbol;

  public static final String SERIALIZED_NAME_DNIS = "dnis";
  @SerializedName(SERIALIZED_NAME_DNIS)
  private String dnis;

  public static final String SERIALIZED_NAME_FILE_SIZE = "file_size";
  @SerializedName(SERIALIZED_NAME_FILE_SIZE)
  private Integer fileSize;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_MODIFIER_ID = "modifier_id";
  @SerializedName(SERIALIZED_NAME_MODIFIER_ID)
  private String modifierId;

  public static final String SERIALIZED_NAME_OUTBOUND_TASK_ID = "outbound_task_id";
  @SerializedName(SERIALIZED_NAME_OUTBOUND_TASK_ID)
  private String outboundTaskId;

  public static final String SERIALIZED_NAME_SATISFACTION = "satisfaction";
  @SerializedName(SERIALIZED_NAME_SATISFACTION)
  private String satisfaction;

  public static final String SERIALIZED_NAME_SATISFACTION_MEMO = "satisfaction_memo";
  @SerializedName(SERIALIZED_NAME_SATISFACTION_MEMO)
  private String satisfactionMemo;

  public static final String SERIALIZED_NAME_SERVICE_SOURCE = "service_source";
  @SerializedName(SERIALIZED_NAME_SERVICE_SOURCE)
  private String serviceSource;

  public static final String SERIALIZED_NAME_SERVICE_TIME = "service_time";
  @SerializedName(SERIALIZED_NAME_SERVICE_TIME)
  private Integer serviceTime;

  public static final String SERIALIZED_NAME_SKILLGROUP_ID = "skillgroup_id";
  @SerializedName(SERIALIZED_NAME_SKILLGROUP_ID)
  private String skillgroupId;

  public static final String SERIALIZED_NAME_SKILLGROUP_NAME = "skillgroup_name";
  @SerializedName(SERIALIZED_NAME_SKILLGROUP_NAME)
  private String skillgroupName;

  public static final String SERIALIZED_NAME_TNT_INST_ID = "tnt_inst_id";
  @SerializedName(SERIALIZED_NAME_TNT_INST_ID)
  private String tntInstId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_VERIFY_RESULT = "verify_result";
  @SerializedName(SERIALIZED_NAME_VERIFY_RESULT)
  private String verifyResult;

  public AlipayIserviceCcmServicerecordCreateModel() { 
  }

  public AlipayIserviceCcmServicerecordCreateModel acid(String acid) {
    
    this.acid = acid;
    return this;
  }

   /**
   * 来电唯一标识
   * @return acid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CCC/2459691380492662222224097452", value = "来电唯一标识")

  public String getAcid() {
    return acid;
  }


  public void setAcid(String acid) {
    this.acid = acid;
  }


  public AlipayIserviceCcmServicerecordCreateModel aid(String aid) {
    
    this.aid = aid;
    return this;
  }

   /**
   * 客服坐席号(软电话中定义的)
   * @return aid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20000105", value = "客服坐席号(软电话中定义的)")

  public String getAid() {
    return aid;
  }


  public void setAid(String aid) {
    this.aid = aid;
  }


  public AlipayIserviceCcmServicerecordCreateModel ani(String ani) {
    
    this.ani = ani;
    return this;
  }

   /**
   * 主叫号码
   * @return ani
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15123090087", value = "主叫号码")

  public String getAni() {
    return ani;
  }


  public void setAni(String ani) {
    this.ani = ani;
  }


  public AlipayIserviceCcmServicerecordCreateModel asid(String asid) {
    
    this.asid = asid;
    return this;
  }

   /**
   * 恒生专用来电唯一标识
   * @return asid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "29de02050ce1403db710a0b1f4daad6d", value = "恒生专用来电唯一标识")

  public String getAsid() {
    return asid;
  }


  public void setAsid(String asid) {
    this.asid = asid;
  }


  public AlipayIserviceCcmServicerecordCreateModel categoryList(List<ServiceRecordCatRequest> categoryList) {
    
    this.categoryList = categoryList;
    return this;
  }

  public AlipayIserviceCcmServicerecordCreateModel addCategoryListItem(ServiceRecordCatRequest categoryListItem) {
    if (this.categoryList == null) {
      this.categoryList = new ArrayList<>();
    }
    this.categoryList.add(categoryListItem);
    return this;
  }

   /**
   * 类目信息(详细信息请参考具体类型描述)
   * @return categoryList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "类目信息(详细信息请参考具体类型描述)")

  public List<ServiceRecordCatRequest> getCategoryList() {
    return categoryList;
  }


  public void setCategoryList(List<ServiceRecordCatRequest> categoryList) {
    this.categoryList = categoryList;
  }


  public AlipayIserviceCcmServicerecordCreateModel chatBeginTime(String chatBeginTime) {
    
    this.chatBeginTime = chatBeginTime;
    return this;
  }

   /**
   * 标准时间格式：yyyy-MM-dd HH:mm:ss
   * @return chatBeginTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-11-20 11:37:26", value = "标准时间格式：yyyy-MM-dd HH:mm:ss")

  public String getChatBeginTime() {
    return chatBeginTime;
  }


  public void setChatBeginTime(String chatBeginTime) {
    this.chatBeginTime = chatBeginTime;
  }


  public AlipayIserviceCcmServicerecordCreateModel chatEndTime(String chatEndTime) {
    
    this.chatEndTime = chatEndTime;
    return this;
  }

   /**
   * 标准时间格式：yyyy-MM-dd HH:mm:ss
   * @return chatEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-11-20 11:38:49", value = "标准时间格式：yyyy-MM-dd HH:mm:ss")

  public String getChatEndTime() {
    return chatEndTime;
  }


  public void setChatEndTime(String chatEndTime) {
    this.chatEndTime = chatEndTime;
  }


  public AlipayIserviceCcmServicerecordCreateModel city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * 来电地址
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "山东", value = "来电地址")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public AlipayIserviceCcmServicerecordCreateModel creatorId(String creatorId) {
    
    this.creatorId = creatorId;
    return this;
  }

   /**
   * 创建者ID
   * @return creatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020042801917879", value = "创建者ID")

  public String getCreatorId() {
    return creatorId;
  }


  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }


  public AlipayIserviceCcmServicerecordCreateModel disconSymbol(String disconSymbol) {
    
    this.disconSymbol = disconSymbol;
    return this;
  }

   /**
   * 先挂断方 AGENT:客服 CUSTOMER:客户
   * @return disconSymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AGENT", value = "先挂断方 AGENT:客服 CUSTOMER:客户")

  public String getDisconSymbol() {
    return disconSymbol;
  }


  public void setDisconSymbol(String disconSymbol) {
    this.disconSymbol = disconSymbol;
  }


  public AlipayIserviceCcmServicerecordCreateModel dnis(String dnis) {
    
    this.dnis = dnis;
    return this;
  }

   /**
   * 被叫号码
   * @return dnis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15925998721", value = "被叫号码")

  public String getDnis() {
    return dnis;
  }


  public void setDnis(String dnis) {
    this.dnis = dnis;
  }


  public AlipayIserviceCcmServicerecordCreateModel fileSize(Integer fileSize) {
    
    this.fileSize = fileSize;
    return this;
  }

   /**
   * 文件大小
   * @return fileSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1222000", value = "文件大小")

  public Integer getFileSize() {
    return fileSize;
  }


  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }


  public AlipayIserviceCcmServicerecordCreateModel gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 创建时间(yyyy-MM-dd HH:mm:ss)
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2010-11-11 11:11:11", value = "创建时间(yyyy-MM-dd HH:mm:ss)")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public AlipayIserviceCcmServicerecordCreateModel gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 修改时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2010-11-11 11:11:11", value = "修改时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public AlipayIserviceCcmServicerecordCreateModel memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 服务记录备注信息
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "亲，昨天已经寄给你了呢", value = "服务记录备注信息")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public AlipayIserviceCcmServicerecordCreateModel modifierId(String modifierId) {
    
    this.modifierId = modifierId;
    return this;
  }

   /**
   * 修改人ID
   * @return modifierId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020042801917879", value = "修改人ID")

  public String getModifierId() {
    return modifierId;
  }


  public void setModifierId(String modifierId) {
    this.modifierId = modifierId;
  }


  public AlipayIserviceCcmServicerecordCreateModel outboundTaskId(String outboundTaskId) {
    
    this.outboundTaskId = outboundTaskId;
    return this;
  }

   /**
   * 外呼任务ID
   * @return outboundTaskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.253.104.12_1d5d40fd-aa5e-4f23-9247-14cd28e125f2", value = "外呼任务ID")

  public String getOutboundTaskId() {
    return outboundTaskId;
  }


  public void setOutboundTaskId(String outboundTaskId) {
    this.outboundTaskId = outboundTaskId;
  }


  public AlipayIserviceCcmServicerecordCreateModel satisfaction(String satisfaction) {
    
    this.satisfaction = satisfaction;
    return this;
  }

   /**
   * 满意度 0:非常满意 1:满意 2:一般 3:不满意 4:非常不满意
   * @return satisfaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "满意度 0:非常满意 1:满意 2:一般 3:不满意 4:非常不满意")

  public String getSatisfaction() {
    return satisfaction;
  }


  public void setSatisfaction(String satisfaction) {
    this.satisfaction = satisfaction;
  }


  public AlipayIserviceCcmServicerecordCreateModel satisfactionMemo(String satisfactionMemo) {
    
    this.satisfactionMemo = satisfactionMemo;
    return this;
  }

   /**
   * 满意度补充信息
   * @return satisfactionMemo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "其它:非常不满意，完全都是我在自问自答;", value = "满意度补充信息")

  public String getSatisfactionMemo() {
    return satisfactionMemo;
  }


  public void setSatisfactionMemo(String satisfactionMemo) {
    this.satisfactionMemo = satisfactionMemo;
  }


  public AlipayIserviceCcmServicerecordCreateModel serviceSource(String serviceSource) {
    
    this.serviceSource = serviceSource;
    return this;
  }

   /**
   * 1:客户来电 4:电话回访 5:网点服务 6:在线服务 7:外呼任务 8:手动外呼 9:在线离线留言
   * @return serviceSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "1:客户来电 4:电话回访 5:网点服务 6:在线服务 7:外呼任务 8:手动外呼 9:在线离线留言")

  public String getServiceSource() {
    return serviceSource;
  }


  public void setServiceSource(String serviceSource) {
    this.serviceSource = serviceSource;
  }


  public AlipayIserviceCcmServicerecordCreateModel serviceTime(Integer serviceTime) {
    
    this.serviceTime = serviceTime;
    return this;
  }

   /**
   * 服务时长(单位:秒)
   * @return serviceTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1924", value = "服务时长(单位:秒)")

  public Integer getServiceTime() {
    return serviceTime;
  }


  public void setServiceTime(Integer serviceTime) {
    this.serviceTime = serviceTime;
  }


  public AlipayIserviceCcmServicerecordCreateModel skillgroupId(String skillgroupId) {
    
    this.skillgroupId = skillgroupId;
    return this;
  }

   /**
   * 技能组ID
   * @return skillgroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100000000001", value = "技能组ID")

  public String getSkillgroupId() {
    return skillgroupId;
  }


  public void setSkillgroupId(String skillgroupId) {
    this.skillgroupId = skillgroupId;
  }


  public AlipayIserviceCcmServicerecordCreateModel skillgroupName(String skillgroupName) {
    
    this.skillgroupName = skillgroupName;
    return this;
  }

   /**
   * 技能组名称(技能组ID对应的技能组名称)
   * @return skillgroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "融资业务还款组", value = "技能组名称(技能组ID对应的技能组名称)")

  public String getSkillgroupName() {
    return skillgroupName;
  }


  public void setSkillgroupName(String skillgroupName) {
    this.skillgroupName = skillgroupName;
  }


  public AlipayIserviceCcmServicerecordCreateModel tntInstId(String tntInstId) {
    
    this.tntInstId = tntInstId;
    return this;
  }

   /**
   * 业务租户
   * @return tntInstId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TTTKPICN", value = "业务租户")

  public String getTntInstId() {
    return tntInstId;
  }


  public void setTntInstId(String tntInstId) {
    this.tntInstId = tntInstId;
  }


  public AlipayIserviceCcmServicerecordCreateModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 来访用户唯一标识ID
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "202007011113010526000000035332", value = "来访用户唯一标识ID")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public AlipayIserviceCcmServicerecordCreateModel verifyResult(String verifyResult) {
    
    this.verifyResult = verifyResult;
    return this;
  }

   /**
   * IVR验证结果 ROLE_N:未定位到用户 CERTNO_Y_PWD_Y:证件号码+交易密码验证通过 CERTNO_Y_PWD_N:证件号码验证通过+交易密码不通过 CERTNO_Y_PWD_UNKNOW:证件号码验证通过 PHONE_Y_PWD_Y:来电手机+交易密码验证通过 PHONE_Y_PWD_N:来电手机+交易密码未通过 PHONE_Y_PWD_UNKNOW:来电手机账户 SEARCH_Y_PWD_Y:搜索定位用户+推屏交易密码通过 SEARCH_Y_PWD_N:搜索定位用户+推屏交易密码未通过 SEARCH_Y_PWD_UNKNOW:搜索定位用户
   * @return verifyResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ROLE_N", value = "IVR验证结果 ROLE_N:未定位到用户 CERTNO_Y_PWD_Y:证件号码+交易密码验证通过 CERTNO_Y_PWD_N:证件号码验证通过+交易密码不通过 CERTNO_Y_PWD_UNKNOW:证件号码验证通过 PHONE_Y_PWD_Y:来电手机+交易密码验证通过 PHONE_Y_PWD_N:来电手机+交易密码未通过 PHONE_Y_PWD_UNKNOW:来电手机账户 SEARCH_Y_PWD_Y:搜索定位用户+推屏交易密码通过 SEARCH_Y_PWD_N:搜索定位用户+推屏交易密码未通过 SEARCH_Y_PWD_UNKNOW:搜索定位用户")

  public String getVerifyResult() {
    return verifyResult;
  }


  public void setVerifyResult(String verifyResult) {
    this.verifyResult = verifyResult;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayIserviceCcmServicerecordCreateModel alipayIserviceCcmServicerecordCreateModel = (AlipayIserviceCcmServicerecordCreateModel) o;
    return Objects.equals(this.acid, alipayIserviceCcmServicerecordCreateModel.acid) &&
        Objects.equals(this.aid, alipayIserviceCcmServicerecordCreateModel.aid) &&
        Objects.equals(this.ani, alipayIserviceCcmServicerecordCreateModel.ani) &&
        Objects.equals(this.asid, alipayIserviceCcmServicerecordCreateModel.asid) &&
        Objects.equals(this.categoryList, alipayIserviceCcmServicerecordCreateModel.categoryList) &&
        Objects.equals(this.chatBeginTime, alipayIserviceCcmServicerecordCreateModel.chatBeginTime) &&
        Objects.equals(this.chatEndTime, alipayIserviceCcmServicerecordCreateModel.chatEndTime) &&
        Objects.equals(this.city, alipayIserviceCcmServicerecordCreateModel.city) &&
        Objects.equals(this.creatorId, alipayIserviceCcmServicerecordCreateModel.creatorId) &&
        Objects.equals(this.disconSymbol, alipayIserviceCcmServicerecordCreateModel.disconSymbol) &&
        Objects.equals(this.dnis, alipayIserviceCcmServicerecordCreateModel.dnis) &&
        Objects.equals(this.fileSize, alipayIserviceCcmServicerecordCreateModel.fileSize) &&
        Objects.equals(this.gmtCreate, alipayIserviceCcmServicerecordCreateModel.gmtCreate) &&
        Objects.equals(this.gmtModified, alipayIserviceCcmServicerecordCreateModel.gmtModified) &&
        Objects.equals(this.memo, alipayIserviceCcmServicerecordCreateModel.memo) &&
        Objects.equals(this.modifierId, alipayIserviceCcmServicerecordCreateModel.modifierId) &&
        Objects.equals(this.outboundTaskId, alipayIserviceCcmServicerecordCreateModel.outboundTaskId) &&
        Objects.equals(this.satisfaction, alipayIserviceCcmServicerecordCreateModel.satisfaction) &&
        Objects.equals(this.satisfactionMemo, alipayIserviceCcmServicerecordCreateModel.satisfactionMemo) &&
        Objects.equals(this.serviceSource, alipayIserviceCcmServicerecordCreateModel.serviceSource) &&
        Objects.equals(this.serviceTime, alipayIserviceCcmServicerecordCreateModel.serviceTime) &&
        Objects.equals(this.skillgroupId, alipayIserviceCcmServicerecordCreateModel.skillgroupId) &&
        Objects.equals(this.skillgroupName, alipayIserviceCcmServicerecordCreateModel.skillgroupName) &&
        Objects.equals(this.tntInstId, alipayIserviceCcmServicerecordCreateModel.tntInstId) &&
        Objects.equals(this.userId, alipayIserviceCcmServicerecordCreateModel.userId) &&
        Objects.equals(this.verifyResult, alipayIserviceCcmServicerecordCreateModel.verifyResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acid, aid, ani, asid, categoryList, chatBeginTime, chatEndTime, city, creatorId, disconSymbol, dnis, fileSize, gmtCreate, gmtModified, memo, modifierId, outboundTaskId, satisfaction, satisfactionMemo, serviceSource, serviceTime, skillgroupId, skillgroupName, tntInstId, userId, verifyResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmServicerecordCreateModel {\n");
    sb.append("    acid: ").append(toIndentedString(acid)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    ani: ").append(toIndentedString(ani)).append("\n");
    sb.append("    asid: ").append(toIndentedString(asid)).append("\n");
    sb.append("    categoryList: ").append(toIndentedString(categoryList)).append("\n");
    sb.append("    chatBeginTime: ").append(toIndentedString(chatBeginTime)).append("\n");
    sb.append("    chatEndTime: ").append(toIndentedString(chatEndTime)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    disconSymbol: ").append(toIndentedString(disconSymbol)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    modifierId: ").append(toIndentedString(modifierId)).append("\n");
    sb.append("    outboundTaskId: ").append(toIndentedString(outboundTaskId)).append("\n");
    sb.append("    satisfaction: ").append(toIndentedString(satisfaction)).append("\n");
    sb.append("    satisfactionMemo: ").append(toIndentedString(satisfactionMemo)).append("\n");
    sb.append("    serviceSource: ").append(toIndentedString(serviceSource)).append("\n");
    sb.append("    serviceTime: ").append(toIndentedString(serviceTime)).append("\n");
    sb.append("    skillgroupId: ").append(toIndentedString(skillgroupId)).append("\n");
    sb.append("    skillgroupName: ").append(toIndentedString(skillgroupName)).append("\n");
    sb.append("    tntInstId: ").append(toIndentedString(tntInstId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    verifyResult: ").append(toIndentedString(verifyResult)).append("\n");
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
    openapiFields.add("acid");
    openapiFields.add("aid");
    openapiFields.add("ani");
    openapiFields.add("asid");
    openapiFields.add("category_list");
    openapiFields.add("chat_begin_time");
    openapiFields.add("chat_end_time");
    openapiFields.add("city");
    openapiFields.add("creator_id");
    openapiFields.add("discon_symbol");
    openapiFields.add("dnis");
    openapiFields.add("file_size");
    openapiFields.add("gmt_create");
    openapiFields.add("gmt_modified");
    openapiFields.add("memo");
    openapiFields.add("modifier_id");
    openapiFields.add("outbound_task_id");
    openapiFields.add("satisfaction");
    openapiFields.add("satisfaction_memo");
    openapiFields.add("service_source");
    openapiFields.add("service_time");
    openapiFields.add("skillgroup_id");
    openapiFields.add("skillgroup_name");
    openapiFields.add("tnt_inst_id");
    openapiFields.add("user_id");
    openapiFields.add("verify_result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmServicerecordCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmServicerecordCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmServicerecordCreateModel is not found in the empty JSON string", AlipayIserviceCcmServicerecordCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayIserviceCcmServicerecordCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayIserviceCcmServicerecordCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("acid") != null && !jsonObj.get("acid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acid").toString()));
      }
      if (jsonObj.get("aid") != null && !jsonObj.get("aid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aid").toString()));
      }
      if (jsonObj.get("ani") != null && !jsonObj.get("ani").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ani` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ani").toString()));
      }
      if (jsonObj.get("asid") != null && !jsonObj.get("asid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asid").toString()));
      }
      JsonArray jsonArraycategoryList = jsonObj.getAsJsonArray("category_list");
      if (jsonArraycategoryList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("category_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `category_list` to be an array in the JSON string but got `%s`", jsonObj.get("category_list").toString()));
        }

        // validate the optional field `category_list` (array)
        for (int i = 0; i < jsonArraycategoryList.size(); i++) {
          ServiceRecordCatRequest.validateJsonObject(jsonArraycategoryList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("chat_begin_time") != null && !jsonObj.get("chat_begin_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chat_begin_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chat_begin_time").toString()));
      }
      if (jsonObj.get("chat_end_time") != null && !jsonObj.get("chat_end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chat_end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chat_end_time").toString()));
      }
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (jsonObj.get("creator_id") != null && !jsonObj.get("creator_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator_id").toString()));
      }
      if (jsonObj.get("discon_symbol") != null && !jsonObj.get("discon_symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discon_symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discon_symbol").toString()));
      }
      if (jsonObj.get("dnis") != null && !jsonObj.get("dnis").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dnis` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dnis").toString()));
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("modifier_id") != null && !jsonObj.get("modifier_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifier_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifier_id").toString()));
      }
      if (jsonObj.get("outbound_task_id") != null && !jsonObj.get("outbound_task_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outbound_task_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outbound_task_id").toString()));
      }
      if (jsonObj.get("satisfaction") != null && !jsonObj.get("satisfaction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `satisfaction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("satisfaction").toString()));
      }
      if (jsonObj.get("satisfaction_memo") != null && !jsonObj.get("satisfaction_memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `satisfaction_memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("satisfaction_memo").toString()));
      }
      if (jsonObj.get("service_source") != null && !jsonObj.get("service_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_source").toString()));
      }
      if (jsonObj.get("skillgroup_id") != null && !jsonObj.get("skillgroup_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skillgroup_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skillgroup_id").toString()));
      }
      if (jsonObj.get("skillgroup_name") != null && !jsonObj.get("skillgroup_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skillgroup_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skillgroup_name").toString()));
      }
      if (jsonObj.get("tnt_inst_id") != null && !jsonObj.get("tnt_inst_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tnt_inst_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tnt_inst_id").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      if (jsonObj.get("verify_result") != null && !jsonObj.get("verify_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verify_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verify_result").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmServicerecordCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmServicerecordCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmServicerecordCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmServicerecordCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmServicerecordCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmServicerecordCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayIserviceCcmServicerecordCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayIserviceCcmServicerecordCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmServicerecordCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmServicerecordCreateModel
  */
  public static AlipayIserviceCcmServicerecordCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmServicerecordCreateModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmServicerecordCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

