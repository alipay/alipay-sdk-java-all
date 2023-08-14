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
import com.alipay.v3.model.ChatMessage;
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
 * AlipayIserviceCcmOlsChatrecordQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmOlsChatrecordQueryResponseModel {
  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private String agentId;

  public static final String SERIALIZED_NAME_AGENT_NAME = "agent_name";
  @SerializedName(SERIALIZED_NAME_AGENT_NAME)
  private String agentName;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private String categories;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_GROUP_NAME = "group_name";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<ChatMessage> messages = null;

  public static final String SERIALIZED_NAME_SATISFACTION = "satisfaction";
  @SerializedName(SERIALIZED_NAME_SATISFACTION)
  private String satisfaction;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TALK_DURATION = "talk_duration";
  @SerializedName(SERIALIZED_NAME_TALK_DURATION)
  private Integer talkDuration;

  public static final String SERIALIZED_NAME_VISITOR_PROVINCE = "visitor_province";
  @SerializedName(SERIALIZED_NAME_VISITOR_PROVINCE)
  private String visitorProvince;

  public AlipayIserviceCcmOlsChatrecordQueryResponseModel() { 
  }

  public AlipayIserviceCcmOlsChatrecordQueryResponseModel agentId(String agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 客服id
   * @return agentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2008123455", value = "客服id")

  public String getAgentId() {
    return agentId;
  }


  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  public AlipayIserviceCcmOlsChatrecordQueryResponseModel agentName(String agentName) {
    
    this.agentName = agentName;
    return this;
  }

   /**
   * 客服昵称
   * @return agentName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "客服003", value = "客服昵称")

  public String getAgentName() {
    return agentName;
  }


  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }


  public AlipayIserviceCcmOlsChatrecordQueryResponseModel categories(String categories) {
    
    this.categories = categories;
    return this;
  }

   /**
   * 多个层级类目信息
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[[{\\\"id\\\":111,\\\"name\\\":\\\"保险\\\"},{\\\"id\\\":122,\\\"name\\\":\\\"财保\\\"},{\\\"id\\\":133,\\\"name\\\":\\\"车险\\\"}],[{\\\"id\\\":211,\\\"name\\\":\\\"售后\\\"},{\\\"id\\\":222,\\\"name\\\":\\\"出险\\\"},{\\\"id\\\":233,\\\"name\\\":\\\"理赔\\\"}]]", value = "多个层级类目信息")

  public String getCategories() {
    return categories;
  }


  public void setCategories(String categories) {
    this.categories = categories;
  }


  public AlipayIserviceCcmOlsChatrecordQueryResponseModel groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 在线技能组id
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "在线技能组id")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public AlipayIserviceCcmOlsChatrecordQueryResponseModel groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * 在线技能组名称
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "基础技能组", value = "在线技能组名称")

  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public AlipayIserviceCcmOlsChatrecordQueryResponseModel memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * 备注信息
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "该问题可通过xx手段解决，请回复客户xxxxxx。", value = "备注信息")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public AlipayIserviceCcmOlsChatrecordQueryResponseModel messages(List<ChatMessage> messages) {
    
    this.messages = messages;
    return this;
  }

  public AlipayIserviceCcmOlsChatrecordQueryResponseModel addMessagesItem(ChatMessage messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * 聊天消息列表
   * @return messages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "聊天消息列表")

  public List<ChatMessage> getMessages() {
    return messages;
  }


  public void setMessages(List<ChatMessage> messages) {
    this.messages = messages;
  }


  public AlipayIserviceCcmOlsChatrecordQueryResponseModel satisfaction(String satisfaction) {
    
    this.satisfaction = satisfaction;
    return this;
  }

   /**
   * 满意度。 0：非常满意 1：满意 2：一般 3：不满意 4：非常不满意
   * @return satisfaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "满意度。 0：非常满意 1：满意 2：一般 3：不满意 4：非常不满意")

  public String getSatisfaction() {
    return satisfaction;
  }


  public void setSatisfaction(String satisfaction) {
    this.satisfaction = satisfaction;
  }


  public AlipayIserviceCcmOlsChatrecordQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 服务记录状态。1：待处理 2：暂存 3：完结 4：废除 5：无效 6：未知
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "服务记录状态。1：待处理 2：暂存 3：完结 4：废除 5：无效 6：未知")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayIserviceCcmOlsChatrecordQueryResponseModel talkDuration(Integer talkDuration) {
    
    this.talkDuration = talkDuration;
    return this;
  }

   /**
   * 在线服务时长，单位秒
   * @return talkDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3600", value = "在线服务时长，单位秒")

  public Integer getTalkDuration() {
    return talkDuration;
  }


  public void setTalkDuration(Integer talkDuration) {
    this.talkDuration = talkDuration;
  }


  public AlipayIserviceCcmOlsChatrecordQueryResponseModel visitorProvince(String visitorProvince) {
    
    this.visitorProvince = visitorProvince;
    return this;
  }

   /**
   * 访客归属地
   * @return visitorProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "浙江", value = "访客归属地")

  public String getVisitorProvince() {
    return visitorProvince;
  }


  public void setVisitorProvince(String visitorProvince) {
    this.visitorProvince = visitorProvince;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayIserviceCcmOlsChatrecordQueryResponseModel alipayIserviceCcmOlsChatrecordQueryResponseModel = (AlipayIserviceCcmOlsChatrecordQueryResponseModel) o;
    return Objects.equals(this.agentId, alipayIserviceCcmOlsChatrecordQueryResponseModel.agentId) &&
        Objects.equals(this.agentName, alipayIserviceCcmOlsChatrecordQueryResponseModel.agentName) &&
        Objects.equals(this.categories, alipayIserviceCcmOlsChatrecordQueryResponseModel.categories) &&
        Objects.equals(this.groupId, alipayIserviceCcmOlsChatrecordQueryResponseModel.groupId) &&
        Objects.equals(this.groupName, alipayIserviceCcmOlsChatrecordQueryResponseModel.groupName) &&
        Objects.equals(this.memo, alipayIserviceCcmOlsChatrecordQueryResponseModel.memo) &&
        Objects.equals(this.messages, alipayIserviceCcmOlsChatrecordQueryResponseModel.messages) &&
        Objects.equals(this.satisfaction, alipayIserviceCcmOlsChatrecordQueryResponseModel.satisfaction) &&
        Objects.equals(this.status, alipayIserviceCcmOlsChatrecordQueryResponseModel.status) &&
        Objects.equals(this.talkDuration, alipayIserviceCcmOlsChatrecordQueryResponseModel.talkDuration) &&
        Objects.equals(this.visitorProvince, alipayIserviceCcmOlsChatrecordQueryResponseModel.visitorProvince);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, agentName, categories, groupId, groupName, memo, messages, satisfaction, status, talkDuration, visitorProvince);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmOlsChatrecordQueryResponseModel {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    satisfaction: ").append(toIndentedString(satisfaction)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    talkDuration: ").append(toIndentedString(talkDuration)).append("\n");
    sb.append("    visitorProvince: ").append(toIndentedString(visitorProvince)).append("\n");
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
    openapiFields.add("agent_id");
    openapiFields.add("agent_name");
    openapiFields.add("categories");
    openapiFields.add("group_id");
    openapiFields.add("group_name");
    openapiFields.add("memo");
    openapiFields.add("messages");
    openapiFields.add("satisfaction");
    openapiFields.add("status");
    openapiFields.add("talk_duration");
    openapiFields.add("visitor_province");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmOlsChatrecordQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmOlsChatrecordQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmOlsChatrecordQueryResponseModel is not found in the empty JSON string", AlipayIserviceCcmOlsChatrecordQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayIserviceCcmOlsChatrecordQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayIserviceCcmOlsChatrecordQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agent_id") != null && !jsonObj.get("agent_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agent_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agent_id").toString()));
      }
      if (jsonObj.get("agent_name") != null && !jsonObj.get("agent_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agent_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agent_name").toString()));
      }
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `categories` to be a primitive type in the JSON string but got `%s`", jsonObj.get("categories").toString()));
      }
      if (jsonObj.get("group_id") != null && !jsonObj.get("group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group_id").toString()));
      }
      if (jsonObj.get("group_name") != null && !jsonObj.get("group_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group_name").toString()));
      }
      if (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      JsonArray jsonArraymessages = jsonObj.getAsJsonArray("messages");
      if (jsonArraymessages != null) {
        // ensure the json data is an array
        if (!jsonObj.get("messages").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
        }

        // validate the optional field `messages` (array)
        for (int i = 0; i < jsonArraymessages.size(); i++) {
          ChatMessage.validateJsonObject(jsonArraymessages.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("satisfaction") != null && !jsonObj.get("satisfaction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `satisfaction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("satisfaction").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("visitor_province") != null && !jsonObj.get("visitor_province").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visitor_province` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visitor_province").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmOlsChatrecordQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmOlsChatrecordQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmOlsChatrecordQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmOlsChatrecordQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmOlsChatrecordQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmOlsChatrecordQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayIserviceCcmOlsChatrecordQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayIserviceCcmOlsChatrecordQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmOlsChatrecordQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmOlsChatrecordQueryResponseModel
  */
  public static AlipayIserviceCcmOlsChatrecordQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmOlsChatrecordQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmOlsChatrecordQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

