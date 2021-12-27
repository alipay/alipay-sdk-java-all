package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 城服域内转发调用沟通平台开放接口
 *
 * @author auto create
 * @since 1.0, 2020-12-24 22:43:21
 */
public class AlipayEcoCityserviceMessageUniversalSendModel extends AlipayObject {

	private static final long serialVersionUID = 3353819584867383274L;

	/**
	 * 模板中占位符模型列表
	 */
	@ApiListField("keyword_list")
	@ApiField("universal_keyword")
	private List<UniversalKeyword> keywordList;

	/**
	 * 生活号/小程序/内部小程序/内部应用appId
	 */
	@ApiField("message_app_id")
	private String messageAppId;

	/**
	 * 沟通平台模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 第三方消息Id
	 */
	@ApiField("third_msg_id")
	private String thirdMsgId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<UniversalKeyword> getKeywordList() {
		return this.keywordList;
	}
	public void setKeywordList(List<UniversalKeyword> keywordList) {
		this.keywordList = keywordList;
	}

	public String getMessageAppId() {
		return this.messageAppId;
	}
	public void setMessageAppId(String messageAppId) {
		this.messageAppId = messageAppId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getThirdMsgId() {
		return this.thirdMsgId;
	}
	public void setThirdMsgId(String thirdMsgId) {
		this.thirdMsgId = thirdMsgId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
