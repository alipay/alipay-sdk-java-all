package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询群发消息发送详情
 *
 * @author auto create
 * @since 1.0, 2025-03-31 16:32:21
 */
public class AlipayMerchantGroupGroupmsgQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5371346195178731852L;

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
