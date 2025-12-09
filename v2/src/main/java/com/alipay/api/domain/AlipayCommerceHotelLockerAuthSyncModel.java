package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店智慧住权限信息同步
 *
 * @author auto create
 * @since 1.0, 2025-11-01 10:17:40
 */
public class AlipayCommerceHotelLockerAuthSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1522116698374661462L;

	/**
	 * 服务商auhtId，一次授权保证唯一，如果一次授权多个设备权限，需要在auth_id内部拼接
	 */
	@ApiField("auth_id")
	private String authId;

	/**
	 * 设备ID
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备服务商code
	 */
	@ApiField("device_isv_code")
	private String deviceIsvCode;

	/**
	 * 设备SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 默认true有效，用户权限在有效期内失效传入false
	 */
	@ApiField("effective")
	private Boolean effective;

	/**
	 * 权限生效截止时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 权限同步服务商Code
	 */
	@ApiField("operators_code")
	private String operatorsCode;

	/**
	 * 所属集团code
	 */
	@ApiField("org_group_code")
	private String orgGroupCode;

	/**
	 * 权限生效开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 根据user_relate_type传值
	 */
	@ApiField("user_relate_id")
	private String userRelateId;

	/**
	 * MOBILE,MEMBER_ID，OPEN_ID三选一
	 */
	@ApiField("user_relate_type")
	private String userRelateType;

	public String getAuthId() {
		return this.authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
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

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public Boolean getEffective() {
		return this.effective;
	}
	public void setEffective(Boolean effective) {
		this.effective = effective;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getUserRelateId() {
		return this.userRelateId;
	}
	public void setUserRelateId(String userRelateId) {
		this.userRelateId = userRelateId;
	}

	public String getUserRelateType() {
		return this.userRelateType;
	}
	public void setUserRelateType(String userRelateType) {
		this.userRelateType = userRelateType;
	}

}
