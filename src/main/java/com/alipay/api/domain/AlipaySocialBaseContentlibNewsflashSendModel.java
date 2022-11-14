package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容中台快讯插入接口
 *
 * @author auto create
 * @since 1.0, 2018-05-14 14:10:07
 */
public class AlipaySocialBaseContentlibNewsflashSendModel extends AlipayObject {

	private static final long serialVersionUID = 5541157764834134666L;

	/**
	 * 作者
	 */
	@ApiField("author")
	private String author;

	/**
	 * 内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 扩展信息，json格式数据
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 配图地址
	 */
	@ApiField("images")
	private String images;

	/**
	 * 标签, 多个用逗号隔开
	 */
	@ApiField("opr_tags")
	private String oprTags;

	/**
	 * 发布时间
	 */
	@ApiField("publish_date")
	private Date publishDate;

	/**
	 * 推荐权重，0：不可用，1：显示，2：加权
	 */
	@ApiField("recommend")
	private Long recommend;

	/**
	 * 来源渠道
	 */
	@ApiField("source_channel_key")
	private String sourceChannelKey;

	/**
	 * 快讯来源id
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 摘要
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getImages() {
		return this.images;
	}
	public void setImages(String images) {
		this.images = images;
	}

	public String getOprTags() {
		return this.oprTags;
	}
	public void setOprTags(String oprTags) {
		this.oprTags = oprTags;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public Long getRecommend() {
		return this.recommend;
	}
	public void setRecommend(Long recommend) {
		this.recommend = recommend;
	}

	public String getSourceChannelKey() {
		return this.sourceChannelKey;
	}
	public void setSourceChannelKey(String sourceChannelKey) {
		this.sourceChannelKey = sourceChannelKey;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
