package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家群自动回复行动配置模型
 *
 * @author auto create
 * @since 1.0, 2025-07-09 11:39:28
 */
public class GroupMsgAutoreplyActionConfigVO extends AlipayObject {

	private static final long serialVersionUID = 1734937464158549584L;

	/**
	 * 图片文件id，请先通过图片上传接口上传图片<a href="https://opendocs.alipay.com/apis/036ros">https://opendocs.alipay.com/apis/036ros</a> 并获取到 file_id 作为这个入参的值
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 消息跳转地址，输入alipays:// 或者 https://的链接
	 */
	@ApiField("link")
	private String link;

	/**
	 * 链接描述
	 */
	@ApiField("link_desc")
	private String linkDesc;

	/**
	 * 图片文件id，请先通过图片上传接口上传图片<a href="https://opendocs.alipay.com/apis/036ros">https://opendocs.alipay.com/apis/036ros</a> 并获取到 file_id 作为这个入参的值
	 */
	@ApiField("link_image_id")
	private String linkImageId;

	/**
	 * 链接标题
	 */
	@ApiField("link_title")
	private String linkTitle;

	/**
	 * 回复消息类型
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 文本回复内容
	 */
	@ApiField("text")
	private String text;

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getLinkDesc() {
		return this.linkDesc;
	}
	public void setLinkDesc(String linkDesc) {
		this.linkDesc = linkDesc;
	}

	public String getLinkImageId() {
		return this.linkImageId;
	}
	public void setLinkImageId(String linkImageId) {
		this.linkImageId = linkImageId;
	}

	public String getLinkTitle() {
		return this.linkTitle;
	}
	public void setLinkTitle(String linkTitle) {
		this.linkTitle = linkTitle;
	}

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
