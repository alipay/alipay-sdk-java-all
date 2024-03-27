package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * get
 *
 * @author auto create
 * @since 1.0, 2023-01-09 21:06:30
 */
public class AlipayOpenAppTestGrayQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4133856554237479988L;

	/**
	 * 1
	 */
	@ApiField("buy_open_id")
	private String buyOpenId;

	/**
	 * 1
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 1
	 */
	@ApiField("uid")
	private String uid;

	public String getBuyOpenId() {
		return this.buyOpenId;
	}
	public void setBuyOpenId(String buyOpenId) {
		this.buyOpenId = buyOpenId;
	}

	public String getCityId() {
		return this.cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
