package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家庭医生AI随访模板库查询
 *
 * @author auto create
 * @since 1.0, 2026-07-14 14:17:49
 */
public class AlipayCommerceMedicalHomedoctorFollowuptemplatesQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6866731776112814444L;

	/**
	 * 智能体ID，非必传参数
	 */
	@ApiField("agent_id")
	private String agentId;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

}
