package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 展会核验用户入库
 *
 * @author auto create
 * @since 1.0, 2025-08-20 20:39:38
 */
public class AlipayOfflineProviderUserinfoExpoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6519961652646771949L;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 身份证号。可以传明文，也可以传身份证号的32位大写MD5值。尽量使用MD5值
	 */
	@ApiField("identity_card")
	private String identityCard;

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
	 * 多个参数录入可选，tag_code和tag_name至多传一个
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 多个参数录入可选，tag_code和tag_name至多传一个
	 */
	@ApiField("tag_name")
	private String tagName;

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

	public String getIdentityCard() {
		return this.identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
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

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

	public String getTagName() {
		return this.tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTimeUuid() {
		return this.timeUuid;
	}
	public void setTimeUuid(String timeUuid) {
		this.timeUuid = timeUuid;
	}

}
