package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv绑定酒店设备
 *
 * @author auto create
 * @since 1.0, 2025-01-07 19:28:53
 */
public class AlipayOpenIotmbsIsvdeviceBindModel extends AlipayObject {

	private static final long serialVersionUID = 6761757274352342527L;

	/**
	 * 设备蓝牙mac地址
	 */
	@ApiField("bt_mac")
	private String btMac;

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
17:小型售货机 当前字段已废弃(此字段废弃，无需传值。)
	 */
	@ApiField("device_category")
	@Deprecated
	private String deviceCategory;

	/**
	 * 设备所属类型，枚举值：30001001:蜻蜓前台设备 30001002:蜻蜓房门设备 30001003:蜻蜓梯控设备 30001004:蜻蜓门禁/闸机设备 30002001:袋鼠货柜 30003001:生态刷脸前台设备 30003002:生态刷脸房门设备 30003003:生态刷脸梯控设备 30003004:生态刷脸门禁/闸机设备 30003005:弹簧售货机 30003006:共享VR租赁 30003007:共享充电宝 30003008:客房小型零售机 30003009:客房派样水机 30003010:咖啡机 30003011:洗衣机 30003012:送物机器人 30003013:客控音箱
	 */
	@ApiField("device_category_code")
	private String deviceCategoryCode;

	/**
	 * 设备所使用的解决方案。枚举值：20001:智慧前台 20002:一脸通行 20003:智慧生活
	 */
	@ApiField("device_solution")
	private String deviceSolution;

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
	 * 设备所处场景类目，枚举值：40001001:前台场景 40001002:共享售卖/租赁场景 40001003:梯控场景 40001004:门禁场景（含闸机） 40001005:就餐场景 40002001:刷脸开门场景 40002002:客房零售场景 40002003:客房客控场景
	 */
	@ApiField("scene_category_code")
	private String sceneCategoryCode;

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
8:网吧前台设备 当前字段已废弃(此字段废弃，无需传值。)
	 */
	@ApiField("scene_type")
	@Deprecated
	private String sceneType;

	/**
	 * 要进行绑定操作的设备sn，英文逗号隔开
	 */
	@ApiField("sn")
	private String sn;

	public String getBtMac() {
		return this.btMac;
	}
	public void setBtMac(String btMac) {
		this.btMac = btMac;
	}

	public String getDeviceCategory() {
		return this.deviceCategory;
	}
	public void setDeviceCategory(String deviceCategory) {
		this.deviceCategory = deviceCategory;
	}

	public String getDeviceCategoryCode() {
		return this.deviceCategoryCode;
	}
	public void setDeviceCategoryCode(String deviceCategoryCode) {
		this.deviceCategoryCode = deviceCategoryCode;
	}

	public String getDeviceSolution() {
		return this.deviceSolution;
	}
	public void setDeviceSolution(String deviceSolution) {
		this.deviceSolution = deviceSolution;
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

	public String getSceneCategoryCode() {
		return this.sceneCategoryCode;
	}
	public void setSceneCategoryCode(String sceneCategoryCode) {
		this.sceneCategoryCode = sceneCategoryCode;
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
