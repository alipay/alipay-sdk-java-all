package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.printer.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 01:16:00
 */
public class AlipayEcoPrinterStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7269913549873693518L;

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
