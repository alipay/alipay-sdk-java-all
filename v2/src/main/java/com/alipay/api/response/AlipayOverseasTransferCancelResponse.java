package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.transfer.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 05:41:14
 */
public class AlipayOverseasTransferCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6333681888953673912L;

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
