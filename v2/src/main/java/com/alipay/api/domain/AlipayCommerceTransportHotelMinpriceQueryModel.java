package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出行行业酒店最小价查询
 *
 * @author auto create
 * @since 1.0, 2025-11-13 14:02:41
 */
public class AlipayCommerceTransportHotelMinpriceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2667523972821119727L;

	/**
	 * 入住日期，格式为：yyyy-MM-dd
	 */
	@ApiField("arrival_date")
	private String arrivalDate;

	/**
	 * 离店日期，格式为：yyyy-MM-dd
	 */
	@ApiField("departure_date")
	private String departureDate;

	/**
	 * 支付宝聚合酒店id,数字
	 */
	@ApiField("hotel_id")
	private String hotelId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 控制查询结果返回节点，用英文“,”分割
	 */
	@ApiField("options")
	private String options;

	/**
	 * 支付宝聚合房型id，数字，不为空时，返回该房型的最小价
	 */
	@ApiField("room_id")
	private String roomId;

	/**
	 * 支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getArrivalDate() {
		return this.arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getDepartureDate() {
		return this.departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getHotelId() {
		return this.hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOptions() {
		return this.options;
	}
	public void setOptions(String options) {
		this.options = options;
	}

	public String getRoomId() {
		return this.roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
