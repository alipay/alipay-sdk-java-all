package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卖进活动子任务信息
 *
 * @author auto create
 * @since 1.0, 2025-02-27 14:31:21
 */
public class NSalesSubActivity extends AlipayObject {

	private static final long serialVersionUID = 7663344822498644995L;

	/**
	 * 卖进订单子活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 卖进订单子活动履约金额
	 */
	@ApiField("fulfill_amount")
	private String fulfillAmount;

	/**
	 * 卖进订单子活动履约状态，初始化或进行中的子任务不会返回该字段。
	 */
	@ApiField("fulfill_status")
	private String fulfillStatus;

	/**
	 * 卖进订单子活动期号
	 */
	@ApiField("period_no")
	private Long periodNo;

	/**
	 * 当期子活动支付宝记录参考收单笔数，未开启统计前不会返回该字段。
	 */
	@ApiField("refer_trade_count")
	private Long referTradeCount;

	/**
	 * 当期子活动支付宝记录参考收单天数，未开启统计前不会返回该字段。
	 */
	@ApiField("refer_trade_days")
	private Long referTradeDays;

	/**
	 * 卖进订单子活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 卖进订单子活动id
	 */
	@ApiField("sub_activity_id")
	private String subActivityId;

	/**
	 * 卖进订单子活动状态
	 */
	@ApiField("sub_activity_status")
	private String subActivityStatus;

	/**
	 * 当期子活动目标收单笔数
	 */
	@ApiField("target_trade_count")
	private Long targetTradeCount;

	/**
	 * 当期子活动目标收单天数
	 */
	@ApiField("target_trade_days")
	private Long targetTradeDays;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getFulfillAmount() {
		return this.fulfillAmount;
	}
	public void setFulfillAmount(String fulfillAmount) {
		this.fulfillAmount = fulfillAmount;
	}

	public String getFulfillStatus() {
		return this.fulfillStatus;
	}
	public void setFulfillStatus(String fulfillStatus) {
		this.fulfillStatus = fulfillStatus;
	}

	public Long getPeriodNo() {
		return this.periodNo;
	}
	public void setPeriodNo(Long periodNo) {
		this.periodNo = periodNo;
	}

	public Long getReferTradeCount() {
		return this.referTradeCount;
	}
	public void setReferTradeCount(Long referTradeCount) {
		this.referTradeCount = referTradeCount;
	}

	public Long getReferTradeDays() {
		return this.referTradeDays;
	}
	public void setReferTradeDays(Long referTradeDays) {
		this.referTradeDays = referTradeDays;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getSubActivityId() {
		return this.subActivityId;
	}
	public void setSubActivityId(String subActivityId) {
		this.subActivityId = subActivityId;
	}

	public String getSubActivityStatus() {
		return this.subActivityStatus;
	}
	public void setSubActivityStatus(String subActivityStatus) {
		this.subActivityStatus = subActivityStatus;
	}

	public Long getTargetTradeCount() {
		return this.targetTradeCount;
	}
	public void setTargetTradeCount(Long targetTradeCount) {
		this.targetTradeCount = targetTradeCount;
	}

	public Long getTargetTradeDays() {
		return this.targetTradeDays;
	}
	public void setTargetTradeDays(Long targetTradeDays) {
		this.targetTradeDays = targetTradeDays;
	}

}
