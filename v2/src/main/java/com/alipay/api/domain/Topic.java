package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销位
 *
 * @author auto create
 * @since 1.0, 2021-01-27 10:28:09
 */
public class Topic extends AlipayObject {

	private static final long serialVersionUID = 6424351636618919313L;

	/**
	 * 营销位图片url
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 跳转类型，网页:HTTP、小程序:APP
	 */
	@ApiField("link_type")
	private String linkType;

	/**
	 * 营销位跳转地址，点击营销位头图跳到的链接url。
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 营销位描述
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 营销位名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 营销位id
	 */
	@ApiField("topic_id")
	private String topicId;

	/**
	 * 营销位内容列表
	 */
	@ApiListField("topic_items")
	@ApiField("topic_item")
	private List<TopicItem> topicItems;

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getLinkType() {
		return this.linkType;
	}
	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTopicId() {
		return this.topicId;
	}
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public List<TopicItem> getTopicItems() {
		return this.topicItems;
	}
	public void setTopicItems(List<TopicItem> topicItems) {
		this.topicItems = topicItems;
	}

}
