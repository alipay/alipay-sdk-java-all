package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.region.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 20:35:11
 */
public class AlipayOpenLotteryRegionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4294488119947193158L;

	/** 
	 * 商家入驻ID
	 */
	@ApiField("region_id")
	private String regionId;

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	public String getRegionId( ) {
		return this.regionId;
	}

}
