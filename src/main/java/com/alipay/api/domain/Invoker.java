package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 调用者标识
 *
 * @author auto create
 * @since 1.0, 2019-06-16 15:39:25
 */
public class Invoker extends AlipayObject {

	private static final long serialVersionUID = 8789378613439946154L;

	/**
	 * 代理人支付宝 id
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 代理经办cid
	 */
	@ApiField("agent_org_cid")
	private String agentOrgCid;

	/**
	 * 技术isv cid
	 */
	@ApiField("tech_org_agent_cid")
	private String techOrgAgentCid;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentOrgCid() {
		return this.agentOrgCid;
	}
	public void setAgentOrgCid(String agentOrgCid) {
		this.agentOrgCid = agentOrgCid;
	}

	public String getTechOrgAgentCid() {
		return this.techOrgAgentCid;
	}
	public void setTechOrgAgentCid(String techOrgAgentCid) {
		this.techOrgAgentCid = techOrgAgentCid;
	}

}
