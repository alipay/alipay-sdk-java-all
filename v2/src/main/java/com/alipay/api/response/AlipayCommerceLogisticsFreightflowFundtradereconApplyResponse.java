package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.fundtraderecon.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-28 17:02:27
 */
public class AlipayCommerceLogisticsFreightflowFundtradereconApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8481425597891644316L;

	/** 
	 * 同入参
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 对账文件下载链接(五分钟有效期)
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/** 
	 * 同入参
	 */
	@ApiField("query_date")
	private String queryDate;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getDownloadUrl( ) {
		return this.downloadUrl;
	}

	public void setQueryDate(String queryDate) {
		this.queryDate = queryDate;
	}
	public String getQueryDate( ) {
		return this.queryDate;
	}

}
