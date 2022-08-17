package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券发放规则
 *
 * @author auto create
 * @since 1.0, 2022-02-23 14:18:49
 */
public class PaymentVoucherSendRule extends AlipayObject {

	private static final long serialVersionUID = 2153943687296822551L;

	/**
	 * 设置此字段，允许指定单天最大发券数量。

限制:
每天发放张数*活动天数应小于等于优惠券发放总量
	 */
	@ApiField("max_quantity_by_day")
	private Long maxQuantityByDay;

	/**
	 * 限制相同身份证号领取次数(voucher_quantity_limit_per_user)。默认false不限制。
枚举值
true：是
false：否
	 */
	@ApiField("natural_person_limit")
	private Boolean naturalPersonLimit;

	/**
	 * 限制相同手机号领取次数(voucher_quantity_limit_per_user)。默认false不限制
枚举值
true：是
false：否
	 */
	@ApiField("phone_number_limit")
	private Boolean phoneNumberLimit;

	/**
	 * 限制支付宝实名用户才能领取支付券,默认为false表示不限制
枚举值
true\false
	 */
	@ApiField("real_name_limit")
	private Boolean realNameLimit;

	/**
	 * 发行券的总数量。
限制：
1、发放总个数最少1个
2、发放总个数最多99999999个
	 */
	@ApiField("voucher_quantity")
	private Long voucherQuantity;

	/**
	 * 每人领取限制。 默认按照支付宝账号进行领取限制; 
不填写或填入0表示没有领取限制.
	 */
	@ApiField("voucher_quantity_limit_per_user")
	private Long voucherQuantityLimitPerUser;

	/**
	 * 周期限领配置,限制每人在固定周期内领取张数(voucher_quantity_limit_per_user),默认LIFE_CYCLE

枚举值为 
DAY:每天
WEEK:每周
MONTH:每月
LIFE_CYCLE:整个活动周期
	 */
	@ApiField("voucher_quantity_limit_per_user_period_type")
	private String voucherQuantityLimitPerUserPeriodType;

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

	public Boolean getRealNameLimit() {
		return this.realNameLimit;
	}
	public void setRealNameLimit(Boolean realNameLimit) {
		this.realNameLimit = realNameLimit;
	}

	public Long getVoucherQuantity() {
		return this.voucherQuantity;
	}
	public void setVoucherQuantity(Long voucherQuantity) {
		this.voucherQuantity = voucherQuantity;
	}

	public Long getVoucherQuantityLimitPerUser() {
		return this.voucherQuantityLimitPerUser;
	}
	public void setVoucherQuantityLimitPerUser(Long voucherQuantityLimitPerUser) {
		this.voucherQuantityLimitPerUser = voucherQuantityLimitPerUser;
	}

	public String getVoucherQuantityLimitPerUserPeriodType() {
		return this.voucherQuantityLimitPerUserPeriodType;
	}
	public void setVoucherQuantityLimitPerUserPeriodType(String voucherQuantityLimitPerUserPeriodType) {
		this.voucherQuantityLimitPerUserPeriodType = voucherQuantityLimitPerUserPeriodType;
	}

}
