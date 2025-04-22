package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MultiCurrencyMoneyOpenApi;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.outputinvoice.rcptamount.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-22 09:38:59
 */
public class AlipayBossFncOutputinvoiceRcptamountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8818192434461232171L;

	/** 
	 * 默认情况可开票总金额
	 */
	@ApiField("total_inv_amt")
	private MultiCurrencyMoneyOpenApi totalInvAmt;

	/** 
	 * 默认开票模式下，已开票总金额，可开票单据返回集合中已开票金额汇总
	 */
	@ApiField("total_inved_amt")
	private MultiCurrencyMoneyOpenApi totalInvedAmt;

	/** 
	 * 默认开票模式下，关联票总金额，可开票单据返回集合中关联金额汇总
	 */
	@ApiField("total_link_invoice_amt")
	private MultiCurrencyMoneyOpenApi totalLinkInvoiceAmt;

	/** 
	 * 应收开票时，总的可开票金额
	 */
	@ApiField("total_receivable_inv_amt")
	private MultiCurrencyMoneyOpenApi totalReceivableInvAmt;

	/** 
	 * 按应收开票模式下，已开票总金额
	 */
	@ApiField("total_receivable_inved_amt")
	private MultiCurrencyMoneyOpenApi totalReceivableInvedAmt;

	/** 
	 * 按应收开票模式下，已关联票总金额
	 */
	@ApiField("total_receivable_link_inv_amt")
	private MultiCurrencyMoneyOpenApi totalReceivableLinkInvAmt;

	/** 
	 * 按实收开票模式下，总的可开票金额
	 */
	@ApiField("total_writeoff_inv_amt")
	private MultiCurrencyMoneyOpenApi totalWriteoffInvAmt;

	/** 
	 * 按实收开票模式下，已开票金额
	 */
	@ApiField("total_writeoff_inved_amt")
	private MultiCurrencyMoneyOpenApi totalWriteoffInvedAmt;

	/** 
	 * 按实收开票模式，已关联票总金额
	 */
	@ApiField("total_writeoff_link_inv_amt")
	private MultiCurrencyMoneyOpenApi totalWriteoffLinkInvAmt;

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

	public void setTotalReceivableInvAmt(MultiCurrencyMoneyOpenApi totalReceivableInvAmt) {
		this.totalReceivableInvAmt = totalReceivableInvAmt;
	}
	public MultiCurrencyMoneyOpenApi getTotalReceivableInvAmt( ) {
		return this.totalReceivableInvAmt;
	}

	public void setTotalReceivableInvedAmt(MultiCurrencyMoneyOpenApi totalReceivableInvedAmt) {
		this.totalReceivableInvedAmt = totalReceivableInvedAmt;
	}
	public MultiCurrencyMoneyOpenApi getTotalReceivableInvedAmt( ) {
		return this.totalReceivableInvedAmt;
	}

	public void setTotalReceivableLinkInvAmt(MultiCurrencyMoneyOpenApi totalReceivableLinkInvAmt) {
		this.totalReceivableLinkInvAmt = totalReceivableLinkInvAmt;
	}
	public MultiCurrencyMoneyOpenApi getTotalReceivableLinkInvAmt( ) {
		return this.totalReceivableLinkInvAmt;
	}

	public void setTotalWriteoffInvAmt(MultiCurrencyMoneyOpenApi totalWriteoffInvAmt) {
		this.totalWriteoffInvAmt = totalWriteoffInvAmt;
	}
	public MultiCurrencyMoneyOpenApi getTotalWriteoffInvAmt( ) {
		return this.totalWriteoffInvAmt;
	}

	public void setTotalWriteoffInvedAmt(MultiCurrencyMoneyOpenApi totalWriteoffInvedAmt) {
		this.totalWriteoffInvedAmt = totalWriteoffInvedAmt;
	}
	public MultiCurrencyMoneyOpenApi getTotalWriteoffInvedAmt( ) {
		return this.totalWriteoffInvedAmt;
	}

	public void setTotalWriteoffLinkInvAmt(MultiCurrencyMoneyOpenApi totalWriteoffLinkInvAmt) {
		this.totalWriteoffLinkInvAmt = totalWriteoffLinkInvAmt;
	}
	public MultiCurrencyMoneyOpenApi getTotalWriteoffLinkInvAmt( ) {
		return this.totalWriteoffLinkInvAmt;
	}

}
