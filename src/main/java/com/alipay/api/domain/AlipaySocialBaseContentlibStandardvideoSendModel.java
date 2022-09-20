package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标准视频接入
 *
 * @author auto create
 * @since 1.0, 2020-07-03 20:38:56
 */
public class AlipaySocialBaseContentlibStandardvideoSendModel extends AlipayObject {

	private static final long serialVersionUID = 4759156629943247721L;

	/**
	 * action_type为此次请求类型，值为枚举，有三种，publish(发布),depublish(撤回),heartbeat(心跳),具体对接请联系负责人,必填
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * extInfo为扩展信息，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * public_id为来源文章需要接入的内容号,当为多号接入时，必填
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * source_author是来源内容的作者，当action_type为publish时，非必填
	 */
	@ApiField("source_author")
	private String sourceAuthor;

	/**
	 * source_keywords为来源内容的关键字，字符串类型，多个关键字用英文逗号隔开，如示例值所示。非必填
	 */
	@ApiField("source_category")
	private String sourceCategory;

	/**
	 * source_cover值为图片链接，用于主页的封面图显示，图片尺寸900*500。无封面图情况需产品确认。当action_type为publish的时候，必填
	 */
	@ApiField("source_cover")
	private String sourceCover;

	/**
	 * source_id是来源方能唯一确定一份内容的id,当action_type为publish及depublish时，必填
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 来源文章的发布时间，当action_type为publish的时候，必填
	 */
	@ApiField("source_publish_date")
	private Date sourcePublishDate;

	/**
	 * source_summary为来源内容的摘要，非必填
	 */
	@ApiField("source_summary")
	private String sourceSummary;

	/**
	 * source_title是来源方内容标题，当action_type是publish时，必填
	 */
	@ApiField("source_title")
	private String sourceTitle;

	/**
	 * 视频Id,当action_type为publish的时候，必填
	 */
	@ApiField("video_id")
	private String videoId;

	/**
	 * 视频时长
	 */
	@ApiField("video_length")
	private String videoLength;

	/**
	 * 视频发布器，如一财后台，创作者后台
	 */
	@ApiField("video_publish_type")
	private String videoPublishType;

	/**
	 * 视频大小
	 */
	@ApiField("video_size")
	private String videoSize;

	/**
	 * 视频来源方运营标签，英文逗号隔开
	 */
	@ApiField("video_tags")
	private String videoTags;

	/**
	 * 视频url，当action_type为publish的时候，必填
	 */
	@ApiField("video_url")
	private String videoUrl;

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

	public String getSourceTitle() {
		return this.sourceTitle;
	}
	public void setSourceTitle(String sourceTitle) {
		this.sourceTitle = sourceTitle;
	}

	public String getVideoId() {
		return this.videoId;
	}
	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getVideoLength() {
		return this.videoLength;
	}
	public void setVideoLength(String videoLength) {
		this.videoLength = videoLength;
	}

	public String getVideoPublishType() {
		return this.videoPublishType;
	}
	public void setVideoPublishType(String videoPublishType) {
		this.videoPublishType = videoPublishType;
	}

	public String getVideoSize() {
		return this.videoSize;
	}
	public void setVideoSize(String videoSize) {
		this.videoSize = videoSize;
	}

	public String getVideoTags() {
		return this.videoTags;
	}
	public void setVideoTags(String videoTags) {
		this.videoTags = videoTags;
	}

	public String getVideoUrl() {
		return this.videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

}
