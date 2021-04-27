package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.transfer.certify response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-25 17:26:24
 */
public class AlipayOverseasTransferCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1761317482515291322L;

	/** 
	 * 透传信息
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
