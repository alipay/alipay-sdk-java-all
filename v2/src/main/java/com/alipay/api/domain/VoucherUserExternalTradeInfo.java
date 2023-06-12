package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券使用外部交易信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class VoucherUserExternalTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 3717412638635532373L;

	/**
	 * 核销金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 核销时间
	 */
	@ApiField("consume_date")
	private String consumeDate;

	/**
	 * 券核销的门店id
	 */
	@ApiField("consume_shop_id")
	private String consumeShopId;

	/**
	 * 外部交易号
	 */
	@ApiField("external_trade_no")
	private String externalTradeNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getConsumeDate() {
		return this.consumeDate;
	}
	public void setConsumeDate(String consumeDate) {
		this.consumeDate = consumeDate;
	}

	public String getConsumeShopId() {
		return this.consumeShopId;
	}
	public void setConsumeShopId(String consumeShopId) {
		this.consumeShopId = consumeShopId;
	}

	public String getExternalTradeNo() {
		return this.externalTradeNo;
	}
	public void setExternalTradeNo(String externalTradeNo) {
		this.externalTradeNo = externalTradeNo;
	}

}
