package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MedicalOnlineCreateAndPayInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.payment.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-27 16:02:12
 */
public class AlipayCommerceMedicalPaymentCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 7795875616188132811L;

	/** 
	 * 国家医保局线上业务下单信息
	 */
	@ApiField("data")
	private MedicalOnlineCreateAndPayInfo data;

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

	public void setData(MedicalOnlineCreateAndPayInfo data) {
		this.data = data;
	}
	public MedicalOnlineCreateAndPayInfo getData( ) {
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
