package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建模板
 *
 * @author auto create
 * @since 1.0, 2024-10-28 15:02:53
 */
public class AlipaySecurityProdTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2283453682516638943L;

	/**
	 * 负责人名字
	 */
	@ApiField("charge_name")
	private String chargeName;

	/**
	 * 负责人工号
	 */
	@ApiField("charge_no")
	private String chargeNo;

	/**
	 * 模板描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 操作人工号
	 */
	@ApiField("emp_id")
	private String empId;

	/**
	 * 文件地址
	 */
	@ApiField("file_address")
	private String fileAddress;

	/**
	 * 文件名字
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 参与人列表
	 */
	@ApiListField("participants")
	@ApiField("string")
	private List<String> participants;

	/**
	 * 来源系统
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 模板库编码
	 */
	@ApiField("template_lib_code")
	private String templateLibCode;

	/**
	 * 模板名字
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	/**
	 * 模板类型
	 */
	@ApiField("type")
	private String type;

	public String getChargeName() {
		return this.chargeName;
	}
	public void setChargeName(String chargeName) {
		this.chargeName = chargeName;
	}

	public String getChargeNo() {
		return this.chargeNo;
	}
	public void setChargeNo(String chargeNo) {
		this.chargeNo = chargeNo;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmpId() {
		return this.empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getFileAddress() {
		return this.fileAddress;
	}
	public void setFileAddress(String fileAddress) {
		this.fileAddress = fileAddress;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public List<String> getParticipants() {
		return this.participants;
	}
	public void setParticipants(List<String> participants) {
		this.participants = participants;
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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
