package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.outputinvoice.redinvoice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-06 11:16:49
 */
public class AlipayBossFncOutputinvoiceRedinvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2231382264849364933L;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果描述
	 */
	@ApiField("result_desp")
	private String resultDesp;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesp(String resultDesp) {
		this.resultDesp = resultDesp;
	}
	public String getResultDesp( ) {
		return this.resultDesp;
	}

}
