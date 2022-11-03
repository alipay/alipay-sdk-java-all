package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 逆地理编码对外接口服务
 *
 * @author auto create
 * @since 1.0, 2019-09-06 17:56:24
 */
public class AlipayEcoMapGeocodingReverseModel extends AlipayObject {

	private static final long serialVersionUID = 1521156385495176564L;

	/**
	 * 渠道 0-高德地图 1-百度地图
	 */
	@ApiField("channel")
	private Long channel;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	public Long getChannel() {
		return this.channel;
	}
	public void setChannel(Long channel) {
		this.channel = channel;
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
