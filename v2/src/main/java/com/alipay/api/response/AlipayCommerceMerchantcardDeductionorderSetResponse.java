package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.deductionorder.set response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-09 14:07:12
 */
public class AlipayCommerceMerchantcardDeductionorderSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8688478629381936714L;

	/** 
	 * (1) 当 card_type=AXF_MONEY_TIME_CARD && operation_type=REFUND 时，该字段代表退款单id
	 */
	@ApiField("biz_id")
	private String bizId;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

}
