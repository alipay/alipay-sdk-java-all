package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.remit.withdraw.notify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 09:04:16
 */
public class AlipayOverseasRemitWithdrawNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4865658288459794232L;

	/** 
	 * JSON map
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
