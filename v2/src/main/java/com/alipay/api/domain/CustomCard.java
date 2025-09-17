package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定卡片内容，当card_type为CUSTOM_CARD时需要填写。
 *
 * @author auto create
 * @since 1.0, 2025-06-17 11:22:28
 */
public class CustomCard extends AlipayObject {

	private static final long serialVersionUID = 1556821769173598182L;

	/**
	 * 自定义卡片body，选择自定义卡片时需要填写
	 */
	@ApiField("card_body")
	private String cardBody;

	/**
	 * 自定义卡片ID，选择自定义卡片时需要填写
	 */
	@ApiField("card_id")
	private String cardId;

	public String getCardBody() {
		return this.cardBody;
	}
	public void setCardBody(String cardBody) {
		this.cardBody = cardBody;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

}
