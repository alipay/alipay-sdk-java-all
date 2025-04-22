package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.transfer.payment.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:34:04
 */
public class AlipayOverseasTransferPaymentCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8185579733726762829L;

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
