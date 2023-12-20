package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CardTemplateInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.card.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-02 13:56:49
 */
public class AlipayCommerceCardTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7176889716333486611L;

	/** 
	 * 卡模版数据
	 */
	@ApiField("card_template_info")
	private CardTemplateInfo cardTemplateInfo;

	public void setCardTemplateInfo(CardTemplateInfo cardTemplateInfo) {
		this.cardTemplateInfo = cardTemplateInfo;
	}
	public CardTemplateInfo getCardTemplateInfo( ) {
		return this.cardTemplateInfo;
	}

}
