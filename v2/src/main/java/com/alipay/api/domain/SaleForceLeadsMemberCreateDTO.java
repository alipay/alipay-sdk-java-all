package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 响应结果
 *
 * @author auto create
 * @since 1.0, 2026-04-15 16:12:46
 */
public class SaleForceLeadsMemberCreateDTO extends AlipayObject {

	private static final long serialVersionUID = 5365242527935558221L;

	/**
	 * 商机ID
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 海图项目组成员ID
	 */
	@ApiField("leads_member_id")
	private String leadsMemberId;

	/**
	 * 项目组成员角色枚举CODE
	 */
	@ApiField("member_role")
	private String memberRole;

	/**
	 * 项目组成员工号
	 */
	@ApiField("member_work_no")
	private String memberWorkNo;

	/**
	 * 创建人工号
	 */
	@ApiField("work_no_create")
	private String workNoCreate;

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

	public String getLeadsMemberId() {
		return this.leadsMemberId;
	}
	public void setLeadsMemberId(String leadsMemberId) {
		this.leadsMemberId = leadsMemberId;
	}

	public String getMemberRole() {
		return this.memberRole;
	}
	public void setMemberRole(String memberRole) {
		this.memberRole = memberRole;
	}

	public String getMemberWorkNo() {
		return this.memberWorkNo;
	}
	public void setMemberWorkNo(String memberWorkNo) {
		this.memberWorkNo = memberWorkNo;
	}

	public String getWorkNoCreate() {
		return this.workNoCreate;
	}
	public void setWorkNoCreate(String workNoCreate) {
		this.workNoCreate = workNoCreate;
	}

}
