package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板跨库同步
 *
 * @author auto create
 * @since 1.0, 2024-10-28 15:02:16
 */
public class AlipaySecurityProdTemplateSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1331467529736471931L;

	/**
	 * 操作人工号
	 */
	@ApiField("emp_id")
	private String empId;

	/**
	 * 来源系统
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 来源模板code
	 */
	@ApiField("source_template_code")
	private String sourceTemplateCode;

	/**
	 * 来源模板库code
	 */
	@ApiField("source_template_lib_code")
	private String sourceTemplateLibCode;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	/**
	 * 目标模板code
	 */
	@ApiField("tgt_template_code")
	private String tgtTemplateCode;

	/**
	 * 目标模板库code
	 */
	@ApiField("tgt_template_lib_code")
	private String tgtTemplateLibCode;

	/**
	 * 目标模板名
	 */
	@ApiField("tgt_template_name")
	private String tgtTemplateName;

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

	public String getSourceTemplateCode() {
		return this.sourceTemplateCode;
	}
	public void setSourceTemplateCode(String sourceTemplateCode) {
		this.sourceTemplateCode = sourceTemplateCode;
	}

	public String getSourceTemplateLibCode() {
		return this.sourceTemplateLibCode;
	}
	public void setSourceTemplateLibCode(String sourceTemplateLibCode) {
		this.sourceTemplateLibCode = sourceTemplateLibCode;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public String getTgtTemplateCode() {
		return this.tgtTemplateCode;
	}
	public void setTgtTemplateCode(String tgtTemplateCode) {
		this.tgtTemplateCode = tgtTemplateCode;
	}

	public String getTgtTemplateLibCode() {
		return this.tgtTemplateLibCode;
	}
	public void setTgtTemplateLibCode(String tgtTemplateLibCode) {
		this.tgtTemplateLibCode = tgtTemplateLibCode;
	}

	public String getTgtTemplateName() {
		return this.tgtTemplateName;
	}
	public void setTgtTemplateName(String tgtTemplateName) {
		this.tgtTemplateName = tgtTemplateName;
	}

}
