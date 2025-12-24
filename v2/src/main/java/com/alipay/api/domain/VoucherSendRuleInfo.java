package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发券规则
 *
 * @author auto create
 * @since 1.0, 2025-09-23 19:29:13
 */
public class VoucherSendRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 2257382838338114927L;

	/**
	 * 设置此字段，允许指定单天最大发券数量。
	 */
	@ApiField("max_quantity_by_day")
	private Long maxQuantityByDay;

	/**
	 * 是否开启自然人领取限制。 自然人表示按照身份证纬度进行领取限制。
	 */
	@ApiField("natural_person_limit")
	private Boolean naturalPersonLimit;

	/**
	 * 是否开启电话号码领取限制。
	 */
	@ApiField("phone_number_limit")
	private Boolean phoneNumberLimit;

	/**
	 * 下单时是否需要用户填写手机号码
	 */
	@ApiField("phone_number_need_input_limit")
	private Boolean phoneNumberNeedInputLimit;

	/**
	 * 券发放结束时间。 格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 券发放开始时间。 格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/**
	 * 发行券的数量。
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 每人每日可领取数量限制，填0或者不填表示不限制。
	 */
	@ApiField("quantity_day_limit_per_user")
	private Long quantityDayLimitPerUser;

	/**
	 * 每人领取限制。 默认按照支付宝账号进行领取限制; 不填写或填入0表示没有领取限制.
	 */
	@ApiField("quantity_limit_per_user")
	private Long quantityLimitPerUser;

	/**
	 * 周期限领配置,限制每人在固定周期内领取张数(voucher_quantity_limit_per_user),默认LIFE_CYCLE
	 */
	@ApiField("quantity_limit_per_user_period_type")
	private String quantityLimitPerUserPeriodType;

	/**
	 * 每人每月可领取数量限制，填0或者不填表示不限制
	 */
	@ApiField("quantity_month_limit_per_user")
	private Long quantityMonthLimitPerUser;

	/**
	 * 每人每周可领取数量限制，填0或者不填表示不限制
	 */
	@ApiField("quantity_week_limit_per_user")
	private Long quantityWeekLimitPerUser;

	/**
	 * 限制支付宝实名用户才能领取支付券,默认为false表示不限制 枚举值 true\false
	 */
	@ApiField("real_name_limit")
	private Boolean realNameLimit;

	public Long getMaxQuantityByDay() {
		return this.maxQuantityByDay;
	}
	public void setMaxQuantityByDay(Long maxQuantityByDay) {
		this.maxQuantityByDay = maxQuantityByDay;
	}

	public Boolean getNaturalPersonLimit() {
		return this.naturalPersonLimit;
	}
	public void setNaturalPersonLimit(Boolean naturalPersonLimit) {
		this.naturalPersonLimit = naturalPersonLimit;
	}

	public Boolean getPhoneNumberLimit() {
		return this.phoneNumberLimit;
	}
	public void setPhoneNumberLimit(Boolean phoneNumberLimit) {
		this.phoneNumberLimit = phoneNumberLimit;
	}

	public Boolean getPhoneNumberNeedInputLimit() {
		return this.phoneNumberNeedInputLimit;
	}
	public void setPhoneNumberNeedInputLimit(Boolean phoneNumberNeedInputLimit) {
		this.phoneNumberNeedInputLimit = phoneNumberNeedInputLimit;
	}

	public Date getPublishEndTime() {
		return this.publishEndTime;
	}
	public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

	public Date getPublishStartTime() {
		return this.publishStartTime;
	}
	public void setPublishStartTime(Date publishStartTime) {
		this.publishStartTime = publishStartTime;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getQuantityDayLimitPerUser() {
		return this.quantityDayLimitPerUser;
	}
	public void setQuantityDayLimitPerUser(Long quantityDayLimitPerUser) {
		this.quantityDayLimitPerUser = quantityDayLimitPerUser;
	}

	public Long getQuantityLimitPerUser() {
		return this.quantityLimitPerUser;
	}
	public void setQuantityLimitPerUser(Long quantityLimitPerUser) {
		this.quantityLimitPerUser = quantityLimitPerUser;
	}

	public String getQuantityLimitPerUserPeriodType() {
		return this.quantityLimitPerUserPeriodType;
	}
	public void setQuantityLimitPerUserPeriodType(String quantityLimitPerUserPeriodType) {
		this.quantityLimitPerUserPeriodType = quantityLimitPerUserPeriodType;
	}

	public Long getQuantityMonthLimitPerUser() {
		return this.quantityMonthLimitPerUser;
	}
	public void setQuantityMonthLimitPerUser(Long quantityMonthLimitPerUser) {
		this.quantityMonthLimitPerUser = quantityMonthLimitPerUser;
	}

	public Long getQuantityWeekLimitPerUser() {
		return this.quantityWeekLimitPerUser;
	}
	public void setQuantityWeekLimitPerUser(Long quantityWeekLimitPerUser) {
		this.quantityWeekLimitPerUser = quantityWeekLimitPerUser;
	}

	public Boolean getRealNameLimit() {
		return this.realNameLimit;
	}
	public void setRealNameLimit(Boolean realNameLimit) {
		this.realNameLimit = realNameLimit;
	}

}
