package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商业关系门店交易数据详细信息
 *
 * @author auto create
 * @since 1.0, 2022-09-16 10:30:58
 */
public class BusinessRelationShopTradeDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 1251896263949664576L;

	/**
	 * 支付时间
	 */
	@ApiField("gmt_payment")
	private String gmtPayment;

	/**
	 * 交易金额
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 交易订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getGmtPayment() {
		return this.gmtPayment;
	}
	public void setGmtPayment(String gmtPayment) {
		this.gmtPayment = gmtPayment;
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

}
