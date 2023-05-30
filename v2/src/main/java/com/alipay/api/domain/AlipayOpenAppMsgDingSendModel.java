package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发送钉钉企业会话消息接口
 *
 * @author auto create
 * @since 1.0, 2016-11-29 12:55:20
 */
public class AlipayOpenAppMsgDingSendModel extends AlipayObject {

	private static final long serialVersionUID = 4167152117192263765L;

	/**
	 * 钉钉企业应用ID
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 消息类型为text时表示消息内容、消息类型为link时表示消息描述
	 */
	@ApiField("content")
	private String content;

	/**
	 * 消息类型为link时的消息点击链接地址
	 */
	@ApiField("goto_url")
	private String gotoUrl;

	/**
	 * 消息类型为link时的图片地址，支持jpg格式图片，大小不超过1MB
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 消息类型，文本为text；链接为link
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 接收者，个人为single；部门为department
	 */
	@ApiField("receiver")
	private String receiver;

	/**
	 * 消息类型为link时的消息标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 用户UID列表
	 */
	@ApiListField("user_ids")
	@ApiField("string")
	private List<String> userIds;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getGotoUrl() {
		return this.gotoUrl;
	}
	public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getReceiver() {
		return this.receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getUserIds() {
		return this.userIds;
	}
	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}

}
