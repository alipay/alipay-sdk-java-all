package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.alarmsubscribe.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-08 14:34:55
 */
public class AlipayCloudCloudbaseMonitorAlarmsubscribeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8533985747615717862L;

	/** 
	 * 报警规则订阅结果
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
