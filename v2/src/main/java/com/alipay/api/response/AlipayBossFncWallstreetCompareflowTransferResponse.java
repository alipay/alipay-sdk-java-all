package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.wallstreet.compareflow.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-08 14:06:43
 */
public class AlipayBossFncWallstreetCompareflowTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 8277713563627539459L;

	/** 
	 * 转发成功与否
	 */
	@ApiField("system_success")
	private String systemSuccess;

	public void setSystemSuccess(String systemSuccess) {
		this.systemSuccess = systemSuccess;
	}
	public String getSystemSuccess( ) {
		return this.systemSuccess;
	}

}
