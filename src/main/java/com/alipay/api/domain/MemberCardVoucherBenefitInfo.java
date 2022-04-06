package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家会员卡券权益信息
 *
 * @author auto create
 * @since 1.0, 2022-03-25 13:48:32
 */
public class MemberCardVoucherBenefitInfo extends AlipayObject {

	private static final long serialVersionUID = 4843631217196765231L;

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

	public String getVouvherType() {
		return this.vouvherType;
	}
	public void setVouvherType(String vouvherType) {
		this.vouvherType = vouvherType;
	}

}
