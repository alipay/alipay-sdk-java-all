package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.antiflood.rule.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-14 17:41:45
 */
public class AlipayCloudCloudbaseAntifloodRuleDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8768386921489868783L;

	/** 
	 * 删除结果
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
