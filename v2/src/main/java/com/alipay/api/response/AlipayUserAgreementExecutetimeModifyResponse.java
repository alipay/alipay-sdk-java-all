package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.executetime.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-28 17:42:57
 */
public class AlipayUserAgreementExecutetimeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6312949885292635682L;

	/** 
	 * 返回修改后的执行时间。单位：天。
	 */
	@ApiField("execute_time")
	private String executeTime;

	public void setExecuteTime(String executeTime) {
		this.executeTime = executeTime;
	}
	public String getExecuteTime( ) {
		return this.executeTime;
	}

}
