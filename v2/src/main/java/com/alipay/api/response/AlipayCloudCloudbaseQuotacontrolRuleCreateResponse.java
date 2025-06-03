package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.quotacontrol.rule.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-10 17:06:45
 */
public class AlipayCloudCloudbaseQuotacontrolRuleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7193283218285414549L;

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
