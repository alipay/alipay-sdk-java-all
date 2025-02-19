package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 欢迎语信息
 *
 * @author auto create
 * @since 1.0, 2024-08-12 20:34:14
 */
public class AIChatWelcomeMessage extends AlipayObject {

	private static final long serialVersionUID = 1896961815113623457L;

	/**
	 * 消息内容类型
	 */
	@ApiField("msgtype")
	private String msgtype;

	/**
	 * 消息内容
	 */
	@ApiField("text")
	private String text;

	public String getMsgtype() {
		return this.msgtype;
	}
	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
