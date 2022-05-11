package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发送消息内容
 *
 * @author auto create
 * @since 1.0, 2016-12-02 15:56:25
 */
public class Material extends AlipayObject {

	private static final long serialVersionUID = 5438824632449655421L;

	/**
	 * 图文消息子消息项集合，单条消息最多6个子项，否则会发送失败
	 */
	@ApiListField("articles")
	@ApiField("article")
	private List<Article> articles;

	/**
	 * 消息类型，text：文本类型，image-text：图文类型。当消息类型为text时，text参数必传，当消息类型为image-text时，articles参数必传
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 文本消息内容
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
