package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 内容发布接口
 *
 * @author auto create
 * @since 1.0, 2021-11-12 15:44:34
 */
public class AlipaySocialBaseContentlibStandardcontentPublishModel extends AlipayObject {

	private static final long serialVersionUID = 4741466263934216275L;

	/**
	 * 生活号+号ID，只有MCN机构为达人号ID发布内容才需要传入
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 作者
	 */
	@ApiField("source_author")
	private String sourceAuthor;

	/**
	 * 内容正文。类型为长图文，正文必须填写，并支持富文本格式；类型为短图文，正文必须填写，理解为短图文的文本部分
	 */
	@ApiField("source_content")
	private String sourceContent;

	/**
	 * 来源文章的原始链接地址
	 */
	@ApiField("source_link")
	private String sourceLink;

	/**
	 * 素材列表
	 */
	@ApiListField("source_media_infos")
	@ApiField("source_media_info")
	private List<SourceMediaInfo> sourceMediaInfos;

	/**
	 * 关联服务,目前只支持一个，offerId为关联的服务ID，目前只支持小程序，offerId为小程序ID，offerType为 mini_app
	 */
	@ApiListField("source_offers")
	@ApiField("source_offer")
	private List<SourceOffer> sourceOffers;

	/**
	 * 文章发布时间 仅支持 yyyy-MM-dd HH:mm:ss 格式
	 */
	@ApiField("source_publish_date")
	private String sourcePublishDate;

	/**
	 * 文章的摘要
	 */
	@ApiField("source_summary")
	private String sourceSummary;

	/**
	 * 内容标题
	 */
	@ApiField("source_title")
	private String sourceTitle;

	/**
	 * 内容类型（1、短图文；2、视频）
	 */
	@ApiField("source_type")
	private String sourceType;

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getSourceAuthor() {
		return this.sourceAuthor;
	}
	public void setSourceAuthor(String sourceAuthor) {
		this.sourceAuthor = sourceAuthor;
	}

	public String getSourceContent() {
		return this.sourceContent;
	}
	public void setSourceContent(String sourceContent) {
		this.sourceContent = sourceContent;
	}

	public String getSourceLink() {
		return this.sourceLink;
	}
	public void setSourceLink(String sourceLink) {
		this.sourceLink = sourceLink;
	}

	public List<SourceMediaInfo> getSourceMediaInfos() {
		return this.sourceMediaInfos;
	}
	public void setSourceMediaInfos(List<SourceMediaInfo> sourceMediaInfos) {
		this.sourceMediaInfos = sourceMediaInfos;
	}

	public List<SourceOffer> getSourceOffers() {
		return this.sourceOffers;
	}
	public void setSourceOffers(List<SourceOffer> sourceOffers) {
		this.sourceOffers = sourceOffers;
	}

	public String getSourcePublishDate() {
		return this.sourcePublishDate;
	}
	public void setSourcePublishDate(String sourcePublishDate) {
		this.sourcePublishDate = sourcePublishDate;
	}

	public String getSourceSummary() {
		return this.sourceSummary;
	}
	public void setSourceSummary(String sourceSummary) {
		this.sourceSummary = sourceSummary;
	}

	public String getSourceTitle() {
		return this.sourceTitle;
	}
	public void setSourceTitle(String sourceTitle) {
		this.sourceTitle = sourceTitle;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

}
