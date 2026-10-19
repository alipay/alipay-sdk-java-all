package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步批量创建房间、房间模型
 *
 * @author auto create
 * @since 1.0, 2026-09-29 11:10:14
 */
public class RoomBatchCreateItem extends AlipayObject {

	private static final long serialVersionUID = 8834943175931925956L;

	/**
	 * 外部房间号,在房源提供方对户号的唯一标识
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 户主手机
	 */
	@ApiField("owner_mobile")
	private String ownerMobile;

	/**
	 * 户主姓名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 房屋面积。默认单位: 平方米
	 */
	@ApiField("room_area")
	private String roomArea;

	/**
	 * 房间楼层
	 */
	@ApiField("room_floor")
	private String roomFloor;

	/**
	 * 房间
	 */
	@ApiField("room_value")
	private String roomValue;

	public String getOutRoomId() {
		return this.outRoomId;
	}
	public void setOutRoomId(String outRoomId) {
		this.outRoomId = outRoomId;
	}

	public String getOwnerMobile() {
		return this.ownerMobile;
	}
	public void setOwnerMobile(String ownerMobile) {
		this.ownerMobile = ownerMobile;
	}

	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getRoomArea() {
		return this.roomArea;
	}
	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}

	public String getRoomFloor() {
		return this.roomFloor;
	}
	public void setRoomFloor(String roomFloor) {
		this.roomFloor = roomFloor;
	}

	public String getRoomValue() {
		return this.roomValue;
	}
	public void setRoomValue(String roomValue) {
		this.roomValue = roomValue;
	}

}
