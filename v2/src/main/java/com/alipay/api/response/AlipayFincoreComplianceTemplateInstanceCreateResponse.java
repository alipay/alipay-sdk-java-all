package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.instance.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 15:56:14
 */
public class AlipayFincoreComplianceTemplateInstanceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5335155783161639436L;

	/** 
	 * 模版业务实例id
	 */
	@ApiField("biz_instance_id")
	private String bizInstanceId;

	public void setBizInstanceId(String bizInstanceId) {
		this.bizInstanceId = bizInstanceId;
	}
	public String getBizInstanceId( ) {
		return this.bizInstanceId;
	}

}
