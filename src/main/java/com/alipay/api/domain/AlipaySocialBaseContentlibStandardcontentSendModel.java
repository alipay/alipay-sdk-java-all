package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部接入内容中台的标准内容接口
 *
 * @author auto create
 * @since 1.0, 2019-12-09 15:15:20
 */
public class AlipaySocialBaseContentlibStandardcontentSendModel extends AlipayObject {

	private static final long serialVersionUID = 6864493946716278821L;

	/**
	 * action_type为此次请求类型，值为枚举，有三种，publish(发布),depublish(撤回),heartbeat(心跳),具体对接请联系负责人,必填
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * extInfo为扩展信息，json格式。
ugc和pgc区分：扩展字段中增加参数标识内容为PGC或UGC，格式为"createType":"ugc" 或者 "createType":"pgc"
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * public_id为来源文章需要接入的内容号,当为多号接入时，必填
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * source_author是来源文章的作者，当action_type为publish时，非必填
	 */
	@ApiField("source_author")
	private String sourceAuthor;

	/**
	 * source_category是来源文章的类别，如有多个，请用英文逗号隔开，如示例值所示，非必填
	 */
	@ApiField("source_category")
	private String sourceCategory;

	/**
	 * source_content为来源文章的正文内容，当action_type为publish的时候，必填
	 */
	@ApiField("source_content")
	private String sourceContent;

	/**
	 * source_cover值为图片链接，用于主页的封面图显示，图片尺寸900*500。无封面图情况需产品确认。选填
	 */
	@ApiField("source_cover")
	private String sourceCover;

	/**
	 * source_id是来源方能唯一标识一篇文章的id,当action_type为publish及depublish时，必填
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * source_keywords为来源文章的关键字，字符串类型，多个关键字用英文逗号隔开，如示例值所示。非必填
	 */
	@ApiField("source_keywords")
	private String sourceKeywords;

	/**
	 * source_link为来源文章的原始链接地址，非必填
	 */
	@ApiField("source_link")
	private String sourceLink;

	/**
	 * 来源文章的发布时间，当action_type为publish的时候，必填
	 */
	@ApiField("source_publish_date")
	private Date sourcePublishDate;

	/**
	 * source_summary为来源文章的摘要，非必填
	 */
	@ApiField("source_summary")
	private String sourceSummary;

	/**
	 * source_thumbnail_type是文章列表展示时的配图类型。有大图，三图，左文右图，无图四种。取值为枚举，oneBig(大图)，three(三图)，right(左文右图)，noImage(无图),具体显示样式请联系负责人
	 */
	@ApiField("source_thumbnail_type")
	private String sourceThumbnailType;

	/**
	 * source_thumbnails为文章列表显示时的配图。非必填，可由内容中台的算法计算。如果填入，则填图片链接，如有多个，请用英文逗号隔开，如示例值所示，具体接入请联系负责人
	 */
	@ApiField("source_thumbnails")
	private String sourceThumbnails;

	/**
	 * source_title是来源方文章标题，当action_type是publish时，必填。
针对没有标题的内容，如雪球传固定文案：雪球内容+(发布时间戳)
	 */
	@ApiField("source_title")
	private String sourceTitle;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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

	public String getSourceCategory() {
		return this.sourceCategory;
	}
	public void setSourceCategory(String sourceCategory) {
		this.sourceCategory = sourceCategory;
	}

	public String getSourceContent() {
		return this.sourceContent;
	}
	public void setSourceContent(String sourceContent) {
		this.sourceContent = sourceContent;
	}

	public String getSourceCover() {
		return this.sourceCover;
	}
	public void setSourceCover(String sourceCover) {
		this.sourceCover = sourceCover;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceKeywords() {
		return this.sourceKeywords;
	}
	public void setSourceKeywords(String sourceKeywords) {
		this.sourceKeywords = sourceKeywords;
	}

	public String getSourceLink() {
		return this.sourceLink;
	}
	public void setSourceLink(String sourceLink) {
		this.sourceLink = sourceLink;
	}

	public Date getSourcePublishDate() {
		return this.sourcePublishDate;
	}
	public void setSourcePublishDate(Date sourcePublishDate) {
		this.sourcePublishDate = sourcePublishDate;
	}

	public String getSourceSummary() {
		return this.sourceSummary;
	}
	public void setSourceSummary(String sourceSummary) {
		this.sourceSummary = sourceSummary;
	}

	public String getSourceThumbnailType() {
		return this.sourceThumbnailType;
	}
	public void setSourceThumbnailType(String sourceThumbnailType) {
		this.sourceThumbnailType = sourceThumbnailType;
	}

	public String getSourceThumbnails() {
		return this.sourceThumbnails;
	}
	public void setSourceThumbnails(String sourceThumbnails) {
		this.sourceThumbnails = sourceThumbnails;
	}

	public String getSourceTitle() {
		return this.sourceTitle;
	}
	public void setSourceTitle(String sourceTitle) {
		this.sourceTitle = sourceTitle;
	}

}
