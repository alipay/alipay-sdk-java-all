package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * voyager支付查询接口
 *
 * @author auto create
 * @since 1.0, 2026-06-25 11:09:56
 */
public class AlipayVoyagerPaymentsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8775435267779797476L;

	/**
	 * 用户授权id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付单ID，由Antom分配（与payment_request_id二选一必填）
	 */
	@ApiField("pay_order_id")
	private String payOrderId;

	/**
	 * 支付请求ID，由商户分配（与pay_order_id二选一必填）
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
