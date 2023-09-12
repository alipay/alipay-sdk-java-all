package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单发模板消息
 *
 * @author auto create
 * @since 1.0, 2022-11-18 15:13:48
 */
public class AlipayOpenPublicMessageSingleSendModel extends AlipayObject {

	private static final long serialVersionUID = 7132967691836987411L;

	/**
	 * 消息模板相关参数，其中包括templateId模板ID和context模板上下文
	 */
	@ApiField("template")
	private Template template;

	/**
	 * 支付宝openId，用于支付宝用户在当前应用下的用户标识。
	 */
	@ApiField("to_open_id")
	private String toOpenId;

	/**
	 * 消息接收用户的支付宝用户id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
	 */
	@ApiField("to_user_id")
	private String toUserId;

	public Template getTemplate() {
		return this.template;
	}
	public void setTemplate(Template template) {
		this.template = template;
	}

	public String getToOpenId() {
		return this.toOpenId;
	}
	public void setToOpenId(String toOpenId) {
		this.toOpenId = toOpenId;
	}

	public String getToUserId() {
		return this.toUserId;
	}
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

}
