package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.apply.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-19 20:07:35
 */
public class MybankCreditLoantradeGuarletterApplyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1517471298685516459L;

	/** 
	 * 受理单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

}
