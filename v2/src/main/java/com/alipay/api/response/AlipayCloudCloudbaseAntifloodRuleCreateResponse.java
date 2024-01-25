package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.antiflood.rule.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-14 17:46:45
 */
public class AlipayCloudCloudbaseAntifloodRuleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4691163748453947744L;

	/** 
	 * 创建结果
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
