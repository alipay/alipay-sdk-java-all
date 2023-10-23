package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.auth.agreement.close response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 18:36:49
 */
public class AlipayPcreditHuabeiAuthAgreementCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1732616589935981298L;

	/** 
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
