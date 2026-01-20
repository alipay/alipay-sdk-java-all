package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校验坐席可用接口
 *
 * @author auto create
 * @since 1.0, 2025-12-01 11:12:41
 */
public class AlipayIserviceCsfuAgentstatusCheckModel extends AlipayObject {

	private static final long serialVersionUID = 2737947449988952237L;

	/**
	 * 坐席code标识
	 */
	@ApiField("agent_code")
	private String agentCode;

	/**
	 * 坐席所属租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getAgentCode() {
		return this.agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
