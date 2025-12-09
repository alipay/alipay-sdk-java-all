package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.tenantid.fansid.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-21 13:57:28
 */
public class AnttechNftTenantidFansidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6786327631368887846L;

	/** 
	 * 鲸探账号
	 */
	@ApiField("fans_id")
	private String fansId;

	public void setFansId(String fansId) {
		this.fansId = fansId;
	}
	public String getFansId( ) {
		return this.fansId;
	}

}
