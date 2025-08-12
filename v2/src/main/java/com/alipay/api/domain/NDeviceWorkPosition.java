package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备作业位置信息
 *
 * @author auto create
 * @since 1.0, 2025-04-24 14:58:17
 */
public class NDeviceWorkPosition extends AlipayObject {

	private static final long serialVersionUID = 4377826247969879321L;

	/**
	 * 当前作业人员所在位置纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 支付宝侧门店leadsId
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 当前作业人员所在位置纬度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 外部门店编号，门店leads上报时的外部门店编号
	 */
	@ApiField("out_store_id")
	private String outStoreId;

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getOutStoreId() {
		return this.outStoreId;
	}
	public void setOutStoreId(String outStoreId) {
		this.outStoreId = outStoreId;
	}

}
