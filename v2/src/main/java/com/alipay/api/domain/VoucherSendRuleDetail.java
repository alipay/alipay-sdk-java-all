package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券发放规则
 *
 * @author auto create
 * @since 1.0, 2022-08-24 14:39:34
 */
public class VoucherSendRuleDetail extends AlipayObject {

	private static final long serialVersionUID = 2351761728619847376L;

	/**
	 * 是否开启自然人领取限制。自然人表示按照身份证纬度进行领取限制。
	 */
	@ApiField("natural_person_limit")
	private Boolean naturalPersonLimit;

	/**
	 * 是否开启电话号码领取限制。
	 */
	@ApiField("phone_number_limit")
	private Boolean phoneNumberLimit;

	/**
	 * 发行券的数量。
	 */
	@ApiField("voucher_quantity")
	private Long voucherQuantity;

	/**
	 * 每人领取限制。默认按照支付宝uid进行领取限制;
不填写或填入0，默认没有领取限制。
	 */
	@ApiField("voucher_quantity_limit_per_user")
	private Long voucherQuantityLimitPerUser;

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

}
