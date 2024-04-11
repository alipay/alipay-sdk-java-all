package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CardTemplateInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.card.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-28 09:49:39
 */
public class AlipayCommerceCardTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2414357637445524118L;

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
