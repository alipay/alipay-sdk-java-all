package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 充电私桩信息
 *
 * @author auto create
 * @since 1.0, 2024-06-18 21:02:59
 */
public class PrivateChargingEquipment extends AlipayObject {

	private static final long serialVersionUID = 5588632481234234777L;

	/**
	 * 充电桩二维码值
	 */
	@ApiField("bind_qrcode")
	private String bindQrcode;

	/**
	 * 设备接口类型
	 */
	@ApiField("connector_type")
	private String connectorType;

	/**
	 * 设备输出接口类型
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
	@ApiField("equip_imei_no")
	private String equipImeiNo;

	/**
	 * 充电桩名称
	 */
	@ApiField("equip_name")
	private String equipName;

	/**
	 * 设备sn号
	 */
	@ApiField("equip_sn")
	private String equipSn;

	/**
	 * 设备类型
	 */
	@ApiField("equip_type")
	private String equipType;

	/**
	 * 设备型号编码
	 */
	@ApiField("equip_type_no")
	private String equipTypeNo;

	/**
	 * 启动模式
	 */
	@ApiListField("modes")
	@ApiField("string")
	private List<String> modes;

	/**
	 * 额定电流
	 */
	@ApiField("rated_current")
	private String ratedCurrent;

	/**
	 * 额定功率
	 */
	@ApiField("rated_power")
	private String ratedPower;

	/**
	 * 额定电压
	 */
	@ApiField("rated_voltage")
	private String ratedVoltage;

	public String getBindQrcode() {
		return this.bindQrcode;
	}
	public void setBindQrcode(String bindQrcode) {
		this.bindQrcode = bindQrcode;
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

	public String getEquipImeiNo() {
		return this.equipImeiNo;
	}
	public void setEquipImeiNo(String equipImeiNo) {
		this.equipImeiNo = equipImeiNo;
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

	public String getEquipType() {
		return this.equipType;
	}
	public void setEquipType(String equipType) {
		this.equipType = equipType;
	}

	public String getEquipTypeNo() {
		return this.equipTypeNo;
	}
	public void setEquipTypeNo(String equipTypeNo) {
		this.equipTypeNo = equipTypeNo;
	}

	public List<String> getModes() {
		return this.modes;
	}
	public void setModes(List<String> modes) {
		this.modes = modes;
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

}
