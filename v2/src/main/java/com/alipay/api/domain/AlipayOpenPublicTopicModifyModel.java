package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销位修改接口
 *
 * @author auto create
 * @since 1.0, 2024-09-10 19:39:52
 */
public class AlipayOpenPublicTopicModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8164125189238594714L;

	/**
	 * 营销位图片url, 尺寸为996*450，最大不超过5M，支持格式:.jpg、.png ，请先调用<a href="https://docs.open.alipay.com/api_3/alipay.offline.material.image.upload"> 图片上传接口</a>获得图片url。营销位需要展示头图时，必须填写该参数。
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 跳转类型，网页:HTTP、小程序:APP，不传默认HTTP
	 */
	@ApiField("link_type")
	private String linkType;

	/**
	 * 营销位跳转地址，点击营销位头图跳到的链接url。营销位需要展示头图时，必须填写该参数。
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 营销位描述。营销位需要展示头图时，必须填写该参数
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
	 * 营销位内容，数量限制：大于4个，小于8个
	 */
	@ApiField("topic_items")
	private TopicItem topicItems;

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

	public TopicItem getTopicItems() {
		return this.topicItems;
	}
	public void setTopicItems(TopicItem topicItems) {
		this.topicItems = topicItems;
	}

}
