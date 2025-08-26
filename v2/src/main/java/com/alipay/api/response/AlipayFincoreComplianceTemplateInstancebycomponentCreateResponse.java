package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AgmTemplateInstanceDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.instancebycomponent.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 15:49:21
 */
public class AlipayFincoreComplianceTemplateInstancebycomponentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6627928239376292172L;

	/** 
	 * 业务单据号
	 */
	@ApiField("biz_business_id")
	private String bizBusinessId;

	/** 
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 模板实例列表
	 */
	@ApiListField("template_instances")
	@ApiField("agm_template_instance_d_t_o")
	private List<AgmTemplateInstanceDTO> templateInstances;

	public void setBizBusinessId(String bizBusinessId) {
		this.bizBusinessId = bizBusinessId;
	}
	public String getBizBusinessId( ) {
		return this.bizBusinessId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTemplateInstances(List<AgmTemplateInstanceDTO> templateInstances) {
		this.templateInstances = templateInstances;
	}
	public List<AgmTemplateInstanceDTO> getTemplateInstances( ) {
		return this.templateInstances;
	}

}
