package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.ebpp.instnotice.checkavailable response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-11 14:47:04
 */
public class AlipayEbppEbppInstnoticeCheckavailableResponse extends AlipayResponse {

	private static final long serialVersionUID = 6655457991133792657L;

	/** 
	 * CREATED：创建
PROCESSING：处理中
COMPLETED：完成
CANCELED：撤消
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
