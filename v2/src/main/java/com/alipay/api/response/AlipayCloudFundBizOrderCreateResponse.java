package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.fund.biz.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-19 11:02:01
 */
public class AlipayCloudFundBizOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5173863982646652181L;

	/** 
	 * 上报成功/失败
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
