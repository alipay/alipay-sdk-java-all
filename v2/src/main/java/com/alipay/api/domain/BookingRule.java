package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预定规则
 *
 * @author auto create
 * @since 1.0, 2024-01-24 10:57:15
 */
public class BookingRule extends AlipayObject {

	private static final long serialVersionUID = 3858952541183146622L;

	/**
	 * 预订规则编号
	 */
	@ApiField("booking_rule_id")
	private String bookingRuleId;

	/**
	 * 预定说明
	 */
	@ApiField("description")
	private String description;

	/**
	 * 报价生效的结束日期。
yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 每天结束时间（次日使用+24小时的模式，例如次日3点，表示为27）
	 */
	@ApiField("end_hour")
	private String endHour;

	/**
	 * 最大提前预定时间（以用户选择的入住日期的23:59:59计算）
	 */
	@ApiField("max_adv_hours")
	private Long maxAdvHours;

	/**
	 * 最大预定房间数量
	 */
	@ApiField("max_amount")
	private Long maxAmount;

	/**
	 * 最多入住天数
	 */
	@ApiField("max_days")
	private Long maxDays;

	/**
	 * 最少提前预定时间（以用户选择的入住日期的23:59:59计算）
	 */
	@ApiField("min_adv_hours")
	private Long minAdvHours;

	/**
	 * 最少预定房间数量
	 */
	@ApiField("min_amount")
	private Long minAmount;

	/**
	 * 最少入住天数
	 */
	@ApiField("min_days")
	private Long minDays;

	/**
	 * 报价生效开始日期。当前日期不在日期段内则无法下单
yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 每天开始时间（当前时间不在时间段内无法下单）
	 */
	@ApiField("start_hour")
	private String startHour;

	/**
	 * 有效星期。以逗号分割
0表示星期日，
1表示星期一，
剩余的以此类推。当天不在星期范围内则无法下单
	 */
	@ApiField("week_set")
	private String weekSet;

	public String getBookingRuleId() {
		return this.bookingRuleId;
	}
	public void setBookingRuleId(String bookingRuleId) {
		this.bookingRuleId = bookingRuleId;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEndHour() {
		return this.endHour;
	}
	public void setEndHour(String endHour) {
		this.endHour = endHour;
	}

	public Long getMaxAdvHours() {
		return this.maxAdvHours;
	}
	public void setMaxAdvHours(Long maxAdvHours) {
		this.maxAdvHours = maxAdvHours;
	}

	public Long getMaxAmount() {
		return this.maxAmount;
	}
	public void setMaxAmount(Long maxAmount) {
		this.maxAmount = maxAmount;
	}

	public Long getMaxDays() {
		return this.maxDays;
	}
	public void setMaxDays(Long maxDays) {
		this.maxDays = maxDays;
	}

	public Long getMinAdvHours() {
		return this.minAdvHours;
	}
	public void setMinAdvHours(Long minAdvHours) {
		this.minAdvHours = minAdvHours;
	}

	public Long getMinAmount() {
		return this.minAmount;
	}
	public void setMinAmount(Long minAmount) {
		this.minAmount = minAmount;
	}

	public Long getMinDays() {
		return this.minDays;
	}
	public void setMinDays(Long minDays) {
		this.minDays = minDays;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStartHour() {
		return this.startHour;
	}
	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}

	public String getWeekSet() {
		return this.weekSet;
	}
	public void setWeekSet(String weekSet) {
		this.weekSet = weekSet;
	}

}
