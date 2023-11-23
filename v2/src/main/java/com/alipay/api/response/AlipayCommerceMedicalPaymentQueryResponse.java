package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MedicalPaymentQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.payment.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:56:09
 */
public class AlipayCommerceMedicalPaymentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1699861221183426421L;

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

	/** 
	 * 医保支付订单查询信息
	 */
	@ApiField("result_data")
	private MedicalPaymentQueryResponse resultData;

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

	public void setResultData(MedicalPaymentQueryResponse resultData) {
		this.resultData = resultData;
	}
	public MedicalPaymentQueryResponse getResultData( ) {
		return this.resultData;
	}

}
