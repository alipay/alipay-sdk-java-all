package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充电接口信息
 *
 * @author auto create
 * @since 1.0, 2024-07-19 15:27:47
 */
public class ChargeConnectorInfo extends AlipayObject {

	private static final long serialVersionUID = 7347933287295432475L;

	/**
	 * 充电设备接口ID
	 */
	@ApiField("connector_id")
	private String connectorId;

	/**
	 * 充电设备接口名称
	 */
	@ApiField("connector_name")
	private String connectorName;

	/**
	 * 充电设备接口类型
	 */
	@ApiField("connector_type")
	private String connectorType;

	/**
	 * 额定电流，单位A，精确到小数点后一位
	 */
	@ApiField("current")
	private String current;

	/**
	 * 国家标准：
国标2011、国标2015
	 */
	@ApiField("national_standard")
	private String nationalStandard;

	/**
	 * 额定功率，单位kw，保留?数点后2位
	 */
	@ApiField("power")
	private String power;

	/**
	 * 额定电压下限，单位：V，精确到小数点后一位
	 */
	@ApiField("voltage_lower_limit")
	private String voltageLowerLimit;

	/**
	 * 额定电压，单位：V，精确到小数点后一位
	 */
	@ApiField("voltage_upper_limit")
	private String voltageUpperLimit;

	public String getConnectorId() {
		return this.connectorId;
	}
	public void setConnectorId(String connectorId) {
		this.connectorId = connectorId;
	}

	public String getConnectorName() {
		return this.connectorName;
	}
	public void setConnectorName(String connectorName) {
		this.connectorName = connectorName;
	}

	public String getConnectorType() {
		return this.connectorType;
	}
	public void setConnectorType(String connectorType) {
		this.connectorType = connectorType;
	}

	public String getCurrent() {
		return this.current;
	}
	public void setCurrent(String current) {
		this.current = current;
	}

	public String getNationalStandard() {
		return this.nationalStandard;
	}
	public void setNationalStandard(String nationalStandard) {
		this.nationalStandard = nationalStandard;
	}

	public String getPower() {
		return this.power;
	}
	public void setPower(String power) {
		this.power = power;
	}

	public String getVoltageLowerLimit() {
		return this.voltageLowerLimit;
	}
	public void setVoltageLowerLimit(String voltageLowerLimit) {
		this.voltageLowerLimit = voltageLowerLimit;
	}

	public String getVoltageUpperLimit() {
		return this.voltageUpperLimit;
	}
	public void setVoltageUpperLimit(String voltageUpperLimit) {
		this.voltageUpperLimit = voltageUpperLimit;
	}

}
