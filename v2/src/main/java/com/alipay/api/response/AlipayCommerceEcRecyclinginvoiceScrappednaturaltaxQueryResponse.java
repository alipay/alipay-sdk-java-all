package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NatrualPersonInvoiceAmountMonthly;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.scrappednaturaltax.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-27 18:00:53
 */
public class AlipayCommerceEcRecyclinginvoiceScrappednaturaltaxQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3335215796119244622L;

	/** 
	 * 自然人开票信息列表
	 */
	@ApiListField("invoice_amount_list")
	@ApiField("natrual_person_invoice_amount_monthly")
	private List<NatrualPersonInvoiceAmountMonthly> invoiceAmountList;

	public void setInvoiceAmountList(List<NatrualPersonInvoiceAmountMonthly> invoiceAmountList) {
		this.invoiceAmountList = invoiceAmountList;
	}
	public List<NatrualPersonInvoiceAmountMonthly> getInvoiceAmountList( ) {
		return this.invoiceAmountList;
	}

}
