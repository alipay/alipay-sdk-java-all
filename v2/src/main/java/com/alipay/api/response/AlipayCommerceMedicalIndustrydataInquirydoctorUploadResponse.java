package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.inquirydoctor.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-25 15:34:49
 */
public class AlipayCommerceMedicalIndustrydataInquirydoctorUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4373793889394642416L;

	/** 
	 * 错误信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 结果码，数量不固定
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 时间戳
	 */
	@ApiField("time")
	private String time;

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

	public void setTime(String time) {
		this.time = time;
	}
	public String getTime( ) {
		return this.time;
	}

}
