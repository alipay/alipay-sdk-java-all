package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充电运营商同步用户绑定充电桩信息接口
 *
 * @author auto create
 * @since 1.0, 2023-12-12 10:26:30
 */
public class AlipayCommerceTransportChargerChargerbindinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3254193955178514994L;

	/**
	 * 绑定充电桩二维码值，用户扫码绑桩扫描的二维码
	 */
	@ApiField("bind_qrcode")
	private String bindQrcode;

	/**
	 * 绑定状态 1:绑定; 2:解绑;  0:未知
	 */
	@ApiField("bind_status")
	private String bindStatus;

	/**
	 * 绑定时间，绑定成功必传
	 */
	@ApiField("bind_time")
	private Date bindTime;

	/**
	 * 1：家用插座
2、交流接口插座
3：交流接口插头
4、直流接口枪头
5、无线充电座
6、其他
	 */
	@ApiField("connector_type")
	private String connectorType;

	/**
	 * 1：国标
2：欧标
3：美标
4：日标
5：其他
	 */
	@ApiField("current_output_type")
	private String currentOutputType;

	/**
	 * 设备编号
	 */
	@ApiField("equip_id")
	private String equipId;

	/**
	 * 设备IMEI号
	 */
	@ApiField("equip_imei")
	private String equipImei;

	/**
	 * 设备名称，对用户展示，可以是设备名称，也可以是设备SN号，设备编号
	 */
	@ApiField("equip_name")
	private String equipName;

	/**
	 * 设备SN号
	 */
	@ApiField("equip_sn")
	private String equipSn;

	/**
	 * 设备状态，遵循中电联协议的设备状态。0：离网;1：空闲;2：占用未充电;3：占用充电中;4：占用（预约锁定）;255：故障
	 */
	@ApiField("equip_status")
	private String equipStatus;

	/**
	 * 设备型号
	 */
	@ApiField("equip_type_no")
	private String equipTypeNo;

	/**
	 * 运营商编码，一般为企业组织机构代码
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 商户内部唯一标识用户的用户标识
	 */
	@ApiField("operator_uid")
	private String operatorUid;

	/**
	 * 额定电流,单位：A
	 */
	@ApiField("rated_current")
	private String ratedCurrent;

	/**
	 * 额定功率，单位：kW
	 */
	@ApiField("rated_power")
	private String ratedPower;

	/**
	 * 额定电压，单位：V
	 */
	@ApiField("rated_voltage")
	private String ratedVoltage;

	/**
	 * 解绑时间，解绑必传
	 */
	@ApiField("unbind_time")
	private Date unbindTime;

	public String getBindQrcode() {
		return this.bindQrcode;
	}
	public void setBindQrcode(String bindQrcode) {
		this.bindQrcode = bindQrcode;
	}

	public String getBindStatus() {
		return this.bindStatus;
	}
	public void setBindStatus(String bindStatus) {
		this.bindStatus = bindStatus;
	}

	public Date getBindTime() {
		return this.bindTime;
	}
	public void setBindTime(Date bindTime) {
		this.bindTime = bindTime;
	}

	public String getConnectorType() {
		return this.connectorType;
	}
	public void setConnectorType(String connectorType) {
		this.connectorType = connectorType;
	}

	public String getCurrentOutputType() {
		return this.currentOutputType;
	}
	public void setCurrentOutputType(String currentOutputType) {
		this.currentOutputType = currentOutputType;
	}

	public String getEquipId() {
		return this.equipId;
	}
	public void setEquipId(String equipId) {
		this.equipId = equipId;
	}

	public String getEquipImei() {
		return this.equipImei;
	}
	public void setEquipImei(String equipImei) {
		this.equipImei = equipImei;
	}

	public String getEquipName() {
		return this.equipName;
	}
	public void setEquipName(String equipName) {
		this.equipName = equipName;
	}

	public String getEquipSn() {
		return this.equipSn;
	}
	public void setEquipSn(String equipSn) {
		this.equipSn = equipSn;
	}

	public String getEquipStatus() {
		return this.equipStatus;
	}
	public void setEquipStatus(String equipStatus) {
		this.equipStatus = equipStatus;
	}

	public String getEquipTypeNo() {
		return this.equipTypeNo;
	}
	public void setEquipTypeNo(String equipTypeNo) {
		this.equipTypeNo = equipTypeNo;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorUid() {
		return this.operatorUid;
	}
	public void setOperatorUid(String operatorUid) {
		this.operatorUid = operatorUid;
	}

	public String getRatedCurrent() {
		return this.ratedCurrent;
	}
	public void setRatedCurrent(String ratedCurrent) {
		this.ratedCurrent = ratedCurrent;
	}

	public String getRatedPower() {
		return this.ratedPower;
	}
	public void setRatedPower(String ratedPower) {
		this.ratedPower = ratedPower;
	}

	public String getRatedVoltage() {
		return this.ratedVoltage;
	}
	public void setRatedVoltage(String ratedVoltage) {
		this.ratedVoltage = ratedVoltage;
	}

	public Date getUnbindTime() {
		return this.unbindTime;
	}
	public void setUnbindTime(Date unbindTime) {
		this.unbindTime = unbindTime;
	}

}
