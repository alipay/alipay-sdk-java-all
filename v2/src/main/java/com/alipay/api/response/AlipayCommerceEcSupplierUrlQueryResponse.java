package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.supplier.url.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-09 15:52:24
 */
public class AlipayCommerceEcSupplierUrlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2819359779667627615L;

	/** 
	 * 供给跳链或者签约跳链，由url_type决定
	 */
	@ApiField("url")
	private String url;

	/** 
	 * 跳链类型
	 */
	@ApiField("url_type")
	private String urlType;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

	public void setUrlType(String urlType) {
		this.urlType = urlType;
	}
	public String getUrlType( ) {
		return this.urlType;
	}

}
