package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.applyorder.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-24 21:37:03
 */
public class AlipayCommerceTransportEtcApplyorderCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2563432293778216368L;

	/** 
	 * 支付宝ETC申请单号
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/** 
	 * SUCCESS:成功;FAIL:失败原因
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 其他业务异常信息描述
ORDER_NOT_EXIST:订单不存在 ORDER_STATUS_ILLEGAL:订单状态非法
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}
	public String getAlipayOrderId( ) {
		return this.alipayOrderId;
	}

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
