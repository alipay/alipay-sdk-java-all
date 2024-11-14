package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.trafficconfig.set response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 22:46:41
 */
public class AlipayCloudCloudbaseFunctionTrafficconfigSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4177637921265811232L;

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
