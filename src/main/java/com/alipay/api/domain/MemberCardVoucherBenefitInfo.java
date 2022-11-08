package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家会员卡券权益信息
 *
 * @author auto create
 * @since 1.0, 2022-10-31 21:54:41
 */
public class MemberCardVoucherBenefitInfo extends AlipayObject {

	private static final long serialVersionUID = 3187764311858899517L;

	/**
	 * 券权益奖励次数
	 */
	@ApiField("modulus")
	private Long modulus;

	/**
	 * 券活动ID
	 */
	@ApiField("voucher_activity_id")
	private String voucherActivityId;

	/**
	 * 券类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * 商家券 MERCHANT_VOUCHER
支付券 PAYMENT_VOUCHER
	 */
	@ApiField("vouvher_type")
	private String vouvherType;

	public Long getModulus() {
		return this.modulus;
	}
	public void setModulus(Long modulus) {
		this.modulus = modulus;
	}

	public String getVoucherActivityId() {
		return this.voucherActivityId;
	}
	public void setVoucherActivityId(String voucherActivityId) {
		this.voucherActivityId = voucherActivityId;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

	public String getVouvherType() {
		return this.vouvherType;
	}
	public void setVouvherType(String vouvherType) {
		this.vouvherType = vouvherType;
	}

}
