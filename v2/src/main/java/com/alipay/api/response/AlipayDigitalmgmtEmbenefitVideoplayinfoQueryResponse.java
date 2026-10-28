package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.embenefit.videoplayinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-27 10:47:58
 */
public class AlipayDigitalmgmtEmbenefitVideoplayinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7473334944591886291L;

	/** 
	 * 附件ID
	 */
	@ApiField("attachment_id")
	private Long attachmentId;

	/** 
	 * 附件名称
	 */
	@ApiField("attachment_name")
	private String attachmentName;

	/** 
	 * 视频时长，单位：s
	 */
	@ApiField("duration")
	private Long duration;

	/** 
	 * 播放地址
	 */
	@ApiField("play_url")
	private String playUrl;

	/** 
	 * 视频大小 单位：B
	 */
	@ApiField("size")
	private Long size;

	/** 
	 * 视频id
	 */
	@ApiField("video_id")
	private String videoId;

	public void setAttachmentId(Long attachmentId) {
		this.attachmentId = attachmentId;
	}
	public Long getAttachmentId( ) {
		return this.attachmentId;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}
	public String getAttachmentName( ) {
		return this.attachmentName;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public Long getDuration( ) {
		return this.duration;
	}

	public void setPlayUrl(String playUrl) {
		this.playUrl = playUrl;
	}
	public String getPlayUrl( ) {
		return this.playUrl;
	}

	public void setSize(Long size) {
		this.size = size;
	}
	public Long getSize( ) {
		return this.size;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}
	public String getVideoId( ) {
		return this.videoId;
	}

}
