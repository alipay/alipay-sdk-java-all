package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 验收测试SPI接口
 *
 * @author auto create
 * @since 1.0, 2019-10-29 11:34:51
 */
public class AlipayOpenAppTestTestCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3811826281483258365L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private AccessParams latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public AccessParams getLatitude() {
		return this.latitude;
	}
	public void setLatitude(AccessParams latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
