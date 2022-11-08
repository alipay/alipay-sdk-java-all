package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发券规则
 *
 * @author auto create
 * @since 1.0, 2022-09-27 13:22:21
 */
public class VoucherSendRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 4714662592393265491L;

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

	public Boolean getRealNameLimit() {
		return this.realNameLimit;
	}
	public void setRealNameLimit(Boolean realNameLimit) {
		this.realNameLimit = realNameLimit;
	}

}
