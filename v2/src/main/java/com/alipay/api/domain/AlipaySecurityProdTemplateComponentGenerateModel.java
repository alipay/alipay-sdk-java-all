package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板文件地址拷贝
 *
 * @author auto create
 * @since 1.0, 2025-01-10 15:52:56
 */
public class AlipaySecurityProdTemplateComponentGenerateModel extends AlipayObject {

	private static final long serialVersionUID = 5538434843944335785L;

	/**
	 * 组件分类
	 */
	@ApiField("component_category")
	private String componentCategory;

	/**
	 * 组件类型
	 */
	@ApiField("component_type")
	private String componentType;

	/**
	 * 操作人工号
	 */
	@ApiField("emp_id")
	private String empId;

	/**
	 * 是否可编辑
	 */
	@ApiField("enable_edit")
	private Boolean enableEdit;

	/**
	 * 组件占位符
	 */
	@ApiField("placeholder")
	private String placeholder;

	/**
	 * 是否必填
	 */
	@ApiField("required")
	private Boolean required;

	/**
	 * 来源系统
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 模板编码
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 模板版本
	 */
	@ApiField("template_version")
	private String templateVersion;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getComponentCategory() {
		return this.componentCategory;
	}
	public void setComponentCategory(String componentCategory) {
		this.componentCategory = componentCategory;
	}

	public String getComponentType() {
		return this.componentType;
	}
	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	public String getEmpId() {
		return this.empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Boolean getEnableEdit() {
		return this.enableEdit;
	}
	public void setEnableEdit(Boolean enableEdit) {
		this.enableEdit = enableEdit;
	}

	public String getPlaceholder() {
		return this.placeholder;
	}
	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	public Boolean getRequired() {
		return this.required;
	}
	public void setRequired(Boolean required) {
		this.required = required;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}
	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
