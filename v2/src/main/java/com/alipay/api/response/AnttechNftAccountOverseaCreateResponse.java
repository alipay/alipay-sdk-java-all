package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.account.oversea.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-26 17:57:27
 */
public class AnttechNftAccountOverseaCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8678852635411128336L;

	/** 
	 * 鲸探海外账户根据租户映射的开放id
	 */
	@ApiField("oversea_id_no")
	private String overseaIdNo;

	public void setOverseaIdNo(String overseaIdNo) {
		this.overseaIdNo = overseaIdNo;
	}
	public String getOverseaIdNo( ) {
		return this.overseaIdNo;
	}

}
