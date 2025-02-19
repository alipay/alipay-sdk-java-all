package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 充电私桩设置
 *
 * @author auto create
 * @since 1.0, 2024-06-18 21:03:40
 */
public class PrivateChargingSetting extends AlipayObject {

	private static final long serialVersionUID = 4754884394883867356L;

	/**
	 * 循环模式
	 */
	@ApiField("cycle_mode")
	private String cycleMode;

	/**
	 * 预约启动时间
HH:mm   表示 具体时间
-            表示  充满截止
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 启动模式
	 */
	@ApiListField("mode")
	@ApiField("string")
	private List<String> mode;

	/**
	 * 预约标志:
1 表示开启预约
0 表示不开启预约
	 */
	@ApiField("reservation_flag")
	private String reservationFlag;

	/**
	 * 预约启动时间
HH:mm   表示 具体时间
-           表示  立即启动
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 充电策略
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
