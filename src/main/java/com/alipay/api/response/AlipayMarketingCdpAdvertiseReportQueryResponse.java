package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cdp.advertise.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingCdpAdvertiseReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1336748987431957465L;

	/** 
	 * 日点击量
	 */
	@ApiField("click_pv_dd")
	private String clickPvDd;

	/** 
	 * 历史累积点击量
	 */
	@ApiField("click_pv_history")
	private String clickPvHistory;

	/** 
	 * 日点击用户数
	 */
	@ApiField("click_uv_dd")
	private String clickUvDd;

	/** 
	 * 历史累积点击用户数
	 */
	@ApiField("click_uv_history")
	private String clickUvHistory;

	/** 
	 * 效果分析日期
	 */
	@ApiField("report_date")
	private String reportDate;

	/** 
	 * 日曝光量
	 */
	@ApiField("show_pv_dd")
	private String showPvDd;

	/** 
	 * 历史累积曝光量
	 */
	@ApiField("show_pv_history")
	private String showPvHistory;

	/** 
	 * 日曝光用户数
	 */
	@ApiField("show_uv_dd")
	private String showUvDd;

	/** 
	 * 历史累积曝光用户数
	 */
	@ApiField("show_uv_history")
	private String showUvHistory;

	public void setClickPvDd(String clickPvDd) {
		this.clickPvDd = clickPvDd;
	}
	public String getClickPvDd( ) {
		return this.clickPvDd;
	}

	public void setClickPvHistory(String clickPvHistory) {
		this.clickPvHistory = clickPvHistory;
	}
	public String getClickPvHistory( ) {
		return this.clickPvHistory;
	}

	public void setClickUvDd(String clickUvDd) {
		this.clickUvDd = clickUvDd;
	}
	public String getClickUvDd( ) {
		return this.clickUvDd;
	}

	public void setClickUvHistory(String clickUvHistory) {
		this.clickUvHistory = clickUvHistory;
	}
	public String getClickUvHistory( ) {
		return this.clickUvHistory;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}
	public String getReportDate( ) {
		return this.reportDate;
	}

	public void setShowPvDd(String showPvDd) {
		this.showPvDd = showPvDd;
	}
	public String getShowPvDd( ) {
		return this.showPvDd;
	}

	public void setShowPvHistory(String showPvHistory) {
		this.showPvHistory = showPvHistory;
	}
	public String getShowPvHistory( ) {
		return this.showPvHistory;
	}

	public void setShowUvDd(String showUvDd) {
		this.showUvDd = showUvDd;
	}
	public String getShowUvDd( ) {
		return this.showUvDd;
	}

	public void setShowUvHistory(String showUvHistory) {
		this.showUvHistory = showUvHistory;
	}
	public String getShowUvHistory( ) {
		return this.showUvHistory;
	}

}
