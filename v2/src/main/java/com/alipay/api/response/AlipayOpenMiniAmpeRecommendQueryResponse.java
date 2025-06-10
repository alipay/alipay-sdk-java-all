package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.recommend.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-23 14:37:27
 */
public class AlipayOpenMiniAmpeRecommendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5366226829377257955L;

	/** 
	 * 卡片内容的JS，可直接在浏览器打开。
	 */
	@ApiField("card_url")
	private String cardUrl;

	/** 
	 * 用于标记当前咨询请求是否需要展示卡片，在不同场景下含义不同。例如在蚂蚁森林场景下，如果用户有待收取的能量，那么值为true。
	 */
	@ApiField("show_widget")
	private String showWidget;

	public void setCardUrl(String cardUrl) {
		this.cardUrl = cardUrl;
	}
	public String getCardUrl( ) {
		return this.cardUrl;
	}

	public void setShowWidget(String showWidget) {
		this.showWidget = showWidget;
	}
	public String getShowWidget( ) {
		return this.showWidget;
	}

}
