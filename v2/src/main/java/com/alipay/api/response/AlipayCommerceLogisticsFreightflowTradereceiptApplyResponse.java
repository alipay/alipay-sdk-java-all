package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.tradereceipt.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-12 10:07:49
 */
public class AlipayCommerceLogisticsFreightflowTradereceiptApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5881385696145115594L;

	/** 
	 * Base64加密
5分钟有效期，过期需换单重新申请。
	 */
	@ApiField("pdf_download_url")
	private String pdfDownloadUrl;

	/** 
	 * 电子回单下载的文件是否已生成
	 */
	@ApiField("status")
	private String status;

	public void setPdfDownloadUrl(String pdfDownloadUrl) {
		this.pdfDownloadUrl = pdfDownloadUrl;
	}
	public String getPdfDownloadUrl( ) {
		return this.pdfDownloadUrl;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
