package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物业社区小区房屋信息详情.
 *
 * @author auto create
 * @since 1.0, 2016-12-02 18:01:14
 */
public class CplifeRoomDetail extends AlipayObject {

	private static final long serialVersionUID = 5235953388887956183L;

	/**
	 * 房间完整门牌地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 房屋所在楼栋名称。例如“1栋”，“1幢”等
	 */
	@ApiField("building")
	private String building;

	/**
	 * 房屋所在的组团名称。例如“一期”，“东区”，“香桂苑”等
	 */
	@ApiField("group")
	private String group;

	/**
	 * 商户系统小区房屋唯一ID标示.
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 房屋所在房号。例如“1101室”，“11B室”等
	 */
	@ApiField("room")
	private String room;

	/**
	 * 支付宝系统房间唯一标示.
	 */
	@ApiField("room_id")
	private String roomId;

	/**
	 * 房屋所在单元名称。例如“一单元”，“二单元”等
	 */
	@ApiField("unit")
	private String unit;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBuilding() {
		return this.building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}

	public String getGroup() {
		return this.group;
	}
	public void setGroup(String group) {
		this.group = group;
	}

	public String getOutRoomId() {
		return this.outRoomId;
	}
	public void setOutRoomId(String outRoomId) {
		this.outRoomId = outRoomId;
	}

	public String getRoom() {
		return this.room;
	}
	public void setRoom(String room) {
		this.room = room;
	}

	public String getRoomId() {
		return this.roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
