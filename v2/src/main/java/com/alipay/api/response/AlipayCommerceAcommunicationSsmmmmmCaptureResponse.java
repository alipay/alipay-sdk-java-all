package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ManjiangTestttttt;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.ssmmmmm.capture response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-17 10:48:18
 */
public class AlipayCommerceAcommunicationSsmmmmmCaptureResponse extends AlipayResponse {

	private static final long serialVersionUID = 2285427725774885118L;

	/** 
	 * 2
	 */
	@ApiField("sds")
	private ManjiangTestttttt sds;

	public void setSds(ManjiangTestttttt sds) {
		this.sds = sds;
	}
	public ManjiangTestttttt getSds( ) {
		return this.sds;
	}

}
