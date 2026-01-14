package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BingLiInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.hdfaitransfer.bingli.identify response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-18 19:47:41
 */
public class AlipayCommerceHdfaitransferBingliIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1637212178512581869L;

	/** 
	 * 病历信息
	 */
	@ApiField("data")
	private BingLiInfo data;

	public void setData(BingLiInfo data) {
		this.data = data;
	}
	public BingLiInfo getData( ) {
		return this.data;
	}

}
