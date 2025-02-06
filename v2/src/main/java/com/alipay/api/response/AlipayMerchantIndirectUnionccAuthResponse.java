package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.unioncc.auth response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-11 11:29:14
 */
public class AlipayMerchantIndirectUnionccAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 2282589275378118327L;

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
