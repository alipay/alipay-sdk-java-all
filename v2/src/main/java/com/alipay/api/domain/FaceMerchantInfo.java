package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户信息
 *
 * @author auto create
 * @since 1.0, 2018-11-20 14:56:14
 */
public class FaceMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 8725451854454535683L;

	/**
	 * 区域编码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 品牌编码
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 机具Mac地址
	 */
	@ApiField("device_mac")
	private String deviceMac;

	/**
	 * 机具编码
	 */
	@ApiField("device_num")
	private String deviceNum;

	/**
	 * 经纬度
	 */
	@ApiField("geo")
	private String geo;

	/**
	 * 机具分组编码
	 */
	@ApiField("group")
	private String group;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * ISV ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 门店编码
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * WI-FI Mac地址
	 */
	@ApiField("wifimac")
	private String wifimac;

	/**
	 * WI-FI 名称
	 */
	@ApiField("wifiname")
	private String wifiname;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getBrandCode() {
		return this.brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getDeviceMac() {
		return this.deviceMac;
	}
	public void setDeviceMac(String deviceMac) {
		this.deviceMac = deviceMac;
	}

	public String getDeviceNum() {
		return this.deviceNum;
	}
	public void setDeviceNum(String deviceNum) {
		this.deviceNum = deviceNum;
	}

	public String getGeo() {
		return this.geo;
	}
	public void setGeo(String geo) {
		this.geo = geo;
	}

	public String getGroup() {
		return this.group;
	}
	public void setGroup(String group) {
		this.group = group;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getWifimac() {
		return this.wifimac;
	}
	public void setWifimac(String wifimac) {
		this.wifimac = wifimac;
	}

	public String getWifiname() {
		return this.wifiname;
	}
	public void setWifiname(String wifiname) {
		this.wifiname = wifiname;
	}

}
