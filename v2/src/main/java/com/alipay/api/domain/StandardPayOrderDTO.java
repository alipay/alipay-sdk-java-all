package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付订单
 *
 * @author auto create
 * @since 1.0, 2026-06-25 11:09:56
 */
public class StandardPayOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 2278381465845137986L;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 支付完成时间
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/**
	 * 授权id，cn这边和userId对应
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单状态，与响应类型保持一致，非枚举返回
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 支付单号
	 */
	@ApiField("pay_order_id")
	private String payOrderId;

	/**
	 * 支付金额
	 */
	@ApiField("payment_amount")
	private MultiCurrencyMoneyDTO paymentAmount;

	/**
	 * 支付请求单号
	 */
	@ApiField("payment_request_id")
	private String paymentRequestId;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPayOrderId() {
		return this.payOrderId;
	}
	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}

	public MultiCurrencyMoneyDTO getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(MultiCurrencyMoneyDTO paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentRequestId() {
		return this.paymentRequestId;
	}
	public void setPaymentRequestId(String paymentRequestId) {
		this.paymentRequestId = paymentRequestId;
	}

}
