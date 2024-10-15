package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模板实例化（依据组件）
 *
 * @author auto create
 * @since 1.0, 2024-05-13 15:01:14
 */
public class AlipayFincoreComplianceTemplateInstancebycomponentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4846366997353794435L;

	/**
	 * 业务单据号
	 */
	@ApiField("biz_business_id")
	private String bizBusinessId;

	/**
	 * 组件实例列表
	 */
	@ApiListField("component_inst_dtos")
	@ApiField("agm_component_instance_d_t_o")
	private List<AgmComponentInstanceDTO> componentInstDtos;

	/**
	 * 幂等值，如果幂等键已存在数据，则直接返回该数据，默认取业务单据号
	 */
	@ApiField("idempotent")
	private String idempotent;

	/**
	 * 来源系统id
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 模板编码
	 */
	@ApiListField("template_codes")
	@ApiField("string")
	private List<String> templateCodes;

	/**
	 * 业务模板库编码
	 */
	@ApiField("template_lib_code")
	private String templateLibCode;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getBizBusinessId() {
		return this.bizBusinessId;
	}
	public void setBizBusinessId(String bizBusinessId) {
		this.bizBusinessId = bizBusinessId;
	}

	public List<AgmComponentInstanceDTO> getComponentInstDtos() {
		return this.componentInstDtos;
	}
	public void setComponentInstDtos(List<AgmComponentInstanceDTO> componentInstDtos) {
		this.componentInstDtos = componentInstDtos;
	}

	public String getIdempotent() {
		return this.idempotent;
	}
	public void setIdempotent(String idempotent) {
		this.idempotent = idempotent;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public List<String> getTemplateCodes() {
		return this.templateCodes;
	}
	public void setTemplateCodes(List<String> templateCodes) {
		this.templateCodes = templateCodes;
	}

	public String getTemplateLibCode() {
		return this.templateLibCode;
	}
	public void setTemplateLibCode(String templateLibCode) {
		this.templateLibCode = templateLibCode;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
