package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MedicalCardInfoList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.card.auth.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-10 15:16:33
 */
public class AlipayCommerceMedicalCardAuthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2366416148592931199L;

	/** 
	 * 医保电子凭证或电子社保卡信息
	 */
	@ApiField("data")
	private MedicalCardInfoList data;

	/** 
	 * 接口错误描述
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 业务错误码
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setData(MedicalCardInfoList data) {
		this.data = data;
	}
	public MedicalCardInfoList getData( ) {
		return this.data;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
