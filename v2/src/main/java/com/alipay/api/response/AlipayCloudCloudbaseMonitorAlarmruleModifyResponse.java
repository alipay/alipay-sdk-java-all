package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.alarmrule.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-06 17:07:02
 */
public class AlipayCloudCloudbaseMonitorAlarmruleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6441754248935498525L;

	/** 
	 * 更新结果
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
