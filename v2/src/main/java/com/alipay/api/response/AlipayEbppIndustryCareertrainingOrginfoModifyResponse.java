package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.orginfo.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-26 13:52:36
 */
public class AlipayEbppIndustryCareertrainingOrginfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5516728539454634711L;

	/** 
	 * 机构编码
	 */
	@ApiField("org_code")
	private String orgCode;

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getOrgCode( ) {
		return this.orgCode;
	}

}
