package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-01 11:57:57
 */
public class ObjTradingPeriodDTO extends AlipayObject {

	private static final long serialVersionUID = 1859642921453338942L;

	/**
	 * null
	 */
	@ApiListField("periods")
	@ApiField("trading_period_d_t_o")
	private List<TradingPeriodDTO> periods;

	/**
	 * 股票标的
	 */
	@ApiField("symbol")
	private String symbol;

	/**
	 * 时间域
	 */
	@ApiField("time_zone")
	private String timeZone;

	public List<TradingPeriodDTO> getPeriods() {
		return this.periods;
	}
	public void setPeriods(List<TradingPeriodDTO> periods) {
		this.periods = periods;
	}

	public String getSymbol() {
		return this.symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getTimeZone() {
		return this.timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

}
