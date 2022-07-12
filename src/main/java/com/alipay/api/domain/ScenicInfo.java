package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝区域的景区数据信息
 *
 * @author auto create
 * @since 1.0, 2021-06-10 15:24:41
 */
public class ScenicInfo extends AlipayObject {

	private static final long serialVersionUID = 2141268241982778363L;

	/**
	 * 支付宝景区详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 支付宝景区市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 支付宝景区纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 支付宝维护的景区等级
	 */
	@ApiField("level")
	private String level;

	/**
	 * 支付宝景区经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 支付宝景区省名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 支付宝景区ID
	 */
	@ApiField("scenic_id")
	private String scenicId;

	/**
	 * 支付宝景区名称
	 */
	@ApiField("scenic_name")
	private String scenicName;

	/**
	 * 支付宝维护的景区电话，可能有多个电话号，以英文逗号分隔
	 */
	@ApiField("telephone")
	private String telephone;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getScenicId() {
		return this.scenicId;
	}
	public void setScenicId(String scenicId) {
		this.scenicId = scenicId;
	}

	public String getScenicName() {
		return this.scenicName;
	}
	public void setScenicName(String scenicName) {
		this.scenicName = scenicName;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
