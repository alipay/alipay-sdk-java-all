package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建一个新的充电宝终端设备进件
 *
 * @author auto create
 * @since 1.0, 2021-08-20 13:06:23
 */
public class AlipayCommerceTerminalPowerbankCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3547777711921533727L;

	/**
	 * 地址位置纬度，使用国标GCJ-02坐标系，取值范围：纬度-90~90，中国地区经度范围：纬度3.86~53.55
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 地址位置经度，使用国标GCJ-02坐标系，取值范围：经度-180~180，中国地区经度范围：73.66~135.05
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 代理商在支付宝的pid
	 */
	@ApiField("proxy_id")
	private String proxyId;

	/**
	 * 终端设备的序列号
	 */
	@ApiField("sn")
	private String sn;

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

	public String getProxyId() {
		return this.proxyId;
	}
	public void setProxyId(String proxyId) {
		this.proxyId = proxyId;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
