package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.alarmrule.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-11 09:47:01
 */
public class AlipayCloudCloudbaseMonitorAlarmruleDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 7719469714542364299L;

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
