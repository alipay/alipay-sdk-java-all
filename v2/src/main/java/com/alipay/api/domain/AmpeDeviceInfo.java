package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运行时的设备、卡片信息
 *
 * @author auto create
 * @since 1.0, 2025-04-17 15:32:28
 */
public class AmpeDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 4571919397734935459L;

	/**
	 * 支付宝卡片的高度
	 */
	@ApiField("card_height")
	private Long cardHeight;

	/**
	 * 支付宝卡片的宽度
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
