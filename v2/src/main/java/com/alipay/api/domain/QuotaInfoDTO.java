package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 额度信息模型
 *
 * @author auto create
 * @since 1.0, 2025-08-19 15:24:54
 */
public class QuotaInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4736794564719847175L;

	/**
	 * 总限额
	 */
	@ApiField("limit_money")
	private String limitMoney;

	/**
	 * 总限次
	 */
	@ApiField("limit_times")
	private String limitTimes;

	/**
	 * 剩余额度
	 */
	@ApiField("remain_money")
	private String remainMoney;

	/**
	 * 剩余次数
	 */
	@ApiField("remain_times")
	private String remainTimes;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getLimitMoney() {
		return this.limitMoney;
	}
	public void setLimitMoney(String limitMoney) {
		this.limitMoney = limitMoney;
	}

	public String getLimitTimes() {
		return this.limitTimes;
	}
	public void setLimitTimes(String limitTimes) {
		this.limitTimes = limitTimes;
	}

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
