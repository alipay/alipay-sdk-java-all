package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 可信设备信息
 *
 * @author auto create
 * @since 1.0, 2024-07-19 15:27:47
 */
public class TrustDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 3384872761991146488L;

	/**
	 * 是否可调节
	 */
	@ApiField("adjustable")
	private Boolean adjustable;

	/**
	 * 充电设备类型
	 */
	@ApiField("charge_device_type")
	private String chargeDeviceType;

	/**
	 * 充电接口信息列表
	 */
	@ApiListField("connector_infos")
	@ApiField("charge_connector_info")
	private List<ChargeConnectorInfo> connectorInfos;

	/**
	 * 设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 用电户号
	 */
	@ApiField("electric_account")
	private String electricAccount;

	/**
	 * 电表号
	 */
	@ApiField("electric_meter_no")
	private String electricMeterNo;

	/**
	 * 设备生产商企业信息
	 */
	@ApiField("manufacturer")
	private EntityEnterpriseInfo manufacturer;

	/**
	 * 运行状态
	 */
	@ApiField("operate_status")
	private String operateStatus;

	/**
	 * 额定功率，单位kw
	 */
	@ApiField("rated_power")
	private String ratedPower;

	public Boolean getAdjustable() {
		return this.adjustable;
	}
	public void setAdjustable(Boolean adjustable) {
		this.adjustable = adjustable;
	}

	public String getChargeDeviceType() {
		return this.chargeDeviceType;
	}
	public void setChargeDeviceType(String chargeDeviceType) {
		this.chargeDeviceType = chargeDeviceType;
	}

	public List<ChargeConnectorInfo> getConnectorInfos() {
		return this.connectorInfos;
	}
	public void setConnectorInfos(List<ChargeConnectorInfo> connectorInfos) {
		this.connectorInfos = connectorInfos;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getElectricAccount() {
		return this.electricAccount;
	}
	public void setElectricAccount(String electricAccount) {
		this.electricAccount = electricAccount;
	}

	public String getElectricMeterNo() {
		return this.electricMeterNo;
	}
	public void setElectricMeterNo(String electricMeterNo) {
		this.electricMeterNo = electricMeterNo;
	}

	public EntityEnterpriseInfo getManufacturer() {
		return this.manufacturer;
	}
	public void setManufacturer(EntityEnterpriseInfo manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getOperateStatus() {
		return this.operateStatus;
	}
	public void setOperateStatus(String operateStatus) {
		this.operateStatus = operateStatus;
	}

	public String getRatedPower() {
		return this.ratedPower;
	}
	public void setRatedPower(String ratedPower) {
		this.ratedPower = ratedPower;
	}

}
