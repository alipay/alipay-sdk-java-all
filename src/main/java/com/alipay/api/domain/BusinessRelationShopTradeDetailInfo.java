package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商业关系门店交易数据详细信息
 *
 * @author auto create
 * @since 1.0, 2022-07-05 19:33:30
 */
public class BusinessRelationShopTradeDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 3817514314298556665L;

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

}
