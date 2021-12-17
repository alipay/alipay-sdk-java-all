package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.transfer.payment.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-09 15:03:48
 */
public class AlipayOverseasTransferPaymentCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 5383589911931821566L;

	/** 
	 * 扩展字段
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}
	public String getPassThroughInfo( ) {
		return this.passThroughInfo;
	}

}
