package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MedicalHospitalOrderUploadResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hospitalorder.upload response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-23 15:31:38
 */
public class AlipayCommerceMedicalHospitalorderUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8493953753265441493L;

	/** 
	 * 医疗机构医院订单上传结果
	 */
	@ApiField("data")
	private MedicalHospitalOrderUploadResult data;

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

	public void setData(MedicalHospitalOrderUploadResult data) {
		this.data = data;
	}
	public MedicalHospitalOrderUploadResult getData( ) {
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
