package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户贴息账单
 *
 * @author auto create
 * @since 1.0, 2020-07-22 13:56:45
 */
public class HbMerchantBill extends AlipayObject {

	private static final long serialVersionUID = 5528526626284923126L;

	/**
	 * 商家贴息金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 外部订单号，目前交易取不到，先留空
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 订单金额
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易时间
	 */
	@ApiField("trade_time")
	private String tradeTime;

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
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

}
