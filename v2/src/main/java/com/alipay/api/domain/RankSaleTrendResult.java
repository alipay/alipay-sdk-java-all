package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * RankSaleTrendResult
 *
 * @author auto create
 * @since 1.0, 2024-05-21 16:30:03
 */
public class RankSaleTrendResult extends AlipayObject {

	private static final long serialVersionUID = 8614598268769712912L;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 周结束日期
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 上次销量数值
	 */
	@ApiField("last_rank_value")
	private String lastRankValue;

	/**
	 * 月份
	 */
	@ApiField("month")
	private String month;

	/**
	 * 排名
	 */
	@ApiField("rank")
	private String rank;

	/**
	 * 销量数值
	 */
	@ApiField("rank_value")
	private String rankValue;

	/**
	 * 周起始日期
	 */
	@ApiField("start_date")
	private String startDate;

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getLastRankValue() {
		return this.lastRankValue;
	}
	public void setLastRankValue(String lastRankValue) {
		this.lastRankValue = lastRankValue;
	}

	public String getMonth() {
		return this.month;
	}
	public void setMonth(String month) {
		this.month = month;
	}

	public String getRank() {
		return this.rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getRankValue() {
		return this.rankValue;
	}
	public void setRankValue(String rankValue) {
		this.rankValue = rankValue;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
