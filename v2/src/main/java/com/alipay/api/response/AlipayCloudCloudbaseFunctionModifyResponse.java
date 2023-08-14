package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 22:46:42
 */
public class AlipayCloudCloudbaseFunctionModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4545328398997892846L;

	/** 
	 * 修改函数结果
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
