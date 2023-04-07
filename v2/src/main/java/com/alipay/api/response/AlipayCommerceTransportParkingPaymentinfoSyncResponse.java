package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.parking.paymentinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 11:31:52
 */
public class AlipayCommerceTransportParkingPaymentinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8373785627177684378L;

	/** 
	 * 具体错误码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 具体错误原因
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setBizMsg(String bizMsg) {
		this.bizMsg = bizMsg;
	}
	public String getBizMsg( ) {
		return this.bizMsg;
	}

}
