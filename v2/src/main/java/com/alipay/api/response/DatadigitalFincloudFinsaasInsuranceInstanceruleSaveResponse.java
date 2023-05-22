package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.insurance.instancerule.save response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-18 19:56:48
 */
public class DatadigitalFincloudFinsaasInsuranceInstanceruleSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 7775915381818918726L;

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
