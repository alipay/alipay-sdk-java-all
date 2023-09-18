package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MedicalNationalPayAuthInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.authinfo.auth.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 02:16:43
 */
public class AlipayCommerceMedicalAuthinfoAuthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1223216844578116476L;

	/** 
	 * 国家医保局线上业务身份核验授权信息
	 */
	@ApiField("data")
	private MedicalNationalPayAuthInfo data;

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

	public void setData(MedicalNationalPayAuthInfo data) {
		this.data = data;
	}
	public MedicalNationalPayAuthInfo getData( ) {
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
