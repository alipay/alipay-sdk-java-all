package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.market.student.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 09:21:25
 */
public class AlipayCloudCloudbaseMarketStudentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4218989222839761786L;

	/** 
	 * 是否成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
