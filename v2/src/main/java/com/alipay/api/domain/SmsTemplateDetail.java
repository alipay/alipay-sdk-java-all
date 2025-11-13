package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 短信模板详情
 *
 * @author auto create
 * @since 1.0, 2024-02-22 14:28:56
 */
public class SmsTemplateDetail extends AlipayObject {

	private static final long serialVersionUID = 1756519133625789893L;

	/**
	 * 模板审批状态。取值：
AUDIT_STATE_INIT：审核中。
AUDIT_STATE_PASS：审核通过。
AUDIT_STATE_NOT_PASS：审核未通过，请在返回参数Reason中查看审核未通过原因。
AUDIT_STATE_CANCEL：取消审核。
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 短信模板的创建时间
	 */
	@ApiField("create_date")
	private Date createDate;

	/**
	 * 审核备注:
如果审核状态为审核通过或审核中，参数Reason显示为“无审批备注”。
如果审核状态为审核未通过，参数Reason显示审核的具体原因。
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 短信模板CODE。
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 模板内容。
	 */
	@ApiField("template_content")
	private String templateContent;

	/**
	 * 模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * 模板类型（推荐对外使用）。取值：

0：验证码短信。
1：通知短信。
2：推广短信。
3：国际/港澳台短信。
	 */
	@ApiField("template_type")
	private String templateType;

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getTemplateContent() {
		return this.templateContent;
	}
	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTemplateType() {
		return this.templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

}
