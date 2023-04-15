package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.fund.fund.fixedprofit.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 13:31:19
 */
public class AlipayFinanceFundFundFixedprofitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8854317328241644471L;

	/** 
	 * 过去5年定投收益率
	 */
	@ApiField("last_five_year")
	private String lastFiveYear;

	/** 
	 * 近一年定投收益率
	 */
	@ApiField("last_one_year")
	private String lastOneYear;

	/** 
	 * 最近三年定投收益率
	 */
	@ApiField("last_three_year")
	private String lastThreeYear;

	/** 
	 * 过去2年定投收益率
	 */
	@ApiField("last_two_year")
	private String lastTwoYear;

	/** 
	 * 自从成立以来
	 */
	@ApiField("since_establish")
	private String sinceEstablish;

	public void setLastFiveYear(String lastFiveYear) {
		this.lastFiveYear = lastFiveYear;
	}
	public String getLastFiveYear( ) {
		return this.lastFiveYear;
	}

	public void setLastOneYear(String lastOneYear) {
		this.lastOneYear = lastOneYear;
	}
	public String getLastOneYear( ) {
		return this.lastOneYear;
	}

	public void setLastThreeYear(String lastThreeYear) {
		this.lastThreeYear = lastThreeYear;
	}
	public String getLastThreeYear( ) {
		return this.lastThreeYear;
	}

	public void setLastTwoYear(String lastTwoYear) {
		this.lastTwoYear = lastTwoYear;
	}
	public String getLastTwoYear( ) {
		return this.lastTwoYear;
	}

	public void setSinceEstablish(String sinceEstablish) {
		this.sinceEstablish = sinceEstablish;
	}
	public String getSinceEstablish( ) {
		return this.sinceEstablish;
	}

}
