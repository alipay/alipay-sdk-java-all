package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.bankaccount.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-03 11:42:44
 */
public class AlipayCommerceLifeserviceBankaccountApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5397969894188766281L;

	/** 
	 * 商户展示二维码目标跳转的完整 URL
	 */
	@ApiField("apply_url")
	private String applyUrl;

	public void setApplyUrl(String applyUrl) {
		this.applyUrl = applyUrl;
	}
	public String getApplyUrl( ) {
		return this.applyUrl;
	}

}
