package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 房源上下架
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:53:38
 */
public class AlipayEcoRenthouseRoomStateSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3258538781434198628L;

	/**
	 * 房源类型（1:分散式 2：集中式）
	 */
	@ApiField("flats_tag")
	private Long flatsTag;

	/**
	 * 出租状态（1未租、2已租）
	 */
	@ApiField("rent_status")
	private Long rentStatus;

	/**
	 * 公寓运营商内部存储的房源编号(ka系统的房源id)
	 */
	@ApiField("room_code")
	private String roomCode;

	/**
	 * 是否上架，0:下架，1：上架
	 */
	@ApiField("room_status")
	private Long roomStatus;

	public Long getFlatsTag() {
		return this.flatsTag;
	}
	public void setFlatsTag(Long flatsTag) {
		this.flatsTag = flatsTag;
	}

	public Long getRentStatus() {
		return this.rentStatus;
	}
	public void setRentStatus(Long rentStatus) {
		this.rentStatus = rentStatus;
	}

	public String getRoomCode() {
		return this.roomCode;
	}
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

	public Long getRoomStatus() {
		return this.roomStatus;
	}
	public void setRoomStatus(Long roomStatus) {
		this.roomStatus = roomStatus;
	}

}
