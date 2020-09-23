package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.printer.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-06 17:57:26
 */
public class AlipayEcoPrinterStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2172117551854948299L;

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
