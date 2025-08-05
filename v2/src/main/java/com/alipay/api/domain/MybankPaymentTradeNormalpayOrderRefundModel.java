package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 普通支付订单退款
 *
 * @author auto create
 * @since 1.0, 2023-03-08 17:32:35
 */
public class MybankPaymentTradeNormalpayOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 6194652763755785358L;

	/**
	 * 金额，单位：分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 币种，156=人民币
	 */
	@ApiField("currency_value")
	private String currencyValue;

	/**
	 * 网商订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单类型，GUARANTEE_PAY=担保支付，NORMAL_PAY=通用支付
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 退款类型，REFUND=通用退款
	 */
	@ApiField("refund_type")
	private String refundType;

	/**
	 * 退款备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 请求流水号，表示外部一次退款请求，控重字段。
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 请求时间，格式是yyyyMMddHHmmss
	 */
	@ApiField("request_time")
	private String requestTime;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrencyValue() {
		return this.currencyValue;
	}
	public void setCurrencyValue(String currencyValue) {
		this.currencyValue = currencyValue;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getRefundType() {
		return this.refundType;
	}
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

}
