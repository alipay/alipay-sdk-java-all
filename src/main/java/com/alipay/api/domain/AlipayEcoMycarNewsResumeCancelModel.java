package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV资讯概要信息撤消
 *
 * @author auto create
 * @since 1.0, 2016-10-25 14:21:30
 */
public class AlipayEcoMycarNewsResumeCancelModel extends AlipayObject {

	private static final long serialVersionUID = 7859758164175678673L;

	/**
	 * 消息ID
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
