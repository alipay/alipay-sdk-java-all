package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 视频文件详细信息
 *
 * @author auto create
 * @since 1.0, 2025-07-11 14:46:41
 */
public class VideoValueRequest extends AlipayObject {

	private static final long serialVersionUID = 1865418757776536383L;

	/**
	 * 视频文件AFTS id，为afts返回
	 */
	@ApiField("video_id")
	private String videoId;

	/**
	 * 视频文件名字
	 */
	@ApiField("video_name")
	private String videoName;

	/**
	 * 视频文件大小
	 */
	@ApiField("video_size")
	private Long videoSize;

	/**
	 * 视频类型
	 */
	@ApiField("video_type")
	private String videoType;

	public String getVideoId() {
		return this.videoId;
	}
	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getVideoName() {
		return this.videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public Long getVideoSize() {
		return this.videoSize;
	}
	public void setVideoSize(Long videoSize) {
		this.videoSize = videoSize;
	}

	public String getVideoType() {
		return this.videoType;
	}
	public void setVideoType(String videoType) {
		this.videoType = videoType;
	}

}
