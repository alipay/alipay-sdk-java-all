package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息对象
 *
 * @author auto create
 * @since 1.0, 2024-08-19 10:55:08
 */
public class AichatPushMsgVO extends AlipayObject {

	private static final long serialVersionUID = 4622168492637497777L;

	/**
	 * 待推送的消息内容
	 */
	@ApiField("msg_content")
	private String msgContent;

	/**
	 * 一个消息的唯一id
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 智能体的小程序模版id
	 */
	@ApiField("scene_id")
	private String sceneId;

	public String getMsgContent() {
		return this.msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

}
