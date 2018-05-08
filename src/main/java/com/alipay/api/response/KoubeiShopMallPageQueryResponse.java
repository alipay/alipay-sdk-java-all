package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.mall.page.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-01-12 11:03:13
 */
public class KoubeiShopMallPageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1343423661161813261L;

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
