package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生信息
 *
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:06
 */
public class DoctorDetails extends AlipayObject {

	private static final long serialVersionUID = 4669134767279536384L;

	/**
	 * 是否进入诊室
	 */
	@ApiField("has_enter_room")
	private Long hasEnterRoom;

	/**
	 * RTC侧用户ID
	 */
	@ApiField("rtc_user_id")
	private String rtcUserId;

	/**
	 * 医生空间ID
	 */
	@ApiField("space_id")
	private Long spaceId;

	public Long getHasEnterRoom() {
		return this.hasEnterRoom;
	}
	public void setHasEnterRoom(Long hasEnterRoom) {
		this.hasEnterRoom = hasEnterRoom;
	}

	public String getRtcUserId() {
		return this.rtcUserId;
	}
	public void setRtcUserId(String rtcUserId) {
		this.rtcUserId = rtcUserId;
	}

	public Long getSpaceId() {
		return this.spaceId;
	}
	public void setSpaceId(Long spaceId) {
		this.spaceId = spaceId;
	}

}
