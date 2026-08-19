package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提交智能体审核资料
 *
 * @author auto create
 * @since 1.0, 2026-08-06 19:27:50
 */
public class AlipayOpenAgentAuditSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 3371571635296963925L;

	/**
	 * 智能体功能介绍  
	 */
	@ApiField("agent_desc")
	private String agentDesc;

	/**
	 * 智能体的唯一标识
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 传文件ID(由 alipay.open.file.upload 返回，非 URL;图片格式 JPG/PNG
	 */
	@ApiField("agent_logo")
	private String agentLogo;

	/**
	 * 智能体名称
	 */
	@ApiField("agent_name")
	private String agentName;

	public String getAgentDesc() {
		return this.agentDesc;
	}
	public void setAgentDesc(String agentDesc) {
		this.agentDesc = agentDesc;
	}

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentLogo() {
		return this.agentLogo;
	}
	public void setAgentLogo(String agentLogo) {
		this.agentLogo = agentLogo;
	}

	public String getAgentName() {
		return this.agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

}
