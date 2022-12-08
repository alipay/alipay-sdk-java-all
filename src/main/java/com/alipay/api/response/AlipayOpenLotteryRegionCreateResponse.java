package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.region.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 20:30:38
 */
public class AlipayOpenLotteryRegionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8372823277523567977L;

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
