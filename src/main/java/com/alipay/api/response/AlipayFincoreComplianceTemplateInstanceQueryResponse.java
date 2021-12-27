package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TemplateInstDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.instance.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-23 14:30:40
 */
public class AlipayFincoreComplianceTemplateInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8386123298494753775L;

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
