package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N设备信息
 *
 * @author auto create
 * @since 1.0, 2025-08-15 15:24:30
 */
public class NRiskDeviceSnapshot extends AlipayObject {

	private static final long serialVersionUID = 4783327722722218927L;

	/**
	 * 描叙商家品牌
	 */
	@ApiField("customer_brand")
	private String customerBrand;

	/**
	 * 设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 设备扩展信息
	 */
	@ApiField("ext_info")
	private NRiskDeviceSnapshotExtInfo extInfo;

	/**
	 * 记录设备最后一次交易时间
	 */
	@ApiField("last_trade_time")
	private String lastTradeTime;

	/**
	 * 记录设备最后一次的开机时间
	 */
	@ApiField("last_turn_on_time")
	private String lastTurnOnTime;

	/**
	 * 门店地址
	 */
	@ApiField("poi_address")
	private String poiAddress;

	/**
	 * 门店POI名称
	 */
	@ApiField("poi_name")
	private String poiName;

	/**
	 * 设备号
	 */
	@ApiField("sn")
	private String sn;

	public String getCustomerBrand() {
		return this.customerBrand;
	}
	public void setCustomerBrand(String customerBrand) {
		this.customerBrand = customerBrand;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public NRiskDeviceSnapshotExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(NRiskDeviceSnapshotExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getLastTradeTime() {
		return this.lastTradeTime;
	}
	public void setLastTradeTime(String lastTradeTime) {
		this.lastTradeTime = lastTradeTime;
	}

	public String getLastTurnOnTime() {
		return this.lastTurnOnTime;
	}
	public void setLastTurnOnTime(String lastTurnOnTime) {
		this.lastTurnOnTime = lastTurnOnTime;
	}

	public String getPoiAddress() {
		return this.poiAddress;
	}
	public void setPoiAddress(String poiAddress) {
		this.poiAddress = poiAddress;
	}

	public String getPoiName() {
		return this.poiName;
	}
	public void setPoiName(String poiName) {
		this.poiName = poiName;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
