package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分组消息发送接口
 *
 * @author auto create
 * @since 1.0, 2022-10-12 17:23:24
 */
public class AlipayOpenPublicMessageGroupSendModel extends AlipayObject {

	private static final long serialVersionUID = 3526546762276113474L;

	/**
	 * 图文消息，当 msg_type为image-text，本参数必填。
	 */
	@ApiListField("articles")
	@ApiField("article")
	private List<Article> articles;

	/**
	 * 分组ID，通过<a href="https://opendocs.alipay.com/apis/api_6/alipay.open.public.group.create">alipay.open.public.group.create</a>（用户分组创建接口)
创建用户分组获取。
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 纯图片消息，暂时不支持，包含url信息，当msg_type为image时，必须设置该值 ，图片尺寸建议为1080x750px，小于3M，图片支持jpg、png格式
	 */
	@ApiField("image")
	private Image image;

	/**
	 * 消息类型。枚举支持：
* text：表示文本消息；
* image-text：表示图文消息。

	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 文本消息内容，当msg_type为text，本参数必填。
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
