package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.membergrade.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 20:53:21
 */
public class AlipayUserMembergradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8132193271749948879L;

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
