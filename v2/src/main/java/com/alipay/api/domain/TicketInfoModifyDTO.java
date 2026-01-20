package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 票务信息修改模型
 *
 * @author auto create
 * @since 1.0, 2025-07-07 13:57:24
 */
public class TicketInfoModifyDTO extends AlipayObject {

	private static final long serialVersionUID = 2191896366413212964L;

	/**
	 * 需要更新的场次结束时间
	 */
	@ApiField("event_end_time")
	private Date eventEndTime;

	/**
	 * 场次ID，场次唯一标识
	 */
	@ApiField("event_id")
	private String eventId;

	/**
	 * 需要更新的场次开始时间
	 */
	@ApiField("event_start_time")
	private Date eventStartTime;

	/**
	 * 需要更新的演出场次状态
	 */
	@ApiField("event_status")
	private String eventStatus;

	/**
	 * 需要更新的演出座位号
	 */
	@ApiField("performance_seats")
	private String performanceSeats;

	/**
	 * 票编码ID，票的唯一标识
	 */
	@ApiField("ticket_id")
	private String ticketId;

	/**
	 * 需要更新的票据链接，跳转到票核销链接的地址
	 */
	@ApiField("ticket_link")
	private String ticketLink;

	/**
	 * 需要更新的票状态
	 */
	@ApiField("ticket_status")
	private String ticketStatus;

	public Date getEventEndTime() {
		return this.eventEndTime;
	}
	public void setEventEndTime(Date eventEndTime) {
		this.eventEndTime = eventEndTime;
	}

	public String getEventId() {
		return this.eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public Date getEventStartTime() {
		return this.eventStartTime;
	}
	public void setEventStartTime(Date eventStartTime) {
		this.eventStartTime = eventStartTime;
	}

	public String getEventStatus() {
		return this.eventStatus;
	}
	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}

	public String getPerformanceSeats() {
		return this.performanceSeats;
	}
	public void setPerformanceSeats(String performanceSeats) {
		this.performanceSeats = performanceSeats;
	}

	public String getTicketId() {
		return this.ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketLink() {
		return this.ticketLink;
	}
	public void setTicketLink(String ticketLink) {
		this.ticketLink = ticketLink;
	}

	public String getTicketStatus() {
		return this.ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

}
