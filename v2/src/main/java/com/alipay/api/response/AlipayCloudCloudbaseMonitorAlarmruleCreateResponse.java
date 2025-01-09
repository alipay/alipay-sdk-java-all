package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.alarmrule.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-05 17:37:03
 */
public class AlipayCloudCloudbaseMonitorAlarmruleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8648542649328658678L;

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
