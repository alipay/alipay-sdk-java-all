package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询智能体审核结果
 *
 * @author auto create
 * @since 1.0, 2026-08-31 14:17:56
 */
public class AlipayOpenAgentAuditQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6787442154822599128L;

	/**
	 * 智能体唯一标识
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * alipay.open.agent.audit.submit 返回的审核单号
	 */
	@ApiField("audit_id")
	private String auditId;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAuditId() {
		return this.auditId;
	}
	public void setAuditId(String auditId) {
		this.auditId = auditId;
	}

}
