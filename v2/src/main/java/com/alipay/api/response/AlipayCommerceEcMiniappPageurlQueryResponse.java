package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.miniapp.pageurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-06 10:17:22
 */
public class AlipayCommerceEcMiniappPageurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4839284452884785717L;

	/** 
	 * 页面类型，传需要跳转到具体位置的页面类型，如企业码小程序列表页，或者三方小程序某个页面
	 */
	@ApiField("page_type")
	private String pageType;

	/** 
	 * 页面跳链，默认有效期为10分钟
	 */
	@ApiField("page_url")
	private String pageUrl;

	public void setPageType(String pageType) {
		this.pageType = pageType;
	}
	public String getPageType( ) {
		return this.pageType;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}
	public String getPageUrl( ) {
		return this.pageUrl;
	}

}
