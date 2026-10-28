package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.tripinvoice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-26 14:22:59
 */
public class AlipayCommerceTransportTaxiTripinvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6428477142966541419L;

	/** 
	 * 开票成功后回查开票申请返回的发票图片下载地址(展示用,不保证永久有效;回查未生成或失败时为空)
	 */
	@ApiField("img_file_url")
	private String imgFileUrl;

	/** 
	 * 必选	行业开票返回的发票标识
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/** 
	 * 开票成功后回查开票申请返回的发票 PDF 下载地址(展示用,不保证永久有效;回查未生成或失败时为空)
	 */
	@ApiField("pdf_file_url")
	private String pdfFileUrl;

	public void setImgFileUrl(String imgFileUrl) {
		this.imgFileUrl = imgFileUrl;
	}
	public String getImgFileUrl( ) {
		return this.imgFileUrl;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getInvoiceId( ) {
		return this.invoiceId;
	}

	public void setPdfFileUrl(String pdfFileUrl) {
		this.pdfFileUrl = pdfFileUrl;
	}
	public String getPdfFileUrl( ) {
		return this.pdfFileUrl;
	}

}
