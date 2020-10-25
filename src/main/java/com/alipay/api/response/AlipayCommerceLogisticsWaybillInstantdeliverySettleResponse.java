package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.waybill.instantdelivery.settle response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-26 22:35:12
 */
public class AlipayCommerceLogisticsWaybillInstantdeliverySettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 2531317918815319112L;

	/** 
	 * 即时配送公司返回的错误码
	 */
	@ApiField("third_error_code")
	private String thirdErrorCode;

	/** 
	 * 即时配送公司返回的错误描述
	 */
	@ApiField("third_error_msg")
	private String thirdErrorMsg;

	public void setThirdErrorCode(String thirdErrorCode) {
		this.thirdErrorCode = thirdErrorCode;
	}
	public String getThirdErrorCode( ) {
		return this.thirdErrorCode;
	}

	public void setThirdErrorMsg(String thirdErrorMsg) {
		this.thirdErrorMsg = thirdErrorMsg;
	}
	public String getThirdErrorMsg( ) {
		return this.thirdErrorMsg;
	}

}
