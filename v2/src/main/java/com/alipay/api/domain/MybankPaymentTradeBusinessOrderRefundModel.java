package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商银行订单退款接口
 *
 * @author auto create
 * @since 1.0, 2023-01-05 15:04:54
 */
public class MybankPaymentTradeBusinessOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 3586393773884369948L;

	/**
	 * 金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 币种，不传默认CNY
	 */
	@ApiField("currency_value")
	private String currencyValue;

	/**
	 * 创建订单时返回的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 退款类型
REFUND（售中退款）
POST_REFUND (售后退款)
不传默认用REFUND
	 */
	@ApiField("refund_type")
	private String refundType;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 请求流水号，表示外部一次请求，幂等字段
	 */
	@ApiField("request_no")
	private String requestNo;

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

}
