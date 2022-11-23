package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.ebpp.billkey.deduct.upgrade response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-18 13:51:37
 */
public class AlipayEbppEbppBillkeyDeductUpgradeResponse extends AlipayResponse {

	private static final long serialVersionUID = 8275787533761272529L;

	/** 
	 * 提交成功or失败
	 */
	@ApiField("submit_res")
	private Boolean submitRes;

	public void setSubmitRes(Boolean submitRes) {
		this.submitRes = submitRes;
	}
	public Boolean getSubmitRes( ) {
		return this.submitRes;
	}

}
