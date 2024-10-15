package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸设备绑定酒店和房间
 *
 * @author auto create
 * @since 1.0, 2022-08-18 20:15:50
 */
public class AlipayOpenIotmbsRoomBindModel extends AlipayObject {

	private static final long serialVersionUID = 4519221954654931556L;

	/**
	 * 设备激活编号
	 */
	@ApiField("dev_id")
	private String devId;

	/**
	 * 设备类型，1:房间设备，2:前台设备
	 */
	@ApiField("device_type")
	private Long deviceType;

	/**
	 * 楼层号
	 */
	@ApiField("floor_num")
	private String floorNum;

	/**
	 * 酒店编号
	 */
	@ApiField("hotel_id")
	private String hotelId;

	/**
	 * 酒店名称
	 */
	@ApiField("hotel_name")
	private String hotelName;

	/**
	 * 项目ID，目前涂鸦这边是用酒店ID做项目ID来隔离
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 酒店的房间编号
	 */
	@ApiField("room_no")
	private String roomNo;

	/**
	 * 设备SN
	 */
	@ApiField("sn")
	private String sn;

	public String getDevId() {
		return this.devId;
	}
	public void setDevId(String devId) {
		this.devId = devId;
	}

	public Long getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(Long deviceType) {
		this.deviceType = deviceType;
	}

	public String getFloorNum() {
		return this.floorNum;
	}
	public void setFloorNum(String floorNum) {
		this.floorNum = floorNum;
	}

	public String getHotelId() {
		return this.hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return this.hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getRoomNo() {
		return this.roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
