package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易订单信息
 *
 * @author auto create
 * @since 1.0, 2017-09-07 21:01:00
 */
public class TradeInfo extends AlipayObject {

	private static final long serialVersionUID = 5452821346745913462L;

	/**
	 * 支付金额的币种，例如人民币为156
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * 收货地址
	 */
	@ApiField("delivery_address")
	private String deliveryAddress;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部订单标题
	 */
	@ApiField("out_order_title")
	private String outOrderTitle;

	/**
	 * 本次支付的金额，单位元
	 */
	@ApiField("pay_amt")
	private String payAmt;

	/**
	 * 分段支付所处的支付阶段，初始为1
	 */
	@ApiField("pay_step")
	private Long payStep;

	/**
	 * 付款方信息
	 */
	@ApiField("payer")
	private FactoringUser payer;

	/**
	 * 收款方信息
	 */
	@ApiField("seller")
	private FactoringUser seller;

	/**
	 * 发货地址
	 */
	@ApiField("ship_address")
	private String shipAddress;

	/**
	 * 订单金额，单位元，小数保留两位小数
	 */
	@ApiField("trade_amt")
	private String tradeAmt;

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getDeliveryAddress() {
		return this.deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutOrderTitle() {
		return this.outOrderTitle;
	}
	public void setOutOrderTitle(String outOrderTitle) {
		this.outOrderTitle = outOrderTitle;
	}

	public String getPayAmt() {
		return this.payAmt;
	}
	public void setPayAmt(String payAmt) {
		this.payAmt = payAmt;
	}

	public Long getPayStep() {
		return this.payStep;
	}
	public void setPayStep(Long payStep) {
		this.payStep = payStep;
	}

	public FactoringUser getPayer() {
		return this.payer;
	}
	public void setPayer(FactoringUser payer) {
		this.payer = payer;
	}

	public FactoringUser getSeller() {
		return this.seller;
	}
	public void setSeller(FactoringUser seller) {
		this.seller = seller;
	}

	public String getShipAddress() {
		return this.shipAddress;
	}
	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}

	public String getTradeAmt() {
		return this.tradeAmt;
	}
	public void setTradeAmt(String tradeAmt) {
		this.tradeAmt = tradeAmt;
	}

}
