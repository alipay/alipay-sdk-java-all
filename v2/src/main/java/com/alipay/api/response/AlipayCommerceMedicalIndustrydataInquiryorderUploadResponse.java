package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.inquiryorder.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-26 16:34:01
 */
public class AlipayCommerceMedicalIndustrydataInquiryorderUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8391642345126186135L;

	/** 
	 * 业务错误描述
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 支付宝行业侧订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 业务结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
