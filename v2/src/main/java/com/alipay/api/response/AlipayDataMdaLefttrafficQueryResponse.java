package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.lefttraffic.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 22:13:02
 */
public class AlipayDataMdaLefttrafficQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8863777534827232549L;

	/** 
	 * 今日持证出行人次
	 */
	@ApiField("today_certificate_traffic_cnt")
	private Long todayCertificateTrafficCnt;

	/** 
	 * 累计持证出行人数
	 */
	@ApiField("total_certificate_traffic_unt")
	private Long totalCertificateTrafficUnt;

	/** 
	 * 累计持票出行人数
	 */
	@ApiField("total_ticket_traffic_unt")
	private Long totalTicketTrafficUnt;

	/** 
	 * 今日持票出行次数
	 */
	@ApiField("totay_ticket_traffic_cnt")
	private Long totayTicketTrafficCnt;

	/** 
	 * 近7日出行趋势
	 */
	@ApiField("traffic_day_trend")
	private String trafficDayTrend;

	/** 
	 * 分时出行分布
	 */
	@ApiField("traffic_hour_distribute")
	private String trafficHourDistribute;

	/** 
	 * 出行工具
	 */
	@ApiField("traffic_paas")
	private String trafficPaas;

	public void setTodayCertificateTrafficCnt(Long todayCertificateTrafficCnt) {
		this.todayCertificateTrafficCnt = todayCertificateTrafficCnt;
	}
	public Long getTodayCertificateTrafficCnt( ) {
		return this.todayCertificateTrafficCnt;
	}

	public void setTotalCertificateTrafficUnt(Long totalCertificateTrafficUnt) {
		this.totalCertificateTrafficUnt = totalCertificateTrafficUnt;
	}
	public Long getTotalCertificateTrafficUnt( ) {
		return this.totalCertificateTrafficUnt;
	}

	public void setTotalTicketTrafficUnt(Long totalTicketTrafficUnt) {
		this.totalTicketTrafficUnt = totalTicketTrafficUnt;
	}
	public Long getTotalTicketTrafficUnt( ) {
		return this.totalTicketTrafficUnt;
	}

	public void setTotayTicketTrafficCnt(Long totayTicketTrafficCnt) {
		this.totayTicketTrafficCnt = totayTicketTrafficCnt;
	}
	public Long getTotayTicketTrafficCnt( ) {
		return this.totayTicketTrafficCnt;
	}

	public void setTrafficDayTrend(String trafficDayTrend) {
		this.trafficDayTrend = trafficDayTrend;
	}
	public String getTrafficDayTrend( ) {
		return this.trafficDayTrend;
	}

	public void setTrafficHourDistribute(String trafficHourDistribute) {
		this.trafficHourDistribute = trafficHourDistribute;
	}
	public String getTrafficHourDistribute( ) {
		return this.trafficHourDistribute;
	}

	public void setTrafficPaas(String trafficPaas) {
		this.trafficPaas = trafficPaas;
	}
	public String getTrafficPaas( ) {
		return this.trafficPaas;
	}

}
