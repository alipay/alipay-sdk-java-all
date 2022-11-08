package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.info.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-31 10:11:37
 */
public class AlipayCommerceTransportEtcInfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2568627668799914563L;

	/** 
	 * SUCCESS：成功； {FAIL}:{失败原因}
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 其他业务异常信息描述 ORDER_NOT_EXIST：订单不存在 ORDER_STATUS_ILLEGAL：订单状态非法
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
