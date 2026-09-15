package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能体审核通过后返回的完整智能体信息。
 *
 * @author auto create
 * @since 1.0, 2026-08-21 17:42:01
 */
public class KyaAgentInfo extends AlipayObject {

	private static final long serialVersionUID = 4352431578628399189L;

	/**
	 * 支付宝侧智能体唯一ID。
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 审核通过时智能体状态固定为ONLINE。
	 */
	@ApiField("agent_status")
	private String agentStatus;

	/**
	 * 审核通过时审核状态固定为CONFIRM。
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 智能体载体，字段格式由platform决定。
	 */
	@ApiField("carrier")
	private String carrier;

	/**
	 * 审核通过后自动推进为认证通过，状态固定为CONFIRM。
	 */
	@ApiField("cert_status")
	private String certStatus;

	/**
	 * 智能体Logo，支持AFTS fileId或HTTPS地址。
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 智能体名称。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 智能体所在端：WEB表示网页或MCP智能体，APP表示移动应用智能体。
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 智能体简介，用于智能体信息展示。
	 */
	@ApiField("sub_name")
	private String subName;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentStatus() {
		return this.agentStatus;
	}
	public void setAgentStatus(String agentStatus) {
		this.agentStatus = agentStatus;
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getCarrier() {
		return this.carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getCertStatus() {
		return this.certStatus;
	}
	public void setCertStatus(String certStatus) {
		this.certStatus = certStatus;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getSubName() {
		return this.subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}

}
