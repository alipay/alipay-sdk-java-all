package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.config.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-25 11:17:00
 */
public class AlipayCloudCloudbaseFunctionConfigModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2225652972414771686L;

	/** 
	 * 修改结果
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
