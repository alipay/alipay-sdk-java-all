package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.salary.electronicreceipt.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-06 11:27:28
 */
public class AlipayEbppIndustrySalaryElectronicreceiptQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4412462456861277168L;

	/** 
	 * 网商商户号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 外部流水号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 电子回单CDN下载链接，有时效限制，超时可重新查询
	 */
	@ApiField("pdf_download_url")
	private String pdfDownloadUrl;

	/** 
	 * 电子回单编号
	 */
	@ApiField("receipt_no")
	private String receiptNo;

	/** 
	 * 响应加签xml, base64编码
	 */
	@ApiField("sign_xml")
	private String signXml;

	/** 
	 * 回单状态
	 */
	@ApiField("status")
	private String status;

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId( ) {
		return this.merchantId;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setPdfDownloadUrl(String pdfDownloadUrl) {
		this.pdfDownloadUrl = pdfDownloadUrl;
	}
	public String getPdfDownloadUrl( ) {
		return this.pdfDownloadUrl;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}
	public String getReceiptNo( ) {
		return this.receiptNo;
	}

	public void setSignXml(String signXml) {
		this.signXml = signXml;
	}
	public String getSignXml( ) {
		return this.signXml;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
