package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.antiflood.rule.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:37
 */
public class AlipayCloudCloudbaseAntifloodRuleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8718239576123771788L;

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
