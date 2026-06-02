package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.traderecon.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-26 14:17:43
 */
public class AlipayCommerceLogisticsFreightflowTradereconApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5841463111786922997L;

	/** 
	 * 对账文件下载链接(五分钟有效期)
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/** 
	 * 账单日期，格式为yyyyMMdd
	 */
	@ApiField("result_date")
	private String resultDate;

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getDownloadUrl( ) {
		return this.downloadUrl;
	}

	public void setResultDate(String resultDate) {
		this.resultDate = resultDate;
	}
	public String getResultDate( ) {
		return this.resultDate;
	}

}
