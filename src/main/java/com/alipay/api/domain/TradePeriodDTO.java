package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易周期市场状态对象
 *
 * @author auto create
 * @since 1.0, 2022-04-26 15:25:44
 */
public class TradePeriodDTO extends AlipayObject {

	private static final long serialVersionUID = 6626322634936876382L;

	/**
	 * 归属日期
	 */
	@ApiField("belong_day")
	private String belongDay;

	/**
	 * 非交易的描述，如：春节、周末休日，交易日时此描述为交易中
	 */
	@ApiField("state_desc")
	private String stateDesc;

	/**
	 * 日期是否是交易日，true：表示是交易日
	 */
	@ApiField("trading_day")
	private Boolean tradingDay;

	public String getBelongDay() {
		return this.belongDay;
	}
	public void setBelongDay(String belongDay) {
		this.belongDay = belongDay;
	}

	public String getStateDesc() {
		return this.stateDesc;
	}
	public void setStateDesc(String stateDesc) {
		this.stateDesc = stateDesc;
	}

	public Boolean getTradingDay() {
		return this.tradingDay;
	}
	public void setTradingDay(Boolean tradingDay) {
		this.tradingDay = tradingDay;
	}

}
