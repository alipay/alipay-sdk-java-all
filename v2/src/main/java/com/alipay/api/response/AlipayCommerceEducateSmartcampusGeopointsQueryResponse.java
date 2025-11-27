package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.smartcampus.geopoints.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-04 11:42:28
 */
public class AlipayCommerceEducateSmartcampusGeopointsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8451788322422722222L;

	/** 
	 * 运动轨迹压缩信息
	 */
	@ApiField("geo_points")
	private String geoPoints;

	public void setGeoPoints(String geoPoints) {
		this.geoPoints = geoPoints;
	}
	public String getGeoPoints( ) {
		return this.geoPoints;
	}

}
