package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.tasktemplate.publish response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:51:43
 */
public class AlipayCommerceCommonTasktemplatePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 5827943796851164599L;

	/** 
	 * 任务模板发布结果
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
