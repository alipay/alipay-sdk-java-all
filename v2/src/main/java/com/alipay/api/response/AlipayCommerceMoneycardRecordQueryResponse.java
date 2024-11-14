package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MoneyCardUseRecordDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.moneycard.record.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-27 07:57:10
 */
public class AlipayCommerceMoneycardRecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6198414731983373567L;

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
