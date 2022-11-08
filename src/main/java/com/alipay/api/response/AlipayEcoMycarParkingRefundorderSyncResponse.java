package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.refundorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-19 10:33:33
 */
public class AlipayEcoMycarParkingRefundorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5462799164921227569L;

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
