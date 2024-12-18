package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.orderbill.download response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-23 11:07:31
 */
public class AlipayOpenMiniOrderOrderbillDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8528967299168354943L;

	/** 
	 * 账单下载地址链接，获取连接后30秒后未下载，链接地址失效。
	 */
	@ApiField("bill_download_url")
	private String billDownloadUrl;

	/** 
	 * 描述本次申请的账单文件状态
	 */
	@ApiField("bill_file_code")
	private String billFileCode;

	public void setBillDownloadUrl(String billDownloadUrl) {
		this.billDownloadUrl = billDownloadUrl;
	}
	public String getBillDownloadUrl( ) {
		return this.billDownloadUrl;
	}

	public void setBillFileCode(String billFileCode) {
		this.billFileCode = billFileCode;
	}
	public String getBillFileCode( ) {
		return this.billFileCode;
	}

}
