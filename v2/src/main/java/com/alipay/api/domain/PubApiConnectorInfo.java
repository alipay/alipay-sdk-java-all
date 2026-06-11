package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公共充电充电枪信息
 *
 * @author auto create
 * @since 1.0, 2026-05-06 10:33:52
 */
public class PubApiConnectorInfo extends AlipayObject {

	private static final long serialVersionUID = 8232539111614154993L;

	/**
	 * 充电枪id
	 */
	@ApiField("connector_id")
	private String connectorId;

	/**
	 * 充电枪名称
	 */
	@ApiField("connector_name")
	private String connectorName;

	/**
	 * 充电枪状态：
0：离网；
1：空闲；
2：占用（未充电）；
3：占用（充电中）；
4：占用（预约锁定）；
255：故障
	 */
	@ApiField("connector_status")
	private Long connectorStatus;

	/**
	 * 1:家用插座 (模式 2);2:交流接口插座 (模式 3, 连接方式 B);3:交流接口插头 (带枪线，模式 3, 连接方式 C);4:直流接口枪头 (带枪线，模式 4);5:无线充电座;6:其他
	 */
	@ApiField("connector_type")
	private Long connectorType;

	/**
	 * 额定电流 - 单位：A
	 */
	@ApiField("current")
	private String current;

	/**
	 * 车位号 - 停车场车位编号
	 */
	@ApiField("park_no")
	private String parkNo;

	/**
	 * 额定功率 - 单位：kW
	 */
	@ApiField("power")
	private String power;

	/**
	 * 快充属性
	 */
	@ApiField("station_charger_type")
	private String stationChargerType;

	/**
	 * 额定电压下限 - 单位：V
	 */
	@ApiField("voltage_lower_limits")
	private Long voltageLowerLimits;

	/**
	 * 额定电压上限 - 单位：V
	 */
	@ApiField("voltage_upper_limits")
	private Long voltageUpperLimits;

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

	public Long getConnectorStatus() {
		return this.connectorStatus;
	}
	public void setConnectorStatus(Long connectorStatus) {
		this.connectorStatus = connectorStatus;
	}

	public Long getConnectorType() {
		return this.connectorType;
	}
	public void setConnectorType(Long connectorType) {
		this.connectorType = connectorType;
	}

	public String getCurrent() {
		return this.current;
	}
	public void setCurrent(String current) {
		this.current = current;
	}

	public String getParkNo() {
		return this.parkNo;
	}
	public void setParkNo(String parkNo) {
		this.parkNo = parkNo;
	}

	public String getPower() {
		return this.power;
	}
	public void setPower(String power) {
		this.power = power;
	}

	public String getStationChargerType() {
		return this.stationChargerType;
	}
	public void setStationChargerType(String stationChargerType) {
		this.stationChargerType = stationChargerType;
	}

	public Long getVoltageLowerLimits() {
		return this.voltageLowerLimits;
	}
	public void setVoltageLowerLimits(Long voltageLowerLimits) {
		this.voltageLowerLimits = voltageLowerLimits;
	}

	public Long getVoltageUpperLimits() {
		return this.voltageUpperLimits;
	}
	public void setVoltageUpperLimits(Long voltageUpperLimits) {
		this.voltageUpperLimits = voltageUpperLimits;
	}

}
