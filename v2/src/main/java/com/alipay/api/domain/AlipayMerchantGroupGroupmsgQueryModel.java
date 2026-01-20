package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询群发消息发送详情
 *
 * @author auto create
 * @since 1.0, 2025-09-11 10:24:35
 */
public class AlipayMerchantGroupGroupmsgQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1216288632812738633L;

	/**
	 * 消息id
	 */
	@ApiField("msg_id")
	private String msgId;

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

}
