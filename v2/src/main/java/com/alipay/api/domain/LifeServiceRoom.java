package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-26 15:57:42
 */
public class LifeServiceRoom extends AlipayObject {

	private static final long serialVersionUID = 5673947464353867732L;

	/**
	 * 三方场地id
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * null
	 */
	@ApiListField("room_attrs")
	@ApiField("life_service_attr")
	private List<LifeServiceAttr> roomAttrs;

	/**
	 * 场地种类
	 */
	@ApiField("room_category")
	private String roomCategory;

	/**
	 * 场地id
	 */
	@ApiField("room_id")
	private String roomId;

	/**
	 * 棋牌室、ktv包厢，运动场馆场地等名称
	 */
	@ApiField("room_name")
	private String roomName;

	/**
	 * null
	 */
	@ApiListField("room_pics")
	@ApiField("string")
	private List<String> roomPics;

	/**
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * active 可预约状态
inactive 不可预约状态
	 */
	@ApiField("status")
	private String status;

	public String getOutRoomId() {
		return this.outRoomId;
	}
	public void setOutRoomId(String outRoomId) {
		this.outRoomId = outRoomId;
	}

	public List<LifeServiceAttr> getRoomAttrs() {
		return this.roomAttrs;
	}
	public void setRoomAttrs(List<LifeServiceAttr> roomAttrs) {
		this.roomAttrs = roomAttrs;
	}

	public String getRoomCategory() {
		return this.roomCategory;
	}
	public void setRoomCategory(String roomCategory) {
		this.roomCategory = roomCategory;
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

	public List<String> getRoomPics() {
		return this.roomPics;
	}
	public void setRoomPics(List<String> roomPics) {
		this.roomPics = roomPics;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
