package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 货柜异常视频相关信息
 *
 * @author auto create
 * @since 1.0, 2025-12-11 15:22:34
 */
public class NonTransOpenLockVideoInfo extends AlipayObject {

	private static final long serialVersionUID = 8222439246834266319L;

	/**
	 * 失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 摄像头类型
	 */
	@ApiField("video_id")
	private String videoId;

	/**
	 * 视频地址集合
	 */
	@ApiListField("video_urls")
	@ApiField("string")
	private List<String> videoUrls;

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getVideoId() {
		return this.videoId;
	}
	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public List<String> getVideoUrls() {
		return this.videoUrls;
	}
	public void setVideoUrls(List<String> videoUrls) {
		this.videoUrls = videoUrls;
	}

}
