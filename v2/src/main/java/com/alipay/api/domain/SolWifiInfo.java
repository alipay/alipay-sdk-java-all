package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * WIFI信息
 *
 * @author auto create
 * @since 1.0, 2026-06-22 10:29:22
 */
public class SolWifiInfo extends AlipayObject {

	private static final long serialVersionUID = 2823272421398834723L;

	/**
	 * 1：WIFI类型是账密模式时，此值无效，可不传；
2：WIFI类型是Portal模式时，新增必传；
3：修改可不传，不传不改；
	 */
	@ApiField("cert_url")
	private String certUrl;

	/**
	 * 启用ENABLE、禁用DISABLE
	 */
	@ApiField("enable_flag")
	private String enableFlag;

	/**
	 * WIFI链接成功之后跳转的目标地址
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/**
	 * 点位ID(场所ID)值
	 */
	@ApiField("location_id")
	private String locationId;

	/**
	 * 场所名称；
1：新增必传；
2：修改可不传，不传不改；
	 */
	@ApiField("location_name")
	private String locationName;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 1：WIFI类型是账密模式时，此值无效，可不传；
2：WIFI类型是Portal模式时，新增必传；
3：修改可不传，不传不改；
	 */
	@ApiField("sms_cert_url")
	private String smsCertUrl;

	/**
	 * 1：WIFI类型是Portal模式时,新增必传；
2：WIFI类型是账密模式时，此值无效，可不传；
3：修改可不传，不传不改；
	 */
	@ApiField("spi_client_id")
	private String spiClientId;

	/**
	 * 1：WIFI类型是Portal模式时，新增必传；
2：账密模式，此值无效，可不传；
3：修改可不传，不传不改
	 */
	@ApiField("wifi_bssid")
	private String wifiBssid;

	/**
	 * 1：WIFI类型是账密模式时，新增必传；
2：WIFI类型是Portal模式时，此值无效，可不传；
3：修改可不传，不传不改；
	 */
	@ApiField("wifi_cipher")
	private String wifiCipher;

	/**
	 * 1：新增可不传；
2：修改必传；
	 */
	@ApiField("wifi_id")
	private String wifiId;

	/**
	 * 1：新增必传；
2：修改可不传，不传不修改
	 */
	@ApiField("wifi_name")
	private String wifiName;

	/**
	 * 1：新增必传；
2：修改可不传，不支持变更，比如：账密改Portal
	 */
	@ApiField("wifi_type")
	private String wifiType;

	public String getCertUrl() {
		return this.certUrl;
	}
	public void setCertUrl(String certUrl) {
		this.certUrl = certUrl;
	}

	public String getEnableFlag() {
		return this.enableFlag;
	}
	public void setEnableFlag(String enableFlag) {
		this.enableFlag = enableFlag;
	}

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public String getLocationId() {
		return this.locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return this.locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSmsCertUrl() {
		return this.smsCertUrl;
	}
	public void setSmsCertUrl(String smsCertUrl) {
		this.smsCertUrl = smsCertUrl;
	}

	public String getSpiClientId() {
		return this.spiClientId;
	}
	public void setSpiClientId(String spiClientId) {
		this.spiClientId = spiClientId;
	}

	public String getWifiBssid() {
		return this.wifiBssid;
	}
	public void setWifiBssid(String wifiBssid) {
		this.wifiBssid = wifiBssid;
	}

	public String getWifiCipher() {
		return this.wifiCipher;
	}
	public void setWifiCipher(String wifiCipher) {
		this.wifiCipher = wifiCipher;
	}

	public String getWifiId() {
		return this.wifiId;
	}
	public void setWifiId(String wifiId) {
		this.wifiId = wifiId;
	}

	public String getWifiName() {
		return this.wifiName;
	}
	public void setWifiName(String wifiName) {
		this.wifiName = wifiName;
	}

	public String getWifiType() {
		return this.wifiType;
	}
	public void setWifiType(String wifiType) {
		this.wifiType = wifiType;
	}

}
