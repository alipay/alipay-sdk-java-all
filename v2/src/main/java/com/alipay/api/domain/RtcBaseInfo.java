package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 音视频通信相关信息
 *
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:06
 */
public class RtcBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 5681958455123594714L;

	/**
	 * 频道ID
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 应用ID
	 */
	@ApiField("rtc_app_id")
	private String rtcAppId;

	/**
	 * rtc通信token值
	 */
	@ApiField("rtc_token")
	private String rtcToken;

	/**
	 * RTC侧用户ID
	 */
	@ApiField("rtc_user_id")
	private String rtcUserId;

	/**
	 * 会话ID
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getRtcAppId() {
		return this.rtcAppId;
	}
	public void setRtcAppId(String rtcAppId) {
		this.rtcAppId = rtcAppId;
	}

	public String getRtcToken() {
		return this.rtcToken;
	}
	public void setRtcToken(String rtcToken) {
		this.rtcToken = rtcToken;
	}

	public String getRtcUserId() {
		return this.rtcUserId;
	}
	public void setRtcUserId(String rtcUserId) {
		this.rtcUserId = rtcUserId;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
