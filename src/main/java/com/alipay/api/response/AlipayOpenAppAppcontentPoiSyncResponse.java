package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.poi.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-23 16:26:04
 */
public class AlipayOpenAppAppcontentPoiSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2374948937916136869L;

	/** 
	 * 支付宝返回的唯一编码
	 */
	@ApiField("alipay_poi_id")
	private String alipayPoiId;

	public void setAlipayPoiId(String alipayPoiId) {
		this.alipayPoiId = alipayPoiId;
	}
	public String getAlipayPoiId( ) {
		return this.alipayPoiId;
	}

}
