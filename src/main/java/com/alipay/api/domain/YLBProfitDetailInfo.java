package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余利宝收益详情数据结构
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class YLBProfitDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 6819248484573512422L;

	/**
	 * 近1日收益，单位为元
	 */
	@ApiField("day_profit")
	private String dayProfit;

	/**
	 * 近1月收益，单位为元
	 */
	@ApiField("month_profit")
	private String monthProfit;

	/**
	 * 历史累计收益，单位为元
	 */
	@ApiField("total_profit")
	private String totalProfit;

	/**
	 * 近1周收益，单位为元
	 */
	@ApiField("week_profit")
	private String weekProfit;

	public String getDayProfit() {
		return this.dayProfit;
	}
	public void setDayProfit(String dayProfit) {
		this.dayProfit = dayProfit;
	}

	public String getMonthProfit() {
		return this.monthProfit;
	}
	public void setMonthProfit(String monthProfit) {
		this.monthProfit = monthProfit;
	}

	public String getTotalProfit() {
		return this.totalProfit;
	}
	public void setTotalProfit(String totalProfit) {
		this.totalProfit = totalProfit;
	}

	public String getWeekProfit() {
		return this.weekProfit;
	}
	public void setWeekProfit(String weekProfit) {
		this.weekProfit = weekProfit;
	}

}
