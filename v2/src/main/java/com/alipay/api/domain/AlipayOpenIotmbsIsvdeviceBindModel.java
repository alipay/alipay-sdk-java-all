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

	private static final long serialVersionUID = 1596537657246223223L;

	/**
	 * 传入绑定设备的类型。
枚举值：
1:蜻蜓前台设备
2:蜻蜓房门设备
3:蜻蜓公区设备
11:咖啡机
12:洗衣机
13:视觉货柜
14:送物机器人
15:客控音响
16:弹簧机
17:小型售货机
	 */
	@ApiField("device_category")
	private String deviceCategory;

	/**
	 * 用户入住的楼层
	 */
	@ApiField("floor_num")
	private String floorNum;

	/**
	 * 传入设备要绑定的项目id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 用户入住房间的房间号
	 */
	@ApiField("room_num")
	private String roomNum;

	/**
	 * 绑定设备使用的场景
枚举值：
1:酒店前台设备
2:刷脸开门设备
3:刷脸乘梯设备
4:刷脸门禁设备
5:刷脸闸机设备
6:刷脸就餐设备
7:公区共享设备
8:网吧前台设备
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 要进行绑定操作的设备sn
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
