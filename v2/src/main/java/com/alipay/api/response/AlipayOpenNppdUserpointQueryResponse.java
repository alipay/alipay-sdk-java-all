package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.nppd.userpoint.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-27 13:57:16
 */
public class AlipayOpenNppdUserpointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8335521313245726293L;

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
