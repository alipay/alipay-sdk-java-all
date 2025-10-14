package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.trafficconfig.set response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:39
 */
public class AlipayCloudCloudbaseFunctionTrafficconfigSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6621774826447733694L;

	/** 
	 * 设置流量分配配置结果
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
