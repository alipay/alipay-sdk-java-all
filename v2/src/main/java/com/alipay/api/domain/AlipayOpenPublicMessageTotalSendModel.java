package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * alipay.open.public. message.total.send（群发消息）
 *
 * @author auto create
 * @since 1.0, 2024-09-02 14:43:06
 */
public class AlipayOpenPublicMessageTotalSendModel extends AlipayObject {

	private static final long serialVersionUID = 4329762994131562117L;

	/**
	 * 图文消息，当 msg_type为image-text，本参数必填。

	 */
	@ApiListField("articles")
	@ApiField("article")
	private List<Article> articles;

	/**
	 * 消息类型。枚举支持：
* text：表示文本消息；
* image-text：表示图文消息。
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 当msg_type为text，本参数必填。
	 */
	@ApiField("text")
	private Text text;

	public List<Article> getArticles() {
		return this.articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public Text getText() {
		return this.text;
	}
	public void setText(Text text) {
		this.text = text;
	}

}
