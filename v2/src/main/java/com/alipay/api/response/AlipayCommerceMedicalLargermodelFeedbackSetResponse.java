package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.largermodel.feedback.set response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-01 20:52:03
 */
public class AlipayCommerceMedicalLargermodelFeedbackSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8893629733873277598L;

	/** 
	 * 是否业务处理成功
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
