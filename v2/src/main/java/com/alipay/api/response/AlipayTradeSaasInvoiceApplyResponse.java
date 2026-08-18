package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.invoice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-14 20:02:47
 */
public class AlipayTradeSaasInvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2321868237614469982L;

	/** 
	 * 开票状态：
开票成功:SUCCESS
开票失败:FAILED
开票受理中:SUBMIT
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/** 
	 * saas平台发票申请单号，可以作为后续发票信息查询的依据
	 */
	@ApiField("saas_invoice_order_no")
	private String saasInvoiceOrderNo;

	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}
	public String getInvoiceStatus( ) {
		return this.invoiceStatus;
	}

	public void setSaasInvoiceOrderNo(String saasInvoiceOrderNo) {
		this.saasInvoiceOrderNo = saasInvoiceOrderNo;
	}
	public String getSaasInvoiceOrderNo( ) {
		return this.saasInvoiceOrderNo;
	}

}
