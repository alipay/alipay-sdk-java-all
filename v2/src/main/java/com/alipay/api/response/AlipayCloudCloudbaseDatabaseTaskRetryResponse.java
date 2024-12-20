package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.task.retry response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:42
 */
public class AlipayCloudCloudbaseDatabaseTaskRetryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2459232915193556548L;

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
