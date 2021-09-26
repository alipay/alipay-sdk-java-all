package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.bpaas.contract.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-22 10:00:19
 */
public class AlipayOpenBpaasContractQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3132582346278892136L;

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
