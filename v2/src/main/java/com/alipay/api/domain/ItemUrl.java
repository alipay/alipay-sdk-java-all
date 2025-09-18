package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品地址
 *
 * @author auto create
 * @since 1.0, 2025-09-09 10:40:48
 */
public class ItemUrl extends AlipayObject {

	private static final long serialVersionUID = 7191195688152442124L;

	/**
	 * 地址类型；可选值: SC_MINI_APP(支付宝小程序)
	 */
	@ApiField("type")
	private String type;

	/**
	 * 商品详情地址
	 */
	@ApiField("url")
	private String url;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
