package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线圈设备的扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-08-15 15:24:30
 */
public class NRiskDeviceTagSnapshotExtInfo extends AlipayObject {

	private static final long serialVersionUID = 7316414753351753792L;

	/**
	 * 线圈关联的外部点位ID
	 */
	@ApiField("bind_out_poi_id")
	private String bindOutPoiId;

	/**
	 * 线圈关联的外部点位名称
	 */
	@ApiField("bind_poi_name")
	private String bindPoiName;

	public String getBindOutPoiId() {
		return this.bindOutPoiId;
	}
	public void setBindOutPoiId(String bindOutPoiId) {
		this.bindOutPoiId = bindOutPoiId;
	}

	public String getBindPoiName() {
		return this.bindPoiName;
	}
	public void setBindPoiName(String bindPoiName) {
		this.bindPoiName = bindPoiName;
	}

}
