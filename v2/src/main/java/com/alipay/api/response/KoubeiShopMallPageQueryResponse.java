package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.mall.page.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 00:14:28
 */
public class KoubeiShopMallPageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2684124382826952615L;

	/** 
	 * 商圈首页url地址
	 */
	@ApiField("mall_url")
	private String mallUrl;

	public void setMallUrl(String mallUrl) {
		this.mallUrl = mallUrl;
	}
	public String getMallUrl( ) {
		return this.mallUrl;
	}

}
