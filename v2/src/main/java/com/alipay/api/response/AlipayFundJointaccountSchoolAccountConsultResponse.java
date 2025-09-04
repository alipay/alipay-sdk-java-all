package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.school.account.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-27 19:10:58
 */
public class AlipayFundJointaccountSchoolAccountConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6628164194235637651L;

	/** 
	 * 返回学生是否加小荷包，若学生的证件号、姓名等信息不匹配则返回false
	 */
	@ApiField("has_registered")
	private Boolean hasRegistered;

	public void setHasRegistered(Boolean hasRegistered) {
		this.hasRegistered = hasRegistered;
	}
	public Boolean getHasRegistered( ) {
		return this.hasRegistered;
	}

}
