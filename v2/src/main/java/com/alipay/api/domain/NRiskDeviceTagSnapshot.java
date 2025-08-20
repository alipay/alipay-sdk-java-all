package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线圈设备快照信息
 *
 * @author auto create
 * @since 1.0, 2025-08-15 15:24:30
 */
public class NRiskDeviceTagSnapshot extends AlipayObject {

	private static final long serialVersionUID = 5856377568281849391L;

	/**
	 * 描叙N线圈类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * N线圈数据的扩展信息
	 */
	@ApiField("ext_info")
	private NRiskDeviceTagSnapshotExtInfo extInfo;

	/**
	 * N线圈的唯一标识
	 */
	@ApiField("tag_id")
	private String tagId;

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public NRiskDeviceTagSnapshotExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(NRiskDeviceTagSnapshotExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getTagId() {
		return this.tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

}
