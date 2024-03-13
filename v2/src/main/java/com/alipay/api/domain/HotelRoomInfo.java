package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 房间信息，包含房型基本信息和入住人信息。
 *
 * @author auto create
 * @since 1.0, 2021-07-02 09:20:47
 */
public class HotelRoomInfo extends AlipayObject {

	private static final long serialVersionUID = 3748628487457983352L;

	/**
	 * 酒店入住人信息
	 */
	@ApiListField("guests")
	@ApiField("hotel_guests")
	private List<HotelGuests> guests;

	/**
	 * 房间号
	 */
	@ApiField("room_number")
	private String roomNumber;

	/**
	 * 房型
	 */
	@ApiField("room_type")
	private String roomType;

	public List<HotelGuests> getGuests() {
		return this.guests;
	}
	public void setGuests(List<HotelGuests> guests) {
		this.guests = guests;
	}

	public String getRoomNumber() {
		return this.roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomType() {
		return this.roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

}
