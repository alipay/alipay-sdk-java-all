package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.alarmsubscribe.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-11 09:47:00
 */
public class AlipayCloudCloudbaseMonitorAlarmsubscribeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5273716133413256526L;

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
