package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口腔健康管家店员类
 *
 * @author auto create
 * @since 1.0, 2025-06-13 10:05:23
 */
public class DentalArchivesShopStaff extends AlipayObject {

	private static final long serialVersionUID = 7845195772969123152L;

	/**
	 * 店员账号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

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

	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
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

}
