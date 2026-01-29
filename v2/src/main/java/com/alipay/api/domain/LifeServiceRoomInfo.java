package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 包厢信息
 *
 * @author auto create
 * @since 1.0, 2026-01-23 14:41:45
 */
public class LifeServiceRoomInfo extends AlipayObject {

	private static final long serialVersionUID = 2798321567616918483L;

	/**
	 * 预定结束时间
	 */
	@ApiField("book_end_time")
	private Date bookEndTime;

	/**
	 * 预定开始时间
	 */
	@ApiField("book_start_time")
	private Date bookStartTime;

	/**
	 * 包厢id
	 */
	@ApiField("room_id")
	private String roomId;

	/**
	 * 包厢名称
	 */
	@ApiField("room_name")
	private String roomName;

	public Date getBookEndTime() {
		return this.bookEndTime;
	}
	public void setBookEndTime(Date bookEndTime) {
		this.bookEndTime = bookEndTime;
	}

	public Date getBookStartTime() {
		return this.bookStartTime;
	}
	public void setBookStartTime(Date bookStartTime) {
		this.bookStartTime = bookStartTime;
	}

	public String getRoomId() {
		return this.roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return this.roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

}
