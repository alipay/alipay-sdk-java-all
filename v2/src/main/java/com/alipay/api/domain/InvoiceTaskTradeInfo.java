package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票关联交易信息
 *
 * @author auto create
 * @since 1.0, 2024-01-23 16:43:37
 */
public class InvoiceTaskTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 8256511729223164719L;

	/**
	 * 应回票金额，以元为单位
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 交易金额，以元为单位
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易时间
	 */
	@ApiField("trade_time")
	private String tradeTime;

	/**
	 * 交易类型
支付：PAYMENT
退款：REFUND
	 */
	@ApiField("trade_type")
	private String tradeType;

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
