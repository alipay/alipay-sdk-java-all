package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-29 15:17:47
 */
public class NfcDeviceActivityInfo extends AlipayObject {

	private static final long serialVersionUID = 6832487458186256628L;

	/**
	 * 设备ID
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * null
	 */
	@ApiListField("dvc_participate_info_list")
	@ApiField("activity_participate_info")
	private List<ActivityParticipateInfo> dvcParticipateInfoList;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public List<ActivityParticipateInfo> getDvcParticipateInfoList() {
		return this.dvcParticipateInfoList;
	}
	public void setDvcParticipateInfoList(List<ActivityParticipateInfo> dvcParticipateInfoList) {
		this.dvcParticipateInfoList = dvcParticipateInfoList;
	}

}
