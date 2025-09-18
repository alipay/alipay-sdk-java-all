package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通知蚂蚁域直播相关消息变更
 *
 * @author auto create
 * @since 1.0, 2022-04-14 10:38:57
 */
public class AntfortuneContentCommunityAlivemsgNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 1762369631627722383L;

	/**
	 * 淘宝直播id
	 */
	@ApiField("live_id")
	private String liveId;

	/**
	 * 0:直播中, 1:直播结束，-1:直播不存在, 2: 预约，3：暂停，4：未开始(端上使用)
	 */
	@ApiField("live_status")
	private String liveStatus;

	/**
	 * 淘宝用户ID
	 */
	@ApiField("tb_user_id")
	private String tbUserId;

	public String getLiveId() {
		return this.liveId;
	}
	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}

	public String getLiveStatus() {
		return this.liveStatus;
	}
	public void setLiveStatus(String liveStatus) {
		this.liveStatus = liveStatus;
	}

	public String getTbUserId() {
		return this.tbUserId;
	}
	public void setTbUserId(String tbUserId) {
		this.tbUserId = tbUserId;
	}

}
