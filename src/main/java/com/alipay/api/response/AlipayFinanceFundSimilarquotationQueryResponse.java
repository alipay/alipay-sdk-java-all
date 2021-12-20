package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.fund.similarquotation.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayFinanceFundSimilarquotationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4119728965613131314L;

	/** 
	 * 近半年的参与同类收益率排名的基金数量
	 */
	@ApiField("last_half_year_count")
	private String lastHalfYearCount;

	/** 
	 * 近半年的同类收益率的排名
	 */
	@ApiField("last_half_year_order")
	private String lastHalfYearOrder;

	/** 
	 * 近半年的同类收益率；四舍五入后保留小数点后4位
	 */
	@ApiField("last_half_year_similar")
	private String lastHalfYearSimilar;

	/** 
	 * 近一月的参与同类收益率排名的基金数量
	 */
	@ApiField("last_month_count")
	private String lastMonthCount;

	/** 
	 * 近一月的同类收益率的排名
	 */
	@ApiField("last_month_order")
	private String lastMonthOrder;

	/** 
	 * 近一月的同类收益率；四舍五入后保留小数点后4位
	 */
	@ApiField("last_month_similar")
	private String lastMonthSimilar;

	/** 
	 * 近一季度的参与同类收益率排名的基金数量
	 */
	@ApiField("last_quarter_count")
	private String lastQuarterCount;

	/** 
	 * 近一季度的同类收益率的排名
	 */
	@ApiField("last_quarter_order")
	private String lastQuarterOrder;

	/** 
	 * 近一季度的同类收益率；四舍五入后保留小数点后4位
	 */
	@ApiField("last_quarter_similar")
	private String lastQuarterSimilar;

	/** 
	 * 近一年的参与同类收益率排名的基金数量
	 */
	@ApiField("last_year_count")
	private String lastYearCount;

	/** 
	 * 近一年的同类收益率排名
	 */
	@ApiField("last_year_order")
	private String lastYearOrder;

	/** 
	 * 近一年的同类收益率；四舍五入后保留小数点后4位
	 */
	@ApiField("last_year_similar")
	private String lastYearSimilar;

	/** 
	 * 发布日期；同类收益率发布的时间
	 */
	@ApiField("report_date")
	private String reportDate;

	/** 
	 * 近三年的参与同类收益率排名的基金数量
	 */
	@ApiField("yield_three_year_count")
	private String yieldThreeYearCount;

	/** 
	 * 近三年的同类收益率的排名
	 */
	@ApiField("yield_three_year_order")
	private String yieldThreeYearOrder;

	/** 
	 * 近三年的同类收益率；四舍五入后保留小数点后4位
	 */
	@ApiField("yield_three_year_similar")
	private String yieldThreeYearSimilar;

	public void setLastHalfYearCount(String lastHalfYearCount) {
		this.lastHalfYearCount = lastHalfYearCount;
	}
	public String getLastHalfYearCount( ) {
		return this.lastHalfYearCount;
	}

	public void setLastHalfYearOrder(String lastHalfYearOrder) {
		this.lastHalfYearOrder = lastHalfYearOrder;
	}
	public String getLastHalfYearOrder( ) {
		return this.lastHalfYearOrder;
	}

	public void setLastHalfYearSimilar(String lastHalfYearSimilar) {
		this.lastHalfYearSimilar = lastHalfYearSimilar;
	}
	public String getLastHalfYearSimilar( ) {
		return this.lastHalfYearSimilar;
	}

	public void setLastMonthCount(String lastMonthCount) {
		this.lastMonthCount = lastMonthCount;
	}
	public String getLastMonthCount( ) {
		return this.lastMonthCount;
	}

	public void setLastMonthOrder(String lastMonthOrder) {
		this.lastMonthOrder = lastMonthOrder;
	}
	public String getLastMonthOrder( ) {
		return this.lastMonthOrder;
	}

	public void setLastMonthSimilar(String lastMonthSimilar) {
		this.lastMonthSimilar = lastMonthSimilar;
	}
	public String getLastMonthSimilar( ) {
		return this.lastMonthSimilar;
	}

	public void setLastQuarterCount(String lastQuarterCount) {
		this.lastQuarterCount = lastQuarterCount;
	}
	public String getLastQuarterCount( ) {
		return this.lastQuarterCount;
	}

	public void setLastQuarterOrder(String lastQuarterOrder) {
		this.lastQuarterOrder = lastQuarterOrder;
	}
	public String getLastQuarterOrder( ) {
		return this.lastQuarterOrder;
	}

	public void setLastQuarterSimilar(String lastQuarterSimilar) {
		this.lastQuarterSimilar = lastQuarterSimilar;
	}
	public String getLastQuarterSimilar( ) {
		return this.lastQuarterSimilar;
	}

	public void setLastYearCount(String lastYearCount) {
		this.lastYearCount = lastYearCount;
	}
	public String getLastYearCount( ) {
		return this.lastYearCount;
	}

	public void setLastYearOrder(String lastYearOrder) {
		this.lastYearOrder = lastYearOrder;
	}
	public String getLastYearOrder( ) {
		return this.lastYearOrder;
	}

	public void setLastYearSimilar(String lastYearSimilar) {
		this.lastYearSimilar = lastYearSimilar;
	}
	public String getLastYearSimilar( ) {
		return this.lastYearSimilar;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}
	public String getReportDate( ) {
		return this.reportDate;
	}

	public void setYieldThreeYearCount(String yieldThreeYearCount) {
		this.yieldThreeYearCount = yieldThreeYearCount;
	}
	public String getYieldThreeYearCount( ) {
		return this.yieldThreeYearCount;
	}

	public void setYieldThreeYearOrder(String yieldThreeYearOrder) {
		this.yieldThreeYearOrder = yieldThreeYearOrder;
	}
	public String getYieldThreeYearOrder( ) {
		return this.yieldThreeYearOrder;
	}

	public void setYieldThreeYearSimilar(String yieldThreeYearSimilar) {
		this.yieldThreeYearSimilar = yieldThreeYearSimilar;
	}
	public String getYieldThreeYearSimilar( ) {
		return this.yieldThreeYearSimilar;
	}

}
