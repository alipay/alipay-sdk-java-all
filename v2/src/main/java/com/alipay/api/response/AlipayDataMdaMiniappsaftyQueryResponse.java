package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.miniappsafty.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 22:22:51
 */
public class AlipayDataMdaMiniappsaftyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5334917974796943358L;

	/** 
	 * 今日拦截量
	 */
	@ApiField("intercept_cnt")
	private Long interceptCnt;

	/** 
	 * 当前拦截率
	 */
	@ApiField("intercept_ratio")
	private String interceptRatio;

	/** 
	 * 拦截趋势
	 */
	@ApiField("intercept_trend")
	private String interceptTrend;

	/** 
	 * 今日请求量
	 */
	@ApiField("request_cnt")
	private Long requestCnt;

	public void setInterceptCnt(Long interceptCnt) {
		this.interceptCnt = interceptCnt;
	}
	public Long getInterceptCnt( ) {
		return this.interceptCnt;
	}

	public void setInterceptRatio(String interceptRatio) {
		this.interceptRatio = interceptRatio;
	}
	public String getInterceptRatio( ) {
		return this.interceptRatio;
	}

	public void setInterceptTrend(String interceptTrend) {
		this.interceptTrend = interceptTrend;
	}
	public String getInterceptTrend( ) {
		return this.interceptTrend;
	}

	public void setRequestCnt(Long requestCnt) {
		this.requestCnt = requestCnt;
	}
	public Long getRequestCnt( ) {
		return this.requestCnt;
	}

}
