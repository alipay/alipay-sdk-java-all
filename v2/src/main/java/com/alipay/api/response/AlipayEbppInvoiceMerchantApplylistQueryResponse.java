package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceApplyDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.merchant.applylist.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 17:31:46
 */
public class AlipayEbppInvoiceMerchantApplylistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8293767485382828751L;

	/** 
	 * 开票申请列表
	 */
	@ApiListField("invoice_apply_list")
	@ApiField("invoice_apply_d_t_o")
	private List<InvoiceApplyDTO> invoiceApplyList;

	public void setInvoiceApplyList(List<InvoiceApplyDTO> invoiceApplyList) {
		this.invoiceApplyList = invoiceApplyList;
	}
	public List<InvoiceApplyDTO> getInvoiceApplyList( ) {
		return this.invoiceApplyList;
	}

}
