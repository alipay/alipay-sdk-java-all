package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.csfu.agentstatus.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-01 11:12:41
 */
public class AlipayIserviceCsfuAgentstatusCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 7465734634962763211L;

	/** 
	 * true：坐席空闲
false：坐席繁忙
	 */
	@ApiField("data")
	private Boolean data;

	public void setData(Boolean data) {
		this.data = data;
	}
	public Boolean getData( ) {
		return this.data;
	}

}
