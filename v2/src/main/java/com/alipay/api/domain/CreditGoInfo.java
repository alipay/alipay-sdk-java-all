package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻任务信息
 *
 * @author auto create
 * @since 1.0, 2024-11-26 13:18:04
 */
public class CreditGoInfo extends AlipayObject {

	private static final long serialVersionUID = 5288517449833243733L;

	/**
	 * 芝麻任务权益信息
	 */
	@ApiField("benefit")
	private String benefit;

	/**
	 * 芝麻任务信息
	 */
	@ApiField("task")
	private String task;

	/**
	 * 芝麻任务模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public String getBenefit() {
		return this.benefit;
	}
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public String getTask() {
		return this.task;
	}
	public void setTask(String task) {
		this.task = task;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
