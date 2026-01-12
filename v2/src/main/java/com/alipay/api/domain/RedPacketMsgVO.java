package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家群红包消息模型
 *
 * @author auto create
 * @since 1.0, 2025-11-25 14:39:22
 */
public class RedPacketMsgVO extends AlipayObject {

	private static final long serialVersionUID = 2121798682759419788L;

	/**
	 * 红包ID
	 */
	@ApiField("red_packet_id")
	private String redPacketId;

	public String getRedPacketId() {
		return this.redPacketId;
	}
	public void setRedPacketId(String redPacketId) {
		this.redPacketId = redPacketId;
	}

}
