package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量条件查询模板
 *
 * @author auto create
 * @since 1.0, 2025-01-10 15:52:06
 */
public class AlipaySecurityProdTemplateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2262837475514631741L;

	/**
	 * 接口调用人工号
	 */
	@ApiField("emp_id")
	private String empId;

	/**
	 * 来源系统名，可以是后端应用名字
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 模板状态，可以是enable和disable
	 */
	@ApiField("status")
	private String status;

	/**
	 * 模板编码集合，支持批量查询模板
	 */
	@ApiListField("template_codes")
	@ApiField("string")
	private List<String> templateCodes;

	/**
	 * 模板所属的模板库编码
	 */
	@ApiField("template_lib_code")
	private String templateLibCode;

	/**
	 * 模板名字，支持模糊匹配
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * 模板中心租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getEmpId() {
		return this.empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
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

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
