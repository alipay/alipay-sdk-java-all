package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 私有充电桩的设置信息
 *
 * @author auto create
 * @since 1.0, 2025-10-24 11:08:26
 */
public class PrivateChargingSetting extends AlipayObject {

	private static final long serialVersionUID = 8784837583452888717L;

	/**
	 * 充电桩预约模式的循环方式。当充电桩处于预约模式时，该参数必传。
	 */
	@ApiField("cycle_mode")
	private String cycleMode;

	/**
	 * 充电桩预约模式的结束充电时间。当充电桩处于预约模式时，该参数必传。时间的格式为HH:mm，【-】表示充电桩充满为止。
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 充电桩的充电启动模式
	 */
	@ApiListField("mode")
	@ApiField("string")
	private List<String> mode;

	/**
	 * 充电桩是否启用预约的标识，
开启预约：1
未开启预约：0
	 */
	@ApiField("reservation_flag")
	private String reservationFlag;

	/**
	 * 充电桩预约模式的启动充电时间。当充电桩处于预约模式时，该参数必传。时间的格式为HH:mm，【-】表示充电桩立即启动充电。
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 充电桩使用的充电策略
	 */
	@ApiField("strategy")
	private String strategy;

	public String getCycleMode() {
		return this.cycleMode;
	}
	public void setCycleMode(String cycleMode) {
		this.cycleMode = cycleMode;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<String> getMode() {
		return this.mode;
	}
	public void setMode(List<String> mode) {
		this.mode = mode;
	}

	public String getReservationFlag() {
		return this.reservationFlag;
	}
	public void setReservationFlag(String reservationFlag) {
		this.reservationFlag = reservationFlag;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStrategy() {
		return this.strategy;
	}
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

}
