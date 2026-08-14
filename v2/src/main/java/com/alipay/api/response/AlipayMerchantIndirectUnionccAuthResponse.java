package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.unioncc.auth response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-12 15:03:53
 */
public class AlipayMerchantIndirectUnionccAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 4531328642368617441L;

	/** 
	 * 报备状态，当前仅返回SUCCESS
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
