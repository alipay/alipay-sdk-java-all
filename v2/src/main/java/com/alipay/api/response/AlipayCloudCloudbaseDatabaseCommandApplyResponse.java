package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.command.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-31 11:56:42
 */
public class AlipayCloudCloudbaseDatabaseCommandApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5585573181779631839L;

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
