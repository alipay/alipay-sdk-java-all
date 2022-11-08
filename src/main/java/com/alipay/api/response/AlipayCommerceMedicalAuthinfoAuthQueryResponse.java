package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MedicalNationalPayAuthInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.authinfo.auth.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-08 09:03:57
 */
public class AlipayCommerceMedicalAuthinfoAuthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2718346666793346368L;

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
