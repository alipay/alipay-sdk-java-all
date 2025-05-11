package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 2d短视频任务结果
 *
 * @author auto create
 * @since 1.0, 2025-03-27 21:27:21
 */
public class AvatarHumanTaskResultDTO extends AlipayObject {

	private static final long serialVersionUID = 6537888385897662318L;

	/**
	 * 视频时长，单位秒
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 报错信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 视频url
	 */
	@ApiField("final_video_url")
	private String finalVideoUrl;

	/**
	 * 视频id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 封面图url
	 */
	@ApiField("preview")
	private String preview;

	/**
	 * 当前视频查询结果
	 */
	@ApiField("status")
	private String status;

	/**
	 * 视频名称
	 */
	@ApiField("video_name")
	private String videoName;

	/**
	 * 视频格式
	 */
	@ApiField("video_type")
	private String videoType;

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getFinalVideoUrl() {
		return this.finalVideoUrl;
	}
	public void setFinalVideoUrl(String finalVideoUrl) {
		this.finalVideoUrl = finalVideoUrl;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getPreview() {
		return this.preview;
	}
	public void setPreview(String preview) {
		this.preview = preview;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getVideoName() {
		return this.videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoType() {
		return this.videoType;
	}
	public void setVideoType(String videoType) {
		this.videoType = videoType;
	}

}
