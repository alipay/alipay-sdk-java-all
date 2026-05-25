package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.alipaymember.grade.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-23 20:17:44
 */
public class AlipayUserAlipaymemberGradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1115772449148652967L;

	/** 
	 * 用户会员等级
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
