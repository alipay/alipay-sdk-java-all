package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.renew.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-04 11:11:17
 */
public class AlipayCloudCloudbaseResourcepackageRenewConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6536573152881559874L;

	/** 
	 * 币种
 - CNY
 - USD
 - EUR
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 折扣后总价(分)
	 */
	@ApiField("trade_total_amount")
	private String tradeTotalAmount;

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setTradeTotalAmount(String tradeTotalAmount) {
		this.tradeTotalAmount = tradeTotalAmount;
	}
	public String getTradeTotalAmount( ) {
		return this.tradeTotalAmount;
	}

}
