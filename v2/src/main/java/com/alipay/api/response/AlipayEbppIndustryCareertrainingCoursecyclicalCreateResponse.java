package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.coursecyclical.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-30 11:31:44
 */
public class AlipayEbppIndustryCareertrainingCoursecyclicalCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4234828428152473635L;

	/** 
	 * 业务单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

}
