package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenMarketingRegionDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.market.region.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-13 15:27:41
 */
public class AlipayCommerceEcMarketRegionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4573558211871658739L;

	/** 
	 * 展区信息
	 */
	@ApiField("region_info")
	private OpenMarketingRegionDTO regionInfo;

	public void setRegionInfo(OpenMarketingRegionDTO regionInfo) {
		this.regionInfo = regionInfo;
	}
	public OpenMarketingRegionDTO getRegionInfo( ) {
		return this.regionInfo;
	}

}
