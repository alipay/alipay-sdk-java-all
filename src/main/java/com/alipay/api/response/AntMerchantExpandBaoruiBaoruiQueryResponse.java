package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.baorui.baorui.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AntMerchantExpandBaoruiBaoruiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3479829511625266535L;

	/** 
	 * 返回名称＋返回名称
	 */
	@ApiField("covery")
	private String covery;

	public void setCovery(String covery) {
		this.covery = covery;
	}
	public String getCovery( ) {
		return this.covery;
	}

}
