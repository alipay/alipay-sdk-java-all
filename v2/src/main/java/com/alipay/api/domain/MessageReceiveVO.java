package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息接收模型
 *
 * @author auto create
 * @since 1.0, 2023-11-03 11:51:08
 */
public class MessageReceiveVO extends AlipayObject {

	private static final long serialVersionUID = 6633161455898127394L;

	/**
	 * 消息枚举
	 */
	@ApiField("msg_enum")
	private String msgEnum;

	/**
	 * 消息接收状态
	 */
	@ApiField("msg_receive_state")
	private Boolean msgReceiveState;

	public String getMsgEnum() {
		return this.msgEnum;
	}
	public void setMsgEnum(String msgEnum) {
		this.msgEnum = msgEnum;
	}

	public Boolean getMsgReceiveState() {
		return this.msgReceiveState;
	}
	public void setMsgReceiveState(Boolean msgReceiveState) {
		this.msgReceiveState = msgReceiveState;
	}

}
