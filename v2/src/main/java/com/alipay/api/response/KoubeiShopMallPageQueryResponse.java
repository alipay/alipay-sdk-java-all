package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.mall.page.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 11:19:06
 */
public class KoubeiShopMallPageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3332357523413799876L;

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
