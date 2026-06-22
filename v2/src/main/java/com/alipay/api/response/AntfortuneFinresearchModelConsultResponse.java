package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.finresearch.model.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-06 00:06:33
 */
public class AntfortuneFinresearchModelConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3816171247383177173L;

	/** 
	 * 模型的返回结果
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
