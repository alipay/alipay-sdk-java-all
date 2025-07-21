package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AgmTemplateInstanceDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.instance.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-31 19:46:41
 */
public class AlipayFincoreComplianceTemplateInstanceInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2821742119585428194L;

	/** 
	 * 业务唯一单据号
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
	@ApiField("template_instances")
	private AgmTemplateInstanceDTO templateInstances;

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

	public void setTemplateInstances(AgmTemplateInstanceDTO templateInstances) {
		this.templateInstances = templateInstances;
	}
	public AgmTemplateInstanceDTO getTemplateInstances( ) {
		return this.templateInstances;
	}

}
