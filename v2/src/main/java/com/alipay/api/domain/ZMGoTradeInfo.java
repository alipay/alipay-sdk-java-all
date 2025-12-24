package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻go数据回传交易信息
 *
 * @author auto create
 * @since 1.0, 2020-09-01 23:53:18
 */
public class ZMGoTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 4322221478237487754L;

	/**
	 * 用户和商户发生交易的交易单金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 用户和商户发生交易的交易单号，仅在商户需要回传交易信息时传入。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
