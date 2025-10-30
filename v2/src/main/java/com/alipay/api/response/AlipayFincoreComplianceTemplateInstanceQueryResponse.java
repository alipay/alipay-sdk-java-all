package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AnswerDTO;
import com.alipay.api.domain.TemplateInstDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.instance.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-12 11:12:05
 */
public class AlipayFincoreComplianceTemplateInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8735588261673282379L;

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
	 * 返回的实例列表
	 */
	@ApiListField("template_instance_list")
	@ApiField("template_inst_d_t_o")
	private List<TemplateInstDTO> templateInstanceList;

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

	public void setTemplateInstanceList(List<TemplateInstDTO> templateInstanceList) {
		this.templateInstanceList = templateInstanceList;
	}
	public List<TemplateInstDTO> getTemplateInstanceList( ) {
		return this.templateInstanceList;
	}

	public void setTemplateInstances(TemplateInstDTO templateInstances) {
		this.templateInstances = templateInstances;
	}
	public TemplateInstDTO getTemplateInstances( ) {
		return this.templateInstances;
	}

}
