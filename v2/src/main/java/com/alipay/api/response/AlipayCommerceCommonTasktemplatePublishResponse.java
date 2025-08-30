package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.tasktemplate.publish response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 10:03:49
 */
public class AlipayCommerceCommonTasktemplatePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 6342277714266244469L;

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
