package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.tasktemplate.stop response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-30 19:06:55
 */
public class AlipayCommerceCommonTasktemplateStopResponse extends AlipayResponse {

	private static final long serialVersionUID = 8183451135227148185L;

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
