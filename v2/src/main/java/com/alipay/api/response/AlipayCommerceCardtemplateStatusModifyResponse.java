package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cardtemplate.status.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-02 13:56:49
 */
public class AlipayCommerceCardtemplateStatusModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5781779413172328496L;

	/** 
	 * 卡模版ID
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}
	public String getCardTemplateId( ) {
		return this.cardTemplateId;
	}

}
