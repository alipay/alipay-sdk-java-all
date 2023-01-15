package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.printer.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 22:34:53
 */
public class AlipayEcoPrinterStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4328611681116769388L;

	/** 
	 * 0离线 1在线 2缺纸
	 */
	@ApiField("state")
	private Long state;

	public void setState(Long state) {
		this.state = state;
	}
	public Long getState( ) {
		return this.state;
	}

}
