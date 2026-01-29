package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询核身结果
 *
 * @author auto create
 * @since 1.0, 2025-12-29 15:17:43
 */
public class AlipayOfflineProviderNpassporterVerifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2249563141914213835L;

	/**
	 * mac地址
	 */
	@ApiField("mac_address")
	private String macAddress;

	/**
	 * 默认10分钟，查询最近10分钟内是否有核身成功记录
	 */
	@ApiField("minutes_ago")
	private Long minutesAgo;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 手机号
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 活动单号
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getMacAddress() {
		return this.macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public Long getMinutesAgo() {
		return this.minutesAgo;
	}
	public void setMinutesAgo(Long minutesAgo) {
		this.minutesAgo = minutesAgo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
