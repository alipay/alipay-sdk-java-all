package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交流充电桩实时数据
 *
 * @author auto create
 * @since 1.0, 2024-07-19 17:26:19
 */
public class AcChargePileRunTimeData extends AlipayObject {

	private static final long serialVersionUID = 2614263763141966251L;

	/**
	 * 可下调容量
	 */
	@ApiField("adjust_down")
	private String adjustDown;

	/**
	 * 可上调容量
	 */
	@ApiField("adjust_up")
	private String adjustUp;

	/**
	 * 本次充电电量
	 */
	@ApiField("cumulative_power")
	private String cumulativePower;

	/**
	 * A相电流，单位（A）
	 */
	@ApiField("current_a")
	private String currentA;

	/**
	 * b相电流，单位（安培）
	 */
	@ApiField("current_b")
	private String currentB;

	/**
	 * c相电流，单位（安培）
	 */
	@ApiField("current_c")
	private String currentC;

	/**
	 * 充电桩设备Id
	 */
	@ApiField("out_entity_id")
	private String outEntityId;

	/**
	 * 功率，kw
	 */
	@ApiField("power")
	private String power;

	/**
	 * pwm占空比，百分比
	 */
	@ApiField("pwm_duty_cycle")
	private String pwmDutyCycle;

	/**
	 * a相电压
	 */
	@ApiField("voltage_a")
	private String voltageA;

	/**
	 * b相电压
	 */
	@ApiField("voltage_b")
	private String voltageB;

	/**
	 * c相电压
	 */
	@ApiField("voltage_c")
	private String voltageC;

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

	public String getCurrentA() {
		return this.currentA;
	}
	public void setCurrentA(String currentA) {
		this.currentA = currentA;
	}

	public String getCurrentB() {
		return this.currentB;
	}
	public void setCurrentB(String currentB) {
		this.currentB = currentB;
	}

	public String getCurrentC() {
		return this.currentC;
	}
	public void setCurrentC(String currentC) {
		this.currentC = currentC;
	}

	public String getOutEntityId() {
		return this.outEntityId;
	}
	public void setOutEntityId(String outEntityId) {
		this.outEntityId = outEntityId;
	}

	public String getPower() {
		return this.power;
	}
	public void setPower(String power) {
		this.power = power;
	}

	public String getPwmDutyCycle() {
		return this.pwmDutyCycle;
	}
	public void setPwmDutyCycle(String pwmDutyCycle) {
		this.pwmDutyCycle = pwmDutyCycle;
	}

	public String getVoltageA() {
		return this.voltageA;
	}
	public void setVoltageA(String voltageA) {
		this.voltageA = voltageA;
	}

	public String getVoltageB() {
		return this.voltageB;
	}
	public void setVoltageB(String voltageB) {
		this.voltageB = voltageB;
	}

	public String getVoltageC() {
		return this.voltageC;
	}
	public void setVoltageC(String voltageC) {
		this.voltageC = voltageC;
	}

}
