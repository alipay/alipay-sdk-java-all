package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 房型信息。
 *
 * @author auto create
 * @since 1.0, 2021-05-12 10:09:20
 */
public class Room extends AlipayObject {

	private static final long serialVersionUID = 8484575298492316464L;

	/**
	 * 出行人信息
	 */
	@ApiListField("guests")
	@ApiField("passenger")
	private List<Passenger> guests;

	/**
	 * 房型
	 */
	@ApiField("room_type")
	private String roomType;

	public List<Passenger> getGuests() {
		return this.guests;
	}
	public void setGuests(List<Passenger> guests) {
		this.guests = guests;
	}

	public String getRoomType() {
		return this.roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

}
