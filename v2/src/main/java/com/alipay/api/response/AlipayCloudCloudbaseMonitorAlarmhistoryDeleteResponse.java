package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.alarmhistory.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 09:21:26
 */
public class AlipayCloudCloudbaseMonitorAlarmhistoryDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3577315812132195839L;

	/** 
	 * 删除结果
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
