package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.command.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 10:32:37
 */
public class AlipayCommerceTransportEtcCommandSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1392584197139599388L;

	/** 
	 * SUCCESS：订单申请成功； FAIL:申请失败
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 其他业务异常信息描述
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
