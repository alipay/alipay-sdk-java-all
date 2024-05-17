package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.cdnreport.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-16 10:02:00
 */
public class AlipayCloudCloudbaseMonitorCdnreportGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7647775472713182116L;

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
