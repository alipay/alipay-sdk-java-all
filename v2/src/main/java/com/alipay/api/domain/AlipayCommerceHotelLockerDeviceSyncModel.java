package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店智慧住设备信息同步
 *
 * @author auto create
 * @since 1.0, 2025-09-12 10:02:40
 */
public class AlipayCommerceHotelLockerDeviceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6593148412817417327L;

	/**
	 * 所属支付宝侧机构ID
	 */
	@ApiField("alipay_org_id")
	private String alipayOrgId;

	/**
	 * 服务商内部楼宇ID
	 */
	@ApiField("building_id")
	private String buildingId;

	/**
	 * 楼宇名称
	 */
	@ApiField("building_name")
	private String buildingName;

	/**
	 * 楼宇编号
	 */
	@ApiField("building_no")
	private String buildingNo;

	/**
	 * 设备ID（系统内ID）
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备系统集成服务商
	 */
	@ApiField("device_isv_code")
	private String deviceIsvCode;

	/**
	 * 设备名称
	 */
	@ApiField("device_name")
	private String deviceName;

	/**
	 * 烧入设备中的厂商编码
	 */
	@ApiField("device_p_code")
	private String devicePCode;

	/**
	 * 设备编号（开锁设备中的唯一编号）
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * ROOM_LOCK-房间门锁
LIFT-梯控
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 设备当前是否有效，默认有效
	 */
	@ApiField("effective")
	private Boolean effective;

	/**
	 * 房间楼层
	 */
	@ApiField("floor")
	private String floor;

	/**
	 * 服务商侧机构ID
	 */
	@ApiField("isv_org_id")
	private String isvOrgId;

	/**
	 * 开锁主要方式
蓝牙-BLUETOOTH
，NFC-NFC
，远程网络-NETWORK，
广播-BROADCAST
	 */
	@ApiField("open_type")
	private String openType;

	/**
	 * 权限管理同步服务商code
	 */
	@ApiField("operators_code")
	private String operatorsCode;

	/**
	 * 所属集团code
	 */
	@ApiField("org_group_code")
	private String orgGroupCode;

	/**
	 * 关联房间名称
	 */
	@ApiField("room_name")
	private String roomName;

	/**
	 * 关联房间号
	 */
	@ApiField("room_no")
	private String roomNo;

	/**
	 * 梯控设备可以分组
	 */
	@ApiField("team_name")
	private String teamName;

	public String getAlipayOrgId() {
		return this.alipayOrgId;
	}
	public void setAlipayOrgId(String alipayOrgId) {
		this.alipayOrgId = alipayOrgId;
	}

	public String getBuildingId() {
		return this.buildingId;
	}
	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}

	public String getBuildingName() {
		return this.buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getBuildingNo() {
		return this.buildingNo;
	}
	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceIsvCode() {
		return this.deviceIsvCode;
	}
	public void setDeviceIsvCode(String deviceIsvCode) {
		this.deviceIsvCode = deviceIsvCode;
	}

	public String getDeviceName() {
		return this.deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDevicePCode() {
		return this.devicePCode;
	}
	public void setDevicePCode(String devicePCode) {
		this.devicePCode = devicePCode;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public Boolean getEffective() {
		return this.effective;
	}
	public void setEffective(Boolean effective) {
		this.effective = effective;
	}

	public String getFloor() {
		return this.floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getIsvOrgId() {
		return this.isvOrgId;
	}
	public void setIsvOrgId(String isvOrgId) {
		this.isvOrgId = isvOrgId;
	}

	public String getOpenType() {
		return this.openType;
	}
	public void setOpenType(String openType) {
		this.openType = openType;
	}

	public String getOperatorsCode() {
		return this.operatorsCode;
	}
	public void setOperatorsCode(String operatorsCode) {
		this.operatorsCode = operatorsCode;
	}

	public String getOrgGroupCode() {
		return this.orgGroupCode;
	}
	public void setOrgGroupCode(String orgGroupCode) {
		this.orgGroupCode = orgGroupCode;
	}

	public String getRoomName() {
		return this.roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomNo() {
		return this.roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getTeamName() {
		return this.teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

}
