package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口腔健康管家店员类
 *
 * @author auto create
 * @since 1.0, 2025-08-05 19:56:24
 */
public class DentalArchivesShopStaff extends AlipayObject {

	private static final long serialVersionUID = 4453672773574582657L;

	/**
	 * 店员账号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 店员角色
	 */
	@ApiField("role")
	private String role;

	/**
	 * 蚂蚁门店店员名称
	 */
	@ApiField("staff_name")
	private String staffName;

	/**
	 * 店员用户ID
	 */
	@ApiField("staff_user_id")
	private String staffUserId;

	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getStaffName() {
		return this.staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffUserId() {
		return this.staffUserId;
	}
	public void setStaffUserId(String staffUserId) {
		this.staffUserId = staffUserId;
	}

}
