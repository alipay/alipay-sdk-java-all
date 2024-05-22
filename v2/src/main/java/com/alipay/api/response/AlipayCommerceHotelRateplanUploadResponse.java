package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.hotel.rateplan.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-20 14:30:15
 */
public class AlipayCommerceHotelRateplanUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1184583745184794729L;

	/** 
	 * 是否成功
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 返回信息
	 */
	@ApiField("result_message")
	private String resultMessage;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultMessage( ) {
		return this.resultMessage;
	}

}
