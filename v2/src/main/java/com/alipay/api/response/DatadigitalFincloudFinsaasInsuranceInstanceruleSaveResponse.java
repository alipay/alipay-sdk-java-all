package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.insurance.instancerule.save response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:41:53
 */
public class DatadigitalFincloudFinsaasInsuranceInstanceruleSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 7279668255742363942L;

	/** 
	 * 规则保存结果
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
