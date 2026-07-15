package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据模板ID查询问题列表
 *
 * @author auto create
 * @since 1.0, 2026-07-14 14:14:39
 */
public class AlipayCommerceMedicalHomedoctorFollowupquestionsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2445149421613988984L;

	/**
	 * 智能体ID
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * AI随访模版ID
	 */
	@ApiField("template_id")
	private String templateId;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
