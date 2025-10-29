package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫消息域外推送到域内
 *
 * @author auto create
 * @since 1.0, 2025-09-10 19:37:09
 */
public class AlipayCommerceMedicalTobHaodfmessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 1857312113615817344L;

	/**
	 * 消息体
	 */
	@ApiField("msg_content")
	private String msgContent;

	/**
	 * 消息类型
	 */
	@ApiField("type")
	private String type;

	public String getMsgContent() {
		return this.msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
