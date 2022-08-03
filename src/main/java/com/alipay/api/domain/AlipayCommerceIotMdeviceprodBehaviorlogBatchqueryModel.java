package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询iot设备扫码、心跳的行为日志信息
 *
 * @author auto create
 * @since 1.0, 2021-12-21 11:27:59
 */
public class AlipayCommerceIotMdeviceprodBehaviorlogBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6717836664569874981L;

	/**
	 * 行为日志类型，SCAN_CDOE:扫码/HEARTBEAT:心跳
	 */
	@ApiField("behavior_type")
	private String behaviorType;

	/**
	 * 设备sn，device_sn/imei必须填一个，如果device_sn会优先通过device_sn查询
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 设备imei码，device_sn/imei必须填一个，如果device_sn会优先通过device_sn查询
	 */
	@ApiField("imei")
	private String imei;

	/**
	 * 物料ID，支付宝提供，建议设置，当不同厂商设备device_sn/imei重复时，可过滤出关联指定物料ID的记录
	 */
	@ApiField("item_id")
	private String itemId;

	public String getBehaviorType() {
		return this.behaviorType;
	}
	public void setBehaviorType(String behaviorType) {
		this.behaviorType = behaviorType;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getImei() {
		return this.imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
