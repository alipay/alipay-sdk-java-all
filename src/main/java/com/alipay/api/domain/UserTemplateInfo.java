package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开发者的模板列表
 *
 * @author auto create
 * @since 1.0, 2018-01-18 11:46:46
 */
public class UserTemplateInfo extends AlipayObject {

	private static final long serialVersionUID = 6162685965231681956L;

	/**
	 * 用户模板的关键词列表
	 */
	@ApiListField("keyword_list")
	@ApiField("user_template_keyword")
	private List<UserTemplateKeyword> keywordList;

	/**
	 * 模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * 开发者申请的模板id号，使用该模板id号，开发者可以调用alipay.open.app.mini.templatemessage.send接口进行模板消息发送
	 */
	@ApiField("user_template_id")
	private String userTemplateId;

	public List<UserTemplateKeyword> getKeywordList() {
		return this.keywordList;
	}
	public void setKeywordList(List<UserTemplateKeyword> keywordList) {
		this.keywordList = keywordList;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getUserTemplateId() {
		return this.userTemplateId;
	}
	public void setUserTemplateId(String userTemplateId) {
		this.userTemplateId = userTemplateId;
	}

}
