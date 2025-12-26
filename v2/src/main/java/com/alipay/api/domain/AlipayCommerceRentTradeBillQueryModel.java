package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资商通资金对账接口
 *
 * @author auto create
 * @since 1.0, 2025-11-26 13:49:11
 */
public class AlipayCommerceRentTradeBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4465966178946814878L;

	/**
	 * 该笔交易的还款方（租赁商）pid
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
