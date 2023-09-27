package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券核销规则
 *
 * @author auto create
 * @since 1.0, 2023-06-28 17:40:23
 */
public class VoucherUseRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 7442729715135676349L;

	/**
	 * 核销次数限制。
	 */
	@ApiField("quantity_limit_per_user")
	private Long quantityLimitPerUser;

	/**
	 * 周期限领配置,限制每人在固定周期内领取张数(voucher_quantity_limit_per_user),默认LIFE_CYCLE
	 */
	@ApiField("quantity_limit_per_user_period_type")
	private String quantityLimitPerUserPeriodType;

	/**
	 * 券最大核销次数。
	 */
	@ApiField("voucher_max_use_times")
	private Long voucherMaxUseTimes;

	/**
	 * 自定义扩展信息
	 */
	@ApiField("voucher_use_ext_info")
	private String voucherUseExtInfo;

	/**
	 * 券核销时间。
	 */
	@ApiField("voucher_use_time_info")
	private VoucherUseTimeInfo voucherUseTimeInfo;

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

	public Long getVoucherMaxUseTimes() {
		return this.voucherMaxUseTimes;
	}
	public void setVoucherMaxUseTimes(Long voucherMaxUseTimes) {
		this.voucherMaxUseTimes = voucherMaxUseTimes;
	}

	public String getVoucherUseExtInfo() {
		return this.voucherUseExtInfo;
	}
	public void setVoucherUseExtInfo(String voucherUseExtInfo) {
		this.voucherUseExtInfo = voucherUseExtInfo;
	}

	public VoucherUseTimeInfo getVoucherUseTimeInfo() {
		return this.voucherUseTimeInfo;
	}
	public void setVoucherUseTimeInfo(VoucherUseTimeInfo voucherUseTimeInfo) {
		this.voucherUseTimeInfo = voucherUseTimeInfo;
	}

}
