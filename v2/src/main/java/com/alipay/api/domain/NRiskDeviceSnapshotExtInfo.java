package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-08-15 15:24:30
 */
public class NRiskDeviceSnapshotExtInfo extends AlipayObject {

	private static final long serialVersionUID = 1299274469591241634L;

	/**
	 * 设备关联的外部点位信息
	 */
	@ApiField("bind_out_poi_id")
	private String bindOutPoiId;

	/**
	 * 设备关联的外部点位名称
	 */
	@ApiField("bind_out_poi_name")
	private String bindOutPoiName;

	public String getBindOutPoiId() {
		return this.bindOutPoiId;
	}
	public void setBindOutPoiId(String bindOutPoiId) {
		this.bindOutPoiId = bindOutPoiId;
	}

	public String getBindOutPoiName() {
		return this.bindOutPoiName;
	}
	public void setBindOutPoiName(String bindOutPoiName) {
		this.bindOutPoiName = bindOutPoiName;
	}

}
