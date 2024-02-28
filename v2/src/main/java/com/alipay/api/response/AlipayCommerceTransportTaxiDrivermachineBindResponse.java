package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.drivermachine.bind response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:04:45
 */
public class AlipayCommerceTransportTaxiDrivermachineBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 3538485876888354353L;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果描述
	 */
	@ApiField("result_message")
	private String resultMessage;

	/** 
	 * 结果
	 */
	@ApiField("status")
	private Boolean status;

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

	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getStatus( ) {
		return this.status;
	}

}
