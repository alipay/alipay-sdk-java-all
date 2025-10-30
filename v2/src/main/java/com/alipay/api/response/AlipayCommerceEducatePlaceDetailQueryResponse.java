package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EduPlaceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.place.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 17:37:29
 */
public class AlipayCommerceEducatePlaceDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1314853439364514977L;

	/** 
	 * 位置信息
	 */
	@ApiField("place_info")
	private EduPlaceInfo placeInfo;

	public void setPlaceInfo(EduPlaceInfo placeInfo) {
		this.placeInfo = placeInfo;
	}
	public EduPlaceInfo getPlaceInfo( ) {
		return this.placeInfo;
	}

}
