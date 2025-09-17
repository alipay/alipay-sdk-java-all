package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改审核未通过的短信模板
 *
 * @author auto create
 * @since 1.0, 2024-03-06 11:36:45
 */
public class AlipayCloudCloudpromoMessageTemplateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4616751638758943293L;

	/**
	 * 短信模板申请说明，是模板审核的参考信息之一。
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 签名名称。签名名称不区分大小写字母，如【Alipay】和【alipay】视为名称相同。
	 */
	@ApiField("sign_name")
	private String signName;

	/**
	 * 短信模板Code。
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 模板内容
	 */
	@ApiField("template_content")
	private String templateContent;

	/**
	 * 模板名称。
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * 短信类型。取值： 0：验证码。 1：短信通知。 2：推广短信。 3：国际/港澳台消息。
	 */
	@ApiField("template_type")
	private String templateType;

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSignName() {
		return this.signName;
	}
	public void setSignName(String signName) {
		this.signName = signName;
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
