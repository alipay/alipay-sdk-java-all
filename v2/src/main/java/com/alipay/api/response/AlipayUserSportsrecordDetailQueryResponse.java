package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.sportsrecord.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-07 17:37:57
 */
public class AlipayUserSportsrecordDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8372571518721589333L;

	/** 
	 * 轨迹点信息（已经压缩编码，使用GooglePolyline工具解码）
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
