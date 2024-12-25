package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv机构信息
 *
 * @author auto create
 * @since 1.0, 2024-05-21 18:22:28
 */
public class TuitionISVAgentInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3197253728952542991L;

	/**
	 * 二级机构名称
	 */
	@ApiField("agent_sub_name")
	private String agentSubName;

	/**
	 * 机构isv机构pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * isv机构sub pid
	 */
	@ApiField("sub_pid")
	private String subPid;

	public String getAgentSubName() {
		return this.agentSubName;
	}
	public void setAgentSubName(String agentSubName) {
		this.agentSubName = agentSubName;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSubPid() {
		return this.subPid;
	}
	public void setSubPid(String subPid) {
		this.subPid = subPid;
	}

}
