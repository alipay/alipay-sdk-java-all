package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商代商户创建智能体
 *
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:53
 */
public class AlipayOpenSpAgentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6295424969287955923L;

	/**
	 * 商户支付宝账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 智能体描述
	 */
	@ApiField("agent_desc")
	private String agentDesc;

	/**
	 * 图片格式必须为：png、jpg传入使用 alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("agent_logo")
	private String agentLogo;

	/**
	 * 智能体名称
	 */
	@ApiField("agent_name")
	private String agentName;

	/**
	 * 营业执照号
	 */
	@ApiField("business_license_code")
	private String businessLicenseCode;

	/**
	 * 营业执照名称
	 */
	@ApiField("business_license_name")
	private String businessLicenseName;

	/**
	 * [{"name":"工作流构建","value":"WORKFLOW"},{"name":"简单构建","value":"SIMPLE"},{"name":"自主规划","value":"AGENTIC"},{"name":"模板实例化创建","value":"TEMPLATE"}]
	 */
	@ApiField("create_type")
	private String createType;

	/**
	 * 商家法人名称
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

	/**
	 * 当创建类型为模版实例的时候必填
	 */
	@ApiField("template_id")
	private String templateId;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getAgentDesc() {
		return this.agentDesc;
	}
	public void setAgentDesc(String agentDesc) {
		this.agentDesc = agentDesc;
	}

	public String getAgentLogo() {
		return this.agentLogo;
	}
	public void setAgentLogo(String agentLogo) {
		this.agentLogo = agentLogo;
	}

	public String getAgentName() {
		return this.agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getBusinessLicenseCode() {
		return this.businessLicenseCode;
	}
	public void setBusinessLicenseCode(String businessLicenseCode) {
		this.businessLicenseCode = businessLicenseCode;
	}

	public String getBusinessLicenseName() {
		return this.businessLicenseName;
	}
	public void setBusinessLicenseName(String businessLicenseName) {
		this.businessLicenseName = businessLicenseName;
	}

	public String getCreateType() {
		return this.createType;
	}
	public void setCreateType(String createType) {
		this.createType = createType;
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
