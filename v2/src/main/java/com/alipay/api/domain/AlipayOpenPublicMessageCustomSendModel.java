package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 异步单发消息
 *
 * @author auto create
 * @since 1.0, 2024-06-04 15:32:21
 */
public class AlipayOpenPublicMessageCustomSendModel extends AlipayObject {

	private static final long serialVersionUID = 3276168982639994975L;

	/**
	 * msg_type为image-text，本参数必填。

	 */
	@ApiListField("articles")
	@ApiField("article")
	private List<Article> articles;

	/**
	 * 是否为聊天消息。枚举支持：
*0：代表非聊天消息，消息显示在生活号主页，默认为 0。
*1：代表是聊天消息，消息显示在咨询反馈列表页。
	 */
	@ApiField("chat")
	private String chat;

	/**
	 * 触发消息的事件类型，默认为空。代表商户未改造。如果是follow，代表关注消息。click代表菜单点击，enter_ppchat代表进入事件；请注意事件类型的大小写
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 消息类型。枚举支持：
* text：表示文本消息；
* image-text：表示图文消息。
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 支付宝用户的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 *  文本消息内容，当msg_type为text，本参数必填。

	 */
	@ApiField("text")
	private Text text;

	/**
	 * 消息接收用户的userid
	 */
	@ApiField("to_user_id")
	private String toUserId;

	public List<Article> getArticles() {
		return this.articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public String getChat() {
		return this.chat;
	}
	public void setChat(String chat) {
		this.chat = chat;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Text getText() {
		return this.text;
	}
	public void setText(Text text) {
		this.text = text;
	}

	public String getToUserId() {
		return this.toUserId;
	}
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

}
