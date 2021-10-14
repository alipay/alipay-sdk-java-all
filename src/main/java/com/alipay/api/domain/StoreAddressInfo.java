package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店地址信息
 *
 * @author auto create
 * @since 1.0, 2021-07-12 15:09:28
 */
public class StoreAddressInfo extends AlipayObject {

	private static final long serialVersionUID = 6797788185951528863L;

	/**
	 * 门店地址（格式：市/区/详细地址门牌号）
	 */
	@ApiField("address")
	private String address;

	/**
	 * 高德门店维度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 高德门店经度
	 */
	@ApiField("longitude")
	private String longitude;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
