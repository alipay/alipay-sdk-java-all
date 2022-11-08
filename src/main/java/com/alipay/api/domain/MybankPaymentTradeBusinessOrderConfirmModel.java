package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商银行交易确认接口
 *
 * @author auto create
 * @since 1.0, 2022-02-09 11:02:37
 */
public class MybankPaymentTradeBusinessOrderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3877867759542795324L;

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

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}
