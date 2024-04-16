package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlescenter.docusignrecipient.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-27 15:04:29
 */
public class AlipayBossProdAntlescenterDocusignrecipientQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2889993423976857427L;

	/** 
	 * 签署url
	 */
	@ApiField("view_url")
	private String viewUrl;

	public void setViewUrl(String viewUrl) {
		this.viewUrl = viewUrl;
	}
	public String getViewUrl( ) {
		return this.viewUrl;
	}

}
