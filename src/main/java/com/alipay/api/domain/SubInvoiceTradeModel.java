package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子交易渠道订单信息
 *
 * @author auto create
 * @since 1.0, 2019-07-29 10:58:09
 */
public class SubInvoiceTradeModel extends AlipayObject {

	private static final long serialVersionUID = 7844451563576257546L;

	/**
	 * 子订单交易渠道
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 子订单金额
	 */
	@ApiField("sub_invoice_amount")
	private String subInvoiceAmount;

	/**
	 * 子订单号
	 */
	@ApiField("sub_trade_no")
	private String subTradeNo;

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getSubInvoiceAmount() {
		return this.subInvoiceAmount;
	}
	public void setSubInvoiceAmount(String subInvoiceAmount) {
		this.subInvoiceAmount = subInvoiceAmount;
	}

	public String getSubTradeNo() {
		return this.subTradeNo;
	}
	public void setSubTradeNo(String subTradeNo) {
		this.subTradeNo = subTradeNo;
	}

}
