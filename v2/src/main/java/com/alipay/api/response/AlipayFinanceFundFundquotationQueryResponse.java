package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.fund.fundquotation.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:59
 */
public class AlipayFinanceFundFundquotationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3216639344711541699L;

	/** 
	 * 近半年收益：基金产品近半年内收益率
四舍五入后保留小数点后4位
	 */
	@ApiField("last_half_year")
	private String lastHalfYear;

	/** 
	 * 近一月收益率：基金产品近一月内收益率
四舍五入后保留小数点后4位
	 */
	@ApiField("last_month")
	private String lastMonth;

	/** 
	 * 近三月收益：基金产品近三月内收益率
四舍五入后保留小数点后4位
	 */
	@ApiField("last_quarter")
	private String lastQuarter;

	/** 
	 * 近一周收益率：基金产品近一周内收益率
四舍五入后保留小数点后4位
	 */
	@ApiField("last_week")
	private String lastWeek;

	/** 
	 * 近一年收益率：基金产品近一年内收益率
四舍五入后保留小数点后4位
	 */
	@ApiField("last_year")
	private String lastYear;

	/** 
	 * 发布日期：产品收益率发布的时间
	 */
	@ApiField("report_date")
	private String reportDate;

	/** 
	 * 成立以来收益率：基金产品成立以来收益率
四舍五入后保留小数点后4位
	 */
	@ApiField("since_establishment")
	private String sinceEstablishment;

	/** 
	 * 今年以来收益率：基金产品今年以来收益率
四舍五入后保留小数点后4位
	 */
	@ApiField("this_year")
	private String thisYear;

	/** 
	 * 三年内收益率：基金产品三年内收益率
四舍五入后保留小数点后4位
	 */
	@ApiField("yield_3_year")
	private String yield3Year;

	/** 
	 * 近五年收益率：基金产品近五年内收益率
四舍五入后保留小数点后4位
	 */
	@ApiField("yield_5_year")
	private String yield5Year;

	public void setLastHalfYear(String lastHalfYear) {
		this.lastHalfYear = lastHalfYear;
	}
	public String getLastHalfYear( ) {
		return this.lastHalfYear;
	}

	public void setLastMonth(String lastMonth) {
		this.lastMonth = lastMonth;
	}
	public String getLastMonth( ) {
		return this.lastMonth;
	}

	public void setLastQuarter(String lastQuarter) {
		this.lastQuarter = lastQuarter;
	}
	public String getLastQuarter( ) {
		return this.lastQuarter;
	}

	public void setLastWeek(String lastWeek) {
		this.lastWeek = lastWeek;
	}
	public String getLastWeek( ) {
		return this.lastWeek;
	}

	public void setLastYear(String lastYear) {
		this.lastYear = lastYear;
	}
	public String getLastYear( ) {
		return this.lastYear;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}
	public String getReportDate( ) {
		return this.reportDate;
	}

	public void setSinceEstablishment(String sinceEstablishment) {
		this.sinceEstablishment = sinceEstablishment;
	}
	public String getSinceEstablishment( ) {
		return this.sinceEstablishment;
	}

	public void setThisYear(String thisYear) {
		this.thisYear = thisYear;
	}
	public String getThisYear( ) {
		return this.thisYear;
	}

	public void setYield3Year(String yield3Year) {
		this.yield3Year = yield3Year;
	}
	public String getYield3Year( ) {
		return this.yield3Year;
	}

	public void setYield5Year(String yield5Year) {
		this.yield5Year = yield5Year;
	}
	public String getYield5Year( ) {
		return this.yield5Year;
	}

}
