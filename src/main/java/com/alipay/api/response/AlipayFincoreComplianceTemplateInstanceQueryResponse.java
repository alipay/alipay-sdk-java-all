package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AnswerDTO;
import com.alipay.api.domain.TemplateInstDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.instance.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-17 15:50:39
 */
public class AlipayFincoreComplianceTemplateInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4171319287489586568L;

	/** 
	 * 对题结果
	 */
	@ApiField("answers")
	private AnswerDTO answers;

	/** 
	 * 模版实例状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 模版实例
	 */
	@ApiField("template_instances")
	private TemplateInstDTO templateInstances;

	public void setAnswers(AnswerDTO answers) {
		this.answers = answers;
	}
	public AnswerDTO getAnswers( ) {
		return this.answers;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTemplateInstances(TemplateInstDTO templateInstances) {
		this.templateInstances = templateInstances;
	}
	public TemplateInstDTO getTemplateInstances( ) {
		return this.templateInstances;
	}

}
