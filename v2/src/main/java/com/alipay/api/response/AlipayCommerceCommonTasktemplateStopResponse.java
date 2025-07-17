package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.tasktemplate.stop response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 10:03:49
 */
public class AlipayCommerceCommonTasktemplateStopResponse extends AlipayResponse {

	private static final long serialVersionUID = 4363793666669316317L;

	/** 
	 * 任务模板终止结果
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
