package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员权益
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class MemberBenefit extends AlipayObject {

	private static final long serialVersionUID = 6663548519254892826L;

	/**
	 * 权益Id
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 权益状态。
可选值：enable-生效，disabled-失效。
	 */
	@ApiField("status")
	private String status;

	/**
	 * 核销码
	 */
	@ApiField("verify_code")
	private String verifyCode;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getVerifyCode() {
		return this.verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

}
