package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.tradereceipt.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-01 13:45:24
 */
public class AlipayCommerceLogisticsFreightflowTradereceiptApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1171661744179389116L;

	/** 
	 * Base64加密
5分钟有效期，过期需换单重新申请。
	 */
	@ApiField("pdf_download_url")
	private String pdfDownloadUrl;

	public void setPdfDownloadUrl(String pdfDownloadUrl) {
		this.pdfDownloadUrl = pdfDownloadUrl;
	}
	public String getPdfDownloadUrl( ) {
		return this.pdfDownloadUrl;
	}

}
