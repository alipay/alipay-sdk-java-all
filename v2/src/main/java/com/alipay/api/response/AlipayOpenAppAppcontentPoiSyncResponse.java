package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.poi.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:53
 */
public class AlipayOpenAppAppcontentPoiSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1887618916554988289L;

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
