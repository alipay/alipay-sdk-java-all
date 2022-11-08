package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券发放规则修改
 *
 * @author auto create
 * @since 1.0, 2022-08-24 14:47:47
 */
public class VoucherSendRuleDetailModify extends AlipayObject {

	private static final long serialVersionUID = 2542294261242699318L;

	/**
	 * 是否开启自然人领取限制。 自然人表示按照身份证纬度进行领取限制。
	 */
	@ApiField("natural_person_limit")
	private Boolean naturalPersonLimit;

	/**
	 * 是否开启电话号码领取限制。
	 */
	@ApiField("phone_number_limit")
	private String phoneNumberLimit;

	/**
	 * 每人领取限制。 默认按照支付宝uid进行领取限制;
	 */
	@ApiField("voucher_quantity_limit_per_user")
	private Long voucherQuantityLimitPerUser;

	public Boolean getNaturalPersonLimit() {
		return this.naturalPersonLimit;
	}
	public void setNaturalPersonLimit(Boolean naturalPersonLimit) {
		this.naturalPersonLimit = naturalPersonLimit;
	}

	public String getPhoneNumberLimit() {
		return this.phoneNumberLimit;
	}
	public void setPhoneNumberLimit(String phoneNumberLimit) {
		this.phoneNumberLimit = phoneNumberLimit;
	}

	public Long getVoucherQuantityLimitPerUser() {
		return this.voucherQuantityLimitPerUser;
	}
	public void setVoucherQuantityLimitPerUser(Long voucherQuantityLimitPerUser) {
		this.voucherQuantityLimitPerUser = voucherQuantityLimitPerUser;
	}

}
