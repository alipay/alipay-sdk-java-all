package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-13 14:02:41
 */
public class RoomInfo extends AlipayObject {

	private static final long serialVersionUID = 6571379185716457653L;

	/**
	 * 房型详细信息
	 */
	@ApiField("room_detail")
	private RoomDetailInfo roomDetail;

	/**
	 * 支付宝聚合房型id，有效正整数
	 */
	@ApiField("room_id")
	private String roomId;

	/**
	 * 酒店的房间名称
	 */
	@ApiField("room_name")
	private String roomName;

	public RoomDetailInfo getRoomDetail() {
		return this.roomDetail;
	}
	public void setRoomDetail(RoomDetailInfo roomDetail) {
		this.roomDetail = roomDetail;
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
