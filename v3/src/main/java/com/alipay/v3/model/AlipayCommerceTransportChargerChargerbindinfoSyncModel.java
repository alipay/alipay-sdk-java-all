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
 * AlipayCommerceTransportChargerChargerbindinfoSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceTransportChargerChargerbindinfoSyncModel {
  public static final String SERIALIZED_NAME_BIND_QRCODE = "bind_qrcode";
  @SerializedName(SERIALIZED_NAME_BIND_QRCODE)
  private String bindQrcode;

  public static final String SERIALIZED_NAME_BIND_STATUS = "bind_status";
  @SerializedName(SERIALIZED_NAME_BIND_STATUS)
  private String bindStatus;

  public static final String SERIALIZED_NAME_BIND_TIME = "bind_time";
  @SerializedName(SERIALIZED_NAME_BIND_TIME)
  private String bindTime;

  public static final String SERIALIZED_NAME_CONNECTOR_TYPE = "connector_type";
  @SerializedName(SERIALIZED_NAME_CONNECTOR_TYPE)
  private String connectorType;

  public static final String SERIALIZED_NAME_CURRENT_OUTPUT_TYPE = "current_output_type";
  @SerializedName(SERIALIZED_NAME_CURRENT_OUTPUT_TYPE)
  private String currentOutputType;

  public static final String SERIALIZED_NAME_EQUIP_ID = "equip_id";
  @SerializedName(SERIALIZED_NAME_EQUIP_ID)
  private String equipId;

  public static final String SERIALIZED_NAME_EQUIP_IMEI = "equip_imei";
  @SerializedName(SERIALIZED_NAME_EQUIP_IMEI)
  private String equipImei;

  public static final String SERIALIZED_NAME_EQUIP_NAME = "equip_name";
  @SerializedName(SERIALIZED_NAME_EQUIP_NAME)
  private String equipName;

  public static final String SERIALIZED_NAME_EQUIP_SN = "equip_sn";
  @SerializedName(SERIALIZED_NAME_EQUIP_SN)
  private String equipSn;

  public static final String SERIALIZED_NAME_EQUIP_STATUS = "equip_status";
  @SerializedName(SERIALIZED_NAME_EQUIP_STATUS)
  private String equipStatus;

  public static final String SERIALIZED_NAME_EQUIP_TYPE_NO = "equip_type_no";
  @SerializedName(SERIALIZED_NAME_EQUIP_TYPE_NO)
  private String equipTypeNo;

  public static final String SERIALIZED_NAME_OPERATOR_ID = "operator_id";
  @SerializedName(SERIALIZED_NAME_OPERATOR_ID)
  private String operatorId;

  public static final String SERIALIZED_NAME_OPERATOR_UID = "operator_uid";
  @SerializedName(SERIALIZED_NAME_OPERATOR_UID)
  private String operatorUid;

  public static final String SERIALIZED_NAME_RATED_CURRENT = "rated_current";
  @SerializedName(SERIALIZED_NAME_RATED_CURRENT)
  private String ratedCurrent;

  public static final String SERIALIZED_NAME_RATED_POWER = "rated_power";
  @SerializedName(SERIALIZED_NAME_RATED_POWER)
  private String ratedPower;

  public static final String SERIALIZED_NAME_RATED_VOLTAGE = "rated_voltage";
  @SerializedName(SERIALIZED_NAME_RATED_VOLTAGE)
  private String ratedVoltage;

  public static final String SERIALIZED_NAME_UNBIND_TIME = "unbind_time";
  @SerializedName(SERIALIZED_NAME_UNBIND_TIME)
  private String unbindTime;

  public AlipayCommerceTransportChargerChargerbindinfoSyncModel() { 
  }

  public AlipayCommerceTransportChargerChargerbindinfoSyncModel bindQrcode(String bindQrcode) {
    
    this.bindQrcode = bindQrcode;
    return this;
  }

   /**
   * 绑定充电桩二维码值，用户扫码绑桩扫描的二维码
   * @return bindQrcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://qrcode.starcharge.com/#/10050638", value = "绑定充电桩二维码值，用户扫码绑桩扫描的二维码")

  public String getBindQrcode() {
    return bindQrcode;
  }


  public void setBindQrcode(String bindQrcode) {
    this.bindQrcode = bindQrcode;
  }


  public AlipayCommerceTransportChargerChargerbindinfoSyncModel bindStatus(String bindStatus) {
    
    this.bindStatus = bindStatus;
    return this;
  }

   /**
   * 绑定状态 1:绑定; 2:解绑;  0:未知
   * @return bindStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "绑定状态 1:绑定; 2:解绑;  0:未知")

  public String getBindStatus() {
    return bindStatus;
  }


  public void setBindStatus(String bindStatus) {
    this.bindStatus = bindStatus;
  }


  public AlipayCommerceTransportChargerChargerbindinfoSyncModel bindTime(String bindTime) {
    
    this.bindTime = bindTime;
    return this;
  }

   /**
   * 绑定时间，绑定成功必传
   * @return bindTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-11-17 17:39:27", value = "绑定时间，绑定成功必传")

  public String getBindTime() {
    return bindTime;
  }


  public void setBindTime(String bindTime) {
    this.bindTime = bindTime;
  }


  public AlipayCommerceTransportChargerChargerbindinfoSyncModel connectorType(String connectorType) {
    
    this.connectorType = connectorType;
    return this;
  }

   /**
   * 1：家用插座 2、交流接口插座 3：交流接口插头 4、直流接口枪头 5、无线充电座 6、其他
   * @return connectorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "1：家用插座 2、交流接口插座 3：交流接口插头 4、直流接口枪头 5、无线充电座 6、其他")

  public String getConnectorType() {
    return connectorType;
  }


  public void setConnectorType(String connectorType) {
    this.connectorType = connectorType;
  }


  public AlipayCommerceTransportChargerChargerbindinfoSyncModel currentOutputType(String currentOutputType) {
    
    this.currentOutputType = currentOutputType;
    return this;
  }

   /**
   * 1：国标 2：欧标 3：美标 4：日标 5：其他
   * @return currentOutputType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "1：国标 2：欧标 3：美标 4：日标 5：其他")

  public String getCurrentOutputType() {
    return currentOutputType;
  }


  public void setCurrentOutputType(String currentOutputType) {
    this.currentOutputType = currentOutputType;
  }


  public AlipayCommerceTransportChargerChargerbindinfoSyncModel equipId(String equipId) {
    
    this.equipId = equipId;
    return this;
  }

   /**
   * 设备编号
   * @return equipId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "65469765489754837868", value = "设备编号")

  public String getEquipId() {
    return equipId;
  }


  public void setEquipId(String equipId) {
    this.equipId = equipId;
  }


  public AlipayCommerceTransportChargerChargerbindinfoSyncModel equipImei(String equipImei) {
    
    this.equipImei = equipImei;
    return this;
  }

   /**
   * 设备IMEI号
   * @return equipImei
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2432479035808", value = "设备IMEI号")

  public String getEquipImei() {
    return equipImei;
  }


  public void setEquipImei(String equipImei) {
    this.equipImei = equipImei;
  }


  public AlipayCommerceTransportChargerChargerbindinfoSyncModel equipName(String equipName) {
    
    this.equipName = equipName;
    return this;
  }

   /**
   * 设备名称，对用户展示，可以是设备名称，也可以是设备SN号，设备编号
   * @return equipName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "守护者XX1", value = "设备名称，对用户展示，可以是设备名称，也可以是设备SN号，设备编号")

  public String getEquipName() {
    return equipName;
  }


  public void setEquipName(String equipName) {
    this.equipName = equipName;
  }


  public AlipayCommerceTransportChargerChargerbindinfoSyncModel equipSn(String equipSn) {
    
    this.equipSn = equipSn;
    return this;
  }

   /**
   * 设备SN号
   * @return equipSn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "24789990209409", value = "设备SN号")

  public String getEquipSn() {
    return equipSn;
  }


  public void setEquipSn(String equipSn) {
    this.equipSn = equipSn;
  }


  public AlipayCommerceTransportChargerChargerbindinfoSyncModel equipStatus(String equipStatus) {
    
    this.equipStatus = equipStatus;
    return this;
  }

   /**
   * 设备状态，遵循中电联协议的设备状态。0：离网;1：空闲;2：占用未充电;3：占用充电中;4：占用（预约锁定）;255：故障
   * @return equipStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "设备状态，遵循中电联协议的设备状态。0：离网;1：空闲;2：占用未充电;3：占用充电中;4：占用（预约锁定）;255：故障")

  public String getEquipStatus() {
    return equipStatus;
  }


  public void setEquipStatus(String equipStatus) {
    this.equipStatus = equipStatus;
  }


  public AlipayCommerceTransportChargerChargerbindinfoSyncModel equipTypeNo(String equipTypeNo) {
    
    this.equipTypeNo = equipTypeNo;
    return this;
  }

   /**
   * 设备型号
   * @return equipTypeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2325436576768", value = "设备型号")

  public String getEquipTypeNo() {
    return equipTypeNo;
  }


  public void setEquipTypeNo(String equipTypeNo) {
    this.equipTypeNo = equipTypeNo;
  }


  public AlipayCommerceTransportChargerChargerbindinfoSyncModel operatorId(String operatorId) {
    
    this.operatorId = operatorId;
    return this;
  }

   /**
   * 运营商编码，一般为企业组织机构代码
   * @return operatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "325616137", value = "运营商编码，一般为企业组织机构代码")

  public String getOperatorId() {
    return operatorId;
  }


  public void setOperatorId(String operatorId) {
    this.operatorId = operatorId;
  }


  public AlipayCommerceTransportChargerChargerbindinfoSyncModel operatorUid(String operatorUid) {
    
    this.operatorUid = operatorUid;
    return this;
  }

   /**
   * 商户内部唯一标识用户的用户标识
   * @return operatorUid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13588139138", value = "商户内部唯一标识用户的用户标识")

  public String getOperatorUid() {
    return operatorUid;
  }


  public void setOperatorUid(String operatorUid) {
    this.operatorUid = operatorUid;
  }


  public AlipayCommerceTransportChargerChargerbindinfoSyncModel ratedCurrent(String ratedCurrent) {
    
    this.ratedCurrent = ratedCurrent;
    return this;
  }

   /**
   * 额定电流,单位：A
   * @return ratedCurrent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "额定电流,单位：A")

  public String getRatedCurrent() {
    return ratedCurrent;
  }


  public void setRatedCurrent(String ratedCurrent) {
    this.ratedCurrent = ratedCurrent;
  }


  public AlipayCommerceTransportChargerChargerbindinfoSyncModel ratedPower(String ratedPower) {
    
    this.ratedPower = ratedPower;
    return this;
  }

   /**
   * 额定功率，单位：kW
   * @return ratedPower
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "额定功率，单位：kW")

  public String getRatedPower() {
    return ratedPower;
  }


  public void setRatedPower(String ratedPower) {
    this.ratedPower = ratedPower;
  }


  public AlipayCommerceTransportChargerChargerbindinfoSyncModel ratedVoltage(String ratedVoltage) {
    
    this.ratedVoltage = ratedVoltage;
    return this;
  }

   /**
   * 额定电压，单位：V
   * @return ratedVoltage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "220", value = "额定电压，单位：V")

  public String getRatedVoltage() {
    return ratedVoltage;
  }


  public void setRatedVoltage(String ratedVoltage) {
    this.ratedVoltage = ratedVoltage;
  }


  public AlipayCommerceTransportChargerChargerbindinfoSyncModel unbindTime(String unbindTime) {
    
    this.unbindTime = unbindTime;
    return this;
  }

   /**
   * 解绑时间，解绑必传
   * @return unbindTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-11-17 17:39:27", value = "解绑时间，解绑必传")

  public String getUnbindTime() {
    return unbindTime;
  }


  public void setUnbindTime(String unbindTime) {
    this.unbindTime = unbindTime;
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
   * @return the AlipayCommerceTransportChargerChargerbindinfoSyncModel instance itself
   */
  public AlipayCommerceTransportChargerChargerbindinfoSyncModel putAdditionalProperty(String key, Object value) {
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
    AlipayCommerceTransportChargerChargerbindinfoSyncModel alipayCommerceTransportChargerChargerbindinfoSyncModel = (AlipayCommerceTransportChargerChargerbindinfoSyncModel) o;
    return Objects.equals(this.bindQrcode, alipayCommerceTransportChargerChargerbindinfoSyncModel.bindQrcode) &&
        Objects.equals(this.bindStatus, alipayCommerceTransportChargerChargerbindinfoSyncModel.bindStatus) &&
        Objects.equals(this.bindTime, alipayCommerceTransportChargerChargerbindinfoSyncModel.bindTime) &&
        Objects.equals(this.connectorType, alipayCommerceTransportChargerChargerbindinfoSyncModel.connectorType) &&
        Objects.equals(this.currentOutputType, alipayCommerceTransportChargerChargerbindinfoSyncModel.currentOutputType) &&
        Objects.equals(this.equipId, alipayCommerceTransportChargerChargerbindinfoSyncModel.equipId) &&
        Objects.equals(this.equipImei, alipayCommerceTransportChargerChargerbindinfoSyncModel.equipImei) &&
        Objects.equals(this.equipName, alipayCommerceTransportChargerChargerbindinfoSyncModel.equipName) &&
        Objects.equals(this.equipSn, alipayCommerceTransportChargerChargerbindinfoSyncModel.equipSn) &&
        Objects.equals(this.equipStatus, alipayCommerceTransportChargerChargerbindinfoSyncModel.equipStatus) &&
        Objects.equals(this.equipTypeNo, alipayCommerceTransportChargerChargerbindinfoSyncModel.equipTypeNo) &&
        Objects.equals(this.operatorId, alipayCommerceTransportChargerChargerbindinfoSyncModel.operatorId) &&
        Objects.equals(this.operatorUid, alipayCommerceTransportChargerChargerbindinfoSyncModel.operatorUid) &&
        Objects.equals(this.ratedCurrent, alipayCommerceTransportChargerChargerbindinfoSyncModel.ratedCurrent) &&
        Objects.equals(this.ratedPower, alipayCommerceTransportChargerChargerbindinfoSyncModel.ratedPower) &&
        Objects.equals(this.ratedVoltage, alipayCommerceTransportChargerChargerbindinfoSyncModel.ratedVoltage) &&
        Objects.equals(this.unbindTime, alipayCommerceTransportChargerChargerbindinfoSyncModel.unbindTime)&&
        Objects.equals(this.additionalProperties, alipayCommerceTransportChargerChargerbindinfoSyncModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindQrcode, bindStatus, bindTime, connectorType, currentOutputType, equipId, equipImei, equipName, equipSn, equipStatus, equipTypeNo, operatorId, operatorUid, ratedCurrent, ratedPower, ratedVoltage, unbindTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceTransportChargerChargerbindinfoSyncModel {\n");
    sb.append("    bindQrcode: ").append(toIndentedString(bindQrcode)).append("\n");
    sb.append("    bindStatus: ").append(toIndentedString(bindStatus)).append("\n");
    sb.append("    bindTime: ").append(toIndentedString(bindTime)).append("\n");
    sb.append("    connectorType: ").append(toIndentedString(connectorType)).append("\n");
    sb.append("    currentOutputType: ").append(toIndentedString(currentOutputType)).append("\n");
    sb.append("    equipId: ").append(toIndentedString(equipId)).append("\n");
    sb.append("    equipImei: ").append(toIndentedString(equipImei)).append("\n");
    sb.append("    equipName: ").append(toIndentedString(equipName)).append("\n");
    sb.append("    equipSn: ").append(toIndentedString(equipSn)).append("\n");
    sb.append("    equipStatus: ").append(toIndentedString(equipStatus)).append("\n");
    sb.append("    equipTypeNo: ").append(toIndentedString(equipTypeNo)).append("\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
    sb.append("    operatorUid: ").append(toIndentedString(operatorUid)).append("\n");
    sb.append("    ratedCurrent: ").append(toIndentedString(ratedCurrent)).append("\n");
    sb.append("    ratedPower: ").append(toIndentedString(ratedPower)).append("\n");
    sb.append("    ratedVoltage: ").append(toIndentedString(ratedVoltage)).append("\n");
    sb.append("    unbindTime: ").append(toIndentedString(unbindTime)).append("\n");
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
    openapiFields.add("bind_qrcode");
    openapiFields.add("bind_status");
    openapiFields.add("bind_time");
    openapiFields.add("connector_type");
    openapiFields.add("current_output_type");
    openapiFields.add("equip_id");
    openapiFields.add("equip_imei");
    openapiFields.add("equip_name");
    openapiFields.add("equip_sn");
    openapiFields.add("equip_status");
    openapiFields.add("equip_type_no");
    openapiFields.add("operator_id");
    openapiFields.add("operator_uid");
    openapiFields.add("rated_current");
    openapiFields.add("rated_power");
    openapiFields.add("rated_voltage");
    openapiFields.add("unbind_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceTransportChargerChargerbindinfoSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceTransportChargerChargerbindinfoSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceTransportChargerChargerbindinfoSyncModel is not found in the empty JSON string", AlipayCommerceTransportChargerChargerbindinfoSyncModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("bind_qrcode") != null && !jsonObj.get("bind_qrcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bind_qrcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bind_qrcode").toString()));
      }
      if (jsonObj.get("bind_status") != null && !jsonObj.get("bind_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bind_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bind_status").toString()));
      }
      if (jsonObj.get("bind_time") != null && !jsonObj.get("bind_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bind_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bind_time").toString()));
      }
      if (jsonObj.get("connector_type") != null && !jsonObj.get("connector_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connector_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connector_type").toString()));
      }
      if (jsonObj.get("current_output_type") != null && !jsonObj.get("current_output_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `current_output_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("current_output_type").toString()));
      }
      if (jsonObj.get("equip_id") != null && !jsonObj.get("equip_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `equip_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("equip_id").toString()));
      }
      if (jsonObj.get("equip_imei") != null && !jsonObj.get("equip_imei").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `equip_imei` to be a primitive type in the JSON string but got `%s`", jsonObj.get("equip_imei").toString()));
      }
      if (jsonObj.get("equip_name") != null && !jsonObj.get("equip_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `equip_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("equip_name").toString()));
      }
      if (jsonObj.get("equip_sn") != null && !jsonObj.get("equip_sn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `equip_sn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("equip_sn").toString()));
      }
      if (jsonObj.get("equip_status") != null && !jsonObj.get("equip_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `equip_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("equip_status").toString()));
      }
      if (jsonObj.get("equip_type_no") != null && !jsonObj.get("equip_type_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `equip_type_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("equip_type_no").toString()));
      }
      if (jsonObj.get("operator_id") != null && !jsonObj.get("operator_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator_id").toString()));
      }
      if (jsonObj.get("operator_uid") != null && !jsonObj.get("operator_uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator_uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator_uid").toString()));
      }
      if (jsonObj.get("rated_current") != null && !jsonObj.get("rated_current").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rated_current` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rated_current").toString()));
      }
      if (jsonObj.get("rated_power") != null && !jsonObj.get("rated_power").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rated_power` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rated_power").toString()));
      }
      if (jsonObj.get("rated_voltage") != null && !jsonObj.get("rated_voltage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rated_voltage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rated_voltage").toString()));
      }
      if (jsonObj.get("unbind_time") != null && !jsonObj.get("unbind_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unbind_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unbind_time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceTransportChargerChargerbindinfoSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceTransportChargerChargerbindinfoSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceTransportChargerChargerbindinfoSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceTransportChargerChargerbindinfoSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceTransportChargerChargerbindinfoSyncModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceTransportChargerChargerbindinfoSyncModel value) throws IOException {
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
           public AlipayCommerceTransportChargerChargerbindinfoSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayCommerceTransportChargerChargerbindinfoSyncModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayCommerceTransportChargerChargerbindinfoSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceTransportChargerChargerbindinfoSyncModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceTransportChargerChargerbindinfoSyncModel
  */
  public static AlipayCommerceTransportChargerChargerbindinfoSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceTransportChargerChargerbindinfoSyncModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceTransportChargerChargerbindinfoSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

