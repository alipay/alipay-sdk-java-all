package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.billdownloadurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-03 11:52:51
 */
public class AlipayTradeSaasBilldownloadurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7814474777616175597L;

	/** 
	 * 请求对应的账单日期，格式为 yyyy-MM-dd。
	 */
	@ApiField("bill_date")
	private String billDate;

	/** 
	 * 请求对应的账单类型。
	 */
	@ApiField("bill_type")
	private String billType;

	/** 
	 * 账单文件的临时下载地址。下载地址存在有效期，请及时下载。
	 */
	@ApiField("download_url")
	private String downloadUrl;

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public String getBillDate( ) {
		return this.billDate;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}
	public String getBillType( ) {
		return this.billType;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getDownloadUrl( ) {
		return this.downloadUrl;
	}

}
