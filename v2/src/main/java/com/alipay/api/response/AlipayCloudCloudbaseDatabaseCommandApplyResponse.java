package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.command.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 09:21:43
 */
public class AlipayCloudCloudbaseDatabaseCommandApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6756579365417384854L;

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
