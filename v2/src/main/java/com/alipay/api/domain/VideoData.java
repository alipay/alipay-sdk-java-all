package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 剧集列表数据
 *
 * @author auto create
 * @since 1.0, 2025-08-04 14:03:58
 */
public class VideoData extends AlipayObject {

	private static final long serialVersionUID = 6761964916183372534L;

	/**
	 * 当前视频时长，单位秒
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 第几集
	 */
	@ApiField("index")
	private Long index;

	/**
	 * 第三方系统为每个视频生成的全局唯一标识，用于在各系统之间精确定位同一条视频数据，便于后期排查问题。建议仅包含字母、数字、下划线或短横线，如果缺失或为空，接口将返回参数缺失错误，平台不会替调用方自动生成
	 */
	@ApiField("video_id")
	private String videoId;

	/**
	 * 视频文件名称
	 */
	@ApiField("video_name")
	private String videoName;

	/**
	 * 需要同步视频的OSS地址
	 */
	@ApiField("video_url")
	private String videoUrl;

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Long getIndex() {
		return this.index;
	}
	public void setIndex(Long index) {
		this.index = index;
	}

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

	public String getVideoUrl() {
		return this.videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

}
