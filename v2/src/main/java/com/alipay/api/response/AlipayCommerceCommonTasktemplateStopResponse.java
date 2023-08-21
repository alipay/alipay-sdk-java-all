package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.tasktemplate.stop response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:46:43
 */
public class AlipayCommerceCommonTasktemplateStopResponse extends AlipayResponse {

	private static final long serialVersionUID = 8466652291429869698L;

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
