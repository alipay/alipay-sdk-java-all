package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * voyager支付撤销接口
 *
 * @author auto create
 * @since 1.0, 2026-06-25 11:09:58
 */
public class AlipayVoyagerPaymentsCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5894367338762911593L;

	/**
	 * voyager授权返回的openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付订单id
	 */
	@ApiField("pay_order_id")
	private String payOrderId;

	/**
	 * 支付单请求号，非必填
	 */
	@ApiField("payment_request_id")
	private String paymentRequestId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPayOrderId() {
		return this.payOrderId;
	}
	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}

	public String getPaymentRequestId() {
		return this.paymentRequestId;
	}
	public void setPaymentRequestId(String paymentRequestId) {
		this.paymentRequestId = paymentRequestId;
	}

}
