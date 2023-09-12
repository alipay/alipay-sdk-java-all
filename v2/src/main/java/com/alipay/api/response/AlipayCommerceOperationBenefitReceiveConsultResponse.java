package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.benefit.receive.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:56:43
 */
public class AlipayCommerceOperationBenefitReceiveConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2187139776438546127L;

	/** 
	 * 咨询结果，true表示通过，false不通过
	 */
	@ApiField("result")
	private Boolean result;

	/** 
	 * 咨询结果
	 */
	@ApiField("result_desc")
	private String resultDesc;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

}
