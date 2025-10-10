package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.parking.feedback.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-17 15:27:32
 */
public class AlipayCommerceTransportParkingFeedbackSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5385178892996266486L;

	/** 
	 * 具体错误原因编码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 具体错误描述
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
