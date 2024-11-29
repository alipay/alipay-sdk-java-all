package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 计次配置
 *
 * @author auto create
 * @since 1.0, 2019-08-19 15:58:49
 */
public class CountControlConfig extends AlipayObject {

	private static final long serialVersionUID = 6864215938354689191L;

	/**
	 * 每天次数
	 */
	@ApiField("day_count")
	private Long dayCount;

	/**
	 * 计次维度, USER_ID 用户id, TERMINAL_ID 终端id, PHONE_NO 手机号，ID_CARD_NO 证件号
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * 计次主题类型, CAMP_ACCESS 活动参与次数, CAMP_WIN 活动中奖次数
	 */
	@ApiField("domain_type")
	private String domainType;

	/**
	 * 终身次数
	 */
	@ApiField("life_count")
	private Long lifeCount;

	/**
	 * 每月次数
	 */
	@ApiField("month_count")
	private Long monthCount;

	/**
	 * 每周次数
	 */
	@ApiField("week_count")
	private Long weekCount;

	/**
	 * 每年次数
	 */
	@ApiField("year_count")
	private Long yearCount;

	public Long getDayCount() {
		return this.dayCount;
	}
	public void setDayCount(Long dayCount) {
		this.dayCount = dayCount;
	}

	public String getDimension() {
		return this.dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getDomainType() {
		return this.domainType;
	}
	public void setDomainType(String domainType) {
		this.domainType = domainType;
	}

	public Long getLifeCount() {
		return this.lifeCount;
	}
	public void setLifeCount(Long lifeCount) {
		this.lifeCount = lifeCount;
	}

	public Long getMonthCount() {
		return this.monthCount;
	}
	public void setMonthCount(Long monthCount) {
		this.monthCount = monthCount;
	}

	public Long getWeekCount() {
		return this.weekCount;
	}
	public void setWeekCount(Long weekCount) {
		this.weekCount = weekCount;
	}

	public Long getYearCount() {
		return this.yearCount;
	}
	public void setYearCount(Long yearCount) {
		this.yearCount = yearCount;
	}

}
