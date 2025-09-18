package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.cert.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 17:12:39
 */
public class AlipayPcreditLoanHonorCertCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 8134513492466411743L;

	/** 
	 * 校验结果, true-一致, false-不一致
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
