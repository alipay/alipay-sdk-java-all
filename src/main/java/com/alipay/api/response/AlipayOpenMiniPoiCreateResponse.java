package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.poi.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenMiniPoiCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2766587776936821845L;

	/** 
	 * poi id，地理位置标记信息
	 */
	@ApiField("poi_id")
	private String poiId;

	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}
	public String getPoiId( ) {
		return this.poiId;
	}

}
