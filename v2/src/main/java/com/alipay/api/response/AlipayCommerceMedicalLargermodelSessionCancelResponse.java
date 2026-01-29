package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.largermodel.session.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-08 10:11:23
 */
public class AlipayCommerceMedicalLargermodelSessionCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6884838267933271216L;

	/** 
	 * SUCCESS：成功
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

}
