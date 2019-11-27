package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单发模板消息
 *
 * @author auto create
 * @since 1.0, 2019-10-10 10:52:26
 */
public class AlipayOpenPublicMessageSingleSendModel extends AlipayObject {

	private static final long serialVersionUID = 3696334553252531247L;

	/**
	 * 消息模板相关参数，其中包括templateId模板ID和context模板上下文
	 */
	@ApiField("template")
	private Template template;

	/**
	 * 消息接收用户的userid
	 */
	@ApiField("to_user_id")
	private String toUserId;

	public Template getTemplate() {
		return this.template;
	}
	public void setTemplate(Template template) {
		this.template = template;
	}

	public String getToUserId() {
		return this.toUserId;
	}
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

}
