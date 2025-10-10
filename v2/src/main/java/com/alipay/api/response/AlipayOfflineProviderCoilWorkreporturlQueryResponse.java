package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.coil.workreporturl.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-26 17:18:49
 */
public class AlipayOfflineProviderCoilWorkreporturlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2635154633292526765L;

	/** 
	 * 报表文件对应的日期，值同请求传参中的report_date字段
	 */
	@ApiField("report_date")
	private String reportDate;

	/** 
	 * 报表文件下载链接
	 */
	@ApiField("report_file_url")
	private String reportFileUrl;

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}
	public String getReportDate( ) {
		return this.reportDate;
	}

	public void setReportFileUrl(String reportFileUrl) {
		this.reportFileUrl = reportFileUrl;
	}
	public String getReportFileUrl( ) {
		return this.reportFileUrl;
	}

}
