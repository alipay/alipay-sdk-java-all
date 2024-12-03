package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.leftticket.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 22:12:45
 */
public class AlipayDataMdaLeftticketQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7434882419341424758L;

	/** 
	 * 渠道售票
	 */
	@ApiField("ticket_channel")
	private String ticketChannel;

	/** 
	 * 城市售票
	 */
	@ApiField("ticket_city")
	private String ticketCity;

	/** 
	 * 项目售票
	 */
	@ApiField("ticket_project")
	private String ticketProject;

	/** 
	 * 票务通已售票占比
	 */
	@ApiField("ticket_radio")
	private Long ticketRadio;

	/** 
	 * 今日售票数
	 */
	@ApiField("today_ticket_cnt")
	private Long todayTicketCnt;

	/** 
	 * 总售票数
	 */
	@ApiField("total_ticket_cnt")
	private Long totalTicketCnt;

	public void setTicketChannel(String ticketChannel) {
		this.ticketChannel = ticketChannel;
	}
	public String getTicketChannel( ) {
		return this.ticketChannel;
	}

	public void setTicketCity(String ticketCity) {
		this.ticketCity = ticketCity;
	}
	public String getTicketCity( ) {
		return this.ticketCity;
	}

	public void setTicketProject(String ticketProject) {
		this.ticketProject = ticketProject;
	}
	public String getTicketProject( ) {
		return this.ticketProject;
	}

	public void setTicketRadio(Long ticketRadio) {
		this.ticketRadio = ticketRadio;
	}
	public Long getTicketRadio( ) {
		return this.ticketRadio;
	}

	public void setTodayTicketCnt(Long todayTicketCnt) {
		this.todayTicketCnt = todayTicketCnt;
	}
	public Long getTodayTicketCnt( ) {
		return this.todayTicketCnt;
	}

	public void setTotalTicketCnt(Long totalTicketCnt) {
		this.totalTicketCnt = totalTicketCnt;
	}
	public Long getTotalTicketCnt( ) {
		return this.totalTicketCnt;
	}

}
