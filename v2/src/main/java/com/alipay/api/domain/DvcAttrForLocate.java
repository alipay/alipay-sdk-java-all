package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N设备辅助室内定位数据
 *
 * @author auto create
 * @since 1.0, 2025-08-19 14:38:47
 */
public class DvcAttrForLocate extends AlipayObject {

	private static final long serialVersionUID = 8292814535722946422L;

	/**
	 * 设备点位蓝牙mac地址
	 */
	@ApiField("bluetooth_mac")
	private String bluetoothMac;

	/**
	 * 门店所在集团ID
	 */
	@ApiField("mall_group_cid")
	private String mallGroupCid;

	/**
	 * 门店所在集团名称
	 */
	@ApiField("mall_group_name")
	private String mallGroupName;

	/**
	 * 详细地址
	 */
	@ApiField("poi_address")
	private String poiAddress;

	/**
	 * 城市
	 */
	@ApiField("poi_city_name")
	private String poiCityName;

	/**
	 * 县区
	 */
	@ApiField("poi_district_name")
	private String poiDistrictName;

	/**
	 * 数字化门店id(digital_poi_id)
	 */
	@ApiField("poi_id")
	private String poiId;

	/**
	 * 纬度
	 */
	@ApiField("poi_latitude")
	private String poiLatitude;

	/**
	 * 经度
	 */
	@ApiField("poi_longitude")
	private String poiLongitude;

	/**
	 * 门店名称
	 */
	@ApiField("poi_name")
	private String poiName;

	/**
	 * 省份
	 */
	@ApiField("poi_province_name")
	private String poiProvinceName;

	/**
	 * 蓝牙上报数据包，根据上报时间取最后一条
	 */
	@ApiField("scanned_ble_info")
	private String scannedBleInfo;

	/**
	 * CDMA基站上报数据包，根据上报时间取最后一条
	 */
	@ApiField("scanned_cdma_info")
	private String scannedCdmaInfo;

	/**
	 * GSM基站上报数据包，根据上报时间取最后一条
	 */
	@ApiField("scanned_gsm_info")
	private String scannedGsmInfo;

	/**
	 * LTE基站上报数据包，根据上报时间取最后一条
	 */
	@ApiField("scanned_lte_info")
	private String scannedLteInfo;

	/**
	 * WCDMA基站上报数据包，根据上报时间取最后一条
	 */
	@ApiField("scanned_wcdma_info")
	private String scannedWcdmaInfo;

	/**
	 * wifi上报数据包，根据上报时间取最后一条
	 */
	@ApiField("scanned_wifi_info")
	private String scannedWifiInfo;

	public String getBluetoothMac() {
		return this.bluetoothMac;
	}
	public void setBluetoothMac(String bluetoothMac) {
		this.bluetoothMac = bluetoothMac;
	}

	public String getMallGroupCid() {
		return this.mallGroupCid;
	}
	public void setMallGroupCid(String mallGroupCid) {
		this.mallGroupCid = mallGroupCid;
	}

	public String getMallGroupName() {
		return this.mallGroupName;
	}
	public void setMallGroupName(String mallGroupName) {
		this.mallGroupName = mallGroupName;
	}

	public String getPoiAddress() {
		return this.poiAddress;
	}
	public void setPoiAddress(String poiAddress) {
		this.poiAddress = poiAddress;
	}

	public String getPoiCityName() {
		return this.poiCityName;
	}
	public void setPoiCityName(String poiCityName) {
		this.poiCityName = poiCityName;
	}

	public String getPoiDistrictName() {
		return this.poiDistrictName;
	}
	public void setPoiDistrictName(String poiDistrictName) {
		this.poiDistrictName = poiDistrictName;
	}

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

	public String getPoiLatitude() {
		return this.poiLatitude;
	}
	public void setPoiLatitude(String poiLatitude) {
		this.poiLatitude = poiLatitude;
	}

	public String getPoiLongitude() {
		return this.poiLongitude;
	}
	public void setPoiLongitude(String poiLongitude) {
		this.poiLongitude = poiLongitude;
	}

	public String getPoiName() {
		return this.poiName;
	}
	public void setPoiName(String poiName) {
		this.poiName = poiName;
	}

	public String getPoiProvinceName() {
		return this.poiProvinceName;
	}
	public void setPoiProvinceName(String poiProvinceName) {
		this.poiProvinceName = poiProvinceName;
	}

	public String getScannedBleInfo() {
		return this.scannedBleInfo;
	}
	public void setScannedBleInfo(String scannedBleInfo) {
		this.scannedBleInfo = scannedBleInfo;
	}

	public String getScannedCdmaInfo() {
		return this.scannedCdmaInfo;
	}
	public void setScannedCdmaInfo(String scannedCdmaInfo) {
		this.scannedCdmaInfo = scannedCdmaInfo;
	}

	public String getScannedGsmInfo() {
		return this.scannedGsmInfo;
	}
	public void setScannedGsmInfo(String scannedGsmInfo) {
		this.scannedGsmInfo = scannedGsmInfo;
	}

	public String getScannedLteInfo() {
		return this.scannedLteInfo;
	}
	public void setScannedLteInfo(String scannedLteInfo) {
		this.scannedLteInfo = scannedLteInfo;
	}

	public String getScannedWcdmaInfo() {
		return this.scannedWcdmaInfo;
	}
	public void setScannedWcdmaInfo(String scannedWcdmaInfo) {
		this.scannedWcdmaInfo = scannedWcdmaInfo;
	}

	public String getScannedWifiInfo() {
		return this.scannedWifiInfo;
	}
	public void setScannedWifiInfo(String scannedWifiInfo) {
		this.scannedWifiInfo = scannedWifiInfo;
	}

}
