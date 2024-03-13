package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.gamecenter.addhomepage.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:27
 */
public class AlipayUserGamecenterAddhomepageConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6189443756266674117L;

	/** 
	 * Y：已添加首页，N：未添加首页
	 */
	@ApiField("consult_result")
	private String consultResult;

	public void setConsultResult(String consultResult) {
		this.consultResult = consultResult;
	}
	public String getConsultResult( ) {
		return this.consultResult;
	}

}
