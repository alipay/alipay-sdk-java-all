package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交流记录信息
 *
 * @author auto create
 * @since 1.0, 2025-06-23 14:28:27
 */
public class ChatRecordInfo extends AlipayObject {

	private static final long serialVersionUID = 8441842718323173952L;

	/**
	 * 交流记录中的信息内容
	 */
	@ApiField("msg_content")
	private String msgContent;

	/**
	 * 交流记录中发言人的昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	public String getMsgContent() {
		return this.msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
