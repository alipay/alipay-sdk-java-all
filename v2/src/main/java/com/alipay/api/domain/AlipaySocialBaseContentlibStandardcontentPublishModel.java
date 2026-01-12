package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 内容发布接口
 *
 * @author auto create
 * @since 1.0, 2025-11-28 10:38:54
 */
public class AlipaySocialBaseContentlibStandardcontentPublishModel extends AlipayObject {

	private static final long serialVersionUID = 4213724989196485977L;

	/**
	 * 内容分发范围。1 - 所有人可见，2 - 分发范围受限。
	 */
	@ApiField("permission_status")
	private String permissionStatus;

	/**
	 * POI信息，包括：POI编码、POI名称、POI地址、区域编码、经度、纬度、POI类型code、POI类型名称等信息
	 */
	@ApiField("poi_info")
	private AmapPoiInfo poiInfo;

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
	 * 内容正文。类型为短图文/视频，正文必须填写，理解为短图文/视频的文本部分，仅支持纯文本。正文长度限制为不超过 1000 个字
	 */
	@ApiField("source_content")
	private String sourceContent;

	/**
	 * 内容在支付宝平台的首发声明，通过首发审核的内容在视频播放页显示首发标识。取值为：0/1，其中 1 表示声明为首发，仅发布短视频内容时有效
	 */
	@ApiField("source_content_debut")
	private String sourceContentDebut;

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
	 * 音乐code，仅发布短图文类型内容时有效，传递值为 random 时表示在已上架的音乐库里随机选择一首音乐
	 */
	@ApiField("source_music_code")
	private String sourceMusicCode;

	/**
	 * 内容关联服务，1个内容最多关联1个服务；offerId为关联的服务ID，支持小程序/小程序服务/优惠券活动/商品/小游戏
	 */
	@ApiListField("source_offers")
	@ApiField("source_offer")
	private List<SourceOffer> sourceOffers;

	/**
	 * 文章发布时间 仅支持 yyyy-MM-dd HH:mm:ss 格式， 且发布时间的范围为：大于相对于当前时间+15分钟，小于相对于当前时间+7天
	 */
	@ApiField("source_publish_date")
	private String sourcePublishDate;

	/**
	 * 文章摘要；预留字段，当前不对用户透出
	 */
	@ApiField("source_summary")
	private String sourceSummary;

	/**
	 * 内容标题，标题长度的最大字数为30个字
	 */
	@ApiField("source_title")
	private String sourceTitle;

	/**
	 * 内容类型（1、短图文；2、视频）
	 */
	@ApiField("source_type")
	private String sourceType;

	public String getPermissionStatus() {
		return this.permissionStatus;
	}
	public void setPermissionStatus(String permissionStatus) {
		this.permissionStatus = permissionStatus;
	}

	public AmapPoiInfo getPoiInfo() {
		return this.poiInfo;
	}
	public void setPoiInfo(AmapPoiInfo poiInfo) {
		this.poiInfo = poiInfo;
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

	public String getSourceContent() {
		return this.sourceContent;
	}
	public void setSourceContent(String sourceContent) {
		this.sourceContent = sourceContent;
	}

	public String getSourceContentDebut() {
		return this.sourceContentDebut;
	}
	public void setSourceContentDebut(String sourceContentDebut) {
		this.sourceContentDebut = sourceContentDebut;
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

	public String getSourceMusicCode() {
		return this.sourceMusicCode;
	}
	public void setSourceMusicCode(String sourceMusicCode) {
		this.sourceMusicCode = sourceMusicCode;
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
