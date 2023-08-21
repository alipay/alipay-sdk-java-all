package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.command.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-17 14:41:42
 */
public class AlipayCloudCloudbaseDatabaseCommandApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3666438912858311379L;

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
