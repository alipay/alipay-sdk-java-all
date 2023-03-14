package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv绑定酒店设备
 *
 * @author auto create
 * @since 1.0, 2023-03-06 14:44:45
 */
public class AlipayOpenIotmbsIsvdeviceBindModel extends AlipayObject {

	private static final long serialVersionUID = 3893646298198622832L;

	/**
	 * device_category+传入绑定设备的类型
	 */
	@ApiField("device_category")
	private String deviceCategory;

	/**
	 * floor_num+用户入住的楼层
	 */
	@ApiField("floor_num")
	private String floorNum;

	/**
	 * project_id+传入设备要绑定的项目id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * room_num+用户入住房间的房间号
	 */
	@ApiField("room_num")
	private String roomNum;

	/**
	 * scene_type+绑定设备使用的场景
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * sn+要进行绑定操作的设备sn
	 */
	@ApiField("sn")
	private String sn;

	public String getDeviceCategory() {
		return this.deviceCategory;
	}
	public void setDeviceCategory(String deviceCategory) {
		this.deviceCategory = deviceCategory;
	}

	public String getFloorNum() {
		return this.floorNum;
	}
	public void setFloorNum(String floorNum) {
		this.floorNum = floorNum;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getRoomNum() {
		return this.roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
