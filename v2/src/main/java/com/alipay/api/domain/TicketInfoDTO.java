package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 票务信息模型
 *
 * @author auto create
 * @since 1.0, 2024-02-26 17:12:47
 */
public class TicketInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8322677639684215123L;

	/**
	 * 演出地点所属的城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 场次结束时间
	 */
	@ApiField("event_end_time")
	private Date eventEndTime;

	/**
	 * 场次唯一标识
	 */
	@ApiField("event_id")
	private String eventId;

	/**
	 * 场次名称
	 */
	@ApiField("event_name")
	private String eventName;

	/**
	 * 场次开始时间
	 */
	@ApiField("event_start_time")
	private Date eventStartTime;

	/**
	 * 演出位置
	 */
	@ApiField("location_name")
	private String locationName;

	/**
	 * 演出座位号
	 */
	@ApiField("performance_seats")
	private String performanceSeats;

	/**
	 * 票编码ID，票的唯一标识
	 */
	@ApiField("ticket_id")
	private String ticketId;

	/**
	 * 票据链接，跳转到票核销链接的地址
	 */
	@ApiField("ticket_link")
	private String ticketLink;

	/**
	 * 票类型
	 */
	@ApiField("ticket_type")
	private String ticketType;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

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

	public String getEventName() {
		return this.eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Date getEventStartTime() {
		return this.eventStartTime;
	}
	public void setEventStartTime(Date eventStartTime) {
		this.eventStartTime = eventStartTime;
	}

	public String getLocationName() {
		return this.locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
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

	public String getTicketType() {
		return this.ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

}
