package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.membergrade.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 23:06:20
 */
public class AlipayUserMembergradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2185338132478396292L;

	/** 
	 * 支付宝用户的蚂蚁会员等级
	 */
	@ApiField("grade")
	private String grade;

	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGrade( ) {
		return this.grade;
	}

}
