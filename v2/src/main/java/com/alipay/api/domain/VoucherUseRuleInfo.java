package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券核销规则
 *
 * @author auto create
 * @since 1.0, 2024-09-06 15:13:53
 */
public class VoucherUseRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 4232484296994418613L;

	/**
	 * 支付方式限制
	 */
	@ApiListField("payment_restriction_list")
	@ApiField("string")
	private List<String> paymentRestrictionList;

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

	public List<String> getPaymentRestrictionList() {
		return this.paymentRestrictionList;
	}
	public void setPaymentRestrictionList(List<String> paymentRestrictionList) {
		this.paymentRestrictionList = paymentRestrictionList;
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
