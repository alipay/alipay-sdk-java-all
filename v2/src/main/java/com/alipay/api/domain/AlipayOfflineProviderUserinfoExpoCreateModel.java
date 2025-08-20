package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 展会核验用户入库
 *
 * @author auto create
 * @since 1.0, 2025-06-10 19:06:37
 */
public class AlipayOfflineProviderUserinfoExpoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1272848454451983576L;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 公司职务
	 */
	@ApiField("meeting_role")
	private String meetingRole;

	/**
	 * 用户手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 活动最小单元ID
	 */
	@ApiField("time_uuid")
	private String timeUuid;

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getMeetingRole() {
		return this.meetingRole;
	}
	public void setMeetingRole(String meetingRole) {
		this.meetingRole = meetingRole;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTimeUuid() {
		return this.timeUuid;
	}
	public void setTimeUuid(String timeUuid) {
		this.timeUuid = timeUuid;
	}

}
