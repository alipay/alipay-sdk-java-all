package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.hoteldevice.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-29 10:57:47
 */
public class AlipayOpenIotmbsHoteldeviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4736969382797452225L;

	/** 
	 * 设备绑定的酒店名称
	 */
	@ApiField("hotel_name")
	private String hotelName;

	/** 
	 * 设备绑定的房间号
	 */
	@ApiField("room_no")
	private String roomNo;

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelName( ) {
		return this.hotelName;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomNo( ) {
		return this.roomNo;
	}

}
