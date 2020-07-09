package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务地址
 *
 * @author auto create
 * @since 1.0, 2019-12-04 19:59:24
 */
public class ServiceAddressSimpleVO extends AlipayObject {

	private static final long serialVersionUID = 8382465223526434341L;

	/**
	 * 维度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * poi详细地址
	 */
	@ApiField("poi_address")
	private String poiAddress;

	/**
	 * 高德的poi code
	 */
	@ApiField("poi_code")
	private String poiCode;

	/**
	 * poi的名称
	 */
	@ApiField("poi_name")
	private String poiName;

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

	public String getPoiAddress() {
		return this.poiAddress;
	}
	public void setPoiAddress(String poiAddress) {
		this.poiAddress = poiAddress;
	}

	public String getPoiCode() {
		return this.poiCode;
	}
	public void setPoiCode(String poiCode) {
		this.poiCode = poiCode;
	}

	public String getPoiName() {
		return this.poiName;
	}
	public void setPoiName(String poiName) {
		this.poiName = poiName;
	}

}
