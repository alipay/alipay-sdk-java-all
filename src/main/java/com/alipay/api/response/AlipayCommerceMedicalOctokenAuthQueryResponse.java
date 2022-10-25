package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MedicalOnlinePayAuthInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.octoken.auth.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-21 23:05:05
 */
public class AlipayCommerceMedicalOctokenAuthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1727441159523873715L;

	/** 
	 * 医保电子凭证线上支付授权信息
	 */
	@ApiField("data")
	private MedicalOnlinePayAuthInfo data;

	/** 
	 * 业务错误描述
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 业务结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setData(MedicalOnlinePayAuthInfo data) {
		this.data = data;
	}
	public MedicalOnlinePayAuthInfo getData( ) {
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
