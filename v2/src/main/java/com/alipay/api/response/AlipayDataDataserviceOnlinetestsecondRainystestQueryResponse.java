package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.onlinetestsecond.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-11 16:42:21
 */
public class AlipayDataDataserviceOnlinetestsecondRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5785113775828139185L;

	/** 
	 * 参数测试
	 */
	@ApiField("tc_case")
	private String tcCase;

	public void setTcCase(String tcCase) {
		this.tcCase = tcCase;
	}
	public String getTcCase( ) {
		return this.tcCase;
	}

}
