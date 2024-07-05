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
 * AlipayIserviceCcmAgentSchedulelogQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmAgentSchedulelogQueryModel {
  public static final String SERIALIZED_NAME_AGENT_IDS = "agent_ids";
  @SerializedName(SERIALIZED_NAME_AGENT_IDS)
  private List<String> agentIds = null;

  public static final String SERIALIZED_NAME_CCS_INSTANCE_ID = "ccs_instance_id";
  @SerializedName(SERIALIZED_NAME_CCS_INSTANCE_ID)
  private String ccsInstanceId;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_START_ID = "start_id";
  @SerializedName(SERIALIZED_NAME_START_ID)
  private Integer startId;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public AlipayIserviceCcmAgentSchedulelogQueryModel() { 
  }

  public AlipayIserviceCcmAgentSchedulelogQueryModel agentIds(List<String> agentIds) {
    
    this.agentIds = agentIds;
    return this;
  }

  public AlipayIserviceCcmAgentSchedulelogQueryModel addAgentIdsItem(String agentIdsItem) {
    if (this.agentIds == null) {
      this.agentIds = new ArrayList<>();
    }
    this.agentIds.add(agentIdsItem);
    return this;
  }

   /**
   * 客服id集合,限制最多100个id,不传查询部门下所有客服的状态变更流水日志
   * @return agentIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2018101801902073\",\"2018101801902090\"]", value = "客服id集合,限制最多100个id,不传查询部门下所有客服的状态变更流水日志")

  public List<String> getAgentIds() {
    return agentIds;
  }


  public void setAgentIds(List<String> agentIds) {
    this.agentIds = agentIds;
  }


  public AlipayIserviceCcmAgentSchedulelogQueryModel ccsInstanceId(String ccsInstanceId) {
    
    this.ccsInstanceId = ccsInstanceId;
    return this;
  }

   /**
   * 部门id（即租户实例ID、数据权限ID）
   * @return ccsInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "kaj_9DA1", value = "部门id（即租户实例ID、数据权限ID）")

  public String getCcsInstanceId() {
    return ccsInstanceId;
  }


  public void setCcsInstanceId(String ccsInstanceId) {
    this.ccsInstanceId = ccsInstanceId;
  }


  public AlipayIserviceCcmAgentSchedulelogQueryModel endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 客服状态变更结束时间,开始时间与结束时间间隔不能超过1天,采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-10-24 00:00:00", value = "客服状态变更结束时间,开始时间与结束时间间隔不能超过1天,采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd'T'HH:mm:ss'Z'")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public AlipayIserviceCcmAgentSchedulelogQueryModel limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * 查询条数,最大100, 不传默认100
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "查询条数,最大100, 不传默认100")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public AlipayIserviceCcmAgentSchedulelogQueryModel pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 查询结果的页码，起始值为 1，默认值为 1
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "查询结果的页码，起始值为 1，默认值为 1")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayIserviceCcmAgentSchedulelogQueryModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 分页查询时设置的每页记录数，最大值 100 行，默认为 100
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "分页查询时设置的每页记录数，最大值 100 行，默认为 100")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayIserviceCcmAgentSchedulelogQueryModel startId(Integer startId) {
    
    this.startId = startId;
    return this;
  }

   /**
   * 起始id,分页导出的起始客服状态变更流水id,第一页传0,翻页时传上一页结果的最大id
   * @return startId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10223", value = "起始id,分页导出的起始客服状态变更流水id,第一页传0,翻页时传上一页结果的最大id")

  public Integer getStartId() {
    return startId;
  }


  public void setStartId(Integer startId) {
    this.startId = startId;
  }


  public AlipayIserviceCcmAgentSchedulelogQueryModel startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 客服状态变更开始时间,采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-10-23 00:00:00", value = "客服状态变更开始时间,采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd'T'HH:mm:ss'Z'")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
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
   * @return the AlipayIserviceCcmAgentSchedulelogQueryModel instance itself
   */
  public AlipayIserviceCcmAgentSchedulelogQueryModel putAdditionalProperty(String key, Object value) {
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
    AlipayIserviceCcmAgentSchedulelogQueryModel alipayIserviceCcmAgentSchedulelogQueryModel = (AlipayIserviceCcmAgentSchedulelogQueryModel) o;
    return Objects.equals(this.agentIds, alipayIserviceCcmAgentSchedulelogQueryModel.agentIds) &&
        Objects.equals(this.ccsInstanceId, alipayIserviceCcmAgentSchedulelogQueryModel.ccsInstanceId) &&
        Objects.equals(this.endTime, alipayIserviceCcmAgentSchedulelogQueryModel.endTime) &&
        Objects.equals(this.limit, alipayIserviceCcmAgentSchedulelogQueryModel.limit) &&
        Objects.equals(this.pageNum, alipayIserviceCcmAgentSchedulelogQueryModel.pageNum) &&
        Objects.equals(this.pageSize, alipayIserviceCcmAgentSchedulelogQueryModel.pageSize) &&
        Objects.equals(this.startId, alipayIserviceCcmAgentSchedulelogQueryModel.startId) &&
        Objects.equals(this.startTime, alipayIserviceCcmAgentSchedulelogQueryModel.startTime)&&
        Objects.equals(this.additionalProperties, alipayIserviceCcmAgentSchedulelogQueryModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentIds, ccsInstanceId, endTime, limit, pageNum, pageSize, startId, startTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmAgentSchedulelogQueryModel {\n");
    sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
    sb.append("    ccsInstanceId: ").append(toIndentedString(ccsInstanceId)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    startId: ").append(toIndentedString(startId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("agent_ids");
    openapiFields.add("ccs_instance_id");
    openapiFields.add("end_time");
    openapiFields.add("limit");
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("start_id");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmAgentSchedulelogQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmAgentSchedulelogQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmAgentSchedulelogQueryModel is not found in the empty JSON string", AlipayIserviceCcmAgentSchedulelogQueryModel.openapiRequiredFields.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("agent_ids") != null && !jsonObj.get("agent_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `agent_ids` to be an array in the JSON string but got `%s`", jsonObj.get("agent_ids").toString()));
      }
      if (jsonObj.get("ccs_instance_id") != null && !jsonObj.get("ccs_instance_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ccs_instance_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ccs_instance_id").toString()));
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmAgentSchedulelogQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmAgentSchedulelogQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmAgentSchedulelogQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmAgentSchedulelogQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmAgentSchedulelogQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmAgentSchedulelogQueryModel value) throws IOException {
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
           public AlipayIserviceCcmAgentSchedulelogQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayIserviceCcmAgentSchedulelogQueryModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayIserviceCcmAgentSchedulelogQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmAgentSchedulelogQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmAgentSchedulelogQueryModel
  */
  public static AlipayIserviceCcmAgentSchedulelogQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmAgentSchedulelogQueryModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmAgentSchedulelogQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

