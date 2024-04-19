package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.alarmrule.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-11 09:47:01
 */
public class AlipayCloudCloudbaseMonitorAlarmruleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3142564217534985797L;

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
