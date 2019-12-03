package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分组消息发送接口
 *
 * @author auto create
 * @since 1.0, 2018-12-24 10:48:35
 */
public class AlipayOpenPublicMessageGroupSendModel extends AlipayObject {

	private static final long serialVersionUID = 5267857753273332671L;

	/**
	 * 图文消息，当msg_type为image-text，该值必须设置，图文消息中的图片建议尺寸 750 x 350px，小于3M，图片支持jpg、png格式
	 */
	@ApiListField("articles")
	@ApiField("article")
	private List<Article> articles;

	/**
	 * 用户分组ID
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 纯图片消息，暂时不支持，包含url信息，当msg_type为image时，必须设置该值 ，图片尺寸建议为1080x750px，小于3M，图片支持jpg、png格式
	 */
	@ApiField("image")
	private Image image;

	/**
	 * 消息类型，text表示文本消息，image-text表示图文消息
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 文本消息内容，当msg_type为text，必须设置该值，而且必须同时设置标题和内容字段
	 */
	@ApiField("text")
	private Text text;

	public List<Article> getArticles() {
		return this.articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Image getImage() {
		return this.image;
	}
	public void setImage(Image image) {
		this.image = image;
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
