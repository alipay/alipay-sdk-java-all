package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 全域营销详细信息
 *
 * @author auto create
 * @since 1.0, 2020-08-18 14:29:56
 */
public class PriceDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 8397228828245249726L;

	/**
	 * 奖品领取跳转链接
	 */
	@ApiField("price_click_url")
	private String priceClickUrl;

	/**
	 * 权益优惠信息
	 */
	@ApiField("price_title")
	private String priceTitle;

	public String getPriceClickUrl() {
		return this.priceClickUrl;
	}
	public void setPriceClickUrl(String priceClickUrl) {
		this.priceClickUrl = priceClickUrl;
	}

	public String getPriceTitle() {
		return this.priceTitle;
	}
	public void setPriceTitle(String priceTitle) {
		this.priceTitle = priceTitle;
	}

}
