package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceCompanyInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.company.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:09:14
 */
public class AlipayEbppInvoiceCompanyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2622795314199183475L;

	/** 
	 * 企业税务信息
	 */
	@ApiField("invoice_company")
	private InvoiceCompanyInfo invoiceCompany;

	/** 
	 * 支付宝商户ID。当业务前台走支付宝开票系统时，会返回该字段。
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 入驻工单ID
	 */
	@ApiField("register_id")
	private String registerId;

	public void setInvoiceCompany(InvoiceCompanyInfo invoiceCompany) {
		this.invoiceCompany = invoiceCompany;
	}
	public InvoiceCompanyInfo getInvoiceCompany( ) {
		return this.invoiceCompany;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}
	public String getRegisterId( ) {
		return this.registerId;
	}

}
