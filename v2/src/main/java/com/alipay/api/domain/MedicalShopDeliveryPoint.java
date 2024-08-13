package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗健康门店配送围栏点位
 *
 * @author auto create
 * @since 1.0, 2024-02-27 16:12:58
 */
public class MedicalShopDeliveryPoint extends AlipayObject {

	private static final long serialVersionUID = 6463727268556626697L;

	/**
	 * 1. 配送围栏点位维度，精确到小数点后6位；
2. 采用火星坐标系标准，其他坐标系需提前转换；
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 1. 配送围栏点位经度，精确到小数点后6位；
2. 采用火星坐标系标准，其他坐标系需提前转换；
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
