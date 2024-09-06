package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直流充电桩运行时数据
 *
 * @author auto create
 * @since 1.0, 2024-09-02 21:57:13
 */
public class DcChargePileRunTimeData extends AlipayObject {

	private static final long serialVersionUID = 3617229735952344469L;

	/**
	 * 可下调容量，单位KW
	 */
	@ApiField("adjust_down")
	private String adjustDown;

	/**
	 * 可上调容量，单位KW
	 */
	@ApiField("adjust_up")
	private String adjustUp;

	/**
	 * 充电电量，单位KWH
	 */
	@ApiField("cumulative_power")
	private String cumulativePower;

	/**
	 * 输出电流，单位（A）
	 */
	@ApiField("output_current")
	private String outputCurrent;

	/**
	 * 输出电压，单位（V）
	 */
	@ApiField("output_voltage")
	private String outputVoltage;

	/**
	 * 功率，单位 kw
	 */
	@ApiField("power")
	private String power;

	/**
	 * 剩余充电时长,单位 秒
	 */
	@ApiField("remain_time")
	private Long remainTime;

	/**
	 * 请求电流，单位（A）
	 */
	@ApiField("request_current")
	private String requestCurrent;

	/**
	 * 申请电压，单位（V）
	 */
	@ApiField("request_voltage")
	private String requestVoltage;

	/**
	 * 车辆soc值，百分比
	 */
	@ApiField("vehicle_soc_values")
	private String vehicleSocValues;

	/**
	 * 车辆vin码
	 */
	@ApiField("vin_code")
	private String vinCode;

	public String getAdjustDown() {
		return this.adjustDown;
	}
	public void setAdjustDown(String adjustDown) {
		this.adjustDown = adjustDown;
	}

	public String getAdjustUp() {
		return this.adjustUp;
	}
	public void setAdjustUp(String adjustUp) {
		this.adjustUp = adjustUp;
	}

	public String getCumulativePower() {
		return this.cumulativePower;
	}
	public void setCumulativePower(String cumulativePower) {
		this.cumulativePower = cumulativePower;
	}

	public String getOutputCurrent() {
		return this.outputCurrent;
	}
	public void setOutputCurrent(String outputCurrent) {
		this.outputCurrent = outputCurrent;
	}

	public String getOutputVoltage() {
		return this.outputVoltage;
	}
	public void setOutputVoltage(String outputVoltage) {
		this.outputVoltage = outputVoltage;
	}

	public String getPower() {
		return this.power;
	}
	public void setPower(String power) {
		this.power = power;
	}

	public Long getRemainTime() {
		return this.remainTime;
	}
	public void setRemainTime(Long remainTime) {
		this.remainTime = remainTime;
	}

	public String getRequestCurrent() {
		return this.requestCurrent;
	}
	public void setRequestCurrent(String requestCurrent) {
		this.requestCurrent = requestCurrent;
	}

	public String getRequestVoltage() {
		return this.requestVoltage;
	}
	public void setRequestVoltage(String requestVoltage) {
		this.requestVoltage = requestVoltage;
	}

	public String getVehicleSocValues() {
		return this.vehicleSocValues;
	}
	public void setVehicleSocValues(String vehicleSocValues) {
		this.vehicleSocValues = vehicleSocValues;
	}

	public String getVinCode() {
		return this.vinCode;
	}
	public void setVinCode(String vinCode) {
		this.vinCode = vinCode;
	}

}
