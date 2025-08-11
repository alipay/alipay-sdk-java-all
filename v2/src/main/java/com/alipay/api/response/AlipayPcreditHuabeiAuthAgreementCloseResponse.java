package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.auth.agreement.close response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-17 14:39:14
 */
public class AlipayPcreditHuabeiAuthAgreementCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 3147469898222128218L;

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
