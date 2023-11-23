package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.task.retry response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-18 14:13:00
 */
public class AlipayCloudCloudbaseDatabaseTaskRetryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8765254962354291184L;

	/** 
	 * 云数据库重试任务执行结果
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
