package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.indirect.smid.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-13 09:59:40
 */
public class AlipayOfflineProviderIndirectSmidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7241876912333642278L;

	/** 
	 * 商户smid
	 */
	@ApiField("smid")
	private String smid;

	public void setSmid(String smid) {
		this.smid = smid;
	}
	public String getSmid( ) {
		return this.smid;
	}

}
