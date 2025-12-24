package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N设备推广子活动
 *
 * @author auto create
 * @since 1.0, 2025-01-14 15:01:18
 */
public class NPromoSubActivity extends AlipayObject {

	private static final long serialVersionUID = 8863929149767563754L;

	/**
	 * 当期任务正常可推进时间，具体到小时。
	 */
	@ApiField("advanceable_time")
	private Date advanceableTime;

	/**
	 * 当期活动的结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 用户活动期号
	 */
	@ApiField("period_no")
	private Long periodNo;

	/**
	 * 当期活动的开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 子活动状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户单期子活动的id
	 */
	@ApiField("sub_activity_id")
	private String subActivityId;

	/**
	 * 完成当期活动需要的收单笔数
	 */
	@ApiField("target_trade_counts")
	private Long targetTradeCounts;

	/**
	 * 完成当期活动需要的收单天数
	 */
	@ApiField("target_trade_days")
	private Long targetTradeDays;

	public Date getAdvanceableTime() {
		return this.advanceableTime;
	}
	public void setAdvanceableTime(Date advanceableTime) {
		this.advanceableTime = advanceableTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getPeriodNo() {
		return this.periodNo;
	}
	public void setPeriodNo(Long periodNo) {
		this.periodNo = periodNo;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubActivityId() {
		return this.subActivityId;
	}
	public void setSubActivityId(String subActivityId) {
		this.subActivityId = subActivityId;
	}

	public Long getTargetTradeCounts() {
		return this.targetTradeCounts;
	}
	public void setTargetTradeCounts(Long targetTradeCounts) {
		this.targetTradeCounts = targetTradeCounts;
	}

	public Long getTargetTradeDays() {
		return this.targetTradeDays;
	}
	public void setTargetTradeDays(Long targetTradeDays) {
		this.targetTradeDays = targetTradeDays;
	}

}
