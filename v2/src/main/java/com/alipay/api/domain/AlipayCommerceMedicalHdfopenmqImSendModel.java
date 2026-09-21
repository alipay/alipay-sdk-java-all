package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫im消息顾问同步
 *
 * @author auto create
 * @since 1.0, 2026-08-24 19:27:49
 */
public class AlipayCommerceMedicalHdfopenmqImSendModel extends AlipayObject {

	private static final long serialVersionUID = 6716525175814747868L;

	/**
	 * 消息幂等id
	 */
	@ApiField("bizid")
	private String bizid;

	/**
	 * 消息内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 好大夫消息id
	 */
	@ApiField("msgid")
	private String msgid;

	public String getBizid() {
		return this.bizid;
	}
	public void setBizid(String bizid) {
		this.bizid = bizid;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getMsgid() {
		return this.msgid;
	}
	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}

}
