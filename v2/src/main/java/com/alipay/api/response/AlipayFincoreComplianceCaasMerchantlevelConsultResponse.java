package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.caas.merchantlevel.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:22:20
 */
public class AlipayFincoreComplianceCaasMerchantlevelConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2749615778492135832L;

	/** 
	 * 返回结果码
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
