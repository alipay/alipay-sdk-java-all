package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.bpaas.contract.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:41:53
 */
public class AlipayOpenBpaasContractQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5276196782119687385L;

	/** 
	 * 签约状态
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
