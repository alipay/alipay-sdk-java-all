package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提供给SalesForce更新项目组成员入参
 *
 * @author auto create
 * @since 1.0, 2026-04-15 16:12:46
 */
public class SaleForceLeadsMemberModifyDTO extends AlipayObject {

	private static final long serialVersionUID = 4771776928663722543L;

	/**
	 * 商机ID
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 项目组成员ID
	 */
	@ApiField("leads_member_id")
	private String leadsMemberId;

	/**
	 * 新项目组成员角色
	 */
	@ApiField("new_member_role")
	private String newMemberRole;

	/**
	 * 新项目组成员工号
	 */
	@ApiField("new_member_work_no")
	private String newMemberWorkNo;

	/**
	 * 更新人工号
	 */
	@ApiField("work_no_update")
	private String workNoUpdate;

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

	public String getNewMemberRole() {
		return this.newMemberRole;
	}
	public void setNewMemberRole(String newMemberRole) {
		this.newMemberRole = newMemberRole;
	}

	public String getNewMemberWorkNo() {
		return this.newMemberWorkNo;
	}
	public void setNewMemberWorkNo(String newMemberWorkNo) {
		this.newMemberWorkNo = newMemberWorkNo;
	}

	public String getWorkNoUpdate() {
		return this.workNoUpdate;
	}
	public void setWorkNoUpdate(String workNoUpdate) {
		this.workNoUpdate = workNoUpdate;
	}

}
