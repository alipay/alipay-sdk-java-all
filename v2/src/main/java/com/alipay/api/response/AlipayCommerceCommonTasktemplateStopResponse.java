package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.tasktemplate.stop response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-06 14:47:01
 */
public class AlipayCommerceCommonTasktemplateStopResponse extends AlipayResponse {

	private static final long serialVersionUID = 1487377458446825176L;

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
