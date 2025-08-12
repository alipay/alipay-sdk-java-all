package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务订单支付接口
 *
 * @author auto create
 * @since 1.0, 2024-09-05 20:45:42
 */
public class AlipayMerchantOrderPayModel extends AlipayObject {

	private static final long serialVersionUID = 4726763917612574187L;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 相关支付渠道
	 */
	@ApiField("payment_biz_type")
	private String paymentBizType;

	/**
	 * 如果使用支付宝支付就传入支付宝支付单号
	 */
	@ApiField("related_payment_no")
	private String relatedPaymentNo;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPaymentBizType() {
		return this.paymentBizType;
	}
	public void setPaymentBizType(String paymentBizType) {
		this.paymentBizType = paymentBizType;
	}

	public String getRelatedPaymentNo() {
		return this.relatedPaymentNo;
	}
	public void setRelatedPaymentNo(String relatedPaymentNo) {
		this.relatedPaymentNo = relatedPaymentNo;
	}

}
