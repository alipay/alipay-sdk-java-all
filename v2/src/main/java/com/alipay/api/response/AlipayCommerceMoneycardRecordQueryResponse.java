package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MoneyCardUseRecordDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.moneycard.record.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-07 11:12:30
 */
public class AlipayCommerceMoneycardRecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5592719237734652163L;

	/** 
	 * 金额卡核销订单详情
	 */
	@ApiField("money_card_use_record_detail")
	private MoneyCardUseRecordDetail moneyCardUseRecordDetail;

	public void setMoneyCardUseRecordDetail(MoneyCardUseRecordDetail moneyCardUseRecordDetail) {
		this.moneyCardUseRecordDetail = moneyCardUseRecordDetail;
	}
	public MoneyCardUseRecordDetail getMoneyCardUseRecordDetail( ) {
		return this.moneyCardUseRecordDetail;
	}

}
