package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云霄黑名单新增
 *
 * @author auto create
 * @since 1.0, 2025-09-25 17:46:06
 */
public class AlipayIserviceCcmCrmYxblacklistSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5526477835827254369L;

	/**
	 * 黑名单的备注信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 黑名单失效时间
	 */
	@ApiField("invalid_time")
	private Long invalidTime;

	/**
	 * 黑名单手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 毫秒时间戳
	 */
	@ApiField("take_time")
	private Long takeTime;

	/**
	 * 租户ID，由蚂蚁侧提供给调用方
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 黑名单客户名称
	 */
	@ApiField("user_name")
	private String userName;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Long getInvalidTime() {
		return this.invalidTime;
	}
	public void setInvalidTime(Long invalidTime) {
		this.invalidTime = invalidTime;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Long getTakeTime() {
		return this.takeTime;
	}
	public void setTakeTime(Long takeTime) {
		this.takeTime = takeTime;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
