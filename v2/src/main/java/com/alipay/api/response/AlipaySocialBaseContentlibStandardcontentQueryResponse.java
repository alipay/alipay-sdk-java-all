package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SourceMediaInfo;
import com.alipay.api.domain.SourceOffer;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.contentlib.standardcontent.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-31 11:17:47
 */
public class AlipaySocialBaseContentlibStandardcontentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7287843818448977525L;

	/** 
	 * 内容ID
	 */
	@ApiField("content_id")
	private String contentId;

	/** 
	 * 支付宝内容链接
	 */
	@ApiField("link")
	private String link;

	/** 
	 * 内容分发范围。0 - 仅创作者自己可见，1 - 所有人可见，2 - 分发范围受限。
	 */
	@ApiField("permission_status")
	private String permissionStatus;

	/** 
	 * 作者
	 */
	@ApiField("source_author")
	private String sourceAuthor;

	/** 
	 * 内容正文
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
	 * 关联服务
	 */
	@ApiListField("source_offers")
	@ApiField("source_offer")
	private List<SourceOffer> sourceOffers;

	/** 
	 * 文章发布时间
	 */
	@ApiField("source_publish_date")
	private String sourcePublishDate;

	/** 
	 * 状态码。 0-审核中 1-发布成功 2-审核不通过 3-己删除
	 */
	@ApiField("source_status")
	private String sourceStatus;

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
	 * 内容类型（0-长图文 1-短图文  2-视频）
	 */
	@ApiField("source_type")
	private String sourceType;

	/** 
	 * 代表内容推荐权重 HIGH_QUALITY: 优质
	 */
	@ApiListField("special_tags")
	@ApiField("string")
	private List<String> specialTags;

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getContentId( ) {
		return this.contentId;
	}

	public void setLink(String link) {
		this.link = link;
	}
	public String getLink( ) {
		return this.link;
	}

	public void setPermissionStatus(String permissionStatus) {
		this.permissionStatus = permissionStatus;
	}
	public String getPermissionStatus( ) {
		return this.permissionStatus;
	}

	public void setSourceAuthor(String sourceAuthor) {
		this.sourceAuthor = sourceAuthor;
	}
	public String getSourceAuthor( ) {
		return this.sourceAuthor;
	}

	public void setSourceContent(String sourceContent) {
		this.sourceContent = sourceContent;
	}
	public String getSourceContent( ) {
		return this.sourceContent;
	}

	public void setSourceLink(String sourceLink) {
		this.sourceLink = sourceLink;
	}
	public String getSourceLink( ) {
		return this.sourceLink;
	}

	public void setSourceMediaInfos(List<SourceMediaInfo> sourceMediaInfos) {
		this.sourceMediaInfos = sourceMediaInfos;
	}
	public List<SourceMediaInfo> getSourceMediaInfos( ) {
		return this.sourceMediaInfos;
	}

	public void setSourceOffers(List<SourceOffer> sourceOffers) {
		this.sourceOffers = sourceOffers;
	}
	public List<SourceOffer> getSourceOffers( ) {
		return this.sourceOffers;
	}

	public void setSourcePublishDate(String sourcePublishDate) {
		this.sourcePublishDate = sourcePublishDate;
	}
	public String getSourcePublishDate( ) {
		return this.sourcePublishDate;
	}

	public void setSourceStatus(String sourceStatus) {
		this.sourceStatus = sourceStatus;
	}
	public String getSourceStatus( ) {
		return this.sourceStatus;
	}

	public void setSourceSummary(String sourceSummary) {
		this.sourceSummary = sourceSummary;
	}
	public String getSourceSummary( ) {
		return this.sourceSummary;
	}

	public void setSourceTitle(String sourceTitle) {
		this.sourceTitle = sourceTitle;
	}
	public String getSourceTitle( ) {
		return this.sourceTitle;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	public String getSourceType( ) {
		return this.sourceType;
	}

	public void setSpecialTags(List<String> specialTags) {
		this.specialTags = specialTags;
	}
	public List<String> getSpecialTags( ) {
		return this.specialTags;
	}

}
