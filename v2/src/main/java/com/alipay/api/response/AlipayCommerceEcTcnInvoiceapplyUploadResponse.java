package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.tcn.invoiceapply.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:06:42
 */
public class AlipayCommerceEcTcnInvoiceapplyUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1373111935746817564L;

	/** 
	 * 申请ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/** 
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}
	public String getInvoiceCode( ) {
		return this.invoiceCode;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getInvoiceNo( ) {
		return this.invoiceNo;
	}

}
