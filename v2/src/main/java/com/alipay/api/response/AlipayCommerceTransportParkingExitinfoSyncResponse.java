package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.parking.exitinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-12 17:32:06
 */
public class AlipayCommerceTransportParkingExitinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8442463516225935192L;

	/** 
	 * 具体错误码；
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
