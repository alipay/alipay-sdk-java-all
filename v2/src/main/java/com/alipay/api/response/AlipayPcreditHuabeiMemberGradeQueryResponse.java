package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.member.grade.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-30 10:42:55
 */
public class AlipayPcreditHuabeiMemberGradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1456691936363887518L;

	/** 
	 * 花呗等级  V1 V2 V3 V4
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
