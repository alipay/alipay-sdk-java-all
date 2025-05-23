package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 仓库异常监测接口
 *
 * @author auto create
 * @since 1.0, 2019-11-15 14:41:13
 */
public class AlipayDataIotdataAnomalydetectionBaiVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 8217415331165215956L;

	/**
	 * base64编码的视频帧数据，表示当前帧
	 */
	@ApiField("current_frame")
	private String currentFrame;

	/**
	 * Unix时间戳，单位秒，current_frame的产生时间
	 */
	@ApiField("current_time")
	private Long currentTime;

	/**
	 * base64编码视频帧数据
	 */
	@ApiField("previous_frame")
	private String previousFrame;

	/**
	 * Unix时间戳，单位秒，previous_frame的产生时间
	 */
	@ApiField("previous_time")
	private Long previousTime;

	/**
	 * 调用方保证唯一，表示监测异常事件的id
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getCurrentFrame() {
		return this.currentFrame;
	}
	public void setCurrentFrame(String currentFrame) {
		this.currentFrame = currentFrame;
	}

	public Long getCurrentTime() {
		return this.currentTime;
	}
	public void setCurrentTime(Long currentTime) {
		this.currentTime = currentTime;
	}

	public String getPreviousFrame() {
		return this.previousFrame;
	}
	public void setPreviousFrame(String previousFrame) {
		this.previousFrame = previousFrame;
	}

	public Long getPreviousTime() {
		return this.previousTime;
	}
	public void setPreviousTime(Long previousTime) {
		this.previousTime = previousTime;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
