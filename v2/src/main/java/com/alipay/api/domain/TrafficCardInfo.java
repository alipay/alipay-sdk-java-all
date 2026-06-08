package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-03-16 19:37:43
 */
public class TrafficCardInfo extends AlipayObject {

	private static final long serialVersionUID = 7223614116619465345L;

	/**
	 * 乘车卡标题
	 */
	@ApiField("card_title")
	private String cardTitle;

	/**
	 * 乘车卡跳转链接
	 */
	@ApiField("card_use_url")
	private String cardUseUrl;

	/**
	 * 卡面图片链接
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 乘车卡业主logo链接
	 */
	@ApiField("logo_url")
	private String logoUrl;

	public String getCardTitle() {
		return this.cardTitle;
	}
	public void setCardTitle(String cardTitle) {
		this.cardTitle = cardTitle;
	}

	public String getCardUseUrl() {
		return this.cardUseUrl;
	}
	public void setCardUseUrl(String cardUseUrl) {
		this.cardUseUrl = cardUseUrl;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

}
