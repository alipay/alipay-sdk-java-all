package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.instance.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-13 15:02:25
 */
public class AlipayFincoreComplianceTemplateInstanceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2175391487395481623L;

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
