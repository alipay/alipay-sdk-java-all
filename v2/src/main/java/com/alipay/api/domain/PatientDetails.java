package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 患者信息
 *
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:06
 */
public class PatientDetails extends AlipayObject {

	private static final long serialVersionUID = 6888758956823815189L;

	/**
	 * 0: 否 1:是
	 */
	@ApiField("has_enter_room")
	private Long hasEnterRoom;

	/**
	 * 好大夫侧患者ID
	 */
	@ApiField("patient_id")
	private Long patientId;

	/**
	 * RTC侧用户ID
	 */
	@ApiField("rtc_user_id")
	private String rtcUserId;

	/**
	 * 好大夫侧用户ID
	 */
	@ApiField("user_id")
	private Long userId;

	public Long getHasEnterRoom() {
		return this.hasEnterRoom;
	}
	public void setHasEnterRoom(Long hasEnterRoom) {
		this.hasEnterRoom = hasEnterRoom;
	}

	public Long getPatientId() {
		return this.patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getRtcUserId() {
		return this.rtcUserId;
	}
	public void setRtcUserId(String rtcUserId) {
		this.rtcUserId = rtcUserId;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
