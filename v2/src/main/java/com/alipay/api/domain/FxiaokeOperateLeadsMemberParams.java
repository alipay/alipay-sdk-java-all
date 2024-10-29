package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提供给纷享销客的操作商机成员的接口的参数
 *
 * @author auto create
 * @since 1.0, 2023-08-24 16:31:16
 */
public class FxiaokeOperateLeadsMemberParams extends AlipayObject {

	private static final long serialVersionUID = 8623397356312219486L;

	/**
	 * 纷享销客商机成员主键
	 */
	@ApiField("fxiaoke_leads_member_id")
	private String fxiaokeLeadsMemberId;

	/**
	 * 是否为负责人 0 是 不可删除 1 否
	 */
	@ApiField("is_leader")
	private String isLeader;

	/**
	 * 商机id
	 */
	@ApiField("leads_id")
	private Long leadsId;

	/**
	 * 海图商机成员主键
	 */
	@ApiField("leads_member_id")
	private String leadsMemberId;

	/**
	 * 成员角色
	 */
	@ApiField("member_role")
	private String memberRole;

	/**
	 * 成员工号
	 */
	@ApiField("member_work_no")
	private String memberWorkNo;

	/**
	 * 创建人
	 */
	@ApiField("work_no_create")
	private String workNoCreate;

	/**
	 * 更新人
	 */
	@ApiField("work_no_update")
	private String workNoUpdate;

	public String getFxiaokeLeadsMemberId() {
		return this.fxiaokeLeadsMemberId;
	}
	public void setFxiaokeLeadsMemberId(String fxiaokeLeadsMemberId) {
		this.fxiaokeLeadsMemberId = fxiaokeLeadsMemberId;
	}

	public String getIsLeader() {
		return this.isLeader;
	}
	public void setIsLeader(String isLeader) {
		this.isLeader = isLeader;
	}

	public Long getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(Long leadsId) {
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

	public String getWorkNoUpdate() {
		return this.workNoUpdate;
	}
	public void setWorkNoUpdate(String workNoUpdate) {
		this.workNoUpdate = workNoUpdate;
	}

}
