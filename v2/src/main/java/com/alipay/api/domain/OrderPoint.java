package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单坐标
 *
 * @author auto create
 * @since 1.0, 2023-11-23 11:06:37
 */
public class OrderPoint extends AlipayObject {

	private static final long serialVersionUID = 7445373654435794545L;

	/**
	 * 经度值
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度值
	 */
	@ApiField("longitude")
	private String longitude;

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
