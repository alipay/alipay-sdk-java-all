package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放平台to蚂蚁消息接口数据同步
 *
 * @author auto create
 * @since 1.0, 2018-03-07 13:36:53
 */
public class AlipayOpenAppDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2166599317341449165L;

	/**
	 * 杭州市西湖区
	 */
	@ApiField("address")
	private String address;

	/**
	 * 114.266418
	 */
	@ApiField("longitude")
	private String longitude;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
