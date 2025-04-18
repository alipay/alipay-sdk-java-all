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
import com.alipay.v3.model.FunctionalService;
import com.alipay.v3.model.JourneyLocation;
import com.alipay.v3.model.OrderExtInfo;
import com.alipay.v3.model.OrderParticipantInfo;
import com.alipay.v3.model.OrderShopInfo;
import com.alipay.v3.model.OrderVehicleInfo;
import com.alipay.v3.model.SeatInfo;
import com.alipay.v3.model.UserInfomation;
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
 * TicketOrderInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TicketOrderInfo {
  public static final String SERIALIZED_NAME_ARRIVAL = "arrival";
  @SerializedName(SERIALIZED_NAME_ARRIVAL)
  private JourneyLocation arrival;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_DEPARTURE = "departure";
  @SerializedName(SERIALIZED_NAME_DEPARTURE)
  private JourneyLocation departure;

  public static final String SERIALIZED_NAME_EFFECTIVE_NUM = "effective_num";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_NUM)
  private Integer effectiveNum;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private List<OrderExtInfo> extInfo = null;

  public static final String SERIALIZED_NAME_FACE_VALUE = "face_value";
  @SerializedName(SERIALIZED_NAME_FACE_VALUE)
  private String faceValue;

  public static final String SERIALIZED_NAME_FUNCTIONAL_SERVICES = "functional_services";
  @SerializedName(SERIALIZED_NAME_FUNCTIONAL_SERVICES)
  private List<FunctionalService> functionalServices = null;

  public static final String SERIALIZED_NAME_INVALID_REASON = "invalid_reason";
  @SerializedName(SERIALIZED_NAME_INVALID_REASON)
  private String invalidReason;

  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private List<JourneyLocation> locations = null;

  public static final String SERIALIZED_NAME_MERCHANT_TICKET_NO = "merchant_ticket_no";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TICKET_NO)
  private String merchantTicketNo;

  public static final String SERIALIZED_NAME_SEAT_INFOS = "seat_infos";
  @SerializedName(SERIALIZED_NAME_SEAT_INFOS)
  private List<SeatInfo> seatInfos = null;

  public static final String SERIALIZED_NAME_SERVICE_PROVIDER = "service_provider";
  @SerializedName(SERIALIZED_NAME_SERVICE_PROVIDER)
  private OrderParticipantInfo serviceProvider;

  public static final String SERIALIZED_NAME_SHOPS = "shops";
  @SerializedName(SERIALIZED_NAME_SHOPS)
  private List<OrderShopInfo> shops = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TICKET_CREATE_TIME = "ticket_create_time";
  @SerializedName(SERIALIZED_NAME_TICKET_CREATE_TIME)
  private String ticketCreateTime;

  public static final String SERIALIZED_NAME_TICKET_MODIFY_TIME = "ticket_modify_time";
  @SerializedName(SERIALIZED_NAME_TICKET_MODIFY_TIME)
  private String ticketModifyTime;

  public static final String SERIALIZED_NAME_TICKET_NUM = "ticket_num";
  @SerializedName(SERIALIZED_NAME_TICKET_NUM)
  private Integer ticketNum;

  public static final String SERIALIZED_NAME_TICKET_USERS = "ticket_users";
  @SerializedName(SERIALIZED_NAME_TICKET_USERS)
  private List<UserInfomation> ticketUsers = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_VEHICLE_INFO = "vehicle_info";
  @SerializedName(SERIALIZED_NAME_VEHICLE_INFO)
  private OrderVehicleInfo vehicleInfo;

  public TicketOrderInfo() { 
  }

  public TicketOrderInfo arrival(JourneyLocation arrival) {
    
    this.arrival = arrival;
    return this;
  }

   /**
   * Get arrival
   * @return arrival
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JourneyLocation getArrival() {
    return arrival;
  }


  public void setArrival(JourneyLocation arrival) {
    this.arrival = arrival;
  }


  public TicketOrderInfo content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 凭证内容
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "凭证内容", value = "凭证内容")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public TicketOrderInfo departure(JourneyLocation departure) {
    
    this.departure = departure;
    return this;
  }

   /**
   * Get departure
   * @return departure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JourneyLocation getDeparture() {
    return departure;
  }


  public void setDeparture(JourneyLocation departure) {
    this.departure = departure;
  }


  public TicketOrderInfo effectiveNum(Integer effectiveNum) {
    
    this.effectiveNum = effectiveNum;
    return this;
  }

   /**
   * 凭证有效数
   * @return effectiveNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "凭证有效数")

  public Integer getEffectiveNum() {
    return effectiveNum;
  }


  public void setEffectiveNum(Integer effectiveNum) {
    this.effectiveNum = effectiveNum;
  }


  public TicketOrderInfo endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 凭证结束时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-02 12:21:22", value = "凭证结束时间")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public TicketOrderInfo extInfo(List<OrderExtInfo> extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

  public TicketOrderInfo addExtInfoItem(OrderExtInfo extInfoItem) {
    if (this.extInfo == null) {
      this.extInfo = new ArrayList<>();
    }
    this.extInfo.add(extInfoItem);
    return this;
  }

   /**
   * 扩展信息
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展信息")

  public List<OrderExtInfo> getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(List<OrderExtInfo> extInfo) {
    this.extInfo = extInfo;
  }


  public TicketOrderInfo faceValue(String faceValue) {
    
    this.faceValue = faceValue;
    return this;
  }

   /**
   * 票面价
   * @return faceValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9.99", value = "票面价")

  public String getFaceValue() {
    return faceValue;
  }


  public void setFaceValue(String faceValue) {
    this.faceValue = faceValue;
  }


  public TicketOrderInfo functionalServices(List<FunctionalService> functionalServices) {
    
    this.functionalServices = functionalServices;
    return this;
  }

  public TicketOrderInfo addFunctionalServicesItem(FunctionalService functionalServicesItem) {
    if (this.functionalServices == null) {
      this.functionalServices = new ArrayList<>();
    }
    this.functionalServices.add(functionalServicesItem);
    return this;
  }

   /**
   * 功能服务信息
   * @return functionalServices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "功能服务信息")

  public List<FunctionalService> getFunctionalServices() {
    return functionalServices;
  }


  public void setFunctionalServices(List<FunctionalService> functionalServices) {
    this.functionalServices = functionalServices;
  }


  public TicketOrderInfo invalidReason(String invalidReason) {
    
    this.invalidReason = invalidReason;
    return this;
  }

   /**
   * 凭证失效原因
   * @return invalidReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "用户取消", value = "凭证失效原因")

  public String getInvalidReason() {
    return invalidReason;
  }


  public void setInvalidReason(String invalidReason) {
    this.invalidReason = invalidReason;
  }


  public TicketOrderInfo locations(List<JourneyLocation> locations) {
    
    this.locations = locations;
    return this;
  }

  public TicketOrderInfo addLocationsItem(JourneyLocation locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * 凭证可使用地点
   * @return locations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "凭证可使用地点")

  public List<JourneyLocation> getLocations() {
    return locations;
  }


  public void setLocations(List<JourneyLocation> locations) {
    this.locations = locations;
  }


  public TicketOrderInfo merchantTicketNo(String merchantTicketNo) {
    
    this.merchantTicketNo = merchantTicketNo;
    return this;
  }

   /**
   * 商户侧凭证ID或核销码
   * @return merchantTicketNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "out_20210820", value = "商户侧凭证ID或核销码")

  public String getMerchantTicketNo() {
    return merchantTicketNo;
  }


  public void setMerchantTicketNo(String merchantTicketNo) {
    this.merchantTicketNo = merchantTicketNo;
  }


  public TicketOrderInfo seatInfos(List<SeatInfo> seatInfos) {
    
    this.seatInfos = seatInfos;
    return this;
  }

  public TicketOrderInfo addSeatInfosItem(SeatInfo seatInfosItem) {
    if (this.seatInfos == null) {
      this.seatInfos = new ArrayList<>();
    }
    this.seatInfos.add(seatInfosItem);
    return this;
  }

   /**
   * 座位信息
   * @return seatInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "座位信息")

  public List<SeatInfo> getSeatInfos() {
    return seatInfos;
  }


  public void setSeatInfos(List<SeatInfo> seatInfos) {
    this.seatInfos = seatInfos;
  }


  public TicketOrderInfo serviceProvider(OrderParticipantInfo serviceProvider) {
    
    this.serviceProvider = serviceProvider;
    return this;
  }

   /**
   * Get serviceProvider
   * @return serviceProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderParticipantInfo getServiceProvider() {
    return serviceProvider;
  }


  public void setServiceProvider(OrderParticipantInfo serviceProvider) {
    this.serviceProvider = serviceProvider;
  }


  public TicketOrderInfo shops(List<OrderShopInfo> shops) {
    
    this.shops = shops;
    return this;
  }

  public TicketOrderInfo addShopsItem(OrderShopInfo shopsItem) {
    if (this.shops == null) {
      this.shops = new ArrayList<>();
    }
    this.shops.add(shopsItem);
    return this;
  }

   /**
   * 凭证可使用门店列表
   * @return shops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "凭证可使用门店列表")

  public List<OrderShopInfo> getShops() {
    return shops;
  }


  public void setShops(List<OrderShopInfo> shops) {
    this.shops = shops;
  }


  public TicketOrderInfo startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 凭证开始时间
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01 08:00:00", value = "凭证开始时间")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public TicketOrderInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 凭证状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TICKETED", value = "凭证状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public TicketOrderInfo ticketCreateTime(String ticketCreateTime) {
    
    this.ticketCreateTime = ticketCreateTime;
    return this;
  }

   /**
   * 凭证创建时间
   * @return ticketCreateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01 08:00:01", value = "凭证创建时间")

  public String getTicketCreateTime() {
    return ticketCreateTime;
  }


  public void setTicketCreateTime(String ticketCreateTime) {
    this.ticketCreateTime = ticketCreateTime;
  }


  public TicketOrderInfo ticketModifyTime(String ticketModifyTime) {
    
    this.ticketModifyTime = ticketModifyTime;
    return this;
  }

   /**
   * 凭证修改时间
   * @return ticketModifyTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01 08:00:01", value = "凭证修改时间")

  public String getTicketModifyTime() {
    return ticketModifyTime;
  }


  public void setTicketModifyTime(String ticketModifyTime) {
    this.ticketModifyTime = ticketModifyTime;
  }


  public TicketOrderInfo ticketNum(Integer ticketNum) {
    
    this.ticketNum = ticketNum;
    return this;
  }

   /**
   * 凭证购买数
   * @return ticketNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "凭证购买数")

  public Integer getTicketNum() {
    return ticketNum;
  }


  public void setTicketNum(Integer ticketNum) {
    this.ticketNum = ticketNum;
  }


  public TicketOrderInfo ticketUsers(List<UserInfomation> ticketUsers) {
    
    this.ticketUsers = ticketUsers;
    return this;
  }

  public TicketOrderInfo addTicketUsersItem(UserInfomation ticketUsersItem) {
    if (this.ticketUsers == null) {
      this.ticketUsers = new ArrayList<>();
    }
    this.ticketUsers.add(ticketUsersItem);
    return this;
  }

   /**
   * 凭证使用者信息
   * @return ticketUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "凭证使用者信息")

  public List<UserInfomation> getTicketUsers() {
    return ticketUsers;
  }


  public void setTicketUsers(List<UserInfomation> ticketUsers) {
    this.ticketUsers = ticketUsers;
  }


  public TicketOrderInfo title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 凭证标题
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "上海-杭州", value = "凭证标题")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public TicketOrderInfo vehicleInfo(OrderVehicleInfo vehicleInfo) {
    
    this.vehicleInfo = vehicleInfo;
    return this;
  }

   /**
   * Get vehicleInfo
   * @return vehicleInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderVehicleInfo getVehicleInfo() {
    return vehicleInfo;
  }


  public void setVehicleInfo(OrderVehicleInfo vehicleInfo) {
    this.vehicleInfo = vehicleInfo;
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
   * @return the TicketOrderInfo instance itself
   */
  public TicketOrderInfo putAdditionalProperty(String key, Object value) {
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
    TicketOrderInfo ticketOrderInfo = (TicketOrderInfo) o;
    return Objects.equals(this.arrival, ticketOrderInfo.arrival) &&
        Objects.equals(this.content, ticketOrderInfo.content) &&
        Objects.equals(this.departure, ticketOrderInfo.departure) &&
        Objects.equals(this.effectiveNum, ticketOrderInfo.effectiveNum) &&
        Objects.equals(this.endTime, ticketOrderInfo.endTime) &&
        Objects.equals(this.extInfo, ticketOrderInfo.extInfo) &&
        Objects.equals(this.faceValue, ticketOrderInfo.faceValue) &&
        Objects.equals(this.functionalServices, ticketOrderInfo.functionalServices) &&
        Objects.equals(this.invalidReason, ticketOrderInfo.invalidReason) &&
        Objects.equals(this.locations, ticketOrderInfo.locations) &&
        Objects.equals(this.merchantTicketNo, ticketOrderInfo.merchantTicketNo) &&
        Objects.equals(this.seatInfos, ticketOrderInfo.seatInfos) &&
        Objects.equals(this.serviceProvider, ticketOrderInfo.serviceProvider) &&
        Objects.equals(this.shops, ticketOrderInfo.shops) &&
        Objects.equals(this.startTime, ticketOrderInfo.startTime) &&
        Objects.equals(this.status, ticketOrderInfo.status) &&
        Objects.equals(this.ticketCreateTime, ticketOrderInfo.ticketCreateTime) &&
        Objects.equals(this.ticketModifyTime, ticketOrderInfo.ticketModifyTime) &&
        Objects.equals(this.ticketNum, ticketOrderInfo.ticketNum) &&
        Objects.equals(this.ticketUsers, ticketOrderInfo.ticketUsers) &&
        Objects.equals(this.title, ticketOrderInfo.title) &&
        Objects.equals(this.vehicleInfo, ticketOrderInfo.vehicleInfo)&&
        Objects.equals(this.additionalProperties, ticketOrderInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrival, content, departure, effectiveNum, endTime, extInfo, faceValue, functionalServices, invalidReason, locations, merchantTicketNo, seatInfos, serviceProvider, shops, startTime, status, ticketCreateTime, ticketModifyTime, ticketNum, ticketUsers, title, vehicleInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketOrderInfo {\n");
    sb.append("    arrival: ").append(toIndentedString(arrival)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
    sb.append("    effectiveNum: ").append(toIndentedString(effectiveNum)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    faceValue: ").append(toIndentedString(faceValue)).append("\n");
    sb.append("    functionalServices: ").append(toIndentedString(functionalServices)).append("\n");
    sb.append("    invalidReason: ").append(toIndentedString(invalidReason)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    merchantTicketNo: ").append(toIndentedString(merchantTicketNo)).append("\n");
    sb.append("    seatInfos: ").append(toIndentedString(seatInfos)).append("\n");
    sb.append("    serviceProvider: ").append(toIndentedString(serviceProvider)).append("\n");
    sb.append("    shops: ").append(toIndentedString(shops)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ticketCreateTime: ").append(toIndentedString(ticketCreateTime)).append("\n");
    sb.append("    ticketModifyTime: ").append(toIndentedString(ticketModifyTime)).append("\n");
    sb.append("    ticketNum: ").append(toIndentedString(ticketNum)).append("\n");
    sb.append("    ticketUsers: ").append(toIndentedString(ticketUsers)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    vehicleInfo: ").append(toIndentedString(vehicleInfo)).append("\n");
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
    openapiFields.add("arrival");
    openapiFields.add("content");
    openapiFields.add("departure");
    openapiFields.add("effective_num");
    openapiFields.add("end_time");
    openapiFields.add("ext_info");
    openapiFields.add("face_value");
    openapiFields.add("functional_services");
    openapiFields.add("invalid_reason");
    openapiFields.add("locations");
    openapiFields.add("merchant_ticket_no");
    openapiFields.add("seat_infos");
    openapiFields.add("service_provider");
    openapiFields.add("shops");
    openapiFields.add("start_time");
    openapiFields.add("status");
    openapiFields.add("ticket_create_time");
    openapiFields.add("ticket_modify_time");
    openapiFields.add("ticket_num");
    openapiFields.add("ticket_users");
    openapiFields.add("title");
    openapiFields.add("vehicle_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TicketOrderInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TicketOrderInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TicketOrderInfo is not found in the empty JSON string", TicketOrderInfo.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `arrival`
      if (jsonObj.getAsJsonObject("arrival") != null) {
        JourneyLocation.validateJsonObject(jsonObj.getAsJsonObject("arrival"));
      }
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      // validate the optional field `departure`
      if (jsonObj.getAsJsonObject("departure") != null) {
        JourneyLocation.validateJsonObject(jsonObj.getAsJsonObject("departure"));
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      JsonArray jsonArrayextInfo = jsonObj.getAsJsonArray("ext_info");
      if (jsonArrayextInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ext_info").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be an array in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
        }

        // validate the optional field `ext_info` (array)
        for (int i = 0; i < jsonArrayextInfo.size(); i++) {
          OrderExtInfo.validateJsonObject(jsonArrayextInfo.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("face_value") != null && !jsonObj.get("face_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `face_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("face_value").toString()));
      }
      JsonArray jsonArrayfunctionalServices = jsonObj.getAsJsonArray("functional_services");
      if (jsonArrayfunctionalServices != null) {
        // ensure the json data is an array
        if (!jsonObj.get("functional_services").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `functional_services` to be an array in the JSON string but got `%s`", jsonObj.get("functional_services").toString()));
        }

        // validate the optional field `functional_services` (array)
        for (int i = 0; i < jsonArrayfunctionalServices.size(); i++) {
          FunctionalService.validateJsonObject(jsonArrayfunctionalServices.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("invalid_reason") != null && !jsonObj.get("invalid_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invalid_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invalid_reason").toString()));
      }
      JsonArray jsonArraylocations = jsonObj.getAsJsonArray("locations");
      if (jsonArraylocations != null) {
        // ensure the json data is an array
        if (!jsonObj.get("locations").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `locations` to be an array in the JSON string but got `%s`", jsonObj.get("locations").toString()));
        }

        // validate the optional field `locations` (array)
        for (int i = 0; i < jsonArraylocations.size(); i++) {
          JourneyLocation.validateJsonObject(jsonArraylocations.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("merchant_ticket_no") != null && !jsonObj.get("merchant_ticket_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_ticket_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_ticket_no").toString()));
      }
      JsonArray jsonArrayseatInfos = jsonObj.getAsJsonArray("seat_infos");
      if (jsonArrayseatInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("seat_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `seat_infos` to be an array in the JSON string but got `%s`", jsonObj.get("seat_infos").toString()));
        }

        // validate the optional field `seat_infos` (array)
        for (int i = 0; i < jsonArrayseatInfos.size(); i++) {
          SeatInfo.validateJsonObject(jsonArrayseatInfos.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `service_provider`
      if (jsonObj.getAsJsonObject("service_provider") != null) {
        OrderParticipantInfo.validateJsonObject(jsonObj.getAsJsonObject("service_provider"));
      }
      JsonArray jsonArrayshops = jsonObj.getAsJsonArray("shops");
      if (jsonArrayshops != null) {
        // ensure the json data is an array
        if (!jsonObj.get("shops").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `shops` to be an array in the JSON string but got `%s`", jsonObj.get("shops").toString()));
        }

        // validate the optional field `shops` (array)
        for (int i = 0; i < jsonArrayshops.size(); i++) {
          OrderShopInfo.validateJsonObject(jsonArrayshops.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("ticket_create_time") != null && !jsonObj.get("ticket_create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ticket_create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ticket_create_time").toString()));
      }
      if (jsonObj.get("ticket_modify_time") != null && !jsonObj.get("ticket_modify_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ticket_modify_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ticket_modify_time").toString()));
      }
      JsonArray jsonArrayticketUsers = jsonObj.getAsJsonArray("ticket_users");
      if (jsonArrayticketUsers != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ticket_users").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ticket_users` to be an array in the JSON string but got `%s`", jsonObj.get("ticket_users").toString()));
        }

        // validate the optional field `ticket_users` (array)
        for (int i = 0; i < jsonArrayticketUsers.size(); i++) {
          UserInfomation.validateJsonObject(jsonArrayticketUsers.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // validate the optional field `vehicle_info`
      if (jsonObj.getAsJsonObject("vehicle_info") != null) {
        OrderVehicleInfo.validateJsonObject(jsonObj.getAsJsonObject("vehicle_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TicketOrderInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TicketOrderInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TicketOrderInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TicketOrderInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TicketOrderInfo>() {
           @Override
           public void write(JsonWriter out, TicketOrderInfo value) throws IOException {
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
           public TicketOrderInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TicketOrderInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TicketOrderInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TicketOrderInfo
  * @throws IOException if the JSON string is invalid with respect to TicketOrderInfo
  */
  public static TicketOrderInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TicketOrderInfo.class);
  }

 /**
  * Convert an instance of TicketOrderInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

