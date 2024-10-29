package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MultiCurrencyMoneyOpenApi;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.arinvoice.rcptamount.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-22 09:41:31
 */
public class AlipayBossFncArinvoiceRcptamountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3429924482947436799L;

	/** 
	 * 可开票总金额，可开票单据返回集合中可开票金额汇总
	 */
	@ApiField("total_inv_amt")
	private MultiCurrencyMoneyOpenApi totalInvAmt;

	/** 
	 * 已开票总金额，可开票单据返回集合中已开票金额汇总
	 */
	@ApiField("total_inved_amt")
	private MultiCurrencyMoneyOpenApi totalInvedAmt;

	/** 
	 * 关联票总金额，可开票单据返回集合中关联金额汇总
	 */
	@ApiField("total_link_invoice_amt")
	private MultiCurrencyMoneyOpenApi totalLinkInvoiceAmt;

	public void setTotalInvAmt(MultiCurrencyMoneyOpenApi totalInvAmt) {
		this.totalInvAmt = totalInvAmt;
	}
	public MultiCurrencyMoneyOpenApi getTotalInvAmt( ) {
		return this.totalInvAmt;
	}

	public void setTotalInvedAmt(MultiCurrencyMoneyOpenApi totalInvedAmt) {
		this.totalInvedAmt = totalInvedAmt;
	}
	public MultiCurrencyMoneyOpenApi getTotalInvedAmt( ) {
		return this.totalInvedAmt;
	}

	public void setTotalLinkInvoiceAmt(MultiCurrencyMoneyOpenApi totalLinkInvoiceAmt) {
		this.totalLinkInvoiceAmt = totalLinkInvoiceAmt;
	}
	public MultiCurrencyMoneyOpenApi getTotalLinkInvoiceAmt( ) {
		return this.totalLinkInvoiceAmt;
	}

}
