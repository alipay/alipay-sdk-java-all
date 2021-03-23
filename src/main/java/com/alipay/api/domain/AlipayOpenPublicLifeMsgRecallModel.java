package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号消息撤回接口
 *
 * @author auto create
 * @since 1.0, 2020-09-24 17:10:38
 */
public class AlipayOpenPublicLifeMsgRecallModel extends AlipayObject {

	private static final long serialVersionUID = 1394448586899465845L;

	/**
	 * 消息id
	 */
	@ApiField("message_id")
	private String messageId;

	public String getMessageId() {
		return this.messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

}
