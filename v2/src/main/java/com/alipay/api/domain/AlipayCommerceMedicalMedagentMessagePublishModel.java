package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营平台智能体消息推送
 *
 * @author auto create
 * @since 1.0, 2025-07-17 10:12:34
 */
public class AlipayCommerceMedicalMedagentMessagePublishModel extends AlipayObject {

	private static final long serialVersionUID = 7652971716984821437L;

	/**
	 * 消息内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 消息参数
	 */
	@ApiField("template_args")
	private String templateArgs;

	/**
	 * 消息模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTemplateArgs() {
		return this.templateArgs;
	}
	public void setTemplateArgs(String templateArgs) {
		this.templateArgs = templateArgs;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
