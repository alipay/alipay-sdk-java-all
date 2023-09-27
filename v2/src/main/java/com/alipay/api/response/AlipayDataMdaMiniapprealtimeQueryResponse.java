package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.miniapprealtime.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:56:47
 */
public class AlipayDataMdaMiniapprealtimeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7856672625856749521L;

	/** 
	 * 月访问量
	 */
	@ApiField("month_pv")
	private Long monthPv;

	/** 
	 * 今日访问量
	 */
	@ApiField("today_pv")
	private Long todayPv;

	/** 
	 * 总访问量
	 */
	@ApiField("total_pv")
	private Long totalPv;

	/** 
	 * 累计用户数
	 */
	@ApiField("uv")
	private Long uv;

	public void setMonthPv(Long monthPv) {
		this.monthPv = monthPv;
	}
	public Long getMonthPv( ) {
		return this.monthPv;
	}

	public void setTodayPv(Long todayPv) {
		this.todayPv = todayPv;
	}
	public Long getTodayPv( ) {
		return this.todayPv;
	}

	public void setTotalPv(Long totalPv) {
		this.totalPv = totalPv;
	}
	public Long getTotalPv( ) {
		return this.totalPv;
	}

	public void setUv(Long uv) {
		this.uv = uv;
	}
	public Long getUv( ) {
		return this.uv;
	}

}
