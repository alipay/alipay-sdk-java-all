package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询权益跳转链接
 *
 * @author auto create
 * @since 1.0, 2026-08-13 16:34:14
 */
public class AlipayCommerceMedicalMemberBenefitlinkQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1755121931396121167L;

	/**
	 * 权益编码
	 */
	@ApiField("benefit_code")
	private String benefitCode;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	public String getBenefitCode() {
		return this.benefitCode;
	}
	public void setBenefitCode(String benefitCode) {
		this.benefitCode = benefitCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

}
