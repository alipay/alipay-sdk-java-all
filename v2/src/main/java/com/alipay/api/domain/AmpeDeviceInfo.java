package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AMPE设备运行时环境信息
 *
 * @author auto create
 * @since 1.0, 2025-04-17 19:27:39
 */
public class AmpeDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 6252239527697629559L;

	/**
	 * 支付宝卡片的高度，单位：像素
	 */
	@ApiField("card_height")
	private Long cardHeight;

	/**
	 * 支付宝卡片的宽度，单位：像素
	 */
	@ApiField("card_width")
	private Long cardWidth;

	public Long getCardHeight() {
		return this.cardHeight;
	}
	public void setCardHeight(Long cardHeight) {
		this.cardHeight = cardHeight;
	}

	public Long getCardWidth() {
		return this.cardWidth;
	}
	public void setCardWidth(Long cardWidth) {
		this.cardWidth = cardWidth;
	}

}
