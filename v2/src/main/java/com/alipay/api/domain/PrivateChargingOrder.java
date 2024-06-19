package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充电私桩订单信息
 *
 * @author auto create
 * @since 1.0, 2024-06-03 14:15:14
 */
public class PrivateChargingOrder extends AlipayObject {

	private static final long serialVersionUID = 7426415379362739856L;

	/**
	 * A相电流。单位A，含直流（输出）
	 */
	@ApiField("current_a")
	private String currentA;

	/**
	 * B相电流
	 */
	@ApiField("current_b")
	private String currentB;

	/**
	 * C相电流
	 */
	@ApiField("current_c")
	private String currentC;

	/**
	 * 累计电费
	 */
	@ApiField("elec_money")
	private String elecMoney;

	/**
	 * 充电结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 设备ID
	 */
	@ApiField("equip_id")
	private String equipId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 运营商编号
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 商家用户ID
	 */
	@ApiField("operator_uid")
	private String operatorUid;

	/**
	 * 本次采样时间
	 */
	@ApiField("sample_time")
	private String sampleTime;

	/**
	 * 电池剩余电量
	 */
	@ApiField("soc")
	private String soc;

	/**
	 * 充电订单号
	 */
	@ApiField("start_charge_seq")
	private String startChargeSeq;

	/**
	 * 充电订单状态
	 */
	@ApiField("start_charge_seq_stat")
	private String startChargeSeqStat;

	/**
	 * 开始充电时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 累计充电量
	 */
	@ApiField("total_power")
	private String totalPower;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * A相电压。单位V，含直流（输出）
	 */
	@ApiField("voltage_a")
	private String voltageA;

	/**
	 * B相电压
	 */
	@ApiField("voltage_b")
	private String voltageB;

	/**
	 * C相电压
	 */
	@ApiField("voltage_c")
	private String voltageC;

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

	public String getElecMoney() {
		return this.elecMoney;
	}
	public void setElecMoney(String elecMoney) {
		this.elecMoney = elecMoney;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEquipId() {
		return this.equipId;
	}
	public void setEquipId(String equipId) {
		this.equipId = equipId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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

	public String getSampleTime() {
		return this.sampleTime;
	}
	public void setSampleTime(String sampleTime) {
		this.sampleTime = sampleTime;
	}

	public String getSoc() {
		return this.soc;
	}
	public void setSoc(String soc) {
		this.soc = soc;
	}

	public String getStartChargeSeq() {
		return this.startChargeSeq;
	}
	public void setStartChargeSeq(String startChargeSeq) {
		this.startChargeSeq = startChargeSeq;
	}

	public String getStartChargeSeqStat() {
		return this.startChargeSeqStat;
	}
	public void setStartChargeSeqStat(String startChargeSeqStat) {
		this.startChargeSeqStat = startChargeSeqStat;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTotalPower() {
		return this.totalPower;
	}
	public void setTotalPower(String totalPower) {
		this.totalPower = totalPower;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
