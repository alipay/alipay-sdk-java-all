package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖金池信息
 *
 * @author auto create
 * @since 1.0, 2017-06-09 02:26:30
 */
public class CapitalPoolInfo extends AlipayObject {

	private static final long serialVersionUID = 1642536552372778795L;

	/**
	 * 奖金池预警金额
	 */
	@ApiField("alarm_amount")
	private String alarmAmount;

	/**
	 * 奖金池有效期结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 奖金池失效金额
	 */
	@ApiField("invalid_amount")
	private String invalidAmount;

	/**
	 * 奖金池描述信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 奖金池ID
	 */
	@ApiField("pool_id")
	private String poolId;

	/**
	 * 奖金池名称
	 */
	@ApiField("pool_name")
	private String poolName;

	/**
	 * 奖金池当前余额
	 */
	@ApiField("remaining_amount")
	private String remainingAmount;

	/**
	 * 奖金池有效期开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getAlarmAmount() {
		return this.alarmAmount;
	}
	public void setAlarmAmount(String alarmAmount) {
		this.alarmAmount = alarmAmount;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getInvalidAmount() {
		return this.invalidAmount;
	}
	public void setInvalidAmount(String invalidAmount) {
		this.invalidAmount = invalidAmount;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getPoolId() {
		return this.poolId;
	}
	public void setPoolId(String poolId) {
		this.poolId = poolId;
	}

	public String getPoolName() {
		return this.poolName;
	}
	public void setPoolName(String poolName) {
		this.poolName = poolName;
	}

	public String getRemainingAmount() {
		return this.remainingAmount;
	}
	public void setRemainingAmount(String remainingAmount) {
		this.remainingAmount = remainingAmount;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
