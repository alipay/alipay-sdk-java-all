package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.quotacontrol.rule.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-20 16:16:43
 */
public class AlipayCloudCloudbaseQuotacontrolRuleDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5129239826642442191L;

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
