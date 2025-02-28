package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.insurance.instancerule.save response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-29 15:13:02
 */
public class DatadigitalFincloudFinsaasInsuranceInstanceruleSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 2545612943187544511L;

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
