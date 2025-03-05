package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MultiCurrencyMoneyOpenApi;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsettleprod.poamount.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:44:35
 */
public class AlipayBossFncGfsettleprodPoamountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2268359218641233193L;

	/** 
	 * 已开票金额
	 */
	@ApiField("po_invoiced_amount")
	private MultiCurrencyMoneyOpenApi poInvoicedAmount;

	/** 
	 * 已认证开票金额
	 */
	@ApiField("po_invoiced_auth_amount")
	private MultiCurrencyMoneyOpenApi poInvoicedAuthAmount;

	/** 
	 * 已付款金额
	 */
	@ApiField("po_settled_amount")
	private MultiCurrencyMoneyOpenApi poSettledAmount;

	public void setPoInvoicedAmount(MultiCurrencyMoneyOpenApi poInvoicedAmount) {
		this.poInvoicedAmount = poInvoicedAmount;
	}
	public MultiCurrencyMoneyOpenApi getPoInvoicedAmount( ) {
		return this.poInvoicedAmount;
	}

	public void setPoInvoicedAuthAmount(MultiCurrencyMoneyOpenApi poInvoicedAuthAmount) {
		this.poInvoicedAuthAmount = poInvoicedAuthAmount;
	}
	public MultiCurrencyMoneyOpenApi getPoInvoicedAuthAmount( ) {
		return this.poInvoicedAuthAmount;
	}

	public void setPoSettledAmount(MultiCurrencyMoneyOpenApi poSettledAmount) {
		this.poSettledAmount = poSettledAmount;
	}
	public MultiCurrencyMoneyOpenApi getPoSettledAmount( ) {
		return this.poSettledAmount;
	}

}
