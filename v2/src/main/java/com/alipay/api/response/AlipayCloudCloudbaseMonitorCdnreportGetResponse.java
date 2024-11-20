package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.cdnreport.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-20 14:22:01
 */
public class AlipayCloudCloudbaseMonitorCdnreportGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6682111649257174993L;

	/** 
	 * 报表数据
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
