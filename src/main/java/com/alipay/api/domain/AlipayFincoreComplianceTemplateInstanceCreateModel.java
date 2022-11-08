package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 异步创建模版实例
 *
 * @author auto create
 * @since 1.0, 2021-12-23 14:29:37
 */
public class AlipayFincoreComplianceTemplateInstanceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1211194737816118751L;

	/**
	 * 业务单据号
	 */
	@ApiField("biz_business_id")
	private String bizBusinessId;

	/**
	 * 业务要素字段
	 */
	@ApiField("biz_object_def_json")
	private String bizObjectDefJson;

	/**
	 * 员工工号
	 */
	@ApiField("emp_id")
	private String empId;

	/**
	 * 员工名称
	 */
	@ApiField("emp_name")
	private String empName;

	/**
	 * 系统来源
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 模版库编码
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

	public String getBizObjectDefJson() {
		return this.bizObjectDefJson;
	}
	public void setBizObjectDefJson(String bizObjectDefJson) {
		this.bizObjectDefJson = bizObjectDefJson;
	}

	public String getEmpId() {
		return this.empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return this.empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
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
