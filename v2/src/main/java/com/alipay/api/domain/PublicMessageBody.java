package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家图文消息体数据格式
 *
 * @author auto create
 * @since 1.0, 2020-06-30 20:31:17
 */
public class PublicMessageBody extends AlipayObject {

	private static final long serialVersionUID = 8452318634838684739L;

	/**
	 * 图文消息，当msg_type为image-text，该值必须设置，图文消息中的图片建议尺寸 750 x 350px，小于3M，图片支持jpg、png格式
	 */
	@ApiListField("articles")
	@ApiField("article")
	private List<Article> articles;

	/**
	 * 图文类型，目前只支持image-text 和 text
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 纯文字消息内容
	 */
	@ApiField("text")
	private TextContent text;

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

	public TextContent getText() {
		return this.text;
	}
	public void setText(TextContent text) {
		this.text = text;
	}

}
