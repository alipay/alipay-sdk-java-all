package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceQueryOpenModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.info.applyid.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-29 11:00:15
 */
public class AlipayEbppInvoiceInfoApplyidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7341993666453213663L;

	/** 
	 * 发票信息
	 */
	@ApiListField("invoice_info")
	@ApiField("invoice_query_open_model")
	private List<InvoiceQueryOpenModel> invoiceInfo;

	public void setInvoiceInfo(List<InvoiceQueryOpenModel> invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
	}
	public List<InvoiceQueryOpenModel> getInvoiceInfo( ) {
		return this.invoiceInfo;
	}

}
