package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.gamereport.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 22:08:45
 */
public class AlipayDataMdaGamereportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3275177371363564628L;

	/** 
	 * 线上观赛服务次数
	 */
	@ApiField("online_watch_cnt")
	private Long onlineWatchCnt;

	/** 
	 * 线上观赛服务人数
	 */
	@ApiField("online_watch_unt")
	private Long onlineWatchUnt;

	/** 
	 * 亚运pass刷码次数
	 */
	@ApiField("pass_cnt")
	private Long passCnt;

	/** 
	 * 亚运pass开通人数
	 */
	@ApiField("pass_unt")
	private Long passUnt;

	/** 
	 * 整体售票数
	 */
	@ApiField("ticket_cnt")
	private Long ticketCnt;

	/** 
	 * 整体售票比例
	 */
	@ApiField("ticket_ratio")
	private Long ticketRatio;

	/** 
	 * 持票观众累计服务次数
	 */
	@ApiField("ticket_spectator_cnt")
	private Long ticketSpectatorCnt;

	/** 
	 * 持票观众累计服务人数
	 */
	@ApiField("ticket_spectator_unt")
	private Long ticketSpectatorUnt;

	/** 
	 * 整体累计服务次数
	 */
	@ApiField("total_service_cnt")
	private Long totalServiceCnt;

	/** 
	 * 整体累计服务人数
	 */
	@ApiField("total_service_unt")
	private Long totalServiceUnt;

	public void setOnlineWatchCnt(Long onlineWatchCnt) {
		this.onlineWatchCnt = onlineWatchCnt;
	}
	public Long getOnlineWatchCnt( ) {
		return this.onlineWatchCnt;
	}

	public void setOnlineWatchUnt(Long onlineWatchUnt) {
		this.onlineWatchUnt = onlineWatchUnt;
	}
	public Long getOnlineWatchUnt( ) {
		return this.onlineWatchUnt;
	}

	public void setPassCnt(Long passCnt) {
		this.passCnt = passCnt;
	}
	public Long getPassCnt( ) {
		return this.passCnt;
	}

	public void setPassUnt(Long passUnt) {
		this.passUnt = passUnt;
	}
	public Long getPassUnt( ) {
		return this.passUnt;
	}

	public void setTicketCnt(Long ticketCnt) {
		this.ticketCnt = ticketCnt;
	}
	public Long getTicketCnt( ) {
		return this.ticketCnt;
	}

	public void setTicketRatio(Long ticketRatio) {
		this.ticketRatio = ticketRatio;
	}
	public Long getTicketRatio( ) {
		return this.ticketRatio;
	}

	public void setTicketSpectatorCnt(Long ticketSpectatorCnt) {
		this.ticketSpectatorCnt = ticketSpectatorCnt;
	}
	public Long getTicketSpectatorCnt( ) {
		return this.ticketSpectatorCnt;
	}

	public void setTicketSpectatorUnt(Long ticketSpectatorUnt) {
		this.ticketSpectatorUnt = ticketSpectatorUnt;
	}
	public Long getTicketSpectatorUnt( ) {
		return this.ticketSpectatorUnt;
	}

	public void setTotalServiceCnt(Long totalServiceCnt) {
		this.totalServiceCnt = totalServiceCnt;
	}
	public Long getTotalServiceCnt( ) {
		return this.totalServiceCnt;
	}

	public void setTotalServiceUnt(Long totalServiceUnt) {
		this.totalServiceUnt = totalServiceUnt;
	}
	public Long getTotalServiceUnt( ) {
		return this.totalServiceUnt;
	}

}
