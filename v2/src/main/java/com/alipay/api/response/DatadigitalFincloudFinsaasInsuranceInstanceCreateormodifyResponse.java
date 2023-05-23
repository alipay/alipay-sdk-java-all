package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.insurance.instance.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-18 19:56:49
 */
public class DatadigitalFincloudFinsaasInsuranceInstanceCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8217765115935471497L;

	/** 
	 * result_code不唯一，表示服务指令的执行结果
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
