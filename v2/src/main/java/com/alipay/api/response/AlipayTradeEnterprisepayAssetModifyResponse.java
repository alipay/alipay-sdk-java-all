package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.enterprisepay.asset.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-17 17:47:01
 */
public class AlipayTradeEnterprisepayAssetModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2619871422975582233L;

	/** 
	 * 因公付资产切换操作跳转链接
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public String getRedirectUrl( ) {
		return this.redirectUrl;
	}

}
