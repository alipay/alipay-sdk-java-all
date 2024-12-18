package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.alarmrule.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 09:21:24
 */
public class AlipayCloudCloudbaseMonitorAlarmruleDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4434643452734743261L;

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
