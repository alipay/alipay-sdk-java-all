package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.task.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 23:41:39
 */
public class AlipayCloudCloudbaseDatabaseTaskApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8858595313262175191L;

	/** 
	 * 开始执行任务结果
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
