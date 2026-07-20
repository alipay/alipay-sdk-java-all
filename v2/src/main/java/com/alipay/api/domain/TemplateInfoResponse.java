package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-14 14:17:49
 */
public class TemplateInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 6135616666546799878L;

	/**
	 * 适用场景
	 */
	@ApiField("scenario_description")
	private String scenarioDescription;

	/**
	 * 模版ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模版名称
	 */
	@ApiField("template_name")
	private String templateName;

	public String getScenarioDescription() {
		return this.scenarioDescription;
	}
	public void setScenarioDescription(String scenarioDescription) {
		this.scenarioDescription = scenarioDescription;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
