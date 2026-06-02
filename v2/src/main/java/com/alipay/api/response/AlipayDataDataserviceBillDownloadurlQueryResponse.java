package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.bill.downloadurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 16:47:50
 */
public class AlipayDataDataserviceBillDownloadurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4621772641781578239L;

	/** 
	 * 当账单可获取时，返回账单下载地址链接，获取链接后30秒后未下载，链接地址失效。
	 */
	@ApiField("bill_download_url")
	private String billDownloadUrl;

	/** 
	 * 描述本次申请的账单文件状态。
EMPTY_DATA_WITH_BILL_FILE：当天无账单业务数据&&可以获取到空数据账单文件。
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
