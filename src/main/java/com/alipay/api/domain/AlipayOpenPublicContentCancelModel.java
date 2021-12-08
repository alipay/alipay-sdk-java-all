package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号素材内容撤回接口
 *
 * @author auto create
 * @since 1.0, 2018-11-14 17:25:32
 */
public class AlipayOpenPublicContentCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8515187593176535419L;

	/**
	 * message_id 是发布接口调用之后拿到的返回值，用来撤回已经发布的对应内容
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
