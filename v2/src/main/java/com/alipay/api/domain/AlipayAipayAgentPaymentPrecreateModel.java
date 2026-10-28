package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 按量付费预下单接口
 *
 * @author auto create
 * @since 1.0, 2026-09-24 13:47:56
 */
public class AlipayAipayAgentPaymentPrecreateModel extends AlipayObject {

	private static final long serialVersionUID = 8729178952422752437L;

	/**
	 * 接口付费金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 仅支持CNY
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 商品/服务名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 交易备注，用于账单备注展示，可空
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户自身订单号，用于幂等控制
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付截止时间，超过后禁止支付
	 */
	@ApiField("pay_before")
	private String payBefore;

	/**
	 * 按量付费注册分配的服务id
	 */
	@ApiField("service_id")
	private String serviceId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPayBefore() {
		return this.payBefore;
	}
	public void setPayBefore(String payBefore) {
		this.payBefore = payBefore;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
