package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.alarmrule.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-08 14:32:17
 */
public class AlipayCloudCloudbaseMonitorAlarmruleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1634273496629524764L;

	/** 
	 * 告警规则ID
	 */
	@ApiField("id")
	private String id;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}
