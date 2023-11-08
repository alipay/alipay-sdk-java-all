package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.command.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-02 21:41:49
 */
public class AlipayCloudCloudbaseDatabaseCommandApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8281858665343163133L;

	/** 
	 * 执行结果，JSON格式
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
