package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.recommend.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-29 14:22:27
 */
public class AlipayOpenMiniAmpeRecommendPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3211136818558115221L;

	/** 
	 * 预估是否有推荐的内容，如果是true，则表示有推荐内容，需要展示卡片。
	 */
	@ApiField("show_widget")
	private String showWidget;

	public void setShowWidget(String showWidget) {
		this.showWidget = showWidget;
	}
	public String getShowWidget( ) {
		return this.showWidget;
	}

}
