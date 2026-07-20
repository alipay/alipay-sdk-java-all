package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * voyager支付查询接口
 *
 * @author auto create
 * @since 1.0, 2026-07-14 14:57:52
 */
public class AlipayVoyagerPaymentsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4718418134682848623L;

	/**
	 * 用户授权Id
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

	/**
	 * 用户Id
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
