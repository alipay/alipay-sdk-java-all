package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 视频审核接口
 *
 * @author auto create
 * @since 1.0, 2020-07-03 20:38:31
 */
public class AlipaySocialBaseContentlibStandardvideoauditSendModel extends AlipayObject {

	private static final long serialVersionUID = 1279286744312176826L;

	/**
	 * publish(审核通过),
depublish(审核不通过)
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 扩展字段，传递非标准参数信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 驳回原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 操作日期
	 */
	@ApiField("source_publish_date")
	private String sourcePublishDate;

	/**
	 * 视频Id
	 */
	@ApiField("video_id")
	private String videoId;

	/**
	 * 视频时长
	 */
	@ApiField("video_length")
	private String videoLength;

	/**
	 * 视频来源
	 */
	@ApiField("video_publish_type")
	private String videoPublishType;

	/**
	 * 视频的大小
	 */
	@ApiField("video_size")
	private String videoSize;

	/**
	 * 视频的标签，以,隔开
	 */
	@ApiField("video_tags")
	private String videoTags;

	/**
	 * video的url
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

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getSourcePublishDate() {
		return this.sourcePublishDate;
	}
	public void setSourcePublishDate(String sourcePublishDate) {
		this.sourcePublishDate = sourcePublishDate;
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
