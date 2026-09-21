package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.templateprice.delete response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-11 10:47:15
 */
public class AlipayCommerceMerchantcardTemplatepriceDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8628687971473333653L;

	/** 
	 * 已处理的商品模板ID。
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/** 
	 * 本次成功设置或删除的价格明细数量。
	 */
	@ApiField("success_count")
	private Long successCount;

	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}
	public String getCardTemplateId( ) {
		return this.cardTemplateId;
	}

	public void setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}
	public Long getSuccessCount( ) {
		return this.successCount;
	}

}
