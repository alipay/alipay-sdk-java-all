package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 流式消息
 *
 * @author auto create
 * @since 1.0, 2024-09-24 13:28:19
 */
public class StreamMessage extends AlipayObject {

	private static final long serialVersionUID = 7357462167293849412L;

	/**
	 * 对话请求发起侧自定义生成的对话标识Id 当前字段已废弃(已废弃 通过chatId进行替代)
	 */
	@ApiField("api_chat_id")
	@Deprecated
	private String apiChatId;

	/**
	 * 对话id
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 单次推送的内容
	 */
	@ApiListField("contents")
	@ApiField("content_unit")
	private List<ContentUnit> contents;

	/**
	 * 创建时间时间戳
	 */
	@ApiField("create_time")
	private Long createTime;

	/**
	 * 识别到的意图编码
	 */
	@ApiField("intention")
	private String intention;

	/**
	 * 单次消息id
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 用于区分同一个app下的机构
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 标识流式当前流式对话状态
	 */
	@ApiField("reply_cmd")
	private String replyCmd;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 推送轮次
	 */
	@ApiField("turn")
	private String turn;

	public String getApiChatId() {
		return this.apiChatId;
	}
	public void setApiChatId(String apiChatId) {
		this.apiChatId = apiChatId;
	}

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public List<ContentUnit> getContents() {
		return this.contents;
	}
	public void setContents(List<ContentUnit> contents) {
		this.contents = contents;
	}

	public Long getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getIntention() {
		return this.intention;
	}
	public void setIntention(String intention) {
		this.intention = intention;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getReplyCmd() {
		return this.replyCmd;
	}
	public void setReplyCmd(String replyCmd) {
		this.replyCmd = replyCmd;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getTurn() {
		return this.turn;
	}
	public void setTurn(String turn) {
		this.turn = turn;
	}

}
