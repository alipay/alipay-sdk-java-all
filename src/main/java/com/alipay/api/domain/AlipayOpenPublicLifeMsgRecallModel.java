package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号消息撤回接口
 *
 * @author auto create
 * @since 1.0, 2017-08-28 17:30:50
 */
public class AlipayOpenPublicLifeMsgRecallModel extends AlipayObject {

	private static final long serialVersionUID = 7394387982764579339L;

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
