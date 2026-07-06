package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提供给SalesForce删除项目组成员入参
 *
 * @author auto create
 * @since 1.0, 2026-04-14 14:26:31
 */
public class SaleForceLeadsMemberDeleteDTO extends AlipayObject {

	private static final long serialVersionUID = 2339351186114882216L;

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
	 * 删除人工号
	 */
	@ApiField("work_no_delete")
	private String workNoDelete;

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

	public String getWorkNoDelete() {
		return this.workNoDelete;
	}
	public void setWorkNoDelete(String workNoDelete) {
		this.workNoDelete = workNoDelete;
	}

}
