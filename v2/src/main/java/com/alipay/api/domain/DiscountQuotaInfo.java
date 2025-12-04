package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 国补立减额度信息
 *
 * @author auto create
 * @since 1.0, 2025-08-15 16:00:34
 */
public class DiscountQuotaInfo extends AlipayObject {

	private static final long serialVersionUID = 3294252986912146474L;

	/**
	 * 剩余额度信息，单位为元
	 */
	@ApiField("remain_money")
	private String remainMoney;

	/**
	 * 剩余次数
	 */
	@ApiField("remain_times")
	private String remainTimes;

	/**
	 * 对应交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getRemainMoney() {
		return this.remainMoney;
	}
	public void setRemainMoney(String remainMoney) {
		this.remainMoney = remainMoney;
	}

	public String getRemainTimes() {
		return this.remainTimes;
	}
	public void setRemainTimes(String remainTimes) {
		this.remainTimes = remainTimes;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
