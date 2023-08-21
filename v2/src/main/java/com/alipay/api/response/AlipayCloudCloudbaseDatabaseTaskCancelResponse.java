package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.task.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-18 14:12:39
 */
public class AlipayCloudCloudbaseDatabaseTaskCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 1743263733831234669L;

	/** 
	 * 取消任务执行结果
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
