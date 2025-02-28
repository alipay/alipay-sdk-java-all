package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.nppd.userpoint.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-31 10:22:24
 */
public class AlipayOpenNppdUserpointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7696439813589144914L;

	/** 
	 * 用户等级
	 */
	@ApiField("grade")
	private String grade;

	/** 
	 * 用户积分
	 */
	@ApiField("point")
	private Long point;

	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGrade( ) {
		return this.grade;
	}

	public void setPoint(Long point) {
		this.point = point;
	}
	public Long getPoint( ) {
		return this.point;
	}

}
