package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 长图文内容发布接口
 *
 * @author auto create
 * @since 1.0, 2024-01-31 11:17:28
 */
public class AlipaySocialBaseLifeprodStandardcontentPublishModel extends AlipayObject {

	private static final long serialVersionUID = 6146586414315989957L;

	/**
	 * 内容分发范围。whole - 所有人可见，part - 分发范围受限。
	 */
	@ApiField("permission_status")
	private String permissionStatus;

	/**
	 * 生活号+号ID。如果发送类型=自研/三方发送，不要传入；发送类型=mcn发送，请传入public_id【mcn机构绑定达人号ID】
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 作者；预留字段，当前不对用户透出
	 */
	@ApiField("source_author")
	private String sourceAuthor;

	/**
	 * 来源文章的原始链接地址
	 */
	@ApiField("source_link")
	private String sourceLink;

	/**
	 * 图片和视频素材列表
	 */
	@ApiListField("source_media_infos")
	@ApiField("source_media_info")
	private List<SourceMediaInfo> sourceMediaInfos;

	/**
	 * 内容关联服务，1个内容最多关联1个服务；offerId为关联的服务ID，支持小程序/小程序服务/优惠券活动
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
	 * 文章摘要；预留字段，当前不对用户透出
	 */
	@ApiField("source_summary")
	private String sourceSummary;

	/**
	 * 内容正文。类型为长图文，支持富文本。
	 */
	@ApiField("source_text")
	private String sourceText;

	/**
	 * 内容标题
	 */
	@ApiField("source_title")
	private String sourceTitle;

	/**
	 * 内容类型（IMAGE-CONTENT：长图文）
	 */
	@ApiField("source_type")
	private String sourceType;

	public String getPermissionStatus() {
		return this.permissionStatus;
	}
	public void setPermissionStatus(String permissionStatus) {
		this.permissionStatus = permissionStatus;
	}

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

	public String getSourceText() {
		return this.sourceText;
	}
	public void setSourceText(String sourceText) {
		this.sourceText = sourceText;
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
